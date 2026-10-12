.class public final Lcom/example/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;
.super Landroidx/room/RoomOpenDelegate;
.source "AppDatabase_Impl.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/data/AppDatabase_Impl;->createOpenDelegate()Landroidx/room/RoomOpenDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/example/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1",
        "Landroidx/room/RoomOpenDelegate;",
        "createAllTables",
        "",
        "connection",
        "Landroidx/sqlite/SQLiteConnection;",
        "dropAllTables",
        "onCreate",
        "onOpen",
        "onPreMigrate",
        "onPostMigrate",
        "onValidateSchema",
        "Landroidx/room/RoomOpenDelegate$ValidationResult;",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/example/data/AppDatabase_Impl;


# direct methods
.method constructor <init>(Lcom/example/data/AppDatabase_Impl;)V
    .locals 3
    .param p1, "$receiver"    # Lcom/example/data/AppDatabase_Impl;

    iput-object p1, p0, Lcom/example/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;->this$0:Lcom/example/data/AppDatabase_Impl;

    .line 47
    nop

    .line 48
    nop

    .line 47
    const/16 v0, 0x8

    const-string v1, "60976a860ef541fdb8dbbcef870846bb"

    const-string v2, "ffdd9bb93b8df39ebcfb05ab32ef0022"

    invoke-direct {p0, v0, v1, v2}, Landroidx/room/RoomOpenDelegate;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAllTables(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1
    .param p1, "connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    const-string v0, "CREATE TABLE IF NOT EXISTS `dhikr_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `isFavorite` INTEGER NOT NULL, `reminderTimes` TEXT NOT NULL, `isEnabled` INTEGER NOT NULL, `readCount` INTEGER NOT NULL, `lastReadTime` INTEGER NOT NULL)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 51
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_dhikr_table_isFavorite` ON `dhikr_table` (`isFavorite`)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 52
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_dhikr_table_isEnabled` ON `dhikr_table` (`isEnabled`)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 53
    const-string v0, "CREATE TABLE IF NOT EXISTS `tag_table` (`tagId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `colorHex` TEXT NOT NULL)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 54
    const-string v0, "CREATE TABLE IF NOT EXISTS `dhikr_tag_cross_ref` (`dhikrId` INTEGER NOT NULL, `tagId` INTEGER NOT NULL, PRIMARY KEY(`dhikrId`, `tagId`))"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 55
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_dhikr_tag_cross_ref_dhikrId` ON `dhikr_tag_cross_ref` (`dhikrId`)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 56
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_dhikr_tag_cross_ref_tagId` ON `dhikr_tag_cross_ref` (`tagId`)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 57
    const-string v0, "CREATE TABLE IF NOT EXISTS `dhikr_history` (`historyId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dhikrId` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `dateString` TEXT NOT NULL)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 58
    const-string v0, "CREATE TABLE IF NOT EXISTS `hisn_chapter` (`id` INTEGER NOT NULL, `order` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 59
    const-string v0, "CREATE TABLE IF NOT EXISTS `hisn_item` (`id` INTEGER NOT NULL, `chapterId` INTEGER NOT NULL, `order` INTEGER NOT NULL, `text` TEXT NOT NULL, `count` INTEGER NOT NULL, `fadl` TEXT NOT NULL, `source` TEXT NOT NULL, `hokm` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 60
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_hisn_item_chapterId` ON `hisn_item` (`chapterId`)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 61
    const-string v0, "CREATE TABLE IF NOT EXISTS `hisn_favorite` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chapterId` INTEGER NOT NULL, `itemId` INTEGER NOT NULL)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 62
    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_hisn_favorite_chapterId_itemId` ON `hisn_favorite` (`chapterId`, `itemId`)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 63
    const-string v0, "CREATE TABLE IF NOT EXISTS `hisn_read` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chapterId` INTEGER NOT NULL, `dateString` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 64
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 65
    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'60976a860ef541fdb8dbbcef870846bb\')"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 66
    return-void
.end method

