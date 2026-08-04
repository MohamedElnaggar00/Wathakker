package com.example.ui.screens

import com.example.ui.components.WathakkerButton

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.data.Dhikr
import com.example.ui.viewmodel.MainViewModel
import com.example.utils.formatTimeStr12h
import java.util.Calendar
import androidx.compose.foundation.background
import androidx.compose.ui.draw.clip
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.filled.NotificationsOff

data class DhikrInstance(val dhikr: Dhikr, val hour: Int, val minute: Int)

@Composable
fun DashboardScreen(viewModel: MainViewModel) {
    val enabledDhikr by viewModel.enabledDhikr.collectAsStateWithLifecycle()

    val instancesState: Pair<DhikrInstance?, DhikrInstance?> = remember(enabledDhikr) {
        val now = Calendar.getInstance()
        val currentHour = now.get(Calendar.HOUR_OF_DAY)
        val currentMinute = now.get(Calendar.MINUTE)
        var nextDhikrInstance: DhikrInstance? = null
        var currentOrPassedInstance: DhikrInstance? = null

        if (enabledDhikr.isNotEmpty()) {
            val instances = mutableListOf<DhikrInstance>()
            for (dhikr in enabledDhikr) {
                for (timeStr in dhikr.reminderTimes) {
                    val parts = timeStr.split(":")
                    if (parts.size == 2) {
                        val h = parts[0].toIntOrNull() ?: continue
                        val m = parts[1].toIntOrNull() ?: continue
                        instances.add(DhikrInstance(dhikr, h, m))
                    }
                }
            }

            val sorted = instances.sortedWith(compareBy({ it.hour }, { it.minute }))

            for (instance in sorted) {
                if (instance.hour > currentHour || (instance.hour == currentHour && instance.minute > currentMinute)) {
                    nextDhikrInstance = instance
                    break
                }
                currentOrPassedInstance = instance
            }
            if (nextDhikrInstance == null && sorted.isNotEmpty()) nextDhikrInstance = sorted.first()
            if (currentOrPassedInstance == null && sorted.isNotEmpty()) currentOrPassedInstance = sorted.last()

            if (nextDhikrInstance == currentOrPassedInstance) {
                nextDhikrInstance = null
            }
        }
        Pair(currentOrPassedInstance, nextDhikrInstance)
    }

    val currentOrPassedInstance = instancesState.first
    val nextDhikrInstance = instancesState.second

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if (currentOrPassedInstance != null) {
            Text("التذكير الحالي", color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 8.dp))
            DhikrHighlightCard(
                instance = currentOrPassedInstance,
                onMarkAsRead = { viewModel.markAsRead(currentOrPassedInstance.dhikr) }
            )
            Spacer(modifier = Modifier.height(24.dp))
        }

        if (nextDhikrInstance != null) {
            Text("التذكير القادم", color = MaterialTheme.colorScheme.onSurfaceVariant, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 8.dp))
            DhikrHighlightCard(
                instance = nextDhikrInstance,
                onMarkAsRead = { viewModel.markAsRead(nextDhikrInstance.dhikr) }
            )
        }

        if (currentOrPassedInstance == null && nextDhikrInstance == null) {
            Text("لا توجد أذكار مفعلة. يمكنك تفعيلها من قائمة الأذكار.", color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

@Composable
fun DhikrHighlightCard(instance: DhikrInstance, onMarkAsRead: () -> Unit) {
    val dhikr = instance.dhikr
    Box(
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .clip(androidx.compose.foundation.shape.RoundedCornerShape(20.dp))
            .background(androidx.compose.material3.MaterialTheme.colorScheme.surface)
            .padding(16.dp)
    ) {
        Column {
            Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically, horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceBetween, modifier = androidx.compose.ui.Modifier.fillMaxWidth()) {
                Text(dhikr.title, fontSize = 18.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface, modifier = androidx.compose.ui.Modifier.weight(1f))
            }
            
            val timeString = formatTimeStr12h(String.format("%02d:%02d", instance.hour, instance.minute))
            Row(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 12.dp),
                horizontalArrangement = androidx.compose.foundation.layout.Arrangement.Start,
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
            ) {
                androidx.compose.material3.Icon(
                    imageVector = if (dhikr.isEnabled) androidx.compose.material.icons.Icons.Filled.NotificationsActive else androidx.compose.material.icons.Icons.Filled.NotificationsOff,
                    contentDescription = "Alarm Status",
                    tint = if (dhikr.isEnabled) androidx.compose.material3.MaterialTheme.colorScheme.primary else androidx.compose.material3.MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                    modifier = androidx.compose.ui.Modifier.size(18.dp)
                )
                Spacer(modifier = androidx.compose.ui.Modifier.width(4.dp))
                Text(timeString, color = if (dhikr.isEnabled) androidx.compose.material3.MaterialTheme.colorScheme.primary else androidx.compose.material3.MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f), fontWeight = androidx.compose.ui.text.font.FontWeight.Medium, fontSize = 16.sp)
            }
            
            Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
                    .clip(androidx.compose.foundation.shape.RoundedCornerShape(12.dp))
                    .background(androidx.compose.material3.MaterialTheme.colorScheme.surfaceVariant)
                    .padding(12.dp)
            ) {
                Text(
                    text = dhikr.content,
                    color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface,
                    maxLines = 2,
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                )
            }

            Spacer(androidx.compose.ui.Modifier.height(8.dp))
            Row(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                horizontalArrangement = androidx.compose.foundation.layout.Arrangement.End
            ) {
                WathakkerButton(
    isSecondary = true,
    isSmall = true,
                    onClick = onMarkAsRead,
                    text = "تم القراءة ✓"
                )
            }
        }
    }
}
