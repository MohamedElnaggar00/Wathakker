#!/bin/bash
# 3.3.0: smartwatch settings entry and page, light and dark.
APK=$1;OUT=$2;PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r "$APK" >/dev/null 2>&1
adb shell pm grant $PKG android.permission.POST_NOTIFICATIONS >/dev/null 2>&1
adb shell appops set $PKG SCHEDULE_EXACT_ALARM allow >/dev/null 2>&1
adb shell appops set $PKG USE_FULL_SCREEN_INTENT allow >/dev/null 2>&1
adb shell settings put global auto_time 0
dumpui(){ for i in 1 2 3 4 5; do rm -f /tmp/uw.xml; adb shell rm -f /sdcard/u.xml; adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/uw.xml >/dev/null 2>&1; [ -s /tmp/uw.xml ] && return; sleep 2; done; echo "dump failed" >> "$OUT/SUMMARY.txt"; : > /tmp/uw.xml; }
tapdesc(){ dumpui
 XY=$(python3 - "$1" $2 <<'PY'
import re,sys
x=open('/tmp/uw.xml',encoding='utf-8').read()
last=None
for n in re.finditer(r'<node [^>]*>',x):
    t=n.group(0)
    d=re.search(r' content-desc="([^"]*)"',t); tx=re.search(r' text="([^"]*)"',t); b=re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',t)
    if b and ((d and d.group(1)==sys.argv[1]) or (tx and tx.group(1)==sys.argv[1])):
        r=((int(b.group(1))+int(b.group(3)))//2,(int(b.group(2))+int(b.group(4)))//2)
        if len(sys.argv)<3: print(*r); last=None; break
        last=r
if last: print(*last)
PY
)
 echo "tap $1: $XY" >> "$OUT/SUMMARY.txt"; [ -n "$XY" ] && adb shell input tap $XY; }
for M in no yes; do
 adb shell cmd uimode night $M; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 tapdesc "الإعدادات"; sleep 3
 adb shell input swipe 540 1700 540 700 500; sleep 2
 adb exec-out screencap -p > "$OUT/settings_list_$M.png"
 tapdesc "إعدادات الساعة الذكية"; sleep 3
 adb exec-out screencap -p > "$OUT/watch_settings_$M.png"
 tapdesc "نظام 24 ساعة"; sleep 2
 adb exec-out screencap -p > "$OUT/watch_settings_24h_$M.png"
done
# side drawer over the prayer sky, light and dark
for M in no yes; do
 adb shell cmd uimode night $M; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 dumpui
 XY=$(python3 - <<'PY'
import re
x=open('/tmp/uw.xml',encoding='utf-8').read()
for m in re.finditer(r'content-desc="([^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    if m.group(1) in ('القائمة','Menu'):
        print((int(m.group(2))+int(m.group(4)))//2,(int(m.group(3))+int(m.group(5)))//2); break
PY
)
 echo "menu tap: $XY" >> "$OUT/SUMMARY.txt"
 [ -n "$XY" ] && adb shell input tap $XY; sleep 3
 adb exec-out screencap -p > "$OUT/drawer_$M.png"
done
# Hisn page: search icon next to the gear
for M in no yes; do
 adb shell cmd uimode night $M; adb shell am force-stop $PKG
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 tapdesc "حصن المسلم"; sleep 3
 adb exec-out screencap -p > "$OUT/hisn_$M.png"
 adb shell input tap 540 1000; sleep 3; adb exec-out screencap -p > "$OUT/hisn_chapter_$M.png"; tapdesc "عداد الذكر"; sleep 1; adb exec-out screencap -p > "$OUT/hisn_done_$M.png"; tapdesc "معلومات الذكر" last; sleep 2; adb exec-out screencap -p > "$OUT/hisn_notes_$M.png"; adb shell input keyevent 4; sleep 2
 tapdesc "ابحث في حصن المسلم" last; sleep 2
 adb shell input text "wudu"; sleep 1
 adb exec-out screencap -p > "$OUT/hisn_search_$M.png"
done
adb shell cmd uimode night no
# Notification channels: global tone/vibration, per-prayer override, revert
chans(){ adb shell dumpsys notification --noredact 2>/dev/null | grep -o "NotificationChannel{mId='[^']*'[^}]*}" | grep -E "dhikr_channel|prayer_alerts_channel|iqama_reminders_channel" | grep -oE "mId='[^']*'|mImportance=[0-9]+|mSound=[^,]*|mVibrationEnabled=[a-z]+|mDeleted=[a-z]+" | paste -sd' ' | sed "s/mId=/\nmId=/g" > "$OUT/channels_$1.txt"; adb logcat -d -s NotifPrefs:V > "$OUT/notifprefs_$1.txt" 2>&1; }
adb shell cmd uimode night yes; adb shell am force-stop $PKG
adb shell pm grant $PKG android.permission.POST_NOTIFICATIONS >/dev/null 2>&1
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 7
chans 1_start
tapdesc "الإعدادات"; sleep 3
adb shell input swipe 540 1700 540 700 500; sleep 2
tapdesc "الاهتزاز للإشعارات"; sleep 3
adb exec-out screencap -p > "$OUT/notif_settings_vib_off.png"
chans 2_global_vibration_off
adb shell input keyevent 4; sleep 2
dumpui
BXY=$(python3 - <<'PY'
import re
x=open('/tmp/uw.xml',encoding='utf-8').read()
for m in re.finditer(r'content-desc="bell_0"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    print((int(m.group(1))+int(m.group(3)))//2,(int(m.group(2))+int(m.group(4)))//2); break
PY
)
echo "bell_0: $BXY" >> "$OUT/SUMMARY.txt"
[ -n "$BXY" ] && adb shell input swipe $BXY $BXY 1200; sleep 3
adb exec-out screencap -p > "$OUT/sheet_inherit.png"
swtap(){ dumpui
 XY=$(python3 - <<'PY'
import re
x=open('/tmp/uw.xml',encoding='utf-8').read()
c=[m for m in re.finditer(r'checkable="true"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x)]
if c:
    m=c[-1]; print((int(m.group(1))+int(m.group(3)))//2,(int(m.group(2))+int(m.group(4)))//2)
PY
)
 echo "switch tap: $XY" >> "$OUT/SUMMARY.txt"; [ -n "$XY" ] && adb shell input tap $XY; }
swtap; sleep 3
adb exec-out screencap -p > "$OUT/sheet_custom.png"
chans 3_prayer_override
tapdesc "العودة لإعدادات التطبيق"; sleep 3
adb exec-out screencap -p > "$OUT/sheet_reset.png"
chans 4_after_reset

# 3.3.0 Fajr full-screen alarm: drawer entry, settings screen, real scheduler, real receiver
adb shell cmd uimode night yes; adb shell am force-stop $PKG
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
tapdesc "القائمة"; sleep 3
tapdesc "منبه صلاة الفجر"; sleep 3
adb exec-out screencap -p > "$OUT/fajr_alarm_off.png"
dumpui
FXY=$(python3 - <<'PY'
import re
x=open('/tmp/uw.xml',encoding='utf-8').read()
c=[m for m in re.finditer(r'checkable="true"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x)]
if c:
    m=c[0]; print((int(m.group(1))+int(m.group(3)))//2,(int(m.group(2))+int(m.group(4)))//2)
PY
)
echo "fajr switch: $FXY" >> "$OUT/SUMMARY.txt"
[ -n "$FXY" ] && adb shell input tap $FXY; sleep 3
adb exec-out screencap -p > "$OUT/fajr_alarm_on.png"
adb shell input swipe 540 1700 540 600 500; sleep 2
adb exec-out screencap -p > "$OUT/fajr_alarm_on_2.png"
adb shell dumpsys alarm | grep -B1 -A4 "$PKG" | grep -iE "RTC_WAKEUP|FajrAlarm|type=" | head -12 > "$OUT/fajr_alarms_scheduled.txt"
adb shell dumpsys alarm | grep -c "FajrAlarmReceiver" >> "$OUT/fajr_alarms_scheduled.txt"
# bell suppression: fire the Fajr ADHAN bell with the alarm on, then the alarm itself
adb shell cmd notification allow_listener x >/dev/null 2>&1
adb shell am broadcast -n $PKG/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 0 --ei alert_kind 0 > "$OUT/bell_broadcast.txt" 2>&1
sleep 2

# 3.3.0 new icon: launcher app drawer + About page
adb shell cmd uimode night no; adb shell am force-stop $PKG
adb shell input keyevent 3; sleep 2
adb shell input swipe 540 1800 540 600 400; sleep 2
adb exec-out screencap -p > "$OUT/icon_launcher_drawer.png"
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
tapdesc "القائمة"; sleep 3
tapdesc "حول التطبيق"; sleep 3
adb exec-out screencap -p > "$OUT/icon_about.png"
adb shell cmd uimode night yes; sleep 2
adb exec-out screencap -p > "$OUT/icon_about_dark.png"
adb shell cmd uimode night no
adb logcat -d | grep -E "FajrBellSuppressed" > "$OUT/after_bell_adhan_alarm_on.txt"
adb shell am broadcast -n $PKG/com.example.fajr.alarm.FajrAlarmReceiver -a com.example.fajr.ACTION_FAJR_ALARM > "$OUT/alarm_broadcast.txt" 2>&1
sleep 5
adb exec-out screencap -p > "$OUT/fajr_alarm_ringing.png"
adb shell dumpsys window | grep -E "mCurrentFocus" > "$OUT/fajr_focus.txt"
adb shell dumpsys notification --noredact | grep -E "fajr_alarm_channel" | head -3 >> "$OUT/after_bell_adhan_alarm_on.txt"
adb shell am force-stop $PKG
adb shell cmd uimode night no
adb logcat -d > "$OUT/logcat.txt"
! grep -E 'FATAL EXCEPTION' "$OUT/logcat.txt"
echo donewatch | tee -a "$OUT/SUMMARY.txt"
