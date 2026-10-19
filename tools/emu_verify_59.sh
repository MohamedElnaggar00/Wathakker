#!/bin/bash
# 3.2.2: One UI widget on a real AppWidgetHost, both themes, 4x1 and 4x2, plus the iqama window.
APK=$1;OUT=$2;PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null; sleep 2
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
adb install -r -g "$APK" >/dev/null
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 4; adb shell am force-stop $PKG
adb shell 'mkdir -p /data/user/0/com.wathakker.app/shared_prefs'
adb shell 'cat > /data/user/0/com.wathakker.app/shared_prefs/fajr_prefs.xml' <<'XML'
<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><float name="latitude" value="30.0444"/><float name="longitude" value="31.2357"/></map>
XML
adb shell date 101912002026.00 >/dev/null
adb shell am start -S -W -n $PKG/com.example.WidgetRenderCheck >/dev/null; sleep 5
adb pull /sdcard/Android/data/$PKG/files "$OUT/initial" >/dev/null
ASR=$(sed -n '4p' "$OUT/initial/actual_prayers.txt")
fmt(){ python3 -c "import datetime;from zoneinfo import ZoneInfo;print(datetime.datetime.fromtimestamp(($1)/1000,ZoneInfo('Africa/Cairo')).strftime('%m%d%H%M%Y.%S'))"; }
adb install -r tools/widgethost/out/widgethost.apk >/dev/null
adb push tools/widgethost/out/grantbind.dex /data/local/tmp/grantbind.dex >/dev/null
adb shell 'CLASSPATH=/data/local/tmp/grantbind.dex app_process / GrantBind com.example.widgethost' || true
adb shell appwidget grantbind --package com.example.widgethost --user 0 || true
shot(){ NAME=$1; MODE=$2; adb shell cmd uimode night $MODE; sleep 1
 adb shell am start -S -W -n com.example.widgethost/.MainActivity --es mode oneui >/dev/null; sleep 10
 adb exec-out screencap -p > "$OUT/oneui_${NAME}_$MODE.png"; }
adb shell date "$(fmt $((ASR-150*60000)))" >/dev/null
for M in no yes; do shot day $M; done
adb shell date "$(fmt $((ASR+120000)))" >/dev/null
for M in no yes; do shot iqama $M; done
# ---- App pages at rest and scrolled mid-way (edge fade, large titles), light and dark ----
tap_text(){ adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u59.xml >/dev/null 2>&1
 XY=$(python3 - "$1" <<'PY'
import re,sys
x=open('/tmp/u59.xml',encoding='utf-8').read()
best=None
for m in re.finditer(r'text="'+re.escape(sys.argv[1])+r'"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    cx=(int(m.group(1))+int(m.group(3)))//2; cy=(int(m.group(2))+int(m.group(4)))//2
    if best is None or cy>best[1]: best=(cx,cy)
print(f"{best[0]} {best[1]}" if best else "")
PY
)
 [ -n "$XY" ] && adb shell input tap $XY; }
adb shell date 101914002026.00 >/dev/null
for M in no yes; do
 adb shell cmd uimode night $M; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 for PAGE in prayer reminders hisn calendar settings; do
  case $PAGE in prayer) T="الصلاة";; reminders) T="التذكيرات";; hisn) T="حصن المسلم";; calendar) T="التقويم";; settings) T="الإعدادات";; esac
  tap_text "$T"; sleep 3
  adb exec-out screencap -p > "$OUT/page_${PAGE}_rest_$M.png"
  adb shell input swipe 540 1700 540 1100 500; sleep 1
  adb shell input swipe 540 1700 540 1250 500; sleep 2
  adb exec-out screencap -p > "$OUT/page_${PAGE}_scrolled_$M.png"
 done
done
adb shell cmd uimode night no
adb logcat -d > "$OUT/logcat.txt"
! grep -E 'OneUI render failed|FATAL EXCEPTION' "$OUT/logcat.txt"
echo done59 | tee "$OUT/SUMMARY.txt"
