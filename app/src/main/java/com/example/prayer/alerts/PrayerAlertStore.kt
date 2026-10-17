package com.example.prayer.alerts

import android.content.Context
import com.example.fajr.data.FajrPreferences

/**
 * Per-prayer alert (bell) settings for 3.1.0. Per-prayer: enable, mode (notification
 * or full alarm), timing (minutes before adhan, 0 = at adhan), iqama reminder.
 * Sound/vibration/volume/snooze/max-duration stay SHARED in FajrPreferences (user decision).
 * Prayer index: 0 Fajr, 1 Shuruq, 2 Dhuhr, 3 Asr, 4 Maghrib, 5 Isha.
 */
object PrayerAlertStore {
    private const val PREFS = "prayer_alerts"

    const val MODE_NOTIFICATION = 0
    const val MODE_ALARM = 1

    private fun p(context: Context) = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    fun isEnabled(context: Context, prayer: Int): Boolean {
        migrate(context)
        return p(context).getBoolean("enabled_$prayer", false)
    }

    fun setEnabled(context: Context, prayer: Int, enabled: Boolean) {
        migrate(context)
        p(context).edit().putBoolean("enabled_$prayer", enabled).apply()
    }

    fun mode(context: Context, prayer: Int): Int {
        migrate(context)
        return p(context).getInt("mode_$prayer", MODE_NOTIFICATION)
    }

    fun setMode(context: Context, prayer: Int, mode: Int) {
        migrate(context)
        p(context).edit().putInt("mode_$prayer", mode).apply()
    }

    /** Minutes before adhan; 0 = exactly at adhan. */
    fun offsetMinutes(context: Context, prayer: Int): Int {
        migrate(context)
        return p(context).getInt("offset_$prayer", 0)
    }

    fun setOffsetMinutes(context: Context, prayer: Int, minutes: Int) {
        migrate(context)
        p(context).edit().putInt("offset_$prayer", minutes.coerceIn(0, 60)).apply()
    }

    fun iqamaReminder(context: Context, prayer: Int): Boolean {
        migrate(context)
        return p(context).getBoolean("iqama_$prayer", false)
    }

    fun setIqamaReminder(context: Context, prayer: Int, enabled: Boolean) {
        migrate(context)
        p(context).edit().putBoolean("iqama_$prayer", enabled).apply()
    }

    /** True when the legacy or new Fajr alarm path should ring (used by the legacy receiver gate). */
    fun isFajrAlarmActive(context: Context): Boolean {
        migrate(context)
        return FajrPreferences(context).isAlarmEnabled ||
            (isEnabled(context, 0) && mode(context, 0) == MODE_ALARM)
    }

    /** One-time migration: an enabled legacy Fajr alarm becomes the Fajr bell in alarm mode. */
    @Synchronized
    fun migrate(context: Context) {
        val prefs = p(context)
        if (prefs.getBoolean("migrated_v1", false)) return
        val legacy = FajrPreferences(context)
        if (legacy.isAlarmEnabled) {
            prefs.edit()
                .putBoolean("enabled_0", true)
                .putInt("mode_0", MODE_ALARM)
                .apply()
            // Silence the legacy scheduler path so only the new bell fires.
            legacy.isAlarmEnabled = false
        }
        prefs.edit().putBoolean("migrated_v1", true).apply()
    }
}
