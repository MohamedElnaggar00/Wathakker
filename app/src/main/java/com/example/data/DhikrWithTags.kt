package com.example.data

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class DhikrWithTags(
    @Embedded val dhikr: Dhikr,
    @Relation(
        parentColumn = "id",
        entityColumn = "tagId",
        associateBy = Junction(
            value = DhikrTagCrossRef::class,
            parentColumn = "dhikrId",
            entityColumn = "tagId"
        )
    )
    val tags: List<Tag> = emptyList()
)