.method public dropAllTables(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1
    .param p1, "connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    const-string v0, "DROP TABLE IF EXISTS `dhikr_table`"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 70
    const-string v0, "DROP TABLE IF EXISTS `tag_table`"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 71
    const-string v0, "DROP TABLE IF EXISTS `dhikr_tag_cross_ref`"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 72
    const-string v0, "DROP TABLE IF EXISTS `dhikr_history`"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 73
    const-string v0, "DROP TABLE IF EXISTS `hisn_chapter`"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 74
    const-string v0, "DROP TABLE IF EXISTS `hisn_item`"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 75
    const-string v0, "DROP TABLE IF EXISTS `hisn_favorite`"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 76
    const-string v0, "DROP TABLE IF EXISTS `hisn_read`"

    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 77
    return-void
.end method

.method public onCreate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1
    .param p1, "connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    return-void
.end method

.method public onOpen(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1
    .param p1, "connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/example/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;->this$0:Lcom/example/data/AppDatabase_Impl;

    invoke-static {v0, p1}, Lcom/example/data/AppDatabase_Impl;->access$internalInitInvalidationTracker(Lcom/example/data/AppDatabase_Impl;Landroidx/sqlite/SQLiteConnection;)V

    .line 84
    return-void
.end method

.method public onPostMigrate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1
    .param p1, "connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    return-void
.end method

.method public onPreMigrate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1
    .param p1, "connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-static {p1}, Landroidx/room/util/DBUtil;->dropFtsSyncTriggers(Landroidx/sqlite/SQLiteConnection;)V

    .line 88
    return-void
.end method

.method public onValidateSchema(Landroidx/sqlite/SQLiteConnection;)Landroidx/room/RoomOpenDelegate$ValidationResult;
    .locals 52
    .param p1, "connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v0, p1

    const-string v1, "connection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 96
    .local v1, "_columnsDhikrTable":Ljava/util/Map;
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 97
    nop

    .line 96
    const-string v3, "id"

    const-string v4, "INTEGER"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "id"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    new-instance v4, Landroidx/room/util/TableInfo$Column;

    .line 99
    nop

    .line 98
    const-string v5, "title"

    const-string v6, "TEXT"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "title"

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    new-instance v5, Landroidx/room/util/TableInfo$Column;

    .line 101
    nop

    .line 100
    const-string v6, "content"

    const-string v7, "TEXT"

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "content"

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    new-instance v6, Landroidx/room/util/TableInfo$Column;

    .line 103
    nop

    .line 102
    const-string v7, "isFavorite"

    const-string v8, "INTEGER"

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-direct/range {v6 .. v12}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "isFavorite"

    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 105
    nop

    .line 104
    const-string v8, "reminderTimes"

    const-string v9, "TEXT"

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "reminderTimes"

    invoke-interface {v1, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 107
    nop

    .line 106
    const-string v9, "isEnabled"

    const-string v10, "INTEGER"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "isEnabled"

    invoke-interface {v1, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    new-instance v9, Landroidx/room/util/TableInfo$Column;

    .line 109
    nop

    .line 108
    const-string v10, "readCount"

    const-string v11, "INTEGER"

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-direct/range {v9 .. v15}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "readCount"

    invoke-interface {v1, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    new-instance v10, Landroidx/room/util/TableInfo$Column;

    .line 111
    nop

    .line 110
    const-string v11, "lastReadTime"

    const-string v12, "INTEGER"

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "lastReadTime"

    invoke-interface {v1, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v5, Ljava/util/Set;

    .line 113
    .local v5, "_foreignKeysDhikrTable":Ljava/util/Set;
    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v6, Ljava/util/Set;

    .line 114
    .local v6, "_indicesDhikrTable":Ljava/util/Set;
    new-instance v7, Landroidx/room/util/TableInfo$Index;

    .line 115
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v8, "ASC"

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    .line 114
    const-string v10, "index_dhikr_table_isFavorite"

    const/4 v11, 0x0

    invoke-direct {v7, v10, v11, v2, v9}, Landroidx/room/util/TableInfo$Index;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 116
    new-instance v2, Landroidx/room/util/TableInfo$Index;

    .line 117
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 116
    const-string v9, "index_dhikr_table_isEnabled"

    invoke-direct {v2, v9, v11, v4, v7}, Landroidx/room/util/TableInfo$Index;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v6, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 118
    new-instance v2, Landroidx/room/util/TableInfo;

    .line 119
    nop

    .line 118
    const-string v4, "dhikr_table"

    invoke-direct {v2, v4, v1, v5, v6}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 120
    .local v2, "_infoDhikrTable":Landroidx/room/util/TableInfo;
    sget-object v7, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    invoke-virtual {v7, v0, v4}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    move-result-object v4

    .line 121
    .local v4, "_existingDhikrTable":Landroidx/room/util/TableInfo;
    invoke-virtual {v2, v4}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v9, "\n Found:\n"

    if-nez v7, :cond_0

    .line 122
    new-instance v3, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 125
    nop

    .line 128
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "dhikr_table(com.example.data.Dhikr).\n Expected:\n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 122
    invoke-direct {v3, v11, v7}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v3

    .line 130
    :cond_0
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v7, Ljava/util/Map;

    .line 131
    .local v7, "_columnsTagTable":Ljava/util/Map;
    new-instance v12, Landroidx/room/util/TableInfo$Column;

    .line 132
    nop

    .line 131
    const-string v13, "tagId"

    const-string v14, "INTEGER"

    const/4 v15, 0x1

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "tagId"

    invoke-interface {v7, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    new-instance v13, Landroidx/room/util/TableInfo$Column;

    .line 134
    nop

    .line 133
    const-string v14, "name"

    const-string v15, "TEXT"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v12, "name"

    invoke-interface {v7, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    new-instance v14, Landroidx/room/util/TableInfo$Column;

    .line 136
    nop

    .line 135
    const-string v15, "colorHex"

    const-string v16, "TEXT"

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v13, "colorHex"

    invoke-interface {v7, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    new-instance v13, Ljava/util/LinkedHashSet;

    invoke-direct {v13}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v13, Ljava/util/Set;

    .line 138
    .local v13, "_foreignKeysTagTable":Ljava/util/Set;
    new-instance v14, Ljava/util/LinkedHashSet;

    invoke-direct {v14}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v14, Ljava/util/Set;

    .line 139
    .local v14, "_indicesTagTable":Ljava/util/Set;
    new-instance v15, Landroidx/room/util/TableInfo;

    .line 140
    nop

    .line 139
    const-string v11, "tag_table"

    invoke-direct {v15, v11, v7, v13, v14}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 141
    .local v15, "_infoTagTable":Landroidx/room/util/TableInfo;
    move-object/from16 v17, v1

    .end local v1    # "_columnsDhikrTable":Ljava/util/Map;
    .local v17, "_columnsDhikrTable":Ljava/util/Map;
    sget-object v1, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    invoke-virtual {v1, v0, v11}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    move-result-object v1

    .line 142
    .local v1, "_existingTagTable":Landroidx/room/util/TableInfo;
    invoke-virtual {v15, v1}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 143
    new-instance v3, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 146
    nop

    .line 149
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "tag_table(com.example.data.Tag).\n Expected:\n"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 143
    const/4 v9, 0x0

    invoke-direct {v3, v9, v8}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v3

    .line 151
    :cond_1
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v11, Ljava/util/Map;

    .line 152
    .local v11, "_columnsDhikrTagCrossRef":Ljava/util/Map;
    new-instance v18, Landroidx/room/util/TableInfo$Column;

    .line 153
    nop

    .line 152
    const-string v19, "dhikrId"

    const-string v20, "INTEGER"

    const/16 v21, 0x1

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-direct/range {v18 .. v24}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v19, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v2

    .end local v1    # "_existingTagTable":Landroidx/room/util/TableInfo;
    .end local v2    # "_infoDhikrTable":Landroidx/room/util/TableInfo;
    .local v18, "_infoDhikrTable":Landroidx/room/util/TableInfo;
    .local v19, "_existingTagTable":Landroidx/room/util/TableInfo;
    const-string v2, "dhikrId"

    invoke-interface {v11, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    new-instance v20, Landroidx/room/util/TableInfo$Column;

    .line 155
    nop

    .line 154
    const-string v21, "tagId"

    const-string v22, "INTEGER"

    const/16 v23, 0x1

    const/16 v24, 0x2

    const/16 v25, 0x0

    const/16 v26, 0x1

    invoke-direct/range {v20 .. v26}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v1, v20

    invoke-interface {v11, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v1, Ljava/util/Set;

    .line 157
    .local v1, "_foreignKeysDhikrTagCrossRef":Ljava/util/Set;
    new-instance v20, Ljava/util/LinkedHashSet;

    invoke-direct/range {v20 .. v20}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v21, v4

    .end local v4    # "_existingDhikrTable":Landroidx/room/util/TableInfo;
    .local v21, "_existingDhikrTable":Landroidx/room/util/TableInfo;
    move-object/from16 v4, v20

    check-cast v4, Ljava/util/Set;

    .line 158
    .local v4, "_indicesDhikrTagCrossRef":Ljava/util/Set;
    move-object/from16 v20, v5

    .end local v5    # "_foreignKeysDhikrTable":Ljava/util/Set;
    .local v20, "_foreignKeysDhikrTable":Ljava/util/Set;
    new-instance v5, Landroidx/room/util/TableInfo$Index;

    .line 159
    move-object/from16 v22, v6

    .end local v6    # "_indicesDhikrTable":Ljava/util/Set;
    .local v22, "_indicesDhikrTable":Ljava/util/Set;
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object/from16 v23, v7

    .end local v7    # "_columnsTagTable":Ljava/util/Map;
    .local v23, "_columnsTagTable":Ljava/util/Map;
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 158
    move-object/from16 v24, v10

    const-string v10, "index_dhikr_tag_cross_ref_dhikrId"

    move-object/from16 v25, v13

    const/4 v13, 0x0

    .end local v13    # "_foreignKeysTagTable":Ljava/util/Set;
    .local v25, "_foreignKeysTagTable":Ljava/util/Set;
    invoke-direct {v5, v10, v13, v6, v7}, Landroidx/room/util/TableInfo$Index;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 160
    new-instance v5, Landroidx/room/util/TableInfo$Index;

    .line 161
    invoke-static/range {v24 .. v24}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 160
    const-string v10, "index_dhikr_tag_cross_ref_tagId"

    invoke-direct {v5, v10, v13, v6, v7}, Landroidx/room/util/TableInfo$Index;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 162
    new-instance v5, Landroidx/room/util/TableInfo;

    .line 163
    nop

    .line 162
    const-string v6, "dhikr_tag_cross_ref"

    invoke-direct {v5, v6, v11, v1, v4}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 164
    .local v5, "_infoDhikrTagCrossRef":Landroidx/room/util/TableInfo;
    sget-object v7, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    invoke-virtual {v7, v0, v6}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    move-result-object v6

    .line 165
    .local v6, "_existingDhikrTagCrossRef":Landroidx/room/util/TableInfo;
    invoke-virtual {v5, v6}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 166
    new-instance v2, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 169
    nop

    .line 172
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "dhikr_tag_cross_ref(com.example.data.DhikrTagCrossRef).\n Expected:\n"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 166
    const/4 v9, 0x0

    invoke-direct {v2, v9, v3}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v2

    .line 174
    :cond_2
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v7, Ljava/util/Map;

    .line 175
    .local v7, "_columnsDhikrHistory":Ljava/util/Map;
    new-instance v26, Landroidx/room/util/TableInfo$Column;

    .line 176
    nop

    .line 175
    const-string v27, "historyId"

    const-string v28, "INTEGER"

    const/16 v29, 0x1

    const/16 v30, 0x1

    const/16 v31, 0x0

    const/16 v32, 0x1

    invoke-direct/range {v26 .. v32}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v10, v26

    const-string v13, "historyId"

    invoke-interface {v7, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    new-instance v26, Landroidx/room/util/TableInfo$Column;

    .line 178
    nop

    .line 177
    const-string v27, "dhikrId"

    const-string v28, "INTEGER"

    const/16 v30, 0x0

    invoke-direct/range {v26 .. v32}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v10, v26

    invoke-interface {v7, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    new-instance v26, Landroidx/room/util/TableInfo$Column;

    .line 180
    nop

    .line 179
    const-string v27, "timestamp"

    const-string v28, "INTEGER"

    invoke-direct/range {v26 .. v32}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v2, v26

    const-string v10, "timestamp"

    invoke-interface {v7, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    new-instance v26, Landroidx/room/util/TableInfo$Column;

    .line 182
    nop

    .line 181
    const-string v27, "dateString"

    const-string v28, "TEXT"

    invoke-direct/range {v26 .. v32}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v2, v26

    const-string v13, "dateString"

    invoke-interface {v7, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v2, Ljava/util/Set;

    .line 184
    .local v2, "_foreignKeysDhikrHistory":Ljava/util/Set;
    new-instance v24, Ljava/util/LinkedHashSet;

    invoke-direct/range {v24 .. v24}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v26, v1

    .end local v1    # "_foreignKeysDhikrTagCrossRef":Ljava/util/Set;
    .local v26, "_foreignKeysDhikrTagCrossRef":Ljava/util/Set;
    move-object/from16 v1, v24

    check-cast v1, Ljava/util/Set;

    .line 185
    .local v1, "_indicesDhikrHistory":Ljava/util/Set;
    move-object/from16 v24, v4

    .end local v4    # "_indicesDhikrTagCrossRef":Ljava/util/Set;
    .local v24, "_indicesDhikrTagCrossRef":Ljava/util/Set;
    new-instance v4, Landroidx/room/util/TableInfo;

    .line 186
    nop

    .line 185
    move-object/from16 v27, v5

    .end local v5    # "_infoDhikrTagCrossRef":Landroidx/room/util/TableInfo;
    .local v27, "_infoDhikrTagCrossRef":Landroidx/room/util/TableInfo;
    const-string v5, "dhikr_history"

    invoke-direct {v4, v5, v7, v2, v1}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 187
    .local v4, "_infoDhikrHistory":Landroidx/room/util/TableInfo;
    move-object/from16 v28, v1

    .end local v1    # "_indicesDhikrHistory":Ljava/util/Set;
    .local v28, "_indicesDhikrHistory":Ljava/util/Set;
    sget-object v1, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    invoke-virtual {v1, v0, v5}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    move-result-object v1

    .line 188
    .local v1, "_existingDhikrHistory":Landroidx/room/util/TableInfo;
    invoke-virtual {v4, v1}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 189
    new-instance v3, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 192
    nop

    .line 195
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "dhikr_history(com.example.data.DhikrHistory).\n Expected:\n"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 189
    const/4 v9, 0x0

    invoke-direct {v3, v9, v5}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v3

    .line 197
    :cond_3
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v5, Ljava/util/Map;

    .line 198
    .local v5, "_columnsHisnChapter":Ljava/util/Map;
    new-instance v29, Landroidx/room/util/TableInfo$Column;

    .line 199
    nop

    .line 198
    const-string v30, "id"

    const-string v31, "INTEGER"

    const/16 v32, 0x1

    const/16 v33, 0x1

    const/16 v34, 0x0

    const/16 v35, 0x1

    invoke-direct/range {v29 .. v35}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v30, v1

    move-object/from16 v1, v29

    .end local v1    # "_existingDhikrHistory":Landroidx/room/util/TableInfo;
    .local v30, "_existingDhikrHistory":Landroidx/room/util/TableInfo;
    invoke-interface {v5, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    new-instance v31, Landroidx/room/util/TableInfo$Column;

    .line 201
    nop

    .line 200
    const-string v32, "order"

    const-string v33, "INTEGER"

    const/16 v34, 0x1

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x1

    invoke-direct/range {v31 .. v37}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v29, v2

    move-object/from16 v1, v31

    .end local v2    # "_foreignKeysDhikrHistory":Ljava/util/Set;
    .local v29, "_foreignKeysDhikrHistory":Ljava/util/Set;
    const-string v2, "order"

    invoke-interface {v5, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    new-instance v31, Landroidx/room/util/TableInfo$Column;

    .line 203
    nop

    .line 202
    const-string v32, "name"

    const-string v33, "TEXT"

    invoke-direct/range {v31 .. v37}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v1, v31

    invoke-interface {v5, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v1, Ljava/util/Set;

    .line 205
    .local v1, "_foreignKeysHisnChapter":Ljava/util/Set;
    new-instance v12, Ljava/util/LinkedHashSet;

    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v12, Ljava/util/Set;

    .line 206
    .local v12, "_indicesHisnChapter":Ljava/util/Set;
    move-object/from16 v31, v4

    .end local v4    # "_infoDhikrHistory":Landroidx/room/util/TableInfo;
    .local v31, "_infoDhikrHistory":Landroidx/room/util/TableInfo;
    new-instance v4, Landroidx/room/util/TableInfo;

    .line 207
    nop

    .line 206
    move-object/from16 v32, v6

    .end local v6    # "_existingDhikrTagCrossRef":Landroidx/room/util/TableInfo;
    .local v32, "_existingDhikrTagCrossRef":Landroidx/room/util/TableInfo;
    const-string v6, "hisn_chapter"

    invoke-direct {v4, v6, v5, v1, v12}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 208
    .local v4, "_infoHisnChapter":Landroidx/room/util/TableInfo;
    move-object/from16 v33, v1

    .end local v1    # "_foreignKeysHisnChapter":Ljava/util/Set;
    .local v33, "_foreignKeysHisnChapter":Ljava/util/Set;
    sget-object v1, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    invoke-virtual {v1, v0, v6}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    move-result-object v1

    .line 209
    .local v1, "_existingHisnChapter":Landroidx/room/util/TableInfo;
    invoke-virtual {v4, v1}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 210
    new-instance v2, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 213
    nop

    .line 216
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "hisn_chapter(com.example.data.HisnChapter).\n Expected:\n"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 210
    const/4 v9, 0x0

    invoke-direct {v2, v9, v3}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v2

    .line 218
    :cond_4
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v6, Ljava/util/Map;

    .line 219
    .local v6, "_columnsHisnItem":Ljava/util/Map;
    new-instance v34, Landroidx/room/util/TableInfo$Column;

    .line 220
    nop

    .line 219
    const/16 v37, 0x1

    const/16 v38, 0x1

    const/16 v39, 0x0

    const/16 v40, 0x1

    const-string v35, "id"

    const-string v36, "INTEGER"

    invoke-direct/range {v34 .. v40}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v35, v1

    move-object/from16 v1, v34

    .end local v1    # "_existingHisnChapter":Landroidx/room/util/TableInfo;
    .local v35, "_existingHisnChapter":Landroidx/room/util/TableInfo;
    invoke-interface {v6, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    new-instance v36, Landroidx/room/util/TableInfo$Column;

    .line 222
    nop

    .line 221
    const/16 v39, 0x1

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x1

    const-string v37, "chapterId"

    const-string v38, "INTEGER"

    invoke-direct/range {v36 .. v42}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v34, v4

    move-object/from16 v1, v36

    .end local v4    # "_infoHisnChapter":Landroidx/room/util/TableInfo;
    .local v34, "_infoHisnChapter":Landroidx/room/util/TableInfo;
    const-string v4, "chapterId"

    invoke-interface {v6, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    new-instance v36, Landroidx/room/util/TableInfo$Column;

    .line 224
    nop

    .line 223
    const-string v37, "order"

    const-string v38, "INTEGER"

    invoke-direct/range {v36 .. v42}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v1, v36

    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    new-instance v36, Landroidx/room/util/TableInfo$Column;

    .line 226
    nop

    .line 225
    const-string v37, "text"

    const-string v38, "TEXT"

    invoke-direct/range {v36 .. v42}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v1, v36

    const-string v2, "text"

    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    new-instance v36, Landroidx/room/util/TableInfo$Column;

    .line 228
    nop

    .line 227
    const-string v37, "count"

    const-string v38, "INTEGER"

    invoke-direct/range {v36 .. v42}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v1, v36

    const-string v2, "count"

    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    new-instance v36, Landroidx/room/util/TableInfo$Column;

    .line 230
    nop

    .line 229
    const-string v37, "fadl"

    const-string v38, "TEXT"

    invoke-direct/range {v36 .. v42}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v1, v36

    const-string v2, "fadl"

    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    new-instance v36, Landroidx/room/util/TableInfo$Column;

    .line 232
    nop

    .line 231
    const-string v37, "source"

    const-string v38, "TEXT"

    invoke-direct/range {v36 .. v42}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v1, v36

    const-string v2, "source"

    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    new-instance v36, Landroidx/room/util/TableInfo$Column;

    .line 234
    nop

    .line 233
    const-string v37, "hokm"

    const-string v38, "TEXT"

    invoke-direct/range {v36 .. v42}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v1, v36

    const-string v2, "hokm"

    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v1, Ljava/util/Set;

    .line 236
    .local v1, "_foreignKeysHisnItem":Ljava/util/Set;
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v2, Ljava/util/Set;

    .line 237
    .local v2, "_indicesHisnItem":Ljava/util/Set;
    move-object/from16 v36, v5

    .end local v5    # "_columnsHisnChapter":Ljava/util/Map;
    .local v36, "_columnsHisnChapter":Ljava/util/Map;
    new-instance v5, Landroidx/room/util/TableInfo$Index;

    .line 238
    move-object/from16 v37, v7

    .end local v7    # "_columnsDhikrHistory":Ljava/util/Map;
    .local v37, "_columnsDhikrHistory":Ljava/util/Map;
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object/from16 v38, v11

    .end local v11    # "_columnsDhikrTagCrossRef":Ljava/util/Map;
    .local v38, "_columnsDhikrTagCrossRef":Ljava/util/Map;
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    .line 237
    move-object/from16 v39, v12

    .end local v12    # "_indicesHisnChapter":Ljava/util/Set;
    .local v39, "_indicesHisnChapter":Ljava/util/Set;
    const-string v12, "index_hisn_item_chapterId"

    move-object/from16 v40, v14

    const/4 v14, 0x0

    .end local v14    # "_indicesTagTable":Ljava/util/Set;
    .local v40, "_indicesTagTable":Ljava/util/Set;
    invoke-direct {v5, v12, v14, v7, v11}, Landroidx/room/util/TableInfo$Index;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 239
    new-instance v5, Landroidx/room/util/TableInfo;

    .line 240
    nop

    .line 239
    const-string v7, "hisn_item"

    invoke-direct {v5, v7, v6, v1, v2}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 241
    .local v5, "_infoHisnItem":Landroidx/room/util/TableInfo;
    sget-object v11, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    invoke-virtual {v11, v0, v7}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    move-result-object v7

    .line 242
    .local v7, "_existingHisnItem":Landroidx/room/util/TableInfo;
    invoke-virtual {v5, v7}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    .line 243
    new-instance v3, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 246
    nop

    .line 249
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "hisn_item(com.example.data.HisnItem).\n Expected:\n"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 243
    const/4 v9, 0x0

    invoke-direct {v3, v9, v4}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v3

    .line 251
    :cond_5
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v11, Ljava/util/Map;

    .line 252
    .local v11, "_columnsHisnFavorite":Ljava/util/Map;
    new-instance v41, Landroidx/room/util/TableInfo$Column;

    .line 253
    nop

    .line 252
    const-string v42, "id"

    const-string v43, "INTEGER"

    const/16 v44, 0x1

    const/16 v45, 0x1

    const/16 v46, 0x0

    const/16 v47, 0x1

    invoke-direct/range {v41 .. v47}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v12, v41

    invoke-interface {v11, v3, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    new-instance v41, Landroidx/room/util/TableInfo$Column;

    .line 255
    nop

    .line 254
    const-string v42, "chapterId"

    const-string v43, "INTEGER"

    const/16 v45, 0x0

    invoke-direct/range {v41 .. v47}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v12, v41

    invoke-interface {v11, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    new-instance v41, Landroidx/room/util/TableInfo$Column;

    .line 257
    nop

    .line 256
    const-string v42, "itemId"

    const-string v43, "INTEGER"

    invoke-direct/range {v41 .. v47}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v12, v41

    const-string v14, "itemId"

    invoke-interface {v11, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    new-instance v12, Ljava/util/LinkedHashSet;

    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v12, Ljava/util/Set;

    .line 259
    .local v12, "_foreignKeysHisnFavorite":Ljava/util/Set;
    new-instance v41, Ljava/util/LinkedHashSet;

    invoke-direct/range {v41 .. v41}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v42, v1

    .end local v1    # "_foreignKeysHisnItem":Ljava/util/Set;
    .local v42, "_foreignKeysHisnItem":Ljava/util/Set;
    move-object/from16 v1, v41

    check-cast v1, Ljava/util/Set;

    .line 260
    .local v1, "_indicesHisnFavorite":Ljava/util/Set;
    move-object/from16 v41, v2

    .end local v2    # "_indicesHisnItem":Ljava/util/Set;
    .local v41, "_indicesHisnItem":Ljava/util/Set;
    new-instance v2, Landroidx/room/util/TableInfo$Index;

    .line 261
    filled-new-array {v4, v14}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    filled-new-array {v8, v8}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 260
    move-object/from16 v43, v5

    .end local v5    # "_infoHisnItem":Landroidx/room/util/TableInfo;
    .local v43, "_infoHisnItem":Landroidx/room/util/TableInfo;
    const-string v5, "index_hisn_favorite_chapterId_itemId"

    move-object/from16 v44, v6

    .end local v6    # "_columnsHisnItem":Ljava/util/Map;
    .local v44, "_columnsHisnItem":Ljava/util/Map;
    const/4 v6, 0x1

    invoke-direct {v2, v5, v6, v14, v8}, Landroidx/room/util/TableInfo$Index;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 262
    new-instance v2, Landroidx/room/util/TableInfo;

    .line 263
    nop

    .line 262
    const-string v5, "hisn_favorite"

    invoke-direct {v2, v5, v11, v12, v1}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 264
    .local v2, "_infoHisnFavorite":Landroidx/room/util/TableInfo;
    sget-object v8, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    invoke-virtual {v8, v0, v5}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    move-result-object v5

    .line 265
    .local v5, "_existingHisnFavorite":Landroidx/room/util/TableInfo;
    invoke-virtual {v2, v5}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    .line 266
    new-instance v3, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 269
    nop

    .line 272
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "hisn_favorite(com.example.data.HisnFavorite).\n Expected:\n"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 266
    const/4 v9, 0x0

    invoke-direct {v3, v9, v4}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v3

    .line 274
    :cond_6
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v8, Ljava/util/Map;

    .line 275
    .local v8, "_columnsHisnRead":Ljava/util/Map;
    new-instance v45, Landroidx/room/util/TableInfo$Column;

    .line 276
    nop

    .line 275
    const-string v46, "id"

    const-string v47, "INTEGER"

    const/16 v48, 0x1

    const/16 v49, 0x1

    const/16 v50, 0x0

    const/16 v51, 0x1

    invoke-direct/range {v45 .. v51}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v14, v45

    invoke-interface {v8, v3, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    new-instance v45, Landroidx/room/util/TableInfo$Column;

    .line 278
    nop

    .line 277
    const-string v46, "chapterId"

    const-string v47, "INTEGER"

    const/16 v49, 0x0

    invoke-direct/range {v45 .. v51}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v3, v45

    invoke-interface {v8, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    new-instance v45, Landroidx/room/util/TableInfo$Column;

    .line 280
    nop

    .line 279
    const-string v46, "dateString"

    const-string v47, "TEXT"

    invoke-direct/range {v45 .. v51}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v3, v45

    invoke-interface {v8, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    new-instance v45, Landroidx/room/util/TableInfo$Column;

    .line 282
    nop

    .line 281
    const-string v46, "timestamp"

    const-string v47, "INTEGER"

    invoke-direct/range {v45 .. v51}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    move-object/from16 v3, v45

    invoke-interface {v8, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    .line 284
    .local v3, "_foreignKeysHisnRead":Ljava/util/Set;
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v4, Ljava/util/Set;

    .line 285
    .local v4, "_indicesHisnRead":Ljava/util/Set;
    new-instance v10, Landroidx/room/util/TableInfo;

    .line 286
    nop

    .line 285
    const-string v13, "hisn_read"

    invoke-direct {v10, v13, v8, v3, v4}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 287
    .local v10, "_infoHisnRead":Landroidx/room/util/TableInfo;
    sget-object v13, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    const-string v14, "hisn_read"

    invoke-virtual {v13, v0, v14}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    move-result-object v13

    .line 288
    .local v13, "_existingHisnRead":Landroidx/room/util/TableInfo;
    invoke-virtual {v10, v13}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    .line 289
    new-instance v6, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 292
    nop

    .line 295
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "hisn_read(com.example.data.HisnRead).\n Expected:\n"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 289
    const/4 v9, 0x0

    invoke-direct {v6, v9, v0}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v6

    .line 297
    :cond_7
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    const/4 v9, 0x0

    invoke-direct {v0, v6, v9}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
