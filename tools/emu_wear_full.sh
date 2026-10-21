#!/bin/bash
# Full wear regression: pages, settings subs, themes, patterns, tile, complications, adhan, English.
APK=$1; OUT=$2; PKG=com.wathakker.app; A=com.wathakker.wear; mkdir -p "$OUT"; adb root >/dev/null 2>&1; sleep 2
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell settings put global auto_time 0; adb shell setprop persist.sys.timezone Africa/Cairo
adb shell date 102101502026.00 >/dev/null 2>&1
adb shell svc power stayon true; adb shell settings put system screen_off_timeout 1800000
adb shell cmd package query-services -a androidx.wear.tiles.action.BIND_TILE_PROVIDER > "$OUT/tile_services.txt" 2>&1
adb shell cmd package query-services -a android.support.wearable.complications.ACTION_COMPLICATION_UPDATE_REQUEST > "$OUT/complication_services.txt" 2>&1
adb shell am start -W -n $PKG/$A.MainActivity >/dev/null 2>&1; sleep 20
shot(){ adb exec-out screencap -p > "$OUT/$1.png"; }
for P in 0 1 2 3; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page $P >/dev/null 2>&1; sleep 12; shot page_$P; done
for SB in 0 1 2 3 4; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 4 --ei sub $SB >/dev/null 2>&1; sleep 10; shot set_$SB; done
for TH in 1 2 3; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 0 --ei theme $TH >/dev/null 2>&1; sleep 10; shot theme_main_$TH; adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 1 --ei theme $TH >/dev/null 2>&1; sleep 10; shot theme_list_$TH; done
adb shell am start -S -W -n $PKG/$A.CirclesActivity >/dev/null 2>&1; sleep 10; shot circles_theme3
for PT in 1 11; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 0 --ei pat $PT >/dev/null 2>&1; sleep 10; shot pat_$PT; done
adb shell am start -S -W -n $PKG/$A.PreviewActivity --es mode tile >/dev/null 2>&1; sleep 8; shot tile_default
for K in 1 2 3 4 8; do adb shell am start -S -W -n $PKG/$A.PreviewActivity --es mode short --ei kind $K >/dev/null 2>&1; sleep 7; shot comp_$K; done
adb shell am start -S -W -n $PKG/$A.PreviewActivity --es mode ranged >/dev/null 2>&1; sleep 7; shot comp_ranged
adb shell am start -S -W -n $PKG/$A.AdhanActivity --ei id 4 >/dev/null 2>&1; sleep 3; shot adhan_screen
adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 4 --ei sub 0 >/dev/null 2>&1; sleep 6; adb shell dumpsys alarm | grep -B1 -A4 "com.wathakker.app" | head -30 > "$OUT/alarm_before.txt"
adb shell am start -S -W -n $PKG/$A.MainActivity --ei page 0 --ei adhan_test 20 >/dev/null 2>&1; sleep 2
adb shell input keyevent 26; sleep 1; adb shell input keyevent 3; sleep 17; shot adhan_alarm_fired
sleep 3; shot adhan_after_5s
adb shell "cat /data/data/com.wathakker.app/shared_prefs/wear_prefs.xml" > "$OUT/prefs_after_alarm.xml" 2>&1
adb logcat -d | grep -i "adhan\|AlarmManager.*wathakker" | head -20 > "$OUT/adhan_log.txt"
adb shell dumpsys window | grep -i "mCurrentFocus" > "$OUT/focus.txt"
for P in 0 1 2 4; do adb shell am start -S -W -n $PKG/$A.MainActivity --ei page $P --ei lang 2 >/dev/null 2>&1; sleep 9; shot en_$P; done
adb shell input keyevent 3; sleep 2
adb shell input swipe 227 320 227 80; sleep 3; shot launcher_apps_1
adb shell input swipe 227 320 227 80; sleep 2; shot launcher_apps_2
adb shell input swipe 227 320 227 80; sleep 2; shot launcher_apps_3
adb logcat -d | grep -i "FATAL EXCEPTION\|AndroidRuntime" -A8 | head -60 > "$OUT/errors.txt" 2>&1
echo done > "$OUT/SUMMARY.txt"
