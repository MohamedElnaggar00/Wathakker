package com.example.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.*
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
    onTimeSelected: (hour24: Int, minute: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val initialHour12 = when {
        initialHour24 == 0 -> 12
        initialHour24 > 12 -> initialHour24 - 12
        else -> initialHour24
    }
    val initialIsAm = initialHour24 < 12

    val hours = (1..12).map { it.toString() }
    val minutes = (0..59).map { String.format("%02d", it) }
    val amPmList = listOf("AM", "PM")

    var selectedHour12Index by remember { mutableStateOf(initialHour12 - 1) }
    var selectedMinuteIndex by remember { mutableStateOf(initialMinute) }
    var selectedAmPmIndex by remember { mutableStateOf(if (initialIsAm) 0 else 1) }

    LaunchedEffect(selectedHour12Index, selectedMinuteIndex, selectedAmPmIndex) {
        val h12 = selectedHour12Index + 1
        val isAm = selectedAmPmIndex == 0
        val h24 = when {
            isAm && h12 == 12 -> 0
            isAm -> h12
            !isAm && h12 == 12 -> 12
            else -> h12 + 12
        }
        onTimeSelected(h24, selectedMinuteIndex)
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Hours
        WheelPickerColumn(
            items = hours,
            initialIndex = selectedHour12Index,
            onSelectedIndexChanged = { selectedHour12Index = it },
            modifier = Modifier.width(64.dp)
        )

        // Colon Separator
        Text(
            text = ":",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 8.dp)
        )

        // Minutes
        WheelPickerColumn(
            items = minutes,
            initialIndex = selectedMinuteIndex,
            onSelectedIndexChanged = { selectedMinuteIndex = it },
            modifier = Modifier.width(64.dp)
        )

        Spacer(Modifier.width(16.dp))

        // AM / PM
        WheelPickerColumn(
            items = amPmList,
            initialIndex = selectedAmPmIndex,
            onSelectedIndexChanged = { selectedAmPmIndex = it },
            modifier = Modifier.width(64.dp)
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun WheelPickerColumn(
    items: List<String>,
    initialIndex: Int,
    onSelectedIndexChanged: (Int) -> Unit,
    modifier: Modifier = Modifier,
    visibleItemsCount: Int = 3,
    itemHeight: Dp = 52.dp
) {
    val count = items.size
    val startIndex = remember(initialIndex) {
        val base = Integer.MAX_VALUE / 2
        base - (base % count) + initialIndex
    }
    val listState = rememberLazyListState(initialFirstVisibleItemIndex = startIndex - 1)
    val snapFlingBehavior = rememberSnapFlingBehavior(lazyListState = listState)

    val selectedIndex by remember {
        derivedStateOf {
            val centerIndex = listState.firstVisibleItemIndex + 1
            ((centerIndex % count) + count) % count
        }
    }

    LaunchedEffect(selectedIndex) {
        onSelectedIndexChanged(selectedIndex)
    }

    Box(
        modifier = modifier.height(itemHeight * visibleItemsCount),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            state = listState,
            flingBehavior = snapFlingBehavior,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(itemHeight * visibleItemsCount)
        ) {
            items(count = Integer.MAX_VALUE) { index ->
                val actualIndex = ((index % count) + count) % count
                val itemText = items[actualIndex]
                val isSelected = actualIndex == selectedIndex

                Box(
                    modifier = Modifier
                        .height(itemHeight)
                        .fillMaxWidth(),
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
