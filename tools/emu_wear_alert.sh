#!/bin/bash
# Dev-only evidence: wear adhan alert style (notification / full-screen).
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

adb shell am start -W -n $PKG/com.wathakker.wear.MainActivity >/dev/null 2>&1; sleep 8
shot 10_main
for i in 1 2 3; do adb shell input swipe 340 227 60 227 300; sleep 2; done
shot 20_settings_root
CUR=settings; dump $CUR
XY=$(findany "نوع التنبيه" "Alert style")
for i in 1 2 3; do
  [ -n "$XY" ] && break
  adb shell input swipe 227 320 227 130 300; sleep 2
  CUR=settings_s$i; dump $CUR
  XY=$(findany "نوع التنبيه" "Alert style")
done
[ -z "$XY" ] && echo "STYLE_ROW_NOT_FOUND" >> "$OUT/SUMMARY.txt"
shot 21_settings_adhan
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
shot 22_style_page
CUR=style; dump $CUR
XY=$(findany "تنبيه إشعار بملء الشاشة" "Full-screen")
[ -n "$XY" ] && adb shell input tap $XY; sleep 2
shot 23_style_fullscreen_chosen
adb shell "cat /data/data/$PKG/shared_prefs/wear_prefs.xml" > "$OUT/wear_prefs.xml" 2>&1

# back to settings root, open pattern list (radio format evidence)
adb shell input keyevent KEYCODE_BACK; sleep 3
CUR=settings3; dump $CUR
XY=$(findany "الزخرفة" "Pattern")
for i in 1 2 3; do
  [ -n "$XY" ] && break
  adb shell input swipe 227 130 227 320 300; sleep 2
  CUR=settings3_s$i; dump $CUR
  XY=$(findany "الزخرفة" "Pattern")
done
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
shot 25_pattern_radio
CUR=pattern; dump $CUR
adb shell input keyevent KEYCODE_BACK; sleep 2

# full-screen style: sleep the screen first so the FSI can launch the activity (real-world condition)
adb shell input keyevent KEYCODE_SLEEP; sleep 3
NOW=$(($(date +%s%N)/1000000))
adb shell am broadcast -n $PKG/com.wathakker.wear.AdhanReceiver --ei id 3 --el at $NOW >/dev/null 2>&1
sleep 8
shot 30_fullscreen_alert
CUR=alert; dump $CUR
if ! grep -q "AdhanActivity" "$OUT/ui_alert.xml" 2>/dev/null; then
  echo "FSI_NO_LAUNCH (screen was off; fallback: forced launch for UI evidence only)" >> "$OUT/SUMMARY.txt"
  adb shell input keyevent KEYCODE_WAKEUP; sleep 2
  adb shell am start -W -n $PKG/com.wathakker.wear.AdhanActivity --ei id 3 --el $NOW >/dev/null 2>&1
  sleep 4
  shot 30b_fullscreen_forced
  CUR=alertf; dump $CUR
fi
adb shell dumpsys notification > "$OUT/notif.txt" 2>&1
adb shell input keyevent KEYCODE_WAKEUP; sleep 2
adb shell input tap 227 227; sleep 2
shot 31_after_dismiss

# switch to notification style, fire again, open the notification stream
adb shell am start -W -n $PKG/com.wathakker.wear.MainActivity >/dev/null 2>&1; sleep 5
for i in 1 2 3; do adb shell input swipe 340 227 60 227 300; sleep 2; done
CUR=settings2; dump $CUR
XY=$(findany "نوع التنبيه" "Alert style")
for i in 1 2 3; do
  [ -n "$XY" ] && break
  adb shell input swipe 227 320 227 130 300; sleep 2
  CUR=settings2_s$i; dump $CUR
  XY=$(findany "نوع التنبيه" "Alert style")
done
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
CUR=style2; dump $CUR
XY=$(findany "تنبيه إشعار بملء الشاشة" "Full-screen")
# tap the notification option (exact)
XY=$(python3 tools/findxy.py "تنبيه إشعار" "$OUT/ui_style2.xml" exact 2>/dev/null)
[ -n "$XY" ] && adb shell input tap $XY; sleep 2
shot 24_style_notification_chosen
NOW=$(($(date +%s%N)/1000000))
adb shell am broadcast -n $PKG/com.wathakker.wear.AdhanReceiver --ei id 3 --el at $NOW >/dev/null 2>&1
sleep 6
shot 40_notification_style_fired
adb shell input keyevent KEYCODE_HOME; sleep 3
adb shell input swipe 227 380 227 80 400; sleep 3
shot 41_notification_stream
adb shell dumpsys notification > "$OUT/notif2.txt" 2>&1
echo DONE > "$OUT/SUMMARY.txt.append"
