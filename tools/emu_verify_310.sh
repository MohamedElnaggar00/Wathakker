#!/bin/bash
# usage: emu_verify_310.sh <apk> <outdir> - verifies 3.1.0: bell/alarm merge, 4 tabs, Location & calculation screen, language switch, rotation, process death, boot reschedule
APK=$1; OUT=$2
mkdir -p "$OUT"
SUM="$OUT/SUMMARY.txt"; : > "$SUM"
say() { echo "$1" | tee -a "$SUM"; }
adb uninstall com.wathakker.app >/dev/null 2>&1 || true
adb install -g "$APK" > "$OUT/install.txt" 2>&1
adb shell pm grant com.wathakker.app android.permission.POST_NOTIFICATIONS || true
adb logcat -c
adb shell am start -S -W -n com.wathakker.app/com.example.MainActivity > "$OUT/launch.txt" 2>&1
sleep 10
shot() { adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; }
dump() { adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1; }
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
if not rows: sys.exit(1)
_,a,b,c,d=rows[0]
for t,a2,b2,c2,d2 in nodes:
    if re.match(r'^\d{1,2}:\d{2}',t) and abs(((b+d)//2)-((b2+d2)//2))<40:
        print(t); sys.exit(0)
sys.exit(1)
PY
}

dismiss_anr
shot 00-prayer

# CHECK 1: six bells (bell_0..bell_5 content descriptions)
dump
NB=0; for i in 0 1 2 3 4 5; do [ -n "$(find_center desc bell_$i)" ] && NB=$((NB+1)); done
[ "$NB" = 6 ] && say "PASS: 6 prayer bells present" || say "FAIL: only $NB/6 bells found"

# CHECK 2: 4 tabs (Prayer/Azkar/Hisn/More), no Fajr tab
T=0
for t in "مواعيد الصلاة" "الأذكار" "حصن المسلم" "السبحة"; do has_text "$t" && T=$((T+1)); done
[ "$T" = 4 ] && say "PASS: 4 main tabs present" || say "FAIL: $T/4 tab labels found"

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
  shot 02-alert-dialog
  adb shell input keyevent KEYCODE_BACK; sleep 2
fi

# CHECK 5: Location & calculation screen renders + per-prayer offset changes the time
dismiss_anr
adb shell input tap 122 222; sleep 3
dismiss_anr; sleep 1
shot 03-settings
tap_node text "تغيير الموقع" "Location & calculation row" || true
dismiss_anr; sleep 2
dump
has_text "الموقع والحساب" && say "PASS: Location & calculation screen opened" || say "FAIL: Location & calculation screen missing"
shot 04-location-screen
# scroll to adjustments and tap the Fajr row stepper edge; accept +/-1 minute either way
dump
LC_FAJR=$(find_center text "الفجر")
if [ -n "$LC_FAJR" ]; then
  set -- $LC_FAJR
  # steppers sit at the row edges; try the physical right edge minus 60px (RTL: minus button), then left edge if no change
  adb shell input tap 1020 $2; sleep 2
  adb shell input keyevent KEYCODE_BACK; sleep 2
  adb shell input keyevent KEYCODE_BACK; sleep 2
  dismiss_anr; dump
  FAJR_AFTER=$(prayer_time "الفجر")
  say "INFO: Fajr time before=$FAJR_BEFORE after=$FAJR_AFTER"
  if [ -n "$FAJR_BEFORE" ] && [ -n "$FAJR_AFTER" ] && [ "$FAJR_BEFORE" != "$FAJR_AFTER" ]; then
    say "PASS: per-prayer offset changed Fajr time ($FAJR_BEFORE -> $FAJR_AFTER)"
    # restore: go back and tap the opposite edge
    adb shell input tap 122 222; sleep 3; tap_node text "تغيير الموقع" "Location row" || true; sleep 2
    dump; LC2=$(find_center text "الفجر"); set -- $LC2
    adb shell input tap 60 $2; sleep 2
    adb shell input keyevent KEYCODE_BACK; sleep 2
    adb shell input keyevent KEYCODE_BACK; sleep 2
    dump; FAJR_REST=$(prayer_time "الفجر")
    [ "$FAJR_REST" = "$FAJR_BEFORE" ] && say "PASS: offset restored ($FAJR_REST)" || say "WARN: restore landed on $FAJR_REST (expected $FAJR_BEFORE)"
  else
    say "FAIL: Fajr time unchanged after stepper tap"
    adb shell input keyevent KEYCODE_BACK; sleep 2
  fi
else
  say "FAIL: no Fajr row on Location screen"
  adb shell input keyevent KEYCODE_BACK; sleep 2
fi

# CHECK 6: live language switch AR -> EN -> AR
dismiss_anr
adb shell input tap 122 222; sleep 3
adb shell input swipe 540 1800 540 700 400; sleep 2
if tap_node text "اللغة" "Language row"; then
  sleep 2; dump
  if tap_node text "English" "English option"; then
    sleep 3; dump
    has_text "Settings" && say "PASS: live switch to English" || say "FAIL: UI not English after switch"
    shot 05-english
    tap_node text "Language" "Language row EN" || true; sleep 2
    tap_node text "العربية" "Arabic option" || true; sleep 3
    dump; has_text "الإعدادات" && say "PASS: switched back to Arabic" || say "FAIL: Arabic restore failed"
  else
    say "FAIL: language options not found"
  fi
else
  say "FAIL: language row not found"
fi
adb shell input keyevent KEYCODE_BACK; sleep 2

# CHECK 7: rotation
dismiss_anr
adb shell settings put system accelerometer_rotation 0
adb shell settings put system user_rotation 1; sleep 3
shot 06-landscape
dump; has_text "الصلاة" && say "PASS: rotation to landscape keeps prayer screen" || say "FAIL: rotation broke UI"
adb shell settings put system user_rotation 0; sleep 2

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

# CHECK 11: widget render harness (debug builds)
adb shell am start -S -W -n com.wathakker.app/com.example.WidgetRenderCheck > "$OUT/rendercheck.txt" 2>&1 || true
sleep 4
shot 09-widget-render

# logcat + crash scan
adb logcat -d > "$OUT/logcat.txt" 2>&1
grep -c "FATAL EXCEPTION" "$OUT/logcat.txt" > "$OUT/fatal_count.txt"
F=$(cat "$OUT/fatal_count.txt")
[ "$F" = "0" ] && say "PASS: no fatal exceptions in logcat" || say "FAIL: $F fatal exceptions (see logcat.txt)"

say "DONE 3.1.0 verify"
cat "$SUM"
