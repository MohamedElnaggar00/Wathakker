package com.example.fajr.ui

import android.app.Application
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.fajr.alarm.FajrAlarmScheduler
import com.example.fajr.calculation.CalculationMethod
import com.example.fajr.calculation.PrayerTimesCalculator
import com.example.fajr.data.CityItem
import com.example.fajr.data.FajrPreferences
import com.example.fajr.location.LocationManagerHelper
import com.example.fajr.sound.RingtoneHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

data class FajrSettingsState(
    val isAlarmEnabled: Boolean = false,
    val useCurrentLocation: Boolean = true,
    val cityName: String = "القاهرة، مصر",
    val latitude: Double = 30.0444,
    val longitude: Double = 31.2357,
    val nextFajrTimeFormatted: String = "--:--",
    val nextFajrMillis: Long = 0L,
    val calculationMethod: CalculationMethod = CalculationMethod.EGYPTIAN,
    val ringtoneTitle: String = "نغمة المنبه الافتراضية",
    val isVibrationEnabled: Boolean = true,
    val maxDurationMinutes: Int = 5,
    val alarmVolume: Int = 80,
    val isRefreshing: Boolean = false,
    val isGpsAvailable: Boolean = true,
    val hasLocationPermission: Boolean = false
)

class FajrViewModel(application: Application) : AndroidViewModel(application) {

    private val prefs = FajrPreferences(application)
    private val scheduler = FajrAlarmScheduler(application)
    private val locationHelper = LocationManagerHelper(application)
    private val ringtoneHelper = RingtoneHelper(application)

    private val _uiState = MutableStateFlow(FajrSettingsState())
    val uiState: StateFlow<FajrSettingsState> = _uiState.asStateFlow()

    init {
        loadSettings()
    }

    fun loadSettings() {
        val method = CalculationMethod.fromId(prefs.calculationMethodId)
        val validUri = ringtoneHelper.getValidRingtoneUri(prefs)
        val ringtoneTitle = ringtoneHelper.getRingtoneTitle(validUri)

        _uiState.value = FajrSettingsState(
            isAlarmEnabled = prefs.isAlarmEnabled,
            useCurrentLocation = prefs.useCurrentLocation,
            cityName = prefs.cityName,
            latitude = prefs.latitude,
            longitude = prefs.longitude,
            calculationMethod = method,
            ringtoneTitle = ringtoneTitle,
            isVibrationEnabled = prefs.isVibrationEnabled,
            maxDurationMinutes = prefs.maxDurationMinutes,
            alarmVolume = prefs.alarmVolume,
            isGpsAvailable = locationHelper.isGpsEnabled(),
            hasLocationPermission = locationHelper.hasLocationPermission()
        )

        refreshFajrTimeInternal()
    }

    fun toggleAlarm(enabled: Boolean) {
        prefs.isAlarmEnabled = enabled
        _uiState.value = _uiState.value.copy(isAlarmEnabled = enabled)
        if (enabled) {
            scheduler.scheduleNextFajrAlarm()
        } else {
            scheduler.cancelAllAlarms()
        }
        refreshFajrTimeInternal()
    }

    fun setUseCurrentLocation(useGps: Boolean) {
        prefs.useCurrentLocation = useGps
        _uiState.value = _uiState.value.copy(useCurrentLocation = useGps)
        if (useGps) {
            updateLocationFromGps()
        } else {
            refreshFajrTimeInternal()
        }
    }

    fun updateLocationFromGps() {
        viewModelScope.launch(Dispatchers.IO) {
            _uiState.value = _uiState.value.copy(isRefreshing = true)
            val hasPerm = locationHelper.hasLocationPermission()
            val gpsOk = locationHelper.isGpsEnabled()

            if (hasPerm && gpsOk) {
                val location = locationHelper.getLastKnownLocation()
                if (location != null) {
                    prefs.latitude = location.latitude
                    prefs.longitude = location.longitude
                    val name = locationHelper.getCityNameFromCoordinates(location.latitude, location.longitude)
                    prefs.cityName = name

                    _uiState.value = _uiState.value.copy(
                        latitude = location.latitude,
                        longitude = location.longitude,
                        cityName = name,
                        hasLocationPermission = true,
                        isGpsAvailable = true
                    )
                }
            } else {
                _uiState.value = _uiState.value.copy(
                    hasLocationPermission = hasPerm,
                    isGpsAvailable = gpsOk
                )
            }
            refreshFajrTimeInternal()
            _uiState.value = _uiState.value.copy(isRefreshing = false)
        }
    }

