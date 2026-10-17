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
import com.example.fajr.ui.FajrAlarmActivity
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S

/**
 * Fires a per-prayer bell: notification mode posts a high-priority notification,
 * alarm mode launches the full-screen alarm activity (shared sound/vibration profile).
 * Always reschedules the next occurrence afterwards.
 */
class PrayerAlertReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        L10n.init(context)
        val prayer = intent.getIntExtra(PrayerAlertScheduler.EXTRA_PRAYER, -1)
        val kind = intent.getIntExtra(PrayerAlertScheduler.EXTRA_KIND, PrayerAlertScheduler.KIND_ADHAN)
        if (prayer !in 0..5) return
        if (!PrayerAlertStore.isEnabled(context, prayer)) return

        val nameKey = when (prayer) {
            0 -> S.PrayerFajr; 1 -> S.PrayerShuruq; 2 -> S.PrayerDhuhr
            3 -> S.PrayerAsr; 4 -> S.PrayerMaghrib; else -> S.PrayerIsha
        }
        val prayerName = L10n.t(nameKey)
        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (kind == PrayerAlertScheduler.KIND_ADHAN &&
            PrayerAlertStore.mode(context, prayer) == PrayerAlertStore.MODE_ALARM
        ) {
            ensureAlarmChannel(nm)
            val alarmIntent = Intent(context, FajrAlarmActivity::class.java)
                .putExtra(PrayerAlertScheduler.EXTRA_PRAYER, prayer)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            val fullScreen = PendingIntent.getActivity(
                context, 300 + prayer, alarmIntent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )
            val notification = NotificationCompat.Builder(context, ALARM_CHANNEL)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(prayerName)
                .setContentText(L10n.t(S.PrayerNowFmt).format(prayerName))
                .setPriority(NotificationCompat.PRIORITY_MAX)
                .setCategory(NotificationCompat.CATEGORY_ALARM)
                .setFullScreenIntent(fullScreen, true)
                .setAutoCancel(true)
                .build()
            nm.notify(300 + prayer, notification)
            try { context.startActivity(alarmIntent) } catch (_: Exception) {}
        } else {
            ensureAlertChannel(nm)
            val openIntent = PendingIntent.getActivity(
                context, 400 + prayer + kind * 10,
                Intent(context, MainActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP),
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )
            val text = if (kind == PrayerAlertScheduler.KIND_IQAMA) {
                L10n.t(S.IqamaNowFmt).format(prayerName)
            } else {
                val offset = PrayerAlertStore.offsetMinutes(context, prayer)
                if (offset > 0) L10n.t(S.PrayerApproachingFmt).format(prayerName, offset)
                else L10n.t(S.PrayerNowFmt).format(prayerName)
            }
            val notification = NotificationCompat.Builder(context, ALERT_CHANNEL)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(prayerName)
                .setContentText(text)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_REMINDER)
                .setContentIntent(openIntent)
                .setAutoCancel(true)
                .build()
            nm.notify(400 + prayer + kind * 10, notification)
        }

        // Schedule the next occurrence (tomorrow or later today).
        PrayerAlertScheduler.scheduleAll(context)
    }

    private fun ensureAlertChannel(nm: NotificationManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            val channel = NotificationChannel(ALERT_CHANNEL, L10n.t(S.PrayerTimes), NotificationManager.IMPORTANCE_HIGH)
            channel.setShowBadge(true)
            nm.createNotificationChannel(channel)
        }
    }

    private fun ensureAlarmChannel(nm: NotificationManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            val channel = NotificationChannel(ALARM_CHANNEL, L10n.t(S.FajrAlarm), NotificationManager.IMPORTANCE_HIGH)
            channel.setBypassDnd(true)
            channel.enableVibration(true)
            channel.setShowBadge(true)
            nm.createNotificationChannel(channel)
        }
    }

    companion object {
        const val ALERT_CHANNEL = "prayer_alerts_channel"
        const val ALARM_CHANNEL = "prayer_alarm_channel"
    }
}
