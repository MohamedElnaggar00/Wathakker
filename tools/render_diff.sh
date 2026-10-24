#!/bin/bash
# usage: render_diff.sh <old.apk> <new.apk> <outdir>   phone widget bitmaps: same content old vs new, byte compare
OLD=$1; NEW=$2; OUT=$3; PKG=com.wathakker.app
mkdir -p "$OUT"
adb wait-for-device; sleep 5
adb root >/dev/null 2>&1; sleep 3; adb shell settings put global auto_time 0; adb shell settings put global auto_time_zone 0
FILES=/sdcard/Android/data/$PKG/files
run(){ tag=$1; apk=$2
  adb uninstall $PKG >/dev/null 2>&1
  adb install -r -g "$apk" > "$OUT/install_$tag.txt" 2>&1
  adb shell am start -S -W -n $PKG/com.example.MainActivity >/dev/null 2>&1; sleep 6; adb shell am force-stop $PKG
  adb shell "rm -rf $FILES/*" 2>/dev/null
  adb shell date 102413002026.30 >> "$OUT/clock_$tag.txt" 2>&1; adb shell date >> "$OUT/clock_$tag.txt"
  adb shell am start -S -W -n $PKG/com.example.WidgetRenderCheck >/dev/null 2>&1; sleep 14
  mkdir -p "$OUT/$tag"; adb shell ls "$FILES" > "$OUT/$tag/ls.txt" 2>&1
  for f in $(adb shell ls "$FILES" | tr -d '\r' | grep -E '^(widget_|preview_).*\.png$'); do adb pull "$FILES/$f" "$OUT/$tag/$f" >/dev/null 2>&1; done
}
run old "$OLD"; run new "$NEW"
( cd "$OUT/old" && sha256sum *.png ) > "$OUT/old.sha" 2>/dev/null
( cd "$OUT/new" && sha256sum *.png ) > "$OUT/new.sha" 2>/dev/null
diff "$OUT/old.sha" "$OUT/new.sha" > "$OUT/diff.txt" && echo IDENTICAL > "$OUT/result.txt" || echo DIFFERENT > "$OUT/result.txt"
wc -l "$OUT/old.sha" "$OUT/new.sha" >> "$OUT/result.txt"
