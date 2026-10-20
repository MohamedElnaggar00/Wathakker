#!/bin/bash
APK=$1; OUT=$2; P=com.wathakker.app; mkdir -p "$OUT"; adb wait-for-device; adb root >/dev/null 2>&1; sleep 2; adb wait-for-device
adb shell input keyevent 82; adb shell settings put global hide_error_dialogs 1
adb shell cmd role add-role-holder android.app.role.HOME com.android.launcher3 >/dev/null 2>&1
adb install -g -r "$APK" >/dev/null 2>&1
UIDN=0
adb shell am start -W -n $P/com.example.MainActivity >/dev/null; sleep 6
adb shell input keyevent 3; sleep 2
adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1
adb shell input swipe 540 1800 540 600 300; sleep 2
adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u.xml >/dev/null 2>&1
read x y < <(python3 - <<'PY'
import re,xml.etree.ElementTree as ET
for n in ET.parse('/tmp/u.xml').iter('node'):
    if 'Wathkkir' in (n.get('text') or '') or 'Wathkkir' in (n.get('content-desc') or ''):
        b=list(map(int,re.findall(r'\d+',n.get('bounds'))));print((b[0]+b[2])//2,(b[1]+b[3])//2);break
PY
)
echo "icon at $x $y" > "$OUT/log.txt"
adb exec-out screencap -p > "$OUT/drawer.png"
adb shell input swipe $x $y $x $y 900; sleep 2
adb exec-out screencap -p > "$OUT/shortcuts.png"
echo done > "$OUT/done.txt"
