package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.EditLocation
import androidx.compose.material.icons.outlined.GpsFixed
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.oneui.OneUICard
import com.example.ui.oneui.OneUITextField
import com.example.ui.oneui.SectionLabel
import com.example.ui.theme.MyApplicationTheme

/** Debug-only (city-name edit preview, 2026-10-23): renders the Location & calculation
 *  "Current city" row with One UI edit-affordance candidates for review, in the owner's
 *  real context (Current location mode selected, where the row has no Change action today).
 *  NOT production code: no prefs writes, no location or calculation changes.
 *  Launch: am start -n com.wathakker.app/com.example.CityEditProtoCheck [--es lang en] */
class CityEditProtoCheck : ComponentActivity() {
    override fun onCreate(b: Bundle?) {
        if (intent.getBooleanExtra("alias_selftest", false)) {
            val lines = mutableListOf<String>()
            fun check(name: String, ok: Boolean) { lines.add(name + ": " + (if (ok) "PASS" else "FAIL")) }
            try {
                val ctx = applicationContext
                val store = com.example.fajr.location.LocationAliasStore
                val H = com.example.fajr.location.LocationManagerHelper
                // Deterministic geocoder records (no backend): A = the user's renamed place, B = travel destination
                val keyA = H.buildPlaceKey("EG", "Hod Sakrah WA Abu Hamad")
                val keyAnorm = H.buildPlaceKey("EG", "  hod   sakrah wa abu hamad ")
                val keyAsub = H.buildPlaceKey("EG", "Borg El Arab")
                val keyB = H.buildPlaceKey("EG", "Cairo")
                val keyAotherCountry = H.buildPlaceKey("SA", "Hod Sakrah WA Abu Hamad")
                store.remove(ctx, keyA); store.remove(ctx, keyB); store.remove(ctx, keyAsub); store.remove(ctx, keyAotherCountry)
                check("identity: normalization stable (jitter/formatting)", keyA == keyAnorm)
                check("identity: distinct sublocalities distinct keys", keyA != keyAsub)
                check("identity: distinct places distinct keys", keyA != keyB)
                check("identity: same name other country distinct key", keyA != keyAotherCountry)
                store.put(ctx, keyA, "برج العرب الجديده")
                check("A->B: no alias at travel place (automatic name)", store.aliasFor(ctx, keyB) == null)
                check("B->A: alias restored on return", store.aliasFor(ctx, keyA) == "برج العرب الجديده")
                check("alias survives fresh read (disk-backed store)", store.aliasFor(ctx, keyA) == "برج العرب الجديده")
                check("distinct sublocality unaffected", store.aliasFor(ctx, keyAsub) == null)
                store.remove(ctx, keyA)
                check("reset removes alias", store.aliasFor(ctx, keyA) == null)
                check("other keys untouched after reset", store.aliasFor(ctx, keyB) == null)
            } catch (t: Throwable) {
                lines.add("selftest exception: " + t.message + " FAIL")
            }
            try { java.io.File(getExternalFilesDir(null), "alias_selftest.txt").writeText(lines.joinToString("\n") + "\n") } catch (_: Throwable) {}
            finish()
            return
        }

        super.onCreate(b)
        val en = intent.getStringExtra("lang") == "en"
        setContent {
            MyApplicationTheme {
                CompositionLocalProvider(LocalLayoutDirection provides if (en) LayoutDirection.Ltr else LayoutDirection.Rtl) {
                    Surface(Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                        Column(
                            Modifier
                                .fillMaxSize()
                                .verticalScroll(rememberScrollState())
                                .padding(horizontal = 16.dp)
                        ) {
                            Spacer(Modifier.height(16.dp))
                            SectionLabel(if (en) "Location" else "الموقع")
                            Spacer(Modifier.height(8.dp))

                            Caption(if (en) "Current design (no edit possible in auto mode)" else "الشكل الحالي — لا يمكن تعديل الاسم في الوضع التلقائي")
                            OneUICard {
                                LocRadio(true, Icons.Outlined.GpsFixed, if (en) "Current location" else "الموقع الحالي", if (en) "Automatically updates prayer times based on your location" else "يحدّث مواقيت الصلاة تلقائيًا حسب موقعك")
                                LocRadio(false, Icons.Outlined.EditLocation, if (en) "Choose country and city" else "اختر الدولة والمدينة", if (en) "Pick your city manually without location access" else "اختر مدينتك يدويًا دون إذن الموقع")
                                CityRowBase(cityName(en), if (en) "Current city" else "المدينة الحالية") {}
                            }

                            Caption(if (en) "A - circular pencil button (One UI tonal)" else "أ — زر قلم دائري بأسلوب One UI")
                            OneUICard {
                                LocRadio(true, Icons.Outlined.GpsFixed, if (en) "Current location" else "الموقع الحالي", if (en) "Automatically updates prayer times based on your location" else "يحدّث مواقيت الصلاة تلقائيًا حسب موقعك")
                                LocRadio(false, Icons.Outlined.EditLocation, if (en) "Choose country and city" else "اختر الدولة والمدينة", if (en) "Pick your city manually without location access" else "اختر مدينتك يدويًا دون إذن الموقع")
                                CityRowBase(cityName(en), if (en) "Current city" else "المدينة الحالية") {
                                    Box(
                                        Modifier
                                            .size(36.dp)
                                            .clip(CircleShape)
                                            .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.14f))
                                            .clickable {},
                                        contentAlignment = Alignment.Center
                                    ) { Icon(Icons.Outlined.Edit, if (en) "Edit city name" else "تعديل اسم المدينة", tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(18.dp)) }
                                }
                            }

                            Caption(if (en) "B - \"Edit\" text, matching the \"Change\" style below" else "ب — «تعديل» نصية بنفس أسلوب «تغيير» في صفوف الحساب")
                            OneUICard {
                                LocRadio(true, Icons.Outlined.GpsFixed, if (en) "Current location" else "الموقع الحالي", if (en) "Automatically updates prayer times based on your location" else "يحدّث مواقيت الصلاة تلقائيًا حسب موقعك")
                                LocRadio(false, Icons.Outlined.EditLocation, if (en) "Choose country and city" else "اختر الدولة والمدينة", if (en) "Pick your city manually without location access" else "اختر مدينتك يدويًا دون إذن الموقع")
                                CityRowBase(cityName(en), if (en) "Current city" else "المدينة الحالية") {
                                    Text(if (en) "Edit" else "تعديل", color = MaterialTheme.colorScheme.primary, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                                }
                            }

                            Caption(if (en) "C - after tapping edit: the field opens in place" else "ج — بعد الضغط على تعديل: الحقل يفتح في مكانه مباشرة")
                            OneUICard {
                                LocRadio(true, Icons.Outlined.GpsFixed, if (en) "Current location" else "الموقع الحالي", if (en) "Automatically updates prayer times based on your location" else "يحدّث مواقيت الصلاة تلقائيًا حسب موقعك")
                                LocRadio(false, Icons.Outlined.EditLocation, if (en) "Choose country and city" else "اختر الدولة والمدينة", if (en) "Pick your city manually without location access" else "اختر مدينتك يدويًا دون إذن الموقع")
                                CityRowEditing(cityName(en), en)
                            }

                            Caption(if (en) "D - a custom name with one-tap reset to the automatic name" else "د — اسم مخصّص مع إعادة التسمية التلقائية بضغطة")
                            OneUICard {
                                LocRadio(true, Icons.Outlined.GpsFixed, if (en) "Current location" else "الموقع الحالي", if (en) "Automatically updates prayer times based on your location" else "يحدّث مواقيت الصلاة تلقائيًا حسب موقعك")
                                LocRadio(false, Icons.Outlined.EditLocation, if (en) "Choose country and city" else "اختر الدولة والمدينة", if (en) "Pick your city manually without location access" else "اختر مدينتك يدويًا دون إذن الموقع")
                                CityRowBase(if (en) "My neighborhood" else "حيّي", if (en) "Current city" else "المدينة الحالية") {
                                    Box(
                                        Modifier
                                            .size(36.dp)
                                            .clip(CircleShape)
                                            .background(MaterialTheme.colorScheme.surfaceVariant)
                                            .clickable {},
                                        contentAlignment = Alignment.Center
                                    ) { Icon(Icons.Outlined.Refresh, if (en) "Reset to automatic name" else "إعادة الاسم التلقائي", tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(18.dp)) }
                                }
                            }
                            Spacer(Modifier.height(32.dp))
                        }
                    }
                }
            }
        }
    }

    private fun cityName(en: Boolean) = if (en) "Hod Sakrah WA Abu Hamad, Egypt" else "حد سكره وأبو حامد، مصر"
}

