#!/bin/bash
# Wear OS watch app on a round Wear emulator: screenshot every page.
APK=$1; OUT=$2; PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb shell wm size > "$OUT/wm_size.txt" 2>&1; adb shell wm density >> "$OUT/wm_size.txt" 2>&1
adb shell getprop ro.build.version.release >> "$OUT/wm_size.txt"; adb shell getprop ro.product.model >> "$OUT/wm_size.txt"
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
adb shell date 101918032026.00 >/dev/null 2>&1
adb shell cmd package query-services -a androidx.wear.tiles.action.BIND_TILE_PROVIDER > "$OUT/tile_services.txt" 2>&1
adb shell cmd package query-services -a android.support.wearable.complications.ACTION_COMPLICATION_UPDATE_REQUEST > "$OUT/complication_services.txt" 2>&1
adb shell svc power stayon true; adb shell settings put system screen_off_timeout 1800000
adb shell am start -W -n $PKG/com.wathakker.wear.MainActivity >/dev/null 2>&1; sleep 15
for P in 0 1 2 3 4; do
  adb shell am start -S -W -n $PKG/com.wathakker.wear.MainActivity --ei page $P >/dev/null 2>&1
  sleep 14
  adb exec-out screencap -p > "$OUT/wear_page_$P.png"
done
adb shell am start -S -W -n $PKG/com.wathakker.wear.MainActivity --ez circles true >/dev/null 2>&1
sleep 1; adb exec-out screencap -p > "$OUT/wear_circles_anim_1s.png"
sleep 4; adb exec-out screencap -p > "$OUT/wear_circles_done.png"
adb shell am start -S -W -n $PKG/com.wathakker.wear.MainActivity --ei page 0 >/dev/null 2>&1; sleep 14; adb exec-out screencap -p > "$OUT/wear_page_0_again.png"
adb shell dumpsys activity activities | grep -i "mResumedActivity\|topResumed" > "$OUT/resumed.txt" 2>&1
adb logcat -d | grep -i "wathakker\|AndroidRuntime\|FATAL" | head -80 > "$OUT/logcat.txt" 2>&1
for M in tile ranged short; do
  adb shell am start -S -W -n $PKG/com.wathakker.wear.PreviewActivity --es mode $M >/dev/null 2>&1
  sleep 8; adb exec-out screencap -p > "$OUT/wear_preview_$M.png"
done
adb logcat -d | grep -i "AndroidRuntime\|FATAL EXCEPTION" -A8 | head -60 > "$OUT/logcat_preview.txt" 2>&1
echo done > "$OUT/SUMMARY.txt"
