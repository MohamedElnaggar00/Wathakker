package com.example.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHistory(history: DhikrHistory): Long

    @Query("SELECT * FROM dhikr_history ORDER BY timestamp DESC")
    fun getAllHistory(): Flow<List<DhikrHistory>>

    @Query("SELECT COUNT(*) FROM dhikr_history WHERE timestamp >= :startTime")
    fun getCountSince(startTime: Long): Flow<Int>

    @Query("SELECT COUNT(*) FROM dhikr_history")
    fun getTotalCount(): Flow<Int>

    @Query("SELECT DISTINCT dateString FROM dhikr_history ORDER BY dateString DESC")
    fun getDistinctReadDates(): Flow<List<String>>

    @Query("DELETE FROM dhikr_history")
    suspend fun clearHistory()
}
