#!/bin/bash
# usage: emu_onb.sh <app.apk> <outdir>   (onboarding mockup screenshots, never publishes)
APK=$1; OUT=$2; P=com.wathakker.app
mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell input keyevent 82 || true
tap_text() { adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1
  python3 - "$1" <<'PY' | { read x y; [ -n "$x" ] && adb shell input tap $x $y && echo "tapped $1" || echo "NOT FOUND $1"; }
import sys,re,xml.etree.ElementTree as ET
t=sys.argv[1]
for n in ET.parse('/tmp/u.xml').iter('node'):
    if (n.get('text') or '').lower()==t.lower() or (n.get('content-desc') or '').lower()==t.lower():
        b=list(map(int,re.findall(r'\d+',n.get('bounds'))));print((b[0]+b[2])//2,(b[1]+b[3])//2);break
PY
}
shot() { adb exec-out screencap -p > "$OUT/$1.png"; }
adb shell cmd role add-role-holder android.app.role.HOME com.android.launcher3 >/dev/null 2>&1
adb shell settings put global window_animation_scale 0; adb shell settings put global transition_animation_scale 0
flow() { # $1 lang $2 night(yes/no) $3 next $4 back $5 gps $6 finish
  L=$1; N=$2; TAG=${L}_$N
  adb shell cmd uimode night $N
  adb shell pm clear $P >/dev/null; adb shell pm revoke $P android.permission.ACCESS_FINE_LOCATION 2>/dev/null; adb shell pm revoke $P android.permission.POST_NOTIFICATIONS 2>/dev/null
  adb shell "mkdir -p /data/data/$P/shared_prefs"
  UID_=$(adb shell stat -c %u /data/data/$P | tr -d '\r')
  adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">$L</string></map>\" > /data/data/$P/shared_prefs/app_prefs.xml; chown $UID_:$UID_ /data/data/$P/shared_prefs/app_prefs.xml; chmod 660 /data/data/$P/shared_prefs/app_prefs.xml; restorecon -R /data/data/$P/shared_prefs"
  adb emu geo fix 31.2001 29.9187 >/dev/null 2>&1
  adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 7
  shot onb0_lang_$TAG
  tap_text "$3"; sleep 1.5; shot onb1_method_$TAG
  tap_text "$5"; sleep 2; shot onb1b_permission_$TAG
  tap_text "While using the app" ; sleep 1.5; shot onb2_locating_$TAG
  sleep 16; shot onb3_calc_$TAG
  tap_text "$3"; sleep 1.5; shot onb4_confirm_$TAG
  tap_text "$3"; sleep 1.5; shot onb5_alerts_$TAG
  tap_text "$3"; sleep 1.5; shot onb6_reminder_$TAG
  tap_text "$6"; sleep 2.5; shot onb7_notifperm_$TAG
  tap_text "Allow"; sleep 2; shot onb8_after_$TAG
  adb shell cat /data/data/$P/shared_prefs/app_prefs.xml > "$OUT/prefs_after_$TAG.txt" 2>&1
  adb shell cat /data/data/$P/shared_prefs/prayer_alerts.xml > "$OUT/alerts_after_$TAG.txt" 2>&1
}
adb install -r "$APK" >"$OUT/install.txt" 2>&1
flow ar no "التالي" "رجوع" "تحديد الموقع (GPS)" "إنهاء"
flow en no "Next" "Back" "Use my location (GPS)" "Finish"
flow ar yes "التالي" "رجوع" "تحديد الموقع (GPS)" "إنهاء"
adb logcat -d -v threadtime | grep -E "FATAL EXCEPTION|AndroidRuntime" | head -20 > "$OUT/crashes.txt"
