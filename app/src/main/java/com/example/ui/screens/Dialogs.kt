package com.example.ui.screens

import com.example.ui.components.WathakkerTextField

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.Dhikr
import com.example.data.Tag
import com.example.utils.formatTimeStr12h
import com.example.ui.components.WathakkerChip
import com.example.ui.components.WathakkerButton




@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DhikrAddDialog(
    allTags: List<Tag> = emptyList(),
    onDismiss: () -> Unit,
    onConfirm: (title: String, content: String, times: List<String>, tagIds: List<Long>) -> Unit,
    onCreateTag: ((String) -> Unit)? = null
) {
    var title by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }
    var times by remember { mutableStateOf(listOf("09:00")) }
    var selectedTagIds by remember { mutableStateOf(emptySet<Long>()) }
    var showNewTagInput by remember { mutableStateOf(false) }
    var newTagName by remember { mutableStateOf("") }

    androidx.compose.ui.window.Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(28.dp),
            color = MaterialTheme.colorScheme.surfaceVariant,
            tonalElevation = 0.dp,
            modifier = Modifier.fillMaxWidth().wrapContentHeight()
        ) {
            Column(modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 24.dp, start = 8.dp, end = 8.dp)) {
                WathakkerTextField(
                    value = title,
                    onValueChange = { title = it },
                    placeholder = { Text("العنوان", color = MaterialTheme.colorScheme.onSurfaceVariant) },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))

                WathakkerTextField(
                    value = content,
                    onValueChange = { content = it },
                    placeholder = { Text("الدعاء", color = MaterialTheme.colorScheme.onSurfaceVariant) },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier.fillMaxWidth().heightIn(min = 100.dp),
                    maxLines = 5
                )
                HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))

                // Tag Selection Section
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "التصنيفات (Tags):",
                            fontSize = 13.sp,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        WathakkerButton(
    isSecondary = true,
    isSmall = true,onClick = { showNewTagInput = !showNewTagInput }, text = "+ تصنيف جديد")
                    }

                    if (showNewTagInput) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                        ) {
                            WathakkerTextField(
                                value = newTagName,
                                onValueChange = { newTagName = it },
                                placeholder = { Text("اسم التصنيف الجديد", fontSize = 13.sp) },
                                singleLine = true,
                                modifier = Modifier.weight(1f).height(50.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            WathakkerButton(
    isSmall = true,
                                onClick = {
                                    if (newTagName.isNotBlank()) {
                                        onCreateTag?.invoke(newTagName.trim())
                                        newTagName = ""
                                        showNewTagInput = false
                                    }
                                },
                                text = "إضافة"
                            )
                        }
                    }

                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        allTags.forEach { tag ->
                            val isSelected = selectedTagIds.contains(tag.tagId)
                            WathakkerChip(
                                text = tag.name,
                                selected = isSelected,
                                onClick = {
                                    val newSet = selectedTagIds.toMutableSet()
                                    if (isSelected) newSet.remove(tag.tagId) else newSet.add(tag.tagId)
                                    selectedTagIds = newSet
                                },
                                color = androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
                            )
                        }
                    }
                }

                Spacer(Modifier.height(8.dp))
                HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))
                Spacer(Modifier.height(8.dp))

                Text("أوقات التنبيه:", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, modifier = Modifier.padding(start = 16.dp, bottom = 8.dp))
                
                times.forEachIndexed { index, time ->
                    TimeRow(
                        timeStr = time,
                        onTimeChange = { newTime ->
                            val newList = times.toMutableList()
                            newList[index] = newTime
                            times = newList
                        },
                        onDelete = {
                            val newList = times.toMutableList()
                            newList.removeAt(index)
                            times = newList
                        }
                    )
                }

                WathakkerButton(
    isSecondary = true,
    isSmall = true,
                    onClick = { times = times + listOf("12:00") },
                    modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 4.dp),
                    text = "إضافة وقت تنبيه"
                )
                
                Spacer(modifier = Modifier.height(16.dp))
                
                DialogButtons(
                    onDismiss = onDismiss,
                    onConfirm = {
                        if (title.isNotBlank() && content.isNotBlank() && times.isNotEmpty()) {
                            onConfirm(title, content, times, selectedTagIds.toList())
                        }
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DhikrEditDialog(
    dhikr: Dhikr,
    allTags: List<Tag> = emptyList(),
    initialTagIds: List<Long> = emptyList(),
    onDismiss: () -> Unit,
    onConfirm: (title: String, content: String, tagIds: List<Long>) -> Unit,
    onCreateTag: ((String) -> Unit)? = null
) {
    var title by remember { mutableStateOf(dhikr.title) }
    var content by remember { mutableStateOf(dhikr.content) }
    var selectedTagIds by remember { mutableStateOf(initialTagIds.toSet()) }
    var showNewTagInput by remember { mutableStateOf(false) }
    var newTagName by remember { mutableStateOf("") }

    androidx.compose.ui.window.Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(28.dp),
            color = MaterialTheme.colorScheme.surfaceVariant,
            tonalElevation = 0.dp,
            modifier = Modifier.fillMaxWidth().wrapContentHeight()
        ) {
            Column(modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 24.dp, start = 8.dp, end = 8.dp)) {
                WathakkerTextField(
                    value = title,
                    onValueChange = { title = it },
                    placeholder = { Text("العنوان", color = MaterialTheme.colorScheme.onSurfaceVariant) },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))

                WathakkerTextField(
                    value = content,
                    onValueChange = { content = it },
                    placeholder = { Text("الدعاء", color = MaterialTheme.colorScheme.onSurfaceVariant) },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier.fillMaxWidth().heightIn(min = 100.dp),
                    maxLines = 5
                )
                HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))

                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "التصنيفات (Tags):",
                            fontSize = 13.sp,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        WathakkerButton(
    isSecondary = true,
    isSmall = true,onClick = { showNewTagInput = !showNewTagInput }, text = "+ تصنيف جديد")
                    }

                    if (showNewTagInput) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                        ) {
                            WathakkerTextField(
                                value = newTagName,
                                onValueChange = { newTagName = it },
                                placeholder = { Text("اسم التصنيف الجديد", fontSize = 13.sp) },
                                singleLine = true,
                                modifier = Modifier.weight(1f).height(50.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            WathakkerButton(
    isSmall = true,
                                onClick = {
                                    if (newTagName.isNotBlank()) {
                                        onCreateTag?.invoke(newTagName.trim())
                                        newTagName = ""
                                        showNewTagInput = false
                                    }
                                },
                                text = "إضافة"
                            )
                        }
                    }

                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        allTags.forEach { tag ->
                            val isSelected = selectedTagIds.contains(tag.tagId)
                            WathakkerChip(
                                text = tag.name,
                                selected = isSelected,
                                onClick = {
                                    val newSet = selectedTagIds.toMutableSet()
                                    if (isSelected) newSet.remove(tag.tagId) else newSet.add(tag.tagId)
                                    selectedTagIds = newSet
                                },
                                color = androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
                            )
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(16.dp))
                
                DialogButtons(
                    onDismiss = onDismiss,
                    onConfirm = {
                        if (title.isNotBlank() && content.isNotBlank()) {
                            onConfirm(title, content, selectedTagIds.toList())
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun DhikrMultipleTimesDialog(
    dhikr: Dhikr,
    onDismiss: () -> Unit,
    onConfirm: (times: List<String>) -> Unit
) {
    var times by remember { mutableStateOf(dhikr.reminderTimes) }

    androidx.compose.ui.window.Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(28.dp),
            color = MaterialTheme.colorScheme.surfaceVariant,
            tonalElevation = 0.dp,
            modifier = Modifier.fillMaxWidth().wrapContentHeight()
        ) {
            Column(modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 24.dp, start = 8.dp, end = 8.dp)) {
                Text(
                    text = "أوقات التنبيه لـ: ${dhikr.title}",
                    fontSize = 18.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(horizontal = 16.dp).padding(bottom = 16.dp)
                )

                times.forEachIndexed { index, time ->
                    TimeRow(
                        timeStr = time,
                        onTimeChange = { newTime ->
                            val newList = times.toMutableList()
                            newList[index] = newTime
                            times = newList
                        },
                        onDelete = {
                            val newList = times.toMutableList()
                            newList.removeAt(index)
                            times = newList
                        }
                    )
                }

                WathakkerButton(
    isSecondary = true,
    isSmall = true,
                    onClick = { times = times + listOf("12:00") },
                    modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 8.dp),
                    text = "إضافة وقت تنبيه"
                )
                
                Spacer(modifier = Modifier.height(24.dp))
                
                DialogButtons(
                    onDismiss = onDismiss,
                    onConfirm = {
                        if (times.isNotEmpty()) {
                            onConfirm(times)
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun DialogButtons(onDismiss: () -> Unit, onConfirm: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        WathakkerButton(
    isSecondary = true,
    isSmall = true,onClick = onDismiss, modifier = Modifier.weight(1f), text = "إلغاء")
        WathakkerButton(onClick = onConfirm, modifier = Modifier.weight(1f), text = "حفظ")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimeRow(
    timeStr: String,
    onTimeChange: (String) -> Unit,
    onDelete: () -> Unit
) {
    val parts = timeStr.split(":")
    val hour = parts.getOrNull(0)?.toIntOrNull() ?: 12
    val minute = parts.getOrNull(1)?.toIntOrNull() ?: 0

    var showTimePicker by remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { showTimePicker = true }
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Notifications, contentDescription = null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(20.dp))
            Spacer(Modifier.width(16.dp))
            Text(formatTimeStr12h(timeStr), fontSize = 16.sp, color = MaterialTheme.colorScheme.onSurface)
        }
        IconButton(onClick = onDelete, modifier = Modifier.size(24.dp)) {
            Icon(Icons.Default.Delete, contentDescription = "Delete", tint = MaterialTheme.colorScheme.error.copy(alpha = 0.8f))
        }
    }
    HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))

    if (showTimePicker) {
        val state = rememberTimePickerState(
            initialHour = hour,
            initialMinute = minute,
            is24Hour = false
        )
        
        androidx.compose.ui.window.Dialog(onDismissRequest = { showTimePicker = false }) {
            Surface(
                shape = RoundedCornerShape(24.dp),
                color = MaterialTheme.colorScheme.surface
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("اختر الوقت", fontSize = 18.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, modifier = Modifier.padding(bottom = 24.dp))
                    
                    TimePicker(
                        state = state,
                        colors = TimePickerDefaults.colors(
                            clockDialColor = MaterialTheme.colorScheme.surfaceVariant,
                            selectorColor = MaterialTheme.colorScheme.primary,
                            containerColor = MaterialTheme.colorScheme.surface,
                            periodSelectorBorderColor = MaterialTheme.colorScheme.primary,
                            periodSelectorSelectedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                            periodSelectorSelectedContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    )
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                        WathakkerButton(
    isSecondary = true,
    isSmall = true,onClick = { showTimePicker = false }, text = "إلغاء")
                        Spacer(Modifier.width(8.dp))
                        WathakkerButton(
    isSmall = true,
                            onClick = {
                                onTimeChange(String.format("%02d:%02d", state.hour, state.minute))
                                showTimePicker = false
                            },
                            text = "حفظ"
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun DhikrDetailDialog(
    dhikr: Dhikr,
    onDismiss: () -> Unit,
    onMarkAsRead: (() -> Unit)? = null
) {
    androidx.compose.ui.window.Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(24.dp),
            color = MaterialTheme.colorScheme.surface,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                Text(
                    text = dhikr.title,
                    fontSize = 18.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
                
                HorizontalDivider(color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f), thickness = 2.dp)
                
                Spacer(modifier = Modifier.height(16.dp))
                
                Text(
                    text = dhikr.content,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 24.sp
                )
                
                Spacer(modifier = Modifier.height(24.dp))
                
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (onMarkAsRead != null) {
                        WathakkerButton(
    isSecondary = true,
    isSmall = true,onClick = {
                            onMarkAsRead()
                            onDismiss()
                        }, text = "تم القراءة")
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                    WathakkerButton(
    isSmall = true,onClick = onDismiss, text = "إغلاق")
                }
            }
        }
    }
}
