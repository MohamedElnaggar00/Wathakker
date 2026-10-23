#!/bin/bash
# usage: diag_check.sh <apk> <outdir> <bind:yes|no> <rot>
APK=$1; OUT=$2; BIND=$3; PKG=com.wathakker.app
mkdir -p "$OUT"
adb root >/dev/null 2>&1; adb wait-for-device; sleep 5
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell dumpsys package $PKG | grep -E 'versionName|versionCode|debuggable' | head -4 > "$OUT/pkg.txt"
adb shell svc power stayon true; adb shell settings put global hide_error_dialogs 1
adb shell wm size > "$OUT/wm.txt"; adb shell wm density >> "$OUT/wm.txt"
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8; adb shell am force-stop $PKG
adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/$PKG/shared_prefs/app_prefs.xml"
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
step(){ dump "$OUT/ui_$1.xml"; XY=$(tap_re "$2" "$OUT/ui_$1.xml"); echo "$1: '$2' -> $XY" >> "$OUT/steps.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3; adb exec-out screencap -p > "$OUT/s_$1.png"; }
if [ "$BIND" = yes ]; then
  adb logcat -c
  CW=360
  adb shell am start -S -W -n $PKG/com.example.WidgetSharpCheck --ez all true --ei w $CW >/dev/null 2>&1; sleep 6
  for n in $(seq 1 16); do noanr; dump "$OUT/bind.xml"; XY=$(tap_re "^ *Create *$" "$OUT/bind.xml"); [ -z "$XY" ] && break; [ $n -eq 1 ] && { CB=$(tap_re "Always allow" "$OUT/bind.xml"); [ -n "$CB" ] && adb shell input tap $CB; }; adb shell input tap $XY; sleep 4; done
  sleep 15; noanr
  adb exec-out screencap -p > "$OUT/after_bind.png"
  adb logcat -d -s WathakkerHome:I WathakkerHome:W WathakkerHome:E > "$OUT/log.txt"
fi
adb shell am force-stop $PKG; sleep 1
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 10; noanr
adb exec-out screencap -p > "$OUT/s_home.png"
step settings "^ *الإعدادات *$"
dump "$OUT/ui_after_settings.xml"
step menu "المزيد|القائمة|Menu|More"
step settings2 "^ *الإعدادات *$"
for i in 1 2 3 4 5 6; do dump "$OUT/ui_find.xml"; XY=$(tap_re "حول التطبيق" "$OUT/ui_find.xml"); [ -n "$XY" ] && break; adb shell input swipe 600 1500 600 500 400; sleep 1; done
echo "about: $XY" >> "$OUT/steps.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
adb exec-out screencap -p > "$OUT/s_about.png"
step diagrow "Widget diagnostics"
adb exec-out screencap -p > "$OUT/s_diag.png"
dump "$OUT/ui_diag.xml"
XY=$(tap_re "^ *Refresh *$" "$OUT/ui_diag.xml"); [ -n "$XY" ] && { adb shell input tap $XY; sleep 6; adb exec-out screencap -p > "$OUT/s_diag_refresh.png"; }
python3 - "$OUT/ui_diag.xml" > "$OUT/diag_text.txt" <<'PY'
import re,sys,html
x=open(sys.argv[1],encoding='utf8').read()
for m in re.finditer(r'text="([^"]*)"',x):
    t=html.unescape(m.group(1))
    if t.strip(): print(t)
PY
adb logcat -d -b crash > "$OUT/crash.txt" 2>&1
