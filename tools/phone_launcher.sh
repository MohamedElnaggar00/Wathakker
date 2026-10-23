#!/bin/bash
APK=$1; OUT=$2; PKG=com.wathakker.app
mkdir -p "$OUT"
adb wait-for-device
adb root >/dev/null 2>&1; sleep 3; adb wait-for-device
ROOTED=$(adb shell id 2>/dev/null | grep -c "uid=0")
if [ "$ROOTED" = "1" ]; then
  adb shell "setprop persist.sys.locale ar-EG; setprop ctl.restart zygote" >/dev/null 2>&1
  sleep 5; adb wait-for-device
  for i in $(seq 1 40); do
    B=$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')
    [ "$B" = "1" ] && break; sleep 2
  done
  sleep 12
fi
adb install -r -g "$APK" > "$OUT/install.txt" 2>&1
adb shell svc power stayon true
adb shell settings put system screen_off_timeout 1800000

shot(){ adb exec-out screencap -p > "$OUT/$1.png"; }
dump(){ adb shell uiautomator dump /sdcard/ui.xml >/dev/null 2>&1; adb pull /sdcard/ui.xml "$OUT/ui_$1.xml" >/dev/null 2>&1; }
CUR=""
findany(){ for N in "$@"; do X=$(python3 tools/findxy.py "$N" "$OUT/ui_$CUR.xml" 2>/dev/null); [ -n "$X" ] && { echo "$X"; return 0; }; done; return 1; }

# ---- open app once, pass onboarding/permissions ----
adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 10
shot 00_app_start
for i in 1 2 3 4 5 6; do
  CUR=onboard_$i; dump $CUR
  XY=$(findany "سماح" "Allow" "ALLOW" "أثناء استخدام التطبيق" "While using the app")
  if [ -n "$XY" ]; then adb shell input tap $XY; sleep 4; continue; fi
  XY=$(findany "التالي" "التالى" "متابعة" "Next" "Continue" "تم" "Done" "ابدأ" "البدء" "Start" "تخطي" "Skip")
  if [ -n "$XY" ]; then adb shell input tap $XY; sleep 4; continue; fi
  break
done
shot 01_after_onboard

