#!/bin/bash
# Widget sharpness + tablet drawer + prayer background evidence. Usage: sharp_check.sh <apk> <outdir>
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell settings put system accelerometer_rotation 0; adb shell settings put system user_rotation 0
adb shell wm size > "$OUT/wm.txt"; adb shell wm density >> "$OUT/wm.txt"
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$1" >/dev/null 2>&1; }
tap_re(){ python3 - "$1" "$2" <<'PY'
import re,sys
x=open(sys.argv[2],encoding='utf8').read()
for m in re.finditer(r'<node [^>]*>',x):
    n=m.group(0)
    t=re.search(r'text="([^"]*)"',n); d=re.search(r'content-desc="([^"]*)"',n); b=re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',n)
    s=(t.group(1) if t else '')+' '+(d.group(1) if d else '')
    if b and re.search(sys.argv[1],s):
        a=list(map(int,b.groups())); print((a[0]+a[2])//2,(a[1]+a[3])//2); break
PY
}
noanr(){ for i in 1 2 3; do dump "$OUT/_anr.xml"; if grep -q "isn't responding" "$OUT/_anr.xml"; then XY=$(tap_re "^ *Wait *$" "$OUT/_anr.xml"); [ -n "$XY" ] && adb shell input tap $XY; sleep 3; else break; fi; done; }
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8
adb shell am force-stop $PKG
adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/$PKG/shared_prefs/app_prefs.xml"
adb logcat -c
# --- widgets: bind through the system dialog, then host at fixed tablet-like sizes ---
adb shell am start -S -W -n $PKG/com.example.WidgetSharpCheck --ei w 800 --ei h1 157 --ei h2 204 --ez all ${ALL:-false} >> "$OUT/launch.txt" 2>&1; sleep 6
for n in 1 2 3 4 5 6; do noanr; dump "$OUT/bind.xml"; XY=$(tap_re "^ *Create *$" "$OUT/bind.xml"); [ -z "$XY" ] && break; adb shell input tap $XY; sleep 6; done
sleep 10; noanr
adb exec-out screencap -p > "$OUT/widgets.png"
adb logcat -d -s SHARP:I WathakkerHome:E > "$OUT/sharp_log.txt"
# --- app, landscape tablet ---
adb shell am force-stop $PKG; sleep 1
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 14; noanr
adb exec-out screencap -p > "$OUT/app_land.png"
for k in 1 2 3; do adb shell input swipe 700 1150 2000 1150 700; sleep 2; adb exec-out screencap -p > "$OUT/swipe_right_$k.png"; done
for k in 1 2 3; do adb shell input swipe 2000 1150 700 1150 700; sleep 2; adb exec-out screencap -p > "$OUT/swipe_left_$k.png"; done
dump "$OUT/ui_tabs.xml"
XY=$(tap_re "^ *التقويم *$|Calendar" "$OUT/ui_tabs.xml"); echo "calendar tab: $XY" > "$OUT/cal_nav.txt"
[ -n "$XY" ] && adb shell input tap $XY; sleep 3; adb exec-out screencap -p > "$OUT/calendar_land.png"
adb shell settings put system user_rotation 1; sleep 3; adb exec-out screencap -p > "$OUT/calendar_port.png"
adb shell settings put system user_rotation 0; sleep 2
# --- launch splash frames, light and dark, cold start ---
for mode in no yes; do
  adb shell cmd uimode night $mode; sleep 2
  adb shell am force-stop $PKG; sleep 2
  adb shell am start -n $PKG/com.example.MainActivity >/dev/null 2>&1
  for f in 1 2 3 4 5 6; do adb exec-out screencap -p > "$OUT/splash_${mode}_$f.png"; done
  sleep 8
done
adb shell cmd uimode night no
adb shell am force-stop $PKG; sleep 1
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 12; noanr
dump "$OUT/ui_land.xml"
XY=$(tap_re "القائمة|Menu" "$OUT/ui_land.xml")
echo "menu button: $XY" > "$OUT/drawer_nav.txt"
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
adb exec-out screencap -p > "$OUT/drawer_land.png"
