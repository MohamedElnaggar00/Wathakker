#!/bin/bash
# Friday Jumuah evidence (functional, debug build) + city-edit prototype captures.
# 1. City edit prototype boards (ar dark/light, en dark).
# 2. Friday 2026-10-23: prayer list shows الجمعة not الظهر; Dhuhr alert sheet hides the
#    iqama row; widget renders show الجمعة; stored iqama_2 pref untouched.
# 3. Saturday 2026-10-24: list shows الظهر; sheet shows the iqama row (still ON).
# 4. Back to Friday: iqama row hidden again, pref file unchanged.
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"
adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell svc power stayon true
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$1" >/dev/null 2>&1; }
shot(){ adb exec-out screencap -p > "$OUT/$1.png"; }
seed(){ adb shell am force-stop $PKG; adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml"; adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"enabled_2\" value=\"true\" /><boolean name=\"iqama_2\" value=\"true\" /></map>' > /data/data/com.wathakker.app/shared_prefs/prayer_alerts.xml"; }
setdate(){ adb shell date "$1" >/dev/null 2>&1; sleep 2; }
find_cd(){ B=$(grep -o "content-desc=\"$1\"[^>]*" "$2" | grep -o 'bounds="[^"]*"' | head -1); echo "$B" | sed -n 's/bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]"/\1 \2 \3 \4/p' | awk '{print int(($1+$3)/2), int(($2+$4)/2)}'; }
REAL_DATE=$(adb shell date +%m%d%H%M%Y.%S 2>/dev/null | tr -d '\r'); echo "emulator date at start: $REAL_DATE" > "$OUT/nav.txt"

# ---- 1. city edit prototype boards ----
seed
adb shell cmd uimode night yes; sleep 1
adb shell am start -S -W -n $PKG/com.example.CityEditProtoCheck >/dev/null 2>&1; sleep 7
shot city_ar_night
adb shell cmd uimode night no; sleep 1
adb shell am start -S -W -n $PKG/com.example.CityEditProtoCheck >/dev/null 2>&1; sleep 7
shot city_ar_day
adb shell cmd uimode night yes; sleep 1
adb shell am start -S -W -n $PKG/com.example.CityEditProtoCheck --es lang en >/dev/null 2>&1; sleep 7
shot city_en_night
adb shell cmd uimode night no; sleep 1

# ---- 2. Friday ----
setdate "102311002026.00"
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 12
shot friday_prayers; dump "$OUT/ui_friday.xml"
XY=$(find_cd "bell_2" "$OUT/ui_friday.xml"); echo "bell_2 friday: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input swipe $XY $XY 1300; sleep 4
shot friday_sheet; dump "$OUT/ui_friday_sheet.xml"
adb shell input keyevent 4; sleep 2
adb shell am start -S -W -n $PKG/com.example.WidgetRenderCheck >/dev/null 2>&1; sleep 12
FD=/sdcard/Android/data/$PKG/files
for f in widget_dark_NextPrayer.png widget_dark_Hero.png widget_dark_PrayerBar.png widget_light_NextPrayer.png widget_light_Hero.png widget_light_PrayerBar.png lock_Next.png lock_Bar.png; do
  adb pull "$FD/$f" "$OUT/friday_$f" >> "$OUT/nav.txt" 2>&1
done
adb shell "cat /data/data/$PKG/shared_prefs/prayer_alerts.xml" > "$OUT/prefs_friday.xml" 2>&1

# ---- 3. Saturday ----
setdate "102411002026.00"
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 12
shot saturday_prayers; dump "$OUT/ui_saturday.xml"
XY=$(find_cd "bell_2" "$OUT/ui_saturday.xml"); echo "bell_2 saturday: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input swipe $XY $XY 1300; sleep 4
shot saturday_sheet; dump "$OUT/ui_saturday_sheet.xml"
adb shell input keyevent 4; sleep 2
adb shell "cat /data/data/$PKG/shared_prefs/prayer_alerts.xml" > "$OUT/prefs_saturday.xml" 2>&1

# ---- 4. Friday again: hidden again, prefs unchanged ----
setdate "102311002026.00"
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 12
dump "$OUT/ui_friday2.xml"
XY=$(find_cd "bell_2" "$OUT/ui_friday2.xml"); echo "bell_2 friday2: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input swipe $XY $XY 1300; sleep 4
shot friday2_sheet; dump "$OUT/ui_friday2_sheet.xml"
adb shell input keyevent 4; sleep 2
adb shell "cat /data/data/$PKG/shared_prefs/prayer_alerts.xml" > "$OUT/prefs_friday2.xml" 2>&1

# restore real time
[ -n "$REAL_DATE" ] && setdate "$REAL_DATE"

python3 - "$OUT" <<'PYC'
import sys, os
out = sys.argv[1]
def read(n):
    try: return open(os.path.join(out, n), encoding='utf-8').read()
    except Exception: return ''
fri, fri_s = read('ui_friday.xml'), read('ui_friday_sheet.xml')
sat, sat_s = read('ui_saturday.xml'), read('ui_saturday_sheet.xml')
fri2_s = read('ui_friday2_sheet.xml')
p_f, p_s, p_f2 = read('prefs_friday.xml'), read('prefs_saturday.xml'), read('prefs_friday2.xml')
renders = [f for f in ('friday_widget_dark_NextPrayer.png','friday_widget_dark_Hero.png','friday_widget_dark_PrayerBar.png','friday_widget_light_NextPrayer.png','friday_widget_light_Hero.png','friday_widget_light_PrayerBar.png','friday_lock_Next.png','friday_lock_Bar.png') if os.path.exists(os.path.join(out, f))]
lines = [
    'friday list shows الجمعة: ' + str('الجمعة' in fri),
    'friday list drops الظهر: ' + str('الظهر' not in fri),
    'friday sheet titled الجمعة: ' + str('الجمعة' in fri_s),
    'friday sheet hides iqama row: ' + str('تنبيه الإقامة' not in fri_s),
    'saturday list shows الظهر: ' + str('الظهر' in sat),
    'saturday sheet shows iqama row: ' + str('تنبيه الإقامة' in sat_s),
    'friday-again sheet hides iqama row: ' + str('تنبيه الإقامة' not in fri2_s),
    'iqama_2 pref preserved (fri/sat/fri2): ' + str(all('iqama_2" value="true"' in p for p in (p_f, p_s, p_f2))),
    'widget renders pulled: ' + str(len(renders)) + '/8',
]
open(os.path.join(out, 'friday_check.txt'), 'w', encoding='utf-8').write('\n'.join(lines) + '\n')
PYC
cat "$OUT/friday_check.txt"
