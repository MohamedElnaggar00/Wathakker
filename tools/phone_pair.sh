#!/bin/bash
# branch-only: same widget host harness, old vs new APK on the same phone emulator. Usage: phone_pair.sh <old.apk> <new.apk> <outdir>
OLD=$1; NEW=$2; OUT=$3; PKG=com.wathakker.app; mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 3
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
top(){ adb shell dumpsys activity activities | grep -m1 -E "mResumedActivity|ResumedActivity" | grep -o 'com\.[A-Za-z.]*/[A-Za-z.]*' | head -1; }
run(){ tag=$1; apk=$2
  adb uninstall $PKG >/dev/null 2>&1; adb install -r -g "$apk" > "$OUT/install_$tag.txt" 2>&1
  adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 8; adb shell am force-stop $PKG
  adb shell "printf '%s' '<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\" ?><map><boolean name=\"onboarding_done\" value=\"true\" /><boolean name=\"perm_flow_done\" value=\"true\" /><string name=\"language\">ar</string></map>' > /data/data/$PKG/shared_prefs/app_prefs.xml"
  adb shell am start -S -W -n $PKG/com.example.WidgetHostCheck >/dev/null 2>&1; sleep 8
  for n in $(seq 1 16); do dump "$OUT/bind_$tag.xml"; XY=$(tap_re "^ *Create *$" "$OUT/bind_$tag.xml"); if [ -z "$XY" ]; then [[ "$(top)" == *WidgetHostCheck* ]] && break; fi; [ -n "$XY" ] && adb shell input tap $XY; sleep 5; done
  adb shell am force-stop $PKG; sleep 2
  adb shell am start -S -W -n $PKG/com.example.WidgetHostCheck >/dev/null 2>&1; sleep 12
  adb exec-out screencap -p > "$OUT/host_$tag.png"
  adb shell wm size > "$OUT/wm_$tag.txt"; adb shell wm density >> "$OUT/wm_$tag.txt"
  adb logcat -d | grep -E "HOSTCHECK|WathakkerHome" > "$OUT/log_$tag.txt"
}
run old "$OLD"; run new "$NEW"
