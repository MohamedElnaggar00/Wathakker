#!/bin/bash
# Dev-only evidence for the per-prayer adhan alert style (notification / full-screen).
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"
adb wait-for-device
adb root >/dev/null 2>&1; sleep 3; adb wait-for-device
ROOTED=$(adb shell id 2>/dev/null | grep -c "uid=0")
if [ "$ROOTED" = "1" ]; then
  adb shell "setprop persist.sys.locale ar-EG; setprop ctl.restart zygote" >/dev/null 2>&1
  sleep 5; adb wait-for-device
  for i in $(seq 1 40); do
    B=$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')
    [ "$B" = "1" ] && break; sleep 2
  done
  sleep 12
fi
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell appops set $PKG USE_FULL_SCREEN_INTENT allow >/dev/null 2>&1

shot(){ adb exec-out screencap -p > "$OUT/$1.png"; }
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$OUT/ui_$1.xml" >/dev/null 2>&1; }
CUR=""
findany(){ for N in "$@"; do X=$(python3 tools/findxy.py "$N" "$OUT/ui_$CUR.xml" 2>/dev/null); [ -n "$X" ] && { echo "$X"; return 0; }; done; return 1; }

# ---- open app once, pass onboarding/permissions ----
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 10
shot 00_app_start
for i in 1 2 3 4 5 6; do
  CUR=onboard_$i; dump $CUR
  XY=$(findany "سماح" "Allow" "ALLOW" "أثناء استخدام التطبيق" "While using the app")
  if [ -n "$XY" ]; then adb shell input tap $XY; sleep 4; continue; fi
  XY=$(findany "التالي" "التالى" "متابعة" "Next" "Continue" "تم" "Done" "ابدأ" "البدء" "Start" "تخطي" "Skip")
  if [ -n "$XY" ]; then adb shell input tap $XY; sleep 4; continue; fi
  break
done

# ---- prayer tab ----
CUR=home; dump $CUR
XY=$(findany "الصلاة" "Prayer")
[ -n "$XY" ] && adb shell input tap $XY; sleep 4
shot 30_prayer_screen

# ---- long-press the Asr bell (bell_3) to open alert settings ----
CUR=prayer; dump $CUR
XY=$(findany "bell_3")
if [ -z "$XY" ]; then echo "BELL_NOT_FOUND" >> "$OUT/SUMMARY.txt"; else
  adb shell input swipe $XY $XY 1300; sleep 4
fi
shot 31_alert_dialog
CUR=dialog; dump $CUR

# ---- open the alert-type picker ----
XY=$(findany "نوع التنبيه" "Adhan alert type")
if [ -z "$XY" ]; then echo "TYPE_ROW_NOT_FOUND" >> "$OUT/SUMMARY.txt"; else
  adb shell input tap $XY; sleep 3
fi
shot 32_type_picker
CUR=picker; dump $CUR

# ---- choose full-screen, apply ----
XY=$(findany "تنبيه إشعار بملء الشاشة" "Full-screen notification alert")
[ -n "$XY" ] && adb shell input tap $XY; sleep 2
CUR=picker2; dump $CUR
XY=$(findany "تطبيق" "Apply")
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
shot 33_type_selected
CUR=dialog2; dump $CUR
XY=$(findany "تطبيق" "Apply")
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
shot 34_applied
adb shell "cat /data/data/$PKG/shared_prefs/prayer_alerts.xml" > "$OUT/prayer_alerts_prefs.xml" 2>&1

# ---- fire the Asr adhan alert with the screen OFF (full-screen should wake) ----
adb shell input keyevent 26; sleep 3
shot 39_screen_off
adb shell am broadcast -n $PKG/com.example.prayer.alerts.PrayerAlertReceiver --ei prayer_index 3 --ei alert_kind 0 >/dev/null 2>&1
sleep 8
shot 40_fullscreen_alert
CUR=alert; dump $CUR
adb shell dumpsys notification > "$OUT/notif.txt" 2>&1
adb logcat -d | grep -i "PrayerAlert\|FajrBellSuppressed" | tail -20 > "$OUT/alert_logcat.txt" 2>&1

# ---- dismiss the alert screen ----
XY=$(findany "إيقاف" "Stop")
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
shot 41_after_dismiss
echo "DONE" > "$OUT/SUMMARY.txt.append" 2>/dev/null
