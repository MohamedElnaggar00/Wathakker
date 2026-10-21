#!/bin/bash
# Dev-only evidence: wear 1.1.0 UX review fixes (tile redesign, settings sections + open-at-top,
# About section, sub-page enter animation, switch/radio animation frames, animated page dots).
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"
adb wait-for-device
adb root >/dev/null 2>&1; sleep 3; adb wait-for-device
ROOTED=$(adb shell id 2>/dev/null | grep -c "uid=0")
if [ "$ROOTED" = "1" ]; then
  adb shell "setprop persist.sys.locale ar-EG; setprop ctl.restart zygote" >/dev/null 2>&1
  sleep 5; adb wait-for-device
  for i in $(seq 1 40); do B=$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r'); [ "$B" = "1" ] && break; sleep 2; done
  sleep 10
fi
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
shot(){ adb exec-out screencap -p > "$OUT/$1.png"; }
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$OUT/ui_$1.xml" >/dev/null 2>&1; }
CUR=""
findany(){ for N in "$@"; do X=$(python3 tools/findxy.py "$N" "$OUT/ui_$CUR.xml" 2>/dev/null); [ -n "$X" ] && { echo "$X"; return 0; }; done; return 1; }
frames(){ # $1 = mp4 stem
  if [ -s "$OUT/$1.mp4" ] && command -v ffmpeg >/dev/null 2>&1; then
    ffmpeg -y -loglevel error -i "$OUT/$1.mp4" -vf fps=8 "$OUT/$1_%02d.png"
  fi
}

# 1) settings opens at the TOP (title visible), sections regrouped
adb shell am start -W -n $PKG/com.wathakker.wear.MainActivity --ei page 3 >/dev/null 2>&1; sleep 7
shot 70_settings_root
CUR=root; dump $CUR

# 2) scroll to the About section at the end
for i in 1 2 3 4 5 6 7 8; do adb shell input swipe 227 340 227 90 300; sleep 1; done
shot 71_settings_bottom
CUR=bottom; dump $CUR

# 3) sub-page ENTER animation: record while tapping "نوع الخط" (font style row)
adb shell am start -S -W -n $PKG/com.wathakker.wear.MainActivity --ei page 3 >/dev/null 2>&1; sleep 8
CUR=root2; dump $CUR
XY=$(findany "نوع الخط" "Font style")
for i in 1 2 3 4; do
  [ -n "$XY" ] && break
  sleep 2; CUR=root2_s$i; dump $CUR   # retry on the same screen first (uiautomator can flake)
  XY=$(findany "نوع الخط" "Font style")
  [ -n "$XY" ] && break
  adb shell input swipe 227 280 227 180 400; sleep 2
  CUR=root2_sc$i; dump $CUR
  XY=$(findany "نوع الخط" "Font style")
done
if [ -n "$XY" ]; then
  adb shell "screenrecord --time-limit 4 /sdcard/enter.mp4" >/dev/null 2>&1 &
  REC=$!
  sleep 1
  adb shell input tap $XY
  wait $REC
  adb pull /sdcard/enter.mp4 "$OUT/enter.mp4" >/dev/null 2>&1
  frames enter
else
  echo "FONT_ROW_NOT_FOUND" >> "$OUT/SUMMARY.txt"
fi
sleep 1
shot 73_font_style_open

# 4) return path (KEYCODE_BACK plays the animated reverse), then the switch animation
adb shell "screenrecord --time-limit 3 /sdcard/back.mp4" >/dev/null 2>&1 &
REC=$!
adb shell input keyevent KEYCODE_BACK
wait $REC
adb pull /sdcard/back.mp4 "$OUT/back.mp4" >/dev/null 2>&1
frames back
sleep 2
CUR=root3; dump $CUR
XY=$(findany "تنبيه الأذان" "Adhan alert")
for i in 1 2 3; do
  [ -n "$XY" ] && break
  adb shell input swipe 227 320 227 130 300; sleep 2
  CUR=root3_s$i; dump $CUR
  XY=$(findany "تنبيه الأذان" "Adhan alert")
done
if [ -n "$XY" ]; then
  adb shell "screenrecord --time-limit 3 /sdcard/switch.mp4" >/dev/null 2>&1 &
  REC=$!
  sleep 1
  adb shell input tap $XY
  wait $REC
  adb pull /sdcard/switch.mp4 "$OUT/switch.mp4" >/dev/null 2>&1
  frames switch
  sleep 1
  shot 74_switch_toggled
  # toggle back to the original state
  adb shell input tap $XY; sleep 1
else
  echo "ADHAN_ROW_NOT_FOUND" >> "$OUT/SUMMARY.txt"
fi

# 5) radio animation: open the pattern list, record, pick a different pattern
adb shell am start -S -W -n $PKG/com.wathakker.wear.MainActivity --ei page 3 --ei sub 1 >/dev/null 2>&1; sleep 8
CUR=pat; dump $CUR
XY=$(findany "نجوم ومعينات" "Stars and diamonds")
if [ -n "$XY" ]; then
  adb shell "screenrecord --time-limit 3 /sdcard/radio.mp4" >/dev/null 2>&1 &
  REC=$!
  sleep 1
  adb shell input tap $XY
  wait $REC
  adb pull /sdcard/radio.mp4 "$OUT/radio.mp4" >/dev/null 2>&1
  frames radio
  sleep 1
  shot 75_radio_picked
fi
adb shell input keyevent KEYCODE_BACK; sleep 2
# restore the default pattern (id 1) in prefs if it changed
adb root >/dev/null 2>&1; sleep 2
adb shell "run-as $PKG true 2>/dev/null; sed -i 's|<int name=\"pat\" value=\"[0-9]*\" />|<int name=\"pat\" value=\"1\" />|' /data/data/$PKG/shared_prefs/wear_prefs.xml 2>/dev/null" 2>/dev/null

# 6) tile captures under en-US locale (the bundled TileRenderer mirrors arcs under RTL; the real
#    watch does not - same evidence convention as before). Tile text stays Arabic (app strings).
adb shell "setprop persist.sys.locale en-US; setprop ctl.restart zygote" >/dev/null 2>&1
adb wait-for-device; adb shell 'while [ -z "$(getprop sys.boot_completed)" ]; do sleep 2; done'; sleep 20
adb root >/dev/null 2>&1; sleep 3; adb wait-for-device
adb shell am force-stop $PKG
adb shell am start -W -n $PKG/com.wathakker.wear.PreviewActivity --es mode tile >/dev/null 2>&1
sleep 6
shot 50b_tile_normal
adb shell am force-stop $PKG
adb shell am start -W -n $PKG/com.wathakker.wear.PreviewActivity --es mode tile --ez iqama_demo true >/dev/null 2>&1
sleep 6
shot 50_iqama_tile
echo DONE > "$OUT/SUMMARY.txt.append"
