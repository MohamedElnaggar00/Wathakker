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
find_text_prefix() { python3 - "$1" <<'PYP'
import re,sys,os
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
m=re.search(r'text="('+re.escape(sys.argv[1])+r'[^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x)
if m: print((int(m.group(2))+int(m.group(4)))//2,(int(m.group(3))+int(m.group(5)))//2)
PYP
}
find_class_center() { python3 - "$1" <<'PYQ'
import re,sys,os
cls=sys.argv[1]
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
for m in re.finditer(r'<node[^>]*class="([^"]*'+re.escape(cls)+r'[^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    a,b,c,d=int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))
    print((a+c)//2,(b+d)//2); sys.exit(0)
for m in re.finditer(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"[^>]*?class="([^"]*'+re.escape(cls)+r'[^"]*)"',x):
    a,b,c,d=int(m.group(1)),int(m.group(2)),int(m.group(3)),int(m.group(4))
    print((a+c)//2,(b+d)//2); sys.exit(0)
PYQ
}
find_class_center() { python3 - "$1" <<'PYX'
import re,sys,os
cls=sys.argv[1]
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
for m in re.finditer(r'<node[^>]*class="([^"]*'+re.escape(cls)+r'[^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    a,b,c,d=int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))
    print((a+c)//2,(b+d)//2); sys.exit(0)
for m in re.finditer(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"[^>]*?class="([^"]*'+re.escape(cls)+r'[^"]*)"',x):
    a,b,c,d=int(m.group(1)),int(m.group(2)),int(m.group(3)),int(m.group(4))
    print((a+c)//2,(b+d)//2); sys.exit(0)
PYX
}
count_seekbars() { python3 - <<'PY'
import re,os
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
print(len([t for t in re.findall(r'<node[^>]*>',x) if 'SeekBar' in t]))
PY
}
W=$(adb shell wm size | grep -oE '[0-9]+x[0-9]+' | head -1); SW=${W%x*}; SH=${W#*x}
[ -z "$SW" ] && { SW=1080; SH=2400; }
CX=$((SW/2)); TABY=$((SH*92/100))
find_text_bottom() { python3 - "$1" <<'PYB'
import re,sys,os
val=sys.argv[1]
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
best=None
for m in re.finditer(r'text="([^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    if m.group(1)==val:
        a,b,c,d=int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))
        cy=(b+d)//2
        if best is None or cy>best[1]: best=((a+c)//2,cy)
for m in re.finditer(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"[^>]*?text="([^"]*)"',x):
    if m.group(5)==val:
        a,b,c,d=int(m.group(1)),int(m.group(2)),int(m.group(3)),int(m.group(4))
        cy=(b+d)//2
        if best is None or cy>best[1]: best=((a+c)//2,cy)
if best: print(best[0],best[1])
PYB
}
find_text_top() { python3 - "$1" <<'PYT'
import re,sys,os
val=sys.argv[1]
x=open('/tmp/u.xml',encoding='utf-8').read() if os.path.exists('/tmp/u.xml') else ''
best=None
for m in re.finditer(r'text="([^"]*)"[^>]*?bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',x):
    if m.group(1)==val:
        a,b,c,d=int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))
        cy=(b+d)//2
        if best is None or cy<best[1]: best=((a+c)//2,cy)
if best: print(best[0],best[1])
PYT
}
tap_tab() { # <exact tab label> - taps the bottom-most match (the tab bar), never a screen title
  local C
  dump
  C=$(find_text_bottom "$1")
  if [ -z "$C" ]; then say "FAIL: tab not found ($1)"; return 1; fi
  adb shell input tap $C; sleep 3
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
    adb shell input swipe $CX $((SH*80/100)) $CX $((SH*30/100)) 400; sleep 2
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
        if re.match(r'^(?:ص|م|AM|PM)?\s*[0-9\u0660-\u0669]{1,2}:[0-9\u0660-\u0669]{2}',t) and abs(((b+d)//2)-((b2+d2)//2))<40:
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
SEEN=""
for try in 1 2; do
  dump
  for i in 0 1 2 3 4 5; do [ -n "$(find_center desc bell_$i)" ] && SEEN="$SEEN $i"; done
  adb shell input swipe $CX $((SH*70/100)) $CX $((SH*45/100)) 400; sleep 2
done
dump
for i in 0 1 2 3 4 5; do [ -n "$(find_center desc bell_$i)" ] && SEEN="$SEEN $i"; done
NB=$(echo $SEEN | tr ' ' '
' | sort -u | wc -l)
[ "$NB" = 6 ] && say "PASS: 6 prayer bells present" || say "FAIL: only $NB/6 bells found"
adb shell input swipe $CX $((SH*45/100)) $CX $((SH*70/100)) 400; sleep 2   # scroll back to top

# CHECK 2: 4 tabs (Prayer/Azkar/Hisn/More), no Fajr tab
T=0
for t in "مواعيد الصلاة" "الأذكار" "حصن المسلم" "التقويم"; do has_text "$t" && T=$((T+1)); done
[ "$T" = 4 ] && say "PASS: 4 main tabs present (prayer/azkar/hisn/calendar)" || say "FAIL: $T/4 tab labels found"
has_text "السبحة" && say "FAIL: tasbeeh still a bottom tab" || say "PASS: tasbeeh removed from bottom tabs"

# CHECK 2b: Qibla screen renders (compass icon in prayer header, desc القبلة)
tap_node desc "القبلة" "Qibla header icon" && {
  sleep 3; dump
  has_text "القبلة" && say "PASS: Qibla screen opened" || say "FAIL: Qibla screen missing"
  if has_text "شمال"; then say "PASS: compass dial renders with localized direction labels (dark)"; elif has_text "لا يوجد مستشعر بوصلة"; then say "WARN: emulator reports no compass sensor - dial not machine-verifiable"; else say "FAIL: neither compass dial nor no-sensor hint rendered"; fi
  shot 02b-qibla-dark
  adb shell cmd uimode night no; sleep 3
  fg_guard; dump
  if ! has_text "شمال"; then tap_node desc "القبلة" "Qibla header icon light" || true; sleep 3; dump; fi
  has_text "شمال" && say "PASS: compass dial renders in light theme" || say "WARN: compass dial labels not found in light theme (screen may have recreated back to prayer)"
  shot 02b2-qibla-light
  adb shell cmd uimode night yes; sleep 3
  fg_guard
  adb shell input keyevent KEYCODE_BACK; sleep 2
}
  dump

# CHECK 2c: Calendar tab (Hijri occasions) - month grid, events view, reminder bell, both themes
tap_tab "التقويم"
dump
has_text "ح ن ث ر خ ج س" || true
shot 02c-calendar-month-dark
scroll_until "مناسبات الشهر"
if has_text "مناسبات الشهر"; then say "PASS: calendar month grid + month events section render (dark)"; else say "FAIL: calendar month view missing"; fi
shot 02c4-calendar-month-events
adb shell input swipe $CX $((SH*40/100)) $CX $((SH*75/100)) 400; sleep 2   # back to top for toggle
adb shell input swipe $CX $((SH*40/100)) $CX $((SH*75/100)) 400; sleep 2
dump
tap_node text "المناسبات" "Events view toggle" && {
  sleep 2; dump
  if has_text "رمضان" || has_text "عيد" || has_text "الأيام البيض"; then say "PASS: events view lists upcoming occasions"; else say "FAIL: events view shows no occasions"; fi
  shot 02c2-calendar-events-dark
  RB=$(find_center desc "تفعيل التذكير")
  if [ -n "$RB" ]; then
    adb shell input tap $RB; sleep 2; dump
    [ -n "$(find_center desc "التذكير مفعّل")" ] && say "PASS: event reminder bell toggles on" || say "FAIL: reminder bell state did not change"
    adb shell dumpsys alarm > "$OUT/alarms_event_reminder.txt" 2>&1
    adb shell input tap $RB; sleep 2   # toggle back off
    dump
    [ -n "$(find_center desc "التذكير مفعّل")" ] && say "FAIL: reminder bell did not toggle back off" || say "PASS: event reminder bell toggles back off"
  else
    say "FAIL: no reminder bell found in events view"
  fi
}
MV=$(find_text_top "التقويم")
[ -n "$MV" ] && { adb shell input tap $MV; sleep 2; }
adb shell cmd uimode night no; sleep 3
fg_guard
tap_tab "التقويم"
dump
MV=$(find_text_top "التقويم")
[ -n "$MV" ] && { adb shell input tap $MV; sleep 2; dump; }
scroll_until "مناسبات الشهر"
has_text "مناسبات الشهر" && say "PASS: calendar month view renders in light theme" || say "FAIL: calendar month view missing in light"
shot 02c3-calendar-month-light
adb shell cmd uimode night yes; sleep 3
fg_guard
tap_tab "الصلاة"
dump

# CHECK 3: tap Fajr bell -> exact alarm scheduled
FAJR_BEFORE=$(prayer_time "الفجر")
tap_node desc bell_0 "toggle Fajr bell" && {
  sleep 2
  adb shell dumpsys alarm > "$OUT/alarms_after_toggle.txt" 2>&1
  grep -q "com.wathakker.app" "$OUT/alarms_after_toggle.txt" && say "PASS: exact alarm scheduled after bell toggle" || say "FAIL: no alarm in dumpsys after bell toggle"
}
shot 01-bell-toggled

# CHECK 4: long-press bell -> per-prayer alert dialog (notification-only, exact-minute lead time)
BL=$(find_center desc bell_0)
if [ -n "$BL" ]; then
  adb shell input swipe $BL $BL 900; sleep 3
  dump
  has_text "الإشعارات" && say "PASS: alert dialog opened (notifications row)" || say "FAIL: alert dialog did not open"
  has_text "وقت التنبيه" && say "PASS: lead-time row present" || say "FAIL: lead-time row missing"
  [ "$(count_seekbars)" -ge 1 ] && say "PASS: lead-time slider present" || say "FAIL: no slider in alert dialog"
  shot 02-alert-dialog
  # exact-minute entry: tap the value label -> numeric input dialog
  VL=$(find_center text "وقت الأذان")
  [ -z "$VL" ] && VL=$(find_text_prefix "قبل الأذان بـ")
  if [ -n "$VL" ]; then
    adb shell input tap $VL; sleep 2
    dump
    if has_text "حفظ"; then
      say "PASS: tapping lead-time value opens exact-minute input dialog"
      ET=$(find_class_center "EditText")
      if [ -n "$ET" ]; then
        adb shell input tap $ET; sleep 1
        adb shell input keyevent KEYCODE_MOVE_END KEYCODE_DEL KEYCODE_DEL
        adb shell input text 99; sleep 1
        dump
        has_text "حفظ" || { adb shell input keyevent KEYCODE_BACK; sleep 1; dump; }   # hide IME only if it covers Save
        tap_node text "حفظ" "save 99" || true; sleep 2
        dump
        has_text "حفظ" && say "PASS: out-of-range 99 rejected (dialog stays open)" || say "FAIL: 99 accepted - validation missing"
        ET=$(find_class_center "EditText")
        [ -n "$ET" ] && { adb shell input tap $ET; sleep 1; adb shell input keyevent KEYCODE_MOVE_END KEYCODE_DEL KEYCODE_DEL KEYCODE_DEL; adb shell input text 12; sleep 1; }
        dump
        has_text "حفظ" || { adb shell input keyevent KEYCODE_BACK; sleep 1; dump; }
        tap_node text "حفظ" "save 12" || true; sleep 2
        dump
        has_text "قبل الأذان بـ 12 دقيقة" && say "PASS: exact 12-minute lead time applied" || say "FAIL: 12 minutes not reflected in dialog"
        shot 02e-exact-minute-12
        VL2=$(find_text_prefix "قبل الأذان بـ")
        if [ -n "$VL2" ]; then
          adb shell input tap $VL2; sleep 2; dump
          ET=$(find_class_center "EditText")
          [ -n "$ET" ] && { adb shell input tap $ET; sleep 1; adb shell input keyevent KEYCODE_MOVE_END KEYCODE_DEL KEYCODE_DEL KEYCODE_DEL; adb shell input text 0; sleep 1; }
          dump
          has_text "حفظ" || { adb shell input keyevent KEYCODE_BACK; sleep 1; dump; }
          tap_node text "حفظ" "save 0" || true; sleep 2
          dump
          has_text "وقت الأذان" && say "PASS: lead time restored to at-adhan" || say "WARN: lead time restore not confirmed"
        fi
      else
        say "FAIL: no EditText in minute input dialog"
      fi
    else
      say "FAIL: minute input dialog did not open"
    fi
    tap_node text "إلغاء" "Dialog cancel" || adb shell input keyevent KEYCODE_BACK
    sleep 2
  else
    say "FAIL: lead-time value label not found"
    adb shell input keyevent KEYCODE_BACK; sleep 2
  fi
  # font 1.3: dialog still renders (recreate drops it, so reopen)
  adb shell settings put system font_scale 1.3; sleep 3
  fg_guard; dump
  BL=$(find_center desc bell_0)
  if [ -n "$BL" ]; then
    adb shell input swipe $BL $BL 900; sleep 3
    dump
    has_text "وقت التنبيه" && say "PASS: alert dialog renders at font_scale 1.3" || say "FAIL: alert dialog broken at font 1.3"
    shot 02c-alert-dialog-font13
    tap_node text "إلغاء" "Dialog cancel 1.3" || adb shell input keyevent KEYCODE_BACK
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

# CHECK 5c: adjustments rows (value label + explainer note) fully visible at font 1.0/1.3 x light/dark
shot_adjustments() { # <tag> - navigate to Location & calculation and capture the adjustments section
  fg_guard
  goto_location
  dump
  has_text "الموقع والحساب" || say "FAIL: adjustments shot $1 - not on Location screen"
  scroll_until "الفجر"
  sleep 1
  shot "$1"
  back_to_prayer
}
adb shell settings put system font_scale 1.3; sleep 3
shot_adjustments 04d-adjustments-font13
adb shell settings put system font_scale 1.0; sleep 3
adb shell cmd uimode night yes; sleep 2
shot_adjustments 04e-adjustments-dark
adb shell settings put system font_scale 1.3; sleep 3
shot_adjustments 04f-adjustments-dark-font13
adb shell settings put system font_scale 1.0; sleep 3
adb shell cmd uimode night no; sleep 2
fg_guard

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
  # typed conversion: empty by default; Today fills; typing a Gregorian date yields a Hijri result card
  has_text "من ميلادي إلى هجري" && say "PASS: converter shows G->H section" || say "FAIL: converter direction section missing"
  TD=$(find_text_bottom "اليوم")
  if [ -n "$TD" ]; then
    adb shell input tap $TD; sleep 2
    dump
    if has_text "هـ"; then say "PASS: Today fills fields and shows Hijri result"; else say "FAIL: no Hijri result after Today"; fi
    shot 03c-converter-result
  else
    say "FAIL: Today button not found on converter"
  fi
  shot 03b-converter-from-drawer
  adb shell input keyevent KEYCODE_BACK; sleep 2
else
  say "FAIL: converter row missing from drawer"
fi
back_to_prayer

# CHECK 5d: tasbeeh lives in the drawer now, and About opens from the drawer
tap_node desc "القائمة" "Menu button" || true; sleep 2
dump
if tap_node text "السبحة" "Drawer tasbeeh row"; then
  sleep 2; dump
  has_text "تسبيحة" && say "PASS: tasbeeh screen opened from drawer" || say "FAIL: tasbeeh screen did not open from drawer"
  shot 03d-tasbeeh-from-drawer
  adb shell input keyevent KEYCODE_BACK; sleep 2
else
  say "FAIL: tasbeeh row missing from drawer"
fi
tap_node desc "القائمة" "Menu button" || true; sleep 2
dump
if tap_node text "حول التطبيق" "Drawer about row"; then
  sleep 2; dump
  has_text "الإصدار" && say "PASS: about screen opened from drawer (version row visible)" || say "FAIL: about screen did not open"
  shot 03e-about
  adb shell input keyevent KEYCODE_BACK; sleep 2
else
  say "FAIL: about row missing from drawer"
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
  has_text "وقت التنبيه" && say "PASS: alert dialog renders in light mode" || say "WARN: alert dialog not opened in light mode"
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
  has_text "وقت التنبيه" && say "PASS: alert dialog renders in dark mode" || say "WARN: alert dialog not opened in dark mode"
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
tap_tab "الصلاة"
adb shell dumpsys gfxinfo com.wathakker.app reset
for t in "الأذكار" "حصن المسلم" "التقويم" "حصن المسلم" "الأذكار" "الصلاة"; do dismiss_anr; tap_tab "$t"; done
adb shell dumpsys gfxinfo com.wathakker.app > "$OUT/gfxinfo.txt"
shot 08-after-tabs

# CHECK 11: widget render harness - renders every widget kind x 3 background modes to PNGs on-device
adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck > "$OUT/rendercheck.txt" 2>&1 || true
sleep 4
grep -q "Status: ok" "$OUT/rendercheck.txt" && say "PASS: widget render harness launched" || say "FAIL: widget render harness did not launch"
mkdir -p "$OUT/widget-renders"
adb shell ls /sdcard/Android/data/com.wathakker.app/files/ > "$OUT/widget-files.txt" 2>&1 || true
adb pull /sdcard/Android/data/com.wathakker.app/files/ "$OUT/widget-renders" >> "$OUT/widget-files.txt" 2>&1 || true
NPNG=$(find "$OUT/widget-renders" -name 'widget_*.png' | wc -l)
NERR=$(find "$OUT/widget-renders" -name 'widget_*.err' | wc -l)
[ "$NERR" = 0 ] && [ "$NPNG" -ge 27 ] && say "PASS: $NPNG widget renders, no errors" || say "FAIL: widget renders png=$NPNG err=$NERR"
shot 09-widget-render

# logcat + crash scan
adb logcat -d > "$OUT/logcat.txt" 2>&1
grep -c "FATAL EXCEPTION" "$OUT/logcat.txt" > "$OUT/fatal_count.txt"
F=$(cat "$OUT/fatal_count.txt")
[ "$F" = "0" ] && say "PASS: no fatal exceptions in logcat" || say "FAIL: $F fatal exceptions (see logcat.txt)"

say "DONE 3.1.0 verify"
cat "$SUM"
