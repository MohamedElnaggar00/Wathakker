.class public final Lcom/example/data/HisnDao_Impl;
.super Ljava/lang/Object;
.source "HisnDao_Impl.kt"

# interfaces
.implements Lcom/example/data/HisnDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/data/HisnDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u000f\u001a\u00020\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00120\u001cH\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00120\u001cH\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0\u00120\u001cH\u0016J\u000e\u0010 \u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u00120\u001cH\u0016J\u001e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020!0\u001c2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\'H\u0016J\u001c\u0010(\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u00120\u001c2\u0006\u0010&\u001a\u00020\'H\u0016J\u001e\u0010)\u001a\u00020\u00102\u0006\u0010%\u001a\u00020!2\u0006\u0010*\u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lcom/example/data/HisnDao_Impl;",
        "Lcom/example/data/HisnDao;",
        "__db",
        "Landroidx/room/RoomDatabase;",
        "<init>",
        "(Landroidx/room/RoomDatabase;)V",
        "__insertAdapterOfHisnChapter",
        "Landroidx/room/EntityInsertAdapter;",
        "Lcom/example/data/HisnChapter;",
        "__insertAdapterOfHisnItem",
        "Lcom/example/data/HisnItem;",
        "__insertAdapterOfHisnFavorite",
        "Lcom/example/data/HisnFavorite;",
        "__insertAdapterOfHisnRead",
        "Lcom/example/data/HisnRead;",
        "insertChapters",
        "",
        "list",
        "",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "insertItems",
        "addFavorite",
        "fav",
        "(Lcom/example/data/HisnFavorite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "insertRead",
        "read",
        "(Lcom/example/data/HisnRead;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "chapters",
        "Lkotlinx/coroutines/flow/Flow;",
        "allItems",
        "itemCounts",
        "Lcom/example/data/ChapterItemCount;",
        "chapterCount",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "favorites",
        "readToday",
        "chapterId",
        "date",
        "",
        "chaptersReadOn",
        "removeFavorite",
        "itemId",
        "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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

.field public static final Companion:Lcom/example/data/HisnDao_Impl$Companion;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertAdapterOfHisnChapter:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/example/data/HisnChapter;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfHisnFavorite:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/example/data/HisnFavorite;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfHisnItem:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/example/data/HisnItem;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfHisnRead:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/example/data/HisnRead;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/data/HisnDao_Impl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/data/HisnDao_Impl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/data/HisnDao_Impl;->Companion:Lcom/example/data/HisnDao_Impl$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/data/HisnDao_Impl;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .param p1, "__db"    # Landroidx/room/RoomDatabase;

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    nop

    .line 36
    iput-object p1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 37
    new-instance v0, Lcom/example/data/HisnDao_Impl$1;

    invoke-direct {v0}, Lcom/example/data/HisnDao_Impl$1;-><init>()V

    check-cast v0, Landroidx/room/EntityInsertAdapter;

    iput-object v0, p0, Lcom/example/data/HisnDao_Impl;->__insertAdapterOfHisnChapter:Landroidx/room/EntityInsertAdapter;

    .line 47
    new-instance v0, Lcom/example/data/HisnDao_Impl$2;

    invoke-direct {v0}, Lcom/example/data/HisnDao_Impl$2;-><init>()V

    check-cast v0, Landroidx/room/EntityInsertAdapter;

    iput-object v0, p0, Lcom/example/data/HisnDao_Impl;->__insertAdapterOfHisnItem:Landroidx/room/EntityInsertAdapter;

    .line 62
    new-instance v0, Lcom/example/data/HisnDao_Impl$3;

    invoke-direct {v0}, Lcom/example/data/HisnDao_Impl$3;-><init>()V

    check-cast v0, Landroidx/room/EntityInsertAdapter;

    iput-object v0, p0, Lcom/example/data/HisnDao_Impl;->__insertAdapterOfHisnFavorite:Landroidx/room/EntityInsertAdapter;

    .line 72
    new-instance v0, Lcom/example/data/HisnDao_Impl$4;

    invoke-direct {v0}, Lcom/example/data/HisnDao_Impl$4;-><init>()V

    check-cast v0, Landroidx/room/EntityInsertAdapter;

    iput-object v0, p0, Lcom/example/data/HisnDao_Impl;->__insertAdapterOfHisnRead:Landroidx/room/EntityInsertAdapter;

    .line 83
    nop

    .line 23
    return-void
