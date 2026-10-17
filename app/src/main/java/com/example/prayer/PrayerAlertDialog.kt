package com.example.prayer

import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material.icons.outlined.Remove
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fajr.data.FajrPreferences
import com.example.fajr.sound.RingtoneHelper
import com.example.prayer.alerts.PrayerAlertScheduler
import com.example.prayer.alerts.PrayerAlertStore
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S
import com.example.ui.oneui.OneUIDialog
import com.example.ui.oneui.OneUISwitch

/**
 * Per-prayer bell settings (long-press a bell on the Prayer screen): enable, alert type
 * (notification / full alarm), timing relative to adhan, iqama reminder. Below the divider,
 * the SHARED sound/vibration/volume/duration profile (single profile for all prayers).
 */
@Composable
fun PrayerAlertDialog(prayer: Int, prayerName: String, onDismiss: () -> Unit) {
    val context = LocalContext.current
    val cs = MaterialTheme.colorScheme
    var tick by remember { mutableIntStateOf(0) }

    val ringtonePickerLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == -1) {
            @Suppress("DEPRECATION")
            val uri: android.net.Uri? = result.data?.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI")
            if (uri != null) {
                val title = RingtoneHelper(context).getRingtoneTitle(uri)
                val prefs = FajrPreferences(context)
                prefs.ringtoneUri = uri.toString()
                prefs.ringtoneTitle = title
                tick++
            }
        }
    }
    val audioPickerLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri: android.net.Uri? ->
        if (uri != null) {
            val title = RingtoneHelper(context).getRingtoneTitle(uri)
            val prefs = FajrPreferences(context)
            prefs.ringtoneUri = uri.toString()
            prefs.ringtoneTitle = title
            tick++
        }
    }

    fun changed() {
        tick++
        PrayerAlertScheduler.scheduleAll(context)
    }

    val prefs = remember(tick) { FajrPreferences(context) }
    val enabled = remember(tick) { PrayerAlertStore.isEnabled(context, prayer) }
    val mode = remember(tick) { PrayerAlertStore.mode(context, prayer) }
    val offset = remember(tick) { PrayerAlertStore.offsetMinutes(context, prayer) }
    val iqama = remember(tick) { PrayerAlertStore.iqamaReminder(context, prayer) }

    OneUIDialog(title = prayerName, onDismiss = onDismiss) {
        Column(Modifier.verticalScroll(rememberScrollState())) {
            // Enable
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Outlined.Notifications, null, tint = cs.primary)
                    Spacer(Modifier.width(10.dp))
                    Text(L10n.t(S.Notifications), color = cs.onSurface, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                }
                OneUISwitch(enabled, { PrayerAlertStore.setEnabled(context, prayer, it); changed() })
            }
            if (enabled) {
                Spacer(Modifier.height(10.dp))
                // Alert type
                Text(L10n.t(S.AlertMode), color = cs.onSurfaceVariant, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                AlertModeRow(
                    selected = mode == PrayerAlertStore.MODE_NOTIFICATION,
                    icon = Icons.Outlined.Notifications,
                    title = L10n.t(S.AlertModeNotif),
                    onClick = { PrayerAlertStore.setMode(context, prayer, PrayerAlertStore.MODE_NOTIFICATION); changed() }
                )
                AlertModeRow(
                    selected = mode == PrayerAlertStore.MODE_ALARM,
                    icon = Icons.Outlined.Alarm,
                    title = L10n.t(S.AlertModeAlarm),
                    onClick = { PrayerAlertStore.setMode(context, prayer, PrayerAlertStore.MODE_ALARM); changed() }
                )
                Spacer(Modifier.height(8.dp))
                // Timing
                Text(L10n.t(S.AlertTiming), color = cs.onSurfaceVariant, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        if (offset == 0) L10n.t(S.AtAdhanTime) else L10n.t(S.MinBeforeFmt).format(offset),
                        color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RoundBtn(Icons.Outlined.Remove, offset > 0) { PrayerAlertStore.setOffsetMinutes(context, prayer, offset - 5); changed() }
                        Spacer(Modifier.width(10.dp))
                        RoundBtn(Icons.Outlined.Add, offset < 60) { PrayerAlertStore.setOffsetMinutes(context, prayer, offset + 5); changed() }
                    }
                }
                // Iqama reminder (no iqama for Shuruq)
                if (prayer != 1) {
                    Spacer(Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(Modifier.weight(1f)) {
                            Text(L10n.t(S.IqamaReminder), color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                            Text(L10n.t(S.IqamaReminderSub), color = cs.onSurfaceVariant, fontSize = 11.sp)
                        }
                        OneUISwitch(iqama, { PrayerAlertStore.setIqamaReminder(context, prayer, it); changed() })
                    }
                }
                Spacer(Modifier.height(12.dp))
                // Shared profile
                Text(L10n.t(S.SharedAlertSettings), color = cs.onSurfaceVariant, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(4.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .clickable {
                            val intent = Intent("android.intent.action.RINGTONE_PICKER")
                            intent.putExtra("android.intent.extra.ringtone.TYPE", 4)
                            intent.putExtra("android.intent.extra.ringtone.TITLE", L10n.t(S.PickRingtone))
                            intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false)
                            intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true)
                            ringtonePickerLauncher.launch(intent)
                        }
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Outlined.MusicNote, null, tint = cs.primary)
                    Spacer(Modifier.width(10.dp))
                    Column(Modifier.weight(1f)) {
                        Text(L10n.t(S.SelectedTone), color = cs.onSurfaceVariant, fontSize = 11.sp)
                        Text(prefs.ringtoneTitle, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                    }
                    Text(
                        L10n.t(S.AudioFile), color = cs.primary, fontSize = 12.sp, fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .clickable { audioPickerLauncher.launch("audio/*") }
                            .padding(6.dp)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Outlined.Vibration, null, tint = cs.primary)
                        Spacer(Modifier.width(10.dp))
                        Text(L10n.t(S.VibrateDuringAlarm), color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                    }
                    OneUISwitch(prefs.isVibrationEnabled, { prefs.isVibrationEnabled = it; tick++ })
                }
                Spacer(Modifier.height(4.dp))
                Text(L10n.t(S.AlarmVolume), color = cs.onSurfaceVariant, fontSize = 12.sp)
                Slider(
                    value = prefs.alarmVolume / 100f,
                    onValueChange = { prefs.alarmVolume = (it * 100).toInt(); tick++ },
                    modifier = Modifier.fillMaxWidth()
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(L10n.t(S.SnoozeDuration), color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RoundBtn(Icons.Outlined.Remove, prefs.maxDurationMinutes > 1) {
                            prefs.maxDurationMinutes = prefs.maxDurationMinutes - 1; tick++
                        }
                        Text(
                            L10n.minutesCount(prefs.maxDurationMinutes),
                            color = cs.primary, fontSize = 13.sp, fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 10.dp)
                        )
                        RoundBtn(Icons.Outlined.Add, prefs.maxDurationMinutes < 30) {
                            prefs.maxDurationMinutes = prefs.maxDurationMinutes + 1; tick++
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun AlertModeRow(selected: Boolean, icon: ImageVector, title: String, onClick: () -> Unit) {
    val cs = MaterialTheme.colorScheme
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .clickable(onClick = onClick)
            .background(if (selected) cs.primary.copy(alpha = 0.12f) else Color.Transparent)
            .padding(horizontal = 8.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = selected, onClick = onClick)
        Icon(icon, null, tint = cs.primary)
        Spacer(Modifier.width(8.dp))
        Text(title, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
    }
}

@Composable
private fun RoundBtn(icon: ImageVector, enabled: Boolean, onClick: () -> Unit) {
    val cs = MaterialTheme.colorScheme
    IconButton(
        onClick = onClick,
        enabled = enabled,
        modifier = Modifier
            .size(32.dp)
            .clip(CircleShape)
            .background(if (enabled) cs.primary.copy(alpha = 0.12f) else cs.onSurface.copy(alpha = 0.05f))
    ) {
        Icon(icon, null, tint = if (enabled) cs.primary else cs.onSurfaceVariant.copy(alpha = 0.4f), modifier = Modifier.size(16.dp))
    }
}
