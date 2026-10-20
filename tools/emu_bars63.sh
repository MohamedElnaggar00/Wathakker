#!/bin/bash
# usage: emu_bars63.sh <app.apk> <host.apk> <outdir>
# Every progress-bar widget (home + lock) in Arabic and English: fill must run left to right in both.
APK=$1; HOST=$2; OUT=$3
mkdir -p "$OUT"
adb wait-for-device
adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell input keyevent 82 || true
adb install -r "$HOST"; adb install -g -r "$APK"
adb push "$PWD/tools/widgethost/out/grantbind.dex" /data/local/tmp/grantbind.dex
adb shell 'CLASSPATH=/data/local/tmp/grantbind.dex app_process / GrantBind com.example.widgethost'
adb shell cmd role add-role-holder android.app.role.HOME com.example.widgethost
adb shell cmd package set-home-activity com.example.widgethost/.MainActivity
adb shell am start -n com.wathakker.app/com.example.MainActivity; sleep 8
adb shell am force-stop com.wathakker.app
adb shell cmd uimode night no
UID_=$(adb shell stat -c %u /data/data/com.wathakker.app | tr -d '\r')
for LANG in ar en; do
  adb shell "mkdir -p /data/data/com.wathakker.app/shared_prefs; printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">$LANG</string></map>\" > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; chown $UID_:$UID_ /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; chmod 660 /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; restorecon -R /data/data/com.wathakker.app/shared_prefs"
  adb shell cat /data/data/com.wathakker.app/shared_prefs/app_prefs.xml > "$OUT/prefs_$LANG.txt"
  for G in barsA barsB; do
    adb shell am force-stop com.wathakker.app
    adb shell am force-stop com.example.widgethost
    adb shell am start -W -n com.example.widgethost/.MainActivity --es mode $G
    sleep 14
    adb exec-out screencap -p > "$OUT/${LANG}_${G}.png"
  done
