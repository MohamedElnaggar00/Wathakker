#!/bin/bash
# usage: emu_verify_308.sh <apk> <outdir>  - verifies 3.0.8 fixes: gear no-stack, drawer slide direction, page-slide jank
APK=$1; OUT=$2
mkdir -p "$OUT"
adb uninstall com.wathakker.app >/dev/null 2>&1 || true
adb install -g "$APK" > "$OUT/install.txt" 2>&1
adb shell pm grant com.wathakker.app android.permission.POST_NOTIFICATIONS || true
adb logcat -c
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity > "$OUT/launch.txt" 2>&1
sleep 8
shot() { adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; }
shot 00-home

# record everything (animations enabled in this workflow)
adb shell "screenrecord --time-limit 60 /sdcard/verify.mp4" > "$OUT/record.txt" 2>&1 &
REC=$!
sleep 2

# 1) drawer: open via menu, close via scrim tap
adb shell input tap 968 222; sleep 3; shot 01-drawer-open
adb shell input tap 300 1400; sleep 3; shot 02-drawer-closed

# 2) gear: open settings; header gear hidden; tapping its spot does nothing; one back reaches home
adb shell input tap 122 222; sleep 3; shot 03-settings
adb shell input tap 122 222; sleep 2; shot 04-settings-second-tap
adb shell input keyevent KEYCODE_BACK; sleep 2; shot 05-after-one-back

# 3) page-slide stress under frame measurement
adb shell dumpsys gfxinfo com.wathakker.app reset
adb shell input swipe 800 1200 200 1200 300; sleep 1
adb shell input swipe 800 1200 200 1200 300; sleep 1
adb shell input swipe 200 1200 800 1200 300; sleep 1
adb shell input swipe 200 1200 800 1200 300; sleep 1
adb shell input tap 150 2221; sleep 2
adb shell input tap 930 2221; sleep 2
adb shell input tap 122 222; sleep 2
adb shell input keyevent KEYCODE_BACK; sleep 2
shot 06-after-pager
adb shell dumpsys gfxinfo com.wathakker.app > "$OUT/gfxinfo.txt"

wait $REC || true
adb pull /sdcard/verify.mp4 "$OUT/verify.mp4" >> "$OUT/record.txt" 2>&1 || true
adb logcat -d -v threadtime > "$OUT/logcat.txt"
grep -E 'FATAL EXCEPTION|AndroidRuntime|ANR in' "$OUT/logcat.txt" > "$OUT/crashes.txt" || true
adb shell pidof com.wathakker.app > "$OUT/pid.txt" || true
