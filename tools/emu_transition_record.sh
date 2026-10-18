#!/bin/bash
# One-off: A/B widget-picker preview evidence (old release vs fixed build on the
# stock launcher) + screenrecord of the new NavHost page transitions.
# Usage: emu_transition_record.sh <old.apk> <new.apk> <out_dir>
set -u
OLD="$1"; NEW="$2"; OUT="$3"
mkdir -p "$OUT"
adb wait-for-device; adb shell 'while [ "$(getprop sys.boot_completed)" != 1 ]; do sleep 2; done'; sleep 8
SW=$(adb shell wm size | awk -F'[x ]' '{print $3}'); SH=$(adb shell wm size | awk -F'x' '{print $2}')
CX=$((SW/2))
say() { echo "$1" | tee -a "$OUT/record_notes.txt"; }
shot() { adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; }
dump() { adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1; }
center() { python3 -c "
import re,sys
x=open('/tmp/u.xml',encoding='utf-8').read()
t=sys.argv[1]
for m in re.finditer(r'<node[^>]*>',x):
    n=m.group(0)
    if (f'text=\"{t}\"' in n or f'content-desc=\"{t}\"' in n) and 'clickable=\"true\"' in n:
        b=re.search(r'bounds=\"\[(\d+),(\d+)\]\[(\d+),(\d+)\]\"',n)
        if b: print((int(b.group(1))+int(b.group(3)))//2,(int(b.group(2))+int(b.group(4)))//2); sys.exit(0)
" "$1" 2>/dev/null; }
center_any() { python3 -c "
import re,sys
x=open('/tmp/u.xml',encoding='utf-8').read()
t=sys.argv[1]
for m in re.finditer(r'<node[^>]*>',x):
    n=m.group(0)
    if f'text=\"{t}\"' in n or f'content-desc=\"{t}\"' in n:
        b=re.search(r'bounds=\"\[(\d+),(\d+)\]\[(\d+),(\d+)\]\"',n)
        if b: print((int(b.group(1))+int(b.group(3)))//2,(int(b.group(2))+int(b.group(4)))//2); sys.exit(0)
" "$1" 2>/dev/null; }
scroll_until() { for i in 1 2 3 4 5 6 7 8; do dump; C=$(center_any "$1"); [ -n "$C" ] && { echo "$C"; return 0; }; adb shell input swipe $CX $((SH*75/100)) $CX $((SH*30/100)) 350; sleep 2; done; return 1; }

picker_shots() { # <prefix>
  adb shell input keyevent KEYCODE_HOME; sleep 3
  adb shell input swipe $CX $((SH*55/100)) $CX $((SH*55/100)) 1500; sleep 3   # long-press home
  dump
  C=$(center "Widgets"); [ -z "$C" ] && C=$(center "الودجت"); [ -z "$C" ] && C=$(center_any "Widgets")
  if [ -z "$C" ]; then say "WARN: Widgets entry not found on home long-press"; shot "$1_picker_fail"; return 1; fi
  adb shell input tap $C; sleep 3
  C=$(scroll_until "وذكر") || { say "WARN: app row not found in picker"; shot "$1_picker_fail"; return 1; }
  adb shell input tap $C; sleep 4   # expand widget list
  shot "$1_picker_1"
  adb shell input swipe $CX $((SH*70/100)) $CX $((SH*35/100)) 400; sleep 2
  shot "$1_picker_2"
  adb shell input keyevent KEYCODE_HOME; sleep 2
  return 0
}

say "== A/B picker evidence =="
adb install -r "$OLD" >/dev/null 2>&1 && say "old apk installed (published v3.1.0, broken previews)"
picker_shots "old"
adb uninstall com.wathakker.app >/dev/null 2>&1
adb install -r "$NEW" >/dev/null 2>&1 && say "new apk installed (build 39104073859, fixed previews)"
picker_shots "new"

say "== transition screenrecord =="
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity > "$OUT/launch.txt" 2>&1; sleep 6
adb shell "screenrecord --time-limit 22 /sdcard/trans.mp4" & REC=$!
sleep 2
for i in 1 2 3; do
  dump; C=$(center_any "القبلة")
  [ -n "$C" ] && adb shell input tap $C; sleep 2
  adb shell input keyevent KEYCODE_BACK; sleep 2
done
wait $REC 2>/dev/null; sleep 2
adb pull /sdcard/trans.mp4 "$OUT/trans.mp4" >/dev/null 2>&1 && say "transition recording pulled" || say "WARN: recording pull failed"
adb shell rm /sdcard/trans.mp4 2>/dev/null
say "DONE"
