#!/bin/bash
# 3.4 per-widget tap test for EVERY enabled Home widget provider. Usage: widget_all.sh <apk> <outdir>
APK=$1; OUT=$2; PKG=com.wathakker.app; mkdir -p "$OUT"; adb root >/dev/null 2>&1
P=(NextPrayer PrayerBar Schedule DayPrayer Pill Clock Hijri Gregorian Hero OneUI)
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell settings put system accelerometer_rotation 0; adb shell settings put system user_rotation 0
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
shot(){ noanr; adb exec-out screencap -p > "$OUT/$1.png"; }
top(){ adb shell dumpsys activity activities | grep -m1 -E "mResumedActivity|ResumedActivity" | grep -o 'com\.[A-Za-z.]*/[A-Za-z.]*' | head -1; }
RES="$OUT/widgets.txt"; : > "$RES"
host(){ # mask
  adb shell am force-stop $PKG; sleep 2
  if [ -n "$1" ]; then adb shell am start -S -W -n $PKG/com.example.WidgetHostCheck --es m "$1" >> "$OUT/hostlaunch.txt" 2>&1; else adb shell am start -S -W -n $PKG/com.example.WidgetHostCheck >> "$OUT/hostlaunch.txt" 2>&1; fi
  sleep 9; noanr
}
SZ=$(adb shell wm size | grep -o '[0-9]*x[0-9]*' | tail -1); W=${SZ%x*}; H=${SZ#*x}
echo "screen $SZ" >> "$RES"
tapw(){ # label index expected(Main|Host) mask(for relaunch)
  local i=$2 col=$(( $2 % 5 )) row=$(( $2 / 5 ))
  local x=$(( (2*col+1) * W / 10 )) y=$(( (2*row+1) * (H-120) / 4 ))
  noanr; adb shell input tap $x $y; sleep 4; local T=$(top) GOT
  case "$T" in *MainActivity*) GOT=Main;; *WidgetHostCheck*) GOT=Host;; *) GOT="other:$T";; esac
  if [ "$GOT" = "$3" ]; then R=PASS; else R=FAIL; fi
  echo "$1 ${P[$i]} tap -> $GOT (expected $3) $R" >> "$RES"
  if [ "$GOT" != Host ]; then adb shell am force-stop $PKG; sleep 1; adb shell am start -S -W -n $PKG/com.example.WidgetHostCheck >> "$OUT/hostlaunch.txt" 2>&1; sleep 7; fi
}
phase(){ # name mask  (expected derived from mask: o->Main n->Host)
  local name=$1 mask=$2; host "$mask"; shot "host_$name"
  for i in 0 1 2 3 4 5 6 7 8 9; do c=${mask:$i:1}; [ "$c" = n ] && e=Host || e=Main; tapw "$name" $i $e; done
}
# first launch to create data dir, onboarding prefs
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8
adb shell am force-stop $PKG
adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/$PKG/shared_prefs/app_prefs.xml"
# bind all 10 through the system dialog
adb shell am start -S -W -n $PKG/com.example.WidgetHostCheck >> "$OUT/hostlaunch.txt" 2>&1; sleep 8
for n in $(seq 1 16); do noanr; dump "$OUT/bind.xml"; XY=$(tap_re "^ *Create *$" "$OUT/bind.xml"); if [ -z "$XY" ]; then [[ "$(top)" == *WidgetHostCheck* ]] && break; fi; echo "bind tap $n: $XY" >> "$RES"; [ -n "$XY" ] && adb shell input tap $XY; sleep 5; done
adb logcat -d | grep HOSTCHECK > "$OUT/hostcheck_log.txt"
echo "bound: $(grep -c 'ok=false' $OUT/hostcheck_log.txt) dialogs; ids: $(grep 'ids=' $OUT/hostcheck_log.txt | tail -1)" >> "$RES"
host ""; shot host_initial
phase A_open oooooooooo
phase B_none nnnnnnnnnn
phase C_open_again oooooooooo
phase D_mixed onononononon
# Real settings screen per widget (phone size): choose "nothing", Apply, read the saved pref for that widget id.
adb shell am force-stop $PKG; adb shell wm size 1080x2400; adb shell wm density 420
adb shell run-as $PKG cat shared_prefs/hostcheck.xml > "$OUT/hostcheck_prefs.xml" 2>&1
for i in 0 1 2 3 4 5 6 7 8 9; do
  id=$(grep -o "name=\"id$i\" value=\"[0-9]*\"" "$OUT/hostcheck_prefs.xml" | grep -o 'value="[0-9]*"' | grep -o '[0-9]*')
  adb shell am start -S -W -n $PKG/com.example.widget.WidgetConfigActivity --ei appWidgetId $id >/dev/null 2>&1; sleep 7; noanr
  dump "$OUT/cfg_${i}.xml"; XY=$(tap_re "^ *لا شيء *$" "$OUT/cfg_${i}.xml")
  if [ -z "$XY" ]; then adb shell input swipe 540 1700 540 600 300; sleep 2; dump "$OUT/cfg_${i}.xml"; XY=$(tap_re "^ *لا شيء *$" "$OUT/cfg_${i}.xml"); fi
  shot "cfg_${P[$i]}_before"
  [ -n "$XY" ] && adb shell input tap $XY; sleep 2; shot "cfg_${P[$i]}_nothing"; dump "$OUT/cfg2_${i}.xml"
  AP=$(tap_re "^ *تطبيق *$" "$OUT/cfg2_${i}.xml"); [ -n "$AP" ] && adb shell input tap $AP; sleep 3
  adb shell run-as $PKG cat shared_prefs/fajr_prefs.xml > "$OUT/fajr_$i.xml" 2>&1
  if grep -q "widget_tap_${id}\">none<" "$OUT/fajr_$i.xml"; then echo "config ${P[$i]} (id $id): nothing=$XY apply=$AP pref none saved PASS" >> "$RES"; else echo "config ${P[$i]} (id $id): nothing=$XY apply=$AP pref NOT saved FAIL" >> "$RES"; fi
done
adb shell wm size reset; adb shell wm density reset; sleep 3
# taps with the state set ONLY through the real settings screens
host ""; shot host_after_settings_ui
for i in 0 1 2 3 4 5 6 7 8 9; do tapw E_set_by_settings_ui $i Host; done
# per-widget mixed state, then update-refresh (package replace) and reboot
phase F_mixed_before onononononon
adb install -r -g "$APK" > "$OUT/install2.txt" 2>&1; sleep 25
host ""; shot host_after_update
M=onononononon
for i in 0 1 2 3 4 5 6 7 8 9; do c=${M:$i:1}; [ "$c" = n ] && e=Host || e=Main; tapw G_after_update_install $i $e; done
adb reboot; adb wait-for-device; for n in $(seq 1 60); do [ "$(adb shell getprop sys.boot_completed | tr -d '\r')" = 1 ] && break; sleep 5; done; sleep 45
adb root >/dev/null 2>&1; adb shell input keyevent 82; adb shell svc power stayon true; adb shell settings put system user_rotation 0; sleep 5
adb shell wm size > "$OUT/wm_after_reboot.txt"
host ""; shot host_after_reboot
for i in 0 1 2 3 4 5 6 7 8 9; do c=${M:$i:1}; [ "$c" = n ] && e=Host || e=Main; tapw H_after_reboot $i $e; done
adb logcat -d | grep -E "HOSTCHECK|FATAL EXCEPTION|WathakkerHome" > "$OUT/hostcheck_log.txt"
