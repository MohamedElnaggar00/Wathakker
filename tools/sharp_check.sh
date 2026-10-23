#!/bin/bash
# Widget sharpness + tablet drawer width evidence. Usage: sharp_check.sh <apk> <outdir>
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell settings put system accelerometer_rotation 0; adb shell settings put system user_rotation 0
adb shell wm size > "$OUT/wm.txt"; adb shell wm density >> "$OUT/wm.txt"
adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/$PKG/shared_prefs/app_prefs.xml" 2>/dev/null
adb shell cmd appwidget grantbind --package $PKG --user 0 > "$OUT/grant.txt" 2>&1
adb logcat -c
for r in 1 2; do
  adb shell am force-stop $PKG; sleep 1
  adb shell am start -S -W -n $PKG/com.example.WidgetSharpCheck --ei w 800 --ei h1 157 --ei h2 204 >> "$OUT/launch.txt" 2>&1
  sleep 10
done
adb exec-out screencap -p > "$OUT/widgets.png"
adb logcat -d -s SHARP:I WathakkerHome:E > "$OUT/sharp_log.txt"
# drawer on the tablet, landscape
adb shell am force-stop $PKG; sleep 1
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 14
adb exec-out screencap -p > "$OUT/app_land.png"
adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$OUT/ui_land.xml" >/dev/null 2>&1
XY=$(python3 - "$OUT/ui_land.xml" <<'PY'
import re,sys
x=open(sys.argv[1],encoding='utf8').read()
for m in re.finditer(r'<node [^>]*>',x):
    n=m.group(0); d=re.search(r'content-desc="([^"]*)"',n); b=re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',n)
    if d and b and re.search(r'القائمة|Menu',d.group(1)):
        a=list(map(int,b.groups())); print((a[0]+a[2])//2,(a[1]+a[3])//2); break
PY
)
echo "menu button: $XY" > "$OUT/drawer_nav.txt"
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
adb exec-out screencap -p > "$OUT/drawer_land.png"
adb shell settings put system user_rotation 1; sleep 4
[ -n "$XY" ] && { adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb exec-out screencap -p > "$OUT/port_app.png"; }
adb shell settings put system user_rotation 0
