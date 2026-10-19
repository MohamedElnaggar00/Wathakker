package com.wathakker.wear

import android.content.Context
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate as rotateScope
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.wear.remote.interactions.RemoteActivityHelper
import kotlinx.coroutines.delay
import java.util.concurrent.Executors
import kotlin.math.cos
import kotlin.math.hypot
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sin

val Gold = Color(0xFFD6B64A)
val Ink = Color(0xFF0B0B0C)
val Pill = Color(0xFF1B1B1D)
val SoftGrey = Color(0xFF9D9DA2)
val WFont = FontFamily(
    Font(R.font.expoarabic_medium, FontWeight.Normal),
    Font(R.font.expoarabic_semibold, FontWeight.Bold)
)

fun tx(size: Float, color: Color = Color.White, bold: Boolean = false, align: TextAlign = TextAlign.Center) =
    TextStyle(fontFamily = WFont, fontSize = size.sp, color = color, fontWeight = if (bold) FontWeight.Bold else FontWeight.Normal, textAlign = align)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val page = intent.getIntExtra("page", if (intent.getBooleanExtra("circles", false)) 3 else 0)
        setContent { WearApp(page) }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        recreate()
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WearApp(startPage: Int) {
    val ctx = LocalContext.current
    var now by remember { mutableLongStateOf(System.currentTimeMillis()) }
    LaunchedEffect(Unit) { while (true) { now = System.currentTimeMillis(); delay(1000) } }
    val state = remember(now / 20000) { Prayer.compute(ctx, now) }
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        BoxWithConstraints(Modifier.fillMaxSize().background(Color.Black)) {
            val w = maxWidth.value
            val pager = rememberPagerState(initialPage = startPage) { 5 }
            HorizontalPager(pager, Modifier.fillMaxSize()) { page ->
                when (page) {
                    0 -> MainPage(state, now, w)
                    1 -> ListPage(state, w)
                    2 -> QiblaPage(w)
                    3 -> CirclesPage(state, now, w, pager.currentPage == 3)
                    else -> PhonePage(w)
                }
            }
            Row(
                Modifier.align(Alignment.BottomCenter).padding(bottom = (w * 0.045f).dp),
                horizontalArrangement = Arrangement.spacedBy((w * 0.018f).dp)
            ) {
                for (i in 0 until 5) {
                    val on = i == pager.currentPage
                    Box(
                        Modifier.width(((if (on) 0.07f else 0.022f) * w).dp).height((w * 0.022f).dp)
                            .clip(CircleShape).background(if (on) Color.White else Color(0xFF5A5A5E))
                    )
                }
            }
        }
    }
}

private fun starPath(cx: Float, cy: Float, r: Float): Path {
    val p = Path(); val inner = r * 0.45f
    for (i in 0 until 10) {
        val a = -Math.PI / 2 + i * Math.PI / 5
        val rr = if (i % 2 == 0) r else inner
        val x = cx + cos(a).toFloat() * rr; val y = cy + sin(a).toFloat() * rr
        if (i == 0) p.moveTo(x, y) else p.lineTo(x, y)
    }
    p.close(); return p
}

/** Star pattern that emerges from the bottom-left corner and fades out, as on the phone widget. */
@Composable
fun StarField(modifier: Modifier) {
    Canvas(modifier) {
        val r = size.minDimension * 0.075f
        val step = r * 1.7f
        val maxD = hypot(size.width, size.height) * 0.9f
        var row = 0
        var cy = size.height + r * 0.2f
        while (cy > -r) {
            var cx = if (row % 2 == 0) 0f else step / 2
            while (cx < size.width + r) {
                val d = hypot(cx, size.height - cy)
                val a = (1f - d / maxD).coerceIn(0f, 1f)
                if (a > 0.03f) drawPath(starPath(cx, cy, r), Color.White.copy(alpha = 0.30f * a.pow(1.4f)), style = Stroke(width = size.minDimension * 0.003f))
                cx += step
            }
            cy -= step * 0.78f; row++
        }
    }
}

