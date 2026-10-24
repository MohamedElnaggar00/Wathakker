#!/bin/bash
# usage: provider_dump.sh <debug.apk> <outdir>  (no density change; dumps provider metadata on the emulator as-is)
APK=$1; OUT=$2; PKG=com.wathakker.app
mkdir -p "$OUT"; adb wait-for-device; sleep 5
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell wm size > "$OUT/wm.txt"; adb shell wm density >> "$OUT/wm.txt"
FILES=/sdcard/Android/data/$PKG/files
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 6; adb shell am force-stop $PKG
adb shell "rm -rf $FILES/*" 2>/dev/null
adb shell am start -S -W -n $PKG/com.example.HostSelectCheck >/dev/null 2>&1; sleep 15
for f in $(adb shell ls "$FILES" | tr -d '\r'); do adb pull "$FILES/$f" "$OUT/$f" >/dev/null 2>&1; done