    fun setCity(city: CityItem) {
        prefs.useCurrentLocation = false
        prefs.latitude = city.latitude
        prefs.longitude = city.longitude
        val title = "${city.cityNameAr}، ${city.countryNameAr}"
        prefs.cityName = title
        prefs.countryName = city.countryNameAr

        _uiState.value = _uiState.value.copy(
            useCurrentLocation = false,
            latitude = city.latitude,
            longitude = city.longitude,
            cityName = title
        )
        refreshFajrTimeInternal()
        if (prefs.isAlarmEnabled) {
            scheduler.scheduleNextFajrAlarm()
        }
    }

    fun setCalculationMethod(method: CalculationMethod) {
        prefs.calculationMethodId = method.id
        _uiState.value = _uiState.value.copy(calculationMethod = method)
        refreshFajrTimeInternal()
        if (prefs.isAlarmEnabled) {
            scheduler.scheduleNextFajrAlarm()
        }
    }

    fun setRingtone(uri: Uri, title: String) {
        prefs.ringtoneUri = uri.toString()
        prefs.ringtoneTitle = title
        _uiState.value = _uiState.value.copy(ringtoneTitle = title)
    }

    fun toggleVibration(enabled: Boolean) {
        prefs.isVibrationEnabled = enabled
        _uiState.value = _uiState.value.copy(isVibrationEnabled = enabled)
    }

    fun setMaxDuration(minutes: Int) {
        prefs.maxDurationMinutes = minutes
        _uiState.value = _uiState.value.copy(maxDurationMinutes = minutes)
    }

    fun setAlarmVolume(volume: Int) {
        prefs.alarmVolume = volume
        _uiState.value = _uiState.value.copy(alarmVolume = volume)
    }

    fun refreshFajrTimeManually() {
        viewModelScope.launch(Dispatchers.IO) {
            _uiState.value = _uiState.value.copy(isRefreshing = true)
            if (prefs.useCurrentLocation) {
                updateLocationFromGps()
            } else {
                refreshFajrTimeInternal()
            }
            if (prefs.isAlarmEnabled) {
                scheduler.scheduleNextFajrAlarm()
            }
            _uiState.value = _uiState.value.copy(isRefreshing = false)
        }
    }

    private fun refreshFajrTimeInternal() {
        val now = System.currentTimeMillis()
        val calendar = Calendar.getInstance()
        val method = _uiState.value.calculationMethod

        var fajrTime = PrayerTimesCalculator.calculateFajrTime(
            calendar = calendar,
            latitude = _uiState.value.latitude,
            longitude = _uiState.value.longitude,
            method = method
        )

        var isTomorrow = false
        if (fajrTime <= now) {
            calendar.add(Calendar.DAY_OF_YEAR, 1)
            fajrTime = PrayerTimesCalculator.calculateFajrTime(
                calendar = calendar,
                latitude = _uiState.value.latitude,
                longitude = _uiState.value.longitude,
                method = method
            )
            isTomorrow = true
        }

        val timeSdf = SimpleDateFormat("hh:mm a", Locale("ar"))
        val formattedTime = timeSdf.format(Date(fajrTime))
        val prefix = if (isTomorrow) "غداً في" else "اليوم في"
        val fullFormatted = "$prefix $formattedTime"

        _uiState.value = _uiState.value.copy(
            nextFajrTimeFormatted = fullFormatted,
            nextFajrMillis = fajrTime
        )
    }

    fun playRingtonePreview(uri: Uri) {
        ringtoneHelper.playPreview(uri, _uiState.value.alarmVolume / 100f)
    }

    fun stopRingtonePreview() {
        ringtoneHelper.stopPreview()
    }
}
