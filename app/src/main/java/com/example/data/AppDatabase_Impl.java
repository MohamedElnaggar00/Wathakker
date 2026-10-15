package com.example.data;

import androidx.autofill.HintConstants;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: AppDatabase_Impl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00160\u0014H\u0014J\u0016\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u00150\u0018H\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u001a\u0010\u001c\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0015\u0012\u0004\u0012\u00020\u00190\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/example/data/AppDatabase_Impl;", "Lcom/example/data/AppDatabase;", "<init>", "()V", "_dhikrDao", "Lkotlin/Lazy;", "Lcom/example/data/DhikrDao;", "_tagDao", "Lcom/example/data/TagDao;", "_historyDao", "Lcom/example/data/HistoryDao;", "_hisnDao", "Lcom/example/data/HisnDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "dhikrDao", "tagDao", "historyDao", "hisnDao", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public static final int $stable = 8;
    private final Lazy<DhikrDao> _dhikrDao = LazyKt.lazy(new Function0() { // from class: com.example.data.AppDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._dhikrDao$lambda$0(AppDatabase_Impl.this);
        }
    });
    private final Lazy<TagDao> _tagDao = LazyKt.lazy(new Function0() { // from class: com.example.data.AppDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._tagDao$lambda$1(AppDatabase_Impl.this);
        }
    });
    private final Lazy<HistoryDao> _historyDao = LazyKt.lazy(new Function0() { // from class: com.example.data.AppDatabase_Impl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._historyDao$lambda$2(AppDatabase_Impl.this);
        }
    });
    private final Lazy<HisnDao> _hisnDao = LazyKt.lazy(new Function0() { // from class: com.example.data.AppDatabase_Impl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._hisnDao$lambda$3(AppDatabase_Impl.this);
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final DhikrDao_Impl _dhikrDao$lambda$0(AppDatabase_Impl this$0) {
        return new DhikrDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final TagDao_Impl _tagDao$lambda$1(AppDatabase_Impl this$0) {
        return new TagDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final HistoryDao_Impl _historyDao$lambda$2(AppDatabase_Impl this$0) {
        return new HistoryDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final HisnDao_Impl _hisnDao$lambda$3(AppDatabase_Impl this$0) {
        return new HisnDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        RoomOpenDelegate _openDelegate = new RoomOpenDelegate() { // from class: com.example.data.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(8, "60976a860ef541fdb8dbbcef870846bb", "ffdd9bb93b8df39ebcfb05ab32ef0022");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `dhikr_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `isFavorite` INTEGER NOT NULL, `reminderTimes` TEXT NOT NULL, `isEnabled` INTEGER NOT NULL, `readCount` INTEGER NOT NULL, `lastReadTime` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_dhikr_table_isFavorite` ON `dhikr_table` (`isFavorite`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_dhikr_table_isEnabled` ON `dhikr_table` (`isEnabled`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `tag_table` (`tagId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `colorHex` TEXT NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `dhikr_tag_cross_ref` (`dhikrId` INTEGER NOT NULL, `tagId` INTEGER NOT NULL, PRIMARY KEY(`dhikrId`, `tagId`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_dhikr_tag_cross_ref_dhikrId` ON `dhikr_tag_cross_ref` (`dhikrId`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_dhikr_tag_cross_ref_tagId` ON `dhikr_tag_cross_ref` (`tagId`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `dhikr_history` (`historyId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dhikrId` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `dateString` TEXT NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `hisn_chapter` (`id` INTEGER NOT NULL, `order` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `hisn_item` (`id` INTEGER NOT NULL, `chapterId` INTEGER NOT NULL, `order` INTEGER NOT NULL, `text` TEXT NOT NULL, `count` INTEGER NOT NULL, `fadl` TEXT NOT NULL, `source` TEXT NOT NULL, `hokm` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_hisn_item_chapterId` ON `hisn_item` (`chapterId`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `hisn_favorite` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chapterId` INTEGER NOT NULL, `itemId` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_hisn_favorite_chapterId_itemId` ON `hisn_favorite` (`chapterId`, `itemId`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `hisn_read` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chapterId` INTEGER NOT NULL, `dateString` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '60976a860ef541fdb8dbbcef870846bb')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `dhikr_table`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `tag_table`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `dhikr_tag_cross_ref`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `dhikr_history`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `hisn_chapter`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `hisn_item`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `hisn_favorite`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `hisn_read`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                AppDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                Map _columnsDhikrTable = new LinkedHashMap();
                _columnsDhikrTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                _columnsDhikrTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
                _columnsDhikrTable.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, 1));
                _columnsDhikrTable.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, 1));
                _columnsDhikrTable.put("reminderTimes", new TableInfo.Column("reminderTimes", "TEXT", true, 0, null, 1));
                _columnsDhikrTable.put("isEnabled", new TableInfo.Column("isEnabled", "INTEGER", true, 0, null, 1));
                _columnsDhikrTable.put("readCount", new TableInfo.Column("readCount", "INTEGER", true, 0, null, 1));
                _columnsDhikrTable.put("lastReadTime", new TableInfo.Column("lastReadTime", "INTEGER", true, 0, null, 1));
                Set _foreignKeysDhikrTable = new LinkedHashSet();
                Set _indicesDhikrTable = new LinkedHashSet();
                _indicesDhikrTable.add(new TableInfo.Index("index_dhikr_table_isFavorite", false, CollectionsKt.listOf("isFavorite"), CollectionsKt.listOf("ASC")));
                _indicesDhikrTable.add(new TableInfo.Index("index_dhikr_table_isEnabled", false, CollectionsKt.listOf("isEnabled"), CollectionsKt.listOf("ASC")));
                TableInfo _infoDhikrTable = new TableInfo("dhikr_table", _columnsDhikrTable, _foreignKeysDhikrTable, _indicesDhikrTable);
                TableInfo _existingDhikrTable = TableInfo.INSTANCE.read(connection, "dhikr_table");
                if (!_infoDhikrTable.equals(_existingDhikrTable)) {
                    return new RoomOpenDelegate.ValidationResult(false, "dhikr_table(com.example.data.Dhikr).\n Expected:\n" + _infoDhikrTable + "\n Found:\n" + _existingDhikrTable);
                }
                Map _columnsTagTable = new LinkedHashMap();
                _columnsTagTable.put("tagId", new TableInfo.Column("tagId", "INTEGER", true, 1, null, 1));
                _columnsTagTable.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                _columnsTagTable.put("colorHex", new TableInfo.Column("colorHex", "TEXT", true, 0, null, 1));
                Set _foreignKeysTagTable = new LinkedHashSet();
                Set _indicesTagTable = new LinkedHashSet();
                TableInfo _infoTagTable = new TableInfo("tag_table", _columnsTagTable, _foreignKeysTagTable, _indicesTagTable);
                TableInfo _existingTagTable = TableInfo.INSTANCE.read(connection, "tag_table");
                if (!_infoTagTable.equals(_existingTagTable)) {
                    return new RoomOpenDelegate.ValidationResult(false, "tag_table(com.example.data.Tag).\n Expected:\n" + _infoTagTable + "\n Found:\n" + _existingTagTable);
                }
                Map _columnsDhikrTagCrossRef = new LinkedHashMap();
                _columnsDhikrTagCrossRef.put("dhikrId", new TableInfo.Column("dhikrId", "INTEGER", true, 1, null, 1));
                _columnsDhikrTagCrossRef.put("tagId", new TableInfo.Column("tagId", "INTEGER", true, 2, null, 1));
                Set _foreignKeysDhikrTagCrossRef = new LinkedHashSet();
                Set _indicesDhikrTagCrossRef = new LinkedHashSet();
                _indicesDhikrTagCrossRef.add(new TableInfo.Index("index_dhikr_tag_cross_ref_dhikrId", false, CollectionsKt.listOf("dhikrId"), CollectionsKt.listOf("ASC")));
                _indicesDhikrTagCrossRef.add(new TableInfo.Index("index_dhikr_tag_cross_ref_tagId", false, CollectionsKt.listOf("tagId"), CollectionsKt.listOf("ASC")));
                TableInfo _infoDhikrTagCrossRef = new TableInfo("dhikr_tag_cross_ref", _columnsDhikrTagCrossRef, _foreignKeysDhikrTagCrossRef, _indicesDhikrTagCrossRef);
                TableInfo _existingDhikrTagCrossRef = TableInfo.INSTANCE.read(connection, "dhikr_tag_cross_ref");
                if (!_infoDhikrTagCrossRef.equals(_existingDhikrTagCrossRef)) {
                    return new RoomOpenDelegate.ValidationResult(false, "dhikr_tag_cross_ref(com.example.data.DhikrTagCrossRef).\n Expected:\n" + _infoDhikrTagCrossRef + "\n Found:\n" + _existingDhikrTagCrossRef);
                }
                Map _columnsDhikrHistory = new LinkedHashMap();
                _columnsDhikrHistory.put("historyId", new TableInfo.Column("historyId", "INTEGER", true, 1, null, 1));
                _columnsDhikrHistory.put("dhikrId", new TableInfo.Column("dhikrId", "INTEGER", true, 0, null, 1));
                _columnsDhikrHistory.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                _columnsDhikrHistory.put("dateString", new TableInfo.Column("dateString", "TEXT", true, 0, null, 1));
                Set _foreignKeysDhikrHistory = new LinkedHashSet();
                Set _indicesDhikrHistory = new LinkedHashSet();
                TableInfo _infoDhikrHistory = new TableInfo("dhikr_history", _columnsDhikrHistory, _foreignKeysDhikrHistory, _indicesDhikrHistory);
                TableInfo _existingDhikrHistory = TableInfo.INSTANCE.read(connection, "dhikr_history");
                if (!_infoDhikrHistory.equals(_existingDhikrHistory)) {
                    return new RoomOpenDelegate.ValidationResult(false, "dhikr_history(com.example.data.DhikrHistory).\n Expected:\n" + _infoDhikrHistory + "\n Found:\n" + _existingDhikrHistory);
                }
                Map _columnsHisnChapter = new LinkedHashMap();
                _columnsHisnChapter.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                _columnsHisnChapter.put("order", new TableInfo.Column("order", "INTEGER", true, 0, null, 1));
                _columnsHisnChapter.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                Set _foreignKeysHisnChapter = new LinkedHashSet();
                Set _indicesHisnChapter = new LinkedHashSet();
                TableInfo _infoHisnChapter = new TableInfo("hisn_chapter", _columnsHisnChapter, _foreignKeysHisnChapter, _indicesHisnChapter);
                TableInfo _existingHisnChapter = TableInfo.INSTANCE.read(connection, "hisn_chapter");
                if (!_infoHisnChapter.equals(_existingHisnChapter)) {
                    return new RoomOpenDelegate.ValidationResult(false, "hisn_chapter(com.example.data.HisnChapter).\n Expected:\n" + _infoHisnChapter + "\n Found:\n" + _existingHisnChapter);
                }
                Map _columnsHisnItem = new LinkedHashMap();
                _columnsHisnItem.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                _columnsHisnItem.put("chapterId", new TableInfo.Column("chapterId", "INTEGER", true, 0, null, 1));
                _columnsHisnItem.put("order", new TableInfo.Column("order", "INTEGER", true, 0, null, 1));
                _columnsHisnItem.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, 1));
                _columnsHisnItem.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
                _columnsHisnItem.put("fadl", new TableInfo.Column("fadl", "TEXT", true, 0, null, 1));
                _columnsHisnItem.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, 1));
                _columnsHisnItem.put("hokm", new TableInfo.Column("hokm", "TEXT", true, 0, null, 1));
                Set _foreignKeysHisnItem = new LinkedHashSet();
                Set _indicesHisnItem = new LinkedHashSet();
                _indicesHisnItem.add(new TableInfo.Index("index_hisn_item_chapterId", false, CollectionsKt.listOf("chapterId"), CollectionsKt.listOf("ASC")));
                TableInfo _infoHisnItem = new TableInfo("hisn_item", _columnsHisnItem, _foreignKeysHisnItem, _indicesHisnItem);
                TableInfo _existingHisnItem = TableInfo.INSTANCE.read(connection, "hisn_item");
                if (!_infoHisnItem.equals(_existingHisnItem)) {
                    return new RoomOpenDelegate.ValidationResult(false, "hisn_item(com.example.data.HisnItem).\n Expected:\n" + _infoHisnItem + "\n Found:\n" + _existingHisnItem);
                }
                Map _columnsHisnFavorite = new LinkedHashMap();
                _columnsHisnFavorite.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                _columnsHisnFavorite.put("chapterId", new TableInfo.Column("chapterId", "INTEGER", true, 0, null, 1));
                _columnsHisnFavorite.put("itemId", new TableInfo.Column("itemId", "INTEGER", true, 0, null, 1));
                Set _foreignKeysHisnFavorite = new LinkedHashSet();
                Set _indicesHisnFavorite = new LinkedHashSet();
                _indicesHisnFavorite.add(new TableInfo.Index("index_hisn_favorite_chapterId_itemId", true, java.util.Arrays.asList(new String[]{"chapterId", "itemId"}), java.util.Arrays.asList(new String[]{"ASC", "ASC"})));
                TableInfo _infoHisnFavorite = new TableInfo("hisn_favorite", _columnsHisnFavorite, _foreignKeysHisnFavorite, _indicesHisnFavorite);
                TableInfo _existingHisnFavorite = TableInfo.INSTANCE.read(connection, "hisn_favorite");
                if (!_infoHisnFavorite.equals(_existingHisnFavorite)) {
                    return new RoomOpenDelegate.ValidationResult(false, "hisn_favorite(com.example.data.HisnFavorite).\n Expected:\n" + _infoHisnFavorite + "\n Found:\n" + _existingHisnFavorite);
                }
                Map _columnsHisnRead = new LinkedHashMap();
                _columnsHisnRead.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                _columnsHisnRead.put("chapterId", new TableInfo.Column("chapterId", "INTEGER", true, 0, null, 1));
                _columnsHisnRead.put("dateString", new TableInfo.Column("dateString", "TEXT", true, 0, null, 1));
                _columnsHisnRead.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                Set _foreignKeysHisnRead = new LinkedHashSet();
                Set _indicesHisnRead = new LinkedHashSet();
                TableInfo _infoHisnRead = new TableInfo("hisn_read", _columnsHisnRead, _foreignKeysHisnRead, _indicesHisnRead);
                TableInfo _existingHisnRead = TableInfo.INSTANCE.read(connection, "hisn_read");
                if (!_infoHisnRead.equals(_existingHisnRead)) {
                    return new RoomOpenDelegate.ValidationResult(false, "hisn_read(com.example.data.HisnRead).\n Expected:\n" + _infoHisnRead + "\n Found:\n" + _existingHisnRead);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
        return _openDelegate;
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        Map _shadowTablesMap = new LinkedHashMap();
        Map _viewTables = new LinkedHashMap();
        return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "dhikr_table", "tag_table", "dhikr_tag_cross_ref", "dhikr_history", "hisn_chapter", "hisn_item", "hisn_favorite", "hisn_read");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "dhikr_table", "tag_table", "dhikr_tag_cross_ref", "dhikr_history", "hisn_chapter", "hisn_item", "hisn_favorite", "hisn_read");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Map _typeConvertersMap = new LinkedHashMap();
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(DhikrDao.class), DhikrDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(TagDao.class), TagDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(HistoryDao.class), HistoryDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(HisnDao.class), HisnDao_Impl.INSTANCE.getRequiredConverters());
        return _typeConvertersMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set _autoMigrationSpecsSet = new LinkedHashSet();
        return _autoMigrationSpecsSet;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> createAutoMigrations(Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        List _autoMigrations = new ArrayList();
        return _autoMigrations;
    }

    @Override // com.example.data.AppDatabase
    public DhikrDao dhikrDao() {
        return this._dhikrDao.getValue();
    }

    @Override // com.example.data.AppDatabase
    public TagDao tagDao() {
        return this._tagDao.getValue();
    }

    @Override // com.example.data.AppDatabase
    public HistoryDao historyDao() {
        return this._historyDao.getValue();
    }

    @Override // com.example.data.AppDatabase
    public HisnDao hisnDao() {
        return this._hisnDao.getValue();
    }
}
