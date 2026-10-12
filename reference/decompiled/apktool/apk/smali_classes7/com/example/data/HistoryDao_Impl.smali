.class public final Lcom/example/data/HistoryDao_Impl;
.super Ljava/lang/Object;
.source "HistoryDao_Impl.kt"

# interfaces
.implements Lcom/example/data/HistoryDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/data/HistoryDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0002\u0010\u000cJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u000f0\u000eH\u0016J\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u000f0\u000eH\u0016J\u000e\u0010\u0016\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/example/data/HistoryDao_Impl;",
        "Lcom/example/data/HistoryDao;",
        "__db",
        "Landroidx/room/RoomDatabase;",
        "<init>",
        "(Landroidx/room/RoomDatabase;)V",
        "__insertAdapterOfDhikrHistory",
        "Landroidx/room/EntityInsertAdapter;",
        "Lcom/example/data/DhikrHistory;",
        "insertHistory",
        "",
        "history",
        "(Lcom/example/data/DhikrHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getAllHistory",
        "Lkotlinx/coroutines/flow/Flow;",
        "",
        "getCountSince",
        "",
        "startTime",
        "getTotalCount",
        "getDistinctReadDates",
        "",
        "clearHistory",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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

.field public static final Companion:Lcom/example/data/HistoryDao_Impl$Companion;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertAdapterOfDhikrHistory:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/example/data/DhikrHistory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/data/HistoryDao_Impl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/data/HistoryDao_Impl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/data/HistoryDao_Impl;->Companion:Lcom/example/data/HistoryDao_Impl$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/data/HistoryDao_Impl;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .param p1, "__db"    # Landroidx/room/RoomDatabase;

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    nop

    .line 29
    iput-object p1, p0, Lcom/example/data/HistoryDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 30
    new-instance v0, Lcom/example/data/HistoryDao_Impl$1;

    invoke-direct {v0}, Lcom/example/data/HistoryDao_Impl$1;-><init>()V

    check-cast v0, Landroidx/room/EntityInsertAdapter;

    iput-object v0, p0, Lcom/example/data/HistoryDao_Impl;->__insertAdapterOfDhikrHistory:Landroidx/room/EntityInsertAdapter;

    .line 41
    nop

    .line 22
    return-void
.end method

