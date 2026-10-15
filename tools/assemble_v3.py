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
LIBP = ('abc_','mtrl_','m3_','material_','design_','notification_','tooltip','select_dialog','support_simple','ime_base','custom_dialog','browser_actions','autofill_','androidx','text_view','expand_button','preference','fallback','btn_','common_','ic_call','ic_arrow_down','ic_other','ic_clock','ic_keyboard','ic_m3','ic_mtrl','ic_search','ic_menu','ic_launcher_foreground_unused','okhttp','m3c_')
kept = 0
for d in sorted(os.listdir(res_src)):
    base = d.split('-')[0]
    src = os.path.join(res_src, d)
    if base in file_types:
        t = file_types[base]
        names = R.get(t, set())
        for f in os.listdir(src):
            stem = f.rsplit('.', 1)[0]
            if stem in names or t == 'xml' or not stem.startswith(LIBP):
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
  options.compilerArgs.addAll(listOf("-Xmaxerrs", "200000", "-Xmaxwarns", "50", "-Xlint:none"))
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


# 10. more jadx repairs (round 2)
def read(rel):
    return open(os.path.join(MAIN, 'java', rel), encoding='utf-8').read()
def write(rel, s):
    open(os.path.join(MAIN, 'java', rel), 'w', encoding='utf-8').write(s)

# 10a. compose BOM selectable from the command line (-PcomposeBom=...)
gp = os.path.join(ROOT, 'app/build.gradle.kts')
g = open(gp).read()
g = g.replace('implementation(platform(libs.androidx.compose.bom))',
              'implementation(platform("androidx.compose:compose-bom:${providers.gradleProperty("composeBom").getOrElse("2025.09.00")}"))')
open(gp, 'w').write(g)

# 10b. hand-written class that was a D8 synthetic in the shipped APK (3.0.4 binary patch)
write('com/example/ui/screens/FajrDrawerAction.java', '''package com.example.ui.screens;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

public final class FajrDrawerAction implements Function0<Object> {
    public final MutableState f$0;

    public FajrDrawerAction(MutableState state) {
        this.f$0 = state;
    }

    @Override
    public Object invoke() {
        return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$26$lambda$25(this.f$0);
    }
}
''')

