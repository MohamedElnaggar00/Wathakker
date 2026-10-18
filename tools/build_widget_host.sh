#!/bin/bash
# Builds the minimal widget-host APK without gradle: aapt2 link + javac + d8 + apksigner.
set -euo pipefail
BT=$(ls -d "$ANDROID_HOME"/build-tools/* | sort -V | tail -1)
PJ=$(ls -d "$ANDROID_HOME"/platforms/android-* | sort -V | tail -1)/android.jar
W=tools/widgethost
O=$PWD/$W/out
rm -rf "$O"; mkdir -p "$O/classes" "$O/dex" "$O/dexgrant"
"$BT/aapt2" link -o "$O/host-unsigned.apk" --manifest "$W/AndroidManifest.xml" -I "$PJ" --min-sdk-version 26 --target-sdk-version 35
javac -source 11 -target 11 -cp "$PJ" -d "$O/classes" "$W/MainActivity.java" "$W/GrantBind.java"
"$BT/d8" --lib "$PJ" --min-api 26 --output "$O/dex" $(find "$O/classes" -name 'MainActivity*.class')
"$BT/d8" --lib "$PJ" --min-api 26 --output "$O/dexgrant" "$O/classes/GrantBind.class"
cp "$O/dexgrant/classes.dex" "$O/grantbind.dex"
cd "$O/dex" && zip -qj "$O/host-unsigned.apk" classes.dex && cd - >/dev/null
"$BT/zipalign" -f 4 "$O/host-unsigned.apk" "$O/host-aligned.apk"
[ -f debug.keystore ] || keytool -genkey -v -keystore debug.keystore -storepass android -alias androiddebugkey -keypass android -keyalg RSA -keysize 2048 -validity 10000 -dname "C=US, O=Android, CN=Android Debug" >/dev/null 2>&1
"$BT/apksigner" sign --ks debug.keystore --ks-pass pass:android --key-pass pass:android --out "$O/widgethost.apk" "$O/host-aligned.apk"
echo "built $O/widgethost.apk"