.method static final clearHistory$lambda$5(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 2
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 143
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 144
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 147
    nop

    .line 148
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 146
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getAllHistory$lambda$1(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 20
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p1

    const-string v0, "_connection"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v3

    .line 53
    .local v3, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 54
    :try_start_0
    const-string v0, "historyId"

    invoke-static {v3, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    .line 55
    .local v0, "_columnIndexOfHistoryId":I
    const-string v4, "dhikrId"

    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 56
    .local v4, "_columnIndexOfDhikrId":I
    const-string v5, "timestamp"

    invoke-static {v3, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    .line 57
    .local v5, "_columnIndexOfTimestamp":I
    const-string v6, "dateString"

    invoke-static {v3, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 58
    .local v6, "_columnIndexOfDateString":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/List;

    .line 59
    .local v7, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 60
    const/4 v8, 0x0

    .line 61
    .local v8, "_item":Lcom/example/data/DhikrHistory;
    const-wide/16 v9, 0x0

    .line 62
    .local v9, "_tmpHistoryId":J
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v11

    move-wide v14, v11

    .line 63
    .end local v9    # "_tmpHistoryId":J
    .local v14, "_tmpHistoryId":J
    const/4 v9, 0x0

    .line 64
    .local v9, "_tmpDhikrId":I
    invoke-interface {v3, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v10

    long-to-int v9, v10

    .line 65
    const-wide/16 v10, 0x0

    .line 66
    .local v10, "_tmpTimestamp":J
    invoke-interface {v3, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v17

    .line 67
    .end local v10    # "_tmpTimestamp":J
    .local v17, "_tmpTimestamp":J
    const/4 v10, 0x0

    .line 68
    .local v10, "_tmpDateString":Ljava/lang/String;
    invoke-interface {v3, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    .line 69
    .end local v10    # "_tmpDateString":Ljava/lang/String;
    .local v19, "_tmpDateString":Ljava/lang/String;
    new-instance v13, Lcom/example/data/DhikrHistory;

    move/from16 v16, v9

    .end local v9    # "_tmpDhikrId":I
    .local v16, "_tmpDhikrId":I
    invoke-direct/range {v13 .. v19}, Lcom/example/data/DhikrHistory;-><init>(JIJLjava/lang/String;)V

    .line 70
    .end local v8    # "_item":Lcom/example/data/DhikrHistory;
    .local v13, "_item":Lcom/example/data/DhikrHistory;
    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 72
    .end local v13    # "_item":Lcom/example/data/DhikrHistory;
    .end local v14    # "_tmpHistoryId":J
    .end local v16    # "_tmpDhikrId":I
    .end local v17    # "_tmpTimestamp":J
    .end local v19    # "_tmpDateString":Ljava/lang/String;
    :cond_0
    nop

    .line 74
    .end local v0    # "_columnIndexOfHistoryId":I
    .end local v4    # "_columnIndexOfDhikrId":I
    .end local v5    # "_columnIndexOfTimestamp":I
    .end local v6    # "_columnIndexOfDateString":I
    .end local v7    # "_result":Ljava/util/List;
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 75
    return-object v7

    .line 74
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final getCountSince$lambda$2(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)I
    .locals 6
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$startTime"    # J
    .param p3, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-interface {p3, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 83
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 84
    const/4 v1, 0x1

    .line 85
    .local v1, "_argIndex":I
    :try_start_0
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 86
    const/4 v2, 0x0

    .line 87
    .local v2, "_result":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 88
    const/4 v3, 0x0

    .line 89
    .local v3, "_tmp":I
    const/4 v4, 0x0

    invoke-interface {v0, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v3, v4

    .line 90
    nop

    .end local v2    # "_result":I
    .local v3, "_result":I
    goto :goto_0

    .line 92
    .end local v3    # "_result":I
    .restart local v2    # "_result":I
    :cond_0
    const/4 v3, 0x0

    .line 94
    .end local v2    # "_result":I
    .restart local v3    # "_result":I
    :goto_0
    nop

    .line 96
    .end local v1    # "_argIndex":I
    .end local v3    # "_result":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 97
    return v3

    .line 96
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getDistinctReadDates$lambda$4(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 4
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 125
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 126
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 127
    .local v1, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 128
    const/4 v2, 0x0

    .line 129
    .local v2, "_item":Ljava/lang/String;
    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    .line 130
    .end local v2    # "_item":Ljava/lang/String;
    .local v3, "_item":Ljava/lang/String;
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 132
    .end local v3    # "_item":Ljava/lang/String;
    :cond_0
    nop

    .line 134
    .end local v1    # "_result":Ljava/util/List;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 135
    return-object v1

    .line 134
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getTotalCount$lambda$3(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)I
    .locals 5
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 105
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 106
    const/4 v1, 0x0

    .line 107
    .local v1, "_result":I
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 108
    const/4 v2, 0x0

    .line 109
    .local v2, "_tmp":I
    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v2, v3

    .line 110
    nop

    .end local v1    # "_result":I
    .local v2, "_result":I
    goto :goto_0

    .line 112
    .end local v2    # "_result":I
    .restart local v1    # "_result":I
    :cond_0
    const/4 v2, 0x0

    .line 114
    .end local v1    # "_result":I
    .restart local v2    # "_result":I
    :goto_0
    nop

    .line 116
    .end local v2    # "_result":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 117
    return v2

    .line 116
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final insertHistory$lambda$0(Lcom/example/data/HistoryDao_Impl;Lcom/example/data/DhikrHistory;Landroidx/sqlite/SQLiteConnection;)J
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/HistoryDao_Impl;
    .param p1, "$history"    # Lcom/example/data/DhikrHistory;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/example/data/HistoryDao_Impl;->__insertAdapterOfDhikrHistory:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnId(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J

    move-result-wide v0

    .line 46
    .local v0, "_result":J
    return-wide v0
.end method


# virtual methods
.method public clearHistory(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 140
    const-string v0, "DELETE FROM dhikr_history"

    .line 141
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HistoryDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda5;

    invoke-direct {v2, v0}, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda5;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v3, v4, v2, p1}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public getAllHistory()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/DhikrHistory;",
            ">;>;"
        }
    .end annotation

    .line 50
    const-string v0, "SELECT * FROM dhikr_history ORDER BY timestamp DESC"

    .line 51
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HistoryDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "dhikr_history"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda4;

    invoke-direct {v3, v0}, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda4;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public getCountSince(J)Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .param p1, "startTime"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 80
    const-string v0, "SELECT COUNT(*) FROM dhikr_history WHERE timestamp >= ?"

    .line 81
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HistoryDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "dhikr_history"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda2;

    invoke-direct {v3, v0, p1, p2}, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;J)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public getDistinctReadDates()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 122
    const-string v0, "SELECT DISTINCT dateString FROM dhikr_history ORDER BY dateString DESC"

    .line 123
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HistoryDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "dhikr_history"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda3;

    invoke-direct {v3, v0}, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda3;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public getTotalCount()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 102
    const-string v0, "SELECT COUNT(*) FROM dhikr_history"

    .line 103
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HistoryDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "dhikr_history"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda1;

    invoke-direct {v3, v0}, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public insertHistory(Lcom/example/data/DhikrHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "history"    # Lcom/example/data/DhikrHistory;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/DhikrHistory;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/example/data/HistoryDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 44
    nop

    .line 43
    new-instance v1, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/example/data/HistoryDao_Impl$$ExternalSyntheticLambda0;-><init>(Lcom/example/data/HistoryDao_Impl;Lcom/example/data/DhikrHistory;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 47
    return-object v0
.end method
