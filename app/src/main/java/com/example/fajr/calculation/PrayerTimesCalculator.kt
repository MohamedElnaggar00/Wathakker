package com.example.fajr.calculation

import java.util.Calendar
import java.util.TimeZone
import kotlin.math.*

enum class CalculationMethod(val id: Int, val titleAr: String, val fajrAngle: Double) {
    MUSLIM_WORLD_LEAGUE(0, "رابطة العالم الإسلامي (18°)", 18.0),
    EGYPTIAN(1, "الهيئة المصرية العامة للمساحة (19.5°)", 19.5),
    UMM_AL_QURA(2, "أم القرى - مكة المكرمة (18.5°)", 18.5),
    ISNA(3, "الجمعية الإسلامية لشمال أمريكا (15°)", 15.0),
    KARACHI(4, "جامعة العلوم الإسلامية بكراتشي (18°)", 18.0),
    DUBAI(5, "دبي (18.2°)", 18.2),
    KUWAIT(6, "الكويت (18°)", 18.0),
    QATAR(7, "قطر (18°)", 18.0);

    companion object {
        fun fromId(id: Int): CalculationMethod {
            return values().firstOrNull { it.id == id } ?: MUSLIM_WORLD_LEAGUE
        }
    }
}

object PrayerTimesCalculator {

    /**
     * Calculates the exact timestamp (millis) for Fajr prayer on a given calendar day,
     * given latitude, longitude, and calculation method.
     */
    fun calculateFajrTime(
        calendar: Calendar,
        latitude: Double,
        longitude: Double,
        method: CalculationMethod = CalculationMethod.EGYPTIAN
    ): Long {
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH) + 1
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Julian date relative to J2000.0
        val d = 367.0 * year - floor(7.0 * (year + floor((month + 9.0) / 12.0)) / 4.0) +
                floor(275.0 * month / 9.0) + day - 730531.5

        val g = fixAngle(357.529 + 0.98560028 * d)
        val q = fixAngle(280.459 + 0.98564736 * d)
        val l = fixAngle(q + 1.915 * sin(Math.toRadians(g)) + 0.020 * sin(Math.toRadians(2 * g)))

        val e = 23.439 - 0.00000036 * d
        val ra = fixAngle(Math.toDegrees(atan2(cos(Math.toRadians(e)) * sin(Math.toRadians(l)), cos(Math.toRadians(l))))) / 15.0

        val declination = Math.toDegrees(asin(sin(Math.toRadians(e)) * sin(Math.toRadians(l))))
        val eqOfTime = q / 15.0 - ra

        val timeZoneOffsetHours = TimeZone.getDefault().getOffset(calendar.timeInMillis) / 3600000.0

        // Solar noon in UTC
        val transit = 12.0 + (timeZoneOffsetHours * 15.0 - longitude) / 15.0 - eqOfTime

        // Solar hour angle H for Fajr angle
        val alpha = method.fajrAngle
        val cosH = (-sin(Math.toRadians(alpha)) - sin(Math.toRadians(latitude)) * sin(Math.toRadians(declination))) /
                (cos(Math.toRadians(latitude)) * cos(Math.toRadians(declination)))

        val h = if (cosH in -1.0..1.0) {
            Math.toDegrees(acos(cosH))
        } else {
            // Extreme latitude fallback: default to 1.5 hours before solar noon
            22.5
        }

        val fajrUtcHours = transit - (h / 15.0)

        // Convert hours to millis on the given calendar day
        val targetCal = calendar.clone() as Calendar
        val hours = floor(fajrUtcHours).toInt()
        val minutesDouble = (fajrUtcHours - hours) * 60.0
        val minutes = floor(minutesDouble).toInt()
        val seconds = floor((minutesDouble - minutes) * 60.0).toInt()

        targetCal.set(Calendar.HOUR_OF_DAY, hours)
        targetCal.set(Calendar.MINUTE, minutes)
        targetCal.set(Calendar.SECOND, seconds)
        targetCal.set(Calendar.MILLISECOND, 0)

        return targetCal.timeInMillis
    }

    private fun fixAngle(angle: Double): Double {
        var a = angle % 360.0
        if (a < 0) a += 360.0
        return a
    }
}
