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
        Intent(this, MainActivity::class.java).putExtra("circles", true).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP),
        PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
    )

    fun build(type: ComplicationType, s: PrayerState): ComplicationData? {
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
