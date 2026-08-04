package com.example.data

import kotlinx.coroutines.flow.Flow

class DhikrRepository(
    private val dhikrDao: DhikrDao,
    private val tagDao: TagDao,
    private val historyDao: HistoryDao
) {
    val allDhikr: Flow<List<Dhikr>> = dhikrDao.getAllDhikr()
    val favoriteDhikr: Flow<List<Dhikr>> = dhikrDao.getFavoriteDhikr()
    val enabledDhikr: Flow<List<Dhikr>> = dhikrDao.getEnabledDhikr()
    val allTags: Flow<List<Tag>> = tagDao.getAllTags()
    val dhikrsWithTags: Flow<List<DhikrWithTags>> = tagDao.getDhikrsWithTags()
    val allHistory: Flow<List<DhikrHistory>> = historyDao.getAllHistory()
    val totalHistoryCount: Flow<Int> = historyDao.getTotalCount()
    val distinctReadDates: Flow<List<String>> = historyDao.getDistinctReadDates()

    fun getHistoryCountSince(startTime: Long): Flow<Int> {
        return historyDao.getCountSince(startTime)
    }

    suspend fun getDhikrById(id: Int): Dhikr? {
        return dhikrDao.getDhikrById(id)
    }

    suspend fun markAsRead(id: Int) {
        val now = System.currentTimeMillis()
        val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US)
        val dateStr = sdf.format(java.util.Date(now))
        dhikrDao.markAsRead(id, now)
        historyDao.insertHistory(DhikrHistory(dhikrId = id, timestamp = now, dateString = dateStr))
    }

    suspend fun insert(dhikr: Dhikr): Long {
        return dhikrDao.insertDhikr(dhikr)
    }

    suspend fun update(dhikr: Dhikr) {
        dhikrDao.updateDhikr(dhikr)
    }

    suspend fun delete(id: Int) {
        dhikrDao.deleteDhikrById(id)
        tagDao.deleteTagsForDhikr(id)
    }

    // Tag operations
    suspend fun insertTag(tag: Tag): Long {
        return tagDao.insertTag(tag)
    }

    suspend fun updateTag(tag: Tag) {
        tagDao.updateTag(tag)
    }

    suspend fun deleteTag(tag: Tag) {
        tagDao.deleteDhikrRefsForTag(tag.tagId)
        tagDao.deleteTag(tag)
    }

    suspend fun updateDhikrTags(dhikrId: Int, tagIds: List<Long>) {
        tagDao.updateDhikrTags(dhikrId, tagIds)
    }

    suspend fun getOrCreateTagByName(name: String, colorHex: String = "#008080"): Tag {
        val existing = tagDao.getTagByName(name.trim())
        if (existing != null) return existing
        val newTag = Tag(name = name.trim(), colorHex = colorHex)
        val id = tagDao.insertTag(newTag)
        return newTag.copy(tagId = id)
    }
}
