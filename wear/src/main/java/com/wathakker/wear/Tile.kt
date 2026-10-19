package com.wathakker.wear

import android.content.ComponentName
import androidx.wear.protolayout.ActionBuilders
import androidx.wear.protolayout.ColorBuilders.argb
import androidx.wear.protolayout.DimensionBuilders.degrees
import androidx.wear.protolayout.DimensionBuilders.dp
import androidx.wear.protolayout.DimensionBuilders.expand
import androidx.wear.protolayout.DimensionBuilders.sp
import androidx.wear.protolayout.LayoutElementBuilders
import androidx.wear.protolayout.ModifiersBuilders
import androidx.wear.protolayout.ResourceBuilders
import androidx.wear.protolayout.TimelineBuilders
import androidx.wear.tiles.RequestBuilders
import androidx.wear.tiles.TileBuilders
import androidx.wear.tiles.TileService
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture

/** The gold arc watch widget: arc progress between the previous and the next prayer, next prayer in the middle. */
class PrayerTileService : TileService() {

    private fun text(t: String, size: Float, color: Int, bold: Boolean) =
        LayoutElementBuilders.Text.Builder()
            .setText(t)
            .setFontStyle(
                LayoutElementBuilders.FontStyle.Builder()
                    .setSize(sp(size)).setColor(argb(color))
                    .setWeight(if (bold) LayoutElementBuilders.FONT_WEIGHT_BOLD else LayoutElementBuilders.FONT_WEIGHT_NORMAL)
                    .build()
            ).build()

    private fun layout(s: PrayerState): LayoutElementBuilders.LayoutElement {
        val sweep = 270f
        val track = LayoutElementBuilders.ArcLine.Builder().setLength(degrees(sweep)).setThickness(dp(16f)).setColor(argb(0xFF3A3420.toInt())).build()
        val fill = LayoutElementBuilders.ArcLine.Builder().setLength(degrees(sweep * s.progress)).setThickness(dp(16f)).setColor(argb(0xFFD6B64A.toInt())).build()
        fun arc(line: LayoutElementBuilders.ArcLine) = LayoutElementBuilders.Arc.Builder()
            .setAnchorAngle(degrees(-135f)).setAnchorType(LayoutElementBuilders.ARC_ANCHOR_START).addContent(line).build()

        val center = LayoutElementBuilders.Column.Builder()
            .setHorizontalAlignment(LayoutElementBuilders.HORIZONTAL_ALIGN_CENTER)
            .addContent(text(Prayer.time12(s.next.at), 26f, 0xFFFFFFFF.toInt(), false))
            .addContent(text(s.next.name, 20f, 0xFFFFFFFF.toInt(), true))
            .addContent(text(Prayer.remainingText(s.next.at - s.now), 12f, 0xFFD6B64A.toInt(), false))
            .build()

        val click = ModifiersBuilders.Clickable.Builder()
            .setId("open")
            .setOnClick(ActionBuilders.LaunchAction.Builder().setAndroidActivity(
                ActionBuilders.AndroidActivity.Builder().setPackageName(packageName).setClassName(MainActivity::class.java.name).build()
            ).build()).build()

        return LayoutElementBuilders.Box.Builder()
            .setWidth(expand()).setHeight(expand())
            .setModifiers(ModifiersBuilders.Modifiers.Builder().setClickable(click).build())
            .addContent(arc(track)).addContent(arc(fill)).addContent(center)
            .build()
    }

    override fun onTileRequest(requestParams: RequestBuilders.TileRequest): ListenableFuture<TileBuilders.Tile> {
        val s = Prayer.compute(this)
        val tile = TileBuilders.Tile.Builder()
            .setResourcesVersion("1")
            .setFreshnessIntervalMillis(60_000)
            .setTileTimeline(TimelineBuilders.Timeline.fromLayoutElement(layout(s)))
            .build()
        return Futures.immediateFuture(tile)
    }

    override fun onTileResourcesRequest(requestParams: RequestBuilders.ResourcesRequest): ListenableFuture<ResourceBuilders.Resources> =
        Futures.immediateFuture(ResourceBuilders.Resources.Builder().setVersion("1").build())
}