# 10c. CalculationMethod: jadx could not restore the enum, rewritten from its dump
write('com/example/fajr/calculation/CalculationMethod.java', '''package com.example.fajr.calculation;

public enum CalculationMethod {
    MUSLIM_WORLD_LEAGUE(0, "\\u0631\\u0627\\u0628\\u0637\\u0629 \\u0627\\u0644\\u0639\\u0627\\u0644\\u0645 \\u0627\\u0644\\u0625\\u0633\\u0644\\u0627\\u0645\\u064a (18\\u00b0)", 18.0d, 17.0d, null),
    EGYPTIAN(1, "\\u0627\\u0644\\u0647\\u064a\\u0626\\u0629 \\u0627\\u0644\\u0645\\u0635\\u0631\\u064a\\u0629 \\u0627\\u0644\\u0639\\u0627\\u0645\\u0629 \\u0644\\u0644\\u0645\\u0633\\u0627\\u062d\\u0629 (19.5\\u00b0)", 19.5d, 17.5d, null),
    UMM_AL_QURA(2, "\\u0623\\u0645 \\u0627\\u0644\\u0642\\u0631\\u0649 - \\u0645\\u0643\\u0629 \\u0627\\u0644\\u0645\\u0643\\u0631\\u0645\\u0629 (18.5\\u00b0)", 18.5d, null, 90),
    ISNA(3, "\\u0627\\u0644\\u062c\\u0645\\u0639\\u064a\\u0629 \\u0627\\u0644\\u0625\\u0633\\u0644\\u0627\\u0645\\u064a\\u0629 \\u0644\\u0634\\u0645\\u0627\\u0644 \\u0623\\u0645\\u0631\\u064a\\u0643\\u0627 (15\\u00b0)", 15.0d, 15.0d, null),
    KARACHI(4, "\\u062c\\u0627\\u0645\\u0639\\u0629 \\u0627\\u0644\\u0639\\u0644\\u0648\\u0645 \\u0627\\u0644\\u0625\\u0633\\u0644\\u0627\\u0645\\u064a\\u0629 \\u0628\\u0643\\u0631\\u0627\\u062a\\u0634\\u064a (18\\u00b0)", 18.0d, 18.0d, null),
    DUBAI(5, "\\u062f\\u0628\\u064a (18.2\\u00b0)", 18.2d, 18.2d, null),
    KUWAIT(6, "\\u0627\\u0644\\u0643\\u0648\\u064a\\u062a (18\\u00b0)", 18.0d, 17.5d, null),
    QATAR(7, "\\u0642\\u0637\\u0631 (18\\u00b0)", 18.0d, null, 90);

    public static final Companion INSTANCE = new Companion();
    private final double fajrAngle;
    private final int id;
    private final Double ishaAngle;
    private final Integer ishaMinutesAfterMaghrib;
    private final String titleAr;

    CalculationMethod(int id, String titleAr, double fajrAngle, Double ishaAngle, Integer ishaMinutesAfterMaghrib) {
        this.id = id;
        this.titleAr = titleAr;
        this.fajrAngle = fajrAngle;
        this.ishaAngle = ishaAngle;
        this.ishaMinutesAfterMaghrib = ishaMinutesAfterMaghrib;
    }

    public final double getFajrAngle() { return this.fajrAngle; }
    public final int getId() { return this.id; }
    public final Double getIshaAngle() { return this.ishaAngle; }
    public final Integer getIshaMinutesAfterMaghrib() { return this.ishaMinutesAfterMaghrib; }
    public final String getTitleAr() { return this.titleAr; }

    public static final class Companion {
        private Companion() {
        }

        public final CalculationMethod fromId(int id) {
            for (CalculationMethod m : CalculationMethod.values()) {
                if (m.getId() == id) {
                    return m;
                }
            }
            return CalculationMethod.MUSLIM_WORLD_LEAGUE;
        }
    }
}
''')

# 10d. AppDatabase: companion field clashes with the volatile INSTANCE
s = read('com/example/data/AppDatabase.java')
s = s.replace('public static final Companion INSTANCE = new Companion(null);', 'public static final Companion Companion = new Companion(null);')
write('com/example/data/AppDatabase.java', s)
for dp, _, fs in os.walk(os.path.join(MAIN, 'java')):
    for f in fs:
        fp = os.path.join(dp, f)
        t = open(fp, encoding='utf-8').read()
        n = re.sub(r'\bAppDatabase\.INSTANCE\.(getDatabase|getMIGRATION_7_8)', r'AppDatabase.Companion.\1', t)
        if n != t and f != 'AppDatabase.java':
            open(fp, 'w', encoding='utf-8').write(n)

# 10e. LocationManagerHelper leftovers
s = read('com/example/fajr/location/LocationManagerHelper.java')
s = s.replace('Address address = addresses.get(0);', 'Address address = (Address) addresses.get(0);')
s = s.replace('            e = e2;\n            e.printStackTrace();', '            e2.printStackTrace();')
write('com/example/fajr/location/LocationManagerHelper.java', s)

