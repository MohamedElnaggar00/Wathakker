package com.example.fajr.calculation

import android.content.Context
import java.util.Calendar

/**
 * Reads the user's calculation preferences (Asr juristic method, high-latitude rule,
 * per-prayer minute adjustments) from fajr_prefs and routes through the full
 * [PrayerTimesCalculator.calculateAll] overload. All prayer-time consumers should
 * call this instead of the bare calculator so adjustments apply everywhere.
 */
object PrayerAdjustments {
    private const val PREFS = "fajr_prefs"

    fun asrHanafi(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getInt("asr_juristic", 0) == 1

    fun highLatRule(context: Context): Int =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getInt("high_lat_rule", 0)

    fun offsetMinutes(context: Context): IntArray {
        val p = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        return intArrayOf(
            p.getInt("adj_fajr", 0), p.getInt("adj_shuruq", 0), p.getInt("adj_dhuhr", 0),
            p.getInt("adj_asr", 0), p.getInt("adj_maghrib", 0), p.getInt("adj_isha", 0)
        )
    }

    /** Next-Fajr helper for the alarm path: full calc so high-latitude rule and
     *  the user's per-prayer offsets apply to the alarm time too. */
    fun fajrTime(
        context: Context,
        calendar: Calendar,
        latitude: Double,
        longitude: Double,
        method: CalculationMethod
    ): Long = calculateAll(context, calendar, latitude, longitude, method).fajr

    fun calculateAll(
        context: Context,
        calendar: Calendar,
        latitude: Double,
        longitude: Double,
        method: CalculationMethod
    ): PrayerTimesCalculator.DayPrayerTimes {
        val asrFactor = if (asrHanafi(context)) 2 else 1
        return PrayerTimesCalculator.INSTANCE.calculateAll(
            calendar, latitude, longitude, method, asrFactor, highLatRule(context), offsetMinutes(context)
        )
    }
}
