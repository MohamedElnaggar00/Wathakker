#!/bin/bash
# Render light-theme home-widget previews via WidgetRenderCheck on the emulator and
# pull them out. Usage: emu_gen_light_previews.sh <app.apk> <outdir>
set -uo pipefail
APK=$1; GEN=$2
mkdir -p "$GEN"
adb wait-for-device; adb shell 'while [ "$(getprop sys.boot_completed)" != 1 ]; do sleep 2; done'; sleep 5
adb install -r "$APK" || exit 1
adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck || true
adb root || true
sleep 3
adb wait-for-device
for i in $(seq 1 40); do
  N=$(adb shell 'ls /sdcard/Android/data/com.wathakker.app/files/ 2>/dev/null | grep -c "^preview_light_.*\.png$"' | tr -d '\r')
  E=$(adb shell 'ls /sdcard/Android/data/com.wathakker.app/files/ 2>/dev/null | grep -c "^preview_light_.*\.err$"' | tr -d '\r')
  echo "poll $i: png=${N:-0} err=${E:-0}"
  [ "${N:-0}" -ge 10 ] && break
  [ "${E:-0}" -gt 0 ] && [ $(( ${N:-0} + ${E:-0} )) -ge 10 ] && break
  sleep 3
done
adb pull /sdcard/Android/data/com.wathakker.app/files/ "$GEN/files" || { echo "PULL FAILED"; exit 1; }
ls -la "$GEN/files"
NPNG=$(ls "$GEN"/files/preview_light_*.png 2>/dev/null | wc -l)
NERR=$(ls "$GEN"/files/preview_light_*.err 2>/dev/null | wc -l)
echo "light renders: $NPNG, errors: $NERR"
[ "$NERR" = 0 ] && [ "$NPNG" = 10 ] || { echo "GATE FAIL"; cat "$GEN"/files/preview_light_*.err 2>/dev/null; exit 1; }
