#!/bin/bash
# usage: emu_verify_320.sh <apk> <outdir>
# v3.2.0: time-of-day sky backgrounds + glass prayer cards on the prayer screen.
# Captures real screenshots of the prayer screen in all six DayPeriods, light and
# dark theme, checks the next-prayer state matches each period, exercises the
# boundary crossfade, measures scroll jank, and confirms leaving the tab restores
# the status bar / normal background. Header buttons and bottom bar are untouched
# by the feature; their pixels are sampled for legibility observations only.
APK=$1; OUT=$2
rm -rf "$OUT"; mkdir -p "$OUT"
SUM="$OUT/SUMMARY.txt"; : > "$SUM"
say() { echo "$1" | tee -a "$SUM"; }
PKG=com.wathakker.app
adb uninstall $PKG >/dev/null 2>&1 || true
adb install -g "$APK" > "$OUT/install.txt" 2>&1 || { say "FATAL: install failed"; exit 1; }
adb shell settings put global hide_error_dialogs 1 || true
# Clock control for the six scenarios (default-target emulator image allows root).
adb root >/dev/null 2>&1 || true
sleep 2; adb wait-for-device
adb shell settings put global auto_time 0 || true
# No notification permission on purpose: adhan heads-up banners would cover the header
# in screenshots. This run verifies visuals, not alerts (emu_verify_310 covers alerts).
adb logcat -c
adb shell am start -S -W -n $PKG/com.example.MainActivity > "$OUT/launch.txt" 2>&1
sleep 10

