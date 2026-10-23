#!/bin/bash
# Installs the PUBLISHED release APK, records its version, then runs the same tablet/settings/widget-config flow. Usage: release_smoke.sh <apk> <outdir>
APK=$1; OUT=$2; mkdir -p "$OUT"
adb install -r -g "$APK" > "$OUT/install0.txt" 2>&1
adb shell dumpsys package com.wathakker.app | grep -E 'versionName|versionCode|debuggable|flags=' | head -5 > "$OUT/pkg.txt"
bash tools/phone_tablet.sh "$APK" "$OUT"
