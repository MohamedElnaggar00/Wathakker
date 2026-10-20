#!/bin/bash
# usage: emu_tabs.sh <apk> <outdir>  (README screenshots of the main tabs, dark and light; never publishes)
APK=$1; OUT=$2; P=com.wathakker.app
mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell input keyevent 82
adb shell settings put global hide_error_dialogs 1
adb shell settings put global window_animation_scale 0; adb shell settings put global transition_animation_scale 0
shot(){ timeout 30 adb exec-out screencap -p > "$OUT/$1.png"; }
tap_text() { adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1
  python3 - "$1" <<'PY' | { read x y; [ -n "$x" ] && adb shell input tap $x $y && echo "tapped $1" || echo "NOT FOUND $1"; }
import sys,re,xml.etree.ElementTree as ET
t=sys.argv[1]
for n in ET.parse('/tmp/u.xml').iter('node'):
    if (n.get('text') or '').lower()==t.lower() or (n.get('content-desc') or '').lower()==t.lower():
        b=list(map(int,re.findall(r'\d+',n.get('bounds'))));print((b[0]+b[2])//2,(b[1]+b[3])//2);break
PY
}
adb shell cmd role add-role-holder android.app.role.HOME com.android.launcher3 >/dev/null 2>&1
adb install -g -r "$APK" >/dev/null 2>&1
adb shell pm grant $P android.permission.POST_NOTIFICATIONS
adb shell pm grant $P android.permission.ACCESS_FINE_LOCATION
adb emu geo fix 31.2001 29.9187 >/dev/null 2>&1
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6; adb shell am force-stop $P
UIDN=$(adb shell stat -c %u /data/data/$P | tr -d '\r')
for N in yes no; do
  adb shell cmd uimode night $N
  adb shell am force-stop $P
  adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">ar</string><int name=\\\"perm_stage\\\" value=\\\"3\\\" /><boolean name=\\\"perm_flow_done\\\" value=\\\"true\\\" /></map>\" > /data/data/$P/shared_prefs/app_prefs.xml; chown $UIDN:$UIDN /data/data/$P/shared_prefs/app_prefs.xml; chmod 660 /data/data/$P/shared_prefs/app_prefs.xml; restorecon /data/data/$P/shared_prefs/app_prefs.xml"
  adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 8
  shot prayer_$N
  tap_text "التذكيرات"; sleep 3; shot reminders_$N
  tap_text "حصن المسلم"; sleep 3; shot hisn_$N
  adb shell input tap 540 885; sleep 3; shot hisn_chapter_$N
  adb shell input keyevent 4; sleep 1
  tap_text "التقويم"; sleep 3; shot calendar_$N
  for G in qibla fajr_alarm hijri_converter; do
    adb shell am force-stop $P
    adb shell am start -W -a android.intent.action.VIEW -d "wathakker://open?go=$G" -n $P/com.example.MainActivity >/dev/null; sleep 6
    shot ${G}_$N
  done
done
echo done > "$OUT/done.txt"