@Composable
private fun Caption(text: String) {
    Text(text, modifier = Modifier.padding(start = 8.dp, top = 18.dp, bottom = 6.dp), color = MaterialTheme.colorScheme.primary, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
}

@Composable
private fun LocRadio(selected: Boolean, icon: ImageVector, title: String, subtitle: String) {
    val cs = MaterialTheme.colorScheme
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(if (selected) cs.primary.copy(alpha = 0.12f) else Color.Transparent)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = selected, onClick = {})
        Spacer(Modifier.width(8.dp))
        Icon(icon, null, tint = cs.primary)
        Spacer(Modifier.width(10.dp))
        Column {
            Text(title, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            Text(subtitle, modifier = Modifier.padding(top = 2.dp), color = cs.onSurfaceVariant, fontSize = 13.sp, lineHeight = 18.sp)
        }
    }
}

/** Same metrics as the production city row: 12dp insets, 56dp icon column, 13sp label, 14sp semibold name. */
@Composable
private fun CityRowBase(name: String, label: String, trailing: @Composable () -> Unit) {
    val cs = MaterialTheme.colorScheme
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(Modifier.width(56.dp))
        Icon(Icons.Outlined.LocationOn, null, tint = cs.primary)
        Spacer(Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(label, modifier = Modifier.padding(top = 2.dp), color = cs.onSurfaceVariant, fontSize = 13.sp, lineHeight = 18.sp)
            Text(name, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
        }
        trailing()
    }
}

