package com.example.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface DhikrDao {
    @Query("SELECT * FROM dhikr_table")
    fun getAllDhikr(): Flow<List<Dhikr>>

    @Query("SELECT * FROM dhikr_table WHERE isFavorite = 1")
    fun getFavoriteDhikr(): Flow<List<Dhikr>>

    @Query("SELECT * FROM dhikr_table WHERE isEnabled = 1")
    fun getEnabledDhikr(): Flow<List<Dhikr>>
    
    @Query("SELECT * FROM dhikr_table WHERE id = :id")
    suspend fun getDhikrById(id: Int): Dhikr?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDhikr(dhikr: Dhikr): Long
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(dhikrList: List<Dhikr>)

    @Update
    suspend fun updateDhikr(dhikr: Dhikr)

    @Query("DELETE FROM dhikr_table WHERE id = :id")
    suspend fun deleteDhikrById(id: Int)
}
