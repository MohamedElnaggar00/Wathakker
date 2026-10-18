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
adb push "$PWD/tools/widgethost/out/grantbind.dex" /data/local/tmp/grantbind.dex
adb shell 'CLASSPATH=/data/local/tmp/grantbind.dex app_process / GrantBind com.example.widgethost'
{ adb shell cmd role add-role-holder android.app.role.HOME com.example.widgethost
  adb shell cmd package set-home-activity com.example.widgethost/.MainActivity
  adb shell cmd role get-role-holders android.app.role.HOME
  adb shell cmd package resolve-activity --brief -a android.intent.action.MAIN -c android.intent.category.HOME
} > "$OUT/${LABEL}_home_setup.txt" 2>&1
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
grep -E 'WidgetHost|WathakkerHome|WathakkerLock|AndroidRuntime|AppWidget|WidgetPix' "$OUT/${LABEL}_logcat.txt" | tail -140 > "$OUT/${LABEL}_log_summary.txt" || true

# Pixel gate: every widget must have drawn real content (std>5, nonbg>5%) and no
# WathakkerHome failure may appear. This is the check the old verify harness lacked.
FAIL=0
for K in Hero HeroLarge Schedule Clock NextPrayer PrayerBar DayPrayer Pill Hijri Gregorian; do
  L=$(grep "WidgetPix: $K " "$OUT/${LABEL}_logcat.txt" | tail -1)
  if [ -z "$L" ]; then echo "PIXGATE: $K MISSING"; FAIL=1; continue; fi
  STD=$(echo "$L" | sed -n 's/.*std=\([0-9.]*\).*/\1/p')
  NB=$(echo "$L" | sed -n 's/.*nonbg=\([0-9]*\)%.*/\1/p')
  OK=$(python3 -c "print(1 if float('$STD' or 0)>5 and int('$NB' or 0)>5 else 0)" 2>/dev/null)
  if [ "$OK" != "1" ]; then echo "PIXGATE: $K BLANK ($L)"; FAIL=1; else echo "PIXGATE: $K ok (std=$STD nonbg=$NB%)"; fi
done
grep -q 'WathakkerHome: state() failed' "$OUT/${LABEL}_logcat.txt" && { echo "PIXGATE: state() failure logged"; FAIL=1; }
grep -c 'WidgetHost: bind .* -> true' "$OUT/${LABEL}_logcat.txt" | { read N; [ "$N" -lt 10 ] && { echo "PIXGATE: only $N binds true"; FAIL=1; }; }
echo "PIXGATE result: $([ $FAIL = 0 ] && echo PASS || echo FAIL)" | tee "$OUT/${LABEL}_pixgate.txt"
echo "repro done: $OUT"
[ $FAIL = 0 ]
