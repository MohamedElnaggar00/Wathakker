#!/usr/bin/env python3
"""Assemble the Wathakker v3.0.6 Gradle app module from the committed reference decompile.

Inputs (already in the repo):
  reference/decompiled/apktool   - apktool decode of the shipped 3.0.6 APK (manifest, res, assets)
  reference/jadx/example         - jadx Java for com.example.*
Output: app/src/main/{AndroidManifest.xml,res,assets,java}
"""
import os, re, shutil, sys
import xml.etree.ElementTree as ET

ROOT = os.getcwd()
APK = os.path.join(ROOT, 'reference/decompiled/apktool')
JADX = os.path.join(ROOT, 'reference/jadx/example')
MAIN = os.path.join(ROOT, 'app/src/main')
ANDROID = 'http://schemas.android.com/apk/res/android'
ET.register_namespace('android', ANDROID)
ET.register_namespace('tools', 'http://schemas.android.com/tools')

# 1. clean old app source set (stale V2.0 tree is preserved in git history)
if os.path.isdir(os.path.join(ROOT, 'app/src')):
    shutil.rmtree(os.path.join(ROOT, 'app/src'))
os.makedirs(MAIN)

# 2. names of resources owned by the app (from the jadx R class)
rtxt = open(os.path.join(JADX, 'R.java'), encoding='utf-8').read()
R = {}
for m in re.finditer(r'public static final class (\w+) \{(.*?)\n    \}', rtxt, re.S):
    R[m.group(1)] = set(re.findall(r'public static int (\w+) =', m.group(2)))
print({k: len(v) for k, v in R.items()})

res_src = os.path.join(APK, 'res')
res_dst = os.path.join(MAIN, 'res')
os.makedirs(res_dst)
file_types = {'drawable': 'drawable', 'layout': 'layout', 'mipmap': 'mipmap', 'raw': 'raw',
              'font': 'font', 'xml': 'xml', 'color': 'color', 'anim': 'anim', 'menu': 'menu'}
kept = 0
for d in sorted(os.listdir(res_src)):
    base = d.split('-')[0]
    src = os.path.join(res_src, d)
    if base in file_types:
        t = file_types[base]
        names = R.get(t, set())
        for f in os.listdir(src):
            stem = f.rsplit('.', 1)[0]
            if stem in names:
                os.makedirs(os.path.join(res_dst, d), exist_ok=True)
                shutil.copy2(os.path.join(src, f), os.path.join(res_dst, d, f))
                kept += 1
print('file resources kept', kept)

# values: keep only app-owned string/color/style/id entries, default qualifier and v28/v30 style overrides
tag_to_type = {'string': 'string', 'color': 'color', 'style': 'style', 'item': None}
for d in sorted(os.listdir(res_src)):
    if d.split('-')[0] != 'values':
        continue
    if d != 'values':
        continue  # library translations / overlays are supplied by the dependencies
    for f in sorted(os.listdir(os.path.join(res_src, d))):
        if f in ('public.xml',):
            continue
        p = os.path.join(res_src, d, f)
        tree = ET.parse(p)
        root = tree.getroot()
        out = ET.Element('resources')
        for el in list(root):
            name = el.get('name')
            t = el.tag
            if t == 'item' and el.get('type') == 'id':
                if name in R.get('id', set()):
                    out.append(el)
            elif t in ('string', 'color', 'style'):
                if name.replace('.', '_') in R.get(t, set()):
                    out.append(el)
        if len(out):
            os.makedirs(os.path.join(res_dst, d), exist_ok=True)
            ET.ElementTree(out).write(os.path.join(res_dst, d, f), encoding='utf-8', xml_declaration=True)
            print('values', f, len(out))

# 3. assets
shutil.copytree(os.path.join(APK, 'assets'), os.path.join(MAIN, 'assets'))

# 4. manifest: keep only app-owned components
mp = os.path.join(APK, 'AndroidManifest.xml')
tree = ET.parse(mp)
root = tree.getroot()
for a in list(root.attrib):
    if a in ('package',) or a.startswith('{%s}compileSdk' % ANDROID) or a in ('platformBuildVersionCode', 'platformBuildVersionName'):
        del root.attrib[a]
for el in list(root):
    if el.tag == 'permission':
        root.remove(el)
    if el.tag == 'uses-permission' and el.get('{%s}name' % ANDROID, '').endswith('DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION'):
        root.remove(el)
app = root.find('application')
for a in ('appComponentFactory', 'debuggable', 'extractNativeLibs'):
    app.attrib.pop('{%s}%s' % (ANDROID, a), None)
for el in list(app):
    if el.tag in ('activity', 'receiver', 'service', 'provider', 'activity-alias'):
        n = el.get('{%s}name' % ANDROID, '')
        if not n.startswith('com.example') and not n.startswith('com.wathakker'):
            app.remove(el)
tree.write(os.path.join(MAIN, 'AndroidManifest.xml'), encoding='utf-8', xml_declaration=True)

# 5. java sources: jadx output, minus generated R / BuildConfig
jdst = os.path.join(MAIN, 'java/com/example')
shutil.copytree(JADX, jdst)
for gen in ('R.java', 'BuildConfig.java'):
    p = os.path.join(jdst, gen)
    if os.path.exists(p):
        os.remove(p)
