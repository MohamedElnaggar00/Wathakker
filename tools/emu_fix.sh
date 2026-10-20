#!/bin/bash
APK=$1; OUT=$2; PKG=com.wathakker.app; A=com.wathakker.wear; mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
adb shell date 102101502026.00 >/dev/null 2>&1
adb shell svc power stayon true; adb shell settings put system screen_off_timeout 1800000
adb shell am start -W -n $PKG/$A.MainActivity >/dev/null 2>&1; sleep 20
shot(){ adb exec-out screencap -p > "$OUT/$1.png"; }
for SB in 0 1 2 3 4; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 4 --ei sub $SB >/dev/null 2>&1; sleep 10; shot set_$SB; done
for TH in 1 2 3; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 0 --ei theme $TH >/dev/null 2>&1; sleep 10; shot theme_main_$TH; adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 1 --ei theme $TH >/dev/null 2>&1; sleep 10; shot theme_list_$TH; done
for PT in 3 9; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 0 --ei pat $PT >/dev/null 2>&1; sleep 10; shot pat_$PT; done
adb shell am start -S -W -n $PKG/$A.PreviewActivity --es mode tile >/dev/null 2>&1; sleep 8; shot tile_default
for K in 1 2 3 4 5 6 7 8; do adb shell am start -S -W -n $PKG/$A.PreviewActivity --es mode short --ei kind $K >/dev/null 2>&1; sleep 7; shot comp_$K; done
adb shell am start -S -W -n $PKG/$A.PreviewActivity --es mode ranged >/dev/null 2>&1; sleep 7; shot comp_ranged
adb shell dumpsys package $PKG | grep -i "versionName\|label" | head -3 > "$OUT/pkg.txt"
adb logcat -d | grep -i "AndroidRuntime\|FATAL EXCEPTION" -A8 | head -40 > "$OUT/logcat.txt" 2>&1
echo done > "$OUT/SUMMARY.txt"
