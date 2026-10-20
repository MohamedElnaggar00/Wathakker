package com.wathakker.wear

import android.app.PendingIntent
import android.content.Intent
import androidx.wear.watchface.complications.data.ComplicationData
import androidx.wear.watchface.complications.data.ComplicationType
import androidx.wear.watchface.complications.data.CountDownTimeReference
import androidx.wear.watchface.complications.data.PlainComplicationText
import androidx.wear.watchface.complications.data.RangedValueComplicationData
import androidx.wear.watchface.complications.data.ShortTextComplicationData
import androidx.wear.watchface.complications.data.TimeDifferenceComplicationText
import androidx.wear.watchface.complications.data.TimeDifferenceStyle
import androidx.wear.watchface.complications.datasource.ComplicationRequest
import androidx.wear.watchface.complications.datasource.SuspendingComplicationDataSourceService
import java.time.Instant

/** Remaining time to the next prayer, with a progress ring on faces that draw one. Tapping opens the five prayer circles. */
open class PrayerComplicationService : SuspendingComplicationDataSourceService() {

    private fun tap(): PendingIntent = PendingIntent.getActivity(
        this, 0,
        Intent(this, CirclesActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK),
        PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
    )

    /** 0 = remaining countdown (and ranged ring); other values are the extra types, see [buildKind]. */
    open val kind: Int get() = 0

    fun build(type: ComplicationType, s: PrayerState): ComplicationData? = if (kind == 0) buildMain(type, s) else buildKind(kind, type, s)

    private fun txt(t: String) = PlainComplicationText.Builder(t).build()

    /** 1 greg date, 2 hijri date, 3 greg+hijri (long), 4 next prayer time, 5 current prayer, 6 current prayer elapsed, 7 upcoming prayer, 8 upcoming prayer countdown. */
    fun buildKind(k: Int, type: ComplicationType, s: PrayerState): ComplicationData? {
        val cd = txt("-")
        fun short(text: androidx.wear.watchface.complications.data.ComplicationText, title: String?, d: String): ComplicationData =
            ShortTextComplicationData.Builder(text, txt(d)).apply { if (title != null) setTitle(txt(title)) }.setTapAction(tap()).build()
        if (k == 3) {
            if (type != ComplicationType.LONG_TEXT) return null
            return androidx.wear.watchface.complications.data.LongTextComplicationData.Builder(
                txt(Prayer.gregDate(s.now)), txt("التاريخ")).setTitle(txt(Prayer.hijri(s.now))).setTapAction(tap()).build()
        }
        if (type != ComplicationType.SHORT_TEXT) return null
        val cal = java.util.Calendar.getInstance().apply { timeInMillis = s.now }
        fun down(at: Long) = TimeDifferenceComplicationText.Builder(TimeDifferenceStyle.SHORT_DUAL_UNIT, CountDownTimeReference(Instant.ofEpochMilli(at))).setText("^1").build()
        return when (k) {
            1 -> short(txt(cal.get(java.util.Calendar.DAY_OF_MONTH).toString()), Prayer.gregDate(s.now).substringAfter(' '), "التاريخ الميلادي")
            2 -> short(txt(Prayer.hijriDay(s.now)), Prayer.hijriMonth(s.now), "التاريخ الهجري")
            4 -> short(txt(Prayer.time12(s.next.at).substringBefore(' ')), s.next.name, "موعد الصلاة القادمة")
            5 -> short(txt(s.prev.name), null, "الصلاة الحالية")
            6 -> short(androidx.wear.watchface.complications.data.TimeDifferenceComplicationText.Builder(TimeDifferenceStyle.SHORT_DUAL_UNIT,
                androidx.wear.watchface.complications.data.CountUpTimeReference(Instant.ofEpochMilli(s.prev.at))).setText("^1").build(), s.prev.name, "الوقت منذ بداية الصلاة الحالية")
            7 -> short(txt(s.next.name), null, "الصلاة القادمة")
            8 -> short(down(s.next.at), s.next.name, "العد التنازلي للصلاة القادمة")
            else -> null
        }
    }

    fun buildMain(type: ComplicationType, s: PrayerState): ComplicationData? {
        val countdown = TimeDifferenceComplicationText.Builder(TimeDifferenceStyle.SHORT_DUAL_UNIT, CountDownTimeReference(Instant.ofEpochMilli(s.next.at)))
            .setText("^1")
            .build()
        val title = PlainComplicationText.Builder(s.next.name).build()
        val desc = PlainComplicationText.Builder("الوقت المتبقي لصلاة " + s.next.name).build()
        return when (type) {
            ComplicationType.RANGED_VALUE -> {
                val total = ((s.next.at - s.prev.at) / 60000f).coerceAtLeast(1f)
                val elapsed = ((s.now - s.prev.at) / 60000f).coerceIn(0f, total)
                RangedValueComplicationData.Builder(elapsed, 0f, total, desc)
                    .setText(countdown).setTitle(title).setTapAction(tap()).build()
            }
            ComplicationType.SHORT_TEXT ->
                ShortTextComplicationData.Builder(countdown, desc).setTitle(title).setTapAction(tap()).build()
            else -> null
        }
    }

    override fun getPreviewData(type: ComplicationType): ComplicationData? = build(type, Prayer.compute(this))

    override suspend fun onComplicationRequest(request: ComplicationRequest): ComplicationData? =
        build(request.complicationType, Prayer.compute(this))
}

class DateGregComplication : PrayerComplicationService() { override val kind get() = 1 }
class DateHijriComplication : PrayerComplicationService() { override val kind get() = 2 }
class DateBothComplication : PrayerComplicationService() { override val kind get() = 3 }
class NextTimeComplication : PrayerComplicationService() { override val kind get() = 4 }
class CurrentPrayerComplication : PrayerComplicationService() { override val kind get() = 5 }
class CurrentElapsedComplication : PrayerComplicationService() { override val kind get() = 6 }
class UpcomingPrayerComplication : PrayerComplicationService() { override val kind get() = 7 }
class UpcomingCountdownComplication : PrayerComplicationService() { override val kind get() = 8 }
