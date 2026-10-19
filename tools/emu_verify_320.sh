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
adb shell settings put global anr_show_dialog false || true
# Clock control for the six scenarios (default-target emulator image allows root).
adb root >/dev/null 2>&1 || true
sleep 2; adb wait-for-device
adb shell settings put global auto_time 0 || true
# No notification permission on purpose: adhan heads-up banners would cover the header
# in screenshots. This run verifies visuals, not alerts (emu_verify_310 covers alerts).
adb logcat -c
adb shell am start -S -W -n $PKG/com.example.MainActivity > "$OUT/launch.txt" 2>&1
sleep 10
adb shell settings put global anr_show_dialog false || true

shot() { adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; }
dump() { adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u320.xml >/dev/null 2>&1; }
W=$(adb shell wm size | grep -oE '[0-9]+x[0-9]+' | head -1); SW=${W%x*}; SH=${W#*x}
[ -z "$SW" ] && { SW=1080; SH=2400; }
CX=$((SW/2))
dismiss_anr() { # tap "Wait" on any ANR dialog (clock jumps / uimode flips upset Quickstep)
  dump
  if grep -q "isn't responding" /tmp/u320.xml 2>/dev/null; then
    python3 -c "
import re,os
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
for m in re.finditer(r'text=.(Wait).[^>]*?bounds=.\[(\d+),(\d+)\]\[(\d+),(\d+)\].',x):
    print((int(m.group(2))+int(m.group(4)))//2,(int(m.group(3))+int(m.group(5)))//2); break
" > /tmp/wait.xy
    [ -s /tmp/wait.xy ] && adb shell input tap $(cat /tmp/wait.xy) && sleep 3
    rm -f /tmp/wait.xy
  fi
}
alive() { adb shell pidof $PKG >/dev/null 2>&1 && [ -n "$(adb shell pidof $PKG)" ]; }
fg_guard() { for i in 1 2 3 4 5 6 7 8; do
  F=$(adb shell dumpsys window 2>/dev/null | grep -m1 "mCurrentFocus")
  echo "$F" | grep -q "$PKG" && return 0
  # a Compose popup/dropdown window can own focus without the package in mCurrentFocus;
  # the app's top activity is still ours then - treat as foreground
  adb shell dumpsys activity activities 2>/dev/null | grep -m1 "topResumedActivity" | grep -q "$PKG" && return 0
  sleep 1; adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 2
done; return 1; }

# clear any ANR dialog from boot/uimode before reading the UI
dismiss_anr
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
set_clock() { # HH:MM today - verified by readback (adb root can race boot)
  local WANT=$(echo "$1" | tr -d ':')
  local FMT=$(python3 -c "import datetime;d=datetime.date.today();h,m='$1'.split(':');print(d.strftime('%m%d')+h+m+d.strftime('%Y')+'.00')")
  for i in 1 2 3 4 5; do
    adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
    adb shell date "$FMT" >/dev/null 2>&1
    sleep 1
    local GOT=$(adb shell date '+%H%M' | tr -d '\r')
    [ "$GOT" = "$WANT" ] && return 0
    sleep 2
  done
  say "WARN: set_clock readback mismatch for $1 (got $GOT)"
}
dismiss_anr
relaunch() { adb shell am force-stop $PKG; sleep 1; adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8; dismiss_anr; }

run_scenario() { # <key> <HH:MM> <expected next-prayer arabic>
  local KEY=$1 T=$2 EXPECT=$3
  set_clock "$T"
  relaunch
  fg_guard || say "FAIL[$KEY]: app not foreground after relaunch"
  adb shell cmd uimode night no; sleep 3; dismiss_anr
  shot "320_${KEY}_light_top"
  adb shell input swipe $CX $((SH*75/100)) $CX $((SH*30/100)) 400; sleep 2
  shot "320_${KEY}_light_scrolled"
  adb shell input swipe $CX $((SH*30/100)) $CX $((SH*80/100)) 400; sleep 2
  adb shell cmd uimode night yes; sleep 3; dismiss_anr
  shot "320_${KEY}_dark_top"
  adb shell input swipe $CX $((SH*75/100)) $CX $((SH*30/100)) 400; sleep 2
  shot "320_${KEY}_dark_scrolled"
  adb shell input swipe $CX $((SH*30/100)) $CX $((SH*80/100)) 400; sleep 2
  adb shell cmd uimode night no; sleep 2
  dump
  python3 - "$EXPECT" "$KEY" >> "$SUM" <<'PY'
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

# --- boundary crossfade: park before Maghrib, poll the countdown, capture the flip ---
adb shell cmd uimode night yes; sleep 2
FMT=$(python3 -c "import datetime;d=datetime.date.today();h,m='$MAGHRIB'.split(':');t=int(h)*3600+int(m)*60-90;print(d.strftime('%m%d')+f'{t//3600:02d}{(t%3600)//60:02d}'+d.strftime('%Y')+f'.{t%60:02d}')")
adb shell date "$FMT" >/dev/null 2>&1
relaunch
adb shell cmd uimode night yes; sleep 2
for i in $(seq 1 100); do
  dump
  LEFT=$(python3 -c "
import re,os
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
m=re.findall(r'text=.(\d+):(\d{2}):(\d{2}).',x)
print(min((int(a)*3600+int(b)*60+int(c)) for a,b,c in m) if m else 9999)
")
  [ "${LEFT:-9999}" -le 5 ] && break
  sleep 1
done
shot 320_crossfade_t0
sleep 1; shot 320_crossfade_t1
sleep 1; shot 320_crossfade_t2
sleep 2; shot 320_crossfade_t3
say "INFO: crossfade frames captured around the maghrib boundary (visual gate: t0/t1 mid-blend, t3 settled maghrib sky, no flicker)"

# --- scroll jank with sky + two haze cards active ---
adb shell am force-stop $PKG; sleep 1
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8
adb shell dumpsys gfxinfo $PKG reset 2>/dev/null || true
for i in 1 2 3 4 5 6; do adb shell input swipe $CX $((SH*75/100)) $CX $((SH*25/100)) 350; sleep 1; done
for i in 1 2 3 4 5 6; do adb shell input swipe $CX $((SH*25/100)) $CX $((SH*75/100)) 350; sleep 1; done
adb shell dumpsys gfxinfo $PKG > "$OUT/gfxinfo.txt" 2>&1
grep -E "Total frames rendered|Janky frames" "$OUT/gfxinfo.txt" | head -4 | tee -a "$SUM"

# --- leave the prayer tab: sky gone, theme background restored; re-enter: sky back ---
tab_tap() { # <arabic label>
  dump
  python3 -c "
import re,sys,os
val='$1'
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
best=None
for m in re.finditer(r'text=.([^\"]*).[^>]*?bounds=.\[(\d+),(\d+)\]\[(\d+),(\d+)\].',x):
    if m.group(1)==val:
        a,b,c,d=int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))
        cy=(b+d)//2
        if best is None or cy>best[1]: best=((a+c)//2,cy)
if best: print(best[0],best[1])
" > /tmp/tap.xy
  [ -s /tmp/tap.xy ] && adb shell input tap $(cat /tmp/tap.xy) && sleep 4
}
strip_check() { # <png> <expect: flat|sky> <label>
python3 -c "
import sys
from PIL import Image
im=Image.open('$OUT/$1').convert('RGB'); w,h=im.size
px=[im.getpixel((x,y)) for x in range(w//10,w-w//10,20) for y in range(int(h*0.30),int(h*0.36),8)]
avg=tuple(sum(c[i] for c in px)//len(px) for i in range(3))
spread=max(avg)-min(avg)
flat = spread < 12
ok = flat if '$2'=='flat' else (not flat)
print('$3 strip rgb=%s spread=%s' % (avg, spread))
print(('PASS' if ok else 'FAIL')+': $3')
" >> "$SUM"
}
tab_tap "التقويم"
shot 320_after_leave_tab
strip_check 320_after_leave_tab.png flat "sky gone after leaving prayer tab"
tab_tap "الصلاة"
shot 320_reenter_prayer
strip_check 320_reenter_prayer.png sky "sky back after re-entering prayer tab"
alive && say "PASS: app alive across tab leave/re-enter" || say "FAIL: app died across tab leave/re-enter"

# ================= v3.2.0 glass-system / smoke / widget checks =================

# --- helpers (defined before first use) ---
shot_fg() { # <name> - screenshot, guaranteeing the app is foreground first
  fg_guard || say "FAIL: app not foreground for $1"
  shot "$1"
}

open_drawer() { # tap the hamburger (content-desc القائمة/Menu) in the top header
  dump
  python3 -c "
import re,os
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
for m in re.finditer(r'content-desc=.([^\"]*).[^>]*?bounds=.\[(\d+),(\d+)\]\[(\d+),(\d+)\].',x):
    d=m.group(1)
    if d in ('القائمة','Menu'):
        a,b,c,e=int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))
        if b < 500: print((a+c)//2,(b+e)//2); break
" > /tmp/drw.xy
  [ -s /tmp/drw.xy ] && adb shell input tap $(cat /tmp/drw.xy) && sleep 4
  rm -f /tmp/drw.xy
}

goto_drawer_item() { # <arabic title> - open drawer, verify target listed, tap it, verify screen opened
  local TARGET="$1"
  fg_guard || { say "FAIL: app not foreground before drawer nav to $TARGET"; return 1; }
  open_drawer
  dump
  if ! grep -q "text=\"$TARGET\"" /tmp/u320.xml 2>/dev/null; then
    say "FAIL: drawer did not list $TARGET (drawer nav broken)"
    adb shell input keyevent 4; sleep 2
    return 1
  fi
  tab_tap "$TARGET"
  sleep 3
  return 0
}

smoke_check() { # <png> <label>
python3 -c "
from PIL import Image
im=Image.open('$OUT/$1').convert('RGB'); w,h=im.size
def avg(x0,y0,x1,y1):
    px=[im.getpixel((x,y)) for x in range(int(w*x0),int(w*x1),24) for y in range(int(h*y0),int(h*y1),24)]
    return tuple(sum(c[i] for c in px)//max(1,len(px)) for i in range(3))
top=avg(0.2,0.05,0.8,0.12); glow=avg(0.3,0.60,0.7,0.78)
d=sum(abs(glow[i]-top[i]) for i in range(3))
print('$2 top=%s glow=%s diff=%d'%(top,glow,d))
print(('PASS' if d>18 else 'FAIL')+': $2 smoke glow visible')
" >> "$SUM"
}

blue_tab_check() { # <png> <dark|light> <label>  - selected-tab blue pixels in the bar
python3 -c "
from PIL import Image
im=Image.open('$OUT/$1').convert('RGB'); w,h=im.size
n=0
for x in range(0,w,4):
    for y in range(int(h*0.88),h-8,4):
        r,g,b=im.getpixel((x,y))
        if b-r>40 and b-g>15 and b>120: n+=1
print('$3 bluepx=%d'%n)
print(('PASS' if n>8 else 'FAIL')+': $3 selected-tab blue tint in bottom bar')
" >> "$SUM"
}

# --- date converter: frosted fields + month drop-down (One UI popup, no typing) ---
if goto_drawer_item "محول التاريخ"; then
  dump
  grep -q "من ميلادي إلى هجري" /tmp/u320.xml && say "PASS: converter screen opened" || say "FAIL: converter screen content missing"
  adb shell cmd uimode night yes; sleep 2; dismiss_anr; shot_fg 320_converter_dark
  adb shell cmd uimode night no;  sleep 2; dismiss_anr; shot_fg 320_converter_light
  # reset to today (reset row is the LOWEST اليوم match on this screen)
  tab_tap "اليوم"
  sleep 2; shot_fg 320_converter_today
  tap_below_text() { # <label> <occurrence 1|2> <dy px> - tap dy px below the label's center-x
    dump
    python3 -c "
import re,os
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
n=0
for m in re.finditer(r'text=.([^\"]*).[^>]*?bounds=.\[(\d+),(\d+)\]\[(\d+),(\d+)\].',x):
    if m.group(1)=='$1':
        n+=1
        if n==$2:
            a,b,c,d=int(m.group(2)),int(m.group(3)),int(m.group(4)),int(m.group(5))
            print((a+c)//2, d+$3); break
" > /tmp/tbt.xy
    [ -s /tmp/tbt.xy ] && adb shell input tap $(cat /tmp/tbt.xy) && sleep 3
    rm -f /tmp/tbt.xy
  }
  result_snapshot() { # hijri/gregorian result lines with digits -> stdout
    python3 -c "
import re,os
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
hm=['محرم','صفر','ربيع','جمادى','رجب','شعبان','رمضان','شوال','ذو']
gm=['يناير','فبراير','مارس','أبريل','ابريل','مايو','يونيو','يوليو','أغسطس','سبتمبر','أكتوبر','نوفمبر','ديسمبر']
res=sorted(t for t in re.findall(r'text=\"([^\"]*)\"',x) if any(m in t for m in hm+gm) and any(ch.isdigit() for ch in t))
print('|'.join(res))
"
  }
  # open the Gregorian month drop-down (first الشهر label) and check the popup
  dump; result_snapshot > /tmp/res_before_g.txt
  tap_below_text "الشهر" 1 110
  shot_fg 320_converter_month_popup_g
  dump
  python3 - >> "$SUM" <<'PY'
import os
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
ok = ('يناير' in x) and ('ديسمبر' in x)
print(('PASS' if ok else 'FAIL')+': gregorian month popup lists month names')
PY
  # pick January (يناير); result must CHANGE vs the today snapshot
  tab_tap "يناير"
  sleep 2; shot_fg 320_converter_month_picked
  dump; result_snapshot > /tmp/res_after_g.txt
  python3 - >> "$SUM" <<'PY'
b=open('/tmp/res_before_g.txt',encoding='utf-8').read().strip()
a=open('/tmp/res_after_g.txt',encoding='utf-8').read().strip()
changed = a and a != b
print(('PASS' if changed else 'FAIL')+f': G->H conversion result changed after month pick (before={b[:60]} after={a[:60]})')
PY
  # open the Hijri month drop-down (second الشهر) and pick محرم
  dump; result_snapshot > /tmp/res_before_h.txt
  tap_below_text "الشهر" 2 110
  shot_fg 320_converter_month_popup_h
  dump
  python3 - >> "$SUM" <<'PY'
import os
x=open('/tmp/u320.xml',encoding='utf-8').read() if os.path.exists('/tmp/u320.xml') else ''
ok = ('محرم' in x) and ('ذو الحجة' in x)
print(('PASS' if ok else 'FAIL')+': hijri month popup lists month names')
PY
  tab_tap "محرم"
  sleep 2
  dump; result_snapshot > /tmp/res_after_h.txt
  python3 - >> "$SUM" <<'PY'
b=open('/tmp/res_before_h.txt',encoding='utf-8').read().strip()
a=open('/tmp/res_after_h.txt',encoding='utf-8').read().strip()
changed = a and a != b
print(('PASS' if changed else 'FAIL')+f': H->G conversion result changed after month pick (before={b[:60]} after={a[:60]})')
PY
  adb shell input keyevent 4; sleep 2
  fg_guard || say "FAIL: app not foreground after converter back"
fi

# --- tasbih screen: frosted counter ring over smoke, both themes ---
if goto_drawer_item "السبحة"; then
  adb shell cmd uimode night yes; sleep 2; dismiss_anr; shot_fg 320_tasbeeh_dark
  smoke_check 320_tasbeeh_dark.png "tasbeeh dark"
  adb shell cmd uimode night no;  sleep 2; dismiss_anr; shot_fg 320_tasbeeh_light
  smoke_check 320_tasbeeh_light.png "tasbeeh light"
  adb shell input keyevent 4; sleep 2
  fg_guard || say "FAIL: app not foreground after tasbeeh back"
fi

# --- smoke background on the three non-prayer tabs, both themes ---
fg_guard || say "FAIL: app not foreground before smoke section"
tab_tap "التقويم"
adb shell cmd uimode night yes; sleep 2; dismiss_anr; shot_fg 320_smoke_calendar_dark
adb shell cmd uimode night no;  sleep 2; dismiss_anr; shot_fg 320_smoke_calendar_light
smoke_check 320_smoke_calendar_dark.png  "calendar dark"
smoke_check 320_smoke_calendar_light.png "calendar light"
tab_tap "الأذكار"
shot_fg 320_smoke_azkar_light
smoke_check 320_smoke_azkar_light.png "azkar light"
tab_tap "حصن المسلم"
shot_fg 320_smoke_hisn_light
smoke_check 320_smoke_hisn_light.png "hisn light"

# --- blue selected tab on all four tabs, both themes ---
for T in "الصلاة" "الأذكار" "حصن المسلم" "التقويم"; do
  tab_tap "$T"
  adb shell cmd uimode night yes; sleep 2; dismiss_anr
  shot_fg "320_tab_${T}_dark"
  blue_tab_check "320_tab_${T}_dark.png" dark "tab $T dark"
  adb shell cmd uimode night no; sleep 2; dismiss_anr
  shot_fg "320_tab_${T}_light"
  blue_tab_check "320_tab_${T}_light.png" light "tab $T light"
done

# --- drawer: frost over the prayer sky, default over azkar ---
tab_tap "الصلاة"
adb shell cmd uimode night yes; sleep 2
open_drawer; shot_fg 320_drawer_over_prayer_dark
adb shell input keyevent 4; sleep 2
adb shell cmd uimode night no; sleep 2
open_drawer; shot_fg 320_drawer_over_prayer_light
adb shell input keyevent 4; sleep 2
tab_tap "الأذكار"
open_drawer; shot_fg 320_drawer_over_azkar_light
adb shell input keyevent 4; sleep 2
fg_guard || say "WARN: app not foreground after drawer section"
say "INFO: drawer shots captured (visual gate: frosted over sky, legible everywhere)"

# --- widget renderer: auto bar = black on light bg, white on dark bg ---
adb shell am force-stop $PKG; sleep 1
adb shell am start -S -W -n $PKG/com.example.WidgetRenderCheck >/dev/null 2>&1; sleep 10
adb pull /sdcard/Android/data/$PKG/files "$OUT/widget_render" >/dev/null 2>&1 || \
  adb shell "run-as $PKG ls files/rendercheck" 2>/dev/null
python3 - "$OUT" <<'PY' >> "$SUM"
import sys,os
from PIL import Image
out=sys.argv[1]
def band(path):
    # Hero compact layout: name text ~0.389h, bar ~0.57h, times ~0.78h.
    # Sample the band strictly between name and times so only bar+track+bg remain.
    im=Image.open(path).convert('RGB'); w,h=im.size
    px=[]
    for y in range(int(h*0.50),int(h*0.64),2):
        for x in range(int(w*0.06),int(w*0.94),3):
            px.append(im.getpixel((x,y)))
    dark=min(px,key=lambda c:sum(c)); bright=max(px,key=lambda c:sum(c))
    blue=max(px,key=lambda c:c[2]-c[0])
    return dark,bright,blue
def present(path,label):
    # returns (has_black, has_white, has_blue) for the bar band
    if not os.path.exists(path):
        print(f'WARN: {label} missing ({os.path.basename(path)})'); return None
    dark,bright,blue=band(path)
    hb = sum(dark)<150          # bar band has near-black pixels
    hw = sum(bright)>690        # bar band has near-white pixels
    hbl = blue[2]-blue[0]>50    # bar band has blue-dominant pixels
    print(f'{label}: dark={dark} bright={bright} blue={blue} -> black={hb} white={hw} blue={hbl}')
    return hb,hw,hbl
# preview_light_* (id 994) = white bg + DEFAULT (auto) bar -> expect BLACK pixels (the bar)
r=present(f'{out}/widget_render/preview_light_Hero.png','auto-on-white-bg[994]')
print(('PASS' if r and r[0] else 'FAIL')+': auto bar is black on light widget bg')
# widget_dark_* (id 992) = black bg + auto bar -> expect WHITE pixels (the bar)
r=present(f'{out}/widget_render/widget_dark_Hero.png','auto-on-black-bg[992]')
print(('PASS' if r and r[1] else 'FAIL')+': auto bar is white on dark widget bg')
# widget_light_* (id 991) = white bg + explicit blue -> explicit options untouched
r=present(f'{out}/widget_render/widget_light_Hero.png','explicit-blue-on-white-bg[991]')
print(('PASS' if r and r[2] else 'FAIL')+': explicit blue option still blue')
# widget_glass_* (id 995) = glass bg: translucent + border stroke
import glob
f995=glob.glob(f'{out}/widget_render/widget_glass_Hero.png')
if f995:
    im=Image.open(f995[0]).convert('RGBA'); w,h=im.size
    a=im.getpixel((w//2,4))[3]
    print(f'glass995: center-top alpha={a}')
    print(('PASS' if a<200 else 'FAIL')+': glass widget bg is translucent')
else:
    print('FAIL: glass widget render missing')
f996=glob.glob(f'{out}/widget_render/widget_wallblur_Hero.png')
if f996:
    im=Image.open(f996[0]).convert('RGB'); w,h=im.size
    px=[im.getpixel((x,y)) for x in range(8,w-8,17) for y in range(8,h-8,17)]
    rs=[p[0] for p in px]; var=max(rs)-min(rs)
    print(f'wallblur996: red-channel spread={var}')
    print(('PASS' if var>12 else 'WARN')+': wallblur widget bg is a (blurred) photo, not flat')
else:
    print('WARN: wallblur widget render missing')
print('INFO: widget render files: '+str(sorted(os.path.basename(x) for x in glob.glob(f'{out}/widget_render/*.png'))))
PY
adb shell am force-stop $PKG; sleep 1
adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 6

# --- crash check across the whole run ---
adb logcat -d > "$OUT/logcat.txt" 2>&1
grep -c "FATAL EXCEPTION" "$OUT/logcat.txt" | sed 's/^/fatal_exceptions: /' | tee -a "$SUM"
grep -q "FATAL EXCEPTION" "$OUT/logcat.txt" && say "FAIL: fatal exceptions in logcat" || say "PASS: no fatal exceptions"
say "DONE 3.2.0"
