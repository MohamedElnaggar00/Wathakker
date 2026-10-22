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
