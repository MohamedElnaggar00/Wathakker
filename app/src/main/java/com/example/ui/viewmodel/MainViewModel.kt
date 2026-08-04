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

import com.example.data.Tag
import com.example.data.DhikrWithTags
import com.example.data.DhikrHistory
import kotlinx.coroutines.flow.map

data class DhikrStats(
    val todayCount: Int = 0,
    val weekCount: Int = 0,
    val monthCount: Int = 0,
    val totalCount: Int = 0,
    val streakDays: Int = 0,
    val topReadDhikr: List<Pair<Int, Int>> = emptyList()
)

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

    private val _selectedTag = MutableStateFlow<Tag?>(null)
    val selectedTag: StateFlow<Tag?> = _selectedTag.asStateFlow()

    fun setSelectedTag(tag: Tag?) {
        _selectedTag.value = tag
    }

    private val _tasbeehCount = MutableStateFlow(prefs.getInt("count", 0))
    val tasbeehCount: StateFlow<Int> = _tasbeehCount.asStateFlow()

    init {
        val db = AppDatabase.getDatabase(application)
        repository = DhikrRepository(db.dhikrDao(), db.tagDao(), db.historyDao())
        alarmScheduler = AlarmScheduler(application)
    }

    val allHistory: StateFlow<List<DhikrHistory>> = repository.allHistory.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val stats: StateFlow<DhikrStats> = repository.allHistory.map { historyList ->
        calculateStats(historyList)
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = DhikrStats()
    )

    private fun calculateStats(historyList: List<DhikrHistory>): DhikrStats {
        if (historyList.isEmpty()) return DhikrStats()

        val cal = java.util.Calendar.getInstance()
        cal.set(java.util.Calendar.HOUR_OF_DAY, 0)
        cal.set(java.util.Calendar.MINUTE, 0)
        cal.set(java.util.Calendar.SECOND, 0)
        cal.set(java.util.Calendar.MILLISECOND, 0)
        val startOfToday = cal.timeInMillis

        val weekCal = (cal.clone() as java.util.Calendar).apply {
            add(java.util.Calendar.DAY_OF_YEAR, -6)
        }
        val startOfWeek = weekCal.timeInMillis

        val monthCal = (cal.clone() as java.util.Calendar).apply {
            set(java.util.Calendar.DAY_OF_MONTH, 1)
        }
        val startOfMonth = monthCal.timeInMillis

        var todayCount = 0
        var weekCount = 0
        var monthCount = 0
        val totalCount = historyList.size

        val dhikrCountsMap = mutableMapOf<Int, Int>()
        val dateSet = mutableSetOf<String>()

        for (item in historyList) {
            if (item.timestamp >= startOfToday) todayCount++
            if (item.timestamp >= startOfWeek) weekCount++
            if (item.timestamp >= startOfMonth) monthCount++

            dhikrCountsMap[item.dhikrId] = (dhikrCountsMap[item.dhikrId] ?: 0) + 1
            dateSet.add(item.dateString)
        }

        // Streak calculation
        val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US)
        val checkCal = (cal.clone() as java.util.Calendar)
        var streak = 0

        var currentDateStr = sdf.format(checkCal.time)
        if (!dateSet.contains(currentDateStr)) {
            // If today has no reading yet, check if yesterday had a reading to keep streak active
            checkCal.add(java.util.Calendar.DAY_OF_YEAR, -1)
            currentDateStr = sdf.format(checkCal.time)
        }

        while (dateSet.contains(currentDateStr)) {
            streak++
            checkCal.add(java.util.Calendar.DAY_OF_YEAR, -1)
            currentDateStr = sdf.format(checkCal.time)
        }

        val topRead = dhikrCountsMap.toList().sortedByDescending { it.second }

        return DhikrStats(
            todayCount = todayCount,
            weekCount = weekCount,
            monthCount = monthCount,
            totalCount = totalCount,
            streakDays = streak,
            topReadDhikr = topRead
        )
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

    val allTags: StateFlow<List<Tag>> = repository.allTags.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val dhikrsWithTags: StateFlow<List<DhikrWithTags>> = repository.dhikrsWithTags.stateIn(
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

    fun addDhikrWithScheduleAndTags(title: String, content: String, times: List<String>, tagIds: List<Long>) {
        viewModelScope.launch {
            val newDhikr = Dhikr(title = title, content = content, reminderTimes = times, isEnabled = true)
            val id = repository.insert(newDhikr)
            val scheduledDhikr = newDhikr.copy(id = id.toInt())
            alarmScheduler.schedule(scheduledDhikr)
            if (tagIds.isNotEmpty()) {
                repository.updateDhikrTags(id.toInt(), tagIds)
            }
        }
    }

    fun updateDhikrWithTags(dhikr: Dhikr, newTitle: String, newContent: String, tagIds: List<Long>) {
        viewModelScope.launch {
            val updated = dhikr.copy(title = newTitle, content = newContent)
            repository.update(updated)
            repository.updateDhikrTags(dhikr.id, tagIds)
            if (updated.isEnabled) {
                alarmScheduler.schedule(updated)
            }
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

    fun updateDhikrTags(dhikrId: Int, tagIds: List<Long>) {
        viewModelScope.launch {
            repository.updateDhikrTags(dhikrId, tagIds)
        }
    }

    fun addTag(name: String, colorHex: String = "#008080", onCreated: ((Tag) -> Unit)? = null) {
        viewModelScope.launch {
            val tag = repository.getOrCreateTagByName(name, colorHex)
            onCreated?.invoke(tag)
        }
    }

    fun updateTag(tag: Tag) {
        viewModelScope.launch {
            repository.updateTag(tag)
        }
    }

    fun deleteTag(tag: Tag) {
        viewModelScope.launch {
            if (_selectedTag.value?.tagId == tag.tagId) {
                _selectedTag.value = null
            }
            repository.deleteTag(tag)
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

    fun markAsRead(dhikr: Dhikr) {
        markAsRead(dhikr.id)
    }

    fun resetTasbeeh() {
        _tasbeehCount.value = 0
        prefs.edit().putInt("count", 0).apply()
    }
}
