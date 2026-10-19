#!/bin/bash
# build 55 extras: tab order/rename, header on all tabs, city tap -> location settings, label fit at large font
APK=$1;OUT=$2;PKG=com.wathakker.app
mkdir -p "$OUT"
adb root >/dev/null; sleep 2
shot(){ adb exec-out screencap -p > "$OUT/$1.png"; adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml "$OUT/$1.xml" >/dev/null 2>&1; }
tap_txt(){ adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/t.xml >/dev/null 2>&1
 python3 - "$1" <<'PY' | while read X Y; do adb shell input tap $X $Y; done
import re,sys
x=open('/tmp/t.xml',encoding='utf-8').read()
for m in re.finditer(r'<node[^>]*>',x):
    n=m.group(0)
    if ('text="%s"'%sys.argv[1] in n or 'content-desc="%s"'%sys.argv[1] in n):
        b=re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',n)
        if b:
            a=list(map(int,b.groups()));print((a[0]+a[2])//2,(a[1]+a[3])//2);break
PY
 sleep 2; }
for MODE in yes no; do
 adb shell cmd uimode night $MODE; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 shot "55_prayer_$MODE"
 for T in "التذكيرات" "حصن المسلم" "التقويم"; do tap_txt "$T"; shot "55_tab_${T// /_}_$MODE"; done
 tap_txt "الصلاة"; sleep 1
done
grep -q 'التذكيرات' "$OUT/55_prayer_no.xml"
! grep -q 'text="الأذكار"' "$OUT/55_prayer_no.xml"
# city tap -> location settings
adb shell cmd uimode night yes
adb shell am force-stop $PKG; adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
tap_txt "القاهرة"; shot 55_city_tap
grep -q 'الموقع والحساب' "$OUT/55_city_tap.xml" && echo PASS city-tap || echo FAIL city-tap
# label fit at large font
adb shell settings put system font_scale 1.3
adb shell am force-stop $PKG; adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
shot 55_prayer_font130
adb shell settings put system font_scale 1.0
echo done55 | tee "$OUT/SUMMARY.txt"
