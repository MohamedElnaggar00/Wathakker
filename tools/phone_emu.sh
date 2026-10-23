#!/bin/bash
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 15
adb exec-out screencap -p > "$OUT/app_start.png"
for S in 0 1 2; do adb shell am start -S -W -n $PKG/com.example.PatternRenderCheck --ei s $S >/dev/null 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/widget_s$S.png"; done
adb shell am start -S -W -n $PKG/com.example.widget.WidgetConfigActivity --ei appWidgetId 9001 >/dev/null 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/config.png"
adb shell input swipe 540 1900 540 500 300; sleep 2; adb exec-out screencap -p > "$OUT/config_scrolled.png"
adb logcat -d | grep -i "AndroidRuntime\|WathakkerHome\|FATAL" | head -20 > "$OUT/errors.txt"
adb shell am start -S -W -n $PKG/com.example.ColorRenderCheck >/dev/null 2>&1; sleep 8; adb exec-out screencap -p > "$OUT/widget_colors.png"
adb logcat -d | grep ColorCheck > "$OUT/color_check.txt"
adb shell am start -S -W -n $PKG/com.example.widget.WidgetConfigActivity --ei appWidgetId 9301 --ez debugOneUi true >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/config_oneui.png"
adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$OUT/ui_oneui.xml" >/dev/null 2>&1
tap_text(){ B=$(grep -o "text=\"$1\"[^>]*" "$2" | grep -o 'bounds="[^"]*"' | head -1); echo "$B" | sed -n 's/bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]"/\1 \2 \3 \4/p' | awk '{print int(($1+$3)/2), int(($2+$4)/2)}'; }
XY=$(tap_text "بدون" "$OUT/ui_oneui.xml"); echo "none chip: $XY" >> "$OUT/color_check.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 2
adb exec-out screencap -p > "$OUT/config_oneui_selected.png"
adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$OUT/ui_oneui2.xml" >/dev/null 2>&1
XY=$(tap_text "تطبيق" "$OUT/ui_oneui2.xml"); echo "apply btn: $XY" >> "$OUT/color_check.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
adb shell "cat /data/data/com.wathakker.app/shared_prefs/fajr_prefs.xml" > "$OUT/prefs_oneui.xml" 2>&1
adb shell am start -S -W -n $PKG/com.example.PatternRenderCheck --ei s 3 >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/widget_oneui_applied.png"
adb shell am start -S -W -n $PKG/com.example.PatternScopeCheck >/dev/null 2>&1; sleep 10; adb exec-out screencap -p > "$OUT/pattern_scope.png"
adb logcat -d | grep PatternScope > "$OUT/pattern_scope.txt"
# 3.3.3 accent themes: the OneUI widget in yellow/turquoise/blue/green, dark then light.
adb shell cmd uimode night yes
adb shell am start -S -W -n $PKG/com.example.OneUIColorCheck >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/widget_accent_night.png"
adb shell cmd uimode night no
adb shell am start -S -W -n $PKG/com.example.OneUIColorCheck >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/widget_accent_day.png"
adb shell cmd uimode night yes

