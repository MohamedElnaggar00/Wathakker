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
# ---- launcher long-press shortcuts
adb shell pm clear $P >/dev/null
adb shell pm grant $P android.permission.POST_NOTIFICATIONS
adb shell pm grant $P android.permission.ACCESS_FINE_LOCATION
adb shell "mkdir -p /data/data/$P/shared_prefs"
UID_=$(adb shell stat -c %u /data/data/$P | tr -d '\r')
adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">ar</string><int name=\\\"perm_stage\\\" value=\\\"3\\\" /><boolean name=\\\"perm_flow_done\\\" value=\\\"true\\\" /></map>\" > /data/data/$P/shared_prefs/app_prefs.xml; chown $UID_:$UID_ /data/data/$P/shared_prefs/app_prefs.xml; chmod 660 /data/data/$P/shared_prefs/app_prefs.xml; restorecon -R /data/data/$P/shared_prefs"
adb shell cmd uimode night yes
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 8
adb shell dumpsys shortcut | grep -A6 "$P" | head -60 > "$OUT/shortcuts_dump.txt"
adb shell pm grant $P android.permission.ACCESS_FINE_LOCATION
adb shell input keyevent 3; sleep 2
adb shell uiautomator dump /sdcard/h.xml >/dev/null; adb pull /sdcard/h.xml /tmp/h.xml >/dev/null
read X Y <<<"$(python3 - <<'PY'
import re,xml.etree.ElementTree as ET
for n in ET.parse('/tmp/h.xml').iter('node'):
    if 'Wathakker' in (n.get('text') or '') or 'وذكر' in (n.get('text') or '') or 'Prayer' in (n.get('text') or '') or 'Wathakker' in (n.get('content-desc') or ''):
        b=list(map(int,re.findall(r'\d+',n.get('bounds'))));print((b[0]+b[2])//2,(b[1]+b[3])//2);break
PY
)"
echo "icon at $X $Y" > "$OUT/icon_pos.txt"
shot home_before_longpress
adb shell input swipe ${X:-200} ${Y:-1000} ${X:-200} ${Y:-1000} 1200; sleep 2
shot longpress_menu
for G in qibla fajr_alarm hijri_converter; do
  adb shell am force-stop $P
  adb shell am start -W -a android.intent.action.VIEW -d "wathakker://open?go=$G" -n $P/com.example.MainActivity >/dev/null; sleep 6
  shot shortcut_target_$G
done
adb logcat -d -v threadtime | grep -E "FATAL EXCEPTION|AndroidRuntime" | head -20 >> "$OUT/crashes.txt"
# ---- floating menu check (One UI popup)
for N in yes no; do
  adb shell cmd uimode night $N
  adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
  tap_text "التذكيرات"; sleep 3
  tap_text "خيارات"; sleep 2
  shot menu_popup_$N
  adb shell input keyevent 4; sleep 1
done
# ---- add-to-my-azkar button before/after tap
adb shell cmd uimode night yes
adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
tap_text "حصن المسلم"; sleep 3
adb shell input tap 540 885; sleep 3
for i in 1 2 3 4 5 6 7 8; do adb shell input swipe 540 1900 540 400 150; done; sleep 1
shot addbtn_before
tap_text "أضف إلى أذكاري"; sleep 1
shot addbtn_after
tap_text "تمت الإضافة"; sleep 1
shot addbtn_after_second_tap
# leave and return
adb shell input keyevent 4; sleep 2
adb shell input tap 540 885; sleep 3
for i in 1 2 3 4 5 6 7 8; do adb shell input swipe 540 1900 540 400 150; done; sleep 1
shot addbtn_after_return
# dialogs (language picker via settings is hard blind; edit dialog via popup menu)
for N in yes no; do
  adb shell cmd uimode night $N
  adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
  tap_text "التذكيرات"; sleep 3
  tap_text "خيارات"; sleep 2
  tap_text "تعديل الذكر والتصنيفات"; sleep 2
  shot dialog_edit_$N
  adb shell input keyevent 4; sleep 1
done
# prayer alert dialog (bell on prayer screen) 
adb shell cmd uimode night yes
adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
adb shell uiautomator dump /sdcard/b.xml >/dev/null; adb pull /sdcard/b.xml /tmp/b.xml >/dev/null
read BX BY <<<"$(python3 - <<'PY'
import re,xml.etree.ElementTree as ET
for n in ET.parse('/tmp/b.xml').iter('node'):
    if (n.get('content-desc') or '').startswith('bell_'):
        b=list(map(int,re.findall(r'\d+',n.get('bounds'))));print((b[0]+b[2])//2,(b[1]+b[3])//2);break
PY
)"
adb shell input swipe ${BX:-100} ${BY:-800} ${BX:-100} ${BY:-800} 1200; sleep 2
shot prayer_alert_dialog
adb shell input tap 172 1957; sleep 1.5
shot prayer_alert_dialog_on
# alert dialog cancel path: toggle first switch, cancel, reopen and compare
adb shell uiautomator dump /sdcard/c.xml >/dev/null; adb pull /sdcard/c.xml /tmp/c.xml >/dev/null; cp /tmp/c.xml "$OUT/alert_before_toggle.xml"
tap_text "إلغاء"; sleep 1
shot after_cancel_prayer_screen
adb shell cat /data/data/$P/shared_prefs/prayer_alerts.xml > "$OUT/prayer_alerts_after_cancel.xml" 2>&1
# settings screen spacing
for N in yes no; do
  adb shell cmd uimode night $N
  adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
  tap_text "الإعدادات"; sleep 3
  shot settings_spacing_$N
  adb shell input swipe 540 1700 540 600 300; sleep 1
  shot settings_spacing_scrolled_$N
done