# 10f. FajrSettingsState synthetic default-args constructor
s = read('com/example/fajr/ui/FajrSettingsState.java')
m = re.search(r'    public /\* synthetic \*/ FajrSettingsState\(boolean z, .*?DefaultConstructorMarker defaultConstructorMarker\) \{\n', s)
if m:
    i = m.end()
    depth = 1
    while depth:
        c = s[i]
        depth += (c == '{') - (c == '}')
        i += 1
    new = ('    public /* synthetic */ FajrSettingsState(boolean z, boolean z2, String str, double d, double d2, String str2, long j, CalculationMethod calculationMethod, String str3, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, DefaultConstructorMarker defaultConstructorMarker) {\n'
           '        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? "\\u0627\\u0644\\u0642\\u0627\\u0647\\u0631\\u0629\\u060c \\u0645\\u0635\\u0631" : str, (i3 & 8) != 0 ? 30.0444d : d, (i3 & 16) != 0 ? 31.2357d : d2, (i3 & 32) != 0 ? "--:--" : str2, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? CalculationMethod.EGYPTIAN : calculationMethod, (i3 & 256) != 0 ? "\\u0646\\u063a\\u0645\\u0629 \\u0627\\u0644\\u0645\\u0646\\u0628\\u0647 \\u0627\\u0644\\u0627\\u0641\\u062a\\u0631\\u0627\\u0636\\u064a\\u0629" : str3, (i3 & 512) != 0 ? true : z3, (i3 & 1024) != 0 ? 5 : i, (i3 & 2048) != 0 ? 80 : i2, (i3 & 4096) != 0 ? false : z4, (i3 & 8192) != 0 ? true : z5, (i3 & 16384) != 0 ? false : z6);\n'
           '    }\n')
    s = s[:m.start()] + new + s[i:]
    write('com/example/fajr/ui/FajrSettingsState.java', s)
else:
    print('PATCH MISS FajrSettingsState ctor')

# 10g. Kotlin synthetic $default helpers that are not visible from Java
def find_close(s, i):
    depth = 1
    while depth:
        c = s[i]
        if c == '(':
            depth += 1
        elif c == ')':
            depth -= 1
        i += 1
    return i

def split_args(a):
    out, d, cur, instr = [], 0, '', False
    k = 0
    while k < len(a):
        c = a[k]
        if instr:
            cur += c
            if c == '\\':
                cur += a[k + 1]
                k += 1
            elif c == '"':
                instr = False
        elif c == '"':
            instr = True
            cur += c
        elif c in '([{':
            d += 1
            cur += c
        elif c in ')]}':
            d -= 1
            cur += c
        elif c == ',' and d == 0:
            out.append(cur.strip())
            cur = ''
        else:
            cur += c
        k += 1
    out.append(cur.strip())
    return out

count_ms = count_l = 0
for dp, _, fs in os.walk(os.path.join(MAIN, 'java')):
    for f in fs:
        fp = os.path.join(dp, f)
        t = open(fp, encoding='utf-8').read()
        o = t
        for needle, kind in (('SnapshotStateKt.mutableStateOf$default(', 'ms'), ('BuildersKt.launch$default(', 'l')):
            pos = 0
            while True:
                j = t.find(needle, pos)
                if j < 0:
                    break
                st = j + len(needle)
                en = find_close(t, st)
                args = split_args(t[st:en - 1])
                if kind == 'ms' and len(args) == 4 and args[1] == 'null':
                    rep = 'SnapshotStateKt.mutableStateOf(%s, SnapshotStateKt.structuralEqualityPolicy())' % args[0]
                    count_ms += 1
                elif kind == 'l' and len(args) == 6 and args[2] == 'null':
                    rep = 'BuildersKt.launch(%s, %s, kotlinx.coroutines.CoroutineStart.DEFAULT, %s)' % (args[0], args[1], args[3])
                    count_l += 1
                else:
                    pos = en
                    continue
                t = t[:j] + rep + t[en:]
                pos = j + len(rep)
        if t != o:
            open(fp, 'w', encoding='utf-8').write(t)
print('rewrote mutableStateOf$default', count_ms, 'launch$default', count_l)

# 10h. LocationManagerHelper.getCityNameFromCoordinates rewritten by hand (jadx dump was incorrect)
s = read('com/example/fajr/location/LocationManagerHelper.java')
a = s.index('    public final String getCityNameFromCoordinates(')
i = s.index('{', a)
depth = 1
i += 1
while depth:
    depth += (s[i] == '{') - (s[i] == '}')
    i += 1
