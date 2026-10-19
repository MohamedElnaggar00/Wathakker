#!/bin/bash
APK=$1;OUT=$2;OLD=$3;PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null; sleep 2
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
snap(){ for MODE in no yes; do adb shell cmd uimode night $MODE; adb shell am force-stop $PKG
 adb shell date 101914002026.00 >/dev/null
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 for i in 1 2 3 4; do
  adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u56.xml >/dev/null 2>&1
  Y=$(python3 - <<'PY'
import re
x=open('/tmp/u56.xml',encoding='utf-8').read()
ys=[(int(m.group(2))+int(m.group(4)))//2 for m in re.finditer(r'text="المغرب"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x)]
print(max(ys) if ys else 9999)
PY
)
  [ "$Y" -lt 1250 ] && break
  adb shell input swipe 360 1150 360 450 700; sleep 2
 done
 adb exec-out screencap -p > "$OUT/$1_$MODE.png"; done; }
adb install -r -g "$OLD" >/dev/null; adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 5; adb shell am force-stop $PKG
snap before
adb install -r -g "$APK" >/dev/null; snap after
# ---- Live iqama countdown: OLD (b56 bitmap) vs NEW (Chronometer) on a real AppWidgetHost, plus ticking check ----
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 4; adb shell am force-stop $PKG
adb shell 'mkdir -p /data/user/0/com.wathakker.app/shared_prefs'
adb shell 'cat > /data/user/0/com.wathakker.app/shared_prefs/fajr_prefs.xml' <<'XML'
<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><float name="latitude" value="30.0444"/><float name="longitude" value="31.2357"/></map>
XML
adb shell date 101912002026.00 >/dev/null
adb shell am start -S -W -n $PKG/com.example.WidgetRenderCheck >/dev/null; sleep 5
mkdir -p "$OUT/tick"; adb pull /sdcard/Android/data/$PKG/files "$OUT/tick/initial" >/dev/null
ASR=$(sed -n '4p' "$OUT/tick/initial/actual_prayers.txt")
FMT=$(python3 -c "import datetime;from zoneinfo import ZoneInfo;print(datetime.datetime.fromtimestamp(($ASR+120000)/1000,ZoneInfo('Africa/Cairo')).strftime('%m%d%H%M%Y.%S'))")
adb install -r tools/widgethost/out/widgethost.apk >/dev/null
adb push tools/widgethost/out/grantbind.dex /data/local/tmp/grantbind.dex >/dev/null
adb shell 'CLASSPATH=/data/local/tmp/grantbind.dex app_process / GrantBind com.example.widgethost' || true
adb shell appwidget grantbind --package com.example.widgethost --user 0 || true
adb install -r -g "$OLD" >/dev/null
adb shell date "$FMT" >/dev/null
adb shell am start -S -W -n com.example.widgethost/.MainActivity --es mode iqama >/dev/null
sleep 9
adb exec-out screencap -p > "$OUT/tick/host_iqama_OLD.png"
adb install -r -g "$APK" >/dev/null
adb shell date "$FMT" >/dev/null
adb shell am start -S -W -n com.example.widgethost/.MainActivity --es mode iqama >/dev/null
sleep 9
for k in 1 2 3; do adb exec-out screencap -p > "$OUT/tick/host_iqama_t$k.png"; adb shell date +%s >> "$OUT/tick/times.txt"; sleep 4; done
adb logcat -d > "$OUT/tick/logcat.txt"
echo done57 | tee "$OUT/SUMMARY.txt"
