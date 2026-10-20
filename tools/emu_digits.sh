#!/bin/bash
# usage: emu_digits.sh <apk> <outdir>  (numbers setting evidence, never publishes)
APK=$1; OUT=$2; P=com.wathakker.app
mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell input keyevent 82
adb shell settings put global hide_error_dialogs 1
adb shell settings put global window_animation_scale 0; adb shell settings put global transition_animation_scale 0
adb shell wm size > "$OUT/wm.txt"; adb shell wm density >> "$OUT/wm.txt"
shot(){ timeout 30 adb exec-out screencap -p > "$OUT/${1}_$DIG.png"; }
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
for DIG in hindi latin; do for N in yes no; do
adb shell cmd uimode night $N
adb shell am force-stop $P
adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">ar</string><string name=\\\"digits_style\\\">$DIG</string><int name=\\\"perm_stage\\\" value=\\\"3\\\" /><boolean name=\\\"perm_flow_done\\\" value=\\\"true\\\" /></map>\" > /data/data/$P/shared_prefs/app_prefs.xml; chown $UIDN:$UIDN /data/data/$P/shared_prefs/app_prefs.xml; chmod 660 /data/data/$P/shared_prefs/app_prefs.xml; restorecon /data/data/$P/shared_prefs/app_prefs.xml"
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 8
shot prayer_$N
tap_text "التذكيرات"; sleep 3; shot reminders_$N
tap_text "حصن المسلم"; sleep 3; shot hisn_$N
adb shell input tap 540 885; sleep 3; shot hisn_chapter_$N
adb shell input keyevent 4; sleep 1
tap_text "التقويم"; sleep 3; shot calendar_$N
tap_text "الإعدادات"; sleep 3; shot settings_$N
for G in qibla fajr_alarm hijri_converter; do
  adb shell am force-stop $P
  adb shell am start -W -a android.intent.action.VIEW -d "wathakker://open?go=$G" -n $P/com.example.MainActivity >/dev/null; sleep 6
  shot ${G}_$N
done
adb shell uiautomator dump /sdcard/u4.xml >/dev/null 2>&1; adb pull /sdcard/u4.xml "$OUT/conv_$N.xml" >/dev/null 2>&1
python3 - "$OUT/conv_$N.xml" <<'PY' | { read x y; [ -n "$x" ] && adb shell input tap $x $y; }
import sys,re,xml.etree.ElementTree as ET
best=None
for n in ET.parse(sys.argv[1]).iter('node'):
    if (n.get('text') or '')=='اليوم':
        b=list(map(int,re.findall(r'\d+',n.get('bounds'))));best=((b[0]+b[2])//2,(b[1]+b[3])//2)
if best: print(*best)
PY
sleep 2; shot hijri_converter_today_$N
adb shell input tap 700 1030; sleep 2; shot hijri_converter_month_g_$N
adb shell input keyevent 4; sleep 1
tap_text "من هجري إلى ميلادي"; sleep 2; shot hijri_converter_h2g_$N
tap_text "من ميلادي إلى هجري"; sleep 2; shot hijri_converter_g2h_$N

# time picker dialog (Reminders > card menu > alert times > a time row)
adb shell am force-stop $P
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
tap_text "التذكيرات"; sleep 3
tap_text "خيارات"; sleep 2; shot picker_step1_$N
tap_text "أوقات التنبيه"; sleep 2; shot picker_step2_$N
adb shell uiautomator dump /sdcard/u2.xml >/dev/null 2>&1; adb pull /sdcard/u2.xml "$OUT/step2.xml" >/dev/null 2>&1
python3 - "$OUT/step2.xml" <<'PY' | { read x y; [ -n "$x" ] && adb shell input tap $x $y; }
import sys,re,xml.etree.ElementTree as ET
for n in ET.parse(sys.argv[1]).iter('node'):
    t=n.get('text') or ''
    if re.match(r'^\d\d:\d\d [صم]$',t):
        b=list(map(int,re.findall(r'\d+',n.get('bounds'))));print((b[0]+b[2])//2,(b[1]+b[3])//2);break
PY
sleep 2; shot picker_step3_$N
done
done
# real widget renders with each setting
for DIG in hindi latin; do
adb shell am force-stop $P
adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">ar</string><string name=\\\"digits_style\\\">$DIG</string><boolean name=\\\"perm_flow_done\\\" value=\\\"true\\\" /></map>\" > /data/data/$P/shared_prefs/app_prefs.xml; chown $UIDN:$UIDN /data/data/$P/shared_prefs/app_prefs.xml; chmod 660 /data/data/$P/shared_prefs/app_prefs.xml; restorecon /data/data/$P/shared_prefs/app_prefs.xml"
adb shell rm -rf /sdcard/Android/data/$P/files /data/data/$P/files/rendercheck
adb shell am start -W -n $P/com.example.WidgetRenderCheck >/dev/null; sleep 15
mkdir -p "$OUT/widgets_$DIG"
adb pull /sdcard/Android/data/$P/files/. "$OUT/widgets_$DIG/" >/dev/null 2>&1 || adb pull /data/data/$P/files/rendercheck/. "$OUT/widgets_$DIG/" >/dev/null 2>&1
done
echo done > "$OUT/done.txt"
