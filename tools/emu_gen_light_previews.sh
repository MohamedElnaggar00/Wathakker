#!/bin/bash
# Render light-theme home-widget previews via WidgetRenderCheck on the emulator and
# pull them out. Usage: emu_gen_light_previews.sh <app.apk> <outdir>
# Forensics are always written into <outdir> so failures can be diagnosed from the repo.
set -uo pipefail
APK=$1; GEN=$2
RAW_EXT=/data/media/0/Android/data/com.wathakker.app/files
RAW_INT=/data/user/0/com.wathakker.app/files/rendercheck
mkdir -p "$GEN"
adb wait-for-device; adb shell 'while [ "$(getprop sys.boot_completed)" != 1 ]; do sleep 2; done'; sleep 5
adb install -r "$APK" > "$GEN/install.txt" 2>&1 || true
adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck > "$GEN/launch.txt" 2>&1 || true
sleep 2
adb shell pidof com.wathakker.app > "$GEN/pidof.txt" 2>&1 || true
adb root > "$GEN/adbroot.txt" 2>&1 || true
sleep 3
adb wait-for-device
for i in $(seq 1 40); do
  RAW=$RAW_EXT
  adb shell "[ -d $RAW_EXT ]" || RAW=$RAW_INT
  N=$(adb shell "ls $RAW/ 2>/dev/null | grep -c '^preview_light_.*\.png$'" | tr -d '\r')
  E=$(adb shell "ls $RAW/ 2>/dev/null | grep -c '^preview_light_.*\.err$'" | tr -d '\r')
  echo "poll $i: png=${N:-0} err=${E:-0}"
  [ "${N:-0}" -ge 10 ] && break
  [ "${E:-0}" -gt 0 ] && [ $(( ${N:-0} + ${E:-0} )) -ge 10 ] && break
  sleep 3
done
{
  echo "== ls /data/media/0/Android/data/:"; adb shell "ls /data/media/0/Android/data/ | head -40"
  echo "== ls pkg dir:"; adb shell "ls -la /data/media/0/Android/data/com.wathakker.app/ 2>&1"
  echo "== ls ext files dir:"; adb shell "ls -la $RAW_EXT/ 2>&1"
  echo "== ls int rendercheck dir:"; adb shell "ls -la $RAW_INT/ 2>&1"
  echo "== shell view /sdcard:"; adb shell "ls /sdcard/Android/data/com.wathakker.app/ 2>&1"
} > "$GEN/dirs.txt" 2>&1
adb logcat -d | grep -iE 'rendercheck|AndroidRuntime|FATAL|wathakker' | tail -120 > "$GEN/logcat.txt" 2>&1 || true
RAW=$RAW_EXT; adb shell "[ -d $RAW_EXT ]" || RAW=$RAW_INT
echo "pulling from $RAW" > "$GEN/pull.txt"
# pull + integrity-verify; re-pull if any PNG was caught mid-write
for try in 1 2 3 4 5; do
  sleep 4
  rm -rf "$GEN/files"
  adb pull "$RAW/" "$GEN/files" >> "$GEN/pull.txt" 2>&1 || true
  BAD=$(python3 - "$GEN/files" <<'PYEOF'
import sys, glob
from PIL import Image
bad = 0
for f in glob.glob(sys.argv[1] + '/preview_light_*.png'):
    try:
        im = Image.open(f); im.load()
    except Exception as e:
        print('TRUNCATED', f, e); bad += 1
print('bad=%d' % bad)
PYEOF
)
  echo "pull try $try: $BAD" | tee -a "$GEN/pull.txt"
  echo "$BAD" | grep -q 'bad=0' && break
done
ls -la "$GEN/files" >> "$GEN/pull.txt" 2>&1 || true
NPNG=$(ls "$GEN"/files/preview_light_*.png 2>/dev/null | wc -l)
NERR=$(ls "$GEN"/files/preview_light_*.err 2>/dev/null | wc -l)
echo "light renders: $NPNG, errors: $NERR"
echo "png=$NPNG err=$NERR" > "$GEN/result.txt"
exit 0
