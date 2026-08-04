package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.filled.NotificationsOff
import androidx.compose.material.icons.filled.Search
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
import com.example.data.Tag
import com.example.ui.viewmodel.MainViewModel
import com.example.utils.formatTimeStr12h

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

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun HomeScreen(viewModel: MainViewModel, searchQuery: String = "") {
    val allDhikr by viewModel.allDhikr.collectAsStateWithLifecycle()
    val allTags by viewModel.allTags.collectAsStateWithLifecycle()
    val dhikrsWithTags by viewModel.dhikrsWithTags.collectAsStateWithLifecycle()
    val selectedTag by viewModel.selectedTag.collectAsStateWithLifecycle()
    val vmSearchQuery by viewModel.searchQuery.collectAsStateWithLifecycle()

    val effectiveQuery = if (searchQuery.isNotBlank()) searchQuery else vmSearchQuery

    var showTimesDialog by remember { mutableStateOf<Dhikr?>(null) }
    var showEditDialog by remember { mutableStateOf<Dhikr?>(null) }

    val dhikrTagsMap = remember(dhikrsWithTags) {
        dhikrsWithTags.associate { it.dhikr.id to it.tags }
    }

    val filteredDhikr = remember(allDhikr, effectiveQuery, selectedTag, dhikrTagsMap) {
        allDhikr.filter { dhikr ->
            val tagsForThisDhikr = dhikrTagsMap[dhikr.id] ?: emptyList()

            // Tag filter
            val matchesTag = if (selectedTag == null) {
                true
            } else {
                tagsForThisDhikr.any { it.tagId == selectedTag?.tagId }
            }

            // Search query filter (title, content, or tag name)
            val matchesQuery = if (effectiveQuery.isBlank()) {
                true
            } else {
                val q = effectiveQuery.trim()
                dhikr.title.contains(q, ignoreCase = true) ||
                        dhikr.content.contains(q, ignoreCase = true) ||
                        tagsForThisDhikr.any { it.name.contains(q, ignoreCase = true) }
            }

            matchesTag && matchesQuery
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        // Search Bar
        OutlinedTextField(
            value = effectiveQuery,
            onValueChange = { newQuery ->
                viewModel.setSearchQuery(newQuery)
            },
            placeholder = { Text("ابحث في العنوان أو نص الذكر أو التصنيف...", fontSize = 15.sp) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "بحث",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            },
            trailingIcon = {
                if (effectiveQuery.isNotEmpty()) {
                    IconButton(onClick = { viewModel.setSearchQuery("") }) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "مسح البحث",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            },
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = MaterialTheme.colorScheme.surface,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        // Tag Filter Chips Row
        if (allTags.isNotEmpty()) {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(vertical = 8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                item {
                    FilterChip(
                        selected = selectedTag == null,
                        onClick = { viewModel.setSelectedTag(null) },
                        label = { Text("الكل", fontSize = 13.sp, fontWeight = FontWeight.Medium) },
                        shape = RoundedCornerShape(20.dp)
                    )
                }

                items(allTags, key = { it.tagId }) { tag ->
                    val isSelected = selectedTag?.tagId == tag.tagId
                    val tagColor = remember(tag.colorHex) {
                        try {
                            Color(android.graphics.Color.parseColor(tag.colorHex))
                        } catch (e: Exception) {
                            Color(0xFF008080)
                        }
                    }

                    FilterChip(
                        selected = isSelected,
                        onClick = {
                            if (isSelected) viewModel.setSelectedTag(null)
                            else viewModel.setSelectedTag(tag)
                        },
                        label = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(10.dp)
                                        .clip(CircleShape)
                                        .background(tagColor)
                                )
                                Spacer(Modifier.width(6.dp))
                                Text(tag.name, fontSize = 13.sp)
                            }
                        },
                        shape = RoundedCornerShape(20.dp)
                    )
                }
            }
        }

        if (filteredDhikr.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(64.dp),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.4f)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = if (effectiveQuery.isBlank() && selectedTag == null) "لا توجد أذكار" 
                               else if (selectedTag != null && effectiveQuery.isBlank()) "لا توجد أذكار تحت تصنيف \"${selectedTag?.name}\""
                               else "لا توجد نتائج تطابق \"$effectiveQuery\"",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(bottom = 24.dp, top = 8.dp),
                modifier = Modifier.weight(1f)
            ) {
                items(
                    items = filteredDhikr,
                    key = { it.id }
                ) { dhikr ->
                    val tags = dhikrTagsMap[dhikr.id] ?: emptyList()
                    DhikrItemCard(
                        dhikr = dhikr,
                        tags = tags,
                        onToggleEnabled = { viewModel.toggleEnabled(dhikr) },
                        onToggleFavorite = { viewModel.toggleFavorite(dhikr) },
                        onClickTimes = { showTimesDialog = dhikr },
                        onEditClick = { showEditDialog = dhikr },
                        onDeleteClick = { viewModel.deleteDhikr(dhikr) },
                        onTagClick = { tag ->
                            if (selectedTag?.tagId == tag.tagId) viewModel.setSelectedTag(null)
                            else viewModel.setSelectedTag(tag)
                        },
                        onMarkAsRead = { viewModel.markAsRead(dhikr) }
                    )
                }
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
        val currentTagIds = (dhikrTagsMap[dhikr.id] ?: emptyList()).map { it.tagId }
        DhikrEditDialog(
            dhikr = dhikr,
            allTags = allTags,
            initialTagIds = currentTagIds,
            onDismiss = { showEditDialog = null },
            onConfirm = { newTitle, newContent, tagIds ->
                viewModel.updateDhikrWithTags(dhikr, newTitle, newContent, tagIds)
                showEditDialog = null
            },
            onCreateTag = { newTagName ->
                viewModel.addTag(newTagName)
            }
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DhikrItemCard(
    dhikr: Dhikr,
    tags: List<Tag> = emptyList(),
    onToggleEnabled: () -> Unit,
    onToggleFavorite: () -> Unit,
    onClickTimes: () -> Unit,
    onEditClick: () -> Unit,
    onDeleteClick: () -> Unit,
    onTagClick: ((Tag) -> Unit)? = null,
    onMarkAsRead: (() -> Unit)? = null
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
                                text = { Text("تعديل نص وتصنيفات الدعاء", fontSize = 16.sp, color = MaterialTheme.colorScheme.onSurface, modifier = Modifier.padding(horizontal = 12.dp)) },
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
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 8.dp),
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

            // Render Tags associated with this Dhikr
            if (tags.isNotEmpty()) {
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp),
                    modifier = Modifier.padding(bottom = 10.dp)
                ) {
                    tags.forEach { tag ->
                        val tagColor = remember(tag.colorHex) {
                            try {
                                Color(android.graphics.Color.parseColor(tag.colorHex))
                            } catch (e: Exception) {
                                Color(0xFF008080)
                            }
                        }

                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = tagColor.copy(alpha = 0.15f),
                            modifier = Modifier.clickable { onTagClick?.invoke(tag) }
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(8.dp)
                                        .clip(CircleShape)
                                        .background(tagColor)
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = tag.name,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = tagColor
                                )
                            }
                        }
                    }
                }
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

            if (onMarkAsRead != null) {
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onMarkAsRead) {
                        Text(
                            text = "تم القراءة ✓",
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary,
                            fontSize = 13.sp
                        )
                    }
                }
            }
        }
    }
}

