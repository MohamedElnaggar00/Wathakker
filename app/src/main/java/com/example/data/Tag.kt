package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tag_table")
data class Tag(
    @PrimaryKey(autoGenerate = true) val tagId: Long = 0,
    val name: String,
    val colorHex: String = "#008080"
)
