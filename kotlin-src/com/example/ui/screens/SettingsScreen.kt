package com.example.ui.screens

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.TextFields
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material.icons.outlined.Widgets
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.oneui.OneUICard
import com.example.ui.oneui.OneUIDialog
import com.example.ui.oneui.OneUIDivider
import com.example.ui.oneui.OneUIIconBadge
import com.example.ui.oneui.OneUIRow
import com.example.ui.oneui.OneUIScreen
import com.example.ui.oneui.OneUISwitch
import com.example.ui.oneui.SectionLabel
import com.example.ui.viewmodel.MainViewModel

@Composable
fun SettingsScreen(
    viewModel: MainViewModel,
    onBack: () -> Unit,
    onNavigateToFajr: (() -> Unit)? = null
) {
    val vibration by viewModel.vibrationEnabled.collectAsState()
    val appFont by viewModel.appFont.collectAsState()
    var showFontPicker by remember { mutableStateOf(false) }
    var showLockWidgets by remember { mutableStateOf(false) }
    val ringtoneLauncher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == -1) {
            @Suppress("DEPRECATION")
            val uri: Uri? = result.data?.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI")
            if (uri != null) viewModel.updateNotificationSound(uri.toString())
        }
    }

    SettingsContent(
        vibration = vibration,
        fontTitle = appFont.titleAr,
        onBack = onBack,
        onVibration = { viewModel.updateVibrationEnabled(it) },
        onPickFont = { showFontPicker = true },
        onPickSound = {
            val intent = Intent("android.intent.action.RINGTONE_PICKER")
            intent.putExtra("android.intent.extra.ringtone.TYPE", 2)
            intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true)
            intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true)
            ringtoneLauncher.launch(intent)
        },
        onFajr = onNavigateToFajr,
        onLockWidgets = { showLockWidgets = true }
    )

    if (showFontPicker) {
        FontPickerDialog(
            selected = appFont,
            onSelect = { viewModel.updateAppFont(it) },
            onDismiss = { showFontPicker = false }
        )
    }
    if (showLockWidgets) {
        LockWidgetsDialog { showLockWidgets = false }
    }
}

@Composable
fun LockWidgetsDialog(onDismiss: () -> Unit) {
    val context: Context = LocalContext.current
    val cs = MaterialTheme.colorScheme
    OneUIDialog(
        title = "ويدجت شاشة القفل",
        onDismiss = onDismiss,
        onConfirm = {
            val launch = context.packageManager.getLaunchIntentForPackage("com.samsung.android.app.dressroom")
            if (launch != null) {
                try {
                    context.startActivity(launch)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(context, "اضغط مطولًا على شاشة القفل لإضافة الويدجت", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(context, "اضغط مطولًا على شاشة القفل لإضافة الويدجت", Toast.LENGTH_LONG).show()
            }
            onDismiss()
        },
        confirmText = "فتح المحرر",
        dismissText = "إغلاق"
    ) {
        Text(
            "كل ويدجتات وَذكِّر متاحة في المساحة المخصصة تحت الساعة على شاشة القفل (One UI 8 أو أحدث).",
            color = cs.onSurface,
            fontSize = 16.sp,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(Modifier.height(12.dp))
        Text(
            "١. على شاشة القفل اضغط مطولًا على مكان فارغ، ثم أكّد هويتك.\n٢. اضغط «إضافة ويدجت» واختار «وَذكِّر» من القائمة.\n٣. اختار الويدجت الذي يعجبك، مثل «الإقامة (مصغر)» أو «شريط الصلاة».\n٤. رتّبها بالسحب ثم اضغط «تم».",
            color = cs.onSurface,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(Modifier.height(12.dp))
        Text(
            "الضغط على الويدجت من شاشة القفل يفتح التطبيق مباشرة.",
            modifier = Modifier.fillMaxWidth(),
            color = cs.onSurfaceVariant,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun SettingsContent(
    vibration: Boolean,
    fontTitle: String,
    onBack: () -> Unit,
    onVibration: (Boolean) -> Unit,
    onPickFont: () -> Unit,
    onPickSound: () -> Unit,
    onFajr: (() -> Unit)? = null,
    onLockWidgets: () -> Unit = {}
) {
    OneUIScreen(title = "الإعدادات", onBack = onBack) {
        if (onFajr != null) {
            item(key = "fajr") {
                OneUICard {
                    OneUIRow(
                        title = "تغيير الموقع",
                        summary = "المدينة وطريقة الحساب وإعدادات منبه الفجر",
                        leading = { OneUIIconBadge(Icons.Outlined.Alarm) },
                        trailing = { ChevronIcon() },
                        onClick = onFajr
                    )
                    OneUIDivider(70.dp)
                    OneUIRow(
                        title = "منبه صلاة الفجر",
                        summary = "تفعيل المنبه والنغمة",
                        leading = { OneUIIconBadge(Icons.Outlined.Alarm) },
                        trailing = { ChevronIcon() },
                        onClick = onFajr
                    )
                }
            }
        }
        item(key = "lock-l") { SectionLabel("شاشة القفل") }
        item(key = "lock") {
            OneUICard {
                OneUIRow(
                    title = "ويدجت شاشة القفل",
                    summary = "أضف ويدجت وَذكِّر تحت الساعة على شاشة القفل",
                    leading = { OneUIIconBadge(Icons.Outlined.Widgets) },
                    trailing = { ChevronIcon() },
                    onClick = onLockWidgets
                )
            }
        }
        item(key = "notif-l") { SectionLabel("الإشعارات") }
        item(key = "notif") {
            OneUICard {
                OneUIRow(
                    title = "نغمة الإشعار",
                    summary = "الافتراضي",
                    leading = { OneUIIconBadge(Icons.Outlined.MusicNote) },
                    trailing = { ChevronIcon() },
                    onClick = onPickSound
                )
                OneUIRow(
                    title = "الاهتزاز",
                    leading = { OneUIIconBadge(Icons.Outlined.Vibration) },
                    trailing = { OneUISwitch(vibration, onVibration) },
                    onClick = { onVibration(!vibration) }
                )
            }
        }
        item(key = "look-l") { SectionLabel("المظهر") }
        item(key = "look") {
            OneUICard {
                OneUIRow(
                    title = "خط التطبيق",
                    summary = fontTitle,
                    leading = { OneUIIconBadge(Icons.Outlined.TextFields) },
                    trailing = { ChevronIcon() },
                    onClick = onPickFont
                )
            }
        }
    }
}
