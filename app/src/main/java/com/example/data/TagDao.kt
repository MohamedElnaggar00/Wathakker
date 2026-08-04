package com.example.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TagDao {
    @Query("SELECT * FROM tag_table ORDER BY name ASC")
    fun getAllTags(): Flow<List<Tag>>

    @Query("SELECT * FROM tag_table WHERE tagId = :tagId")
    suspend fun getTagById(tagId: Long): Tag?

    @Query("SELECT * FROM tag_table WHERE name = :name LIMIT 1")
    suspend fun getTagByName(name: String): Tag?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTag(tag: Tag): Long

    @Update
    suspend fun updateTag(tag: Tag)

    @Delete
    suspend fun deleteTag(tag: Tag)

    @Query("DELETE FROM tag_table WHERE tagId = :tagId")
    suspend fun deleteTagById(tagId: Long)

    // DhikrTagCrossRef operations
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDhikrTagCrossRef(crossRef: DhikrTagCrossRef)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDhikrTagCrossRefs(crossRefs: List<DhikrTagCrossRef>)

    @Query("DELETE FROM dhikr_tag_cross_ref WHERE dhikrId = :dhikrId")
    suspend fun deleteTagsForDhikr(dhikrId: Int)

    @Query("DELETE FROM dhikr_tag_cross_ref WHERE tagId = :tagId")
    suspend fun deleteDhikrRefsForTag(tagId: Long)

    @Transaction
    @Query("SELECT * FROM dhikr_table")
    fun getDhikrsWithTags(): Flow<List<DhikrWithTags>>

    @Transaction
    @Query("SELECT * FROM dhikr_table WHERE id = :dhikrId")
    suspend fun getDhikrWithTagsById(dhikrId: Int): DhikrWithTags?

    @Query("SELECT T.* FROM tag_table T INNER JOIN dhikr_tag_cross_ref R ON T.tagId = R.tagId WHERE R.dhikrId = :dhikrId")
    fun getTagsForDhikr(dhikrId: Int): Flow<List<Tag>>

    @Query("SELECT T.* FROM tag_table T INNER JOIN dhikr_tag_cross_ref R ON T.tagId = R.tagId WHERE R.dhikrId = :dhikrId")
    suspend fun getTagsForDhikrSync(dhikrId: Int): List<Tag>

    @Transaction
    suspend fun updateDhikrTags(dhikrId: Int, tagIds: List<Long>) {
        deleteTagsForDhikr(dhikrId)
        val refs = tagIds.map { DhikrTagCrossRef(dhikrId, it) }
        if (refs.isNotEmpty()) {
            insertDhikrTagCrossRefs(refs)
        }
    }
}
