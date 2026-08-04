package com.example.data

import androidx.room.Entity
import androidx.room.Index

@Entity(
    tableName = "dhikr_tag_cross_ref",
    primaryKeys = ["dhikrId", "tagId"],
    indices = [
        Index(value = ["dhikrId"]),
        Index(value = ["tagId"])
    ]
)
data class DhikrTagCrossRef(
    val dhikrId: Int,
    val tagId: Long
)
