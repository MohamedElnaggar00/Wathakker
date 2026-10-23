#!/bin/bash
# Friday Jumuah evidence (functional, debug build) + city-edit prototype captures.
# 1. City edit prototype boards (ar dark/light, en dark).
# 2. Friday 2026-10-23: prayer list shows الجمعة not الظهر; Dhuhr alert sheet hides the
#    iqama row; widget renders show الجمعة; stored iqama_2 pref untouched.
# 3. Saturday 2026-10-24: list shows الظهر; sheet shows the iqama row (still ON).
# 4. Back to Friday: iqama row hidden again, pref file unchanged.
APK=$1; OUT=$2; SIGNED=$3; PKG=com.wathakker.app; mkdir -p "$OUT"
adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell svc power stayon true
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$1" >/dev/null 2>&1; }
shot(){ adb exec-out screencap -p > "$OUT/$1.png"; }
dismiss_anr(){ for i in 1 2 3 4; do adb shell uiautomator dump /sdcard/ui_anr.xml >/dev/null 2>&1; adb pull /sdcard/ui_anr.xml "$OUT/ui_anr.xml" >/dev/null 2>&1; if grep -q "responding" "$OUT/ui_anr.xml" 2>/dev/null; then B=$(grep -o 'text="Wait"[^>]*' "$OUT/ui_anr.xml" | grep -o 'bounds="[^"]*"' | head -1); XY=$(echo "$B" | sed -n 's/bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]"/\1 \2 \3 \4/p' | awk '{print int(($1+$3)/2), int(($2+$4)/2)}'); if [ -n "$XY" ]; then adb shell input tap $XY; else adb shell input keyevent 4; fi; sleep 4; else return; fi; done; }
seed(){ adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml"; adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"migrated_v1\" value=\"true\" /><boolean name=\"enabled_2\" value=\"true\" /><boolean name=\"iqama_2\" value=\"true\" /></map>' > /data/data/com.wathakker.app/shared_prefs/prayer_alerts.xml"; adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"use_current_location\" value=\"false\" /><float name=\"latitude\" value=\"31.2001\" /><float name=\"longitude\" value=\"29.9187\" /><string name=\"city_name\">الإسكندرية، مصر</string><string name=\"city_name_ar\">الإسكندرية، مصر</string><string name=\"city_name_en\">Alexandria, Egypt</string><string name=\"place_key\">m|31.2001|29.9187</string><string name=\"city_aliases_json\">{}</string></map>' > /data/data/com.wathakker.app/shared_prefs/fajr_prefs.xml"; adb shell "cat /data/data/com.wathakker.app/shared_prefs/app_prefs.xml /data/data/com.wathakker.app/shared_prefs/prayer_alerts.xml" >> "$OUT/nav.txt" 2>&1; }
setdate(){ adb shell date "$1" >/dev/null 2>&1; sleep 2; adb shell date >> "$OUT/nav.txt" 2>&1; dismiss_anr; }
find_text(){ B=$(grep -o "text=\"$1\"[^>]*" "$2" | grep -o 'bounds="[^"]*"' | head -1); echo "$B" | sed -n 's/bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]"/\1 \2 \3 \4/p' | awk '{print int(($1+$3)/2), int(($2+$4)/2)}'; }
dump_clean(){ for i in 1 2 3 4 5; do adb shell uiautomator dump /sdcard/ui_dc.xml >/dev/null 2>&1; adb pull /sdcard/ui_dc.xml "$1" >/dev/null 2>&1; if grep -q "responding" "$1" 2>/dev/null; then dismiss_anr; sleep 3; else return; fi; done; }
find_cd(){ B=$(grep -o "content-desc=\"$1\"[^>]*" "$2" | grep -o 'bounds="[^"]*"' | head -1); echo "$B" | sed -n 's/bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]"/\1 \2 \3 \4/p' | awk '{print int(($1+$3)/2), int(($2+$4)/2)}'; }
REAL_DATE=$(adb shell date +%m%d%H%M%Y.%S 2>/dev/null | tr -d '\r'); echo "emulator date at start: $REAL_DATE" > "$OUT/nav.txt"

