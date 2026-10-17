package com.example.prayer

import android.content.Context
import android.hardware.GeomagneticField
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fajr.data.FajrPreferences
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S
import com.example.ui.oneui.OneUIScreen
import kotlin.math.abs
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.math.tan

/** Qibla compass (gap item 1): Samsung-style dark dial, blue qibla arc, tick ring,
 *  big degree readout, rotation-vector sensor with accel+mag fallback, calibration
 *  prompt on low accuracy, location fallback prompt. Kaaba: 21.422487 N, 39.826206 E. */
private const val KAABA_LAT = 21.422487
private const val KAABA_LON = 39.826206

private fun qiblaBearing(lat: Double, lon: Double): Double {
    val phi1 = Math.toRadians(lat)
    val phi2 = Math.toRadians(KAABA_LAT)
    val dLambda = Math.toRadians(KAABA_LON - lon)
    val y = sin(dLambda)
    val x = cos(phi1) * tan(phi2) - sin(phi1) * cos(dLambda)
    return (Math.toDegrees(atan2(y, x)) + 360.0) % 360.0
}

private fun cardinal(deg: Float): String {
    val names = arrayOf("N", "NE", "E", "SE", "S", "SW", "W", "NW")
    return names[(((deg + 22.5f) / 45f).toInt()) % 8]
}

