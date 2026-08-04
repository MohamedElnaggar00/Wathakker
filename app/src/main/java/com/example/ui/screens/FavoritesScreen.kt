package com.example.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.data.Dhikr
import com.example.ui.viewmodel.MainViewModel

@Composable
fun FavoritesScreen(viewModel: MainViewModel) {
    val favoriteDhikr by viewModel.favoriteDhikr.collectAsStateWithLifecycle()

    var showTimesDialog by remember { mutableStateOf<Dhikr?>(null) }
    var showEditDialog by remember { mutableStateOf<Dhikr?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("الاذكار المفضلة", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onBackground, modifier = Modifier.padding(bottom = 16.dp))
        
        if (favoriteDhikr.isEmpty()) {
            Text("لا توجد أذكار مفضلة", color = MaterialTheme.colorScheme.onSurfaceVariant)
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(favoriteDhikr) { dhikr ->
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