# 3.3.3 in-app UI evidence in Arabic RTL: collapsing headers, gear audit, About rows,
# segmented controls (with a screen recording of the indicator slide).
# No locale/zygote restart needed (it killed the emulator in one run): the app is# Arabic RTL on its own (app_prefs language defaults to "ar"). Fresh install lands on
# onboarding; skip it + the permission flow deterministically, so the navigation
# evidence starts on the main tabs. Every section relaunches with am start -S
# (force-stop + cold start lands on the main tabs), so no back-stack assumptions.
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8
adb shell am force-stop $PKG
adb shell "cat /data/data/com.wathakker.app/shared_prefs/app_prefs.xml 2>/dev/null || echo MISSING" > "$OUT/app_prefs_before.xml"
adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml"
adb shell "cat /data/data/com.wathakker.app/shared_prefs/app_prefs.xml" > "$OUT/app_prefs_after.xml"
tap_desc(){ B=$(grep -o "content-desc=\"$1\"[^>]*" "$2" | grep -o 'bounds="[^"]*"' | head -1); echo "$B" | sed -n 's/bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]"/\1 \2 \3 \4/p' | awk '{print int(($1+$3)/2), int(($2+$4)/2)}'; }
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$1" >/dev/null 2>&1; }
dismiss_anr(){ for i in 1 2 3 4; do adb shell uiautomator dump /sdcard/ui_anr.xml >/dev/null 2>&1; adb pull /sdcard/ui_anr.xml "$OUT/ui_anr.xml" >/dev/null 2>&1; if grep -q "responding" "$OUT/ui_anr.xml" 2>/dev/null; then XY=$(tap_text "Wait" "$OUT/ui_anr.xml"); if [ -n "$XY" ]; then adb shell input tap $XY; else adb shell input keyevent 4; fi; sleep 4; else return; fi; done; echo "ANR persists after Wait taps - rebooting emulator" >> "$OUT/ui_nav.txt"; adb reboot >/dev/null 2>&1; adb wait-for-device; sleep 40; adb shell svc power stayon true; }
relaunch(){ adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 14; dismiss_anr; sleep 2; }
open_settings(){ relaunch; dump "$OUT/ui_navx.xml"; XY=$(tap_desc "الإعدادات" "$OUT/ui_navx.xml"); echo "gear: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; dismiss_anr; }

relaunch
adb exec-out screencap -p > "$OUT/ar_tabs.png"
dump "$OUT/ui_tabs.xml"
# Settings page (gear only on top-level; sub-page shows back only)
open_settings
adb exec-out screencap -p > "$OUT/ar_settings.png"
dump "$OUT/ui_settings.xml"
adb shell input swipe 540 1500 540 1300 300; sleep 1
adb exec-out screencap -p > "$OUT/ar_settings_mid.png"
adb shell input swipe 540 1700 540 600 350; sleep 2
adb shell input swipe 540 1700 540 600 350; sleep 2
adb exec-out screencap -p > "$OUT/ar_settings_scrolled.png"
dump "$OUT/ui_settings2.xml"
# About page: rest, mid-scroll, collapsed
for i in 1 2 3; do XY=$(tap_text "حول التطبيق" "$OUT/ui_settings2.xml"); [ -n "$XY" ] && break; adb shell input swipe 540 1700 540 600 350; sleep 2; dump "$OUT/ui_settings2.xml"; done
echo "about row: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; dismiss_anr
adb exec-out screencap -p > "$OUT/ar_about_rest.png"
dump "$OUT/ui_about.xml"
adb shell input swipe 540 1500 540 1200 250; sleep 1
adb exec-out screencap -p > "$OUT/ar_about_mid.png"
adb shell input swipe 540 1700 540 500 350; sleep 2
adb exec-out screencap -p > "$OUT/ar_about_collapsed.png"
# Watch settings page: rest, mid-scroll, collapsed
open_settings
adb shell input swipe 540 1700 540 600 350; sleep 2
adb shell input swipe 540 1700 540 600 350; sleep 2
dump "$OUT/ui_settings3.xml"
XY=$(tap_text "إعدادات الساعة الذكية" "$OUT/ui_settings3.xml"); echo "watch row: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; dismiss_anr
adb exec-out screencap -p > "$OUT/ar_watch_rest.png"
dump "$OUT/ui_watch.xml"
adb shell input swipe 540 1500 540 1100 250; sleep 1
adb exec-out screencap -p > "$OUT/ar_watch_mid.png"
adb shell input swipe 540 1700 540 500 350; sleep 2
adb exec-out screencap -p > "$OUT/ar_watch_collapsed.png"
# Calendar tab: segmented control + slide recording
relaunch
dump "$OUT/ui_home.xml"
XY=$(tap_text "التقويم" "$OUT/ui_home.xml"); echo "cal tab: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; dismiss_anr
adb exec-out screencap -p > "$OUT/ar_calendar.png"
dump "$OUT/ui_cal.xml"
adb shell settings put global animator_duration_scale 8.0
adb shell screenrecord --time-limit 10 /sdcard/slide.mp4 & REC=$!
sleep 1
XY=$(tap_text "المناسبات" "$OUT/ui_cal.xml"); echo "events seg: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4
XY=$(tap_text "التقويم" "$OUT/ui_cal.xml"); echo "cal seg back: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4
wait $REC 2>/dev/null
adb shell settings put global animator_duration_scale 1.0
sleep 1
XY=$(tap_text "المناسبات" "$OUT/ui_cal.xml"); [ -n "$XY" ] && adb shell input tap $XY; sleep 2
adb exec-out screencap -p > "$OUT/ar_calendar_events.png"
adb pull /sdcard/slide.mp4 "$OUT/slide.mp4" >/dev/null 2>&1
if command -v ffmpeg >/dev/null 2>&1 && [ -f "$OUT/slide.mp4" ]; then
  for i in 0 1 2 3 4 5; do ffmpeg -loglevel error -ss $(awk "BEGIN{print 1.0 + $i * 0.35}") -i "$OUT/slide.mp4" -frames:v 1 "$OUT/slide_f$i.png" -y; done
fi
# ===== 3.3.3 chip groups: sliding selection pill (his spec: animation ONLY, no joined container)
record_tap(){
  adb shell settings put global animator_duration_scale 8.0
  adb shell screenrecord --time-limit 10 /sdcard/$1.mp4 & REC=$!
  sleep 1
  XY=$(tap_text "$3" "$2"); echo "$1 tap [$3]: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 6
  wait $REC 2>/dev/null
  adb shell settings put global animator_duration_scale 1.0
  adb pull /sdcard/$1.mp4 "$OUT/$1.mp4" >/dev/null 2>&1
  if command -v ffmpeg >/dev/null 2>&1 && [ -f "$OUT/$1.mp4" ]; then
    for i in 0 1 2 3 4 5 6 7; do ffmpeg -loglevel error -ss $(awk "BEGIN{print 1.2 + $i * 0.5}") -i "$OUT/$1.mp4" -frames:v 1 "$OUT/$1_f$i.png" -y; done
  fi
}
# Hisn الكل/المفضلة + full-collection search from favorites
# Fresh state: المفضلة is selected by default (viewModel) with 4 seeded favorites
# (الصباح/المساء/النوم/السفر, importer 3.3.0). Chapter names in dumps carry tashkeel,
# so every Arabic text match below normalizes diacritics before comparing.
relaunch
dump "$OUT/ui_tabs2.xml"
XY=$(tap_text "حصن المسلم" "$OUT/ui_tabs2.xml"); echo "hisn tab: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 5; dismiss_anr
adb exec-out screencap -p > "$OUT/hisn_chips_before.png"
dump "$OUT/ui_hisn.xml"
# chip slide on Hisn: المفضلة is selected by default, so the recorded slide = tap الكل
record_tap hisn_slide "$OUT/ui_hisn.xml" "الكل"
adb exec-out screencap -p > "$OUT/hisn_chips_all.png"
dump "$OUT/ui_hisn_all.xml"
# favorites view evidence: switch back to المفضلة
XY=$(tap_text "المفضلة" "$OUT/ui_hisn_all.xml"); echo "fav chip: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
adb exec-out screencap -p > "$OUT/hisn_chips_favorites.png"
dump "$OUT/ui_hisn_fav.xml"
python3 - "$OUT" << 'PYF'
import sys
def norm(s):
    return ''.join(c for c in s if not (0x064B <= ord(c) <= 0x0652 or ord(c) in (0x0670, 0x0640)))
out = sys.argv[1]
allxml = norm(open(out + '/ui_hisn_all.xml').read())
fav = norm(open(out + '/ui_hisn_fav.xml').read())
lines = []
lines.append('all view shows non-favorite chapter (normalized): ' + str('أذكار الاستيقاظ من النوم' in allxml))
lines.append('favorites view has seeded favorite أذكار الصباح (normalized): ' + str('أذكار الصباح' in fav))
lines.append('favorites view hides non-favorite أذكار الاستيقاظ (normalized): ' + str('أذكار الاستيقاظ من النوم' not in fav))
open(out + '/hisn_fav_check.txt', 'w').write('\n'.join(lines) + '\n')
PYF
# search FROM the favorites filter: query must span the whole collection, matching favorites pinned first
XY=$(tap_desc "ابحث في حصن المسلم" "$OUT/ui_hisn_fav.xml"); echo "search icon: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
# Arabic input needs ADBKeyBoard (adb input text drops non-ASCII); verify every step.
ORIG_IME=$(adb shell settings get secure default_input_method); echo "orig ime: $ORIG_IME" >> "$OUT/ui_nav.txt"
curl -sL -o /tmp/adbkb.apk https://github.com/senzhk/ADBKeyBoard/raw/master/ADBKeyboard.apk
ls -l /tmp/adbkb.apk >> "$OUT/ui_nav.txt"
adb install -r /tmp/adbkb.apk >> "$OUT/ui_nav.txt" 2>&1
KB_IME=$(adb shell ime list -a -s | grep -i adbkeyboard | head -1); echo "kb ime: $KB_IME" >> "$OUT/ui_nav.txt"
[ -z "$KB_IME" ] && KB_IME=com.android.adbkeyboard/.AdbIME
adb shell pm list packages | grep -i adbkeyboard >> "$OUT/ui_nav.txt" 2>&1
adb shell ime list -a >> "$OUT/ui_nav.txt" 2>&1
adb shell ime enable "$KB_IME" >> "$OUT/ui_nav.txt" 2>&1 && adb shell ime set "$KB_IME" >> "$OUT/ui_nav.txt" 2>&1 && sleep 2
adb shell settings get secure default_input_method >> "$OUT/ui_nav.txt" 2>&1
adb shell am broadcast -a ADB_INPUT_B64 --es msg "$(printf 'أذكار' | base64 -w0)"; sleep 3
adb shell input keyevent 66; sleep 2
[ -n "$ORIG_IME" ] && adb shell ime set "$ORIG_IME"
dump "$OUT/ui_hisn_search.xml"
adb exec-out screencap -p > "$OUT/hisn_search_favorites.png"
python3 - "$OUT" << 'PYQ'
import sys, re
def norm(s):
    return ''.join(c for c in s if not (0x064B <= ord(c) <= 0x0652 or ord(c) in (0x0670, 0x0640)))
out = sys.argv[1]
xml = norm(open(out + '/ui_hisn_search.xml').read())
m = re.search(r'class="android\.widget\.EditText"[^>]*text="([^"]*)"', xml)
typed = m.group(1) if m else ''
i_fav = xml.find('أذكار الصباح')
i_nonfav = xml.find('أذكار الاستيقاظ من النوم')
lines = []
lines.append('query typed into search field: ' + str('أذكار' in typed))
lines.append('full-collection span from favorites (non-favorite match present): ' + str(i_nonfav > 0))
lines.append('matching favorite pinned above non-favorite: ' + str(i_fav > 0 and i_nonfav > 0 and i_fav < i_nonfav))
open(out + '/hisn_search_check.txt', 'w').write('\n'.join(lines) + '\n')
PYQ
# Reminders tags chip group
relaunch
dump "$OUT/ui_tabs4.xml"
XY=$(tap_text "التذكيرات" "$OUT/ui_tabs4.xml"); echo "azkar tab: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 5; dismiss_anr
adb exec-out screencap -p > "$OUT/azkar_chips_before.png"
dump "$OUT/ui_azkar.xml"
record_tap azkar_slide "$OUT/ui_azkar.xml" "أذكار الصباح"
adb exec-out screencap -p > "$OUT/azkar_chips_after.png"
# Fajr alarm before/after chip rows (via drawer)
relaunch
dump "$OUT/ui_tabs3.xml"
XY=$(tap_desc "القائمة" "$OUT/ui_tabs3.xml"); echo "drawer: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
dump "$OUT/ui_drawer.xml"
XY=$(tap_text "منبه صلاة الفجر" "$OUT/ui_drawer.xml"); echo "fajr drawer item: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 5; dismiss_anr
adb exec-out screencap -p > "$OUT/fajr_chips_before.png"
dump "$OUT/ui_fajr.xml"
record_tap fajr_slide "$OUT/ui_fajr.xml" "5 دقائق"
adb exec-out screencap -p > "$OUT/fajr_chips_after.png"
# ===== 3.3.3 digits selector: example labels invariant under the global numeral setting (his spec: the ONLY exempt place)
open_settings
adb shell input swipe 540 1700 540 600 350; sleep 2
dump "$OUT/ui_digits_latin.xml"
adb exec-out screencap -p > "$OUT/digits_latin_selected.png"
XY=$(tap_text "أرقام هندية  ١٢٣" "$OUT/ui_digits_latin.xml"); echo "digits hindi opt: $XY" >> "$OUT/ui_nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
dump "$OUT/ui_digits_hindi.xml"
adb exec-out screencap -p > "$OUT/digits_hindi_selected.png"
relaunch
dump "$OUT/ui_tabs_hindi.xml"
python3 - "$OUT" << 'PYD'
import sys, re
out = sys.argv[1]
latin = open(out + '/ui_digits_latin.xml').read()
hindi = open(out + '/ui_digits_hindi.xml').read()
tabs = open(out + '/ui_tabs_hindi.xml').read()
h = 'أرقام هندية  ١٢٣'
a = 'أرقام عربية  1234'
lines = []
lines.append('latin selected - هندية label literal: ' + str(h in latin) + ' / عربية label literal: ' + str(a in latin))
lines.append('hindi selected - هندية label literal: ' + str(h in hindi) + ' / عربية label literal: ' + str(a in hindi))
lines.append('labels invariant under both settings: ' + str(h in latin and a in latin and h in hindi and a in hindi))
lines.append('global conversion still active elsewhere (Indic digits on tabs after selecting هندية): ' + str(bool(re.search(r'[٠-٩]', tabs))))
open(out + '/digits_check.txt', 'w').write('\n'.join(lines) + '\n')
PYD
# 3.3.3 REVIEW PROTOTYPE: glass/frosted background candidates over the real wallpaper (dark+light)
adb shell cmd uimode night yes
adb shell am start -S -W -n $PKG/com.example.GlassProtoCheck >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/glass_proto_night.png"
adb shell cmd uimode night no
adb shell am start -S -W -n $PKG/com.example.GlassProtoCheck >/dev/null 2>&1; sleep 8
adb exec-out screencap -p > "$OUT/glass_proto_day.png"
adb shell cmd uimode night yes
adb logcat -d -s GlassProto > "$OUT/glass_proto.txt"
for f in glass_board_light_day.png glass_board_light_night.png glass_board_dark_day.png glass_board_dark_night.png glass_board_busy_day.png glass_board_busy_night.png; do
  adb pull "/sdcard/Android/data/$PKG/files/$f" "$OUT/$f" >> "$OUT/ui_nav.txt" 2>&1
done

# ===== 3.3.3 widget evidence: D (عداد الصلاة countdown without seconds), E (HeroLarge removed), F (NextPrayer 2x1)
adb shell am start -S -W -n $PKG/com.example.WidgetRenderCheck >/dev/null 2>&1; sleep 12
FILES_DIR=/sdcard/Android/data/$PKG/files
adb shell ls "$FILES_DIR" > "$OUT/rendercheck_ls.txt" 2>&1
for f in widget_light_Clock.png widget_dark_Clock.png preview_light_Clock.png widget_light_NextPrayer.png preview_light_NextPrayer.png preview_light_Hero.png widget_glass_Hero.png widget_glass_NextPrayer.png widget_glass_Clock.png widget_glass_Schedule.png widget_prefs.txt actual_prayers.txt; do
  adb pull "$FILES_DIR/$f" "$OUT/$f" >> "$OUT/ui_nav.txt" 2>&1
done
adb shell dumpsys appwidget > "$OUT/appwidget_dumpsys.txt" 2>&1
python3 - "$OUT" << 'PYW'
import sys
out = sys.argv[1]
d = open(out + '/appwidget_dumpsys.txt').read()
lines = []
lines.append('HeroLarge provider gone from appwidget service: ' + str('HeroLargeWidgetProvider' not in d))
lines.append('Hero provider still registered: ' + str('HeroWidgetProvider' in d))
lines.append('NextPrayer provider registered: ' + str('NextPrayerWidgetProvider' in d))
open(out + '/widget_check.txt', 'w').write('\n'.join(lines) + '\n')
PYW
