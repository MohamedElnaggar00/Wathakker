#!/bin/bash
# alarm repro: install released 3.3.0, enable Fajr alarm, clock 23:20 Cairo, update to 3.3.1, observe alarms
OLD=$1; NEW=$2; OUT=$3; P=com.wathakker.app
mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell settings put global hide_error_dialogs 1
adb shell settings put global auto_time 0; adb shell settings put global auto_time_zone 0
adb shell service call alarm 3 s16 Africa/Cairo >/dev/null
adb shell setprop persist.sys.timezone Africa/Cairo
sleep 1
adb shell date -u 102020202026.00 >/dev/null
sleep 2
{ echo "== clock/tz"; adb shell date; adb shell getprop persist.sys.timezone; } > "$OUT/clock.txt" 2>&1
snap(){ { echo "== $1 $(adb shell date)"; adb shell dumpsys alarm | grep -B1 -A4 "$P" | head -80; echo "-- notifs"; adb shell dumpsys notification --noredact | grep -A6 "pkg=$P" | grep -i "pkg=\|title\|text=\|when" | head -20; echo "-- top"; adb shell dumpsys activity activities | grep -i "topResumedActivity\|mResumedActivity" | head -3; } >> "$OUT/alarms.txt" 2>&1; }
adb install -g -r "$OLD" >/dev/null 2>&1
adb shell pm grant $P android.permission.POST_NOTIFICATIONS
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 5; adb shell am force-stop $P
UIDN=$(adb shell stat -c %u /data/data/$P | tr -d '\r')
adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><boolean name=\\\"is_alarm_enabled\\\" value=\\\"true\\\" /></map>\" > /data/data/$P/shared_prefs/fajr_prefs.xml; chown $UIDN:$UIDN /data/data/$P/shared_prefs/fajr_prefs.xml; chmod 660 /data/data/$P/shared_prefs/fajr_prefs.xml; restorecon /data/data/$P/shared_prefs/fajr_prefs.xml"
adb shell cmd appops set $P SCHEDULE_EXACT_ALARM allow
adb logcat -c
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 5
adb shell am broadcast -a android.intent.action.BOOT_COMPLETED -n $P/com.example.receiver.BootReceiver >/dev/null; sleep 3
snap "A: 3.3.0 after boot-reschedule"
adb shell cat /data/data/$P/shared_prefs/fajr_prefs.xml > "$OUT/fajr_prefs_A.xml"
adb shell am force-stop $P
adb install -g -r "$NEW" > "$OUT/install_new.txt" 2>&1; sleep 8
snap "B: right after update to 3.3.1"
adb shell cat /data/data/$P/shared_prefs/fajr_prefs.xml > "$OUT/fajr_prefs_B.xml"
sleep 20; snap "C: +30s"
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6; snap "D: after opening 3.3.1"
adb shell date -u 102020203726.00 >/dev/null; sleep 5; snap "E: clock moved to 23:37 Cairo"
sleep 60; snap "F: +60s"
adb exec-out screencap -p > "$OUT/screen_final.png"
adb logcat -d -v time | grep -i "fajr\|alarm\|wathakker\|AlarmManager" | tail -150 > "$OUT/logcat.txt"
echo done > "$OUT/done.txt"
