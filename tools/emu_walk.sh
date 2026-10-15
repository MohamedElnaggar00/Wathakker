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
dismiss_anr() {
  for k in 1 2 3; do
    adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1
    C=$(python3 - <<'PY'
import re
x=open('/tmp/u.xml',encoding='utf-8').read() if __import__('os').path.exists('/tmp/u.xml') else ''
if "isn't responding" in x or 'isn\u2019t responding' in x or 'not responding' in x:
    m=re.search(r'text="Wait"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x)
    if m:
        a,b,c,d=map(int,m.groups()); print((a+c)//2,(b+d)//2)
PY
)
    [ -z "$C" ] && break
    adb shell input tap $C; sleep 2
  done
}
dismiss_anr
shot 00-home
# bottom bar tab centres on a 1080x2400 screen (RTL order), then settings gear and menu
printf '735 2221\n540 2221\n345 2221\n150 2221\n930 2221\n' > "$OUT/bottom-targets.txt"
i=1
while read -u 3 cx cy; do
  dismiss_anr
  adb shell input tap $cx $cy; sleep 3
  dismiss_anr
  shot $(printf '%02d' $i)-tab
  # also tap first scrollable list item / top-right settings-ish icons are not guessed here
  i=$((i+1))
done 3< "$OUT/bottom-targets.txt"
adb shell input tap 122 222; sleep 3; shot 10-gear; adb shell input keyevent KEYCODE_BACK; sleep 2
adb shell input tap 968 222; sleep 3; shot 11-menu; adb shell input keyevent KEYCODE_BACK; sleep 2
adb shell input swipe 540 1800 540 600 400; sleep 2; shot 12-scrolled
adb logcat -d -v threadtime > "$OUT/logcat.txt"
grep -E 'FATAL EXCEPTION|AndroidRuntime|ANR in' "$OUT/logcat.txt" > "$OUT/crashes.txt" || true
adb shell pidof com.wathakker.app > "$OUT/pid.txt" || true
