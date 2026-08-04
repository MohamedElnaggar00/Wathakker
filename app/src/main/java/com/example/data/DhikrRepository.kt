package com.example.data

import kotlinx.coroutines.flow.Flow

class DhikrRepository(private val dhikrDao: DhikrDao) {
    val allDhikr: Flow<List<Dhikr>> = dhikrDao.getAllDhikr()
    val favoriteDhikr: Flow<List<Dhikr>> = dhikrDao.getFavoriteDhikr()
    val enabledDhikr: Flow<List<Dhikr>> = dhikrDao.getEnabledDhikr()

    suspend fun getDhikrById(id: Int): Dhikr? {
        return dhikrDao.getDhikrById(id)
    }

    suspend fun markAsRead(id: Int) {
        dhikrDao.markAsRead(id)
    }

    suspend fun insert(dhikr: Dhikr): Long {
        return dhikrDao.insertDhikr(dhikr)
    }

    suspend fun update(dhikr: Dhikr) {
        dhikrDao.updateDhikr(dhikr)
    }

    suspend fun delete(id: Int) {
        dhikrDao.deleteDhikrById(id)
    }
}
