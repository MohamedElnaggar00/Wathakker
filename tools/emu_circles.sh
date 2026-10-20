#!/bin/bash
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb shell wm size > "$OUT/wm.txt" 2>&1
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
adb shell date 102101502026.00 >/dev/null 2>&1
adb shell svc power stayon true; adb shell settings put system screen_off_timeout 1800000
adb shell am start -W -n $PKG/com.wathakker.wear.MainActivity >/dev/null 2>&1; sleep 12
adb shell am start -S -W -n $PKG/com.wathakker.wear.RenderActivity --ez circles false >/dev/null 2>&1; sleep 6; adb exec-out screencap -p > "$OUT/face_only.png"
for A in 80; do
  adb shell am start -S -W -n $PKG/com.wathakker.wear.RenderActivity --ei scrim $A >/dev/null 2>&1; sleep 7
  adb exec-out screencap -p > "$OUT/circles_scrim_$A.png"
done
adb logcat -d | grep -i "AndroidRuntime\|FATAL" -A6 | head -40 > "$OUT/logcat.txt" 2>&1
echo done > "$OUT/SUMMARY.txt"