new = '''    public final String getCityNameFromCoordinates(double latitude, double longitude) {
        try {
            Geocoder geocoder = new Geocoder(this.context, new Locale("ar"));
            List<Address> addresses = geocoder.getFromLocation(latitude, longitude, 1);
            if (addresses != null && !addresses.isEmpty()) {
                Address address = addresses.get(0);
                String city = address.getLocality();
                if (city == null) {
                    city = address.getSubAdminArea();
                }
                if (city == null) {
                    city = address.getAdminArea();
                }
                String country = address.getCountryName();
                if (city != null && city.length() != 0 && country != null && country.length() != 0) {
                    return city + "\\u060c " + country;
                }
                if (country == null) {
                    return city == null ? "\\u0645\\u0648\\u0642\\u0639\\u0643 \\u0627\\u0644\\u062d\\u0627\\u0644\\u064a" : city;
                }
                return country;
            }
            return "\\u0645\\u0648\\u0642\\u0639\\u0643 \\u0627\\u0644\\u062d\\u0627\\u0644\\u064a (" + String.format(Locale.US, "%.2f, %.2f", Double.valueOf(latitude), Double.valueOf(longitude)) + ")";
        } catch (Exception e) {
            e.printStackTrace();
            return "\\u0645\\u0648\\u0642\\u0639\\u0643 \\u0627\\u0644\\u062d\\u0627\\u0644\\u064a (" + String.format(Locale.US, "%.2f, %.2f", Double.valueOf(latitude), Double.valueOf(longitude)) + ")";
        }
    }
'''
s = s[:a] + new + s[i:].lstrip('\n')
write('com/example/fajr/location/LocationManagerHelper.java', s)

# 11. Kotlin rewrites of Compose screens (clean source, replaces the unusable jadx output)
gp = os.path.join(ROOT, 'app/build.gradle.kts')
g = open(gp).read()
g = g.replace('dev.chrisbanes.haze:haze:1.0.2', 'dev.chrisbanes.haze:haze:1.6.0')
g = g.replace('  alias(libs.plugins.android.application)\n}', '  alias(libs.plugins.android.application)\n  alias(libs.plugins.kotlin.compose)\n}', 1)
open(gp, 'w').write(g)
import shutil, glob, fnmatch
KS = os.path.join(ROOT, 'kotlin-src')
replaced = {}
if os.path.isdir(KS):
    for dp, _, fs in os.walk(KS):
        for f in fs:
            if not f.endswith('.kt'):
                continue
            src = os.path.join(dp, f)
            rel = os.path.relpath(src, KS)
            d = os.path.join(MAIN, 'java', rel)
            os.makedirs(os.path.dirname(d), exist_ok=True)
            shutil.copy(src, d)
            base = os.path.splitext(os.path.basename(rel))[0]
            pkgdir = os.path.join(MAIN, 'java', os.path.dirname(rel))
            for jf in os.listdir(pkgdir):
                if jf.endswith('.java') and (jf == base + 'Kt.java' or jf.startswith(base + 'Kt$') or jf.startswith('ComposableSingletons$' + base + 'Kt')):
                    os.remove(os.path.join(pkgdir, jf))
                    print('removed jadx', jf)
            print('kotlin', rel)

dl = os.path.join(KS, 'DELETE.txt')
if os.path.isfile(dl):
    for line in open(dl).read().split('\n'):
        line = line.strip()
        if not line or line.startswith('#'):
            continue
        dd, bn = os.path.split(line)
        stem = bn[:-5] if bn.endswith('.java') else bn
        pdir = os.path.join(MAIN, 'java', dd)
        if os.path.isdir(pdir):
            for jf in os.listdir(pdir):
                if jf == stem + '.java' or jf.startswith(stem + '$'):
                    os.remove(os.path.join(pdir, jf))
                    print('removed jadx', jf)

