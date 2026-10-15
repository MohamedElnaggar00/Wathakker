package com.example.fajr.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material.icons.outlined.NotificationsOff
import androidx.compose.material.icons.outlined.Snooze
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun FajrAlarmScreen(onDismiss: () -> Unit, onSnooze: (Int) -> Unit) {
    var currentTimeStr by remember { mutableStateOf("") }
    var currentDateStr by remember { mutableStateOf("") }
    var showSnoozeOptions by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        val timeSdf = SimpleDateFormat("hh:mm", Locale("ar"))
        val amPmSdf = SimpleDateFormat("a", Locale("ar"))
        val dateSdf = SimpleDateFormat("EEEE, d MMMM yyyy", Locale("ar"))
        while (true) {
            val now = Date()
            currentTimeStr = timeSdf.format(now) + " " + amPmSdf.format(now)
            currentDateStr = dateSdf.format(now)
            delay(1000L)
        }
    }

    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF0F172A)) {
        Box(modifier = Modifier.fillMaxSize().padding(24.dp)) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Spacer(modifier = Modifier.height(32.dp))
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF3B82F6).copy(alpha = 0.2f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Alarm,
                            contentDescription = "Fajr Alarm",
                            modifier = Modifier.size(50.dp),
                            tint = Color(0xFF60A5FA)
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Text("صلاة الفجر", color = Color.White, fontSize = 32.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("حان الآن موعد صلاة الفجر", color = Color(0xFF94A3B8), fontSize = 18.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(currentTimeStr, color = Color.White, fontSize = 48.sp, fontWeight = FontWeight.ExtraBold)
                    Text(currentDateStr, color = Color(0xFFCBD5E1), fontSize = 16.sp)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    if (!showSnoozeOptions) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            OutlinedButton(
                                onClick = { showSnoozeOptions = !showSnoozeOptions },
                                modifier = Modifier.weight(1f).height(56.dp),
                                shape = RoundedCornerShape(20.dp)
                            ) {
                                Icon(Icons.Outlined.Snooze, contentDescription = null, tint = Color.White)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("غفوة", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            }
                            Button(
                                onClick = onDismiss,
                                modifier = Modifier.weight(1f).height(56.dp),
                                shape = RoundedCornerShape(20.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444))
                            ) {
                                Icon(Icons.Outlined.NotificationsOff, contentDescription = null, tint = Color.White)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("إيقاف المنبه", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    } else {
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(24.dp),
                            color = Color(0xFF1E293B)
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text("اختر مدة الغفوة (Snooze):", color = Color.White, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(12.dp))
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    listOf(5 to "5 دقائق", 10 to "10 دقائق", 15 to "15 دقيقة").forEach { (minutes, label) ->
                                        Button(
                                            onClick = { onSnooze(minutes) },
                                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF334155))
                                        ) {
                                            Text(label, color = Color.White)
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }
}
