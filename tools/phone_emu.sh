#!/bin/bash
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 15
adb exec-out screencap -p > "$OUT/app_start.png"
for S in 0 1 2; do adb shell am start -S -W -n $PKG/com.example.PatternRenderCheck --ei s $S >/dev/null 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/widget_s$S.png"; done
adb shell am start -S -W -n $PKG/com.example.widget.WidgetConfigActivity --ei appWidgetId 9001 >/dev/null 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/config.png"
adb shell input swipe 540 1900 540 500 300; sleep 2; adb exec-out screencap -p > "$OUT/config_scrolled.png"
adb logcat -d | grep -i "AndroidRuntime\|WathakkerHome\|FATAL" | head -20 > "$OUT/errors.txt"
adb shell am start -S -W -n $PKG/com.example.ColorRenderCheck >/dev/null 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/widget_colors.png"
adb logcat -d | grep ColorCheck > "$OUT/color_check.txt"
adb shell am start -S -W -n $PKG/com.example.widget.WidgetConfigActivity --ei appWidgetId 9301 --ez debugOneUi true >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/config_oneui.png"
adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$OUT/ui_oneui.xml" >/dev/null 2>&1
tap_text(){ B=$(grep -o "text=\"$1\"[^>]*" "$2" | grep -o 'bounds="[^"]*"' | head -1); echo "$B" | sed -n 's/bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]"/\1 \2 \3 \4/p' | awk '{print int(($1+$3)/2), int(($2+$4)/2)}'; }
XY=$(tap_text "بدون" "$OUT/ui_oneui.xml"); echo "none chip: $XY" >> "$OUT/color_check.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 2
adb exec-out screencap -p > "$OUT/config_oneui_selected.png"
adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$OUT/ui_oneui2.xml" >/dev/null 2>&1
XY=$(tap_text "تطبيق" "$OUT/ui_oneui2.xml"); echo "apply btn: $XY" >> "$OUT/color_check.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
adb shell "cat /data/data/com.wathakker.app/shared_prefs/fajr_prefs.xml" > "$OUT/prefs_oneui.xml" 2>&1
adb shell am start -S -W -n $PKG/com.example.PatternRenderCheck --ei s 3 >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/widget_oneui_applied.png"
adb shell am start -S -W -n $PKG/com.example.PatternScopeCheck >/dev/null 2>&1; sleep 10; adb exec-out screencap -p > "$OUT/pattern_scope.png"
adb logcat -d | grep PatternScope > "$OUT/pattern_scope.txt"
# 3.3.3 accent themes: the OneUI widget in yellow/turquoise/blue/green, dark then light.
adb shell cmd uimode night yes
adb shell am start -S -W -n $PKG/com.example.OneUIColorCheck >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/widget_accent_night.png"
adb shell cmd uimode night no
adb shell am start -S -W -n $PKG/com.example.OneUIColorCheck >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/widget_accent_day.png"
adb shell cmd uimode night yes

