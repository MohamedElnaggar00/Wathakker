#!/bin/bash
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
adb shell date 102101502026.00 >/dev/null 2>&1
adb shell svc power stayon true; adb shell settings put system screen_off_timeout 1800000
adb shell am start -W -n $PKG/com.wathakker.wear.MainActivity >/dev/null 2>&1; sleep 20
adb shell input keyevent KEYCODE_HOME; sleep 5; adb exec-out screencap -p > "$OUT/c0_face.png"
adb shell am start -W -n $PKG/com.wathakker.wear.CirclesActivity > "$OUT/start1.txt" 2>&1
sleep 0.5; adb exec-out screencap -p > "$OUT/c1_anim.png"; sleep 6; adb exec-out screencap -p > "$OUT/c2_done.png"
# app in background, on another page (qibla=2), then complication-style open
adb shell am start -S -W -n $PKG/com.wathakker.wear.MainActivity --ei page 2 >/dev/null 2>&1; sleep 14; adb exec-out screencap -p > "$OUT/c3_main_page2.png"
adb shell am start -W -n $PKG/com.wathakker.wear.CirclesActivity -f 0x10008000 > "$OUT/start4.txt" 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/c4_from_page2.png"; adb shell dumpsys activity activities | grep -i "topResumed\|ActivityRecord" | head -12 > "$OUT/d4.txt"
adb shell input keyevent KEYCODE_HOME; sleep 3
adb shell am start -W -n $PKG/com.wathakker.wear.CirclesActivity -f 0x10008000 > "$OUT/start5.txt" 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/c5_from_background.png"; adb shell dumpsys activity activities | grep -i "topResumed\|ActivityRecord" | head -12 > "$OUT/d5.txt"
adb shell dumpsys activity activities | grep -i "topResumed\|mResumedActivity" > "$OUT/resumed.txt" 2>&1
adb logcat -d | grep -i "AndroidRuntime\|FATAL\|wathakker" -A3 | head -40 > "$OUT/logcat.txt" 2>&1
echo done > "$OUT/SUMMARY.txt"