# first launch creates shared_prefs; then seed, then everything else
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 10
dismiss_anr
adb shell am force-stop $PKG; sleep 1
seed

# ---- 1. city edit prototype boards ----
adb shell cmd uimode night yes; sleep 1
adb shell am start -S -W -n $PKG/com.example.CityEditProtoCheck >/dev/null 2>&1; sleep 7
dismiss_anr; shot city_ar_night
adb shell input swipe 360 1300 360 500 400; sleep 2; dismiss_anr; shot city_ar_night_b
adb shell cmd uimode night no; sleep 1
adb shell am start -S -W -n $PKG/com.example.CityEditProtoCheck >/dev/null 2>&1; sleep 7
dismiss_anr; shot city_ar_day
adb shell input swipe 360 1300 360 500 400; sleep 2; dismiss_anr; shot city_ar_day_b
adb shell cmd uimode night yes; sleep 1
adb shell am start -S -W -n $PKG/com.example.CityEditProtoCheck --es lang en >/dev/null 2>&1; sleep 7
dismiss_anr; shot city_en_night
adb shell input swipe 360 1300 360 500 400; sleep 2; dismiss_anr; shot city_en_night_b
adb shell cmd uimode night no; sleep 1

# ---- 1.5 city alias: production roundtrip (manual-mode key, no geocoder dependency) ----
if [ -z "$SIGNED" ]; then
adb shell am start -S -W -n $PKG/com.example.CityEditProtoCheck --ez alias_selftest true >/dev/null 2>&1; sleep 6
adb pull /sdcard/Android/data/$PKG/files/alias_selftest.txt "$OUT/alias_selftest.txt" >> "$OUT/nav.txt" 2>&1
fi
curl -sL -o /tmp/adbkb.apk https://github.com/senzhk/ADBKeyBoard/raw/master/ADBKeyboard.apk
adb install -r /tmp/adbkb.apk >/dev/null 2>&1
ORIG_IME=$(adb shell settings get secure default_input_method | tr -d '\r')
KB_IME=$(adb shell ime list -a -s | grep -i adbkeyboard | head -1 | tr -d '\r')
[ -n "$KB_IME" ] && adb shell ime set "$KB_IME" >/dev/null 2>&1; sleep 1
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 12
dismiss_anr
dump_clean "$OUT/ui_home.xml"
XY=$(find_cd "Settings" "$OUT/ui_home.xml"); [ -z "$XY" ] && XY=$(find_cd "الإعدادات" "$OUT/ui_home.xml"); [ -z "$XY" ] && XY="108 222"
adb shell input tap $XY; sleep 4
dismiss_anr
dump_clean "$OUT/ui_drawer.xml"
XY=$(find_text "تغيير الموقع" "$OUT/ui_drawer.xml"); echo "nav loccalc: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input tap $XY; sleep 5
dismiss_anr
shot alias_row_baseline
dump_clean "$OUT/ui_loccalc.xml"
XY=$(find_cd "تعديل اسم المدينة" "$OUT/ui_loccalc.xml"); echo "pencil: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input tap $XY; sleep 3
shot alias_editor_open
adb shell input tap 548 1106; sleep 2
adb shell input keyevent KEYCODE_MOVE_END; sleep 1
for i in $(seq 1 40); do adb shell input keyevent KEYCODE_DEL; done; sleep 1
adb shell input text "NewCairoTest"; sleep 3
dump_clean "$OUT/ui_editor.xml"
XY=$(find_cd "حفظ" "$OUT/ui_editor.xml"); echo "save btn: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input tap $XY; sleep 4
dismiss_anr
shot alias_applied
adb shell "cat /data/data/$PKG/shared_prefs/fajr_prefs.xml" > "$OUT/prefs_alias_saved.xml" 2>&1
adb shell am force-stop $PKG; sleep 1
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 10
dismiss_anr
dump_clean "$OUT/ui_home2.xml"
XY=$(find_cd "Settings" "$OUT/ui_home2.xml"); [ -z "$XY" ] && XY=$(find_cd "الإعدادات" "$OUT/ui_home2.xml"); [ -z "$XY" ] && XY="108 222"
adb shell input tap $XY; sleep 4
dismiss_anr
dump_clean "$OUT/ui_drawer2.xml"
XY=$(find_text "تغيير الموقع" "$OUT/ui_drawer2.xml"); [ -n "$XY" ] && adb shell input tap $XY; sleep 5
dismiss_anr
shot alias_persisted
adb shell "cat /data/data/$PKG/shared_prefs/fajr_prefs.xml" > "$OUT/prefs_alias_restart.xml" 2>&1
dump_clean "$OUT/ui_loccalc2.xml"
XY=$(find_text "استعادة الاسم التلقائي" "$OUT/ui_loccalc2.xml"); echo "reset: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input tap $XY; sleep 4
dismiss_anr
shot alias_reset
adb shell "cat /data/data/$PKG/shared_prefs/fajr_prefs.xml" > "$OUT/prefs_alias_reset.xml" 2>&1
[ -n "$ORIG_IME" ] && adb shell ime set "$ORIG_IME" >/dev/null 2>&1

