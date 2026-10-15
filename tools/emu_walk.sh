#!/bin/bash
# usage: emu_walk.sh <apk> <outdir>   (runs inside an emulator session)
APK=$1; OUT=$2
mkdir -p "$OUT"
adb uninstall com.wathakker.app >/dev/null 2>&1 || true
adb install -g "$APK" > "$OUT/install.txt" 2>&1
adb shell pm grant com.wathakker.app android.permission.POST_NOTIFICATIONS || true
adb logcat -c
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity > "$OUT/launch.txt" 2>&1
sleep 8
shot() { adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml "$OUT/$1.xml" >/dev/null 2>&1; }
shot 00-home
# tap each bottom-bar element (y in lowest 15% of screen), screenshot after each
python3 - "$OUT/00-home.xml" > "$OUT/bottom-targets.txt" <<'PY'
import re,sys
x=open(sys.argv[1],encoding='utf-8').read()
H=max([int(m.group(4)) for m in re.finditer(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x)] or [2400])
seen=set()
for m in re.finditer(r'<node[^>]*?clickable="true"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    a,b,c,d=map(int,m.groups())
    cy=(b+d)//2
    if cy>H*0.85 and (a+c)//2 not in seen:
        seen.add((a+c)//2); print((a+c)//2,cy)
PY
i=1
while read -u 3 cx cy; do
  adb shell input tap $cx $cy; sleep 3
  shot $(printf '%02d' $i)-tab
  # also tap first scrollable list item / top-right settings-ish icons are not guessed here
  i=$((i+1))
done 3< "$OUT/bottom-targets.txt"
adb logcat -d -v threadtime > "$OUT/logcat.txt"
grep -E 'FATAL EXCEPTION|AndroidRuntime|ANR in' "$OUT/logcat.txt" > "$OUT/crashes.txt" || true
adb shell pidof com.wathakker.app > "$OUT/pid.txt" || true
