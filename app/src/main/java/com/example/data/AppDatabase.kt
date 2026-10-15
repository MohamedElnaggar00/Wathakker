package com.example.data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.suspendCoroutineUninterceptedOrReturn

/**
 * Room database. The generated implementation (AppDatabase_Impl and the *Dao_Impl classes)
 * is the Room output recovered from the shipped 3.0.6 build; the DAO interfaces and entities
 * are the Java sources next to this file.
 */
abstract class AppDatabase : RoomDatabase() {
    abstract fun dhikrDao(): DhikrDao
    abstract fun hisnDao(): HisnDao
    abstract fun historyDao(): HistoryDao
    abstract fun tagDao(): TagDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        val MIGRATION_7_8: Migration = object : Migration(7, 8) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `hisn_chapter` (`id` INTEGER NOT NULL, `order` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))")
                db.execSQL(HISN_ITEM_SQL)
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_hisn_item_chapterId` ON `hisn_item` (`chapterId`)")
                db.execSQL("CREATE TABLE IF NOT EXISTS `hisn_favorite` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chapterId` INTEGER NOT NULL, `itemId` INTEGER NOT NULL)")
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_hisn_favorite_chapterId_itemId` ON `hisn_favorite` (`chapterId`, `itemId`)")
                db.execSQL("CREATE TABLE IF NOT EXISTS `hisn_read` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chapterId` INTEGER NOT NULL, `dateString` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)")
            }
        }

        fun getDatabase(context: Context): AppDatabase {
            INSTANCE?.let { return it }
            synchronized(this) {
                val app = context.applicationContext
                val instance = Room.databaseBuilder(app, AppDatabase::class.java, "wazakkir_database")
                    .addMigrations(MIGRATION_7_8)
                    .fallbackToDestructiveMigration()
                    .addCallback(object : RoomDatabase.Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            CoroutineScope(Dispatchers.IO).launch { seedDefaults() }
                        }
                    })
                    .build()
                INSTANCE = instance
                return instance
            }
        }

        /** First-run content: a few starter duas and the default tags. */
        private suspend fun seedDefaults() {
            try {
                val dhikrDao = INSTANCE?.dhikrDao()
                if (dhikrDao != null) {
                    val starters = listOf(
                        starter("سؤال العفو والعافية", "اللهم إنك عفو تحب العفو فاعف عني", "10:00"),
                        starter("الثبات على الدين", "يا مقلب القلوب ثبت قلبي على دينك", "14:00"),
                        starter("خير الدنيا والآخرة", "اللهم آتنا في الدنيا حسنة وفي الآخرة حسنة وقنا عذاب النار", "18:00"),
                        starter("سؤال الهدى والتقى", "اللهم إني أسألك الهدى والتقى والعفاف والغنى", "08:00"),
                        starter("الإعانة على الذكر", "اللهم أعني على ذكرك وشكرك وحسن عبادتك", "20:00")
                    )
                    callSuspend<Unit> { dhikrDao.insertAll(starters, it) }
                }
                val tagDao = INSTANCE?.tagDao() ?: return
                listOf(
                    Tag(0L, "أذكار الصباح", "#008080"),
                    Tag(0L, "أذكار المساء", "#800080"),
                    Tag(0L, "أذكار النوم", "#1E3A8A"),
                    Tag(0L, "أدعية عامة", "#059669")
                ).forEach { tag -> callSuspend<Long> { tagDao.insertTag(tag, it) } }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        /** The DAOs are Java interfaces, so their Continuation parameter is passed by hand. */
        private suspend fun <T> callSuspend(block: (Continuation<T>) -> Any?): T =
            suspendCoroutineUninterceptedOrReturn { block(it) }

        private fun starter(title: String, content: String, time: String) =
            Dhikr(0, title, content, false, listOf(time), true, 0, 0L)

        private const val HISN_ITEM_SQL =
            "CREATE TABLE IF NOT EXISTS `hisn_item` (`id` INTEGER NOT NULL, `chapterId` INTEGER NOT NULL, `order` INTEGER NOT NULL, `text` TEXT NOT NULL, `count` INTEGER NOT NULL, `fadl` TEXT NOT NULL, `source` TEXT NOT NULL, `hokm` TEXT NOT NULL, PRIMARY KEY(`id`))"
    }
}