# ---- 2. Friday ----
setdate "102304002026.00"
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 12
dismiss_anr
shot friday_prayers; dump_clean "$OUT/ui_friday.xml"
XY=$(find_cd "bell_2" "$OUT/ui_friday.xml"); echo "bell_2 friday: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input swipe $XY $XY 1300; sleep 4
dismiss_anr
shot friday_sheet; dump_clean "$OUT/ui_friday_sheet.xml"
adb shell input keyevent 4; sleep 2
if [ -z "$SIGNED" ]; then
adb shell am start -S -W -n $PKG/com.example.WidgetRenderCheck >/dev/null 2>&1; sleep 12
FD=/sdcard/Android/data/$PKG/files
for f in widget_dark_NextPrayer.png widget_dark_Hero.png widget_dark_PrayerBar.png widget_light_NextPrayer.png widget_light_Hero.png widget_light_PrayerBar.png lock_Next.png lock_Bar.png widget_glass_Hero.png widget_glass_NextPrayer.png widget_glass_PrayerBar.png widget_wallblur_Hero.png; do
  adb pull "$FD/$f" "$OUT/friday_$f" >> "$OUT/nav.txt" 2>&1
done
fi
adb shell "cat /data/data/$PKG/shared_prefs/prayer_alerts.xml" > "$OUT/prefs_friday.xml" 2>&1
adb shell dumpsys alarm > "$OUT/alarm_friday_dump.txt" 2>&1

# ---- 3. Saturday ----
setdate "102404002026.00"
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 12
dismiss_anr
shot saturday_prayers; dump_clean "$OUT/ui_saturday.xml"
XY=$(find_cd "bell_2" "$OUT/ui_saturday.xml"); echo "bell_2 saturday: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input swipe $XY $XY 1300; sleep 4
dismiss_anr
shot saturday_sheet; dump_clean "$OUT/ui_saturday_sheet.xml"
adb shell input keyevent 4; sleep 2
adb shell "cat /data/data/$PKG/shared_prefs/prayer_alerts.xml" > "$OUT/prefs_saturday.xml" 2>&1
adb shell dumpsys alarm > "$OUT/alarm_saturday_dump.txt" 2>&1

