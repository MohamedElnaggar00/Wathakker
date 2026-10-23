#!/bin/bash
# usage: widget_scale.sh <debug.apk> <outdir>
APK=$1; OUT=$2; PKG=com.wathakker.app
mkdir -p "$OUT"
adb wait-for-device; sleep 5
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
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
adb shell settings put global hide_error_dialogs 1
run(){ tag=$1; den=$2; rot=$3
  adb shell wm density $den; adb shell settings put system accelerometer_rotation 0; adb shell settings put system user_rotation $rot; sleep 5
  SZ=$(adb shell wm size | grep -oE '[0-9]+x[0-9]+' | tail -1); WPX=$(echo $SZ | cut -dx -f1); HPX=$(echo $SZ | cut -dx -f2)
  [ "$rot" = 1 ] || [ "$rot" = 3 ] && { T=$WPX; WPX=$HPX; HPX=$T; }
  WDP=$(( WPX * 160 / den )); CW=$(( WDP / 2 - 20 )); [ $CW -gt 600 ] && CW=600
  echo "$tag density=$den rot=$rot screen=${WPX}x${HPX}px widthdp=$WDP cell=${CW}dp" >> "$OUT/scenarios.txt"
  adb logcat -c
  adb shell am start -S -W -n $PKG/com.example.WidgetSharpCheck --ez all true --ei w $CW >/dev/null 2>&1; sleep 6
  for n in $(seq 1 16); do noanr; dump "$OUT/bind_$tag.xml"; XY=$(tap_re "^ *Create *$" "$OUT/bind_$tag.xml"); [ -z "$XY" ] && break; [ $n -eq 1 ] && { CB=$(tap_re "Always allow" "$OUT/bind_$tag.xml"); [ -n "$CB" ] && { adb shell input tap $CB; sleep 1; }; }; adb shell input tap $XY; sleep 6; done
  sleep 20; noanr
  adb exec-out screencap -p > "$OUT/shot_$tag.png"
  adb logcat -d -s SHARP:I WathakkerHome:I WathakkerHome:W WathakkerHome:E > "$OUT/log_$tag.txt"
  adb shell am force-stop $PKG
}
run land320 320 0
run port320 320 1
run land240 240 0
run land480 480 0
adb shell wm density reset; adb shell settings put system user_rotation 0
