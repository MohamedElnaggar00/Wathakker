package com.example.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [Dhikr::class, Tag::class, DhikrTagCrossRef::class, DhikrHistory::class], version = 6, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dhikrDao(): DhikrDao
    abstract fun tagDao(): TagDao
    abstract fun historyDao(): HistoryDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "wazakkir_database"
                )
                .fallbackToDestructiveMigration()
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        CoroutineScope(Dispatchers.IO).launch {
                            try {
                                INSTANCE?.dhikrDao()?.let { dao ->
                                    val defaultAdhkar = listOf(
                                        Dhikr(
                                            title = "دعاء السكينة", 
                                            content = "اللهم امنحني السكينة لأتقبل الأشياء التي لا أستطيع تغييرها، والشجاعة لتغيير الأشياء التي أستطيع تغييرها، والحكمة لمعرفة الفرق بينهما", 
                                            reminderTimes = listOf("09:00"),
                                            isEnabled = false
                                        )
                                    )
                                    dao.insertAll(defaultAdhkar)
                                }
                                INSTANCE?.tagDao()?.let { tagDao ->
                                    val defaultTags = listOf(
                                        Tag(name = "أذكار الصباح", colorHex = "#008080"),
                                        Tag(name = "أذكار المساء", colorHex = "#800080"),
                                        Tag(name = "أذكار النوم", colorHex = "#1E3A8A"),
                                        Tag(name = "أدعية عامة", colorHex = "#059669")
                                    )
                                    defaultTags.forEach { tagDao.insertTag(it) }
                                }
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    }
                })
                .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
