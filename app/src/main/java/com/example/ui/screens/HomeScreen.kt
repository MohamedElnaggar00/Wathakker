package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.filled.NotificationsOff
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.material3.*
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.data.Dhikr
import com.example.ui.viewmodel.MainViewModel

fun formatTimeStr12h(timeStr: String): String {
    val parts = timeStr.split(":")
    if (parts.size != 2) return timeStr
    val hour = parts[0].toIntOrNull() ?: return timeStr
    val minute = parts[1].toIntOrNull() ?: return timeStr
    val isAm = hour < 12
    val displayHour = if (hour % 12 == 0) 12 else hour % 12
    val amPm = if (isAm) "ص" else "م"
    return String.format("%02d:%02d %s", displayHour, minute, amPm)
}

@Composable
fun DashedDivider(modifier: Modifier = Modifier, color: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f)) {
    androidx.compose.foundation.Canvas(
        modifier = modifier.fillMaxWidth().height(1.dp).padding(horizontal = 16.dp)
    ) {
        drawLine(
            color = color,
            start = androidx.compose.ui.geometry.Offset(0f, 0f),
            end = androidx.compose.ui.geometry.Offset(size.width, 0f),
            pathEffect = androidx.compose.ui.graphics.PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
        )
    }
}

@Composable
fun HomeScreen(viewModel: MainViewModel, searchQuery: String = "") {
    val allDhikr by viewModel.allDhikr.collectAsStateWithLifecycle()

    var showTimesDialog by remember { mutableStateOf<Dhikr?>(null) }
    var showEditDialog by remember { mutableStateOf<Dhikr?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        val filteredDhikr = if (searchQuery.isBlank()) {
            allDhikr
        } else {
            allDhikr.filter { it.title.contains(searchQuery, ignoreCase = true) || it.content.contains(searchQuery, ignoreCase = true) }
        }
        
        if (filteredDhikr.isEmpty()) {
            Text(
                text = "لا توجد نتائج",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(top = 16.dp)
            )
        }

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 24.dp, top = 8.dp),
            modifier = Modifier.weight(1f)
        ) {
            items(filteredDhikr) { dhikr ->
                DhikrItemCard(
                    dhikr = dhikr,
                    onToggleEnabled = { viewModel.toggleEnabled(dhikr) },
                    onToggleFavorite = { viewModel.toggleFavorite(dhikr) },
                    onClickTimes = { showTimesDialog = dhikr },
                    onEditClick = { showEditDialog = dhikr },
                    onDeleteClick = { viewModel.deleteDhikr(dhikr) }
                )
            }
        }
    }

    showTimesDialog?.let { dhikr ->
        DhikrMultipleTimesDialog(
            dhikr = dhikr,
            onDismiss = { showTimesDialog = null },
            onConfirm = { newTimes ->
                viewModel.updateTimes(dhikr, newTimes)
                showTimesDialog = null
            }
        )
    }

    showEditDialog?.let { dhikr ->
        DhikrEditDialog(
            dhikr = dhikr,
            onDismiss = { showEditDialog = null },
            onConfirm = { newTitle, newContent ->
                viewModel.updateDhikrText(dhikr, newTitle, newContent)
                showEditDialog = null
            }
        )
    }
}

@Composable
fun DhikrItemCard(
    dhikr: Dhikr,
    onToggleEnabled: () -> Unit,
    onToggleFavorite: () -> Unit,
    onClickTimes: () -> Unit,
    onEditClick: () -> Unit,
    onDeleteClick: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(MaterialTheme.colorScheme.surface)
            .padding(16.dp)
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = dhikr.title, 
                    fontSize = 18.sp, 
                    fontWeight = FontWeight.Bold, 
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.weight(1f)
                )
                
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    Switch(
                        checked = dhikr.isEnabled,
                        onCheckedChange = { onToggleEnabled() },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = MaterialTheme.colorScheme.primary,
                            uncheckedThumbColor = Color.White,
                            uncheckedTrackColor = MaterialTheme.colorScheme.surfaceVariant,
                            uncheckedBorderColor = Color.Transparent,
                        ),
                        modifier = Modifier.padding(end = 8.dp)
                    )
                    IconButton(onClick = onToggleFavorite) {
                        Icon(
                            imageVector = if (dhikr.isFavorite) Icons.Filled.Star else Icons.Outlined.StarBorder,
                            contentDescription = "Favorite",
                            tint = if (dhikr.isFavorite) Color(0xFFFFC107) else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    Box {
                        IconButton(onClick = { expanded = true }) {
                            Icon(Icons.Default.MoreVert, contentDescription = "Options", tint = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                        
                        DropdownMenu(
                            expanded = expanded,
                            onDismissRequest = { expanded = false },
                            shape = RoundedCornerShape(16.dp),
                            containerColor = MaterialTheme.colorScheme.surface,
                            modifier = Modifier.width(220.dp)
                        ) {
                            DropdownMenuItem(
                                text = { Text("تعديل نص الدعاء", fontSize = 16.sp, color = MaterialTheme.colorScheme.onSurface, modifier = Modifier.padding(horizontal = 12.dp)) },
                                onClick = { 
                                    expanded = false
                                    onEditClick() 
                                }
                            )
                            DashedDivider()
                            DropdownMenuItem(
                                text = { Text("تكرار التنبيه مخصص", fontSize = 16.sp, color = MaterialTheme.colorScheme.onSurface, modifier = Modifier.padding(horizontal = 12.dp)) },
                                onClick = { 
                                    expanded = false
                                    onClickTimes() 
                                }
                            )
                            DashedDivider()
                            DropdownMenuItem(
                                text = { Text("حذف", fontSize = 16.sp, color = MaterialTheme.colorScheme.error, modifier = Modifier.padding(horizontal = 12.dp)) },
                                onClick = { 
                                    expanded = false
                                    onDeleteClick() 
                                }
                            )
                        }
                    }
                }
            }
            
            val timesString = dhikr.reminderTimes.joinToString("، ") { formatTimeStr12h(it) }
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 12.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = if (dhikr.isEnabled) Icons.Filled.NotificationsActive else Icons.Filled.NotificationsOff,
                    contentDescription = "Alarm Status",
                    tint = if (dhikr.isEnabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(timesString, color = if (dhikr.isEnabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f), fontWeight = FontWeight.Medium, fontSize = 15.sp)
            }
            
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(12.dp)
            ) {
                Text(
                    text = dhikr.content,
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 16.sp,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

