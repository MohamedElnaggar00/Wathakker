#!/bin/bash
# branch-only: render NarrowSheetCheck on the emulator. Usage: narrow_sheet.sh <apk> <outdir>
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 3
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8; adb shell am force-stop $PKG
F=/sdcard/Android/data/$PKG/files; adb shell "rm -rf $F/*" 2>/dev/null
adb shell am start -S -W -n $PKG/com.example.NarrowSheetCheck >/dev/null 2>&1; sleep 15
adb shell wm size > "$OUT/wm.txt"; adb shell wm density >> "$OUT/wm.txt"
for f in $(adb shell ls $F | tr -d '\r'); do adb pull $F/$f "$OUT/$f" >/dev/null 2>&1; done
