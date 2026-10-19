#!/bin/bash
APK=$1;OUT=$2;OLD=$3;PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null; sleep 2
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
snap(){ for MODE in no yes; do adb shell cmd uimode night $MODE; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 adb shell input swipe 360 1250 360 650 300; sleep 2
 adb exec-out screencap -p > "$OUT/$1_$MODE.png"; done; }
adb install -r -g "$OLD" >/dev/null; adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 5; adb shell am force-stop $PKG
snap before
adb install -r -g "$APK" >/dev/null; snap after
echo done56 | tee "$OUT/SUMMARY.txt"
