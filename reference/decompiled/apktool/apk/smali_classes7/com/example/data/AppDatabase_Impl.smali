.class public final Lcom/example/data/AppDatabase_Impl;
.super Lcom/example/data/AppDatabase;
.source "AppDatabase_Impl.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\r\u001a\u00020\u000eH\u0014J\u0008\u0010\u000f\u001a\u00020\u0010H\u0014J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0015\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00150\u00160\u0014H\u0014J\u0016\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00190\u00150\u0018H\u0016J*\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00162\u001a\u0010\u001c\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00190\u0015\u0012\u0004\u0012\u00020\u00190\u0014H\u0016J\u0008\u0010\u001d\u001a\u00020\u0006H\u0016J\u0008\u0010\u001e\u001a\u00020\u0008H\u0016J\u0008\u0010\u001f\u001a\u00020\nH\u0016J\u0008\u0010 \u001a\u00020\u000cH\u0016R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/example/data/AppDatabase_Impl;",
        "Lcom/example/data/AppDatabase;",
        "<init>",
        "()V",
        "_dhikrDao",
        "Lkotlin/Lazy;",
        "Lcom/example/data/DhikrDao;",
        "_tagDao",
        "Lcom/example/data/TagDao;",
        "_historyDao",
        "Lcom/example/data/HistoryDao;",
        "_hisnDao",
        "Lcom/example/data/HisnDao;",
        "createOpenDelegate",
        "Landroidx/room/RoomOpenDelegate;",
        "createInvalidationTracker",
        "Landroidx/room/InvalidationTracker;",
        "clearAllTables",
        "",
        "getRequiredTypeConverterClasses",
        "",
        "Lkotlin/reflect/KClass;",
        "",
        "getRequiredAutoMigrationSpecClasses",
        "",
        "Landroidx/room/migration/AutoMigrationSpec;",
        "createAutoMigrations",
        "Landroidx/room/migration/Migration;",
        "autoMigrationSpecs",
        "dhikrDao",
        "tagDao",
        "historyDao",
        "hisnDao",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final _dhikrDao:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lcom/example/data/DhikrDao;",
            ">;"
        }
    .end annotation
.end field

.field private final _hisnDao:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lcom/example/data/HisnDao;",
            ">;"
        }
    .end annotation
.end field

.field private final _historyDao:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lcom/example/data/HistoryDao;",
            ">;"
        }
    .end annotation
.end field

