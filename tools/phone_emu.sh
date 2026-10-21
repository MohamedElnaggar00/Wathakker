#!/bin/bash
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 15
adb exec-out screencap -p > "$OUT/app_start.png"
for S in 0 1 2; do adb shell am start -S -W -n $PKG/com.example.WidgetRenderCheck --ei s $S >/dev/null 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/widget_s$S.png"; done
adb shell am start -S -W -n $PKG/com.example.widget.WidgetConfigActivity --ei appWidgetId 9001 >/dev/null 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/config.png"
adb logcat -d | grep -i "AndroidRuntime\|WathakkerHome\|FATAL" | head -20 > "$OUT/errors.txt"
