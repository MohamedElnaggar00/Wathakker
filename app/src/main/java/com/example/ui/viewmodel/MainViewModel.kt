package com.example.ui.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.AppDatabase
import com.example.data.Dhikr
import com.example.data.DhikrRepository
import com.example.alarm.AlarmScheduler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: DhikrRepository
    private val alarmScheduler: AlarmScheduler
    private val prefs = application.getSharedPreferences("tasbeeh_prefs", Context.MODE_PRIVATE)
    private val appPrefs = application.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)

    private val _language = MutableStateFlow(appPrefs.getString("language", "ar") ?: "ar")
    val language: StateFlow<String> = _language.asStateFlow()

    private val _vibrationEnabled = MutableStateFlow(appPrefs.getBoolean("vibration_enabled", true))
    val vibrationEnabled: StateFlow<Boolean> = _vibrationEnabled.asStateFlow()

    private val _useDeviceFont = MutableStateFlow(appPrefs.getBoolean("use_device_font", false))
    val useDeviceFont: StateFlow<Boolean> = _useDeviceFont.asStateFlow()

    private val _notificationSound = MutableStateFlow(appPrefs.getString("notification_sound", "default") ?: "default")
    val notificationSound: StateFlow<String> = _notificationSound.asStateFlow()

    fun updateLanguage(lang: String) {
        _language.value = lang
        appPrefs.edit().putString("language", lang).apply()
    }

    fun updateVibrationEnabled(enabled: Boolean) {
        _vibrationEnabled.value = enabled
        appPrefs.edit().putBoolean("vibration_enabled", enabled).apply()
    }

    fun updateUseDeviceFont(use: Boolean) {
        _useDeviceFont.value = use
        appPrefs.edit().putBoolean("use_device_font", use).apply()
    }

    fun updateNotificationSound(sound: String) {
        _notificationSound.value = sound
        appPrefs.edit().putString("notification_sound", sound).apply()
    }


    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    private val _tasbeehCount = MutableStateFlow(prefs.getInt("count", 0))
    val tasbeehCount: StateFlow<Int> = _tasbeehCount.asStateFlow()

    init {
        val dao = AppDatabase.getDatabase(application).dhikrDao()
        repository = DhikrRepository(dao)
        alarmScheduler = AlarmScheduler(application)
    }

    val allDhikr: StateFlow<List<Dhikr>> = repository.allDhikr.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val favoriteDhikr: StateFlow<List<Dhikr>> = repository.favoriteDhikr.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )
    
    val enabledDhikr: StateFlow<List<Dhikr>> = repository.enabledDhikr.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun toggleFavorite(dhikr: Dhikr) {
        viewModelScope.launch {
            repository.update(dhikr.copy(isFavorite = !dhikr.isFavorite))
        }
    }

    fun toggleEnabled(dhikr: Dhikr) {
        viewModelScope.launch {
            val newState = !dhikr.isEnabled
            repository.update(dhikr.copy(isEnabled = newState))
            if (newState) {
                alarmScheduler.schedule(dhikr)
            } else {
                alarmScheduler.cancel(dhikr)
            }
        }
    }

    fun updateTimes(dhikr: Dhikr, newTimes: List<String>) {
        viewModelScope.launch {
            val updated = dhikr.copy(reminderTimes = newTimes, isEnabled = true)
            repository.update(updated)
            alarmScheduler.schedule(updated)
        }
    }

    fun addDhikrWithSchedule(title: String, content: String, times: List<String>) {
         viewModelScope.launch {
             val newDhikr = Dhikr(title = title, content = content, reminderTimes = times, isEnabled = true)
             val id = repository.insert(newDhikr)
             val scheduledDhikr = newDhikr.copy(id = id.toInt())
             alarmScheduler.schedule(scheduledDhikr)
         }
    }

    fun updateDhikrText(dhikr: Dhikr, newTitle: String, newContent: String) {
        viewModelScope.launch {
            val updated = dhikr.copy(title = newTitle, content = newContent)
            repository.update(updated)
            if (updated.isEnabled) {
                alarmScheduler.schedule(updated)
            }
        }
    }

    fun deleteDhikr(dhikr: Dhikr) {
        viewModelScope.launch {
            repository.delete(dhikr.id)
            alarmScheduler.cancel(dhikr)
        }
    }

    fun incrementTasbeeh() {
        val newCount = _tasbeehCount.value + 1
        _tasbeehCount.value = newCount
        prefs.edit().putInt("count", newCount).apply()
    }

    private val _selectedDhikrFromNotification = MutableStateFlow<Dhikr?>(null)
    val selectedDhikrFromNotification: StateFlow<Dhikr?> = _selectedDhikrFromNotification.asStateFlow()

    fun onDhikrSelectedFromNotification(dhikrId: Int) {
        viewModelScope.launch {
            val dhikr = repository.getDhikrById(dhikrId)
            _selectedDhikrFromNotification.value = dhikr
        }
    }

    fun clearSelectedDhikrFromNotification() {
        _selectedDhikrFromNotification.value = null
    }

    fun markAsRead(dhikrId: Int) {
        viewModelScope.launch {
            repository.markAsRead(dhikrId)
        }
    }

    fun resetTasbeeh() {
        _tasbeehCount.value = 0
        prefs.edit().putInt("count", 0).apply()
    }
}
