package com.example.prayer.alerts

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.MainActivity
import com.example.R
import com.example.fajr.data.FajrPreferences
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S

/**
 * Fires a per-prayer bell. Bells are always ordinary notifications (no alarm UX):
 * the adhan bell posts a high-priority notification and the iqama bell a normal one
 * on its own channel; both follow the shared sound/vibration settings.
 * Always reschedules the next occurrence afterwards.
 */
class PrayerAlertReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        L10n.init(context)
        val prayer = intent.getIntExtra(PrayerAlertScheduler.EXTRA_PRAYER, -1)
        val kind = intent.getIntExtra(PrayerAlertScheduler.EXTRA_KIND, PrayerAlertScheduler.KIND_ADHAN)
        if (prayer !in 0..5) return

        if (kind == PrayerAlertScheduler.KIND_DND_OFF) {
            restoreDnd(context)
            return
        }
        if (!PrayerAlertStore.isEnabled(context, prayer)) return

        val nameKey = when (prayer) {
            0 -> S.PrayerFajr; 1 -> S.PrayerShuruq; 2 -> S.PrayerDhuhr
            3 -> S.PrayerAsr; 4 -> S.PrayerMaghrib; else -> S.PrayerIsha
        }
        val prayerName = L10n.t(nameKey)
        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val isIqama = kind == PrayerAlertScheduler.KIND_IQAMA
        val isEarly = kind == PrayerAlertScheduler.KIND_EARLY
        val channelId = if (isIqama) IQAMA_CHANNEL else ALERT_CHANNEL
        ensureChannel(context, nm, channelId)
        val openIntent = PendingIntent.getActivity(
            context, 400 + prayer + kind * 10,
            Intent(context, MainActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        val text = if (isIqama) {
            L10n.t(S.IqamaNowFmt).format(prayerName)
        } else if (isEarly) {
            L10n.t(S.PrayerApproachingFmt).format(prayerName, PrayerAlertStore.offsetMinutes(context, prayer))
        } else {
            L10n.t(S.PrayerNowFmt).format(prayerName)
        }
        val notification = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(prayerName)
            .setContentText(text)
            .setPriority(if (isIqama) NotificationCompat.PRIORITY_DEFAULT else NotificationCompat.PRIORITY_HIGH)
            .setCategory(NotificationCompat.CATEGORY_REMINDER)
            .setContentIntent(openIntent)
            .setAutoCancel(true)
            .build()
        nm.notify(400 + prayer + kind * 10, notification)

        if (kind == PrayerAlertScheduler.KIND_ADHAN && PrayerAlertStore.autoDnd(context, prayer)) {
            enableDnd(context)
        }

        // Schedule the next occurrence (tomorrow or later today).
        PrayerAlertScheduler.scheduleAll(context)
    }

    /**
     * Creates the bell channels, applying the shared tone/vibration settings. Channel
     * sound/vibration is sticky after creation, so when those settings change the channel
     * is deleted and recreated (tracked by a stored signature).
     */
    private fun ensureChannel(context: Context, nm: NotificationManager, channelId: String) {
        if (Build.VERSION.SDK_INT < 26) return
        val shared = FajrPreferences(context)
        val tone = shared.ringtoneUri ?: ""
        val vibrate = shared.isVibrationEnabled
        val signature = tone + "|" + vibrate
        val sp = context.getSharedPreferences(CHANNEL_PREFS, Context.MODE_PRIVATE)
        if (nm.getNotificationChannel(channelId) != null && sp.getString(channelId, null) != signature) {
            nm.deleteNotificationChannel(channelId)
        }
        val isIqama = channelId == IQAMA_CHANNEL
        val name = L10n.t(if (isIqama) S.IqamaReminder else S.AdhanReminder)
        val channel = NotificationChannel(
            channelId, name,
            if (isIqama) NotificationManager.IMPORTANCE_DEFAULT else NotificationManager.IMPORTANCE_HIGH
        )
        if (tone.isNotEmpty()) {
            channel.setSound(
                android.net.Uri.parse(tone),
                android.media.AudioAttributes.Builder()
                    .setUsage(android.media.AudioAttributes.USAGE_NOTIFICATION)
                    .build()
            )
        }
        channel.enableVibration(vibrate)
        channel.setShowBadge(true)
        nm.createNotificationChannel(channel)
        sp.edit().putString(channelId, signature).apply()
    }

    private fun enableDnd(context: Context) {
        try {
            val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            if (nm.isNotificationPolicyAccessGranted) {
                nm.setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_PRIORITY)
            }
        } catch (_: Throwable) {}
    }

    private fun restoreDnd(context: Context) {
        try {
            val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            if (nm.isNotificationPolicyAccessGranted) {
                nm.setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_ALL)
            }
        } catch (_: Throwable) {}
    }

    companion object {
        const val ALERT_CHANNEL = "prayer_alerts_channel"
        const val IQAMA_CHANNEL = "iqama_reminders_channel"
        private const val CHANNEL_PREFS = "bell_channels"
    }
}
