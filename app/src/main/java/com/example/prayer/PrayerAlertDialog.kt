package com.example.prayer

import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import kotlin.math.roundToInt

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
    val offset = remember(tick) { PrayerAlertStore.offsetMinutes(context, prayer) }
    val iqama = remember(tick) { PrayerAlertStore.iqamaReminder(context, prayer) }

    OneUIDialog(title = prayerName, onDismiss = onDismiss) {
        Column {
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
                // Timing: One UI slider. 0 = at the adhan, up to 60 minutes before in 5-minute
                // steps; value applies when the drag ends.
                var dragOffset by remember(tick) { mutableIntStateOf(offset) }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(L10n.t(S.AlertTiming), color = cs.onSurfaceVariant, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    Text(
                        if (dragOffset == 0) L10n.t(S.AtAdhanTime) else L10n.t(S.MinBeforeFmt).format(dragOffset),
                        color = cs.primary, fontSize = 13.sp, fontWeight = FontWeight.Bold
                    )
                }
                Slider(
                    value = dragOffset.toFloat(),
                    onValueChange = { dragOffset = (it / 5f).roundToInt() * 5 },
                    onValueChangeFinished = {
                        if (dragOffset != offset) {
                            PrayerAlertStore.setOffsetMinutes(context, prayer, dragOffset)
                            changed()
                        }
                    },
                    valueRange = 0f..60f,
                    steps = 11,
                    modifier = Modifier.fillMaxWidth()
                )
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
                if (prayer != 1) {
                    Spacer(Modifier.height(8.dp))
                    val dndGranted = remember(tick) {
                        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                        nm.isNotificationPolicyAccessGranted
                    }
                    val dndOn = remember(tick) { PrayerAlertStore.autoDnd(context, prayer) }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(Modifier.weight(1f)) {
                            Text(L10n.t(S.AutoDnd), color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                            Text(L10n.t(S.AutoDndSub), color = cs.onSurfaceVariant, fontSize = 11.sp)
                        }
                        OneUISwitch(dndOn && dndGranted, { want ->
                            if (want && !dndGranted) {
                                try {
                                    context.startActivity(
                                        Intent(Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS)
                                            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                    )
                                } catch (_: Throwable) {}
                            } else {
                                PrayerAlertStore.setAutoDnd(context, prayer, want)
                                changed()
                            }
                        })
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
            }
        }
    }
}
}
