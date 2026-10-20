#!/bin/bash
# usage: emu_eval.sh <new.apk> <old-3.2.3.apk> <outdir>   (evaluation only, never publishes)
NEW=$1; OLD=$2; OUT=$3; P=com.wathakker.app
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
crashes() { adb logcat -d -v threadtime | grep -E "FATAL EXCEPTION|ANR in" | grep -c . ; }
seed() { # $1 lang
  adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">$1</string><int name=\\\"perm_stage\\\" value=\\\"3\\\" /><boolean name=\\\"perm_flow_done\\\" value=\\\"true\\\" /></map>\" > /data/data/$P/shared_prefs/app_prefs.xml"; }
adb shell cmd role add-role-holder android.app.role.HOME com.android.launcher3 >/dev/null 2>&1
# 1) update over 3.2.3 keeps data and starts
adb install -g -r "$OLD" >"$OUT/install_old.txt" 2>&1
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 8
adb shell "run-as $P ls" >/dev/null 2>&1
seed ar; adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6; shot old_323_home
adb shell dumpsys package $P | grep -E "versionCode|versionName" > "$OUT/ver_old.txt"
adb install -r "$NEW" >"$OUT/install_update.txt" 2>&1
adb shell dumpsys package $P | grep -E "versionCode|versionName" > "$OUT/ver_new.txt"
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 8; shot update_over_323_home
adb shell cat /data/data/$P/shared_prefs/app_prefs.xml > "$OUT/prefs_after_update.txt" 2>&1
echo "crashes_after_update=$(crashes)" > "$OUT/summary.txt"
# 2) fresh install first launch: permission flow
adb uninstall $P >/dev/null 2>&1; adb install -r "$NEW" >/dev/null 2>&1
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 8; shot fresh_first_launch
adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml "$OUT/fresh_first_launch.xml" >/dev/null 2>&1
# 3) walk every screen, AR and EN, dark and light
seed ar; adb shell pm grant $P android.permission.ACCESS_FINE_LOCATION; adb shell pm grant $P android.permission.POST_NOTIFICATIONS
walk() { # $1 tag
  adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6; shot "$1_prayer"
  for item in "$@"; do :; done
  for lbl in "$2"; do :; done
}
screens_ar=("المفضلة" "التنبيهات" "الإحصائيات" "التصنيفات" "محول التاريخ" "القبلة" "السبحة" "منبه صلاة الفجر" "الإعدادات" "حول التطبيق")
screens_en=("Favorites" "Reminders" "Statistics" "Tags" "Hijri converter" "Qibla" "Tasbeeh" "Fajr alarm" "Settings" "About")
for MODE in no yes; do
  adb shell cmd uimode night $MODE; sleep 2
  for LANG in ar en; do
    seed $LANG
    if [ $LANG = ar ]; then arr=("${screens_ar[@]}"); menu="القائمة"; else arr=("${screens_en[@]}"); menu="Menu"; fi
    adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
    shot "n${MODE}_${LANG}_00_prayer"
    i=1
    for s in "${arr[@]}"; do
      tap_text "$menu" >/dev/null; sleep 1.5; tap_text "$s" >/dev/null; sleep 2.5
      shot "n${MODE}_${LANG}_$(printf %02d $i)_$i"
      adb shell input swipe 540 1700 540 600 300; sleep 1; shot "n${MODE}_${LANG}_$(printf %02d $i)_scroll"
      i=$((i+1))
    done
    for tab in "التقويم" "التذكيرات" "حصن المسلم" "الصلاة"; do tap_text "$tab" >/dev/null; sleep 2; shot "n${MODE}_${LANG}_tab_$tab"; done
  done
done
adb shell cmd uimode night no
echo "crashes_after_walk=$(crashes)" >> "$OUT/summary.txt"
# 4) rotation + big system font
seed ar; adb shell settings put system accelerometer_rotation 0
adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
adb shell settings put system user_rotation 1; sleep 3; shot rot_landscape_prayer
tap_text "القائمة" >/dev/null; sleep 2; tap_text "الإعدادات" >/dev/null; sleep 2; shot rot_landscape_settings
adb shell settings put system user_rotation 0; sleep 3; shot rot_back_portrait_settings
adb shell settings put system font_scale 1.3; sleep 2
adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6; shot sysfont130_prayer
tap_text "القائمة" >/dev/null; sleep 2; shot sysfont130_drawer
adb shell settings put system font_scale 1.0
echo "crashes_after_rotation_font=$(crashes)" >> "$OUT/summary.txt"
# 5) no network, no location, timezone and date change
adb shell svc wifi disable; adb shell svc data disable; adb shell cmd connectivity airplane-mode enable 2>/dev/null
adb shell pm revoke $P android.permission.ACCESS_FINE_LOCATION; adb shell pm revoke $P android.permission.ACCESS_COARSE_LOCATION 2>/dev/null
adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 7; shot offline_nolocation_prayer
adb shell settings put global time_zone Asia/Tokyo; adb shell setprop persist.sys.timezone Asia/Tokyo; adb shell am broadcast -a android.intent.action.TIMEZONE_CHANGED >/dev/null; sleep 5; shot tz_tokyo_prayer
adb shell settings put global time_zone Africa/Cairo; adb shell setprop persist.sys.timezone Africa/Cairo; adb shell am broadcast -a android.intent.action.TIMEZONE_CHANGED >/dev/null; sleep 3
adb shell settings put global auto_time 0; adb shell "date $(date -u -d '+1 day' +%m%d%H%M%Y).00" >/dev/null; adb shell am broadcast -a android.intent.action.DATE_CHANGED >/dev/null; sleep 5; shot datechange_prayer
adb shell cmd connectivity airplane-mode disable 2>/dev/null; adb shell svc wifi enable
adb shell pm grant $P android.permission.ACCESS_FINE_LOCATION
echo "crashes_after_offline_tz_date=$(crashes)" >> "$OUT/summary.txt"
# 6) leak / cpu / battery / jank: repeated navigation then meminfo
adb shell dumpsys batterystats --reset >/dev/null 2>&1
adb shell dumpsys gfxinfo $P reset >/dev/null 2>&1
seed ar; adb shell am force-stop $P; adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
adb shell dumpsys meminfo $P > "$OUT/meminfo_start.txt"
for r in $(seq 1 12); do
  for s in "الإعدادات" "السبحة" "القبلة" "الإحصائيات" "حول التطبيق"; do tap_text "القائمة" >/dev/null; sleep 1; tap_text "$s" >/dev/null; sleep 1.2; adb shell input keyevent KEYCODE_BACK; sleep 0.6; done
  [ $r = 6 ] && adb shell dumpsys meminfo $P > "$OUT/meminfo_mid.txt"