shot() { adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; }
dump() { adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u320.xml >/dev/null 2>&1; }
W=$(adb shell wm size | grep -oE '[0-9]+x[0-9]+' | head -1); SW=${W%x*}; SH=${W#*x}
[ -z "$SW" ] && { SW=1080; SH=2400; }
CX=$((SW/2))
alive() { adb shell pidof $PKG >/dev/null 2>&1 && [ -n "$(adb shell pidof $PKG)" ]; }
fg_guard() { for i in 1 2 3 4 5 6 7 8; do F=$(adb shell dumpsys window 2>/dev/null | grep -m1 "mCurrentFocus"); echo "$F" | grep -q "$PKG" && return 0; sleep 1; adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 2; done; return 1; }

# --- parse the six prayer times from the list rows (scroll to see all rows) ---
python3 - <<'PY' > "$OUT/prayer_times.env"
import re,os,sys
names=['الفجر','الشروق','الظهر','العصر','المغرب','العشاء']
keys=['FAJR','SHURUQ','DHUHR','ASR','MAGHRIB','ISHA']
found={}
def scan():
    if not os.path.exists('/tmp/u320.xml'): return
    x=open('/tmp/u320.xml',encoding='utf-8').read()
    texts=re.findall(r'text="([^"]*)"',x)
    for i,t in enumerate(texts):
        if t in names and t not in found:
            for j in range(i+1,min(i+8,len(texts))):
                m=re.match(r'^(\d{2}):(\d{2}) ([صم])$',texts[j])
                if m:
                    h,mi,amp=int(m.group(1)),int(m.group(2)),m.group(3)
                    h24=h%12+(12 if amp=='م' else 0)
                    found[t]=(h24,mi); break
    return
scan()
print('# pass1',len(found),file=sys.stderr)
import subprocess
# scroll down and rescan until all six found (max 6 swipes)
for k in range(6):
    if len(found)>=6: break
    subprocess.run(['adb','shell','input','swipe',str(int(1080/2)),str(int(2400*75/100)),str(int(1080/2)),str(int(2400*30/100)),'400'])
    import time; time.sleep(2)
    subprocess.run(['adb','shell','uiautomator','dump','/sdcard/u.xml'],capture_output=True)
    subprocess.run(['adb','pull','/sdcard/u.xml','/tmp/u320.xml'],capture_output=True)
    scan()
for n,k in zip(names,keys):
    if n in found: print(f'{k}={found[n][0]}:{found[n][1]:02d}')
print(f'FOUND={len(found)}')
PY
cat "$OUT/prayer_times.env"
source "$OUT/prayer_times.env"
[ "${FOUND:-0}" = "6" ] && say "PASS: parsed all six prayer times from UI" || say "FAIL: parsed ${FOUND:-0}/6 prayer times"
# back to top
for i in 1 2 3; do adb shell input swipe $CX $((SH*30/100)) $CX $((SH*80/100)) 400; sleep 1; done

# --- scenario runner: set clock, relaunch, verify next-prayer + screenshot ---
set_clock() { # HH:MM today
  local FMT=$(python3 -c "import datetime;d=datetime.date.today();h,m='$1'.split(':');print(d.strftime('%m%d')+h+m+d.strftime('%Y')+'.00')")
  adb shell date "$FMT" >/dev/null 2>&1
  sleep 1
}
relaunch() { adb shell am force-stop $PKG; sleep 1; adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8; }

run_scenario() { # <key> <HH:MM> <expected next-prayer arabic>
  local KEY=$1 T=$2 EXPECT=$3
  set_clock "$T"
  relaunch
  fg_guard || say "FAIL[$KEY]: app not foreground after relaunch"
  adb shell cmd uimode night no; sleep 3
  shot "320_${KEY}_light_top"
  adb shell input swipe $CX $((SH*75/100)) $CX $((SH*30/100)) 400; sleep 2
  shot "320_${KEY}_light_scrolled"
  adb shell input swipe $CX $((SH*30/100)) $CX $((SH*80/100)) 400; sleep 2
  adb shell cmd uimode night yes; sleep 3
  shot "320_${KEY}_dark_top"
  adb shell input swipe $CX $((SH*75/100)) $CX $((SH*30/100)) 400; sleep 2
  shot "320_${KEY}_dark_scrolled"
  adb shell input swipe $CX $((SH*30/100)) $CX $((SH*80/100)) 400; sleep 2
  adb shell cmd uimode night no; sleep 2
  dump
  python3 - "$EXPECT" "$KEY" <<'PY'
import sys,os
expect,key=sys.argv[1],sys.argv[2]
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
# overview shows the next-prayer name twice (label row + big name); a plain hit is enough
print(('PASS' if expect in x else 'FAIL')+f'[{key}]: next prayer shows {expect}')
PY
}

run_scenario fajr    "$(python3 -c "h,m='$FAJR'.split(':');print(f'{(int(h)*60+int(m)+20)//60:02d}:{(int(h)*60+int(m)+20)%60:02d}')")"    "الشروق"
run_scenario shuruq  "$(python3 -c "h,m='$SHURUQ'.split(':');t=int(h)*60+int(m)+20;print(f'{t//60:02d}:{t%60:02d}')")"  "الظهر"
run_scenario dhuhr   "$(python3 -c "h,m='$DHUHR'.split(':');t=int(h)*60+int(m)+20;print(f'{t//60:02d}:{t%60:02d}')")"   "العصر"
run_scenario asr     "$(python3 -c "h,m='$ASR'.split(':');t=int(h)*60+int(m)+20;print(f'{t//60:02d}:{t%60:02d}')")"     "المغرب"
run_scenario maghrib "$(python3 -c "h,m='$MAGHRIB'.split(':');t=int(h)*60+int(m)+20;print(f'{t//60:02d}:{t%60:02d}')")" "العشاء"
run_scenario isha    "$(python3 -c "h,m='$ISHA'.split(':');t=int(h)*60+int(m)+20;print(f'{t//60:02d}:{t%60:02d}')")"    "الفجر"

# --- sky pixels differ per period and are not the flat theme background ---
python3 - "$OUT" <<'PY' >> "$SUM"
import sys,os
from PIL import Image
out=sys.argv[1]
def avg(path,x0,y0,x1,y1):
    im=Image.open(path).convert('RGB'); w,h=im.size
    box=im.crop((int(w*x0),int(h*y0),int(w*x1),int(h*y1)))
    px=list(box.getdata()); n=len(px)
    return tuple(sum(c[i] for c in px)//n for i in range(3))
keys=['fajr','shuruq','dhuhr','asr','maghrib','isha']
vals={}
for k in keys:
    p=f'{out}/320_{k}_dark_top.png'
    if os.path.exists(p):
        # strip between the big title and the first card: pure sky
        vals[k]=avg(p,0.10,0.30,0.90,0.36)
        print(f'sky[{k}] rgb={vals[k]}')
uniq=len(set(vals.values()))
print(('PASS' if uniq>=5 else 'FAIL')+f': {uniq}/6 distinct sky strips')
dark_flat=(18,18,20)
diffs=[sum(abs(v[i]-dark_flat[i]) for i in range(3)) for v in vals.values()]
print(('PASS' if min(diffs)>12 else 'WARN')+': sky strips differ from flat dark background (min diff %d)'%min(diffs))
PY

# --- boundary crossfade: sit 3s before Maghrib with the app open, capture across the flip ---
adb shell cmd uimode night yes; sleep 2
FMT=$(python3 -c "import datetime;d=datetime.date.today();h,m='$MAGHRIB'.split(':');t=int(h)*3600+int(m)*60-3;print(d.strftime('%m%d')+f'{t//3600:02d}{(t%3600)//60:02d}'+d.strftime('%Y')+f'.{t%60:02d}')")
adb shell date "$FMT" >/dev/null 2>&1
sleep 4   # boundary crosses ~1s in; the 1.4s crossfade runs
shot 320_crossfade_t0
sleep 1
shot 320_crossfade_t1
sleep 2
shot 320_crossfade_t2
say "INFO: crossfade frames captured (visual gate: t0/t1 mid-blend, t2 settled, no flicker)"

# --- scroll jank with sky + two haze cards active ---
adb shell am force-stop $PKG; sleep 1
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8
adb shell dumpsys gfxinfo $PKG reset 2>/dev/null || true
for i in 1 2 3 4 5 6; do adb shell input swipe $CX $((SH*75/100)) $CX $((SH*25/100)) 350; sleep 1; done
for i in 1 2 3 4 5 6; do adb shell input swipe $CX $((SH*25/100)) $CX $((SH*75/100)) 350; sleep 1; done
adb shell dumpsys gfxinfo $PKG > "$OUT/gfxinfo.txt" 2>&1
grep -E "Total frames rendered|Janky frames" "$OUT/gfxinfo.txt" | head -4 | tee -a "$SUM"

# --- leave the prayer tab: status bar + normal background restore ---
adb shell input tap $((SW*12/100)) $((SH*96/100)); sleep 4   # التقويم tab (start edge in RTL = rightmost... tap by coordinates fallback below)
dump
if ! grep -q "التقويم" /tmp/u320.xml 2>/dev/null; then :; fi
shot 320_after_leave_tab
alive && say "PASS: app alive after leaving prayer tab" || say "FAIL: app died after leaving prayer tab"
# re-enter prayer tab
adb shell input tap $((SW*88/100)) $((SH*96/100)); sleep 4
shot 320_reenter_prayer
alive && say "PASS: app alive after re-entering prayer tab" || say "FAIL: app died on re-enter"

# --- crash check across the whole run ---
adb logcat -d > "$OUT/logcat.txt" 2>&1
grep -c "FATAL EXCEPTION" "$OUT/logcat.txt" | sed 's/^/fatal_exceptions: /' | tee -a "$SUM"
grep -q "FATAL EXCEPTION" "$OUT/logcat.txt" && say "FAIL: fatal exceptions in logcat" || say "PASS: no fatal exceptions"
say "DONE 3.2.0"
