package com.example.fajr.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AlarmOff
import androidx.compose.material.icons.outlined.AlarmOn
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material.icons.outlined.AudioFile
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.EditLocation
import androidx.compose.material.icons.outlined.GpsFixed
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Stop
import androidx.compose.material.icons.outlined.Tune
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material.icons.outlined.VolumeUp
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.fajr.calculation.CalculationMethod
import com.example.fajr.data.FajrPreferences
import com.example.fajr.sound.RingtoneHelper
import com.example.ui.oneui.OneUICard
import com.example.ui.oneui.OneUIDialog
import com.example.ui.oneui.OneUIScreen
import com.example.ui.oneui.OneUISwitch
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S

@Composable
fun FajrSettingsScreen(
    viewModel: FajrViewModel,
    onBack: (() -> Unit)? = null,
    onMenu: (() -> Unit)? = null
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val context: Context = LocalContext.current
    var showCityDialog by remember { mutableStateOf(false) }
    var showMethodDialog by remember { mutableStateOf(false) }
    var isPlayingPreview by remember { mutableStateOf(false) }

    val locationPermissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        if (permissions.values.any { it }) viewModel.updateLocationFromGps()
    }
    val ringtonePickerLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == -1) {
            @Suppress("DEPRECATION")
            val uri: Uri? = result.data?.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI")
            if (uri != null) {
                val title = RingtoneHelper(context).getRingtoneTitle(uri)
                viewModel.setRingtone(uri, title)
            }
        }
    }
    val audioPickerLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        if (uri != null) {
            val title = RingtoneHelper(context).getRingtoneTitle(uri)
            viewModel.setRingtone(uri, title)
        }
    }
    DisposableEffect(Unit) {
        onDispose { viewModel.stopRingtonePreview() }
    }

    if (showCityDialog) {
        CitySearchDialog(
            onDismiss = { showCityDialog = false },
            onCitySelected = { viewModel.setCity(it) }
        )
    }
    if (showMethodDialog) {
        CalculationMethodDialog(
            currentMethod = state.calculationMethod,
            onDismiss = { showMethodDialog = false },
            onMethodSelected = { viewModel.setCalculationMethod(it) }
        )
    }

    FajrSettingsContent(
        state = state,
        onBack = onBack,
        onMenu = onMenu,
        onToggleAlarm = { viewModel.toggleAlarm(it) },
        onSelectGps = {
            viewModel.setUseCurrentLocation(true)
            if (!state.hasLocationPermission) {
                locationPermissionLauncher.launch(
                    arrayOf(
                        "android.permission.ACCESS_FINE_LOCATION",
                        "android.permission.ACCESS_COARSE_LOCATION"
                    )
                )
            }
        },
        onSelectManualCity = { viewModel.setUseCurrentLocation(false) },
        onChangeCity = { showCityDialog = true },
        onChangeMethod = { showMethodDialog = true },
        onRefresh = { viewModel.refreshFajrTimeManually() },
        isPlayingPreview = isPlayingPreview,
        onTogglePreview = {
            if (isPlayingPreview) {
                viewModel.stopRingtonePreview()
                isPlayingPreview = false
            } else {
                val uri = RingtoneHelper(context).getValidRingtoneUri(FajrPreferences(context))
                viewModel.playRingtonePreview(uri)
                isPlayingPreview = true
            }
        },
        onPickSystemRingtone = {
            val intent = Intent("android.intent.action.RINGTONE_PICKER")
            intent.putExtra("android.intent.extra.ringtone.TYPE", 4)
            intent.putExtra("android.intent.extra.ringtone.TITLE", L10n.t(S.PickRingtone))
            intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false)
            intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true)
            ringtonePickerLauncher.launch(intent)
        },
        onPickAudioFile = { audioPickerLauncher.launch("audio/*") },
        onToggleVibration = { viewModel.toggleVibration(it) },
        onSetVolume = { viewModel.setAlarmVolume(it) },
        onSetMaxDuration = { viewModel.setMaxDuration(it) }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FajrSettingsContent(
    state: FajrSettingsState,
    onBack: (() -> Unit)? = null,
    onMenu: (() -> Unit)? = null,
    onToggleAlarm: (Boolean) -> Unit = {},
    onSelectGps: () -> Unit = {},
    onSelectManualCity: () -> Unit = {},
    onChangeCity: () -> Unit = {},
    onChangeMethod: () -> Unit = {},
    onRefresh: () -> Unit = {},
    isPlayingPreview: Boolean = false,
    onTogglePreview: () -> Unit = {},
    onPickSystemRingtone: () -> Unit = {},
    onPickAudioFile: () -> Unit = {},
    onToggleVibration: (Boolean) -> Unit = {},
    onSetVolume: (Int) -> Unit = {},
    onSetMaxDuration: (Int) -> Unit = {}
) {
    val cs = MaterialTheme.colorScheme
    OneUIScreen(title = L10n.t(S.FajrAlarm), onBack = onBack, onMenu = onMenu) {
        item {
            FajrHeader(state.nextFajrTimeFormatted, state.isAlarmEnabled(), state.cityName)
        }
        item {
            OneUICard(padding = PaddingValues(18.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                        Row(
                            modifier = Modifier.size(44.dp).clip(CircleShape).background(cs.primary.copy(alpha = 0.15f)),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Outlined.Alarm, null, modifier = Modifier.size(24.dp), tint = cs.primary)
                        }
                        Spacer(Modifier.width(14.dp))
                        Column {
                            Text(L10n.t(S.FajrAlarmOn), color = cs.onSurface, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            Text(
                                if (state.isAlarmEnabled()) L10n.t(S.AlarmEnabledSub) else L10n.t(S.AlarmDisabledSub),
                                color = cs.onSurfaceVariant,
                                fontSize = 12.sp
                            )
                        }
                    }
                    OneUISwitch(state.isAlarmEnabled(), onToggleAlarm)
                }
            }
        }
        item {
            OneUICard(padding = PaddingValues(18.dp)) {
                Text(L10n.t(S.LocationMethod), color = cs.onSurface, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(8.dp))
                LocationOptionRow(
                    selected = state.useCurrentLocation,
                    icon = Icons.Outlined.GpsFixed,
                    title = L10n.t(S.CurrentLocation),
                    subtitle = L10n.t(S.AutoUpdateFajr),
                    onClick = onSelectGps
                )
                LocationOptionRow(
                    selected = !state.useCurrentLocation,
                    icon = Icons.Outlined.EditLocation,
                    title = L10n.t(S.PickCountryCity),
                    subtitle = L10n.t(S.PickCitySub),
                    onClick = onSelectManualCity
                )
                Spacer(Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Outlined.LocationOn, null, tint = cs.primary)
                        Spacer(Modifier.width(8.dp))
                        Column {
                            Text(L10n.t(S.CurrentCity), color = cs.onSurfaceVariant, fontSize = 11.sp)
                            Text(state.cityName, color = cs.onSurface, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                    if (!state.useCurrentLocation) {
                        TextButton(onClick = onChangeCity) {
                            Text(L10n.t(S.ChangeCity), fontSize = 13.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
                if (state.useCurrentLocation && (!state.hasLocationPermission || !state.isGpsAvailable())) {
                    Spacer(Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Outlined.Warning, null, tint = cs.error)
                        Spacer(Modifier.width(8.dp))
                        Text(
                            if (!state.hasLocationPermission) L10n.t(S.NoLocPermission)
                            else L10n.t(S.GpsOff),
                            color = cs.error,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
        item {
            OneUICard(padding = PaddingValues(18.dp)) {
                Text(L10n.t(S.CalcMethod), color = cs.onSurface, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Outlined.Tune, null, tint = cs.primary)
                        Spacer(Modifier.width(8.dp))
                        Column {
                            Text(L10n.t(S.SelectedCalcMethod), color = cs.onSurfaceVariant, fontSize = 11.sp)
                            Text(
                                state.calculationMethod.titleAr,
                                color = cs.onSurface,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    TextButton(onClick = onChangeMethod) {
                        Text(L10n.t(S.Change), color = cs.primary, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(Modifier.height(8.dp))
                OutlinedButton(
                    onClick = onRefresh,
                    modifier = Modifier.fillMaxWidth(),
                    enabled = !state.isRefreshing()
                ) {
                    if (state.isRefreshing()) {
                        CircularProgressIndicator(modifier = Modifier.size(18.dp), strokeWidth = 2.dp)
                        Spacer(Modifier.width(8.dp))
                        Text(L10n.t(S.UpdatingTime))
                    } else {
                        Icon(Icons.Outlined.Refresh, null)
                        Spacer(Modifier.width(8.dp))
                        Text(L10n.t(S.UpdateFajrNow), fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
        item {
            OneUICard(padding = PaddingValues(18.dp)) {
                Text(L10n.t(S.AlarmToneSection), color = cs.onSurface, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Outlined.MusicNote, null, tint = cs.primary)
                        Spacer(Modifier.width(8.dp))
                        Column {
                            Text(L10n.t(S.SelectedTone), color = cs.onSurfaceVariant, fontSize = 11.sp)
                            Text(
                                state.ringtoneTitle,
                                color = cs.onSurface,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    IconButton(onClick = onTogglePreview) {
                        Icon(
                            if (isPlayingPreview) Icons.Outlined.Stop else Icons.Outlined.PlayArrow,
                            "Preview",
                            modifier = Modifier.size(28.dp),
                            tint = cs.primary
                        )
                    }
                }
                Spacer(Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    OutlinedButton(
                        onClick = onPickSystemRingtone,
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Icon(Icons.Outlined.MusicNote, null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(6.dp))
                        Text(L10n.t(S.SystemTones), fontSize = 12.sp)
                    }
                    OutlinedButton(
                        onClick = onPickAudioFile,
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Icon(Icons.Outlined.AudioFile, null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(6.dp))
                        Text(L10n.t(S.AudioFile), fontSize = 12.sp)
                    }
                }
            }
        }
        item {
            OneUICard(padding = PaddingValues(18.dp)) {
                Text(L10n.t(S.ExtraSettings), color = cs.onSurface, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Outlined.Vibration, null, tint = cs.primary)
                        Spacer(Modifier.width(8.dp))
                        Text(L10n.t(S.VibrateDuringAlarm), color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                    }
                    OneUISwitch(state.isVibrationEnabled(), onToggleVibration)
                }
                Spacer(Modifier.height(12.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Outlined.VolumeUp, null, tint = cs.primary)
                        Spacer(Modifier.width(8.dp))
                        Text(L10n.t(S.AlarmVolume), color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                    }
                    Text("${state.alarmVolume}%", color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
                Slider(
                    value = state.alarmVolume.toFloat(),
                    onValueChange = { onSetVolume(it.toInt()) },
                    valueRange = 10f..100f
                )
                Spacer(Modifier.height(8.dp))
                Text(L10n.t(S.SnoozeDuration), color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                Spacer(Modifier.height(8.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    listOf(1, 3, 5, 10).forEach { mins ->
                        FilterChip(
                            selected = state.maxDurationMinutes == mins,
                            onClick = { onSetMaxDuration(mins) },
                            label = { Text(L10n.t(S.MinutesShortFmt).format(mins), modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, maxLines = 1) },
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun LocationOptionRow(
    selected: Boolean,
    icon: ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .clickable(onClick = onClick)
            .background(if (selected) cs.primary.copy(alpha = 0.12f) else Color.Transparent)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = selected, onClick = onClick)
        Spacer(Modifier.width(8.dp))
        Icon(icon, null, tint = cs.primary)
        Spacer(Modifier.width(10.dp))
        Column {
            Text(title, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            Text(subtitle, color = cs.onSurfaceVariant, fontSize = 11.sp)
        }
    }
}

@Composable
fun FajrHeader(nextFajrTimeFormatted: String, isAlarmEnabled: Boolean, cityName: String) {
    val cs = MaterialTheme.colorScheme
    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp)) {
        Text(
            L10n.t(S.NextFajrAt),
            color = cs.onSurfaceVariant,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(Modifier.height(4.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    nextFajrTimeFormatted,
                    color = cs.primary,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(Modifier.height(2.dp))
                Text(cityName, color = cs.onSurfaceVariant, fontSize = 12.sp)
            }
            val accent = if (isAlarmEnabled) Color(0xFF10B981) else Color(0xFF999999)
            Surface(shape = RoundedCornerShape(12.dp), color = accent.copy(alpha = 0.15f)) {
                Icon(
                    if (isAlarmEnabled) Icons.Outlined.AlarmOn else Icons.Outlined.AlarmOff,
                    if (isAlarmEnabled) L10n.t(S.AlarmOnDesc) else L10n.t(S.AlarmOffDesc),
                    modifier = Modifier.padding(11.dp).size(24.dp),
                    tint = accent
                )
            }
        }
    }
}

@Composable
fun CalculationMethodDialog(
    currentMethod: CalculationMethod,
    onDismiss: () -> Unit,
    onMethodSelected: (CalculationMethod) -> Unit
) {
    val cs = MaterialTheme.colorScheme
    OneUIDialog(title = L10n.t(S.PickCalcMethod), onDismiss = onDismiss) {
        CalculationMethod.values().forEach { method ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .clickable {
                        onMethodSelected(method)
                        onDismiss()
                    }
                    .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(method.titleAr, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                if (method == currentMethod) {
                    Icon(Icons.Outlined.Check, null, tint = cs.primary)
                }
            }
        }
    }
}