# jadx does not emit nested R$ classes as files but remove any stray
for f in os.listdir(jdst):
    if f.startswith('R$'):
        os.remove(os.path.join(jdst, f))
n = sum(len(fs) for _, _, fs in os.walk(jdst))
print('java files', n)

# 6. app/build.gradle.kts: plain Java module, shipped identity, no Compose compiler plugin / KSP
gradle = """plugins {
  alias(libs.plugins.android.application)
}

android {
  namespace = "com.example"
  compileSdk { version = release(36) { minorApiLevel = 1 } }

  defaultConfig {
    applicationId = "com.wathakker.app"
    minSdk = 23
    targetSdk = 36
    versionCode = 12
    versionName = "3.0.6"
  }

  signingConfigs {
    create("debugConfig") {
      storeFile = file("${rootDir}/debug.keystore")
      storePassword = "android"
      keyAlias = "androiddebugkey"
      keyPassword = "android"
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
    debug { signingConfig = signingConfigs.getByName("debugConfig") }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
  buildFeatures {
    buildConfig = true
  }
  lint { abortOnError = false }
}

tasks.withType<JavaCompile>().configureEach {
  options.compilerArgs.addAll(listOf("-Xmaxerrs", "3000", "-Xmaxwarns", "50", "-Xlint:none"))
}

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.compose.material.icons.core)
  implementation(libs.androidx.compose.material.icons.extended)
  implementation(libs.androidx.compose.material3)
  implementation(libs.androidx.compose.ui)
  implementation(libs.androidx.compose.ui.graphics)
  implementation(libs.androidx.compose.ui.tooling.preview)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.lifecycle.runtime.compose)
  implementation(libs.androidx.lifecycle.runtime.ktx)
  implementation(libs.androidx.lifecycle.viewmodel.compose)
  implementation(libs.androidx.navigation.compose)
  implementation(libs.androidx.room.ktx)
  implementation(libs.androidx.room.runtime)
  implementation(libs.kotlinx.coroutines.android)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.okhttp)
  implementation("androidx.autofill:autofill:1.1.0")
  implementation("androidx.profileinstaller:profileinstaller:1.4.1")
  implementation("dev.chrisbanes.haze:haze:1.0.2")
}
"""
open(os.path.join(ROOT, 'app/build.gradle.kts'), 'w').write(gradle)
print('wrote app/build.gradle.kts')

# 7. real Java sources of the widget renderers from the repo's patch zip (jadx output for these two is not valid Java)
import zipfile
zp = os.path.join(ROOT, '1-widget-production-shortfix.zip')
with zipfile.ZipFile(zp) as z:
    for name in ('src/com/example/lockwidgets/LockWidgets.java', 'src/com/example/lockwidgets/HomeWidgets.java'):
        dst = os.path.join(MAIN, 'java', name[len('src/'):])
        with open(dst, 'wb') as f:
            f.write(z.read(name))
        print('override', dst)

# 8. targeted fixes for jadx type-inference leftovers
def patch(rel, subs):
    p = os.path.join(MAIN, 'java', rel)
    s = open(p, encoding='utf-8').read()
    for a, b in subs:
        if a not in s:
            print('PATCH MISS', rel, a)
        s = s.replace(a, b)
    open(p, 'w', encoding='utf-8').write(s)

patch('com/example/prayer/PrayerTimesScreenKt.java', [
    ('        ?? r17;\n', '        int r17;\n'),
    ('Boolean.valueOf((boolean) r17)', 'Boolean.valueOf(r17 != 0)'),
    ('? true : r17)', '? true : (r17 != 0))'),
    ('? true : r17,', '? true : (r17 != 0),'),
])

# 9. global jadx clean-ups over every generated java file
def remove_renamed_getters(src):
    # jadx emits the data-class componentN() twice: once renamed to the getter. Drop the renamed copy if the getter exists.
    pat = re.compile(r'[ \t]*/\* renamed from: component\d+, reason: from getter \*/\n(?:[ \t]*@[^\n]*\n)*[ \t]*(?:public |private |protected )?(?:final )?[\w<>\[\], ?.$]+ (get\w+|is\w+)\(\) \{')
    out = []
    pos = 0
    while True:
        m = pat.search(src, pos)
        if not m:
            out.append(src[pos:])
            break
        name = m.group(1)
        # find end of method by brace matching
        i = m.end()
        depth = 1
        while depth:
            c = src[i]
            if c == '{':
                depth += 1
            elif c == '}':
                depth -= 1
            i += 1
        # is the same method defined elsewhere in the file?
        decl = re.compile(r'\b' + name + r'\(\) \{')
        count = len(decl.findall(src))
        out.append(src[pos:m.start()])
        if count > 1:
            pos = i
            while pos < len(src) and src[pos] == '\n':
                pos += 1
        else:
            out.append(src[m.start():i])
            pos = i
    return ''.join(out)

fixed = 0
for dp, _, fs in os.walk(os.path.join(MAIN, 'java')):
    for f in fs:
        if not f.endswith('.java'):
            continue
        fp = os.path.join(dp, f)
        t = open(fp, encoding='utf-8').read()
        n = remove_renamed_getters(t)
        n = re.sub(r'\b([A-Z]\w*Kt)__\w+\b', r'\1', n)
        if n != t:
            open(fp, 'w', encoding='utf-8').write(n)
            fixed += 1
print('cleaned files', fixed)
