package com.example.ui.screens

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
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.*
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
                    text = "إدارة التصنيفات",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Button(
                    onClick = { showAddTagDialog = true },
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("إضافة تصنيف", maxLines = 1)
                }
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
            AlertDialog(
                onDismissRequest = { tagToDelete = null },
                title = { Text("حذف التصنيف") },
                text = { Text("هل أنت تأكد من حذف تصنيف \"${tag.name}\"؟ لن يتم حذف الأذكار المرتبطة به.") },
                confirmButton = {
                    TextButton(
                        onClick = {
                            viewModel.deleteTag(tag)
                            tagToDelete = null
                        }
                    ) {
                        Text("حذف", color = MaterialTheme.colorScheme.error)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { tagToDelete = null }) {
                        Text("إلغاء")
                    }
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
    val tagColor = remember(tag.colorHex) {
        try {
            Color(android.graphics.Color.parseColor(tag.colorHex))
        } catch (e: Exception) {
            Color(0xFF008080)
        }
    }

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
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
                        imageVector = Icons.Outlined.Edit,
                        contentDescription = "تعديل",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
                IconButton(onClick = onDelete) {
                    Icon(
                        imageVector = Icons.Outlined.Delete,
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
    var selectedColorHex by remember { mutableStateOf(tag?.colorHex ?: "#008080") }

    val availableColors = listOf(
        "#008080", "#800080", "#1E3A8A", "#059669",
        "#DC2626", "#D97706", "#4F46E5", "#2563EB",
        "#0284C7", "#0D9488", "#16A34A", "#CA8A04"
    )

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(if (tag == null) "إضافة تصنيف جديد" else "تعديل التصنيف") },
        text = {
            Column {
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("اسم التصنيف") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))
                Text("اختر لون التصنيف:", fontSize = 14.sp, fontWeight = FontWeight.Medium)
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
            Button(
                onClick = {
                    if (name.isNotBlank()) {
                        onConfirm(name.trim(), selectedColorHex)
                    }
                }
            ) {
                Text("حفظ")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("إلغاء")
            }
        }
    )
}

@Composable
private fun ColorCircle(
    colorHex: String,
    isSelected: Boolean,
    onSelect: () -> Unit
) {
    val color = remember(colorHex) {
        try {
            Color(android.graphics.Color.parseColor(colorHex))
        } catch (e: Exception) {
            Color(0xFF008080)
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
