.class public final Lcom/example/data/DhikrDao_Impl;
.super Ljava/lang/Object;
.source "DhikrDao_Impl.kt"

# interfaces
.implements Lcom/example/data/DhikrDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/data/DhikrDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0014H\u0096@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00140\u0018H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00140\u0018H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00140\u0018H\u0016J\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0014H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00a2\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/example/data/DhikrDao_Impl;",
        "Lcom/example/data/DhikrDao;",
        "__db",
        "Landroidx/room/RoomDatabase;",
        "<init>",
        "(Landroidx/room/RoomDatabase;)V",
        "__insertAdapterOfDhikr",
        "Landroidx/room/EntityInsertAdapter;",
        "Lcom/example/data/Dhikr;",
        "__converters",
        "Lcom/example/data/Converters;",
        "__updateAdapterOfDhikr",
        "Landroidx/room/EntityDeleteOrUpdateAdapter;",
        "insertDhikr",
        "",
        "dhikr",
        "(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "insertAll",
        "",
        "dhikrList",
        "",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateDhikr",
        "getAllDhikr",
        "Lkotlinx/coroutines/flow/Flow;",
        "getFavoriteDhikr",
        "getEnabledDhikr",
        "getEnabledDhikrSync",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getDhikrById",
        "id",
        "",
        "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "markAsRead",
        "lastReadTime",
        "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteDhikrById",
        "Companion",
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

.field public static final Companion:Lcom/example/data/DhikrDao_Impl$Companion;


# instance fields
.field private final __converters:Lcom/example/data/Converters;

.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertAdapterOfDhikr:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/example/data/Dhikr;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfDhikr:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/example/data/Dhikr;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/data/DhikrDao_Impl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/data/DhikrDao_Impl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/data/DhikrDao_Impl;->Companion:Lcom/example/data/DhikrDao_Impl$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/data/DhikrDao_Impl;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .param p1, "__db"    # Landroidx/room/RoomDatabase;

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lcom/example/data/Converters;

    invoke-direct {v0}, Lcom/example/data/Converters;-><init>()V

    iput-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__converters:Lcom/example/data/Converters;

    .line 35
    nop

    .line 36
    iput-object p1, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 37
    new-instance v0, Lcom/example/data/DhikrDao_Impl$1;

    invoke-direct {v0, p0}, Lcom/example/data/DhikrDao_Impl$1;-><init>(Lcom/example/data/DhikrDao_Impl;)V

    check-cast v0, Landroidx/room/EntityInsertAdapter;

    iput-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__insertAdapterOfDhikr:Landroidx/room/EntityInsertAdapter;

    .line 55
    new-instance v0, Lcom/example/data/DhikrDao_Impl$2;

    invoke-direct {v0, p0}, Lcom/example/data/DhikrDao_Impl$2;-><init>(Lcom/example/data/DhikrDao_Impl;)V

    check-cast v0, Landroidx/room/EntityDeleteOrUpdateAdapter;

    iput-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__updateAdapterOfDhikr:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 74
    nop

    .line 25
    return-void
.end method

.method public static final synthetic access$get__converters$p(Lcom/example/data/DhikrDao_Impl;)Lcom/example/data/Converters;
    .locals 1
    .param p0, "$this"    # Lcom/example/data/DhikrDao_Impl;

    .line 23
    iget-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__converters:Lcom/example/data/Converters;

    return-object v0
.end method