.field private final _tagDao:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lcom/example/data/TagDao;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/data/AppDatabase_Impl;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/example/data/AppDatabase;-><init>()V

    .line 30
    new-instance v0, Lcom/example/data/AppDatabase_Impl$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/example/data/AppDatabase_Impl$$ExternalSyntheticLambda0;-><init>(Lcom/example/data/AppDatabase_Impl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/AppDatabase_Impl;->_dhikrDao:Lkotlin/Lazy;

    .line 34
    new-instance v0, Lcom/example/data/AppDatabase_Impl$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/example/data/AppDatabase_Impl$$ExternalSyntheticLambda1;-><init>(Lcom/example/data/AppDatabase_Impl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/AppDatabase_Impl;->_tagDao:Lkotlin/Lazy;

    .line 38
    new-instance v0, Lcom/example/data/AppDatabase_Impl$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0}, Lcom/example/data/AppDatabase_Impl$$ExternalSyntheticLambda2;-><init>(Lcom/example/data/AppDatabase_Impl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/AppDatabase_Impl;->_historyDao:Lkotlin/Lazy;

    .line 42
    new-instance v0, Lcom/example/data/AppDatabase_Impl$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/example/data/AppDatabase_Impl$$ExternalSyntheticLambda3;-><init>(Lcom/example/data/AppDatabase_Impl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/AppDatabase_Impl;->_hisnDao:Lkotlin/Lazy;

    .line 27
    return-void
.end method

.method static final _dhikrDao$lambda$0(Lcom/example/data/AppDatabase_Impl;)Lcom/example/data/DhikrDao_Impl;
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/AppDatabase_Impl;

    .line 31
    new-instance v0, Lcom/example/data/DhikrDao_Impl;

    move-object v1, p0

    check-cast v1, Landroidx/room/RoomDatabase;

    invoke-direct {v0, v1}, Lcom/example/data/DhikrDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    return-object v0
.end method

.method static final _hisnDao$lambda$3(Lcom/example/data/AppDatabase_Impl;)Lcom/example/data/HisnDao_Impl;
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/AppDatabase_Impl;

    .line 43
    new-instance v0, Lcom/example/data/HisnDao_Impl;

    move-object v1, p0

    check-cast v1, Landroidx/room/RoomDatabase;

    invoke-direct {v0, v1}, Lcom/example/data/HisnDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    return-object v0
.end method

.method static final _historyDao$lambda$2(Lcom/example/data/AppDatabase_Impl;)Lcom/example/data/HistoryDao_Impl;
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/AppDatabase_Impl;

    .line 39
    new-instance v0, Lcom/example/data/HistoryDao_Impl;

    move-object v1, p0

    check-cast v1, Landroidx/room/RoomDatabase;

    invoke-direct {v0, v1}, Lcom/example/data/HistoryDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    return-object v0
.end method

.method static final _tagDao$lambda$1(Lcom/example/data/AppDatabase_Impl;)Lcom/example/data/TagDao_Impl;
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/AppDatabase_Impl;

    .line 35
    new-instance v0, Lcom/example/data/TagDao_Impl;

    move-object v1, p0

    check-cast v1, Landroidx/room/RoomDatabase;

    invoke-direct {v0, v1}, Lcom/example/data/TagDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    return-object v0
.end method

.method public static final synthetic access$internalInitInvalidationTracker(Lcom/example/data/AppDatabase_Impl;Landroidx/sqlite/SQLiteConnection;)V
    .locals 0
    .param p0, "$this"    # Lcom/example/data/AppDatabase_Impl;
    .param p1, "connection"    # Landroidx/sqlite/SQLiteConnection;

    .line 27
    invoke-virtual {p0, p1}, Lcom/example/data/AppDatabase_Impl;->internalInitInvalidationTracker(Landroidx/sqlite/SQLiteConnection;)V

    return-void
.end method


# virtual methods
.method public clearAllTables()V
    .locals 8

    .line 312
    nop

    .line 313
    nop

    .line 312
    nop

    .line 313
    nop

    .line 312
    nop

    .line 313
    nop

    .line 312
    nop

    .line 313
    const-string v7, "hisn_read"

    const-string v0, "dhikr_table"

    const-string v1, "tag_table"

    const-string v2, "dhikr_tag_cross_ref"

    const-string v3, "dhikr_history"

    const-string v4, "hisn_chapter"

    const-string v5, "hisn_item"

    const-string v6, "hisn_favorite"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    .line 312
    const/4 v1, 0x0

    invoke-super {p0, v1, v0}, Lcom/example/data/AppDatabase;->performClear(Z[Ljava/lang/String;)V

    .line 314
    return-void
.end method

.method public createAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .param p1, "autoMigrationSpecs"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lkotlin/reflect/KClass<",
            "+",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;+",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/room/migration/Migration;",
            ">;"
        }
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 334
    .local v0, "_autoMigrations":Ljava/util/List;
    return-object v0
.end method

.method protected createInvalidationTracker()Landroidx/room/InvalidationTracker;
    .locals 12

    .line 304
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 305
    .local v0, "_shadowTablesMap":Ljava/util/Map;
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 306
    .local v1, "_viewTables":Ljava/util/Map;
    new-instance v2, Landroidx/room/InvalidationTracker;

    move-object v3, p0

    check-cast v3, Landroidx/room/RoomDatabase;

    .line 307
    nop

    .line 306
    nop

    .line 307
    nop

    .line 306
    nop

    .line 307
    nop

    .line 306
    nop

    .line 307
    nop

    .line 306
    nop

    .line 307
    nop

    .line 306
    nop

    .line 308
    const-string v11, "hisn_read"

    const-string v4, "dhikr_table"

    const-string v5, "tag_table"

    const-string v6, "dhikr_tag_cross_ref"

    const-string v7, "dhikr_history"

    const-string v8, "hisn_chapter"

    const-string v9, "hisn_item"

    const-string v10, "hisn_favorite"

    filled-new-array/range {v4 .. v11}, [Ljava/lang/String;

    move-result-object v4

    .line 306
    invoke-direct {v2, v3, v0, v1, v4}, Landroidx/room/InvalidationTracker;-><init>(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v2
.end method

.method protected createOpenDelegate()Landroidx/room/RoomOpenDelegate;
    .locals 1

    .line 47
    new-instance v0, Lcom/example/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;

    invoke-direct {v0, p0}, Lcom/example/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;-><init>(Lcom/example/data/AppDatabase_Impl;)V

    check-cast v0, Landroidx/room/RoomOpenDelegate;

    .line 300
    .local v0, "_openDelegate":Landroidx/room/RoomOpenDelegate;
    return-object v0
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/example/data/AppDatabase_Impl;->createOpenDelegate()Landroidx/room/RoomOpenDelegate;

    move-result-object v0

    check-cast v0, Landroidx/room/RoomOpenDelegateMarker;

    return-object v0
.end method

.method public dhikrDao()Lcom/example/data/DhikrDao;
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/example/data/AppDatabase_Impl;->_dhikrDao:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/data/DhikrDao;

    return-object v0
.end method

.method public getRequiredAutoMigrationSpecClasses()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lkotlin/reflect/KClass<",
            "+",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;>;"
        }
    .end annotation

    .line 326
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v0, Ljava/util/Set;

    .line 327
    .local v0, "_autoMigrationSpecsSet":Ljava/util/Set;
    return-object v0
.end method

.method protected getRequiredTypeConverterClasses()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lkotlin/reflect/KClass<",
            "*>;",
            "Ljava/util/List<",
            "Lkotlin/reflect/KClass<",
            "*>;>;>;"
        }
    .end annotation

    .line 317
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 318
    .local v0, "_typeConvertersMap":Ljava/util/Map;
    const-class v1, Lcom/example/data/DhikrDao;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    sget-object v2, Lcom/example/data/DhikrDao_Impl;->Companion:Lcom/example/data/DhikrDao_Impl$Companion;

    invoke-virtual {v2}, Lcom/example/data/DhikrDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    const-class v1, Lcom/example/data/TagDao;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    sget-object v2, Lcom/example/data/TagDao_Impl;->Companion:Lcom/example/data/TagDao_Impl$Companion;

    invoke-virtual {v2}, Lcom/example/data/TagDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    const-class v1, Lcom/example/data/HistoryDao;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    sget-object v2, Lcom/example/data/HistoryDao_Impl;->Companion:Lcom/example/data/HistoryDao_Impl$Companion;

    invoke-virtual {v2}, Lcom/example/data/HistoryDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    const-class v1, Lcom/example/data/HisnDao;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    sget-object v2, Lcom/example/data/HisnDao_Impl;->Companion:Lcom/example/data/HisnDao_Impl$Companion;

    invoke-virtual {v2}, Lcom/example/data/HisnDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    return-object v0
.end method

.method public hisnDao()Lcom/example/data/HisnDao;
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/example/data/AppDatabase_Impl;->_hisnDao:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/data/HisnDao;

    return-object v0
.end method

.method public historyDao()Lcom/example/data/HistoryDao;
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/example/data/AppDatabase_Impl;->_historyDao:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/data/HistoryDao;

    return-object v0
.end method

.method public tagDao()Lcom/example/data/TagDao;
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/example/data/AppDatabase_Impl;->_tagDao:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/data/TagDao;

    return-object v0
.end method
