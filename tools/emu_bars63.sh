#!/bin/bash
# usage: emu_bars63.sh <app.apk> <host.apk> <outdir>
# Every progress-bar widget (home + lock) in Arabic and English: fill must run left to right in both.
APK=$1; HOST=$2; OUT=$3
mkdir -p "$OUT"
adb wait-for-device
adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell input keyevent 82 || true
adb install -r "$HOST"; adb install -g -r "$APK"
adb push "$PWD/tools/widgethost/out/grantbind.dex" /data/local/tmp/grantbind.dex
adb shell 'CLASSPATH=/data/local/tmp/grantbind.dex app_process / GrantBind com.example.widgethost'
adb shell cmd role add-role-holder android.app.role.HOME com.example.widgethost
adb shell cmd package set-home-activity com.example.widgethost/.MainActivity
adb shell am start -n com.wathakker.app/com.example.MainActivity; sleep 8
adb shell am force-stop com.wathakker.app
adb shell cmd uimode night no
UID_=$(adb shell stat -c %u /data/data/com.wathakker.app | tr -d '\r')
for LANG in ar en; do
  adb shell "mkdir -p /data/data/com.wathakker.app/shared_prefs; printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><string name=\\\"language\\\">$LANG</string></map>\" > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; chown $UID_:$UID_ /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; chmod 660 /data/data/com.wathakker.app/shared_prefs/app_prefs.xml; restorecon -R /data/data/com.wathakker.app/shared_prefs"
  adb shell cat /data/data/com.wathakker.app/shared_prefs/app_prefs.xml > "$OUT/prefs_$LANG.txt"
  for G in barsA barsB; do
    adb shell am force-stop com.wathakker.app
    adb shell am force-stop com.example.widgethost
    adb shell am start -W -n com.example.widgethost/.MainActivity --es mode $G
    sleep 14
    adb exec-out screencap -p > "$OUT/${LANG}_${G}.png"
  done
done
adb logcat -d -v threadtime | grep -E 'WidgetHost|WathakkerHome|WathakkerLock|AndroidRuntime|WidgetPix' | tail -80 > "$OUT/log_summary.txt"