# ---- 4. Friday again: hidden again, prefs unchanged ----
setdate "102304002026.00"
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 12
dismiss_anr
dump_clean "$OUT/ui_friday2.xml"
XY=$(find_cd "bell_2" "$OUT/ui_friday2.xml"); echo "bell_2 friday2: $XY" >> "$OUT/nav.txt"
[ -n "$XY" ] && adb shell input swipe $XY $XY 1300; sleep 4
dismiss_anr
shot friday2_sheet; dump_clean "$OUT/ui_friday2_sheet.xml"
adb shell input keyevent 4; sleep 2
adb shell "cat /data/data/$PKG/shared_prefs/prayer_alerts.xml" > "$OUT/prefs_friday2.xml" 2>&1

# restore real time
[ -n "$REAL_DATE" ] && setdate "$REAL_DATE"

python3 - "$OUT" "$SIGNED" <<'PYC'
import sys, os
out = sys.argv[1]
SIGNED = len(sys.argv) > 2 and sys.argv[2] == '1'
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
    ('widget renders: ' + ('skipped (signed APK; activity debug-only since b130c7e8 successor) - see debug-run renders, supplemental' if SIGNED else 'pulled: ' + str(len(renders)) + '/12 (production renderer, offscreen backing, incl glass/wallblur keys)')),
]
import re as _re
def pkg_alarm_times(name):
    times = []
    for ln in read(name).splitlines():
        if 'com.wathakker.app' in ln:
            m = _re.search(r'origWhen[= ](\d{13})', ln) or _re.search(r'when[= ](\d{13})', ln)
            if m:
                times.append(int(m.group(1)))
    return sorted(set(times))
import datetime as _dt
def on_date(times, y, m, d):
    return [t for t in times if _dt.datetime.utcfromtimestamp(t / 1000).date() == _dt.date(y, m, d)]
fri_t, sat_t = pkg_alarm_times('alarm_friday_dump.txt'), pkg_alarm_times('alarm_saturday_dump.txt')
parsed = len(fri_t) + len(sat_t) > 0
fri_on = on_date(fri_t, 2026, 10, 23)
sat_on = on_date(sat_t, 2026, 10, 24)
lines += [
    'alarm trigger-time parse (dumpsys, package-filtered): ' + (('friday dump=%d alarms, saturday dump=%d alarms' % (len(fri_t), len(sat_t))) if parsed else 'unparsed -> verification limit, not claimed'),
    'friday-date 2026-10-23 alarms for package (expect 1 = adhan only, iqama suppressed): ' + ((str(len(fri_on)) + ' -> ' + str(len(fri_on) == 1)) if parsed else 'n/a'),
    'saturday-date 2026-10-24 alarms for package (expect 2 = adhan + iqama): ' + ((str(len(sat_on)) + ' -> ' + str(len(sat_on) == 2)) if parsed else 'n/a'),
]
saved = read('prefs_alias_saved.xml'); restart = read('prefs_alias_restart.xml'); reset = read('prefs_alias_reset.xml')
AL = 'NewCairoTest'
selftest = read('alias_selftest.txt')
alines = [
    ('deterministic identity/alias selftest: ' + ('skipped (signed release build, debug-only activity)' if SIGNED else ('all pass: ' + str('PASS' in selftest and 'FAIL' not in selftest)))),
    'editor received typed text: ' + str(AL in read('ui_editor.xml')),
    'alias saved to store: ' + str(AL in saved and 'city_aliases_json' in saved),
    'alias applied to city_name_ar: ' + str('name="city_name_ar">' + AL in saved),
    'orig names backed up: ' + str('city_name_ar_orig' in saved),
    'alias persists across restart: ' + str(AL in restart),
    'reset removes alias from store: ' + str(AL not in reset),
    'reset restores original name: ' + str('الإسكندرية' in reset),
]
open(os.path.join(out, 'alias_check.txt'), 'w', encoding='utf-8').write('\n'.join(alines) + '\n')
open(os.path.join(out, 'friday_check.txt'), 'w', encoding='utf-8').write('\n'.join(lines) + '\n')
PYC
cat "$OUT/friday_check.txt"
