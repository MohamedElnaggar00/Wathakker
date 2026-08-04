package com.example.data

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity(
    tableName = "dhikr_table",
    indices = [
        Index(value = ["isFavorite"]),
        Index(value = ["isEnabled"])
    ]
)
@TypeConverters(Converters::class)
data class Dhikr(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val content: String,
    val isFavorite: Boolean = false,
    val reminderTimes: List<String> = listOf("09:00"),
    val isEnabled: Boolean = false,
    val readCount: Int = 0,
    val lastReadTime: Long = 0L
)
