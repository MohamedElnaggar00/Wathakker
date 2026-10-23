#!/bin/bash
# usage: widget_scale.sh <debug.apk> <outdir>
APK=$1; OUT=$2; PKG=com.wathakker.app
mkdir -p "$OUT"
adb wait-for-device; sleep 5
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8; adb shell am force-stop $PKG
adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/$PKG/shared_prefs/app_prefs.xml"
adb shell cmd appwidget grantbind --package $PKG > "$OUT/grant.txt" 2>&1
adb shell settings put global hide_error_dialogs 1
run(){ tag=$1; den=$2; rot=$3
  adb shell wm density $den; adb shell settings put system accelerometer_rotation 0; adb shell settings put system user_rotation $rot; sleep 5
  SZ=$(adb shell wm size | grep -oE '[0-9]+x[0-9]+' | tail -1); WPX=$(echo $SZ | cut -dx -f1); HPX=$(echo $SZ | cut -dx -f2)
  [ "$rot" = 1 ] || [ "$rot" = 3 ] && { T=$WPX; WPX=$HPX; HPX=$T; }
  WDP=$(( WPX * 160 / den )); CW=$(( WDP / 2 - 20 )); [ $CW -gt 600 ] && CW=600
  echo "$tag density=$den rot=$rot screen=${WPX}x${HPX}px widthdp=$WDP cell=${CW}dp" >> "$OUT/scenarios.txt"
  adb logcat -c
  adb shell am start -S -W -n $PKG/com.example.WidgetSharpCheck --ez all true --ei w $CW >/dev/null 2>&1; sleep 30
  adb exec-out screencap -p > "$OUT/shot_$tag.png"
  adb logcat -d -s SHARP:I WathakkerHome:I WathakkerHome:W WathakkerHome:E > "$OUT/log_$tag.txt"
  adb shell am force-stop $PKG
}
run land320 320 0
run port320 320 1
run land240 240 0
run land480 480 0
adb shell wm density reset; adb shell settings put system user_rotation 0