# 12. resources referenced by kept files but missing (stale R): recover from apktool values, declare custom attrs/ids
resdir = os.path.join(MAIN, 'res')
vals = {}
vdir = os.path.join(APK, 'res', 'values')
for f in os.listdir(vdir):
    if not f.endswith('.xml') or f == 'public.xml':
        continue
    try:
        r = ET.parse(os.path.join(vdir, f)).getroot()
    except Exception:
        continue
    for el in r:
        n = el.get('name')
        t = el.get('type') if el.tag == 'item' else el.tag
        if n and t:
            vals.setdefault((t, n.replace('.', '_')), el)
have = set()
for dp, _, fs in os.walk(os.path.join(resdir)):
    rt = os.path.basename(dp).split('-')[0]
    for f in fs:
        if rt == 'values':
            try:
                for el in ET.parse(os.path.join(dp, f)).getroot():
                    n = el.get('name')
                    if n:
                        have.add(((el.get('type') if el.tag == 'item' else el.tag), n.replace('.', '_')))
            except Exception:
                pass
        else:
            have.add((rt, f.rsplit('.', 1)[0]))
refs = set()
attr_names = set()
for dp, _, fs in os.walk(resdir):
    if os.path.basename(dp).split('-')[0] == 'values':
        continue
    for f in fs:
        if not f.endswith('.xml'):
            continue
        txt = open(os.path.join(dp, f), encoding='utf-8', errors='ignore').read()
        for m in re.finditer(r'@\+?(string|id|dimen|color|integer|bool|style|array|plurals)/([A-Za-z0-9_.]+)', txt):
            refs.add((m.group(1), m.group(2).replace('.', '_')))
        if os.path.basename(dp).split('-')[0] == 'xml' or True:
            for m in re.finditer(r'\bapp:([A-Za-z0-9_]+)=', txt):
                attr_names.add(m.group(1))
out = ET.Element('resources')
added = 0
for k in sorted(refs):
    if k in have:
        continue
    if k in vals:
        out.append(vals[k]); added += 1
    elif k[0] == 'id':
        e = ET.SubElement(out, 'item'); e.set('name', k[1]); e.set('type', 'id'); added += 1
    else:
        print('UNRESOLVED ref', k)
declared = set()
for dp, _, fs in os.walk(resdir):
    if os.path.basename(dp).split('-')[0] == 'values':
        for f in fs:
            try:
                for el in ET.parse(os.path.join(dp, f)).getroot():
                    if el.tag == 'attr':
                        declared.add(el.get('name'))
            except Exception:
                pass
for a in sorted(attr_names - declared):
    e = ET.SubElement(out, 'attr'); e.set('name', a)
    e.set('format', 'reference|string|integer|boolean|dimension|float|color'); added += 1
os.makedirs(os.path.join(resdir, 'values'), exist_ok=True)
ET.ElementTree(out).write(os.path.join(resdir, 'values', 'recovered.xml'), encoding='utf-8', xml_declaration=True)
print('recovered resource entries', added, 'attrs', sorted(attr_names - declared))



# 13. jadx repairs for non-UI code (round 3): coroutine lambdas, Room impls, default-arg constructors
JAVA = os.path.join(MAIN, 'java')
def all_java():
    for dp, _, fs in os.walk(JAVA):
        for f in fs:
            if f.endswith('.java'):
                yield os.path.join(dp, f)