@Composable
fun MainPage(s: PrayerState, now: Long, w: Float) {
    Box(Modifier.fillMaxSize().background(Color.Black)) {
        StarField(Modifier.fillMaxSize())
        Text1(Prayer.weekday(now), tx(w * 0.062f, SoftGrey), Modifier.align(Alignment.TopStart).padding(start = (w * 0.24f).dp, top = (w * 0.12f).dp))
        Text1(Prayer.gregDate(now), tx(w * 0.062f, SoftGrey), Modifier.align(Alignment.TopEnd).padding(end = (w * 0.24f).dp, top = (w * 0.12f).dp))
        Column(Modifier.align(Alignment.Center).padding(top = (w * 0.07f).dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text1(s.next.name, tx(w * 0.15f, Color.White, true))
            Text1(Prayer.time12(s.next.at), tx(w * 0.095f, Color.White))
            Spacer(Modifier.height((w * 0.035f).dp))
            Text1("متبقي " + Prayer.remainingText(s.next.at - now), tx(w * 0.062f, Gold))
            Spacer(Modifier.height((w * 0.02f).dp))
            Text1(Prayer.hijri(now), tx(w * 0.055f, SoftGrey))
        }
    }
}

@Composable
fun Text1(t: String, style: TextStyle, modifier: Modifier = Modifier) {
    androidx.compose.foundation.text.BasicText(t, modifier, style = style, maxLines = 1)
}

@Composable
fun ListPage(s: PrayerState, w: Float) {
    val scroll = rememberScrollState()
    val pitch = w * 0.215f
    val nextIdx = s.today.indexOfFirst { it.at == s.next.at }.let { if (it < 0) 0 else it }
    val pitchPx = with(androidx.compose.ui.platform.LocalDensity.current) { pitch.dp.toPx() }
    LaunchedEffect(nextIdx) { scroll.scrollTo((((nextIdx - 2).coerceIn(0, 1)) * pitchPx).roundToInt()) }
    Box(Modifier.fillMaxSize().background(Color.Black)) {
        Column(Modifier.fillMaxSize().verticalScroll(scroll).padding(horizontal = (w * 0.115f).dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(Modifier.height((w * 0.12f).dp))
            Text1("مواقيت الصلاة", tx(w * 0.07f, Color(0xFFB9B9BE)))
            Spacer(Modifier.height((w * 0.025f).dp))
            for (slot in s.today) {
                val isNext = slot.at == s.next.at
                val past = slot.at <= s.now
                Row(
                    Modifier.fillMaxWidth().height((w * 0.19f).dp).clip(RoundedCornerShape(50)).background(if (isNext) Gold else Pill)
                        .padding(horizontal = (w * 0.075f).dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val c = if (isNext) Ink else if (past) SoftGrey else Color.White
                    Text1(slot.name, tx(w * 0.075f, c, isNext))
                    Spacer(Modifier.weight(1f))
                    Text1(Prayer.time12(slot.at), tx(w * 0.07f, c, isNext))
                }
                Spacer(Modifier.height((w * 0.025f).dp))
            }
            Spacer(Modifier.height((w * 0.2f).dp))
        }
    }
}

@Composable
fun QiblaPage(w: Float) {
    val ctx = LocalContext.current
    var heading by remember { mutableFloatStateOf(0f) }
    val bearing = remember { Prayer.qiblaBearing(ctx) }
    DisposableEffect(Unit) {
        val sm = ctx.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val sensor = sm.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)
        val l = object : SensorEventListener {
            override fun onSensorChanged(e: SensorEvent) {
                val r = FloatArray(9); SensorManager.getRotationMatrixFromVector(r, e.values)
                val o = FloatArray(3); SensorManager.getOrientation(r, o)
                heading = ((Math.toDegrees(o[0].toDouble()) + 360.0) % 360.0).toFloat()
            }
            override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
        }
        if (sensor != null) sm.registerListener(l, sensor, SensorManager.SENSOR_DELAY_UI)
        onDispose { sm.unregisterListener(l) }
    }
    val needle = bearing - heading
    Box(Modifier.fillMaxSize().background(Color.Black)) {
        Text1("القبلة", tx(w * 0.065f, Color(0xFFB9B9BE)), Modifier.align(Alignment.TopCenter).padding(top = (w * 0.085f).dp))
        Box(Modifier.align(Alignment.Center).padding(bottom = (w * 0.03f).dp).size((w * 0.56f).dp)) {
            Canvas(Modifier.fillMaxSize()) {
                val c = center
                drawCircle(Color(0xFF2B2B2E), radius = size.minDimension / 2 - 2f, style = Stroke(width = size.minDimension * 0.008f))
                rotateScope(needle, c) {
                    val len = size.minDimension * 0.46f; val half = size.minDimension * 0.055f
                    val tip = Path().apply { moveTo(c.x, c.y - len); lineTo(c.x + half, c.y); lineTo(c.x - half, c.y); close() }
                    drawPath(tip, Gold)
                    val tail = Path().apply { moveTo(c.x, c.y + len * 0.62f); lineTo(c.x + half, c.y); lineTo(c.x - half, c.y); close() }
                    drawPath(tail, Color(0xFF3C3C40))
                }
                drawCircle(Color.Black, radius = size.minDimension * 0.045f)
                drawCircle(Gold, radius = size.minDimension * 0.045f, style = Stroke(width = size.minDimension * 0.016f))
            }
            val ls = tx(w * 0.06f, SoftGrey)
            Box(Modifier.fillMaxSize().rotate(-heading)) {
                Text1("ش", tx(w * 0.065f, Gold), Modifier.align(Alignment.TopCenter).padding(top = (w * 0.012f).dp).rotate(heading))
                Text1("شر", ls, Modifier.align(Alignment.CenterEnd).padding(end = (w * 0.012f).dp).rotate(heading))
                Text1("غ", ls, Modifier.align(Alignment.CenterStart).padding(start = (w * 0.012f).dp).rotate(heading))
                Text1("ج", ls, Modifier.align(Alignment.BottomCenter).padding(bottom = (w * 0.012f).dp).rotate(heading))
            }
        }
        Row(Modifier.align(Alignment.BottomCenter).padding(bottom = (w * 0.115f).dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy((w * 0.03f).dp)) {
            Text1("${bearing.roundToInt()}°", tx(w * 0.10f, Color.White))
            Text1(Prayer.directionName(bearing), tx(w * 0.058f, SoftGrey))
        }
    }
}

@Composable
fun CirclesPage(s: PrayerState, now: Long, w: Float, visible: Boolean) {
    val anim = remember { Animatable(0f) }
    LaunchedEffect(visible) {
        if (visible) {
            anim.snapTo(0f)
            anim.animateTo(1f, spring(dampingRatio = 0.62f, stiffness = Spring.StiffnessMediumLow))
        } else anim.snapTo(0f)
    }
    val ids = listOf(0, 2, 3, 4, 5)  // clockwise from the top: Fajr, Dhuhr, Asr, Maghrib, Isha
    val slots = ids.map { id -> if (id == 0 && s.next.id == 0) s.nextFajrTomorrow else s.today[id] }
    val d = w * 0.295f
    val rad = w * 0.285f
    Box(Modifier.fillMaxSize().background(Color.Black)) {
        slots.forEachIndexed { i, slot ->
            val ang = Math.toRadians(-90.0 + i * 72.0)
            val tx0 = (cos(ang) * rad).toFloat(); val ty0 = (sin(ang) * rad - w * 0.012f).toFloat()
            val isNext = slot.at == s.next.at
            val past = slot.at <= now && !isNext
            Box(
                Modifier.align(Alignment.Center)
                    .offset { IntOffset((tx0 * anim.value * density).roundToInt(), (ty0 * anim.value * density).roundToInt()) }
                    .size(d.dp)
                    .graphicsLayer { scaleX = anim.value.coerceAtLeast(0.001f); scaleY = anim.value.coerceAtLeast(0.001f); alpha = anim.value.coerceIn(0f, 1f) },
                contentAlignment = Alignment.Center
            ) {
                Canvas(Modifier.fillMaxSize()) {
                    val sw = size.minDimension * 0.045f
                    if (isNext) {
                        drawCircle(Gold)
                        drawArc(Ink, -90f, 360f * s.progress, false, Offset(sw / 2, sw / 2), Size(size.width - sw, size.height - sw), style = Stroke(width = sw * 0.6f, cap = StrokeCap.Round))
                    } else if (past) {
                        drawCircle(Color(0xFF1D1D1F))
                        drawCircle(Gold.copy(alpha = 0.35f), radius = size.minDimension / 2 - sw / 2, style = Stroke(width = sw))
                    } else {
                        drawCircle(Color(0xFF2A2A2D))
                    }
                }
                val c = if (isNext) Ink else if (past) Color(0xFFC9C9CE) else Color.White
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text1(slot.name, tx(w * 0.05f, c, true))
                    Text1(if (past) Prayer.time24(slot.at) else Prayer.hhmm(slot.at - now), tx(w * 0.078f, c))
                    Text1(if (past) "مضت" else "متبقية", tx(w * 0.042f, if (isNext) Ink else SoftGrey))
                }
            }
        }
    }
}

private val density: Float get() = android.content.res.Resources.getSystem().displayMetrics.density

@Composable
fun PhonePage(w: Float) {
    val ctx = LocalContext.current
    var status by remember { mutableStateOf("") }
    Box(Modifier.fillMaxSize().background(Color.Black).clickable { openOnPhone(ctx) { status = it } }, contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(Modifier.size((w * 0.56f).dp).clip(CircleShape).background(Color(0xFFBFA03A)), contentAlignment = Alignment.Center) {
                Canvas(Modifier.fillMaxSize()) {
                    val m = size.minDimension; val sw = m * 0.065f; val dark = Color(0xFF333333)
                    val cx = m / 2
                    // bracket on the right and an arrow going in
                    val br = Path().apply { moveTo(cx + m * 0.02f, m * 0.30f); lineTo(cx + m * 0.20f, m * 0.30f); lineTo(cx + m * 0.20f, m * 0.70f); lineTo(cx + m * 0.02f, m * 0.70f) }
                    drawPath(br, dark, style = Stroke(width = sw, cap = StrokeCap.Round))
                    drawLine(dark, Offset(m * 0.18f, m * 0.5f), Offset(cx + m * 0.12f, m * 0.5f), strokeWidth = sw, cap = StrokeCap.Round)
                    val ah = Path().apply { moveTo(cx + m * 0.02f, m * 0.40f); lineTo(cx + m * 0.12f, m * 0.5f); lineTo(cx + m * 0.02f, m * 0.60f) }
                    drawPath(ah, dark, style = Stroke(width = sw, cap = StrokeCap.Round))
                }
            }
            Spacer(Modifier.height((w * 0.045f).dp))
            Text1("فتح في الجهاز", tx(w * 0.075f, Color.White))
            if (status.isNotEmpty()) Text1(status, tx(w * 0.05f, SoftGrey))
        }
    }
}

fun openOnPhone(ctx: Context, report: (String) -> Unit) {
    try {
        val helper = RemoteActivityHelper(ctx, Executors.newSingleThreadExecutor())
        val i = Intent(Intent.ACTION_VIEW).addCategory(Intent.CATEGORY_BROWSABLE).setData(Uri.parse("wathakker://open"))
        val f = helper.startRemoteActivity(i)
        f.addListener({
            try { f.get(); report("تم الفتح على الهاتف") } catch (e: Exception) { report("الهاتف غير متصل") }
        }, ContextCompat.getMainExecutor(ctx))
    } catch (e: Exception) {
        report("الهاتف غير متصل")
    }
}