done
adb shell input keyevent KEYCODE_BACK; sleep 2
adb shell am send-trim-memory $P RUNNING_CRITICAL >/dev/null 2>&1; sleep 2
adb shell dumpsys meminfo $P > "$OUT/meminfo_end.txt"
adb shell dumpsys gfxinfo $P > "$OUT/gfxinfo.txt"
adb shell top -b -n 1 -m 12 > "$OUT/top.txt" 2>&1
adb shell dumpsys batterystats $P > "$OUT/batterystats_app.txt" 2>&1
adb shell dumpsys alarm | grep -A3 "$P" | head -80 > "$OUT/alarms_after_flows.txt"
adb shell dumpsys activity services $P > "$OUT/services.txt" 2>&1
# 7) monkey stress
adb logcat -c
adb shell monkey -p $P --throttle 120 --pct-syskeys 0 --pct-nav 0 -s 4242 3000 > "$OUT/monkey.txt" 2>&1
echo "crashes_after_monkey=$(crashes)" >> "$OUT/summary.txt"
adb logcat -d -v threadtime | grep -E "FATAL EXCEPTION|ANR in|AndroidRuntime" | head -60 > "$OUT/crash_log.txt"
adb shell dumpsys meminfo $P > "$OUT/meminfo_after_monkey.txt"
shot after_monkey
# 8) kill and reboot survival of alarms and widgets
adb shell am force-stop $P; sleep 2; adb shell dumpsys alarm | grep -c "$P" > "$OUT/alarm_count_after_forcestop.txt"
adb reboot; adb wait-for-device; for i in $(seq 1 60); do [ "$(adb shell getprop sys.boot_completed | tr -d '\r')" = 1 ] && break; sleep 3; done; sleep 20
adb root >/dev/null 2>&1; sleep 3; adb wait-for-device
adb shell dumpsys alarm | grep -B1 -A3 "$P" | head -60 > "$OUT/alarms_after_reboot.txt"
adb shell dumpsys alarm | grep -c "$P" > "$OUT/alarm_count_after_reboot.txt"
adb shell dumpsys appwidget | grep -A2 "$P" | head -30 > "$OUT/widgets_after_reboot.txt"
shot after_reboot
# 9) adhan/iqama notification auto-dismiss after 5 minutes (system timeout, survives app kill)
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
adb shell pm grant $P android.permission.POST_NOTIFICATIONS 2>/dev/null
adb shell am force-stop $P
UIDN=$(adb shell stat -c %u /data/data/$P | tr -d '\r')
adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><boolean name=\\\"enabled_3\\\" value=\\\"true\\\" /><boolean name=\\\"migrated_v1\\\" value=\\\"true\\\" /></map>\" > /data/data/$P/shared_prefs/prayer_alerts.xml; chown $UIDN:$UIDN /data/data/$P/shared_prefs/prayer_alerts.xml; chmod 660 /data/data/$P/shared_prefs/prayer_alerts.xml; restorecon /data/data/$P/shared_prefs/prayer_alerts.xml"
NOWMS=$(( $(adb shell date +%s | tr -d '\r') * 1000 + 40000 ))
adb shell am broadcast -n $P/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 3 --ei alert_kind 3 --el prayer_at $NOWMS >/dev/null 2>&1
sleep 3
adb shell dumpsys notification --noredact | grep -E "id=433|timeout" | head > "$OUT/notif_early_present.txt"
adb shell cmd statusbar expand-notifications; sleep 2; shot notif_early_countdown
adb shell cmd statusbar collapse
sleep 40
adb shell dumpsys notification --noredact | grep -E "id=433" | head > "$OUT/notif_early_after_adhan_time.txt"
adb shell am broadcast -n $P/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 3 --ei alert_kind 0 > "$OUT/bcast_adhan.txt" 2>&1
adb shell am broadcast -n $P/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 3 --ei alert_kind 1 > "$OUT/bcast_iqama.txt" 2>&1
sleep 5
adb shell dumpsys notification --noredact | grep -E "pkg=$P|NotificationRecord|id=40|timeout" | head -30 > "$OUT/notif_t0.txt"
adb shell cmd statusbar expand-notifications; sleep 2; shot notif_shade_t0
adb shell cmd statusbar collapse
adb shell am force-stop $P
sleep 270
adb shell dumpsys notification --noredact | grep -E "pkg=$P|id=40" | head -30 > "$OUT/notif_t4_5.txt"
sleep 60
adb shell dumpsys notification --noredact | grep -E "pkg=$P|id=40" | head -30 > "$OUT/notif_t5_6.txt"
adb shell cmd statusbar expand-notifications; sleep 2; shot notif_shade_t5_6
echo done >> "$OUT/summary.txt"
