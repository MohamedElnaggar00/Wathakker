#!/bin/bash
# Picker proof: open the stock launcher's widget picker, expand وذكر, screenshot the
# preview list in light + dark. Proves per-widget previews render unclipped after the
# previewLayout restore. Usage: emu_picker_proof.sh <app.apk> <outdir> <label>
set -uo pipefail
APK=$1; OUT=$2; LABEL=$3
mkdir -p "$OUT"
adb wait-for-device; adb shell 'while [ "$(getprop sys.boot_completed)" != 1 ]; do sleep 2; done'; sleep 8
SW=$(adb shell wm size | awk -F'[x ]' '{print $3}'); SH=$(adb shell wm size | awk -F'x' '{print $2}')
CX=$((SW/2))
shot() { adb exec-out screencap -p > "$OUT/$1.png"; }
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

adb install -r "$APK"
for MODE in no yes; do
  adb shell cmd uimode night $MODE; sleep 2
  adb shell input keyevent KEYCODE_HOME; sleep 3
  adb shell input swipe $CX $((SH*55/100)) $CX $((SH*55/100)) 1500; sleep 3
  dump
  C=$(center "Widgets"); [ -z "$C" ] && C=$(center "الودجت"); [ -z "$C" ] && C=$(center_any "Widgets")
  if [ -z "$C" ]; then echo "WARN: Widgets entry not found"; shot "${LABEL}_picker_${MODE}_fail"; continue; fi
  adb shell input tap $C; sleep 3
  C=$(scroll_until "وذكر") || { echo "WARN: app row not found"; shot "${LABEL}_picker_${MODE}_fail"; continue; }
  adb shell input tap $C; sleep 4
  shot "${LABEL}_picker_${MODE}_1"
  adb shell input swipe $CX $((SH*70/100)) $CX $((SH*35/100)) 400; sleep 2
  shot "${LABEL}_picker_${MODE}_2"
  adb shell input keyevent KEYCODE_HOME; sleep 2
done
echo "picker proof done: $OUT"
