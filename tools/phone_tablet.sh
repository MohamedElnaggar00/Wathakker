#!/bin/bash
# 3.4 tablet + widget-tap evidence. Usage: phone_tablet.sh <apk> <outdir>
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell wm size > "$OUT/wm.txt"; adb shell wm density >> "$OUT/wm.txt"
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$1" >/dev/null 2>&1; }
tap_re(){ python3 - "$1" "$2" <<'PY'
import re,sys
x=open(sys.argv[2],encoding='utf8').read()
for m in re.finditer(r'<node [^>]*>',x):
    n=m.group(0)
    t=re.search(r'text="([^"]*)"',n); d=re.search(r'content-desc="([^"]*)"',n); b=re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',n)
    s=(t.group(1) if t else '')+' '+(d.group(1) if d else '')
    if b and re.search(sys.argv[1],s):
        a=list(map(int,b.groups())); print((a[0]+a[2])//2,(a[1]+a[3])//2); break
PY
}
noanr(){ for i in 1 2 3; do dump "$OUT/_anr.xml"; if grep -q "isn't responding" "$OUT/_anr.xml"; then XY=$(tap_re "^ *Wait *$" "$OUT/_anr.xml"); [ -n "$XY" ] && adb shell input tap $XY; sleep 3; else break; fi; done; }
shot(){ noanr; adb exec-out screencap -p > "$OUT/$1.png"; adb shell uiautomator dump /sdcard/s.xml >/dev/null 2>&1; adb pull /sdcard/s.xml "$OUT/$1.xml" >/dev/null 2>&1; echo "== $1 top=$(adb shell dumpsys activity activities | grep -m1 ResumedActivity | grep -o 'com\.[A-Za-z.]*/[A-Za-z.]*') texts: $(grep -o ' text="[^"]\+"' "$OUT/$1.xml" | head -25 | tr '\n' '|')" >> "$OUT/shots.txt"; }
setprefs(){ adb shell am force-stop $PKG; adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">$1</string></map>' > /data/data/com.wathakker.app/shared_prefs/app_prefs.xml"; }
launch(){ adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 14; for i in 1 2 3; do dump "$OUT/anr.xml"; if grep -q "isn't responding" "$OUT/anr.xml"; then XY=$(tap_re "Wait" "$OUT/anr.xml"); [ -n "$XY" ] && adb shell input tap $XY; sleep 4; fi; done; }
# First launch once so the data dir exists, then force prefs.
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8
adb shell settings put system accelerometer_rotation 0

run_lang(){ L=$1; setprefs $L
  adb shell settings put system user_rotation 0   # landscape (natural on tablet)
  launch; sleep 3; shot "${L}_land_prayer"; dump "$OUT/${L}_land_prayer.xml"
  XY=$(tap_re "الإعدادات|Settings" "$OUT/${L}_land_prayer.xml"); echo "$L settings: $XY" >> "$OUT/nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 4; shot "${L}_land_settings"; adb shell input keyevent 4 >/dev/null 2>&1; sleep 2
  XY=$(tap_re "حصن|Hisn|Fortress" "$OUT/${L}_land_prayer.xml"); echo "$L hisn tab: $XY" >> "$OUT/nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
  shot "${L}_land_hisn"; dump "$OUT/${L}_land_hisn.xml"
  XY=$(tap_re "^ *[0-9]+ (ذكر|azkar)" "$OUT/${L}_land_hisn.xml"); echo "$L chapter tap: $XY" >> "$OUT/nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
  shot "${L}_land_hisn_chapter"
  XY=$(tap_re "التقويم|Calendar" "$OUT/${L}_land_prayer.xml"); echo "$L cal tab: $XY" >> "$OUT/nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3; shot "${L}_land_calendar"
  XY=$(tap_re "التذكيرات|Reminders" "$OUT/${L}_land_prayer.xml"); echo "$L rem tab: $XY" >> "$OUT/nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3; shot "${L}_land_reminders"
  adb shell settings put system user_rotation 1   # portrait
  sleep 3; launch; shot "${L}_port_prayer"; dump "$OUT/${L}_port.xml"
  XY=$(tap_re "التذكيرات|Reminders" "$OUT/${L}_port.xml"); [ -n "$XY" ] && adb shell input tap $XY; sleep 3; shot "${L}_port_reminders"
  adb shell settings put system user_rotation 0
}
run_lang ar
run_lang en
adb logcat -d | grep -i "AndroidRuntime\|FATAL" | head -20 > "$OUT/errors.txt"

# Phone-size control: wm override to a phone width must keep the bottom bar (no rail).
adb shell wm size 1080x2400; adb shell wm density 420; adb shell settings put system user_rotation 0
setprefs ar; launch; sleep 3; shot "phone_ar_prayer"
adb shell wm size reset; adb shell wm density reset

# Widget settings at phone size: new tap-response selector, choose "nothing", Apply, check saved pref per widget.
adb shell wm size 1080x2400; adb shell wm density 420; adb shell settings put system user_rotation 0
adb shell am start -S -W -n $PKG/com.example.widget.WidgetConfigActivity --ei appWidgetId 9001 >/dev/null 2>&1; sleep 8
adb shell input swipe 540 1700 540 600 300; sleep 2; shot "config_tap_default"; dump "$OUT/cfg1.xml"
XY=$(tap_re "لا شيء" "$OUT/cfg1.xml"); echo "nothing seg: $XY" >> "$OUT/nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 2; shot "config_tap_nothing"; dump "$OUT/cfg2.xml"
XY=$(tap_re "تطبيق" "$OUT/cfg2.xml"); echo "apply: $XY" >> "$OUT/nav.txt"; [ -n "$XY" ] && adb shell input tap $XY; sleep 3
adb shell "run-as com.wathakker.app cat shared_prefs/fajr_prefs.xml" > "$OUT/prefs_tap.xml" 2>&1
grep -o 'widget_tap_[0-9]*[^/]*' "$OUT/prefs_tap.xml" > "$OUT/tap_pref.txt"
adb shell am start -S -W -n $PKG/com.example.widget.WidgetConfigActivity --ei appWidgetId 9001 >/dev/null 2>&1; sleep 8
adb shell input swipe 540 1700 540 600 300; sleep 2; shot "config_tap_reopened"
adb shell wm size reset; adb shell wm density reset

# Widget tap end-to-end: two real widgets (distinct ids) in a debug host; flip open/none and tap each.
adb shell settings put system user_rotation 0; sleep 2
: grantbind unused --package $PKG > "$OUT/grantbind.txt" 2>&1
SZ=$(adb shell wm size | grep -o '[0-9]*x[0-9]*' | tail -1); W=${SZ%x*}; H=${SZ#*x}
AX=$((W/4)); BX=$((W*3/4)); Y=$((H/2))
echo "screen $SZ" > "$OUT/hosttap.txt"
top(){ adb shell dumpsys activity activities | grep -m1 -E "mResumedActivity|ResumedActivity" | grep -o 'com\.[A-Za-z.]*/[A-Za-z.]*' | head -1; }
host(){ adb shell am force-stop $PKG; sleep 2; adb shell am start -S -W -n $PKG/com.example.WidgetHostCheck --es a $1 --es b $2 >> "$OUT/hostlaunch.txt" 2>&1; sleep 12; echo "host $1 $2 top=$(top)" >> "$OUT/hosttap.txt"; }
check(){ # name x expected(Main|Host)
  noanr
  adb shell input tap $2 $Y; sleep 4; T=$(top)
  case "$T" in *MainActivity*) GOT=Main;; *WidgetHostCheck*) GOT=Host;; *) GOT="other:$T";; esac
  if [ "$GOT" = "$3" ]; then R=PASS; else R=FAIL; fi
  echo "$1 tap -> $GOT (expected $3) $R" >> "$OUT/hosttap.txt"; shot "hosttap_$1"
}
adb shell settings put system user_rotation 0
adb shell am force-stop $PKG; adb shell am start -S -W -n $PKG/com.example.WidgetHostCheck >/dev/null 2>&1; sleep 8
for i in 1 2 3 4; do noanr; dump "$OUT/bind.xml"; XY=$(tap_re "^ *Create *$" "$OUT/bind.xml"); echo "bind dialog tap $i: $XY" >> "$OUT/hosttap.txt"; shot "hosttap_bind$i"; [ -n "$XY" ] && adb shell input tap $XY; sleep 6; done
host open none; shot hosttap_state1
check A_open_B_none_tapA $AX Main
host open none; check A_open_B_none_tapB $BX Host
host none open; check A_none_B_open_tapA $AX Host
host none open; check A_none_B_open_tapB $BX Main
host open open; check A_open_again_tapA $AX Main
adb logcat -d | grep -E "HOSTCHECK|FATAL EXCEPTION|AppWidgetHost|WathakkerHome" > "$OUT/hostcheck_log.txt"; adb logcat -d -b crash > "$OUT/crash.txt" 2>&1