# 3.3.3 in-app UI evidence in Arabic RTL: collapsing headers, gear audit, About rows,
# segmented controls (with a screen recording of the indicator slide).
# No locale/zygote restart needed (it killed the emulator in one run): the app is# Arabic RTL on its own (app_prefs language defaults to "ar"). Fresh install lands on
# onboarding; skip it + the permission flow deterministically, so the navigation
# evidence starts on the main tabs. Every section relaunches with am start -S
# (force-stop + cold start lands on the main tabs), so no back-stack assumptions.
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8
adb shell am force-stop $PKG
adb shell "cat /data/data/com.wathakker.app/shared_prefs/app_prefs.xml 2>/dev/null || echo MISSING" > "$OUT/app_prefs_before.xml"
adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml"
adb shell "cat /data/data/com.wathakker.app/shared_prefs/app_prefs.xml" > "$OUT/app_prefs_after.xml"
tap_desc(){ B=$(grep -o "content-desc=\"$1\"[^>]*" "$2" | grep -o 'bounds="[^"]*"' | head -1); echo "$B" | sed -n 's/bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]"/\1 \2 \3 \4/p' | awk '{print int(($1+$3)/2), int(($2+$4)/2)}'; }
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$1" >/dev/null 2>&1; }
dismiss_anr(){ for i in 1 2 3 4; do adb shell uiautomator dump /sdcard/ui_anr.xml >/dev/null 2>&1; adb pull /sdcard/ui_anr.xml "$OUT/ui_anr.xml" >/dev/null 2>&1; if grep -q "responding" "$OUT/ui_anr.xml" 2>/dev/null; then XY=$(tap_text "Wait" "$OUT/ui_anr.xml"); if [ -n "$XY" ]; then adb shell input tap $XY; else adb shell input keyevent 4; fi; sleep 4; else return; fi; done; echo "ANR persists after Wait taps - rebooting emulator" >> "$OUT/ui_nav.txt"; adb reboot >/dev/null 2>&1; adb wait-for-device; sleep 40; adb shell svc power stayon true; }
relaunch(){ adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 14; dismiss_anr; sleep 2; }
open_settings(){ relaunch; dump "$OUT/ui_navx.xml"; XY=$(tap_desc "الإعدادات" "$OUT/ui_navx.xml"); echo "gear: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; dismiss_anr; }

relaunch
adb exec-out screencap -p > "$OUT/ar_tabs.png"
dump "$OUT/ui_tabs.xml"
# Settings page (gear only on top-level; sub-page shows back only)
open_settings
adb exec-out screencap -p > "$OUT/ar_settings.png"
dump "$OUT/ui_settings.xml"
adb shell input swipe 540 1500 540 1300 300; sleep 1
adb exec-out screencap -p > "$OUT/ar_settings_mid.png"
adb shell input swipe 540 1700 540 600 350; sleep 2
adb shell input swipe 540 1700 540 600 350; sleep 2
adb exec-out screencap -p > "$OUT/ar_settings_scrolled.png"
dump "$OUT/ui_settings2.xml"
# About page: rest, mid-scroll, collapsed
for i in 1 2 3; do XY=$(tap_text "حول التطبيق" "$OUT/ui_settings2.xml"); [ -n "$XY" ] && break; adb shell input swipe 540 1700 540 600 350; sleep 2; dump "$OUT/ui_settings2.xml"; done
echo "about row: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; dismiss_anr
adb exec-out screencap -p > "$OUT/ar_about_rest.png"
dump "$OUT/ui_about.xml"
adb shell input swipe 540 1500 540 1200 250; sleep 1
adb exec-out screencap -p > "$OUT/ar_about_mid.png"
adb shell input swipe 540 1700 540 500 350; sleep 2
adb exec-out screencap -p > "$OUT/ar_about_collapsed.png"
# Watch settings page: rest, mid-scroll, collapsed
open_settings
adb shell input swipe 540 1700 540 600 350; sleep 2
adb shell input swipe 540 1700 540 600 350; sleep 2
dump "$OUT/ui_settings3.xml"
XY=$(tap_text "إعدادات الساعة الذكية" "$OUT/ui_settings3.xml"); echo "watch row: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; dismiss_anr
adb exec-out screencap -p > "$OUT/ar_watch_rest.png"
dump "$OUT/ui_watch.xml"
adb shell input swipe 540 1500 540 1100 250; sleep 1
adb exec-out screencap -p > "$OUT/ar_watch_mid.png"
adb shell input swipe 540 1700 540 500 350; sleep 2
adb exec-out screencap -p > "$OUT/ar_watch_collapsed.png"
# Calendar tab: segmented control + slide recording
relaunch
dump "$OUT/ui_home.xml"
XY=$(tap_text "التقويم" "$OUT/ui_home.xml"); echo "cal tab: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; dismiss_anr
adb exec-out screencap -p > "$OUT/ar_calendar.png"
dump "$OUT/ui_cal.xml"
adb shell settings put global animator_duration_scale 8.0
adb shell screenrecord --time-limit 10 /sdcard/slide.mp4 & REC=$!
sleep 1
XY=$(tap_text "المناسبات" "$OUT/ui_cal.xml"); echo "events seg: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4
XY=$(tap_text "التقويم" "$OUT/ui_cal.xml"); echo "cal seg back: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4
wait $REC 2>/dev/null
adb shell settings put global animator_duration_scale 1.0
sleep 1
XY=$(tap_text "المناسبات" "$OUT/ui_cal.xml"); [ -n "$XY" ] && adb shell input tap $XY; sleep 2
adb exec-out screencap -p > "$OUT/ar_calendar_events.png"
adb pull /sdcard/slide.mp4 "$OUT/slide.mp4" >/dev/null 2>&1
if command -v ffmpeg >/dev/null 2>&1 && [ -f "$OUT/slide.mp4" ]; then
  for i in 0 1 2 3 4 5; do ffmpeg -loglevel error -ss $(awk "BEGIN{print 1.0 + $i * 0.35}") -i "$OUT/slide.mp4" -frames:v 1 "$OUT/slide_f$i.png" -y; done
fi
# Settings: numbers-type segmented control (toggle to the other option)
open_settings
adb shell input swipe 540 1700 540 600 350; sleep 2
dump "$OUT/ui_set5.xml"
XY=$(tap_text "أرقام عربية  1234" "$OUT/ui_set5.xml"); echo "digits seg: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
adb exec-out screencap -p > "$OUT/ar_digits_toggled.png"
