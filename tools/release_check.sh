#!/bin/bash
# Installs the exact CI release APK and checks launch, splash frames, swipe, calendar and scroll-to-end. Usage: release_check.sh <apk> <outdir> <tablet|phone>
APK=$1; OUT=$2; KIND=$3; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
BT=$(ls -d $ANDROID_HOME/build-tools/* 2>/dev/null | sort -V | tail -1)
sha256sum "$APK" > "$OUT/sha.txt"
{ "$BT/apksigner" verify --verbose --print-certs "$APK" 2>&1 | head -12; } > "$OUT/sig.txt"
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell dumpsys package $PKG | grep -E 'versionName|versionCode|debuggable|flags=' | head -5 > "$OUT/pkg.txt"
adb shell svc power stayon true
adb shell settings put global hide_error_dialogs 1
adb shell am broadcast -a android.intent.action.CLOSE_SYSTEM_DIALOGS >/dev/null 2>&1
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
W=$(adb shell wm size | grep -oE '[0-9]+x[0-9]+' | tail -1 | cut -dx -f1); H=$(adb shell wm size | grep -oE '[0-9]+x[0-9]+' | tail -1 | cut -dx -f2)
echo "screen $W x $H" > "$OUT/dims.txt"
# --- cold launch timing + consecutive frames, light then dark ---
for mode in no yes; do
  adb shell cmd uimode night $mode; sleep 2; adb shell am force-stop $PKG; sleep 2
  adb shell am start -W -n $PKG/com.example.MainActivity 2>&1 | grep -E "ThisTime|TotalTime|WaitTime" > "$OUT/start_${mode}.txt"
  adb shell am force-stop $PKG; sleep 2
  adb shell am start -n $PKG/com.example.MainActivity >/dev/null 2>&1
  for f in $(seq 1 14); do adb exec-out screencap -p > "$OUT/frame_${mode}_$(printf %02d $f).png"; done
  sleep 8
done
adb shell cmd uimode night no; sleep 2
adb shell am force-stop $PKG; sleep 1; adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 10; noanr
adb exec-out screencap -p > "$OUT/page_prayer.png"
# --- swipe through pages: slow drag with frames captured WHILE the pager is mid-swipe ---
Y=$((H*7/10)); X1=$((W*3/10)); X2=$((W*8/10))
mid(){ # $1 tag, $2 from, $3 to
  adb shell input draganddrop $2 $Y $3 $Y 1600 &
  DP=$!
  for t in 1 2 3; do sleep 0.45; adb exec-out screencap -p > "$OUT/mid_$1_$t.png"; done
  wait $DP; sleep 2; adb exec-out screencap -p > "$OUT/swipe_$1.png"
}
for k in 1 2 3; do mid fwd$k $X1 $X2; done
for k in 1 2 3; do mid back$k $X2 $X1; done
# --- each page via bar tap, then scroll to the end ---
scroll_end(){ # $1 name
  for i in 1 2 3 4 5 6 7 8; do adb shell input swipe $((W/2)) $((H*3/4)) $((W/2)) $((H/5)) 400; sleep 1; done
  adb exec-out screencap -p > "$OUT/end_$1.png"
  if [ "$KIND" = tablet ]; then
    for i in 1 2 3 4 5 6; do adb shell input swipe $((W*3/4)) $((H*3/4)) $((W*3/4)) $((H/5)) 400; sleep 1; done
    for i in 1 2 3 4 5 6; do adb shell input swipe $((W/4)) $((H*3/4)) $((W/4)) $((H/5)) 400; sleep 1; done
    adb exec-out screencap -p > "$OUT/end2_$1.png"
  fi
}
for pair in "calendar:^ *التقويم *$" "reminders:^ *التذكيرات *$" "hisn:^ *حصن المسلم *$" "prayer:^ *الصلاة *$"; do
  n=${pair%%:*}; re=${pair#*:}
  dump "$OUT/ui_$n.xml"; XY=$(tap_re "$re" "$OUT/ui_$n.xml"); echo "$n tab: $XY" >> "$OUT/tabs.txt"
  [ -n "$XY" ] && adb shell input tap $XY; sleep 3
  adb exec-out screencap -p > "$OUT/top_$n.png"; scroll_end $n
done
adb shell cmd uimode night yes; sleep 3; adb shell am force-stop $PKG; sleep 1; adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 10; noanr
for pair in "calendar:^ *التقويم *$" "reminders:^ *التذكيرات *$" "hisn:^ *حصن المسلم *$" "prayer:^ *الصلاة *$"; do
  n=${pair%%:*}; re=${pair#*:}
  dump "$OUT/dui_$n.xml"; XY=$(tap_re "$re" "$OUT/dui_$n.xml"); echo "$n tab: $XY" >> "$OUT/dtabs.txt"
  [ -n "$XY" ] && adb shell input tap $XY; sleep 3
  adb exec-out screencap -p > "$OUT/dtop_$n.png"; scroll_end d$n
done
adb shell cmd uimode night no; sleep 3
if [ "$KIND" = tablet ]; then
  adb shell settings put system user_rotation 1; sleep 3
  dump "$OUT/ui_p.xml"; XY=$(tap_re "^ *التقويم *$" "$OUT/ui_p.xml"); [ -n "$XY" ] && adb shell input tap $XY; sleep 3
  adb exec-out screencap -p > "$OUT/portrait_calendar.png"
  adb shell settings put system user_rotation 0
fi
adb logcat -d -b crash > "$OUT/crash.txt" 2>&1
