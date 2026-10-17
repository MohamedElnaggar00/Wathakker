#!/bin/bash
# usage: emu_verify_310.sh <apk> <outdir> - verifies 3.1.0: bell/alarm merge, 4 tabs, Location & calculation screen, language switch, rotation, process death, boot reschedule
APK=$1; OUT=$2
mkdir -p "$OUT"
SUM="$OUT/SUMMARY.txt"; : > "$SUM"
say() { echo "$1" | tee -a "$SUM"; }
adb uninstall com.wathakker.app >/dev/null 2>&1 || true
adb install -g "$APK" > "$OUT/install.txt" 2>&1
adb shell pm grant com.wathakker.app android.permission.POST_NOTIFICATIONS || true
adb shell settings put global hide_error_dialogs 1 || true
adb logcat -c
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity > "$OUT/launch.txt" 2>&1
sleep 10
shot() { adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; }
dump() { adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1; [ -s /tmp/u.xml ] && [ $(wc -c < /tmp/u.xml) -gt 500 ] || echo "WARN: uiautomator dump unhealthy at $(date +%T)" >> "$OUT/dump_health.txt"; }
# find_center <text|desc> <value> -> prints "x y" of first matching node's center
find_center() {
python3 - "$1" "$2" <<'PY'
import re,sys,os
kind,val=sys.argv[1],sys.argv[2]
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
attr='text' if kind=='text' else 'content-desc'
for m in re.finditer(attr+r'="([^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    if m.group(1)==val:
        a,b,c,d=int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))
        print((a+c)//2,(b+d)//2); sys.exit(0)
# also match nodes where bounds come before the attribute
for m in re.finditer(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"[^>]*?'+attr+r'="([^"]*)"',x):
    if m.group(5)==val:
        a,b,c,d=int(m.group(1)),int(m.group(2)),int(m.group(3)),int(m.group(4))
        print((a+c)//2,(b+d)//2); sys.exit(0)
PY
}
has_text() { python3 - "$1" <<'PY'
import sys,os
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
sys.exit(0 if sys.argv[1] in x else 1)
PY
}
# seekbar_below <y> -> "cx cy" of the first SeekBar node whose top edge is below y
seekbar_below() { python3 - "$1" <<'PY'
import re,sys,os
ymin=int(sys.argv[1])
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
best=None
for m in re.finditer(r'<node[^>]*>',x):
    tag=m.group(0)
    if 'SeekBar' not in tag: continue
    b=re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',tag)
    if not b: continue
    a,bb,c,d=map(int,b.groups())
    if bb>ymin and (best is None or bb<best[1]): best=(a,bb,c,d)
if best: print((best[0]+best[2])//2,(best[1]+best[3])//2)
PY
}
count_seekbars() { python3 - <<'PY'
import re,os
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
print(len([t for t in re.findall(r'<node[^>]*>',x) if 'SeekBar' in t]))
PY
}
dismiss_anr() {
  for k in 1 2 3; do
    dump
    C=$(python3 - <<'PY'
import re, os
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
if "isn't responding" in x or 'isn\u2019t responding' in x or 'not responding' in x:
    m=re.search(r'text="Wait"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x)
    if m:
        a,b,c,d=map(int,m.groups()); print((a+c)//2,(b+d)//2)
PY
)
    [ -z "$C" ] && break
    echo "ANR dismissed at $C" >> "$OUT/anr.txt"
    adb shell input tap $C; sleep 3
  done
}
back_to_prayer() { # press BACK until the prayer screen (bell_0) is visible; never backs past it
  for i in 1 2 3; do
    dump
    [ -n "$(find_center desc bell_0)" ] && return 0
    adb shell input keyevent KEYCODE_BACK; sleep 2
  done
  dump
}
scroll_until() { # <text> - swipe up until exact text node is composed (LazyColumn renders visible rows only)
  local i
  for i in 1 2 3 4; do
    dump
    [ -n "$(find_center text "$1")" ] && return 0
    adb shell input swipe 540 1800 540 700 400; sleep 2
  done
  dump
}
tap_node() { # <text|desc> <value> <label> - returns nonzero if not found
  local C=$(find_center "$1" "$2")
  if [ -z "$C" ]; then say "FAIL: node not found ($1=$2) [$3]"; return 1; fi
  adb shell input tap $C; sleep 2; return 0
}
prayer_time() { # <prayer Arabic name> -> prints time text on same row from current dump
python3 - "$1" <<'PY'
import re,sys,os
name=sys.argv[1]
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
nodes=[]
for m in re.finditer(r'text="([^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    nodes.append((m.group(1),int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))))
rows=[n for n in nodes if n[0]==name]
for _,a,b,c,d in rows:
    for t,a2,b2,c2,d2 in nodes:
        if re.match(r'^[0-9\u0660-\u0669]{1,2}:[0-9\u0660-\u0669]{2}',t) and abs(((b+d)//2)-((b2+d2)//2))<40:
            print(t); sys.exit(0)
sys.exit(1)
PY
}

ensure_ready() { # absorb slow-emulator ANRs (incl. Pixel Launcher) until the prayer screen is interactive
  for i in 1 2 3 4 5 6; do
    dismiss_anr
    dump
    [ -n "$(find_center desc bell_0)" ] && return 0
    sleep 5
  done
  # dump may be dead because a system ANR dialog blocks idle state: blind-tap its Wait button and retry once
  echo "WARN: dump unhealthy; blind ANR dismiss attempted" >> "$OUT/dump_health.txt"
  adb shell input tap 556 1357; sleep 4
  dismiss_anr; dump
}
fg_guard() { # a stray BACK or config change can drop us to the launcher: relaunch if our app is not focused
  local F
  F=$(adb shell dumpsys window 2>/dev/null | grep -m1 "mCurrentFocus")
  case "$F" in
    *com.wathakker.app*) return 0;;
  esac
  echo "INFO: app not foreground ($F); relaunching" >> "$OUT/anr.txt"
  adb shell am start -W -n com.wathakker.app/com.example.MainActivity >> "$OUT/launch.txt" 2>&1
  sleep 6; dismiss_anr
}
ensure_ready
shot 00-prayer

# CHECK 1: six bells (bell_0..bell_5 content descriptions)
dump
NB=0; for i in 0 1 2 3 4 5; do [ -n "$(find_center desc bell_$i)" ] && NB=$((NB+1)); done
[ "$NB" = 6 ] && say "PASS: 6 prayer bells present" || say "FAIL: only $NB/6 bells found"

# CHECK 2: 4 tabs (Prayer/Azkar/Hisn/More), no Fajr tab
T=0
for t in "مواعيد الصلاة" "الأذكار" "حصن المسلم" "السبحة"; do has_text "$t" && T=$((T+1)); done
[ "$T" = 4 ] && say "PASS: 4 main tabs present" || say "FAIL: $T/4 tab labels found"

# CHECK 2b: Qibla screen renders (compass icon in prayer header, desc القبلة)
tap_node desc "القبلة" "Qibla header icon" && {
  sleep 3; dump
  has_text "القبلة" && say "PASS: Qibla screen opened" || say "FAIL: Qibla screen missing"
  shot 02b-qibla
  adb shell input keyevent KEYCODE_BACK; sleep 2
}
  dump

# CHECK 3: tap Fajr bell -> exact alarm scheduled
FAJR_BEFORE=$(prayer_time "الفجر")
tap_node desc bell_0 "toggle Fajr bell" && {
  sleep 2
  adb shell dumpsys alarm > "$OUT/alarms_after_toggle.txt" 2>&1
  grep -q "com.wathakker.app" "$OUT/alarms_after_toggle.txt" && say "PASS: exact alarm scheduled after bell toggle" || say "FAIL: no alarm in dumpsys after bell toggle"
}
shot 01-bell-toggled

# CHECK 4: long-press bell -> per-prayer alert dialog
BL=$(find_center desc bell_0)
if [ -n "$BL" ]; then
  adb shell input swipe $BL $BL 900; sleep 3
  dump
  has_text "نوع التنبيه" && say "PASS: alert dialog opened (alert type visible)" || say "FAIL: alert dialog did not open"
  NS=$(count_seekbars)
  shot 02-alert-dialog
  # the snooze slider sits below the fold: scroll the dialog content to reveal it, then count again
  adb shell input swipe 540 1400 540 900 500; sleep 2
  dump
  NSB=$(count_seekbars)
  shot 02d-dialog-scrolled-snooze
  if { [ "$NS" -ge 2 ] && [ "$NSB" -ge 1 ] && has_text "مدة الغفوة"; } || [ "$NS" -ge 3 ]; then
    say "PASS: alert dialog has 3 One UI sliders ($NS visible at top, $NSB after scroll to snooze)"
  else
    say "FAIL: expected 3 sliders in alert dialog, found $NS before scroll, $NSB after"
  fi
  adb shell input swipe 540 900 540 1400 500; sleep 2   # scroll dialog content back up
  # large font scale (his phone): a font change recreates the activity and DROPS the dialog,
  # so set the font first, then reopen the dialog and scroll it to the snooze slider
  adb shell settings put system font_scale 1.3; sleep 3
  fg_guard
  dump
  BL=$(find_center desc bell_0)
  if [ -n "$BL" ]; then
    adb shell input swipe $BL $BL 900; sleep 3
    dump
    adb shell input swipe 540 1400 540 900 500; sleep 2
    dump
    shot 02c-alert-dialog-font13
    if has_text "مدة الغفوة" && [ "$(count_seekbars)" -ge 1 ]; then
      say "PASS: snooze slider reachable in dialog at font_scale 1.3"
    else
      say "FAIL: snooze row not reachable at font_scale 1.3"
    fi
    tap_node text "إلغاء" "Dialog cancel" || adb shell input keyevent KEYCODE_BACK
    sleep 2
  else
    say "FAIL: could not reopen alert dialog at font_scale 1.3"
  fi
  adb shell settings put system font_scale 1.0; sleep 3
  fg_guard
  dump
fi

# CHECK 5: Location & calculation screen renders + per-prayer offset changes the time
# settings entry: menu (hamburger, desc القائمة) -> drawer -> الإعدادات. The gear has no content-desc and the
# Qibla compass sits at the old fixed coordinate, so never use fixed coordinates for the header.
goto_settings() {
  fg_guard
  dump; tap_node desc "القائمة" "Menu button" || true; sleep 2
  dump; tap_node text "الإعدادات" "Settings drawer row" || true; sleep 3
  dump
}
goto_location() {
  goto_settings
  tap_node text "تغيير الموقع" "Location & calculation row" || true; sleep 2
}
dismiss_anr
goto_settings
dismiss_anr; sleep 1
shot 03-settings
tap_node text "تغيير الموقع" "Location & calculation row" || true
dismiss_anr; sleep 2
dump
has_text "الموقع والحساب" && say "PASS: Location & calculation screen opened" || say "FAIL: Location & calculation screen missing"
shot 04-location-screen
# adjustments are below the fold: scroll until the Fajr row is composed (LazyColumn renders visible rows only)
scroll_until "الفجر"
shot 04b-location-adjustments
LC_FAJR=$(find_center text "الفجر")
if [ -n "$LC_FAJR" ]; then
  set -- $LC_FAJR
  SL=$(seekbar_below $2)
  if [ -n "$SL" ]; then
    set -- $SL
    # RTL slider: increasing is toward the LEFT; drag left ~120px for a few minutes
    adb shell input swipe $1 $2 $(($1-120)) $2 700; sleep 2
    shot 04c-offset-slider-dragged
    back_to_prayer
    FAJR_AFTER=$(prayer_time "الفجر")
    say "INFO: Fajr time before=$FAJR_BEFORE after=$FAJR_AFTER (slider drag left)"
    if [ -n "$FAJR_BEFORE" ] && [ -n "$FAJR_AFTER" ] && [ "$FAJR_BEFORE" != "$FAJR_AFTER" ]; then
      say "PASS: per-prayer offset slider changed Fajr time ($FAJR_BEFORE -> $FAJR_AFTER)"
      goto_location
      scroll_until "الفجر"
      LC3=$(find_center text "الفجر")
      SL3=""
      [ -n "$LC3" ] && { set -- $LC3; SL3=$(seekbar_below $2); }
      if [ -n "$SL3" ]; then
        set -- $SL3
        adb shell input tap $1 $2; sleep 2   # center-zero slider: tapping the track center snaps back to 0
      fi
      back_to_prayer
      FAJR_REST=$(prayer_time "الفجر")
      [ "$FAJR_REST" = "$FAJR_BEFORE" ] && say "PASS: offset restored ($FAJR_REST)" || say "WARN: restore landed on $FAJR_REST (expected $FAJR_BEFORE)"
    else
      say "FAIL: Fajr time unchanged after slider drag"
      back_to_prayer
    fi
  else
    say "FAIL: no offset slider found under Fajr row"
    back_to_prayer
  fi
else
  say "FAIL: no Fajr row on Location screen"
  back_to_prayer
fi

# CHECK 5b: Hijri converter entry is in the drawer (and gone from Settings)
dump
has_text "محول التاريخ" && say "FAIL: converter row still on Settings screen" || say "PASS: converter row removed from Settings"
back_to_prayer
fg_guard
tap_node desc "القائمة" "Menu button" || true; sleep 2
dump
if tap_node text "محول التاريخ" "Drawer converter row"; then
  sleep 2; dump
  has_text "محول التاريخ" && say "PASS: converter opened from drawer" || say "FAIL: converter screen did not open from drawer"
  shot 03b-converter-from-drawer
  adb shell input keyevent KEYCODE_BACK; sleep 2
else
  say "FAIL: converter row missing from drawer"
fi
back_to_prayer

# CHECK 6: live language switch AR -> EN -> AR
dismiss_anr
goto_settings
scroll_until "اللغة"
if tap_node text "اللغة" "Language row"; then
  sleep 2; dump
  if tap_node text "English" "English option"; then
    sleep 3; dump
    has_text "Settings" && say "PASS: live switch to English" || say "FAIL: UI not English after switch"
    shot 05-english
    scroll_until "Language"
    tap_node text "Language" "Language row EN" || true; sleep 2
    dump
    tap_node text "العربية" "Arabic option" || true; sleep 3
    dump; has_text "الإعدادات" && say "PASS: switched back to Arabic" || say "FAIL: Arabic restore failed"
  else
    say "FAIL: language options not found"
  fi
else
  say "FAIL: language row not found"
fi
back_to_prayer

# CHECK 7: rotation
dismiss_anr
fg_guard
adb shell settings put system accelerometer_rotation 0
adb shell settings put system user_rotation 1; sleep 3
shot 06-landscape
dump; has_text "الصلاة" && say "PASS: rotation to landscape keeps prayer screen" || say "FAIL: rotation broke UI"
adb shell settings put system user_rotation 0; sleep 2

# CHECK 7b: light mode renders (header pills, bottom bar, dialog follow the light scheme)
adb shell cmd uimode night no
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity >> "$OUT/launch.txt" 2>&1
sleep 8; dismiss_anr; dump
[ -n "$(find_center desc bell_0)" ] && say "PASS: prayer screen renders in light mode" || say "FAIL: prayer screen broken in light mode"
shot 06b-light-prayer
goto_settings
shot 06c-light-settings
back_to_prayer
BL=$(find_center desc bell_0)
if [ -n "$BL" ]; then
  adb shell input swipe $BL $BL 900; sleep 3
  dump
  has_text "نوع التنبيه" && say "PASS: alert dialog renders in light mode" || say "WARN: alert dialog not opened in light mode"
  shot 06d-light-dialog
  adb shell input keyevent KEYCODE_BACK; sleep 2
fi
adb shell cmd uimode night yes
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity >> "$OUT/launch.txt" 2>&1
sleep 8; dismiss_anr; dump

# CHECK 7c: dark mode evidence (his feedback screenshots were dark)
fg_guard
shot 06e-dark-prayer
goto_settings
shot 06f-dark-settings
back_to_prayer
BL=$(find_center desc bell_0)
if [ -n "$BL" ]; then
  adb shell input swipe $BL $BL 900; sleep 3
  dump
  has_text "نوع التنبيه" && say "PASS: alert dialog renders in dark mode" || say "WARN: alert dialog not opened in dark mode"
  shot 06g-dark-dialog
  adb shell input keyevent KEYCODE_BACK; sleep 2
fi

# CHECK 8: process death -> bells persist
adb shell am kill com.wathakker.app; sleep 3
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity >> "$OUT/launch.txt" 2>&1
sleep 8; dismiss_anr; dump
[ -n "$(find_center desc bell_0)" ] && say "PASS: bells persist after process death" || say "FAIL: bells missing after process death"
shot 07-after-process-death

# CHECK 9: boot broadcast reschedules without crash
adb shell am broadcast -a android.intent.action.BOOT_COMPLETED -p com.wathakker.app > "$OUT/boot_broadcast.txt" 2>&1 || true
sleep 4
adb shell dumpsys alarm > "$OUT/alarms_after_boot.txt" 2>&1
say "INFO: boot broadcast sent (see alarms_after_boot.txt)"

# CHECK 10: jank pass across the 4 tabs
dismiss_anr
adb shell input tap 150 2221; sleep 2   # first tab
adb shell dumpsys gfxinfo com.wathakker.app reset
for x in 150 460 750 930 750 460 150; do dismiss_anr; adb shell input tap $x 2221; sleep 2; done
adb shell dumpsys gfxinfo com.wathakker.app > "$OUT/gfxinfo.txt"
shot 08-after-tabs

# CHECK 11: widget render harness - renders every widget kind x 3 background modes to PNGs on-device
adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck > "$OUT/rendercheck.txt" 2>&1 || true
sleep 4
grep -q "Status: ok" "$OUT/rendercheck.txt" && say "PASS: widget render harness launched" || say "FAIL: widget render harness did not launch"
mkdir -p "$OUT/widget-renders"
adb shell ls /sdcard/Android/data/com.wathakker.app/files/ > "$OUT/widget-files.txt" 2>&1 || true
adb pull /sdcard/Android/data/com.wathakker.app/files/ "$OUT/widget-renders" >> "$OUT/widget-files.txt" 2>&1 || true
NPNG=$(ls "$OUT"/widget-renders/widget_*.png 2>/dev/null | wc -l)
NERR=$(ls "$OUT"/widget-renders/widget_*.err 2>/dev/null | wc -l)
[ "$NERR" = 0 ] && [ "$NPNG" -ge 27 ] && say "PASS: $NPNG widget renders, no errors" || say "FAIL: widget renders png=$NPNG err=$NERR"
shot 09-widget-render

# logcat + crash scan
adb logcat -d > "$OUT/logcat.txt" 2>&1
grep -c "FATAL EXCEPTION" "$OUT/logcat.txt" > "$OUT/fatal_count.txt"
F=$(cat "$OUT/fatal_count.txt")
[ "$F" = "0" ] && say "PASS: no fatal exceptions in logcat" || say "FAIL: $F fatal exceptions (see logcat.txt)"

say "DONE 3.1.0 verify"
cat "$SUM"
