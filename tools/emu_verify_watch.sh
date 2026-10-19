#!/bin/bash
# 3.3.0: smartwatch settings entry and page, light and dark.
APK=$1;OUT=$2;PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r "$APK" >/dev/null 2>&1
adb shell settings put global auto_time 0
tapdesc(){ adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/uw.xml >/dev/null 2>&1
 XY=$(python3 - "$1" $2 <<'PY'
import re,sys
x=open('/tmp/uw.xml',encoding='utf-8').read()
for m in re.finditer(r'(?:content-desc|text)="([^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    if m.group(1)==sys.argv[1]:
        r=((int(m.group(2))+int(m.group(4)))//2,(int(m.group(3))+int(m.group(5)))//2)
        if len(sys.argv)<3: print(*r); break
        last=r
if len(sys.argv)>=3 and 'last' in dir(): print(*last)
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
# side drawer over the prayer sky, light and dark
for M in no yes; do
 adb shell cmd uimode night $M; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/uw.xml >/dev/null 2>&1
 XY=$(python3 - <<'PY'
import re
x=open('/tmp/uw.xml',encoding='utf-8').read()
for m in re.finditer(r'content-desc="([^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    if m.group(1) in ('القائمة','Menu'):
        print((int(m.group(2))+int(m.group(4)))//2,(int(m.group(3))+int(m.group(5)))//2); break
PY
)
 echo "menu tap: $XY" >> "$OUT/SUMMARY.txt"
 [ -n "$XY" ] && adb shell input tap $XY; sleep 3
 adb exec-out screencap -p > "$OUT/drawer_$M.png"
done
# Hisn page: search icon next to the gear
for M in no yes; do
 adb shell cmd uimode night $M; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 tapdesc "حصن المسلم"; sleep 3
 adb exec-out screencap -p > "$OUT/hisn_$M.png"
 adb shell input tap 540 1000; sleep 3; adb exec-out screencap -p > "$OUT/hisn_chapter_$M.png"; tapdesc "عداد الذكر"; sleep 1; adb exec-out screencap -p > "$OUT/hisn_done_$M.png"; tapdesc "معلومات الذكر" last; sleep 2; adb exec-out screencap -p > "$OUT/hisn_notes_$M.png"; adb shell input keyevent 4; sleep 2
 tapdesc "ابحث في حصن المسلم" last; sleep 2
 adb shell input text "wudu"; sleep 1
 adb exec-out screencap -p > "$OUT/hisn_search_$M.png"
done
adb shell cmd uimode night no
adb logcat -d > "$OUT/logcat.txt"
! grep -E 'FATAL EXCEPTION' "$OUT/logcat.txt"
echo donewatch | tee -a "$OUT/SUMMARY.txt"
