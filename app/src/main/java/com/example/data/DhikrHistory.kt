package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dhikr_history")
data class DhikrHistory(
    @PrimaryKey(autoGenerate = true) val historyId: Long = 0,
    val dhikrId: Int,
    val timestamp: Long = System.currentTimeMillis(),
    val dateString: String
)