# ---- helper: add a widget by label to drop target ----
add_widget(){
  LABEL="$1"; TX=$2; TY=$3; TAG=$4; EXPECTED=$5
  for ATT in 1 2 3; do
    adb shell input keyevent KEYCODE_HOME; sleep 3
    adb shell input swipe 880 1250 880 1250 1300; sleep 3
    CUR=menu_${TAG}_$ATT; dump $CUR; shot 10_menu_$TAG
    XY=$(findany "Widgets" "المصغّرة" "المصغرة" "ودجت" "الأدوات")
    if [ -z "$XY" ]; then echo "NO_WIDGETS_MENU $TAG att$ATT" >> "$OUT/SUMMARY.txt"; continue; fi
    adb shell input tap $XY; sleep 5
    # Scroll the app list BEFORE any section is expanded: swipes on app rows can
    # never pick up a widget cell. Position وذكّر high so its cells open into view.
    for i in 1 2 3 4 5 6 7 8; do
      CUR=picker_${TAG}_${ATT}_$i; dump $CUR
      XY=$(findany "وذكّر" "Wathkkir" "وذكر")
      [ -n "$XY" ] && break
      adb shell input swipe 540 1900 540 700 300; sleep 2
    done
    if [ -z "$XY" ]; then echo "APP_NOT_FOUND $TAG att$ATT" >> "$OUT/SUMMARY.txt"; continue; fi
    for i in 1 2 3 4 5 6; do
      CY=$(echo $XY | awk '{print $2}')
      [ "$CY" -lt 900 ] && break
      adb shell input swipe 540 1400 540 1000 300; sleep 2
      CUR=picker_${TAG}_${ATT}_h$i; dump $CUR
      XY=$(findany "وذكّر" "Wathkkir" "وذكر")
      [ -z "$XY" ] && break
    done
    [ -z "$XY" ] && { echo "APP_LOST $TAG att$ATT" >> "$OUT/SUMMARY.txt"; continue; }
    # Expand only if the section is still collapsed (no widget captions visible yet).
    CUR=wlist_${TAG}_${ATT}_0; dump $CUR
    if ! findany "$LABEL" "التاريخ الهجري" "التاريخ الميلادي" "مزخرف" >/dev/null; then
      adb shell input tap $XY; sleep 5
      CUR=wlist_${TAG}_${ATT}_0; dump $CUR
    fi
    shot 12_wlist_${TAG}_0
    XY=$(findany "$LABEL")
    for i in 1 2 3 4; do
      [ -n "$XY" ] && break
      adb shell input swipe 60 1800 60 900 300; sleep 2
      CUR=wlist_${TAG}_${ATT}_$i; dump $CUR
      XY=$(findany "$LABEL")
    done
    if [ -z "$XY" ]; then echo "WIDGET_NOT_FOUND $TAG $LABEL att$ATT" >> "$OUT/SUMMARY.txt"; continue; fi
    LXY=$(python3 tools/findxy.py "$LABEL" "$OUT/ui_$CUR.xml" cell 2>/dev/null)
    [ -z "$LXY" ] && LXY=$(python3 tools/findxy.py "$LABEL" "$OUT/ui_$CUR.xml" long 2>/dev/null)
    [ -n "$LXY" ] && XY=$LXY
    # Scroll the target row into the draggable band first: rows near the bottom edge
    # cannot start a drag that reaches the home grid.
    for i in 1 2 3 4 5 6; do
      CY=$(echo $XY | awk '{print $2}')
      [ -z "$CY" ] && break
      [ "$CY" -le 1300 ] && break
      adb shell input swipe 540 1400 540 1150 250; sleep 2
      CUR=wlist_${TAG}_${ATT}_r$i; dump $CUR
      XY=$(findany "$LABEL")
      [ -z "$XY" ] && break
    done
    CY=$(echo $XY | awk '{print $2}')
    if [ -z "$CY" ] || [ "$CY" -gt 1600 ]; then echo "ROW_TOO_LOW $TAG y=$CY att$ATT" >> "$OUT/SUMMARY.txt"; continue; fi
    adb shell input draganddrop $XY $TX $TY 4000; sleep 8
    shot 13_after_drag_${TAG}_$ATT
    CUR=cfg_${TAG}_$ATT; dump $CUR
    # A real config screen has an apply/add button; exact match avoids "التطبيق" hits.
    A=""
    for N in "تطبيق" "Apply" "إضافة" "Add" "تم" "Done"; do
      A=$(python3 tools/findxy.py "$N" "$OUT/ui_$CUR.xml" exact 2>/dev/null); [ -n "$A" ] && break
    done
    if [ -n "$A" ]; then
      adb shell input tap $A; sleep 5
      shot 14_after_config_$TAG
      adb shell input keyevent KEYCODE_HOME; sleep 3
      CUR=verify_${TAG}_$ATT; dump $CUR
      N=$(grep -c "wathakker" "$OUT/ui_$CUR.xml" 2>/dev/null)
      echo "DRAG_OK $TAG att$ATT (config applied, nodes=$N)" >> "$OUT/SUMMARY.txt"; return 0
    fi
    if grep -q "بحث" "$OUT/ui_$CUR.xml"; then
      echo "DRAG_STILL_PICKER $TAG att$ATT" >> "$OUT/SUMMARY.txt"; continue
    fi
    sleep 3
    CUR=verify_${TAG}_$ATT; dump $CUR
    N=$(grep -c "wathakker" "$OUT/ui_$CUR.xml" 2>/dev/null)
    if [ "$N" -ge "$EXPECTED" ]; then
      echo "DRAG_OK $TAG att$ATT nodes=$N (no config)" >> "$OUT/SUMMARY.txt"; return 0
    fi
    echo "DRAG_NO_EFFECT $TAG att$ATT nodes=$N" >> "$OUT/SUMMARY.txt"
  done
  echo "DRAG_FAIL $TAG" >> "$OUT/SUMMARY.txt"; return 1
}

add_widget "مزخرف" 540 700 decorated 1
add_widget "الصلاة القادمة" 540 1400 nextprayer 2
add_widget "التاريخ الهجري" 540 1800 hijri 3

adb shell input keyevent KEYCODE_HOME; sleep 4
CUR=final; dump $CUR
grep -c "wathakker" "$OUT/ui_final.xml" > "$OUT/widget_nodes.txt" 2>/dev/null
adb shell cmd uimode night no; sleep 4; shot 20_home_light
adb shell cmd uimode night yes; sleep 75; shot 21_home_dark
