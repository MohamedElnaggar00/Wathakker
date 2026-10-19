#!/bin/bash
APK=$1;OUT=$2;OLD=$3;PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null; sleep 2
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
snap(){ for MODE in no yes; do adb shell cmd uimode night $MODE; adb shell am force-stop $PKG
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
echo done56 | tee "$OUT/SUMMARY.txt"