PRIVATE_FIELD = re.compile(r'^(    )private ((?:final |volatile )*(?!static)[\w<>\[\],.?$ ]+ \w+(?: = .*)?;)$', re.M)
for p in all_java():
    s = open(p, encoding='utf-8').read()
    o = s
    # Room impls: jadx renamed the SQLiteStatement setters
    s = re.sub(r'\bmo\d+(bind(?:Long|Text|Double|Blob|Null))\(', r'\1(', s)
    # kotlinx.coroutines SharingStarted default-arg helper
    s = s.replace('SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null)', 'SharingStarted.Companion.WhileSubscribed(5000L, 0L)')
    # StringsKt.split$default is synthetic
    s = re.sub(r'StringsKt\.split\$default\((.*?), (new String\[\]\{[^}]*\}), false, 0, 6, \(Object\) null\)', r'StringsKt.split(\1, \2, false, 0)', s)
    # coroutine state-machine classes: raw Continuation casts
    s = re.sub(r'(\n\s+super\(\d+, )continuation\);', r'\1(Continuation) continuation);', s)
    s = re.sub(r'return new ([\w$.]+\((?:[^;\n]*?, )?)(?:\(Continuation\) )?continuation\);', r'return (Continuation) new \1(Continuation) continuation);', s)
    s = re.sub(r'(= new [\w$]+\((?:[^;\n]*?, )?)continuation\);', r'\1(Continuation) continuation);', s)
    s = re.sub(r'(\n\s+super\()continuation\);', r'\1(Continuation) continuation);', s)
    s = re.sub(r'\(\(([\w$]+)\) create\(', r'((\1) (Object) create(', s).replace('(Object) (Object) create(', '(Object) create(')
    s = s.replace('this.$onCreated = function1;', 'this.$onCreated = (Function1) function1;')
    s = re.sub(r'CollectionsKt\.listOf\(\(Object\[\]\) new (\w+)\[\]\{', r'java.util.Arrays.asList(new \1[]{', s)
    s = re.sub(r'CollectionsKt\.joinToString\$default\((\w+), ",", null, null, 0, null, null, 62, null\)', r'String.join(",", \1)', s)
    s = s.replace('(iqamaOffsets.get(name) != null ? r0.intValue() : 15)', '(iqamaOffsets.get(name) != null ? iqamaOffsets.get(name).intValue() : 15)')
    # Room impls
    if base.endswith('_Impl.java') or '_Impl$' in base:
        cls = base.split('$')[0].replace('.java', '')
        s = s.replace('.insert(_connection, (SQLiteConnection) ', '.insert(_connection, ')
        s = s.replace(', this, (SQLiteConnection) obj)', ', ' + cls + '.this, (SQLiteConnection) obj)')
        s = s.replace('new LongSparseArray(0, 1, null)', 'new LongSparseArray(0)')
        s = re.sub(r'List<Tag> (\w+) = (\w+)\.get\(', r'List<Tag> \1 = (List<Tag>) \2.get(', s)
        s = s.replace('TableInfo.INSTANCE.read', 'TableInfo.Companion.read')
        s = re.sub(r'th = th2;\n(\s*)_stmt = _stmt2;', r'_stmt2.close();\n\1throw th2;', s)
        s = re.sub(r'th = th2;(\n\s*\})', r'_stmt.close();\n                throw th2;\1', s)
        s = re.sub(r'new RoomOpenDelegate\(\) \{([^\n]*)\n\s*/\* JADX INFO[^\n]*\n\s*\{\n\s*super\((.*?)\);\n\s*\}\n', r'new RoomOpenDelegate(\2) {\1\n', s)
    if base == 'HisnViewModelKt.java':
        _line = 'return s.replaceAll("[\\u064B-\\u0652\\u0670\\u06D6-\\u06ED\\u0640]", "").replaceAll("[\\u0622\\u0623\\u0625\\u0671]", "\u0627").replace((char) 1609, (char) 1610).replace((char) 1577, (char) 1607);\n'
        s = re.sub(r'return StringsKt\.replace\$default\(.*\n', lambda m: _line, s)
    # outer-class fields read by the extracted lambda classes
    base = os.path.basename(p)
    if base in ('FajrViewModel.java', 'MainViewModel.java', 'HisnViewModel.java', 'DhikrRepository.java'):
        s = PRIVATE_FIELD.sub(r'\1\2', s)
    if base == 'CitiesDatabase.java':
        s = s.replace('CollectionsKt.listOf((Object[]) new CityItem[]{', 'java.util.Arrays.asList(new CityItem[]{')
    if s != o:
        open(p, 'w', encoding='utf-8').write(s)

