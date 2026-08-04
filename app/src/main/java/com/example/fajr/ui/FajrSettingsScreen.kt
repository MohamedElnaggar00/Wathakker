package com.example.fajr.ui

import android.Manifest
import android.content.Intent
import android.media.RingtoneManager
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.fajr.calculation.CalculationMethod
import com.example.fajr.sound.RingtoneHelper
import com.example.ui.components.WathakkerCard
import com.example.ui.components.WathakkerButton

@Composable
fun FajrSettingsScreen(viewModel: FajrViewModel) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val context = LocalContext.current

    val locationPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        if (permissions[Manifest.permission.ACCESS_FINE_LOCATION] == true ||
            permissions[Manifest.permission.ACCESS_COARSE_LOCATION] == true) {
            viewModel.updateLocationFromGps()
        }
    }

    var showCitySearch by remember { mutableStateOf(false) }

    if (showCitySearch) {
        CitySearchDialog(
            onDismiss = { showCitySearch = false },
            onCitySelected = { city ->
                viewModel.setCity(city)
                showCitySearch = false
            }
        )
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 32.dp)
    ) {
        item {
            FajrHeaderCard(
                nextFajrTimeFormatted = state.nextFajrTimeFormatted,
                isAlarmEnabled = state.isAlarmEnabled,
                cityName = state.cityName
            )
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.padding(horizontal = 24.dp)) {
                Text("إعدادات المنبه", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }

        item {
            WathakkerCard {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text("تفعيل منبه الفجر", fontWeight = FontWeight.Bold)
                        Text("يوقظك على وقت الفجر يومياً", fontSize = 13.sp)
                    }
                    Switch(checked = state.isAlarmEnabled, onCheckedChange = { viewModel.toggleAlarm(it) })
                }
            }
        }

        item {
            WathakkerCard {
                Column {
                    Text("الموقع الجغرافي", fontWeight = FontWeight.Bold)
                    Spacer(Modifier.height(8.dp))
                    WathakkerButton(text = "استخدام الموقع الحالي", onClick = {
                        viewModel.setUseCurrentLocation(true)
                        locationPermissionLauncher.launch(
                            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
                        )
                    })
                    Spacer(Modifier.height(8.dp))
                    WathakkerButton(text = "البحث عن مدينة", onClick = { showCitySearch = true })
                }
            }
        }

        item {
            WathakkerCard {
                Column {
                    Text("طريقة الحساب", fontWeight = FontWeight.Bold)
                    CalculationMethod.values().forEach { method ->
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = state.calculationMethod == method,
                                onClick = { viewModel.setCalculationMethod(method) }
                            )
                            Text(method.titleAr)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun FajrHeaderCard(
    nextFajrTimeFormatted: String,
    isAlarmEnabled: Boolean,
    cityName: String
) {
    WathakkerCard(color = MaterialTheme.colorScheme.primaryContainer) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("منبه صلاة الفجر", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(Modifier.height(16.dp))
            Text(nextFajrTimeFormatted, fontWeight = FontWeight.Bold, fontSize = 32.sp)
            Spacer(Modifier.height(8.dp))
            Text(cityName)
        }
    }
}