done
adb logcat -d -v threadtime | grep -E 'WidgetHost|WathakkerHome|WathakkerLock|AndroidRuntime|WidgetPix' | tail -80 > "$OUT/log_summary.txt"
# --- Android 15+ generated previews: read back what the system stored and render it
adb shell am force-stop com.wathakker.app
adb shell am start -n com.wathakker.app/com.example.MainActivity; sleep 25
adb logcat -d -v threadtime | grep -E 'WidgetPreviews' > "$OUT/previews_gen_log.txt"
adb shell am force-stop com.example.widgethost
adb shell am start -W -n com.example.widgethost/.MainActivity --es mode previews
sleep 8
adb exec-out screencap -p > "$OUT/live_previews.png"
adb logcat -d -v threadtime | grep -E 'WidgetHost' | grep -i preview > "$OUT/previews_host_log.txt"
# best effort: the real launcher widget picker
adb shell cmd role add-role-holder android.app.role.HOME com.android.launcher3 >/dev/null 2>&1
adb shell input keyevent KEYCODE_HOME; sleep 3
adb shell input swipe 540 1200 540 1200 1500; sleep 2
adb exec-out screencap -p > "$OUT/picker_0_longpress.png"
adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml "$OUT/picker_0.xml" >/dev/null 2>&1
# --- widget settings screen: select-only taps, Apply saves and closes
tap_text() { adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1
  python3 - "$1" <<'PY' | { read x y; [ -n "$x" ] && adb shell input tap $x $y && echo "tapped $1 at $x $y" || echo "NOT FOUND $1"; }
import sys,re,xml.etree.ElementTree as ET
t=sys.argv[1]
for n in ET.parse('/tmp/u.xml').iter('node'):
    if n.get('text')==t or n.get('content-desc')==t:
        b=list(map(int,re.findall(r'\d+',n.get('bounds'))));print((b[0]+b[2])//2,(b[1]+b[3])//2);break
PY
}
adb shell cmd role add-role-holder android.app.role.HOME com.example.widgethost >/dev/null 2>&1
for LANG in en ar; do
  adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">$LANG</string></map>\" > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; chown $UID_:$UID_ /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; restorecon -R /data/data/com.wathakker.app/shared_prefs"
  adb shell am force-stop com.wathakker.app
  adb shell am start -n com.wathakker.app/com.example.widget.WidgetConfigActivity --ei appWidgetId 0; sleep 4
  adb exec-out screencap -p > "$OUT/cfg_${LANG}_0_open.png"
  if [ $LANG = en ]; then B=Blue; BG=Black; AP=Apply; else B="أزرق"; BG="أسود"; AP="تطبيق"; fi
  tap_text "$B"; sleep 1; tap_text "$BG"; sleep 1
  adb exec-out screencap -p > "$OUT/cfg_${LANG}_1_selected.png"
  adb shell dumpsys activity activities | grep -c WidgetConfigActivity > "$OUT/cfg_${LANG}_still_open_after_select.txt"
  adb shell cat /data/data/com.wathakker.app/shared_prefs/fajr_prefs.xml | grep -E 'widget_(bar|bg)_color' > "$OUT/cfg_${LANG}_prefs_before_apply.txt"
  tap_text "$AP"; sleep 3
  adb shell dumpsys activity activities | grep -c "WidgetConfigActivity" > "$OUT/cfg_${LANG}_open_after_apply.txt"
  adb shell cat /data/data/com.wathakker.app/shared_prefs/fajr_prefs.xml | grep -E 'widget_(bar|bg)_color' > "$OUT/cfg_${LANG}_prefs_after_apply.txt"
  adb exec-out screencap -p > "$OUT/cfg_${LANG}_2_after_apply.png"
done
# dark and light screenshots of the settings screen (Apply pill)
for NIGHT in yes no; do
  adb shell cmd uimode night $NIGHT; sleep 2
  adb shell am force-stop com.wathakker.app
  adb shell am start -n com.wathakker.app/com.example.widget.WidgetConfigActivity --ei appWidgetId 0; sleep 4
  adb exec-out screencap -p > "$OUT/cfg_ar_night_${NIGHT}.png"
done
# Back behaviour: new widget id (no saved keys) -> RESULT_OK defaults; existing id -> discard
adb logcat -c
adb shell am start -n com.wathakker.app/com.example.widget.WidgetConfigActivity --ei appWidgetId 999; sleep 3
adb shell input keyevent KEYCODE_BACK; sleep 2
adb shell am start -n com.wathakker.app/com.example.widget.WidgetConfigActivity --ei appWidgetId 998; sleep 3
tap_text "تطبيق"; sleep 2
adb shell am start -n com.wathakker.app/com.example.widget.WidgetConfigActivity --ei appWidgetId 998; sleep 3
tap_text "أخضر"; sleep 1
adb shell input keyevent KEYCODE_BACK; sleep 2
adb shell cat /data/data/com.wathakker.app/shared_prefs/fajr_prefs.xml | grep -E '_99[89]' > "$OUT/back_prefs.txt"
adb logcat -d -v threadtime | grep -E 'WidgetConfig' > "$OUT/back_log.txt"
# background options over a colourful backdrop: auto / glass / wallblur, light and dark
adb shell cmd role add-role-holder android.app.role.HOME com.example.widgethost >/dev/null 2>&1
for NIGHT in no yes; do
  adb shell cmd uimode night $NIGHT; sleep 2
  for BG in auto glass wallblur; do
    adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"widget_bg_color\\\">$BG</string></map>\" > /data/data/com.wathakker.app/shared_prefs/fajr_prefs.xml; chown $UID_:$UID_ /data/data/com.wathakker.app/shared_prefs/fajr_prefs.xml; restorecon -R /data/data/com.wathakker.app/shared_prefs"
    adb shell am force-stop com.wathakker.app; adb shell am force-stop com.example.widgethost
    adb shell am start -W -n com.example.widgethost/.MainActivity --es mode frost; sleep 12
    adb exec-out screencap -p > "$OUT/frost_${NIGHT}_${BG}.png"
  done
done
# --- prayer notifications: early (native live countdown), adhan, iqama; icons
adb shell cmd uimode night yes
adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">ar</string></map>\" > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; chown $UID_:$UID_ /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; restorecon -R /data/data/com.wathakker.app/shared_prefs"
adb shell pm grant com.wathakker.app android.permission.POST_NOTIFICATIONS
adb shell am force-stop com.wathakker.app
adb shell input keyevent KEYCODE_HOME
adb shell cmd notification allow_listener x >/dev/null 2>&1
AT=$(( $(date +%s) * 1000 + 100000 ))
adb shell am broadcast -n com.wathakker.app/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 0 --ei alert_kind 3 --el prayer_at $AT > "$OUT/notif_early_broadcast.txt" 2>&1
sleep 4
adb exec-out screencap -p > "$OUT/notif_1_early_heads_up.png"
adb shell cmd statusbar expand-notifications; sleep 2
adb exec-out screencap -p > "$OUT/notif_2_early_shade_t4.png"
sleep 30
adb exec-out screencap -p > "$OUT/notif_3_early_shade_t36.png"
adb shell dumpsys notification --noredact | grep -E "pkg=com.wathakker.app|usesChronometer|chronometerCountdown|android.title|android.text|tickerText|when=|timeout" > "$OUT/notif_early_dump.txt"
sleep 75
adb shell dumpsys notification --noredact | grep -E "pkg=com.wathakker.app" > "$OUT/notif_after_deadline_dump.txt"
adb exec-out screencap -p > "$OUT/notif_4_after_deadline.png"
adb shell cmd statusbar collapse
adb shell am broadcast -n com.wathakker.app/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 0 --ei alert_kind 0 > "$OUT/notif_adhan_broadcast.txt" 2>&1
sleep 3
adb shell am broadcast -n com.wathakker.app/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 2 --ei alert_kind 1 > /dev/null 2>&1
sleep 2
adb shell cmd statusbar expand-notifications; sleep 2
adb exec-out screencap -p > "$OUT/notif_5_adhan_and_iqama.png"
adb shell dumpsys notification --noredact | grep -E "android.title|android.text|icon=" | head -20 > "$OUT/notif_adhan_dump.txt"
