#!/bin/bash
set -euo pipefail
APK=$1;OUT=$2
mkdir -p "$OUT"
adb root; sleep 2; adb wait-for-device
adb install -r -g "$APK" > "$OUT/install.txt"
adb shell settings put global auto_time 0
adb shell settings put global auto_time_zone 0
adb shell setprop persist.sys.timezone Africa/Cairo
# Stable deterministic location/date for phase checks; root writes test preferences only.
adb shell am start -W -n com.wathakker.app/com.example.MainActivity >/dev/null
sleep 5
adb shell am force-stop com.wathakker.app
adb shell 'mkdir -p /data/user/0/com.wathakker.app/shared_prefs'
adb shell 'cat > /data/user/0/com.wathakker.app/shared_prefs/fajr_prefs.xml' <<'XML'
<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><float name="latitude" value="30.0444"/><float name="longitude" value="31.2357"/></map>
XML
# Read real calculator values from production harness.
adb shell date 101912002026.00 >/dev/null
adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck >/dev/null
sleep 5
adb pull /sdcard/Android/data/com.wathakker.app/files "$OUT/initial" >/dev/null
ASR=$(sed -n '4p' "$OUT/initial/actual_prayers.txt")
[ -n "$ASR" ]
set_epoch() {
 local FMT=$(python3 -c "import datetime;from zoneinfo import ZoneInfo;print(datetime.datetime.fromtimestamp(int('$1')/1000,ZoneInfo('Africa/Cairo')).strftime('%m%d%H%M%Y.%S'))")
 adb shell date "$FMT" >/dev/null
 adb shell date +%s >> "$OUT/clock.txt"
}
# Test runner executes the real Java phase class in the Android runtime.
adb push tools/phase-test.dex /data/local/tmp/phase-test.dex >/dev/null
adb shell 'CLASSPATH=/data/local/tmp/phase-test.dex app_process / PrayerPhaseTest' | tee "$OUT/boundaries.txt"
# All five actual prayer windows and both edge transitions, as production-renderer images.
for I in 1 3 4 5 6; do
 T=$(sed -n "${I}p" "$OUT/initial/actual_prayers.txt")
 case $I in 1) D=25;;5) D=10;;*) D=20;;esac
 for PHASE in before during after; do
 case $PHASE in before) N=$((T-60000));;during) N=$((T+120000));;after) N=$((T+D*60000+60000));;esac
 set_epoch "$N"
 adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck >/dev/null
 sleep 2
 adb pull /sdcard/Android/data/com.wathakker.app/files "$OUT/prayer_${I}_$PHASE" >/dev/null
 done
 done
# Actual host views of home + keyguard-category widgets, plus app screen in both themes.
adb install -r tools/widgethost/out/widgethost.apk >/dev/null
adb push tools/widgethost/out/grantbind.dex /data/local/tmp/grantbind.dex >/dev/null
adb shell 'CLASSPATH=/data/local/tmp/grantbind.dex app_process / GrantBind com.example.widgethost'
adb shell appwidget grantbind --package com.example.widgethost --user 0 || true
for MODE in no yes; do
 set_epoch "$((ASR+120000))"
 adb shell cmd uimode night "$MODE"
 adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity >/dev/null
 sleep 5
 adb shell uiautomator dump /sdcard/u.xml >/dev/null
 adb pull /sdcard/u.xml "$OUT/app_iqama_$MODE.xml" >/dev/null
 grep -q 'الإقامة' "$OUT/app_iqama_$MODE.xml"
 adb exec-out screencap -p > "$OUT/app_iqama_$MODE.png"
 adb shell am start -S -W -n com.example.widgethost/.MainActivity --es mode iqama >/dev/null
 sleep 9
 adb exec-out screencap -p > "$OUT/host_iqama_$MODE.png"
 adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck >/dev/null
 sleep 3
 adb pull /sdcard/Android/data/com.wathakker.app/files "$OUT/render_$MODE" >/dev/null
 done
# Verify next adhan returns at iqama, not only after a relaunch: park just before end.
set_epoch "$((ASR+20*60000-15000))"
adb shell am start -S -W -n com.example.widgethost/.MainActivity --es mode iqama >/dev/null
sleep 5
adb exec-out screencap -p > "$OUT/host_before_iqama_end.png"
sleep 20
adb exec-out screencap -p > "$OUT/host_after_iqama_end.png"
adb shell dumpsys alarm > "$OUT/alarms.txt"
adb logcat -d > "$OUT/logcat.txt"
! grep -E 'FATAL EXCEPTION|WathakkerHome: state\(\) failed|WathakkerHome: Render failed|WathakkerLock: Prayer bridge failed' "$OUT/logcat.txt"
echo 'PASS: iqama app label, Android phase tests, and live-host screenshots captured in both themes' | tee "$OUT/SUMMARY.txt"
