#!/bin/bash
# 3.3.0: smartwatch settings entry and page, light and dark.
APK=$1;OUT=$2;PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r "$APK" >/dev/null 2>&1
adb shell settings put global auto_time 0
tapdesc(){ adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/uw.xml >/dev/null 2>&1
 XY=$(python3 - "$1" <<'PY'
import re,sys
x=open('/tmp/uw.xml',encoding='utf-8').read()
for m in re.finditer(r'(?:content-desc|text)="([^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    if m.group(1)==sys.argv[1]:
        print((int(m.group(2))+int(m.group(4)))//2,(int(m.group(3))+int(m.group(5)))//2); break
PY
)
 echo "tap $1: $XY" >> "$OUT/SUMMARY.txt"; [ -n "$XY" ] && adb shell input tap $XY; }
for M in no yes; do
 adb shell cmd uimode night $M; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 tapdesc "الإعدادات"; sleep 3
 adb shell input swipe 540 1700 540 700 500; sleep 2
 adb exec-out screencap -p > "$OUT/settings_list_$M.png"
 tapdesc "إعدادات الساعة الذكية"; sleep 3
 adb exec-out screencap -p > "$OUT/watch_settings_$M.png"
 tapdesc "نظام 24 ساعة"; sleep 2
 adb exec-out screencap -p > "$OUT/watch_settings_24h_$M.png"
done
adb shell cmd uimode night no
adb logcat -d > "$OUT/logcat.txt"
! grep -E 'FATAL EXCEPTION' "$OUT/logcat.txt"
echo donewatch | tee -a "$OUT/SUMMARY.txt"