/** Inline editing state: label above, field in the row's own place, confirm + cancel tonal circles. */
@Composable
private fun CityRowEditing(name: String, en: Boolean) {
    val cs = MaterialTheme.colorScheme
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(cs.primary.copy(alpha = 0.06f))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(Modifier.width(56.dp))
        Icon(Icons.Outlined.LocationOn, null, tint = cs.primary)
        Spacer(Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(if (en) "Current city" else "المدينة الحالية", modifier = Modifier.padding(top = 2.dp), color = cs.onSurfaceVariant, fontSize = 13.sp, lineHeight = 18.sp)
            OneUITextField(value = name, onValueChange = {}, placeholder = if (en) "City name" else "اسم المدينة")
        }
        Spacer(Modifier.width(6.dp))
        Box(
            Modifier
                .size(36.dp)
                .clip(CircleShape)
                .background(cs.primary.copy(alpha = 0.14f))
                .clickable {},
            contentAlignment = Alignment.Center
        ) { Icon(Icons.Outlined.Check, if (en) "Save" else "حفظ", tint = cs.primary, modifier = Modifier.size(18.dp)) }
        Spacer(Modifier.width(6.dp))
        Box(
            Modifier
                .size(36.dp)
                .clip(CircleShape)
                .background(cs.surfaceVariant)
                .clickable {},
            contentAlignment = Alignment.Center
        ) { Icon(Icons.Outlined.Close, if (en) "Cancel" else "إلغاء", tint = cs.onSurfaceVariant, modifier = Modifier.size(18.dp)) }
    }
}
