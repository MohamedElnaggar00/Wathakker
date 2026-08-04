package com.example.ui.screens

import com.example.ui.components.WathakkerTextField
import com.example.ui.components.WathakkerDialog

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Label
import androidx.compose.material3.*
import com.example.ui.components.WathakkerCard
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.data.Tag
import com.example.ui.components.WathakkerButton



import com.example.ui.viewmodel.MainViewModel

@Composable
fun TagsScreen(viewModel: MainViewModel) {
    val allTags by viewModel.allTags.collectAsStateWithLifecycle()
    val dhikrsWithTags by viewModel.dhikrsWithTags.collectAsStateWithLifecycle()

    var showAddTagDialog by remember { mutableStateOf(false) }
    var tagToEdit by remember { mutableStateOf<Tag?>(null) }
    var tagToDelete by remember { mutableStateOf<Tag?>(null) }

    val tagCountMap = remember(dhikrsWithTags) {
        val map = mutableMapOf<Long, Int>()
        dhikrsWithTags.forEach { dhikrWithTags ->
            dhikrWithTags.tags.forEach { tag ->
                map[tag.tagId] = (map[tag.tagId] ?: 0) + 1
            }
        }
        map
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "إدارة التصنيفات (Tags)",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )

                WathakkerButton(
    isSmall = true,
                    onClick = { showAddTagDialog = true },
                    text = "إضافة تصنيف"
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (allTags.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.Label,
                            contentDescription = null,
                            modifier = Modifier.size(64.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.4f)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "لا توجد تصنيفات حالياً",
                            fontSize = 18.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            } else {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    contentPadding = PaddingValues(bottom = 24.dp)
                ) {
                    items(allTags, key = { it.tagId }) { tag ->
                        val count = tagCountMap[tag.tagId] ?: 0
                        TagItemCard(
                            tag = tag,
                            dhikrCount = count,
                            onEdit = { tagToEdit = tag },
                            onDelete = { tagToDelete = tag }
                        )
                    }
                }
            }
        }

        if (showAddTagDialog) {
            TagAddEditDialog(
                tag = null,
                onDismiss = { showAddTagDialog = false },
                onConfirm = { name, colorHex ->
                    viewModel.addTag(name, colorHex)
                    showAddTagDialog = false
                }
            )
        }

        tagToEdit?.let { tag ->
            TagAddEditDialog(
                tag = tag,
                onDismiss = { tagToEdit = null },
                onConfirm = { name, colorHex ->
                    viewModel.updateTag(tag.copy(name = name, colorHex = colorHex))
                    tagToEdit = null
                }
            )
        }

        tagToDelete?.let { tag ->
            WathakkerDialog(
                onDismissRequest = { tagToDelete = null },
                title = { Text("حذف التصنيف") },
                text = { Text("هل أنت تأكد من حذف تصنيف \"${tag.name}\"؟ لن يتم حذف الأذكار المرتبطة به.") },
                confirmButton = {
                    WathakkerButton(
    isSmall = true,
                        onClick = {
                            viewModel.deleteTag(tag)
                            tagToDelete = null
                        },
                        text = "حذف"
                    )
                },
                dismissButton = {
                    WathakkerButton(
    isSecondary = true,
    isSmall = true,
                        onClick = { tagToDelete = null },
                        text = "إلغاء"
                    )
                }
            )
        }
    }
}

@Composable
fun TagItemCard(
    tag: Tag,
    dhikrCount: Int,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    val defaultTagColor = MaterialTheme.colorScheme.onSurfaceVariant
    val tagColor = remember(tag.colorHex, defaultTagColor) {
        try {
            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
        } catch (e: Exception) {
            defaultTagColor
        }
    }

    WathakkerCard(
        color = MaterialTheme.colorScheme.surfaceVariant,
        modifier = Modifier.padding(0.dp) // Layout takes care of margin? No, wait. PrimaryCard already has 16.dp margin.
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(tagColor)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        text = tag.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Text(
                        text = "$dhikrCount أذكار مرتبطة",
                        fontSize = 13.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
                    )
                }
            }

            Row {
                IconButton(onClick = onEdit) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "تعديل",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
                IconButton(onClick = onDelete) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "حذف",
                        tint = MaterialTheme.colorScheme.error
                    )
                }
            }
        }
    }
}

@Composable
fun TagAddEditDialog(
    tag: Tag?,
    onDismiss: () -> Unit,
    onConfirm: (String, String) -> Unit
) {
    var name by remember { mutableStateOf(tag?.name ?: "") }
    var selectedColorHex by remember { mutableStateOf(tag?.colorHex ?: "#6B6B73") }

    val availableColors = listOf(
        "#111113", "#2C2C30", "#48484A", "#6B6B73",
        "#8E8E93", "#3B3B42", "#55555E", "#72727C",
        "#8D8D98", "#A8A8B4", "#50505A", "#686874"
    )

    WathakkerDialog(
        onDismissRequest = onDismiss,
        title = { Text(if (tag == null) "إضافة تصنيف جديد" else "تعديل التصنيف") },
        text = {
            Column {
                WathakkerTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("اسم التصنيف") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))
                Text("اختر لون التصنيف:", fontSize = 13.sp, fontWeight = FontWeight.Medium)
                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    availableColors.take(6).forEach { colorHex ->
                        ColorCircle(
                            colorHex = colorHex,
                            isSelected = selectedColorHex.equals(colorHex, ignoreCase = true),
                            onSelect = { selectedColorHex = colorHex }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    availableColors.drop(6).take(6).forEach { colorHex ->
                        ColorCircle(
                            colorHex = colorHex,
                            isSelected = selectedColorHex.equals(colorHex, ignoreCase = true),
                            onSelect = { selectedColorHex = colorHex }
                        )
                    }
                }
            }
        },
        confirmButton = {
            WathakkerButton(
    isSmall = true,
                onClick = {
                    if (name.isNotBlank()) {
                        onConfirm(name.trim(), selectedColorHex)
                    }
                },
                text = "حفظ"
            )
        },
        dismissButton = {
            WathakkerButton(
    isSecondary = true,
    isSmall = true,
                onClick = onDismiss,
                text = "إلغاء"
            )
        }
    )
}

@Composable
private fun ColorCircle(
    colorHex: String,
    isSelected: Boolean,
    onSelect: () -> Unit
) {
    val defaultColor = MaterialTheme.colorScheme.onSurfaceVariant
    val color = remember(colorHex, defaultColor) {
        try {
            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(colorHex))
        } catch (e: Exception) {
            defaultColor
        }
    }

    Box(
        modifier = Modifier
            .size(32.dp)
            .clip(CircleShape)
            .background(color)
            .then(
                if (isSelected) Modifier.border(3.dp, MaterialTheme.colorScheme.onSurface, CircleShape)
                else Modifier
            )
            .clickable { onSelect() }
    )
}