@Composable
fun QiblaScreen(onBack: (() -> Unit)? = null) {
    val context = LocalContext.current
    val cs = MaterialTheme.colorScheme
    val prefs = remember { FajrPreferences(context) }
    val hasLocation = prefs.latitude != 0.0 || prefs.longitude != 0.0
    val qibla = remember { qiblaBearing(prefs.latitude, prefs.longitude).toFloat() }

    var azimuth by remember { mutableFloatStateOf(0f) } // degrees from true north
    var accuracy by remember { mutableIntStateOf(-1) }
    var hasSensor by remember { mutableStateOf(true) }
    var buzzed by remember { mutableStateOf(false) }

    DisposableEffect(Unit) {
        val sm = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val rv = sm.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)
        val accel = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        val mag = sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD)
        val rotMatrix = FloatArray(9)
        val orient = FloatArray(3)
        var grav: FloatArray? = null
        var geom: FloatArray? = null
        val listener = object : SensorEventListener {
            override fun onSensorChanged(e: SensorEvent) {
                var have = false
                if (e.sensor.type == Sensor.TYPE_ROTATION_VECTOR) {
                    SensorManager.getRotationMatrixFromVector(rotMatrix, e.values)
                    have = true
                } else if (e.sensor.type == Sensor.TYPE_ACCELEROMETER) {
                    grav = e.values.clone()
                } else if (e.sensor.type == Sensor.TYPE_MAGNETIC_FIELD) {
                    geom = e.values.clone()
                }
                val g = grav
                val m = geom
                if (!have && g != null && m != null) {
                    have = SensorManager.getRotationMatrix(rotMatrix, null, g, m)
                }
                if (!have) return
                SensorManager.getOrientation(rotMatrix, orient)
                var deg = Math.toDegrees(orient[0].toDouble()).toFloat()
                val gf = GeomagneticField(
                    prefs.latitude.toFloat(), prefs.longitude.toFloat(), 0f,
                    System.currentTimeMillis()
                )
                deg = (deg + gf.declination + 360f) % 360f
                // exponential smoothing with angle wrap
                val delta = ((deg - azimuth + 540f) % 360f) - 180f
                azimuth = (azimuth + 0.18f * delta + 360f) % 360f
            }

            override fun onAccuracyChanged(sensor: Sensor, acc: Int) {
                accuracy = acc
            }
        }
        var registered = false
        if (rv != null) {
            registered = sm.registerListener(listener, rv, SensorManager.SENSOR_DELAY_UI)
        }
        if (!registered && accel != null && mag != null) {
            val a = sm.registerListener(listener, accel, SensorManager.SENSOR_DELAY_UI)
            val b = sm.registerListener(listener, mag, SensorManager.SENSOR_DELAY_UI)
            registered = a && b
        }
        if (!registered) hasSensor = false
        onDispose { sm.unregisterListener(listener) }
    }

    val diff = ((qibla - azimuth + 540f) % 360f) - 180f // signed: + = qibla to the right
    val aligned = abs(diff) < 3f && accuracy > 1
    LaunchedEffect(aligned) {
        if (aligned && !buzzed) {
            try {
                val v = context.getSystemService(Vibrator::class.java)
                v?.vibrate(VibrationEffect.createOneShot(60, VibrationEffect.DEFAULT_AMPLITUDE))
            } catch (_: Throwable) {}
            buzzed = true
        } else if (!aligned) {
            buzzed = false
        }
    }

    OneUIScreen(title = L10n.t(S.QiblaTitle), onBack = onBack) {
        item(key = "readout") {
            Column(
                modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    azimuth.roundToInt().toString() + "° " + cardinal(azimuth),
                    color = cs.onSurface, fontSize = 52.sp, fontWeight = FontWeight.Bold
                )
                Text(
                    L10n.t(S.QiblaNorthFmt).format(qibla.roundToInt()),
                    color = cs.onSurfaceVariant, fontSize = 14.sp
                )
            }
        }
        item(key = "dial") {
            Box(
                modifier = Modifier.fillMaxWidth().aspectRatio(1f).padding(20.dp),
                contentAlignment = Alignment.Center
            ) {
                val blue = Color(0xFF3B82F6)
                val green = Color(0xFF22C55E)
                val ring = if (aligned) green else blue
                Canvas(Modifier.fillMaxSize()) {
                    val r = size.minDimension / 2f
                    val c = center
                    drawCircle(Color(0xFF0D1117), r, c)
                    drawCircle(Color(0xFF232B36), r, c, style = Stroke(2.dp.toPx()))
                    // tick ring rotating against heading
                    var deg = 0
                    while (deg < 360) {
                        val a = Math.toRadians((deg - azimuth - 90f).toDouble())
                        val major = deg % 30 == 0
                        val inner = if (major) r * 0.86f else r * 0.93f
                        val p1 = Offset(
                            c.x + (inner * cos(a)).toFloat(),
                            c.y + (inner * sin(a)).toFloat()
                        )
                        val p2 = Offset(
                            c.x + (r * 0.97f * cos(a)).toFloat(),
                            c.y + (r * 0.97f * sin(a)).toFloat()
                        )
                        drawLine(
                            if (major) Color(0xFF9AA4B2) else Color(0xFF4B5563),
                            p1, p2, strokeWidth = if (major) 3.dp.toPx() else 1.5.dp.toPx()
                        )
                        deg += if (major) 30 else 10
                    }
                    // cardinal letters
                    val paint = android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
                        color = 0xFFE5E7EB.toInt()
                        textSize = 20.dp.toPx()
                        textAlign = android.graphics.Paint.Align.CENTER
                        typeface = android.graphics.Typeface.DEFAULT_BOLD
                    }
                    val labels = arrayOf("N", "E", "S", "W")
                    for (i in 0..3) {
                        val a = Math.toRadians((i * 90 - azimuth - 90f).toDouble())
                        val x = c.x + (r * 0.72f * cos(a)).toFloat()
                        val y = c.y + (r * 0.72f * sin(a)).toFloat() + paint.textSize / 3f
                        drawContext.canvas.nativeCanvas.drawText(labels[i], x, y, paint)
                    }
                    // qibla arc + marker at (qibla - azimuth)
                    val qa = Math.toRadians((qibla - azimuth - 90f).toDouble())
                    drawArc(
                        color = ring,
                        startAngle = qibla - azimuth - 90f - 8f,
                        sweepAngle = 16f,
                        useCenter = false,
                        topLeft = Offset(c.x - r * 0.99f, c.y - r * 0.99f),
                        size = androidx.compose.ui.geometry.Size(r * 1.98f, r * 1.98f),
                        style = Stroke(width = 6.dp.toPx())
                    )
                    drawCircle(
                        ring, 9.dp.toPx(),
                        Offset(
                            c.x + (r * 0.80f * cos(qa)).toFloat(),
                            c.y + (r * 0.80f * sin(qa)).toFloat()
                        )
                    )
                    // fixed top pointer
                    drawLine(
                        Color.White,
                        Offset(c.x, c.y - r * 0.98f),
                        Offset(c.x, c.y - r * 0.90f),
                        strokeWidth = 4.dp.toPx()
                    )
                    // center needle to qibla
                    drawLine(
                        ring,
                        c,
                        Offset(
                            c.x + (r * 0.62f * cos(qa)).toFloat(),
                            c.y + (r * 0.62f * sin(qa)).toFloat()
                        ),
                        strokeWidth = 5.dp.toPx()
                    )
                    drawCircle(Color(0xFF1F2937), 10.dp.toPx(), c)
                }
            }
        }
        item(key = "status") {
            Column(
                modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                when {
                    !hasLocation -> Text(
                        L10n.t(S.QiblaSetLocation), color = Color(0xFFF59E0B),
                        fontSize = 15.sp, fontWeight = FontWeight.Medium
                    )
                    !hasSensor -> Text(
                        L10n.t(S.QiblaNoSensor), color = Color(0xFFF59E0B),
                        fontSize = 15.sp, fontWeight = FontWeight.Medium
                    )
                    accuracy in 0..1 -> Text(
                        L10n.t(S.QiblaCalibrate), color = Color(0xFFF59E0B),
                        fontSize = 15.sp, fontWeight = FontWeight.Medium
                    )
                    aligned -> Text(
                        L10n.t(S.QiblaAligned), color = Color(0xFF22C55E),
                        fontSize = 17.sp, fontWeight = FontWeight.Bold
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    L10n.t(S.QiblaCityFmt).format(prefs.cityName),
                    color = cs.onSurfaceVariant, fontSize = 12.sp
                )
            }
        }
    }
}
