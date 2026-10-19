#!/bin/bash
# Lock/unlock keyguard check: with the app foreground, sleep + wake the device (secure keyguard).
# OLD build must show the app over the keyguard (the reported bug); NEW build must show the keyguard.
APK=$1;OUT=$2;OLD=$3;PKG=com.wathakker.app
mkdir -p "$OUT"; adb root >/dev/null; sleep 2
adb shell settings put global auto_time 0
adb shell date 101914002026.00 >/dev/null
adb shell locksettings set-pin 1234 > "$OUT/setpin.txt" 2>&1 || true
adb shell cmd uimode night no
run(){ N=$1; A=$2
 adb install -r -g "$A" >/dev/null; adb shell am force-stop $PKG
 adb shell input keyevent 224; adb shell wm dismiss-keyguard; sleep 1
 adb shell input text 1234; adb shell input keyevent 66; sleep 2
 adb shell am start -W -n $PKG/com.example.MainActivity >/dev/null; sleep 6
 adb exec-out screencap -p > "$OUT/${N}_1_app_before_lock.png"
 adb shell input keyevent 223; sleep 3
 adb shell input keyevent 224; sleep 3
 adb exec-out screencap -p > "$OUT/${N}_2_after_wake.png"
 adb shell dumpsys window > "$OUT/${N}_wake_window.txt"
 adb shell dumpsys window | grep -E "mCurrentFocus|mFocusedApp|mShowingLockscreen|isKeyguardShowing|mKeyguardShowing|mOccluded|keyguardOccluded|isKeyguardOccluded" | head -12 | tee "$OUT/${N}_wake_state.txt"
 adb shell input keyevent 3; sleep 2
 adb exec-out screencap -p > "$OUT/${N}_3_after_home.png"
 adb shell dumpsys window | grep -E "mCurrentFocus|mShowingLockscreen|isKeyguardShowing" | head -6 | tee "$OUT/${N}_home_state.txt"
 adb shell input text 1234; adb shell input keyevent 66; sleep 2; }
run old "$OLD"
run new "$APK"
adb shell locksettings clear --old 1234 >/dev/null 2>&1 || true
echo done58 | tee "$OUT/SUMMARY.txt"
