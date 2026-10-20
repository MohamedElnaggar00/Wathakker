#!/bin/bash
APK=$1; OUT=$2; PKG=com.wathakker.app; A=com.wathakker.wear; mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
adb shell date 102101502026.00 >/dev/null 2>&1
adb shell svc power stayon true; adb shell settings put system screen_off_timeout 1800000
adb shell am start -W -n $PKG/$A.MainActivity >/dev/null 2>&1; sleep 20
shot(){ adb exec-out screencap -p > "$OUT/$1.png"; }
for PT in 3 4 5; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 0 --ei pat $PT >/dev/null 2>&1; sleep 12; shot stars_$PT; done
for P in 0 2; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page $P >/dev/null 2>&1; sleep 12; shot page_$P; done
adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 1 >/dev/null 2>&1; sleep 12; shot list_a
adb shell input swipe 227 380 227 120 300; sleep 2; shot list_b
adb shell input swipe 227 380 227 120 300; sleep 2; shot list_c
adb shell settings put system font_scale 1.3; sleep 2
adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 1 >/dev/null 2>&1; sleep 12; shot list_font13_a
adb shell input swipe 227 380 227 120 300; sleep 2; shot list_font13_b
adb shell input swipe 227 380 227 120 300; sleep 2; shot list_font13_c
adb shell settings put system font_scale 1.0
for M in tile ranged short; do adb shell am start -S -W -n $PKG/$A.PreviewActivity --es mode $M >/dev/null 2>&1; sleep 8; shot preview_$M; done
adb shell dumpsys package $PKG | grep -i "versionName\|label" | head -3 > "$OUT/pkg.txt"
adb logcat -d | grep -i "AndroidRuntime\|FATAL EXCEPTION" -A8 | head -40 > "$OUT/logcat.txt" 2>&1
echo done > "$OUT/SUMMARY.txt"
