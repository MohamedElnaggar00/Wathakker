package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.Dhikr
import com.example.utils.formatTimeStr12h

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import com.example.data.Tag

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
    val selectedTagIds = remember { mutableStateListOf<Long>() }
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
                TextField(
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

                TextField(
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
                            fontSize = 14.sp,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        TextButton(onClick = { showNewTagInput = !showNewTagInput }) {
                            Text("+ تصنيف جديد", fontSize = 13.sp)
                        }
                    }

                    if (showNewTagInput) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                        ) {
                            OutlinedTextField(
                                value = newTagName,
                                onValueChange = { newTagName = it },
                                placeholder = { Text("اسم التصنيف الجديد", fontSize = 12.sp) },
                                singleLine = true,
                                modifier = Modifier.weight(1f).height(50.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Button(
                                onClick = {
                                    if (newTagName.isNotBlank()) {
                                        onCreateTag?.invoke(newTagName.trim())
                                        newTagName = ""
                                        showNewTagInput = false
                                    }
                                },
                                modifier = Modifier.height(50.dp)
                            ) {
                                Text("إضافة", fontSize = 13.sp)
                            }
                        }
                    }

                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        allTags.forEach { tag ->
                            val isSelected = selectedTagIds.contains(tag.tagId)
                            FilterChip(
                                selected = isSelected,
                                onClick = {
                                    if (isSelected) selectedTagIds.remove(tag.tagId)
                                    else selectedTagIds.add(tag.tagId)
                                },
                                label = { Text(tag.name, fontSize = 13.sp) }
                            )
                        }
                    }
                }

                HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))

                LazyColumn(modifier = Modifier.heightIn(max = 120.dp)) {
                    itemsIndexed(times) { index, timeStr ->
                        TimeRow(
                            timeStr = timeStr,
                            onTimeChange = { newTime ->
                                val newTimes = times.toMutableList()
                                newTimes[index] = newTime
                                times = newTimes
                            },
                            onDelete = {
                                val newTimes = times.toMutableList()
                                newTimes.removeAt(index)
                                times = newTimes
                            }
                        )
                    }
                }
                
                TextButton(
                    onClick = { times = times + "12:00" },
                    modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 4.dp)
                ) {
                    Icon(Icons.Default.Add, contentDescription = "Add Time", tint = MaterialTheme.colorScheme.onSurfaceVariant)
                    Spacer(Modifier.width(8.dp))
                    Text("إضافة وقت تنبيه", color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                
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
    val selectedTagIds = remember { mutableStateListOf<Long>().apply { addAll(initialTagIds) } }
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
                TextField(
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

                TextField(
                    value = content,
                    onValueChange = { content = it },
                    placeholder = { Text("الدعاء", color = MaterialTheme.colorScheme.onSurfaceVariant) },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier.fillMaxWidth().heightIn(min = 100.dp),
                    maxLines = 8
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
                            fontSize = 14.sp,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        TextButton(onClick = { showNewTagInput = !showNewTagInput }) {
                            Text("+ تصنيف جديد", fontSize = 13.sp)
                        }
                    }

                    if (showNewTagInput) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                        ) {
                            OutlinedTextField(
                                value = newTagName,
                                onValueChange = { newTagName = it },
                                placeholder = { Text("اسم التصنيف الجديد", fontSize = 12.sp) },
                                singleLine = true,
                                modifier = Modifier.weight(1f).height(50.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Button(
                                onClick = {
                                    if (newTagName.isNotBlank()) {
                                        onCreateTag?.invoke(newTagName.trim())
                                        newTagName = ""
                                        showNewTagInput = false
                                    }
                                },
                                modifier = Modifier.height(50.dp)
                            ) {
                                Text("إضافة", fontSize = 13.sp)
                            }
                        }
                    }

                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        allTags.forEach { tag ->
                            val isSelected = selectedTagIds.contains(tag.tagId)
                            FilterChip(
                                selected = isSelected,
                                onClick = {
                                    if (isSelected) selectedTagIds.remove(tag.tagId)
                                    else selectedTagIds.add(tag.tagId)
                                },
                                label = { Text(tag.name, fontSize = 13.sp) }
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
    onConfirm: (List<String>) -> Unit
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
                    "تكرار التنبيه",
                    fontSize = 20.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(horizontal = 16.dp).padding(bottom = 16.dp)
                )
                
                LazyColumn(modifier = Modifier.heightIn(max = 300.dp)) {
                    itemsIndexed(times) { index, timeStr ->
                        TimeRow(
                            timeStr = timeStr,
                            onTimeChange = { newTime ->
                                val newTimes = times.toMutableList()
                                newTimes[index] = newTime
                                times = newTimes
                            },
                            onDelete = {
                                val newTimes = times.toMutableList()
                                newTimes.removeAt(index)
                                times = newTimes
                            }
                        )
                    }
                }
                
                TextButton(
                    onClick = { times = times + "12:00" },
                    modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 8.dp)
                ) {
                    Icon(Icons.Default.Add, contentDescription = "Add Time", tint = MaterialTheme.colorScheme.onSurfaceVariant)
                    Spacer(Modifier.width(8.dp))
                    Text("إضافة وقت تنبيه", color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                
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
    Surface(
        shape = RoundedCornerShape(50),
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.08f),
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            TextButton(onClick = onDismiss, modifier = Modifier.weight(1f)) {
                Text("إلغاء", color = MaterialTheme.colorScheme.onSurface, fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Medium)
            }
            Box(modifier = Modifier.width(1.dp).height(24.dp).background(MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f)))
            TextButton(onClick = onConfirm, modifier = Modifier.weight(1f)) {
                Text("حفظ", color = MaterialTheme.colorScheme.onSurface, fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Medium)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimeRow(
    timeStr: String,
    onTimeChange: (String) -> Unit,
    onDelete: () -> Unit
) {
    var showTimePicker by remember { mutableStateOf(false) }
    val parts = timeStr.split(":")
    val hour = parts.getOrNull(0)?.toIntOrNull() ?: 12
    val minute = parts.getOrNull(1)?.toIntOrNull() ?: 0

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { showTimePicker = true }
            .padding(vertical = 12.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Notifications, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
            Spacer(Modifier.width(16.dp))
            Text(formatTimeStr12h(timeStr), fontSize = 16.sp, color = MaterialTheme.colorScheme.onSurface)
        }
        IconButton(onClick = onDelete, modifier = Modifier.size(24.dp)) {
            Icon(Icons.Outlined.Delete, contentDescription = "Delete", tint = MaterialTheme.colorScheme.error.copy(alpha = 0.8f))
        }
    }
    HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))

    if (showTimePicker) {
        var selectedHour24 by remember { mutableStateOf(hour) }
        var selectedMinute by remember { mutableStateOf(minute) }

        androidx.compose.ui.window.Dialog(onDismissRequest = { showTimePicker = false }) {
            Surface(
                shape = RoundedCornerShape(28.dp),
                color = MaterialTheme.colorScheme.surfaceVariant,
                tonalElevation = 0.dp,
                modifier = Modifier.wrapContentSize()
            ) {
                Column(modifier = Modifier.padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    com.example.ui.components.WheelTimePicker(
                        initialHour24 = hour,
                        initialMinute = minute,
                        onTimeSelected = { h, m ->
                            selectedHour24 = h
                            selectedMinute = m
                        }
                    )
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    DialogButtons(
                        onDismiss = { showTimePicker = false },
                        onConfirm = {
                            onTimeChange(String.format("%02d:%02d", selectedHour24, selectedMinute))
                            showTimePicker = false
                        }
                    )
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
            shape = RoundedCornerShape(28.dp),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 6.dp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                Text(
                    text = dhikr.title,
                    fontSize = 22.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = MaterialTheme.colorScheme.surfaceVariant,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .padding(16.dp)
                ) {
                    Text(
                        text = dhikr.content,
                        fontSize = 18.sp,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 28.sp
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (onMarkAsRead != null) {
                        Button(
                            onClick = {
                                onMarkAsRead()
                                onDismiss()
                            },
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Check,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("تم القراءة", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                    Button(onClick = onDismiss) {
                        Text("إغلاق", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
                    }
                }
            }
        }
    }
}