# default-argument constructors jadx could not decompile
def fix_ctor(rel, sig_re, new_body):
    s = read(rel)
    m = re.search(sig_re, s)
    if not m:
        print('PATCH MISS ctor', rel)
        return
    start = s.rfind('    /* JADX WARN: Illegal instructions before constructor call */', 0, m.start())
    if start < 0:
        start = m.start()
    i = m.end()
    depth = 1
    while depth:
        c = s[i]
        depth += (c == '{') - (c == '}')
        i += 1
    s = s[:start] + new_body + s[i:]
    write(rel, s)

fix_ctor('com/example/data/DhikrHistory.java',
  r'    public /\* synthetic \*/ DhikrHistory\(long j, int i, long j2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker\) \{\n',
  '    public /* synthetic */ DhikrHistory(long j, int i, long j2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {\n'
  '        this((i2 & 1) != 0 ? 0L : j, i, (i2 & 4) != 0 ? System.currentTimeMillis() : j2, str);\n'
  '    }\n')
fix_ctor('com/example/data/HisnRead.java',
  r'    public /\* synthetic \*/ HisnRead\(long j, int i, String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker\) \{\n',
  '    public /* synthetic */ HisnRead(long j, int i, String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {\n'
  '        this((i2 & 1) != 0 ? 0L : j, i, str, j2);\n'
  '    }\n')

# 14. jadx expands Flow.map { } into an anonymous Flow with a hand-unrolled state machine; restore the map call
MAP_EXPR = {
    'MainViewModel.java': ['this.calculateStats((java.util.List) value)'],
    'HisnViewModel.java': [
        '{ java.util.LinkedHashMap m = new java.util.LinkedHashMap(); for (Object o : (java.util.List) value) { ChapterItemCount cc = (ChapterItemCount) o; m.put(Integer.valueOf(cc.getChapterId()), Integer.valueOf(cc.getItemCount())); } return m; }',
        'CollectionsKt.toSet((java.util.List) value)',
    ],
}
for p in all_java():
    base = os.path.basename(p)
    s = open(p, encoding='utf-8').read()
    o = s
    s = s.replace('FontChoice.INSTANCE', 'FontChoice.Companion')
    s = re.sub(r'public final int compare\(T t, T t2\)', 'public final int compare(Object t, Object t2)', s)
    if base in MAP_EXPR:
        exprs = list(MAP_EXPR[base])
        def repl(m):
            e = exprs.pop(0)
            body = e if e.startswith('{') else '{ return ' + e + '; }'
            return (m.group(1) + 'FlowKt.map((Flow) ' + m.group(2) + ', (kotlin.jvm.functions.Function2) (value, c) -> ' + body + ')' + m.group(3))
        s = re.sub(r'(final Flow (\w+) = [^\n]*;\n        this\.\w+ = FlowKt\.stateIn\()new Flow<[^\n]*\{ // from class: [\w.$]*special\$\$inlined\$map\$\d\n.*?\n        \}(, ViewModelKt)', repl, s, flags=re.S)
        if exprs:
            print('PATCH MISS flow map', base, len(exprs))
    if s != o:
        open(p, 'w', encoding='utf-8').write(s)

# 14b. extracted lambda that reads the enclosing ViewModel must be an inner class
p = os.path.join(JAVA, 'com/example/ui/hisn/HisnViewModel.java')
if os.path.isfile(p):
    s = open(p, encoding='utf-8').read()
    s = s.replace('    static final class AnonymousClass1 extends SuspendLambda', '    final class AnonymousClass1 extends SuspendLambda')
    open(p, 'w', encoding='utf-8').write(s)