.method static final deleteDhikrById$lambda$9(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 4
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$id"    # I
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 360
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 361
    const/4 v1, 0x1

    .line 362
    .local v1, "_argIndex":I
    int-to-long v2, p1

    :try_start_0
    invoke-interface {v0, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 363
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 365
    .end local v1    # "_argIndex":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    nop

    .line 367
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 365
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getAllDhikr$lambda$3(Ljava/lang/String;Lcom/example/data/DhikrDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 29
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "this$0"    # Lcom/example/data/DhikrDao_Impl;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p2

    const-string v0, "_connection"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v3

    .line 96
    .local v3, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 97
    :try_start_0
    const-string v0, "id"

    invoke-static {v3, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    .line 98
    .local v0, "_columnIndexOfId":I
    const-string v4, "title"

    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 99
    .local v4, "_columnIndexOfTitle":I
    const-string v5, "content"

    invoke-static {v3, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    .line 100
    .local v5, "_columnIndexOfContent":I
    const-string v6, "isFavorite"

    invoke-static {v3, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 101
    .local v6, "_columnIndexOfIsFavorite":I
    const-string v7, "reminderTimes"

    invoke-static {v3, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    .line 102
    .local v7, "_columnIndexOfReminderTimes":I
    const-string v8, "isEnabled"

    invoke-static {v3, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    .line 103
    .local v8, "_columnIndexOfIsEnabled":I
    const-string v9, "readCount"

    invoke-static {v3, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    .line 104
    .local v9, "_columnIndexOfReadCount":I
    const-string v10, "lastReadTime"

    invoke-static {v3, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    .line 105
    .local v10, "_columnIndexOfLastReadTime":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/List;

    .line 106
    .local v11, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 107
    const/4 v12, 0x0

    .line 108
    .local v12, "_item":Lcom/example/data/Dhikr;
    const/4 v13, 0x0

    .line 109
    .local v13, "_tmpId":I
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v13, v14

    .line 110
    const/4 v14, 0x0

    .line 111
    .local v14, "_tmpTitle":Ljava/lang/String;
    invoke-interface {v3, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v18

    .line 112
    .end local v14    # "_tmpTitle":Ljava/lang/String;
    .local v18, "_tmpTitle":Ljava/lang/String;
    const/4 v14, 0x0

    .line 113
    .local v14, "_tmpContent":Ljava/lang/String;
    invoke-interface {v3, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    .line 114
    .end local v14    # "_tmpContent":Ljava/lang/String;
    .local v19, "_tmpContent":Ljava/lang/String;
    const/4 v14, 0x0

    .line 115
    .local v14, "_tmpIsFavorite":Z
    const/4 v15, 0x0

    .line 116
    .local v15, "_tmp":I
    move/from16 v26, v0

    .end local v0    # "_columnIndexOfId":I
    .local v26, "_columnIndexOfId":I
    invoke-interface {v3, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 117
    .end local v15    # "_tmp":I
    .local v0, "_tmp":I
    if-eqz v0, :cond_0

    const/16 v20, 0x1

    goto :goto_1

    :cond_0
    const/16 v20, 0x0

    .line 118
    .end local v14    # "_tmpIsFavorite":Z
    .local v20, "_tmpIsFavorite":Z
    :goto_1
    const/4 v14, 0x0

    .line 119
    .local v14, "_tmpReminderTimes":Ljava/util/List;
    const/16 v16, 0x0

    .line 120
    .local v16, "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v27, v17

    .line 121
    .end local v16    # "_tmp_1":Ljava/lang/String;
    .local v27, "_tmp_1":Ljava/lang/String;
    move-object/from16 v1, p1

    iget-object v15, v1, Lcom/example/data/DhikrDao_Impl;->__converters:Lcom/example/data/Converters;

    move/from16 v28, v0

    move-object/from16 v0, v27

    .end local v27    # "_tmp_1":Ljava/lang/String;
    .local v0, "_tmp_1":Ljava/lang/String;
    .local v28, "_tmp":I
    invoke-virtual {v15, v0}, Lcom/example/data/Converters;->fromString(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    .line 122
    .end local v14    # "_tmpReminderTimes":Ljava/util/List;
    .local v21, "_tmpReminderTimes":Ljava/util/List;
    const/4 v14, 0x0

    .line 123
    .local v14, "_tmpIsEnabled":Z
    const/4 v15, 0x0

    .line 124
    .local v15, "_tmp_2":I
    move-object/from16 v27, v0

    .end local v0    # "_tmp_1":Ljava/lang/String;
    .restart local v27    # "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 125
    .end local v15    # "_tmp_2":I
    .local v0, "_tmp_2":I
    if-eqz v0, :cond_1

    const/16 v22, 0x1

    goto :goto_2

    :cond_1
    const/16 v22, 0x0

    .line 126
    .end local v14    # "_tmpIsEnabled":Z
    .local v22, "_tmpIsEnabled":Z
    :goto_2
    const/4 v1, 0x0

    .line 127
    .local v1, "_tmpReadCount":I
    invoke-interface {v3, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v1, v14

    .line 128
    const-wide/16 v14, 0x0

    .line 129
    .local v14, "_tmpLastReadTime":J
    invoke-interface {v3, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v24

    .line 131
    .end local v14    # "_tmpLastReadTime":J
    .local v24, "_tmpLastReadTime":J
    new-instance v16, Lcom/example/data/Dhikr;

    move/from16 v23, v1

    move/from16 v17, v13

    .end local v1    # "_tmpReadCount":I
    .end local v13    # "_tmpId":I
    .local v17, "_tmpId":I
    .local v23, "_tmpReadCount":I
    invoke-direct/range {v16 .. v25}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJ)V

    .line 130
    move-object/from16 v1, v16

    .line 132
    .end local v12    # "_item":Lcom/example/data/Dhikr;
    .local v1, "_item":Lcom/example/data/Dhikr;
    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, p2

    move/from16 v0, v26

    goto :goto_0

    .line 134
    .end local v1    # "_item":Lcom/example/data/Dhikr;
    .end local v17    # "_tmpId":I
    .end local v18    # "_tmpTitle":Ljava/lang/String;
    .end local v19    # "_tmpContent":Ljava/lang/String;
    .end local v20    # "_tmpIsFavorite":Z
    .end local v21    # "_tmpReminderTimes":Ljava/util/List;
    .end local v22    # "_tmpIsEnabled":Z
    .end local v23    # "_tmpReadCount":I
    .end local v24    # "_tmpLastReadTime":J
    .end local v26    # "_columnIndexOfId":I
    .end local v27    # "_tmp_1":Ljava/lang/String;
    .end local v28    # "_tmp":I
    .local v0, "_columnIndexOfId":I
    :cond_2
    move/from16 v26, v0

    .line 136
    .end local v0    # "_columnIndexOfId":I
    .end local v4    # "_columnIndexOfTitle":I
    .end local v5    # "_columnIndexOfContent":I
    .end local v6    # "_columnIndexOfIsFavorite":I
    .end local v7    # "_columnIndexOfReminderTimes":I
    .end local v8    # "_columnIndexOfIsEnabled":I
    .end local v9    # "_columnIndexOfReadCount":I
    .end local v10    # "_columnIndexOfLastReadTime":I
    .end local v11    # "_result":Ljava/util/List;
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 137
    return-object v11

    .line 136
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final getDhikrById$lambda$7(Ljava/lang/String;ILcom/example/data/DhikrDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/example/data/Dhikr;
    .locals 31
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$id"    # I
    .param p2, "this$0"    # Lcom/example/data/DhikrDao_Impl;
    .param p3, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p3

    const-string v0, "_connection"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v3

    .line 292
    .local v3, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 293
    const/4 v0, 0x1

    .line 294
    .local v0, "_argIndex":I
    move/from16 v4, p1

    int-to-long v5, v4

    :try_start_0
    invoke-interface {v3, v0, v5, v6}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 295
    const-string v5, "id"

    invoke-static {v3, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    .line 296
    .local v5, "_columnIndexOfId":I
    const-string v6, "title"

    invoke-static {v3, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 297
    .local v6, "_columnIndexOfTitle":I
    const-string v7, "content"

    invoke-static {v3, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    .line 298
    .local v7, "_columnIndexOfContent":I
    const-string v8, "isFavorite"

    invoke-static {v3, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    .line 299
    .local v8, "_columnIndexOfIsFavorite":I
    const-string v9, "reminderTimes"

    invoke-static {v3, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    .line 300
    .local v9, "_columnIndexOfReminderTimes":I
    const-string v10, "isEnabled"

    invoke-static {v3, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    .line 301
    .local v10, "_columnIndexOfIsEnabled":I
    const-string v11, "readCount"

    invoke-static {v3, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    .line 302
    .local v11, "_columnIndexOfReadCount":I
    const-string v12, "lastReadTime"

    invoke-static {v3, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    .line 303
    .local v12, "_columnIndexOfLastReadTime":I
    const/4 v13, 0x0

    .line 304
    .local v13, "_result":Lcom/example/data/Dhikr;
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v14

    if-eqz v14, :cond_2

    .line 305
    const/4 v14, 0x0

    .line 306
    .local v14, "_tmpId":I
    move v15, v0

    .end local v0    # "_argIndex":I
    .local v15, "_argIndex":I
    invoke-interface {v3, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 307
    .end local v14    # "_tmpId":I
    .local v0, "_tmpId":I
    const/4 v1, 0x0

    .line 308
    .local v1, "_tmpTitle":Ljava/lang/String;
    invoke-interface {v3, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v18

    .line 309
    .end local v1    # "_tmpTitle":Ljava/lang/String;
    .local v18, "_tmpTitle":Ljava/lang/String;
    const/4 v1, 0x0

    .line 310
    .local v1, "_tmpContent":Ljava/lang/String;
    invoke-interface {v3, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    .line 311
    .end local v1    # "_tmpContent":Ljava/lang/String;
    .local v19, "_tmpContent":Ljava/lang/String;
    const/4 v1, 0x0

    .line 312
    .local v1, "_tmpIsFavorite":Z
    const/4 v14, 0x0

    .line 313
    .local v14, "_tmp":I
    move/from16 v17, v0

    move/from16 v16, v1

    .end local v0    # "_tmpId":I
    .end local v1    # "_tmpIsFavorite":Z
    .local v16, "_tmpIsFavorite":Z
    .local v17, "_tmpId":I
    invoke-interface {v3, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 314
    .end local v14    # "_tmp":I
    .local v0, "_tmp":I
    if-eqz v0, :cond_0

    const/16 v20, 0x1

    goto :goto_0

    :cond_0
    const/16 v20, 0x0

    .line 315
    .end local v16    # "_tmpIsFavorite":Z
    .local v20, "_tmpIsFavorite":Z
    :goto_0
    const/16 v16, 0x0

    .line 316
    .local v16, "_tmpReminderTimes":Ljava/util/List;
    const/16 v21, 0x0

    .line 317
    .local v21, "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v26, v22

    .line 318
    .end local v21    # "_tmp_1":Ljava/lang/String;
    .local v26, "_tmp_1":Ljava/lang/String;
    move-object/from16 v1, p2

    iget-object v14, v1, Lcom/example/data/DhikrDao_Impl;->__converters:Lcom/example/data/Converters;

    move/from16 v27, v0

    move-object/from16 v0, v26

    .end local v26    # "_tmp_1":Ljava/lang/String;
    .local v0, "_tmp_1":Ljava/lang/String;
    .local v27, "_tmp":I
    invoke-virtual {v14, v0}, Lcom/example/data/Converters;->fromString(Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    .line 319
    .end local v16    # "_tmpReminderTimes":Ljava/util/List;
    .local v14, "_tmpReminderTimes":Ljava/util/List;
    const/16 v16, 0x0

    .line 320
    .local v16, "_tmpIsEnabled":Z
    const/16 v23, 0x0

    .line 321
    .local v23, "_tmp_2":I
    move-object/from16 v26, v0

    .end local v0    # "_tmp_1":Ljava/lang/String;
    .restart local v26    # "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 322
    .end local v23    # "_tmp_2":I
    .local v0, "_tmp_2":I
    if-eqz v0, :cond_1

    const/16 v22, 0x1

    goto :goto_1

    :cond_1
    const/16 v22, 0x0

    .line 323
    .end local v16    # "_tmpIsEnabled":Z
    .local v22, "_tmpIsEnabled":Z
    :goto_1
    const/4 v1, 0x0

    .line 324
    .local v1, "_tmpReadCount":I
    move/from16 v28, v0

    move/from16 v16, v1

    .end local v0    # "_tmp_2":I
    .end local v1    # "_tmpReadCount":I
    .local v16, "_tmpReadCount":I
    .local v28, "_tmp_2":I
    invoke-interface {v3, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 325
    .end local v16    # "_tmpReadCount":I
    .local v0, "_tmpReadCount":I
    const-wide/16 v23, 0x0

    .line 326
    .local v23, "_tmpLastReadTime":J
    invoke-interface {v3, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v29

    move-wide/from16 v24, v29

    .line 328
    .end local v23    # "_tmpLastReadTime":J
    .local v24, "_tmpLastReadTime":J
    new-instance v16, Lcom/example/data/Dhikr;

    move/from16 v23, v0

    move-object/from16 v21, v14

    .end local v0    # "_tmpReadCount":I
    .end local v14    # "_tmpReminderTimes":Ljava/util/List;
    .local v21, "_tmpReminderTimes":Ljava/util/List;
    .local v23, "_tmpReadCount":I
    invoke-direct/range {v16 .. v25}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    nop

    .end local v13    # "_result":Lcom/example/data/Dhikr;
    .end local v17    # "_tmpId":I
    .end local v18    # "_tmpTitle":Ljava/lang/String;
    .end local v19    # "_tmpContent":Ljava/lang/String;
    .end local v20    # "_tmpIsFavorite":Z
    .end local v21    # "_tmpReminderTimes":Ljava/util/List;
    .end local v22    # "_tmpIsEnabled":Z
    .end local v23    # "_tmpReadCount":I
    .end local v24    # "_tmpLastReadTime":J
    .end local v26    # "_tmp_1":Ljava/lang/String;
    .end local v27    # "_tmp":I
    .end local v28    # "_tmp_2":I
    .local v16, "_result":Lcom/example/data/Dhikr;
    goto :goto_2

    .line 330
    .end local v15    # "_argIndex":I
    .end local v16    # "_result":Lcom/example/data/Dhikr;
    .local v0, "_argIndex":I
    .restart local v13    # "_result":Lcom/example/data/Dhikr;
    :cond_2
    move v15, v0

    .end local v0    # "_argIndex":I
    .restart local v15    # "_argIndex":I
    const/16 v16, 0x0

    .line 332
    .end local v13    # "_result":Lcom/example/data/Dhikr;
    .restart local v16    # "_result":Lcom/example/data/Dhikr;
    :goto_2
    nop

    .line 334
    .end local v5    # "_columnIndexOfId":I
    .end local v6    # "_columnIndexOfTitle":I
    .end local v7    # "_columnIndexOfContent":I
    .end local v8    # "_columnIndexOfIsFavorite":I
    .end local v9    # "_columnIndexOfReminderTimes":I
    .end local v10    # "_columnIndexOfIsEnabled":I
    .end local v11    # "_columnIndexOfReadCount":I
    .end local v12    # "_columnIndexOfLastReadTime":I
    .end local v15    # "_argIndex":I
    .end local v16    # "_result":Lcom/example/data/Dhikr;
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 335
    return-object v16

    .line 334
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final getEnabledDhikr$lambda$5(Ljava/lang/String;Lcom/example/data/DhikrDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 29
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "this$0"    # Lcom/example/data/DhikrDao_Impl;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p2

    const-string v0, "_connection"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v3

    .line 194
    .local v3, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 195
    :try_start_0
    const-string v0, "id"

    invoke-static {v3, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    .line 196
    .local v0, "_columnIndexOfId":I
    const-string v4, "title"

    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 197
    .local v4, "_columnIndexOfTitle":I
    const-string v5, "content"

    invoke-static {v3, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    .line 198
    .local v5, "_columnIndexOfContent":I
    const-string v6, "isFavorite"

    invoke-static {v3, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 199
    .local v6, "_columnIndexOfIsFavorite":I
    const-string v7, "reminderTimes"

    invoke-static {v3, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    .line 200
    .local v7, "_columnIndexOfReminderTimes":I
    const-string v8, "isEnabled"

    invoke-static {v3, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    .line 201
    .local v8, "_columnIndexOfIsEnabled":I
    const-string v9, "readCount"

    invoke-static {v3, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    .line 202
    .local v9, "_columnIndexOfReadCount":I
    const-string v10, "lastReadTime"

    invoke-static {v3, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    .line 203
    .local v10, "_columnIndexOfLastReadTime":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/List;

    .line 204
    .local v11, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 205
    const/4 v12, 0x0

    .line 206
    .local v12, "_item":Lcom/example/data/Dhikr;
    const/4 v13, 0x0

    .line 207
    .local v13, "_tmpId":I
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v13, v14

    .line 208
    const/4 v14, 0x0

    .line 209
    .local v14, "_tmpTitle":Ljava/lang/String;
    invoke-interface {v3, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v18

    .line 210
    .end local v14    # "_tmpTitle":Ljava/lang/String;
    .local v18, "_tmpTitle":Ljava/lang/String;
    const/4 v14, 0x0

    .line 211
    .local v14, "_tmpContent":Ljava/lang/String;
    invoke-interface {v3, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    .line 212
    .end local v14    # "_tmpContent":Ljava/lang/String;
    .local v19, "_tmpContent":Ljava/lang/String;
    const/4 v14, 0x0

    .line 213
    .local v14, "_tmpIsFavorite":Z
    const/4 v15, 0x0

    .line 214
    .local v15, "_tmp":I
    move/from16 v26, v0

    .end local v0    # "_columnIndexOfId":I
    .local v26, "_columnIndexOfId":I
    invoke-interface {v3, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 215
    .end local v15    # "_tmp":I
    .local v0, "_tmp":I
    if-eqz v0, :cond_0

    const/16 v20, 0x1

    goto :goto_1

    :cond_0
    const/16 v20, 0x0

    .line 216
    .end local v14    # "_tmpIsFavorite":Z
    .local v20, "_tmpIsFavorite":Z
    :goto_1
    const/4 v14, 0x0

    .line 217
    .local v14, "_tmpReminderTimes":Ljava/util/List;
    const/16 v16, 0x0

    .line 218
    .local v16, "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v27, v17

    .line 219
    .end local v16    # "_tmp_1":Ljava/lang/String;
    .local v27, "_tmp_1":Ljava/lang/String;
    move-object/from16 v1, p1

    iget-object v15, v1, Lcom/example/data/DhikrDao_Impl;->__converters:Lcom/example/data/Converters;

    move/from16 v28, v0

    move-object/from16 v0, v27

    .end local v27    # "_tmp_1":Ljava/lang/String;
    .local v0, "_tmp_1":Ljava/lang/String;
    .local v28, "_tmp":I
    invoke-virtual {v15, v0}, Lcom/example/data/Converters;->fromString(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    .line 220
    .end local v14    # "_tmpReminderTimes":Ljava/util/List;
    .local v21, "_tmpReminderTimes":Ljava/util/List;
    const/4 v14, 0x0

    .line 221
    .local v14, "_tmpIsEnabled":Z
    const/4 v15, 0x0

    .line 222
    .local v15, "_tmp_2":I
    move-object/from16 v27, v0

    .end local v0    # "_tmp_1":Ljava/lang/String;
    .restart local v27    # "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 223
    .end local v15    # "_tmp_2":I
    .local v0, "_tmp_2":I
    if-eqz v0, :cond_1

    const/16 v22, 0x1

    goto :goto_2

    :cond_1
    const/16 v22, 0x0

    .line 224
    .end local v14    # "_tmpIsEnabled":Z
    .local v22, "_tmpIsEnabled":Z
    :goto_2
    const/4 v1, 0x0

    .line 225
    .local v1, "_tmpReadCount":I
    invoke-interface {v3, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v1, v14

    .line 226
    const-wide/16 v14, 0x0

    .line 227
    .local v14, "_tmpLastReadTime":J
    invoke-interface {v3, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v24

    .line 229
    .end local v14    # "_tmpLastReadTime":J
    .local v24, "_tmpLastReadTime":J
    new-instance v16, Lcom/example/data/Dhikr;

    move/from16 v23, v1

    move/from16 v17, v13

    .end local v1    # "_tmpReadCount":I
    .end local v13    # "_tmpId":I
    .local v17, "_tmpId":I
    .local v23, "_tmpReadCount":I
    invoke-direct/range {v16 .. v25}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJ)V

    .line 228
    move-object/from16 v1, v16

    .line 230
    .end local v12    # "_item":Lcom/example/data/Dhikr;
    .local v1, "_item":Lcom/example/data/Dhikr;
    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, p2

    move/from16 v0, v26

    goto :goto_0

    .line 232
    .end local v1    # "_item":Lcom/example/data/Dhikr;
    .end local v17    # "_tmpId":I
    .end local v18    # "_tmpTitle":Ljava/lang/String;
    .end local v19    # "_tmpContent":Ljava/lang/String;
    .end local v20    # "_tmpIsFavorite":Z
    .end local v21    # "_tmpReminderTimes":Ljava/util/List;
    .end local v22    # "_tmpIsEnabled":Z
    .end local v23    # "_tmpReadCount":I
    .end local v24    # "_tmpLastReadTime":J
    .end local v26    # "_columnIndexOfId":I
    .end local v27    # "_tmp_1":Ljava/lang/String;
    .end local v28    # "_tmp":I
    .local v0, "_columnIndexOfId":I
    :cond_2
    move/from16 v26, v0

    .line 234
    .end local v0    # "_columnIndexOfId":I
    .end local v4    # "_columnIndexOfTitle":I
    .end local v5    # "_columnIndexOfContent":I
    .end local v6    # "_columnIndexOfIsFavorite":I
    .end local v7    # "_columnIndexOfReminderTimes":I
    .end local v8    # "_columnIndexOfIsEnabled":I
    .end local v9    # "_columnIndexOfReadCount":I
    .end local v10    # "_columnIndexOfLastReadTime":I
    .end local v11    # "_result":Ljava/util/List;
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 235
    return-object v11

    .line 234
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final getEnabledDhikrSync$lambda$6(Ljava/lang/String;Lcom/example/data/DhikrDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 29
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "this$0"    # Lcom/example/data/DhikrDao_Impl;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p2

    const-string v0, "_connection"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v3

    .line 243
    .local v3, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 244
    :try_start_0
    const-string v0, "id"

    invoke-static {v3, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    .line 245
    .local v0, "_columnIndexOfId":I
    const-string v4, "title"

    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 246
    .local v4, "_columnIndexOfTitle":I
    const-string v5, "content"

    invoke-static {v3, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    .line 247
    .local v5, "_columnIndexOfContent":I
    const-string v6, "isFavorite"

    invoke-static {v3, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 248
    .local v6, "_columnIndexOfIsFavorite":I
    const-string v7, "reminderTimes"

    invoke-static {v3, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    .line 249
    .local v7, "_columnIndexOfReminderTimes":I
    const-string v8, "isEnabled"

    invoke-static {v3, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    .line 250
    .local v8, "_columnIndexOfIsEnabled":I
    const-string v9, "readCount"

    invoke-static {v3, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    .line 251
    .local v9, "_columnIndexOfReadCount":I
    const-string v10, "lastReadTime"

    invoke-static {v3, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    .line 252
    .local v10, "_columnIndexOfLastReadTime":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/List;

    .line 253
    .local v11, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 254
    const/4 v12, 0x0

    .line 255
    .local v12, "_item":Lcom/example/data/Dhikr;
    const/4 v13, 0x0

    .line 256
    .local v13, "_tmpId":I
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v13, v14

    .line 257
    const/4 v14, 0x0

    .line 258
    .local v14, "_tmpTitle":Ljava/lang/String;
    invoke-interface {v3, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v18

    .line 259
    .end local v14    # "_tmpTitle":Ljava/lang/String;
    .local v18, "_tmpTitle":Ljava/lang/String;
    const/4 v14, 0x0

    .line 260
    .local v14, "_tmpContent":Ljava/lang/String;
    invoke-interface {v3, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    .line 261
    .end local v14    # "_tmpContent":Ljava/lang/String;
    .local v19, "_tmpContent":Ljava/lang/String;
    const/4 v14, 0x0

    .line 262
    .local v14, "_tmpIsFavorite":Z
    const/4 v15, 0x0

    .line 263
    .local v15, "_tmp":I
    move/from16 v26, v0

    .end local v0    # "_columnIndexOfId":I
    .local v26, "_columnIndexOfId":I
    invoke-interface {v3, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 264
    .end local v15    # "_tmp":I
    .local v0, "_tmp":I
    if-eqz v0, :cond_0

    const/16 v20, 0x1

    goto :goto_1

    :cond_0
    const/16 v20, 0x0

    .line 265
    .end local v14    # "_tmpIsFavorite":Z
    .local v20, "_tmpIsFavorite":Z
    :goto_1
    const/4 v14, 0x0

    .line 266
    .local v14, "_tmpReminderTimes":Ljava/util/List;
    const/16 v16, 0x0

    .line 267
    .local v16, "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v27, v17

    .line 268
    .end local v16    # "_tmp_1":Ljava/lang/String;
    .local v27, "_tmp_1":Ljava/lang/String;
    move-object/from16 v1, p1

    iget-object v15, v1, Lcom/example/data/DhikrDao_Impl;->__converters:Lcom/example/data/Converters;

    move/from16 v28, v0

    move-object/from16 v0, v27

    .end local v27    # "_tmp_1":Ljava/lang/String;
    .local v0, "_tmp_1":Ljava/lang/String;
    .local v28, "_tmp":I
    invoke-virtual {v15, v0}, Lcom/example/data/Converters;->fromString(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    .line 269
    .end local v14    # "_tmpReminderTimes":Ljava/util/List;
    .local v21, "_tmpReminderTimes":Ljava/util/List;
    const/4 v14, 0x0

    .line 270
    .local v14, "_tmpIsEnabled":Z
    const/4 v15, 0x0

    .line 271
    .local v15, "_tmp_2":I
    move-object/from16 v27, v0

    .end local v0    # "_tmp_1":Ljava/lang/String;
    .restart local v27    # "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 272
    .end local v15    # "_tmp_2":I
    .local v0, "_tmp_2":I
    if-eqz v0, :cond_1

    const/16 v22, 0x1

    goto :goto_2

    :cond_1
    const/16 v22, 0x0

    .line 273
    .end local v14    # "_tmpIsEnabled":Z
    .local v22, "_tmpIsEnabled":Z
    :goto_2
    const/4 v1, 0x0

    .line 274
    .local v1, "_tmpReadCount":I
    invoke-interface {v3, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v1, v14

    .line 275
    const-wide/16 v14, 0x0

    .line 276
    .local v14, "_tmpLastReadTime":J
    invoke-interface {v3, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v24

    .line 278
    .end local v14    # "_tmpLastReadTime":J
    .local v24, "_tmpLastReadTime":J
    new-instance v16, Lcom/example/data/Dhikr;

    move/from16 v23, v1

    move/from16 v17, v13

    .end local v1    # "_tmpReadCount":I
    .end local v13    # "_tmpId":I
    .local v17, "_tmpId":I
    .local v23, "_tmpReadCount":I
    invoke-direct/range {v16 .. v25}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJ)V

    .line 277
    move-object/from16 v1, v16

    .line 279
    .end local v12    # "_item":Lcom/example/data/Dhikr;
    .local v1, "_item":Lcom/example/data/Dhikr;
    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, p2

    move/from16 v0, v26

    goto :goto_0

    .line 281
    .end local v1    # "_item":Lcom/example/data/Dhikr;
    .end local v17    # "_tmpId":I
    .end local v18    # "_tmpTitle":Ljava/lang/String;
    .end local v19    # "_tmpContent":Ljava/lang/String;
    .end local v20    # "_tmpIsFavorite":Z
    .end local v21    # "_tmpReminderTimes":Ljava/util/List;
    .end local v22    # "_tmpIsEnabled":Z
    .end local v23    # "_tmpReadCount":I
    .end local v24    # "_tmpLastReadTime":J
    .end local v26    # "_columnIndexOfId":I
    .end local v27    # "_tmp_1":Ljava/lang/String;
    .end local v28    # "_tmp":I
    .local v0, "_columnIndexOfId":I
    :cond_2
    move/from16 v26, v0

    .line 283
    .end local v0    # "_columnIndexOfId":I
    .end local v4    # "_columnIndexOfTitle":I
    .end local v5    # "_columnIndexOfContent":I
    .end local v6    # "_columnIndexOfIsFavorite":I
    .end local v7    # "_columnIndexOfReminderTimes":I
    .end local v8    # "_columnIndexOfIsEnabled":I
    .end local v9    # "_columnIndexOfReadCount":I
    .end local v10    # "_columnIndexOfLastReadTime":I
    .end local v11    # "_result":Ljava/util/List;
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 284
    return-object v11

    .line 283
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final getFavoriteDhikr$lambda$4(Ljava/lang/String;Lcom/example/data/DhikrDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 29
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "this$0"    # Lcom/example/data/DhikrDao_Impl;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p2

    const-string v0, "_connection"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v3

    .line 145
    .local v3, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 146
    :try_start_0
    const-string v0, "id"

    invoke-static {v3, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    .line 147
    .local v0, "_columnIndexOfId":I
    const-string v4, "title"

    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 148
    .local v4, "_columnIndexOfTitle":I
    const-string v5, "content"

    invoke-static {v3, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    .line 149
    .local v5, "_columnIndexOfContent":I
    const-string v6, "isFavorite"

    invoke-static {v3, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 150
    .local v6, "_columnIndexOfIsFavorite":I
    const-string v7, "reminderTimes"

    invoke-static {v3, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    .line 151
    .local v7, "_columnIndexOfReminderTimes":I
    const-string v8, "isEnabled"

    invoke-static {v3, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    .line 152
    .local v8, "_columnIndexOfIsEnabled":I
    const-string v9, "readCount"

    invoke-static {v3, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    .line 153
    .local v9, "_columnIndexOfReadCount":I
    const-string v10, "lastReadTime"

    invoke-static {v3, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    .line 154
    .local v10, "_columnIndexOfLastReadTime":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/List;

    .line 155
    .local v11, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 156
    const/4 v12, 0x0

    .line 157
    .local v12, "_item":Lcom/example/data/Dhikr;
    const/4 v13, 0x0

    .line 158
    .local v13, "_tmpId":I
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v13, v14

    .line 159
    const/4 v14, 0x0

    .line 160
    .local v14, "_tmpTitle":Ljava/lang/String;
    invoke-interface {v3, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v18

    .line 161
    .end local v14    # "_tmpTitle":Ljava/lang/String;
    .local v18, "_tmpTitle":Ljava/lang/String;
    const/4 v14, 0x0

    .line 162
    .local v14, "_tmpContent":Ljava/lang/String;
    invoke-interface {v3, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    .line 163
    .end local v14    # "_tmpContent":Ljava/lang/String;
    .local v19, "_tmpContent":Ljava/lang/String;
    const/4 v14, 0x0

    .line 164
    .local v14, "_tmpIsFavorite":Z
    const/4 v15, 0x0

    .line 165
    .local v15, "_tmp":I
    move/from16 v26, v0

    .end local v0    # "_columnIndexOfId":I
    .local v26, "_columnIndexOfId":I
    invoke-interface {v3, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 166
    .end local v15    # "_tmp":I
    .local v0, "_tmp":I
    if-eqz v0, :cond_0

    const/16 v20, 0x1

    goto :goto_1

    :cond_0
    const/16 v20, 0x0

    .line 167
    .end local v14    # "_tmpIsFavorite":Z
    .local v20, "_tmpIsFavorite":Z
    :goto_1
    const/4 v14, 0x0

    .line 168
    .local v14, "_tmpReminderTimes":Ljava/util/List;
    const/16 v16, 0x0

    .line 169
    .local v16, "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v27, v17

    .line 170
    .end local v16    # "_tmp_1":Ljava/lang/String;
    .local v27, "_tmp_1":Ljava/lang/String;
    move-object/from16 v1, p1

    iget-object v15, v1, Lcom/example/data/DhikrDao_Impl;->__converters:Lcom/example/data/Converters;

    move/from16 v28, v0

    move-object/from16 v0, v27

    .end local v27    # "_tmp_1":Ljava/lang/String;
    .local v0, "_tmp_1":Ljava/lang/String;
    .local v28, "_tmp":I
    invoke-virtual {v15, v0}, Lcom/example/data/Converters;->fromString(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    .line 171
    .end local v14    # "_tmpReminderTimes":Ljava/util/List;
    .local v21, "_tmpReminderTimes":Ljava/util/List;
    const/4 v14, 0x0

    .line 172
    .local v14, "_tmpIsEnabled":Z
    const/4 v15, 0x0

    .line 173
    .local v15, "_tmp_2":I
    move-object/from16 v27, v0

    .end local v0    # "_tmp_1":Ljava/lang/String;
    .restart local v27    # "_tmp_1":Ljava/lang/String;
    invoke-interface {v3, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 174
    .end local v15    # "_tmp_2":I
    .local v0, "_tmp_2":I
    if-eqz v0, :cond_1

    const/16 v22, 0x1

    goto :goto_2

    :cond_1
    const/16 v22, 0x0

    .line 175
    .end local v14    # "_tmpIsEnabled":Z
    .local v22, "_tmpIsEnabled":Z
    :goto_2
    const/4 v1, 0x0

    .line 176
    .local v1, "_tmpReadCount":I
    invoke-interface {v3, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v1, v14

    .line 177
    const-wide/16 v14, 0x0

    .line 178
    .local v14, "_tmpLastReadTime":J
    invoke-interface {v3, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v24

    .line 180
    .end local v14    # "_tmpLastReadTime":J
    .local v24, "_tmpLastReadTime":J
    new-instance v16, Lcom/example/data/Dhikr;

    move/from16 v23, v1

    move/from16 v17, v13

    .end local v1    # "_tmpReadCount":I
    .end local v13    # "_tmpId":I
    .local v17, "_tmpId":I
    .local v23, "_tmpReadCount":I
    invoke-direct/range {v16 .. v25}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJ)V

    .line 179
    move-object/from16 v1, v16

    .line 181
    .end local v12    # "_item":Lcom/example/data/Dhikr;
    .local v1, "_item":Lcom/example/data/Dhikr;
    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, p2

    move/from16 v0, v26

    goto :goto_0

    .line 183
    .end local v1    # "_item":Lcom/example/data/Dhikr;
    .end local v17    # "_tmpId":I
    .end local v18    # "_tmpTitle":Ljava/lang/String;
    .end local v19    # "_tmpContent":Ljava/lang/String;
    .end local v20    # "_tmpIsFavorite":Z
    .end local v21    # "_tmpReminderTimes":Ljava/util/List;
    .end local v22    # "_tmpIsEnabled":Z
    .end local v23    # "_tmpReadCount":I
    .end local v24    # "_tmpLastReadTime":J
    .end local v26    # "_columnIndexOfId":I
    .end local v27    # "_tmp_1":Ljava/lang/String;
    .end local v28    # "_tmp":I
    .local v0, "_columnIndexOfId":I
    :cond_2
    move/from16 v26, v0

    .line 185
    .end local v0    # "_columnIndexOfId":I
    .end local v4    # "_columnIndexOfTitle":I
    .end local v5    # "_columnIndexOfContent":I
    .end local v6    # "_columnIndexOfIsFavorite":I
    .end local v7    # "_columnIndexOfReminderTimes":I
    .end local v8    # "_columnIndexOfIsEnabled":I
    .end local v9    # "_columnIndexOfReadCount":I
    .end local v10    # "_columnIndexOfLastReadTime":I
    .end local v11    # "_result":Ljava/util/List;
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 186
    return-object v11

    .line 185
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final insertAll$lambda$1(Lcom/example/data/DhikrDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/DhikrDao_Impl;
    .param p1, "$dhikrList"    # Ljava/util/List;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__insertAdapterOfDhikr:Landroidx/room/EntityInsertAdapter;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0, p2, v1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V

    .line 85
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final insertDhikr$lambda$0(Lcom/example/data/DhikrDao_Impl;Lcom/example/data/Dhikr;Landroidx/sqlite/SQLiteConnection;)J
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/DhikrDao_Impl;
    .param p1, "$dhikr"    # Lcom/example/data/Dhikr;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__insertAdapterOfDhikr:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnId(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J

    move-result-wide v0

    .line 79
    .local v0, "_result":J
    return-wide v0
.end method

.method static final markAsRead$lambda$8(Ljava/lang/String;JILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 4
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$lastReadTime"    # J
    .param p3, "$id"    # I
    .param p4, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    invoke-interface {p4, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 344
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 345
    const/4 v1, 0x1

    .line 346
    .local v1, "_argIndex":I
    :try_start_0
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 347
    const/4 v1, 0x2

    .line 348
    int-to-long v2, p3

    invoke-interface {v0, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 349
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    .end local v1    # "_argIndex":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 352
    nop

    .line 353
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 351
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final updateDhikr$lambda$2(Lcom/example/data/DhikrDao_Impl;Lcom/example/data/Dhikr;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/example/data/DhikrDao_Impl;
    .param p1, "$dhikr"    # Lcom/example/data/Dhikr;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__updateAdapterOfDhikr:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handle(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I

    .line 90
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public deleteDhikrById(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "id"    # I
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 357
    const-string v0, "DELETE FROM dhikr_table WHERE id = ?"

    .line 358
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda5;

    invoke-direct {v2, v0, p1}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda5;-><init>(Ljava/lang/String;I)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v3, v4, v2, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public getAllDhikr()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation

    .line 93
    const-string v0, "SELECT * FROM dhikr_table"

    .line 94
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "dhikr_table"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda8;

    invoke-direct {v3, v0, p0}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda8;-><init>(Ljava/lang/String;Lcom/example/data/DhikrDao_Impl;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public getDhikrById(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "id"    # I
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/Dhikr;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 289
    const-string v0, "SELECT * FROM dhikr_table WHERE id = ?"

    .line 290
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda2;

    invoke-direct {v2, v0, p1, p0}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;ILcom/example/data/DhikrDao_Impl;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public getEnabledDhikr()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation

    .line 191
    const-string v0, "SELECT * FROM dhikr_table WHERE isEnabled = 1"

    .line 192
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "dhikr_table"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda3;

    invoke-direct {v3, v0, p0}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda3;-><init>(Ljava/lang/String;Lcom/example/data/DhikrDao_Impl;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public getEnabledDhikrSync(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 240
    const-string v0, "SELECT * FROM dhikr_table WHERE isEnabled = 1"

    .line 241
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda9;

    invoke-direct {v2, v0, p0}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda9;-><init>(Ljava/lang/String;Lcom/example/data/DhikrDao_Impl;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2, p1}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public getFavoriteDhikr()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation

    .line 142
    const-string v0, "SELECT * FROM dhikr_table WHERE isFavorite = 1"

    .line 143
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "dhikr_table"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda7;

    invoke-direct {v3, v0, p0}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda7;-><init>(Ljava/lang/String;Lcom/example/data/DhikrDao_Impl;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public insertAll(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "dhikrList"    # Ljava/util/List;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 83
    nop

    .line 82
    new-instance v1, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda6;

    invoke-direct {v1, p0, p1}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda6;-><init>(Lcom/example/data/DhikrDao_Impl;Ljava/util/List;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 85
    return-object v0
.end method

.method public insertDhikr(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "dhikr"    # Lcom/example/data/Dhikr;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Dhikr;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda0;-><init>(Lcom/example/data/DhikrDao_Impl;Lcom/example/data/Dhikr;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 80
    return-object v0
.end method

.method public markAsRead(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "id"    # I
    .param p2, "lastReadTime"    # J
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 341
    nop

    .line 340
    const-string v0, "UPDATE dhikr_table SET readCount = readCount + 1, lastReadTime = ? WHERE id = ?"

    .line 342
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda4;

    invoke-direct {v2, v0, p2, p3, p1}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda4;-><init>(Ljava/lang/String;JI)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v3, v4, v2, p4}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public updateDhikr(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "dhikr"    # Lcom/example/data/Dhikr;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Dhikr;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/example/data/DhikrDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Lcom/example/data/DhikrDao_Impl$$ExternalSyntheticLambda1;-><init>(Lcom/example/data/DhikrDao_Impl;Lcom/example/data/Dhikr;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    return-object v0
.end method
