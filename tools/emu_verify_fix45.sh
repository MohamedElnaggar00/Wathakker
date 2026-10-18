#!/bin/bash
# usage: emu_verify_fix45.sh <apk> <outdir>
# Targeted evidence for build 45 fixes: location-permission warning row (permission revoked),
# new location subtitle, scrolled prayer header transparency - dark + light.
set -x
APK="$1"; OUT="$2"; mkdir -p "$OUT"
PKG=com.wathakker.app
adb wait-for-device
adb uninstall $PKG >/dev/null 2>&1 || true
adb install -g "$APK" > "$OUT/install.txt" 2>&1
adb shell pm revoke $PKG android.permission.ACCESS_FINE_LOCATION || true
adb shell pm revoke $PKG android.permission.ACCESS_COARSE_LOCATION || true
shot(){ adb shell screencap -p /sdcard/s.png && adb pull /sdcard/s.png "$OUT/$1.png" >/dev/null; }
dump(){ adb shell uiautomator dump /sdcard/u.xml >/dev/null 2>&1; adb pull /sdcard/u.xml /tmp/u45.xml >/dev/null 2>&1; }
tap_attr(){ python3 - "$1" "$2" <<'PY'
import re,sys,subprocess
attr,val=sys.argv[1],sys.argv[2]
x=open('/tmp/u45.xml',encoding='utf-8').read()
for m in re.finditer(r'<node[^>]*>',x):
    n=m.group(0)
    if f'{attr}="{val}"' in n:
        b=re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',n)
        if b:
            x1,y1,x2,y2=map(int,b.groups())
            subprocess.run(['adb','shell','input','tap',str((x1+x2)//2),str((y1+y2)//2)])
            print('tapped',val)
            break
PY
}
adb shell cmd uimode night yes; sleep 2
adb shell monkey -p $PKG -c android.intent.category.LAUNCHER 1 >/dev/null 2>&1; sleep 10
dump; tap_attr content-desc "القائمة"; sleep 2
dump; tap_attr text "الإعدادات"; sleep 3
dump; tap_attr text "تغيير الموقع"; sleep 3
dump
shot 01-location-warning-dark
grep -q "تحديث تلقائي لمواقيت الصلاة حسب موقعك" /tmp/u45.xml && echo "PASS: new subtitle present" || echo "FAIL: new subtitle missing"
grep -q "صلاحية الموقع غير ممنوحة" /tmp/u45.xml && echo "PASS: warning row rendered (permission revoked)" || echo "FAIL: warning row missing"
adb shell cmd uimode night no; sleep 3
shot 02-location-warning-light
adb shell input keyevent BACK; sleep 2; adb shell input keyevent BACK; sleep 3
adb shell cmd uimode night yes; sleep 3
adb shell input swipe 360 1500 360 700 800; sleep 2
shot 03-prayer-scrolled-dark
adb shell cmd uimode night no; sleep 3
adb shell input swipe 360 1500 360 700 800; sleep 2
shot 04-prayer-scrolled-light
