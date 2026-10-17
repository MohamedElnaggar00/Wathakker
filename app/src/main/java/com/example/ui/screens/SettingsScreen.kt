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
import androidx.compose.material.icons.outlined.DarkMode
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
import com.example.ThemeSettings
import com.example.ui.oneui.SectionLabel
import com.example.ui.viewmodel.MainViewModel
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S
import androidx.compose.material.icons.outlined.Language

@Composable
fun SettingsScreen(
    viewModel: MainViewModel,
    onBack: () -> Unit,
    onNavigateToFajr: (() -> Unit)? = null
) {
    val contextApp = LocalContext.current.applicationContext
    val vibration by viewModel.vibrationEnabled.collectAsState()
    val appFont by viewModel.appFont.collectAsState()
    var showFontPicker by remember { mutableStateOf(false) }
    var showThemePicker by remember { mutableStateOf(false) }
    var showLockWidgets by remember { mutableStateOf(false) }
    var showLanguagePicker by remember { mutableStateOf(false) }
    val themeMode by ThemeSettings.mode.collectAsState()
    val themeTitle = when (themeMode) {
        ThemeSettings.LIGHT -> L10n.t(S.Light)
        ThemeSettings.DARK -> L10n.t(S.Dark)
        else -> L10n.t(S.SystemAuto)
    }
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
        themeTitle = themeTitle,
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
        onPickTheme = { showThemePicker = true },
        onLockWidgets = { showLockWidgets = true },
        onPickLanguage = { showLanguagePicker = true }
    )

    if (showFontPicker) {
        FontPickerDialog(
            selected = appFont,
            onSelect = { viewModel.updateAppFont(it) },
            onDismiss = { showFontPicker = false }
        )
    }
    if (showThemePicker) {
        ThemePickerDialog(
            selected = themeMode,
            onSelect = { ThemeSettings.set(contextApp, it) },
            onDismiss = { showThemePicker = false }
        )
    }
    if (showLockWidgets) {
        LockWidgetsDialog { showLockWidgets = false }
    }
    if (showLanguagePicker) {
        LanguagePickerDialog(
            selected = L10n.lang,
            onSelect = { L10n.set(contextApp, it) },
            onDismiss = { showLanguagePicker = false }
        )
    }
}

@Composable
fun LockWidgetsDialog(onDismiss: () -> Unit) {
    val context: Context = LocalContext.current
    val cs = MaterialTheme.colorScheme
    OneUIDialog(
        title = L10n.t(S.LockWidgets),
        onDismiss = onDismiss,
        onConfirm = {
            val launch = context.packageManager.getLaunchIntentForPackage("com.samsung.android.app.dressroom")
            if (launch != null) {
                try {
                    context.startActivity(launch)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(context, L10n.t(S.LockWidgetsToast), Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(context, L10n.t(S.LockWidgetsToast), Toast.LENGTH_LONG).show()
            }
            onDismiss()
        },
        confirmText = L10n.t(S.OpenEditor),
        dismissText = L10n.t(S.Close)
    ) {
        Text(
            L10n.t(S.LockWidgetsDesc),
            color = cs.onSurface,
            fontSize = 16.sp,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(Modifier.height(12.dp))
        Text(
            L10n.t(S.LockWidgetsSteps),
            color = cs.onSurface,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(Modifier.height(12.dp))
        Text(
            L10n.t(S.LockWidgetsHint),
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
    themeTitle: String,
    onBack: () -> Unit,
    onVibration: (Boolean) -> Unit,
    onPickFont: () -> Unit,
    onPickSound: () -> Unit,
    onFajr: (() -> Unit)? = null,
    onPickTheme: () -> Unit = {},
    onLockWidgets: () -> Unit = {},
    onPickLanguage: () -> Unit = {}
) {
    OneUIScreen(title = L10n.t(S.Settings), onBack = onBack) {
        if (onFajr != null) {
            item(key = "fajr") {
                OneUICard {
                    OneUIRow(
                        title = L10n.t(S.ChangeLocation),
                        summary = L10n.t(S.LocationSubtitle),
                        leading = { OneUIIconBadge(Icons.Outlined.Alarm) },
                        trailing = { ChevronIcon() },
                        onClick = onFajr
                    )
                    OneUIDivider(70.dp)
                    OneUIRow(
                        title = L10n.t(S.FajrAlarm),
                        summary = L10n.t(S.FajrAlarmSubtitle),
                        leading = { OneUIIconBadge(Icons.Outlined.Alarm) },
                        trailing = { ChevronIcon() },
                        onClick = onFajr
                    )
                }
            }
        }
        item(key = "lock-l") { SectionLabel(L10n.t(S.LockScreenSection)) }
        item(key = "lock") {
            OneUICard {
                OneUIRow(
                    title = L10n.t(S.LockWidgets),
                    summary = L10n.t(S.LockWidgetsRowSub),
                    leading = { OneUIIconBadge(Icons.Outlined.Widgets) },
                    trailing = { ChevronIcon() },
                    onClick = onLockWidgets
                )
            }
        }
        item(key = "notif-l") { SectionLabel(L10n.t(S.Notifications)) }
        item(key = "notif") {
            OneUICard {
                OneUIRow(
                    title = L10n.t(S.NotifSound),
                    summary = L10n.t(S.Default),
                    leading = { OneUIIconBadge(Icons.Outlined.MusicNote) },
                    trailing = { ChevronIcon() },
                    onClick = onPickSound
                )
                OneUIRow(
                    title = L10n.t(S.Vibration),
                    leading = { OneUIIconBadge(Icons.Outlined.Vibration) },
                    trailing = { OneUISwitch(vibration, onVibration) },
                    onClick = { onVibration(!vibration) }
                )
            }
        }
        item(key = "look-l") { SectionLabel(L10n.t(S.Appearance)) }
        item(key = "look") {
            OneUICard {
                OneUIRow(
                    title = L10n.t(S.AppFont),
                    summary = fontTitle,
                    leading = { OneUIIconBadge(Icons.Outlined.TextFields) },
                    trailing = { ChevronIcon() },
                    onClick = onPickFont
                )
                OneUIDivider(70.dp)
                OneUIRow(
                    title = L10n.t(S.Appearance),
                    summary = themeTitle,
                    leading = { OneUIIconBadge(Icons.Outlined.DarkMode) },
                    trailing = { ChevronIcon() },
                    onClick = onPickTheme
                )
                OneUIDivider(70.dp)
                OneUIRow(
                    title = L10n.t(S.Language),
                    summary = L10n.lang.nativeName,
                    leading = { OneUIIconBadge(Icons.Outlined.Language) },
                    trailing = { ChevronIcon() },
                    onClick = onPickLanguage
                )
            }
        }
    }
}



