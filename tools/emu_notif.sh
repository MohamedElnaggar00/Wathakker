#!/bin/bash
# usage: emu_notif.sh <apk> <outdir>  (notification check only, never publishes)
APK=$1; OUT=$2; P=com.wathakker.app
mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
L="$OUT/log.txt"; say(){ echo "[$(date +%T)] $*" | tee -a "$L"; }
shot(){ timeout 30 adb exec-out screencap -p > "$OUT/$1.png"; say "shot $1 $(stat -c %s "$OUT/$1.png")"; }
dump(){ adb shell dumpsys notification --noredact | grep -E "pkg=$P|id=4|timeout|when=" | head -40 > "$OUT/$1.txt"; say "dump $1 lines=$(wc -l < "$OUT/$1.txt")"; cat "$OUT/$1.txt" | tee -a "$L"; }
adb shell input keyevent 82
adb install -g -r "$APK" 2>&1 | tee -a "$L"
adb shell pm grant $P android.permission.POST_NOTIFICATIONS
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 8
adb shell am force-stop $P
UIDN=$(adb shell stat -c %u /data/data/$P | tr -d '\r')
adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><boolean name=\\\"enabled_3\\\" value=\\\"true\\\" /><boolean name=\\\"migrated_v1\\\" value=\\\"true\\\" /></map>\" > /data/data/$P/shared_prefs/prayer_alerts.xml; chown $UIDN:$UIDN /data/data/$P/shared_prefs/prayer_alerts.xml; chmod 660 /data/data/$P/shared_prefs/prayer_alerts.xml; restorecon /data/data/$P/shared_prefs/prayer_alerts.xml"
NOWMS=$(( $(adb shell date +%s | tr -d '\r') * 1000 + 40000 ))
say "early broadcast, prayer_at=$NOWMS"
adb shell am broadcast -n $P/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 3 --ei alert_kind 3 --el prayer_at $NOWMS 2>&1 | tee -a "$L"
sleep 4
dump notif_early_present
adb shell cmd statusbar expand-notifications; sleep 2; shot notif_early_countdown
adb shell cmd statusbar collapse
sleep 40
dump notif_early_after_adhan_time
say "adhan broadcast"
adb shell am broadcast -n $P/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 3 --ei alert_kind 0 2>&1 | tee -a "$L"
sleep 5
dump notif_t0_adhan_replaced_early
adb shell cmd statusbar expand-notifications; sleep 2; shot notif_shade_t0
adb shell cmd statusbar collapse
say "iqama broadcast"
adb shell am broadcast -n $P/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 3 --ei alert_kind 1 2>&1 | tee -a "$L"
sleep 4
dump notif_t0_iqama
sleep 260
dump notif_t4_5
sleep 70
dump notif_t5_6
adb shell cmd statusbar expand-notifications; sleep 2; shot notif_shade_t5_6
say done
