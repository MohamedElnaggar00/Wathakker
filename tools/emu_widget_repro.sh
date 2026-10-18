#!/bin/bash
# Live-widget repro: installs the APK under test, binds all 10 home widgets to a real
# AppWidgetHost (home-role holder), screenshots light+dark, dumps logcat + appwidget state.
# Usage: emu_widget_repro.sh <app.apk> <host.apk> <outdir> <label>
set -uo pipefail
APK=$1; HOST=$2; OUT=$3; LABEL=$4
mkdir -p "$OUT"
adb wait-for-device
adb shell input keyevent 82 || true
adb install -r "$HOST"
adb install -r "$APK"
adb shell cmd role add-role-holder android.app.role.HOME com.example.widgethost
adb logcat -c
for MODE in no yes; do
  adb shell cmd uimode night $MODE
  sleep 2
  adb shell am force-stop com.example.widgethost
  adb shell am start -W -n com.example.widgethost/.MainActivity
  sleep 10
  adb exec-out screencap -p > "$OUT/${LABEL}_night_${MODE}.png"
done
adb logcat -d -v threadtime > "$OUT/${LABEL}_logcat.txt"
adb shell dumpsys appwidget > "$OUT/${LABEL}_appwidget.txt"
grep -E 'WidgetHost|WathakkerHome|WathakkerLock|AndroidRuntime|AppWidget' "$OUT/${LABEL}_logcat.txt" | tail -100 > "$OUT/${LABEL}_log_summary.txt" || true
echo "repro done: $OUT"
