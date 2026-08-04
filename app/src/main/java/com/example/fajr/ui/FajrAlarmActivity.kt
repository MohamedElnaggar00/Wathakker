package com.example.fajr.ui

import android.app.KeyguardManager
import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.NotificationsOff
import androidx.compose.material.icons.filled.Snooze
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fajr.alarm.FajrAlarmScheduler
import com.example.fajr.data.FajrPreferences
import com.example.fajr.sound.RingtoneHelper
import com.example.ui.theme.MyApplicationTheme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class FajrAlarmActivity : ComponentActivity() {

    private var mediaPlayer: MediaPlayer? = null
    private var vibrator: Vibrator? = null
    private val handler = Handler(Looper.getMainLooper())
    private var autoStopRunnable: Runnable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup lock screen flags
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
            setShowWhenLocked(true)
            setTurnScreenOn(true)
            val keyguardManager = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager
            keyguardManager.requestDismissKeyguard(this, null)
        } else {
            @Suppress("DEPRECATION")
            window.addFlags(
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED or
                WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD or
                WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON or
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
            )
        }

        val prefs = FajrPreferences(this)
        startAlarmEffects(prefs)

        setContent {
            MyApplicationTheme {
                CompositionLocalProvider(androidx.compose.ui.platform.LocalLayoutDirection provides androidx.compose.ui.unit.LayoutDirection.Rtl) {
                    FajrAlarmScreen(
                        onDismiss = { stopAndFinish() },
                        onSnooze = { minutes ->
                            FajrAlarmScheduler(this).scheduleSnooze(minutes)
                            stopAndFinish()
                        }
                    )
                }
            }
        }
    }

    private fun startAlarmEffects(prefs: FajrPreferences) {
        // Play Audio
        try {
            val ringtoneHelper = RingtoneHelper(this)
            val uri = ringtoneHelper.getValidRingtoneUri(prefs)
            val volume = prefs.alarmVolume / 100f

            mediaPlayer = MediaPlayer().apply {
                setAudioAttributes(
                    AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_ALARM)
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .build()
                )
                setDataSource(this@FajrAlarmActivity, uri)
                isLooping = true
                setVolume(volume, volume)
                prepare()
                start()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        // Vibration
        if (prefs.isVibrationEnabled) {
            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    val vibratorManager = getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
                    vibrator = vibratorManager.defaultVibrator
                } else {
                    @Suppress("DEPRECATION")
                    vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                }

                val pattern = longArrayOf(0, 800, 500, 800, 500)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrator?.vibrate(VibrationEffect.createWaveform(pattern, 0))
                } else {
                    @Suppress("DEPRECATION")
                    vibrator?.vibrate(pattern, 0)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        // Max Duration Auto-stop
        val maxDurationMs = prefs.maxDurationMinutes * 60 * 1000L
        autoStopRunnable = Runnable { stopAndFinish() }
        handler.postDelayed(autoStopRunnable!!, maxDurationMs)
    }

    private fun stopAndFinish() {
        autoStopRunnable?.let { handler.removeCallbacks(it) }
        try {
            mediaPlayer?.let {
                if (it.isPlaying) it.stop()
                it.release()
            }
            mediaPlayer = null
        } catch (e: Exception) {
            e.printStackTrace()
        }

        try {
            vibrator?.cancel()
            vibrator = null
        } catch (e: Exception) {
            e.printStackTrace()
        }

        finish()
    }

    override fun onDestroy() {
        stopAndFinish()
        super.onDestroy()
    }
}

@Composable
fun FajrAlarmScreen(
    onDismiss: () -> Unit,
    onSnooze: (Int) -> Unit
) {
    var currentTimeStr by remember { mutableStateOf("") }
    var currentDateStr by remember { mutableStateOf("") }
    var showSnoozeOptions by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        val timeSdf = SimpleDateFormat("hh:mm", Locale("ar"))
        val amPmSdf = SimpleDateFormat("a", Locale("ar"))
        val dateSdf = SimpleDateFormat("EEEE, d MMMM yyyy", Locale("ar"))

        while (true) {
            val now = Date()
            currentTimeStr = "${timeSdf.format(now)} ${amPmSdf.format(now)}"
            currentDateStr = dateSdf.format(now)
            kotlinx.coroutines.delay(1000)
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF0F172A) // Rich One UI 8.5 Dark Canvas
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxHeight()
            ) {
                Spacer(Modifier.height(32.dp))

                // Top Icon & Title
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF3B82F6).copy(alpha = 0.2f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Alarm,
                            contentDescription = "Fajr Alarm",
                            tint = Color(0xFF60A5FA),
                            modifier = Modifier.size(50.dp)
                        )
                    }

                    Spacer(Modifier.height(20.dp))

                    Text(
                        text = "صلاة الفجر",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Spacer(Modifier.height(8.dp))

                    Text(
                        text = "حان الآن موعد صلاة الفجر",
                        fontSize = 18.sp,
                        color = Color(0xFF94A3B8)
                    )
                }

                // Middle Large Time
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = currentTimeStr,
                        fontSize = 48.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = currentDateStr,
                        fontSize = 16.sp,
                        color = Color(0xFFCBD5E1)
                    )
                }

                // Bottom Buttons (Dismiss & Snooze)
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (showSnoozeOptions) {
                        Surface(
                            shape = RoundedCornerShape(24.dp),
                            color = Color(0xFF1E293B),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "اختر مدة الغفوة (Snooze):",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Spacer(Modifier.height(12.dp))
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Button(
                                        onClick = { onSnooze(5) },
                                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF334155))
                                    ) {
                                        Text("5 دقائق", color = Color.White)
                                    }
                                    Button(
                                        onClick = { onSnooze(10) },
                                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF334155))
                                    ) {
                                        Text("10 دقائق", color = Color.White)
                                    }
                                    Button(
                                        onClick = { onSnooze(15) },
                                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF334155))
                                    ) {
                                        Text("15 دقيقة", color = Color.White)
                                    }
                                }
                            }
                        }
                        Spacer(Modifier.height(12.dp))
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        // Snooze Button
                        OutlinedButton(
                            onClick = { showSnoozeOptions = !showSnoozeOptions },
                            shape = RoundedCornerShape(20.dp),
                            modifier = Modifier
                                .weight(1f)
                                .height(56.dp)
                        ) {
                            Icon(Icons.Default.Snooze, contentDescription = null, tint = Color.White)
                            Spacer(Modifier.width(8.dp))
                            Text("غفوة", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }

                        // Dismiss Button
                        Button(
                            onClick = onDismiss,
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444)),
                            modifier = Modifier
                                .weight(1f)
                                .height(56.dp)
                        ) {
                            Icon(Icons.Default.NotificationsOff, contentDescription = null, tint = Color.White)
                            Spacer(Modifier.width(8.dp))
                            Text("إيقاف المنبه", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }

                    Spacer(Modifier.height(24.dp))
                }
            }
        }
    }
}
