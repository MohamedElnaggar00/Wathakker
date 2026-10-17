#!/bin/bash
# usage: emu_verify_308.sh <apk> <outdir>  - verifies 3.0.8 fixes: gear no-stack, drawer slide direction, page-slide jank
APK=$1; OUT=$2
mkdir -p "$OUT"
adb uninstall com.wathakker.app >/dev/null 2>&1 || true
adb install -g "$APK" > "$OUT/install.txt" 2>&1
adb shell pm grant com.wathakker.app android.permission.POST_NOTIFICATIONS || true
adb logcat -c
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity > "$OUT/launch.txt" 2>&1
sleep 10
shot() { adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; }
dismiss_anr() {
  for k in 1 2 3; do
    adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1
    C=$(python3 - <<'PY'
import re, os
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
if "isn't responding" in x or 'isn\u2019t responding' in x or 'not responding' in x:
    m=re.search(r'text="Wait"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x)
    if m:
        a,b,c,d=map(int,m.groups()); print((a+c)//2,(b+d)//2)
PY
)
    [ -z "$C" ] && break
    echo "ANR dismissed at $C" >> "$OUT/anr.txt"
    adb shell input tap $C; sleep 3
  done
}

# 1) page-slide jank measurement FIRST (no screenrecord load)
dismiss_anr
shot 00-home
adb shell dumpsys gfxinfo com.wathakker.app reset
dismiss_anr; adb shell input swipe 800 1200 200 1200 300; sleep 1
adb shell input swipe 800 1200 200 1200 300; sleep 1
adb shell input swipe 200 1200 800 1200 300; sleep 1
adb shell input swipe 200 1200 800 1200 300; sleep 1
dismiss_anr; adb shell input tap 150 2221; sleep 2
dismiss_anr; adb shell input tap 930 2221; sleep 2
dismiss_anr; adb shell input tap 122 222; sleep 4
dismiss_anr; adb shell input keyevent KEYCODE_BACK; sleep 3
dismiss_anr
shot 01-after-pager
adb shell dumpsys gfxinfo com.wathakker.app > "$OUT/gfxinfo.txt"

# 2) functional pass with recording (lighter encoder settings)
adb shell "screenrecord --size 720x1560 --bit-rate 4000000 --time-limit 45 /sdcard/verify.mp4" > "$OUT/record.txt" 2>&1 &
REC=$!
sleep 2
dismiss_anr; adb shell input tap 968 222; sleep 4; shot 02-drawer-open
dismiss_anr; adb shell input tap 300 1400; sleep 4; shot 03-drawer-closed
dismiss_anr; adb shell input tap 122 222; sleep 4; shot 04-settings
dismiss_anr; adb shell input tap 122 222; sleep 3; shot 05-settings-second-tap
dismiss_anr; adb shell input keyevent KEYCODE_BACK; sleep 3; dismiss_anr; shot 06-after-one-back
wait $REC || true
adb pull /sdcard/verify.mp4 "$OUT/verify.mp4" >> "$OUT/record.txt" 2>&1 || true

# 3) widget render harness (debug builds only): light/dark/default backgrounds, per-instance ids
adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck > "$OUT/rendercheck.txt" 2>&1 || true
sleep 4
adb pull /sdcard/Android/data/com.wathakker.app/files "$OUT/widgets" > "$OUT/pull_widgets.txt" 2>&1 || true

adb logcat -d -v threadtime > "$OUT/logcat.txt"
grep -E 'FATAL EXCEPTION|AndroidRuntime|ANR in' "$OUT/logcat.txt" > "$OUT/crashes.txt" || true
adb shell pidof com.wathakker.app > "$OUT/pid.txt" || true
