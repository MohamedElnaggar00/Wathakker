#!/bin/bash
# repro: "Test the alarm now" then ignore -> does a real snooze fire later with notification + full screen?
NEW=$2; OUT=$3; P=com.wathakker.app
mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell settings put global hide_error_dialogs 1
adb shell input keyevent 82
snap(){ { echo "== $1 $(adb shell date)"; adb shell dumpsys alarm | grep -A6 "$P" | grep -i "tag=\|origWhen=" | head -20; echo "-- notifs"; adb shell dumpsys notification --noredact | grep -E "pkg=$P|android.title|android.text|fullScreenIntent|timeout" | head -12; echo "-- top"; adb shell dumpsys activity activities | grep -i "topResumedActivity" | head -2; } >> "$OUT/alarms.txt" 2>&1; }
adb install -g -r "$NEW" >/dev/null 2>&1
adb shell pm grant $P android.permission.POST_NOTIFICATIONS
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 5; adb shell am force-stop $P
UIDN=$(adb shell stat -c %u /data/data/$P | tr -d '\r')
adb shell "printf '%s' \"<?xml version='1.0' encoding='utf-8' standalone='yes' ?><map><boolean name=\\\"is_alarm_enabled\\\" value=\\\"true\\\" /><int name=\\\"snooze_minutes\\\" value=\\\"5\\\" /></map>\" > /data/data/$P/shared_prefs/fajr_prefs.xml; chown $UIDN:$UIDN /data/data/$P/shared_prefs/fajr_prefs.xml; chmod 660 /data/data/$P/shared_prefs/fajr_prefs.xml; restorecon /data/data/$P/shared_prefs/fajr_prefs.xml"
adb shell cmd appops set $P SCHEDULE_EXACT_ALARM allow
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 5
snap "A: before test"
adb shell am start -n $P/com.example.fajr.ui.FajrAlarmActivity >/dev/null   # same as the Test button
sleep 5; snap "B: test screen open"
adb exec-out screencap -p > "$OUT/b_test_screen.png"
sleep 62; snap "C: after 62s untouched (auto-stop)"
adb exec-out screencap -p > "$OUT/c_after_autostop.png"
adb shell cat /data/data/$P/shared_prefs/fajr_prefs.xml > "$OUT/fajr_prefs_C.xml"
adb shell input keyevent 3
sleep 250; snap "D: ~5min after"
adb exec-out screencap -p > "$OUT/d_5min.png"
sleep 70; snap "E: ~6min after"
adb exec-out screencap -p > "$OUT/e_6min.png"
adb shell cmd statusbar expand-notifications; sleep 2; adb exec-out screencap -p > "$OUT/f_shade.png"
echo done > "$OUT/done.txt"
