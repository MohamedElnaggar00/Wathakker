package com.example.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WheelTimePicker(
    initialHour24: Int,
    initialMinute: Int,
    onTimeSelected: (Int, Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val initialHour12 = if (initialHour24 == 0) 12 else if (initialHour24 > 12) initialHour24 - 12 else initialHour24
    val initialIsAm = initialHour24 < 12
    val hours = (1..12).map { it.toString() }
    val minutes = (0..59).map { String.format("%02d", it) }
    val amPmList = listOf("AM", "PM")

    var selectedHour12Index by remember { mutableIntStateOf(initialHour12 - 1) }
    var selectedMinuteIndex by remember { mutableIntStateOf(initialMinute) }
    var selectedAmPmIndex by remember { mutableIntStateOf(if (initialIsAm) 0 else 1) }

    LaunchedEffect(selectedHour12Index, selectedMinuteIndex, selectedAmPmIndex) {
        val h12 = selectedHour12Index + 1
        val isAm = selectedAmPmIndex == 0
        val h24 = if (isAm && h12 == 12) 0 else if (isAm) h12 else if (h12 == 12) 12 else h12 + 12
        onTimeSelected(h24, selectedMinuteIndex)
    }

    Row(
        modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        WheelPickerColumn(hours, selectedHour12Index, { selectedHour12Index = it }, Modifier.width(64.dp))
        Text(
            ":",
            modifier = Modifier.padding(horizontal = 8.dp),
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        WheelPickerColumn(minutes, selectedMinuteIndex, { selectedMinuteIndex = it }, Modifier.width(64.dp))
        Spacer(modifier = Modifier.width(16.dp))
        WheelPickerColumn(amPmList, selectedAmPmIndex, { selectedAmPmIndex = it }, Modifier.width(64.dp))
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun WheelPickerColumn(
    items: List<String>,
    initialIndex: Int,
    onItemSelected: (Int) -> Unit,
    modifier: Modifier = Modifier,
    visibleItemsCount: Int = 3,
    itemHeight: Dp = 52.dp
) {
    val count = items.size
    val startIndex = remember(count, initialIndex) {
        val max = (1 shl 30) - 1
        (max - (max % count)) + initialIndex
    }
    val listState = rememberLazyListState(initialFirstVisibleItemIndex = startIndex - 1)
    val flingBehavior = rememberSnapFlingBehavior(lazyListState = listState)
    val selectedIndex by remember {
        derivedStateOf {
            val centerIndex = listState.firstVisibleItemIndex + 1
            ((centerIndex % count) + count) % count
        }
    }

    LaunchedEffect(selectedIndex) {
        onItemSelected(selectedIndex)
    }

    Box(
        modifier = modifier.height(itemHeight * visibleItemsCount),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            state = listState,
            flingBehavior = flingBehavior,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().height(itemHeight * visibleItemsCount)
        ) {
            items(Int.MAX_VALUE) { index ->
                val actualIndex = ((index % count) + count) % count
                val itemText = items[actualIndex]
                val isSelected = actualIndex == selectedIndex
                Box(
                    modifier = Modifier.height(itemHeight).fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = itemText,
                        fontSize = if (isSelected) 32.sp else 26.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                        color = if (isSelected) Color.White else Color.White.copy(alpha = 0.35f),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