.end method

.method static final addFavorite$lambda$2(Lcom/example/data/HisnDao_Impl;Lcom/example/data/HisnFavorite;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/example/data/HisnDao_Impl;
    .param p1, "$fav"    # Lcom/example/data/HisnFavorite;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl;->__insertAdapterOfHisnFavorite:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V

    .line 98
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final allItems$lambda$5(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 25
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p1

    const-string v0, "_connection"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v3

    .line 136
    .local v3, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 137
    :try_start_0
    const-string v0, "id"

    invoke-static {v3, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    .line 138
    .local v0, "_columnIndexOfId":I
    const-string v4, "chapterId"

    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 139
    .local v4, "_columnIndexOfChapterId":I
    const-string v5, "order"

    invoke-static {v3, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    .line 140
    .local v5, "_columnIndexOfOrder":I
    const-string v6, "text"

    invoke-static {v3, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 141
    .local v6, "_columnIndexOfText":I
    const-string v7, "count"

    invoke-static {v3, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    .line 142
    .local v7, "_columnIndexOfCount":I
    const-string v8, "fadl"

    invoke-static {v3, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    .line 143
    .local v8, "_columnIndexOfFadl":I
    const-string v9, "source"

    invoke-static {v3, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    .line 144
    .local v9, "_columnIndexOfSource":I
    const-string v10, "hokm"

    invoke-static {v3, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    .line 145
    .local v10, "_columnIndexOfHokm":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/List;

    .line 146
    .local v11, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v12

    if-eqz v12, :cond_0

    .line 147
    const/4 v12, 0x0

    .line 148
    .local v12, "_item":Lcom/example/data/HisnItem;
    const/4 v13, 0x0

    .line 149
    .local v13, "_tmpId":I
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v13, v14

    .line 150
    const/4 v14, 0x0

    .line 151
    .local v14, "_tmpChapterId":I
    move v15, v0

    .end local v0    # "_columnIndexOfId":I
    .local v15, "_columnIndexOfId":I
    invoke-interface {v3, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 152
    .end local v14    # "_tmpChapterId":I
    .local v0, "_tmpChapterId":I
    const/4 v1, 0x0

    .line 153
    .local v1, "_tmpOrder":I
    move/from16 v18, v0

    move v14, v1

    .end local v0    # "_tmpChapterId":I
    .end local v1    # "_tmpOrder":I
    .local v14, "_tmpOrder":I
    .local v18, "_tmpChapterId":I
    invoke-interface {v3, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 154
    .end local v14    # "_tmpOrder":I
    .local v0, "_tmpOrder":I
    const/4 v1, 0x0

    .line 155
    .local v1, "_tmpText":Ljava/lang/String;
    invoke-interface {v3, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v20

    .line 156
    .end local v1    # "_tmpText":Ljava/lang/String;
    .local v20, "_tmpText":Ljava/lang/String;
    const/4 v1, 0x0

    .line 157
    .local v1, "_tmpCount":I
    move/from16 v19, v0

    move v14, v1

    .end local v0    # "_tmpOrder":I
    .end local v1    # "_tmpCount":I
    .local v14, "_tmpCount":I
    .local v19, "_tmpOrder":I
    invoke-interface {v3, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 158
    .end local v14    # "_tmpCount":I
    .local v0, "_tmpCount":I
    const/4 v1, 0x0

    .line 159
    .local v1, "_tmpFadl":Ljava/lang/String;
    invoke-interface {v3, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v22

    .line 160
    .end local v1    # "_tmpFadl":Ljava/lang/String;
    .local v22, "_tmpFadl":Ljava/lang/String;
    const/4 v1, 0x0

    .line 161
    .local v1, "_tmpSource":Ljava/lang/String;
    invoke-interface {v3, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v23

    .line 162
    .end local v1    # "_tmpSource":Ljava/lang/String;
    .local v23, "_tmpSource":Ljava/lang/String;
    const/4 v1, 0x0

    .line 163
    .local v1, "_tmpHokm":Ljava/lang/String;
    invoke-interface {v3, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v24

    .line 165
    .end local v1    # "_tmpHokm":Ljava/lang/String;
    .local v24, "_tmpHokm":Ljava/lang/String;
    new-instance v16, Lcom/example/data/HisnItem;

    move/from16 v21, v0

    move/from16 v17, v13

    .end local v0    # "_tmpCount":I
    .end local v13    # "_tmpId":I
    .local v17, "_tmpId":I
    .local v21, "_tmpCount":I
    invoke-direct/range {v16 .. v24}, Lcom/example/data/HisnItem;-><init>(IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    move-object/from16 v0, v16

    .line 166
    .end local v12    # "_item":Lcom/example/data/HisnItem;
    .local v0, "_item":Lcom/example/data/HisnItem;
    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, p1

    move v0, v15

    goto :goto_0

    .line 168
    .end local v15    # "_columnIndexOfId":I
    .end local v17    # "_tmpId":I
    .end local v18    # "_tmpChapterId":I
    .end local v19    # "_tmpOrder":I
    .end local v20    # "_tmpText":Ljava/lang/String;
    .end local v21    # "_tmpCount":I
    .end local v22    # "_tmpFadl":Ljava/lang/String;
    .end local v23    # "_tmpSource":Ljava/lang/String;
    .end local v24    # "_tmpHokm":Ljava/lang/String;
    .local v0, "_columnIndexOfId":I
    :cond_0
    move v15, v0

    .line 170
    .end local v0    # "_columnIndexOfId":I
    .end local v4    # "_columnIndexOfChapterId":I
    .end local v5    # "_columnIndexOfOrder":I
    .end local v6    # "_columnIndexOfText":I
    .end local v7    # "_columnIndexOfCount":I
    .end local v8    # "_columnIndexOfFadl":I
    .end local v9    # "_columnIndexOfSource":I
    .end local v10    # "_columnIndexOfHokm":I
    .end local v11    # "_result":Ljava/util/List;
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 171
    return-object v11

    .line 170
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final chapterCount$lambda$7(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)I
    .locals 5
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 203
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 204
    const/4 v1, 0x0

    .line 205
    .local v1, "_result":I
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 206
    const/4 v2, 0x0

    .line 207
    .local v2, "_tmp":I
    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v2, v3

    .line 208
    nop

    .end local v1    # "_result":I
    .local v2, "_result":I
    goto :goto_0

    .line 210
    .end local v2    # "_result":I
    .restart local v1    # "_result":I
    :cond_0
    const/4 v2, 0x0

    .line 212
    .end local v1    # "_result":I
    .restart local v2    # "_result":I
    :goto_0
    nop

    .line 214
    .end local v2    # "_result":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 215
    return v2

    .line 214
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final chapters$lambda$4(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 10
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 109
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 110
    :try_start_0
    const-string v1, "id"

    invoke-static {v0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    .line 111
    .local v1, "_columnIndexOfId":I
    const-string v2, "order"

    invoke-static {v0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    .line 112
    .local v2, "_columnIndexOfOrder":I
    const-string v3, "name"

    invoke-static {v0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    .line 113
    .local v3, "_columnIndexOfName":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 114
    .local v4, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 115
    const/4 v5, 0x0

    .line 116
    .local v5, "_item":Lcom/example/data/HisnChapter;
    const/4 v6, 0x0

    .line 117
    .local v6, "_tmpId":I
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v6, v7

    .line 118
    const/4 v7, 0x0

    .line 119
    .local v7, "_tmpOrder":I
    invoke-interface {v0, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    long-to-int v7, v8

    .line 120
    const/4 v8, 0x0

    .line 121
    .local v8, "_tmpName":Ljava/lang/String;
    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v9

    .line 122
    .end local v8    # "_tmpName":Ljava/lang/String;
    .local v9, "_tmpName":Ljava/lang/String;
    new-instance v8, Lcom/example/data/HisnChapter;

    invoke-direct {v8, v6, v7, v9}, Lcom/example/data/HisnChapter;-><init>(IILjava/lang/String;)V

    .line 123
    .end local v5    # "_item":Lcom/example/data/HisnChapter;
    .local v8, "_item":Lcom/example/data/HisnChapter;
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 125
    .end local v6    # "_tmpId":I
    .end local v7    # "_tmpOrder":I
    .end local v8    # "_item":Lcom/example/data/HisnChapter;
    .end local v9    # "_tmpName":Ljava/lang/String;
    :cond_0
    nop

    .line 127
    .end local v1    # "_columnIndexOfId":I
    .end local v2    # "_columnIndexOfOrder":I
    .end local v3    # "_columnIndexOfName":I
    .end local v4    # "_result":Ljava/util/List;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 128
    return-object v4

    .line 127
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final chaptersReadOn$lambda$10(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 6
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$date"    # Ljava/lang/String;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 274
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 275
    const/4 v1, 0x1

    .line 276
    .local v1, "_argIndex":I
    :try_start_0
    invoke-interface {v0, v1, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 277
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 278
    .local v2, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 279
    const/4 v3, 0x0

    .line 280
    .local v3, "_item":I
    const/4 v4, 0x0

    invoke-interface {v0, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v3, v4

    .line 281
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 283
    .end local v3    # "_item":I
    :cond_0
    nop

    .line 285
    .end local v1    # "_argIndex":I
    .end local v2    # "_result":Ljava/util/List;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 286
    return-object v2

    .line 285
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final favorites$lambda$8(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 12
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 223
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 224
    :try_start_0
    const-string v1, "id"

    invoke-static {v0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    .line 225
    .local v1, "_columnIndexOfId":I
    const-string v2, "chapterId"

    invoke-static {v0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    .line 226
    .local v2, "_columnIndexOfChapterId":I
    const-string v3, "itemId"

    invoke-static {v0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    .line 227
    .local v3, "_columnIndexOfItemId":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 228
    .local v4, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 229
    const/4 v5, 0x0

    .line 230
    .local v5, "_item":Lcom/example/data/HisnFavorite;
    const-wide/16 v6, 0x0

    .line 231
    .local v6, "_tmpId":J
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    .line 232
    .end local v6    # "_tmpId":J
    .local v8, "_tmpId":J
    const/4 v6, 0x0

    .line 233
    .local v6, "_tmpChapterId":I
    invoke-interface {v0, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v10

    long-to-int v6, v10

    .line 234
    const/4 v7, 0x0

    .line 235
    .local v7, "_tmpItemId":I
    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v10

    long-to-int v7, v10

    .line 236
    new-instance v10, Lcom/example/data/HisnFavorite;

    invoke-direct {v10, v8, v9, v6, v7}, Lcom/example/data/HisnFavorite;-><init>(JII)V

    .line 237
    .end local v5    # "_item":Lcom/example/data/HisnFavorite;
    .local v10, "_item":Lcom/example/data/HisnFavorite;
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 239
    .end local v6    # "_tmpChapterId":I
    .end local v7    # "_tmpItemId":I
    .end local v8    # "_tmpId":J
    .end local v10    # "_item":Lcom/example/data/HisnFavorite;
    :cond_0
    nop

    .line 241
    .end local v1    # "_columnIndexOfId":I
    .end local v2    # "_columnIndexOfChapterId":I
    .end local v3    # "_columnIndexOfItemId":I
    .end local v4    # "_result":Ljava/util/List;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 242
    return-object v4

    .line 241
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final insertChapters$lambda$0(Lcom/example/data/HisnDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/HisnDao_Impl;
    .param p1, "$list"    # Ljava/util/List;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl;->__insertAdapterOfHisnChapter:Landroidx/room/EntityInsertAdapter;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0, p2, v1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V

    .line 88
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final insertItems$lambda$1(Lcom/example/data/HisnDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/HisnDao_Impl;
    .param p1, "$list"    # Ljava/util/List;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl;->__insertAdapterOfHisnItem:Landroidx/room/EntityInsertAdapter;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0, p2, v1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V

    .line 93
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final insertRead$lambda$3(Lcom/example/data/HisnDao_Impl;Lcom/example/data/HisnRead;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/example/data/HisnDao_Impl;
    .param p1, "$read"    # Lcom/example/data/HisnRead;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl;->__insertAdapterOfHisnRead:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V

    .line 103
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final itemCounts$lambda$6(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 9
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 179
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 180
    const/4 v1, 0x0

    .line 181
    .local v1, "_columnIndexOfChapterId":I
    const/4 v2, 0x1

    .line 182
    .local v2, "_columnIndexOfItemCount":I
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/List;

    .line 183
    .local v3, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 184
    const/4 v4, 0x0

    .line 185
    .local v4, "_item":Lcom/example/data/ChapterItemCount;
    const/4 v5, 0x0

    .line 186
    .local v5, "_tmpChapterId":I
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v5, v6

    .line 187
    const/4 v6, 0x0

    .line 188
    .local v6, "_tmpItemCount":I
    invoke-interface {v0, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v6, v7

    .line 189
    new-instance v7, Lcom/example/data/ChapterItemCount;

    invoke-direct {v7, v5, v6}, Lcom/example/data/ChapterItemCount;-><init>(II)V

    .line 190
    .end local v4    # "_item":Lcom/example/data/ChapterItemCount;
    .local v7, "_item":Lcom/example/data/ChapterItemCount;
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 192
    .end local v5    # "_tmpChapterId":I
    .end local v6    # "_tmpItemCount":I
    .end local v7    # "_item":Lcom/example/data/ChapterItemCount;
    :cond_0
    nop

    .line 194
    .end local v1    # "_columnIndexOfChapterId":I
    .end local v2    # "_columnIndexOfItemCount":I
    .end local v3    # "_result":Ljava/util/List;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 195
    return-object v3

    .line 194
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final readToday$lambda$9(Ljava/lang/String;ILjava/lang/String;Landroidx/sqlite/SQLiteConnection;)I
    .locals 6
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$chapterId"    # I
    .param p2, "$date"    # Ljava/lang/String;
    .param p3, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    invoke-interface {p3, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 250
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 251
    const/4 v1, 0x1

    .line 252
    .local v1, "_argIndex":I
    int-to-long v2, p1

    :try_start_0
    invoke-interface {v0, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 253
    const/4 v1, 0x2

    .line 254
    invoke-interface {v0, v1, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 255
    const/4 v2, 0x0

    .line 256
    .local v2, "_result":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 257
    const/4 v3, 0x0

    .line 258
    .local v3, "_tmp":I
    const/4 v4, 0x0

    invoke-interface {v0, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v3, v4

    .line 259
    nop

    .end local v2    # "_result":I
    .local v3, "_result":I
    goto :goto_0

    .line 261
    .end local v3    # "_result":I
    .restart local v2    # "_result":I
    :cond_0
    const/4 v3, 0x0

    .line 263
    .end local v2    # "_result":I
    .restart local v3    # "_result":I
    :goto_0
    nop

    .line 265
    .end local v1    # "_argIndex":I
    .end local v3    # "_result":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 266
    return v3

    .line 265
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final removeFavorite$lambda$11(Ljava/lang/String;IILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 4
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$chapterId"    # I
    .param p2, "$itemId"    # I
    .param p3, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    invoke-interface {p3, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 294
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 295
    const/4 v1, 0x1

    .line 296
    .local v1, "_argIndex":I
    int-to-long v2, p1

    :try_start_0
    invoke-interface {v0, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 297
    const/4 v1, 0x2

    .line 298
    int-to-long v2, p2

    invoke-interface {v0, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 299
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    .end local v1    # "_argIndex":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 302
    nop

    .line 303
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 301
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method


# virtual methods
.method public addFavorite(Lcom/example/data/HisnFavorite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "fav"    # Lcom/example/data/HisnFavorite;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/HisnFavorite;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 96
    nop

    .line 95
    new-instance v1, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0, p1}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda5;-><init>(Lcom/example/data/HisnDao_Impl;Lcom/example/data/HisnFavorite;)V

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

    .line 98
    return-object v0
.end method

.method public allItems()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnItem;",
            ">;>;"
        }
    .end annotation

    .line 133
    const-string v0, "SELECT * FROM hisn_item ORDER BY chapterId, `order`"

    .line 134
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "hisn_item"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda7;

    invoke-direct {v3, v0}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda7;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public chapterCount(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 200
    const-string v0, "SELECT COUNT(*) FROM hisn_chapter"

    .line 201
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda1;

    invoke-direct {v2, v0}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2, p1}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public chapters()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnChapter;",
            ">;>;"
        }
    .end annotation

    .line 106
    const-string v0, "SELECT * FROM hisn_chapter ORDER BY `order`"

    .line 107
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "hisn_chapter"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda9;

    invoke-direct {v3, v0}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda9;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public chaptersReadOn(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .param p1, "date"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    const-string v0, "SELECT chapterId FROM hisn_read WHERE dateString = ? GROUP BY chapterId"

    .line 272
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "hisn_read"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda0;

    invoke-direct {v3, v0, p1}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public favorites()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnFavorite;",
            ">;>;"
        }
    .end annotation

    .line 220
    const-string v0, "SELECT * FROM hisn_favorite"

    .line 221
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "hisn_favorite"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda11;

    invoke-direct {v3, v0}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda11;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public insertChapters(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "list"    # Ljava/util/List;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/HisnChapter;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda10;

    invoke-direct {v1, p0, p1}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda10;-><init>(Lcom/example/data/HisnDao_Impl;Ljava/util/List;)V

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

    .line 88
    return-object v0
.end method

.method public insertItems(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "list"    # Ljava/util/List;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/HisnItem;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 91
    nop

    .line 90
    new-instance v1, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0, p1}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda4;-><init>(Lcom/example/data/HisnDao_Impl;Ljava/util/List;)V

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

    .line 93
    return-object v0
.end method

.method public insertRead(Lcom/example/data/HisnRead;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "read"    # Lcom/example/data/HisnRead;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/HisnRead;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 101
    nop

    .line 100
    new-instance v1, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0, p1}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda3;-><init>(Lcom/example/data/HisnDao_Impl;Lcom/example/data/HisnRead;)V

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

    .line 103
    return-object v0
.end method

.method public itemCounts()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/ChapterItemCount;",
            ">;>;"
        }
    .end annotation

    .line 176
    const-string v0, "SELECT chapterId, COUNT(*) AS itemCount FROM hisn_item GROUP BY chapterId"

    .line 177
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "hisn_item"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda8;

    invoke-direct {v3, v0}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda8;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public readToday(ILjava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .param p1, "chapterId"    # I
    .param p2, "date"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    const-string v0, "SELECT COUNT(*) FROM hisn_read WHERE chapterId = ? AND dateString = ?"

    .line 248
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "hisn_read"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda2;

    invoke-direct {v3, v0, p1, p2}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public removeFavorite(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "chapterId"    # I
    .param p2, "itemId"    # I
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 291
    const-string v0, "DELETE FROM hisn_favorite WHERE chapterId = ? AND itemId = ?"

    .line 292
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/HisnDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;

    invoke-direct {v2, v0, p1, p2}, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;-><init>(Ljava/lang/String;II)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v3, v4, v2, p3}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
