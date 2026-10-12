.class public final Lcom/example/data/TagDao_Impl;
.super Ljava/lang/Object;
.source "TagDao_Impl.kt"

# interfaces
.implements Lcom/example/data/TagDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/data/TagDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\u00152\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0002\u0010\u0013J$\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u001aH\u0096@\u00a2\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u001a0$H\u0016J\u0018\u0010%\u001a\u0004\u0018\u00010\u00082\u0006\u0010&\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\'J\u0018\u0010(\u001a\u0004\u0018\u00010\u00082\u0006\u0010)\u001a\u00020*H\u0096@\u00a2\u0006\u0002\u0010+J\u0014\u0010,\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\u001a0$H\u0016J\u0018\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00a2\u0006\u0002\u0010/J\u001c\u00100\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u001a0$2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00a2\u0006\u0002\u0010/J\u0016\u00102\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\'J\u0016\u00103\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00a2\u0006\u0002\u0010/J\u0016\u00104\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\'J$\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080:09H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"
    }
    d2 = {
        "Lcom/example/data/TagDao_Impl;",
        "Lcom/example/data/TagDao;",
        "__db",
        "Landroidx/room/RoomDatabase;",
        "<init>",
        "(Landroidx/room/RoomDatabase;)V",
        "__insertAdapterOfTag",
        "Landroidx/room/EntityInsertAdapter;",
        "Lcom/example/data/Tag;",
        "__insertAdapterOfDhikrTagCrossRef",
        "Lcom/example/data/DhikrTagCrossRef;",
        "__deleteAdapterOfTag",
        "Landroidx/room/EntityDeleteOrUpdateAdapter;",
        "__updateAdapterOfTag",
        "__converters",
        "Lcom/example/data/Converters;",
        "insertTag",
        "",
        "tag",
        "(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "insertDhikrTagCrossRef",
        "",
        "crossRef",
        "(Lcom/example/data/DhikrTagCrossRef;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "insertDhikrTagCrossRefs",
        "crossRefs",
        "",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteTag",
        "updateTag",
        "updateDhikrTags",
        "dhikrId",
        "",
        "tagIds",
        "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getAllTags",
        "Lkotlinx/coroutines/flow/Flow;",
        "getTagById",
        "tagId",
        "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getTagByName",
        "name",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getDhikrsWithTags",
        "Lcom/example/data/DhikrWithTags;",
        "getDhikrWithTagsById",
        "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getTagsForDhikr",
        "getTagsForDhikrSync",
        "deleteTagById",
        "deleteTagsForDhikr",
        "deleteDhikrRefsForTag",
        "__fetchRelationshiptagTableAscomExampleDataTag",
        "_connection",
        "Landroidx/sqlite/SQLiteConnection;",
        "_map",
        "Landroidx/collection/LongSparseArray;",
        "",
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

.field public static final Companion:Lcom/example/data/TagDao_Impl$Companion;


# instance fields
.field private final __converters:Lcom/example/data/Converters;

.field private final __db:Landroidx/room/RoomDatabase;

.field private final __deleteAdapterOfTag:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/example/data/Tag;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfDhikrTagCrossRef:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/example/data/DhikrTagCrossRef;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfTag:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/example/data/Tag;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfTag:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/example/data/Tag;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/data/TagDao_Impl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/data/TagDao_Impl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/data/TagDao_Impl;->Companion:Lcom/example/data/TagDao_Impl$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/data/TagDao_Impl;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .param p1, "__db"    # Landroidx/room/RoomDatabase;

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Lcom/example/data/Converters;

    invoke-direct {v0}, Lcom/example/data/Converters;-><init>()V

    iput-object v0, p0, Lcom/example/data/TagDao_Impl;->__converters:Lcom/example/data/Converters;

    .line 45
    nop

    .line 46
    iput-object p1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 47
    new-instance v0, Lcom/example/data/TagDao_Impl$1;

    invoke-direct {v0}, Lcom/example/data/TagDao_Impl$1;-><init>()V

    check-cast v0, Landroidx/room/EntityInsertAdapter;

    iput-object v0, p0, Lcom/example/data/TagDao_Impl;->__insertAdapterOfTag:Landroidx/room/EntityInsertAdapter;

    .line 57
    new-instance v0, Lcom/example/data/TagDao_Impl$2;

    invoke-direct {v0}, Lcom/example/data/TagDao_Impl$2;-><init>()V

    check-cast v0, Landroidx/room/EntityInsertAdapter;

    iput-object v0, p0, Lcom/example/data/TagDao_Impl;->__insertAdapterOfDhikrTagCrossRef:Landroidx/room/EntityInsertAdapter;

    .line 66
    new-instance v0, Lcom/example/data/TagDao_Impl$3;

    invoke-direct {v0}, Lcom/example/data/TagDao_Impl$3;-><init>()V

    check-cast v0, Landroidx/room/EntityDeleteOrUpdateAdapter;

    iput-object v0, p0, Lcom/example/data/TagDao_Impl;->__deleteAdapterOfTag:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 73
    new-instance v0, Lcom/example/data/TagDao_Impl$4;

    invoke-direct {v0}, Lcom/example/data/TagDao_Impl$4;-><init>()V

    check-cast v0, Landroidx/room/EntityDeleteOrUpdateAdapter;

    iput-object v0, p0, Lcom/example/data/TagDao_Impl;->__updateAdapterOfTag:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 84
    nop

    .line 31
    return-void
.end method

.method private final __fetchRelationshiptagTableAscomExampleDataTag(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/LongSparseArray;)V
    .locals 23
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;
    .param p2, "_map"    # Landroidx/collection/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/sqlite/SQLiteConnection;",
            "Landroidx/collection/LongSparseArray<",
            "Ljava/util/List<",
            "Lcom/example/data/Tag;",
            ">;>;)V"
        }
    .end annotation

    .line 439
    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v2}, Landroidx/collection/LongSparseArray;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 440
    return-void

    .line 442
    :cond_0
    invoke-virtual {v2}, Landroidx/collection/LongSparseArray;->size()I

    move-result v0

    const/16 v3, 0x3e7

    if-le v0, v3, :cond_1

    .line 443
    new-instance v0, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda1;

    move-object/from16 v3, p0

    invoke-direct {v0, v3, v1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda1;-><init>(Lcom/example/data/TagDao_Impl;Landroidx/sqlite/SQLiteConnection;)V

    const/4 v4, 0x1

    invoke-static {v2, v4, v0}, Landroidx/room/util/RelationUtil;->recursiveFetchLongSparseArray(Landroidx/collection/LongSparseArray;ZLkotlin/jvm/functions/Function1;)V

    .line 446
    return-void

    .line 448
    :cond_1
    move-object/from16 v3, p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v4, v0

    .line 449
    .local v4, "_stringBuilder":Ljava/lang/StringBuilder;
    const-string v0, "SELECT `tag_table`.`tagId` AS `tagId`,`tag_table`.`name` AS `name`,`tag_table`.`colorHex` AS `colorHex`,_junction.`dhikrId` FROM `dhikr_tag_cross_ref` AS _junction INNER JOIN `tag_table` ON (_junction.`tagId` = `tag_table`.`tagId`) WHERE _junction.`dhikrId` IN ("

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    invoke-virtual {v2}, Landroidx/collection/LongSparseArray;->size()I

    move-result v5

    .line 451
    .local v5, "_inputSize":I
    invoke-static {v4, v5}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    .line 452
    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v6, "toString(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    .line 454
    .local v6, "_sql":Ljava/lang/String;
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v7

    .line 455
    .local v7, "_stmt":Landroidx/sqlite/SQLiteStatement;
    const/4 v0, 0x1

    .line 456
    .local v0, "_argIndex":I
    const/4 v8, 0x0

    .local v8, "i":I
    invoke-virtual {v2}, Landroidx/collection/LongSparseArray;->size()I

    move-result v9

    move/from16 v22, v8

    move v8, v0

    move/from16 v0, v22

    .local v0, "i":I
    .local v8, "_argIndex":I
    :goto_0
    if-ge v0, v9, :cond_2

    .line 457
    invoke-virtual {v2, v0}, Landroidx/collection/LongSparseArray;->keyAt(I)J

    move-result-wide v10

    .line 458
    .local v10, "_item":J
    invoke-interface {v7, v8, v10, v11}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 459
    nop

    .end local v10    # "_item":J
    add-int/lit8 v8, v8, 0x1

    .line 456
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 461
    .end local v0    # "i":I
    :cond_2
    nop

    .line 463
    const/4 v0, 0x3

    .line 464
    .local v0, "_itemKeyIndex":I
    nop

    .line 467
    const/4 v9, 0x0

    .line 468
    .local v9, "_columnIndexOfTagId":I
    const/4 v10, 0x1

    .line 469
    .local v10, "_columnIndexOfName":I
    const/4 v11, 0x2

    .line 470
    .local v11, "_columnIndexOfColorHex":I
    :goto_1
    :try_start_0
    invoke-interface {v7}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v12

    if-eqz v12, :cond_4

    .line 471
    const-wide/16 v12, 0x0

    .line 472
    .local v12, "_tmpKey":J
    invoke-interface {v7, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    .line 473
    .end local v12    # "_tmpKey":J
    .local v14, "_tmpKey":J
    invoke-virtual {v2, v14, v15}, Landroidx/collection/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    .line 474
    .local v12, "_tmpRelation":Ljava/util/List;
    if-eqz v12, :cond_3

    .line 475
    const/4 v13, 0x0

    .line 476
    .local v13, "_item_1":Lcom/example/data/Tag;
    const-wide/16 v16, 0x0

    .line 477
    .local v16, "_tmpTagId":J
    invoke-interface {v7, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v18

    move-wide/from16 v20, v18

    .line 478
    .end local v16    # "_tmpTagId":J
    .local v20, "_tmpTagId":J
    const/16 v16, 0x0

    .line 479
    .local v16, "_tmpName":Ljava/lang/String;
    invoke-interface {v7, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v18, v17

    .line 480
    .end local v16    # "_tmpName":Ljava/lang/String;
    .local v18, "_tmpName":Ljava/lang/String;
    const/16 v16, 0x0

    .line 481
    .local v16, "_tmpColorHex":Ljava/lang/String;
    invoke-interface {v7, v11}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v19, v17

    .line 482
    .end local v16    # "_tmpColorHex":Ljava/lang/String;
    .local v19, "_tmpColorHex":Ljava/lang/String;
    move/from16 v16, v0

    .end local v0    # "_itemKeyIndex":I
    .local v16, "_itemKeyIndex":I
    new-instance v0, Lcom/example/data/Tag;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v17, v4

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move-wide/from16 v1, v20

    .end local v18    # "_tmpName":Ljava/lang/String;
    .end local v19    # "_tmpColorHex":Ljava/lang/String;
    .end local v20    # "_tmpTagId":J
    .local v1, "_tmpTagId":J
    .local v3, "_tmpName":Ljava/lang/String;
    .local v4, "_tmpColorHex":Ljava/lang/String;
    .local v17, "_stringBuilder":Ljava/lang/StringBuilder;
    :try_start_1
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 483
    .end local v13    # "_item_1":Lcom/example/data/Tag;
    .local v0, "_item_1":Lcom/example/data/Tag;
    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v0, v16

    move-object/from16 v4, v17

    .end local v0    # "_item_1":Lcom/example/data/Tag;
    .end local v1    # "_tmpTagId":J
    .end local v3    # "_tmpName":Ljava/lang/String;
    .end local v4    # "_tmpColorHex":Ljava/lang/String;
    goto :goto_1

    .line 487
    .end local v9    # "_columnIndexOfTagId":I
    .end local v10    # "_columnIndexOfName":I
    .end local v11    # "_columnIndexOfColorHex":I
    .end local v12    # "_tmpRelation":Ljava/util/List;
    .end local v14    # "_tmpKey":J
    .end local v16    # "_itemKeyIndex":I
    :catchall_0
    move-exception v0

    goto :goto_2

    .line 474
    .end local v17    # "_stringBuilder":Ljava/lang/StringBuilder;
    .local v0, "_itemKeyIndex":I
    .local v4, "_stringBuilder":Ljava/lang/StringBuilder;
    .restart local v9    # "_columnIndexOfTagId":I
    .restart local v10    # "_columnIndexOfName":I
    .restart local v11    # "_columnIndexOfColorHex":I
    .restart local v12    # "_tmpRelation":Ljava/util/List;
    .restart local v14    # "_tmpKey":J
    :cond_3
    move/from16 v16, v0

    move-object/from16 v17, v4

    .end local v0    # "_itemKeyIndex":I
    .end local v4    # "_stringBuilder":Ljava/lang/StringBuilder;
    .restart local v16    # "_itemKeyIndex":I
    .restart local v17    # "_stringBuilder":Ljava/lang/StringBuilder;
    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    goto :goto_1

    .line 470
    .end local v12    # "_tmpRelation":Ljava/util/List;
    .end local v14    # "_tmpKey":J
    .end local v16    # "_itemKeyIndex":I
    .end local v17    # "_stringBuilder":Ljava/lang/StringBuilder;
    .restart local v0    # "_itemKeyIndex":I
    .restart local v4    # "_stringBuilder":Ljava/lang/StringBuilder;
    :cond_4
    move/from16 v16, v0

    move-object/from16 v17, v4

    .line 487
    .end local v0    # "_itemKeyIndex":I
    .end local v4    # "_stringBuilder":Ljava/lang/StringBuilder;
    .end local v9    # "_columnIndexOfTagId":I
    .end local v10    # "_columnIndexOfName":I
    .end local v11    # "_columnIndexOfColorHex":I
    .restart local v17    # "_stringBuilder":Ljava/lang/StringBuilder;
    invoke-interface {v7}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 488
    nop

    .line 489
    return-void

    .line 487
    .end local v17    # "_stringBuilder":Ljava/lang/StringBuilder;
    .restart local v4    # "_stringBuilder":Ljava/lang/StringBuilder;
    :catchall_1
    move-exception v0

    move-object/from16 v17, v4

    .end local v4    # "_stringBuilder":Ljava/lang/StringBuilder;
    .restart local v17    # "_stringBuilder":Ljava/lang/StringBuilder;
    :goto_2
    invoke-interface {v7}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final __fetchRelationshiptagTableAscomExampleDataTag$lambda$15(Lcom/example/data/TagDao_Impl;Landroidx/sqlite/SQLiteConnection;Landroidx/collection/LongSparseArray;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/example/data/TagDao_Impl;
    .param p1, "$_connection"    # Landroidx/sqlite/SQLiteConnection;
    .param p2, "_tmpMap"    # Landroidx/collection/LongSparseArray;

    const-string v0, "_tmpMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 444
    invoke-direct {p0, p1, p2}, Lcom/example/data/TagDao_Impl;->__fetchRelationshiptagTableAscomExampleDataTag(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/LongSparseArray;)V

    .line 445
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final synthetic access$updateDhikrTags$s-1797400136(Lcom/example/data/TagDao_Impl;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/example/data/TagDao_Impl;
    .param p1, "dhikrId"    # I
    .param p2, "tagIds"    # Ljava/util/List;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 29
    invoke-static {p0, p1, p2, p3}, Lcom/example/data/TagDao$-CC;->$default$updateDhikrTags(Lcom/example/data/TagDao;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static final deleteDhikrRefsForTag$lambda$14(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 2
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$tagId"    # J
    .param p3, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 426
    invoke-interface {p3, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 427
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 428
    const/4 v1, 0x1

    .line 429
    .local v1, "_argIndex":I
    :try_start_0
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 430
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 432
    .end local v1    # "_argIndex":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 433
    nop

    .line 434
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 432
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final deleteTag$lambda$3(Lcom/example/data/TagDao_Impl;Lcom/example/data/Tag;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/example/data/TagDao_Impl;
    .param p1, "$tag"    # Lcom/example/data/Tag;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__deleteAdapterOfTag:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handle(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I

    .line 105
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final deleteTagById$lambda$12(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 2
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$tagId"    # J
    .param p3, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    invoke-interface {p3, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 399
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 400
    const/4 v1, 0x1

    .line 401
    .local v1, "_argIndex":I
    :try_start_0
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 402
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 404
    .end local v1    # "_argIndex":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 405
    nop

    .line 406
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 404
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final deleteTagsForDhikr$lambda$13(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 4
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$dhikrId"    # I
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 413
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 414
    const/4 v1, 0x1

    .line 415
    .local v1, "_argIndex":I
    int-to-long v2, p1

    :try_start_0
    invoke-interface {v0, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 416
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 418
    .end local v1    # "_argIndex":I
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 419
    nop

    .line 420
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 418
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getAllTags$lambda$5(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 11
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 121
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 122
    :try_start_0
    const-string v1, "tagId"

    invoke-static {v0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    .line 123
    .local v1, "_columnIndexOfTagId":I
    const-string v2, "name"

    invoke-static {v0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    .line 124
    .local v2, "_columnIndexOfName":I
    const-string v3, "colorHex"

    invoke-static {v0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    .line 125
    .local v3, "_columnIndexOfColorHex":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 126
    .local v4, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 127
    const/4 v5, 0x0

    .line 128
    .local v5, "_item":Lcom/example/data/Tag;
    const-wide/16 v6, 0x0

    .line 129
    .local v6, "_tmpTagId":J
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    .line 130
    .end local v6    # "_tmpTagId":J
    .local v8, "_tmpTagId":J
    const/4 v6, 0x0

    .line 131
    .local v6, "_tmpName":Ljava/lang/String;
    invoke-interface {v0, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    .line 132
    .end local v6    # "_tmpName":Ljava/lang/String;
    .local v7, "_tmpName":Ljava/lang/String;
    const/4 v6, 0x0

    .line 133
    .local v6, "_tmpColorHex":Ljava/lang/String;
    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v10

    .line 134
    .end local v6    # "_tmpColorHex":Ljava/lang/String;
    .local v10, "_tmpColorHex":Ljava/lang/String;
    new-instance v6, Lcom/example/data/Tag;

    invoke-direct {v6, v8, v9, v7, v10}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 135
    .end local v5    # "_item":Lcom/example/data/Tag;
    .local v6, "_item":Lcom/example/data/Tag;
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 137
    .end local v6    # "_item":Lcom/example/data/Tag;
    .end local v7    # "_tmpName":Ljava/lang/String;
    .end local v8    # "_tmpTagId":J
    .end local v10    # "_tmpColorHex":Ljava/lang/String;
    :cond_0
    nop

    .line 139
    .end local v1    # "_columnIndexOfTagId":I
    .end local v2    # "_columnIndexOfName":I
    .end local v3    # "_columnIndexOfColorHex":I
    .end local v4    # "_result":Ljava/util/List;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 140
    return-object v4

    .line 139
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getDhikrWithTagsById$lambda$9(Ljava/lang/String;ILcom/example/data/TagDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/example/data/DhikrWithTags;
    .locals 33
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$dhikrId"    # I
    .param p2, "this$0"    # Lcom/example/data/TagDao_Impl;
    .param p3, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v0, "_connection"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    move-object/from16 v3, p0

    invoke-interface {v2, v3}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v4

    .line 272
    .local v4, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 273
    const/4 v0, 0x1

    .line 274
    .local v0, "_argIndex":I
    move/from16 v5, p1

    int-to-long v6, v5

    :try_start_0
    invoke-interface {v4, v0, v6, v7}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 275
    const-string v6, "id"

    invoke-static {v4, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 276
    .local v6, "_columnIndexOfId":I
    const-string v7, "title"

    invoke-static {v4, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    .line 277
    .local v7, "_columnIndexOfTitle":I
    const-string v8, "content"

    invoke-static {v4, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    .line 278
    .local v8, "_columnIndexOfContent":I
    const-string v9, "isFavorite"

    invoke-static {v4, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    .line 279
    .local v9, "_columnIndexOfIsFavorite":I
    const-string v10, "reminderTimes"

    invoke-static {v4, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    .line 280
    .local v10, "_columnIndexOfReminderTimes":I
    const-string v11, "isEnabled"

    invoke-static {v4, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    .line 281
    .local v11, "_columnIndexOfIsEnabled":I
    const-string v12, "readCount"

    invoke-static {v4, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    .line 282
    .local v12, "_columnIndexOfReadCount":I
    const-string v13, "lastReadTime"

    invoke-static {v4, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    .line 283
    .local v13, "_columnIndexOfLastReadTime":I
    new-instance v14, Landroidx/collection/LongSparseArray;

    const/4 v15, 0x0

    move/from16 v16, v0

    .end local v0    # "_argIndex":I
    .local v16, "_argIndex":I
    const/4 v0, 0x1

    const/4 v3, 0x0

    invoke-direct {v14, v3, v0, v15}, Landroidx/collection/LongSparseArray;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 284
    .local v14, "_collectionTags":Landroidx/collection/LongSparseArray;
    :goto_0
    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v15

    if-eqz v15, :cond_1

    .line 285
    const-wide/16 v17, 0x0

    .line 286
    .local v17, "_tmpKey":J
    invoke-interface {v4, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-wide/from16 v21, v19

    .line 287
    .end local v17    # "_tmpKey":J
    .local v21, "_tmpKey":J
    move-object v15, v4

    move-wide/from16 v3, v21

    .end local v4    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .end local v21    # "_tmpKey":J
    .local v3, "_tmpKey":J
    .local v15, "_stmt":Landroidx/sqlite/SQLiteStatement;
    :try_start_1
    invoke-virtual {v14, v3, v4}, Landroidx/collection/LongSparseArray;->containsKey(J)Z

    move-result v18

    if-nez v18, :cond_0

    .line 288
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, v18

    check-cast v0, Ljava/util/List;

    invoke-virtual {v14, v3, v4, v0}, Landroidx/collection/LongSparseArray;->put(JLjava/lang/Object;)V

    move-object v4, v15

    const/4 v0, 0x1

    const/4 v3, 0x0

    .end local v3    # "_tmpKey":J
    goto :goto_0

    .line 287
    .restart local v3    # "_tmpKey":J
    :cond_0
    move-object v4, v15

    const/4 v0, 0x1

    const/4 v3, 0x0

    goto :goto_0

    .line 291
    .end local v3    # "_tmpKey":J
    .end local v15    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .restart local v4    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    :cond_1
    move-object v15, v4

    .end local v4    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .restart local v15    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    invoke-interface {v15}, Landroidx/sqlite/SQLiteStatement;->reset()V

    .line 292
    invoke-direct {v1, v2, v14}, Lcom/example/data/TagDao_Impl;->__fetchRelationshiptagTableAscomExampleDataTag(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/LongSparseArray;)V

    .line 293
    const/4 v0, 0x0

    .line 294
    .local v0, "_result":Lcom/example/data/DhikrWithTags;
    invoke-interface {v15}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 295
    const/4 v3, 0x0

    .line 296
    .local v3, "_tmpDhikr":Lcom/example/data/Dhikr;
    const/4 v4, 0x0

    .line 297
    .local v4, "_tmpId":I
    move-object/from16 v18, v3

    .end local v3    # "_tmpDhikr":Lcom/example/data/Dhikr;
    .local v18, "_tmpDhikr":Lcom/example/data/Dhikr;
    invoke-interface {v15, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    .line 298
    .end local v4    # "_tmpId":I
    .local v2, "_tmpId":I
    const/4 v3, 0x0

    .line 299
    .local v3, "_tmpTitle":Ljava/lang/String;
    invoke-interface {v15, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v22

    .line 300
    .end local v3    # "_tmpTitle":Ljava/lang/String;
    .local v22, "_tmpTitle":Ljava/lang/String;
    const/4 v3, 0x0

    .line 301
    .local v3, "_tmpContent":Ljava/lang/String;
    invoke-interface {v15, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v23

    .line 302
    .end local v3    # "_tmpContent":Ljava/lang/String;
    .local v23, "_tmpContent":Ljava/lang/String;
    const/4 v3, 0x0

    .line 303
    .local v3, "_tmpIsFavorite":Z
    const/4 v4, 0x0

    .line 304
    .local v4, "_tmp":I
    move/from16 v21, v2

    move/from16 v20, v3

    .end local v2    # "_tmpId":I
    .end local v3    # "_tmpIsFavorite":Z
    .local v20, "_tmpIsFavorite":Z
    .local v21, "_tmpId":I
    invoke-interface {v15, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    .line 305
    .end local v4    # "_tmp":I
    .local v2, "_tmp":I
    if-eqz v2, :cond_2

    const/16 v24, 0x1

    goto :goto_1

    :cond_2
    const/16 v24, 0x0

    .line 306
    .end local v20    # "_tmpIsFavorite":Z
    .local v24, "_tmpIsFavorite":Z
    :goto_1
    const/4 v3, 0x0

    .line 307
    .local v3, "_tmpReminderTimes":Ljava/util/List;
    const/4 v4, 0x0

    .line 308
    .local v4, "_tmp_1":Ljava/lang/String;
    invoke-interface {v15, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v4, v20

    .line 309
    move-object/from16 v30, v0

    .end local v0    # "_result":Lcom/example/data/DhikrWithTags;
    .local v30, "_result":Lcom/example/data/DhikrWithTags;
    iget-object v0, v1, Lcom/example/data/TagDao_Impl;->__converters:Lcom/example/data/Converters;

    invoke-virtual {v0, v4}, Lcom/example/data/Converters;->fromString(Ljava/lang/String;)Ljava/util/List;

    move-result-object v25

    .line 310
    .end local v3    # "_tmpReminderTimes":Ljava/util/List;
    .local v25, "_tmpReminderTimes":Ljava/util/List;
    const/4 v0, 0x0

    .line 311
    .local v0, "_tmpIsEnabled":Z
    const/4 v3, 0x0

    .line 312
    .local v3, "_tmp_2":I
    move/from16 v20, v0

    .end local v0    # "_tmpIsEnabled":Z
    .local v20, "_tmpIsEnabled":Z
    invoke-interface {v15, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 313
    .end local v3    # "_tmp_2":I
    .local v0, "_tmp_2":I
    if-eqz v0, :cond_3

    const/16 v26, 0x1

    goto :goto_2

    :cond_3
    const/16 v26, 0x0

    .line 314
    .end local v20    # "_tmpIsEnabled":Z
    .local v26, "_tmpIsEnabled":Z
    :goto_2
    const/4 v1, 0x0

    .line 315
    .local v1, "_tmpReadCount":I
    move v3, v0

    move/from16 v17, v1

    .end local v0    # "_tmp_2":I
    .end local v1    # "_tmpReadCount":I
    .restart local v3    # "_tmp_2":I
    .local v17, "_tmpReadCount":I
    invoke-interface {v15, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    .line 316
    .end local v17    # "_tmpReadCount":I
    .local v0, "_tmpReadCount":I
    const-wide/16 v19, 0x0

    .line 317
    .local v19, "_tmpLastReadTime":J
    invoke-interface {v15, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v28

    .line 319
    .end local v19    # "_tmpLastReadTime":J
    .local v28, "_tmpLastReadTime":J
    new-instance v20, Lcom/example/data/Dhikr;

    move/from16 v27, v0

    .end local v0    # "_tmpReadCount":I
    .local v27, "_tmpReadCount":I
    invoke-direct/range {v20 .. v29}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJ)V

    .line 318
    move-object/from16 v0, v20

    .line 320
    .end local v18    # "_tmpDhikr":Lcom/example/data/Dhikr;
    .local v0, "_tmpDhikr":Lcom/example/data/Dhikr;
    const/4 v1, 0x0

    .line 321
    .local v1, "_tmpTagsCollection":Ljava/util/List;
    const-wide/16 v17, 0x0

    .line 322
    .local v17, "_tmpKey_1":J
    invoke-interface {v15, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v19

    move-wide/from16 v31, v19

    .line 323
    .end local v17    # "_tmpKey_1":J
    .local v31, "_tmpKey_1":J
    move-object/from16 v18, v1

    move/from16 v17, v2

    move-wide/from16 v1, v31

    .end local v2    # "_tmp":I
    .end local v31    # "_tmpKey_1":J
    .local v1, "_tmpKey_1":J
    .local v17, "_tmp":I
    .local v18, "_tmpTagsCollection":Ljava/util/List;
    invoke-virtual {v14, v1, v2}, Landroidx/collection/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v19

    if-eqz v19, :cond_4

    check-cast v19, Ljava/util/List;

    move-object/from16 v18, v19

    .line 324
    move-wide/from16 v19, v1

    .end local v1    # "_tmpKey_1":J
    .local v19, "_tmpKey_1":J
    new-instance v1, Lcom/example/data/DhikrWithTags;

    move-object/from16 v2, v18

    .end local v18    # "_tmpTagsCollection":Ljava/util/List;
    .local v2, "_tmpTagsCollection":Ljava/util/List;
    invoke-direct {v1, v0, v2}, Lcom/example/data/DhikrWithTags;-><init>(Lcom/example/data/Dhikr;Ljava/util/List;)V

    .end local v0    # "_tmpDhikr":Lcom/example/data/Dhikr;
    .end local v2    # "_tmpTagsCollection":Ljava/util/List;
    .end local v3    # "_tmp_2":I
    .end local v4    # "_tmp_1":Ljava/lang/String;
    .end local v17    # "_tmp":I
    .end local v19    # "_tmpKey_1":J
    .end local v21    # "_tmpId":I
    .end local v22    # "_tmpTitle":Ljava/lang/String;
    .end local v23    # "_tmpContent":Ljava/lang/String;
    .end local v24    # "_tmpIsFavorite":Z
    .end local v25    # "_tmpReminderTimes":Ljava/util/List;
    .end local v26    # "_tmpIsEnabled":Z
    .end local v27    # "_tmpReadCount":I
    .end local v28    # "_tmpLastReadTime":J
    .end local v30    # "_result":Lcom/example/data/DhikrWithTags;
    .local v1, "_result":Lcom/example/data/DhikrWithTags;
    goto :goto_3

    .line 323
    .restart local v0    # "_tmpDhikr":Lcom/example/data/Dhikr;
    .local v1, "_tmpKey_1":J
    .restart local v3    # "_tmp_2":I
    .restart local v4    # "_tmp_1":Ljava/lang/String;
    .restart local v17    # "_tmp":I
    .restart local v18    # "_tmpTagsCollection":Ljava/util/List;
    .restart local v21    # "_tmpId":I
    .restart local v22    # "_tmpTitle":Ljava/lang/String;
    .restart local v23    # "_tmpContent":Ljava/lang/String;
    .restart local v24    # "_tmpIsFavorite":Z
    .restart local v25    # "_tmpReminderTimes":Ljava/util/List;
    .restart local v26    # "_tmpIsEnabled":Z
    .restart local v27    # "_tmpReadCount":I
    .restart local v28    # "_tmpLastReadTime":J
    .restart local v30    # "_result":Lcom/example/data/DhikrWithTags;
    :cond_4
    move-wide/from16 v19, v1

    .end local v1    # "_tmpKey_1":J
    .restart local v19    # "_tmpKey_1":J
    const-string v1, "Required value was null."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .end local v15    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .end local p0    # "$_sql":Ljava/lang/String;
    .end local p1    # "$dhikrId":I
    .end local p2    # "this$0":Lcom/example/data/TagDao_Impl;
    .end local p3    # "_connection":Landroidx/sqlite/SQLiteConnection;
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 326
    .end local v3    # "_tmp_2":I
    .end local v4    # "_tmp_1":Ljava/lang/String;
    .end local v17    # "_tmp":I
    .end local v18    # "_tmpTagsCollection":Ljava/util/List;
    .end local v19    # "_tmpKey_1":J
    .end local v21    # "_tmpId":I
    .end local v22    # "_tmpTitle":Ljava/lang/String;
    .end local v23    # "_tmpContent":Ljava/lang/String;
    .end local v24    # "_tmpIsFavorite":Z
    .end local v25    # "_tmpReminderTimes":Ljava/util/List;
    .end local v26    # "_tmpIsEnabled":Z
    .end local v27    # "_tmpReadCount":I
    .end local v28    # "_tmpLastReadTime":J
    .end local v30    # "_result":Lcom/example/data/DhikrWithTags;
    .local v0, "_result":Lcom/example/data/DhikrWithTags;
    .restart local v15    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .restart local p0    # "$_sql":Ljava/lang/String;
    .restart local p1    # "$dhikrId":I
    .restart local p2    # "this$0":Lcom/example/data/TagDao_Impl;
    .restart local p3    # "_connection":Landroidx/sqlite/SQLiteConnection;
    :cond_5
    move-object/from16 v30, v0

    .end local v0    # "_result":Lcom/example/data/DhikrWithTags;
    .restart local v30    # "_result":Lcom/example/data/DhikrWithTags;
    const/4 v1, 0x0

    .line 328
    .end local v30    # "_result":Lcom/example/data/DhikrWithTags;
    .local v1, "_result":Lcom/example/data/DhikrWithTags;
    :goto_3
    nop

    .line 330
    .end local v1    # "_result":Lcom/example/data/DhikrWithTags;
    .end local v6    # "_columnIndexOfId":I
    .end local v7    # "_columnIndexOfTitle":I
    .end local v8    # "_columnIndexOfContent":I
    .end local v9    # "_columnIndexOfIsFavorite":I
    .end local v10    # "_columnIndexOfReminderTimes":I
    .end local v11    # "_columnIndexOfIsEnabled":I
    .end local v12    # "_columnIndexOfReadCount":I
    .end local v13    # "_columnIndexOfLastReadTime":I
    .end local v14    # "_collectionTags":Landroidx/collection/LongSparseArray;
    .end local v16    # "_argIndex":I
    invoke-interface {v15}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 331
    return-object v1

    .line 330
    :catchall_0
    move-exception v0

    goto :goto_4

    .end local v15    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .local v4, "_stmt":Landroidx/sqlite/SQLiteStatement;
    :catchall_1
    move-exception v0

    move-object v15, v4

    .end local v4    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .restart local v15    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    :goto_4
    invoke-interface {v15}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final getDhikrsWithTags$lambda$8(Ljava/lang/String;Lcom/example/data/TagDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 36
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "this$0"    # Lcom/example/data/TagDao_Impl;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v0, "_connection"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    move-object/from16 v3, p0

    invoke-interface {v2, v3}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v4

    .line 207
    .local v4, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 208
    :try_start_0
    const-string v0, "id"

    invoke-static {v4, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    .line 209
    .local v0, "_columnIndexOfId":I
    const-string v5, "title"

    invoke-static {v4, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    .line 210
    .local v5, "_columnIndexOfTitle":I
    const-string v6, "content"

    invoke-static {v4, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    .line 211
    .local v6, "_columnIndexOfContent":I
    const-string v7, "isFavorite"

    invoke-static {v4, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    .line 212
    .local v7, "_columnIndexOfIsFavorite":I
    const-string v8, "reminderTimes"

    invoke-static {v4, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    .line 213
    .local v8, "_columnIndexOfReminderTimes":I
    const-string v9, "isEnabled"

    invoke-static {v4, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    .line 214
    .local v9, "_columnIndexOfIsEnabled":I
    const-string v10, "readCount"

    invoke-static {v4, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    .line 215
    .local v10, "_columnIndexOfReadCount":I
    const-string v11, "lastReadTime"

    invoke-static {v4, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    .line 216
    .local v11, "_columnIndexOfLastReadTime":I
    new-instance v12, Landroidx/collection/LongSparseArray;

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-direct {v12, v15, v14, v13}, Landroidx/collection/LongSparseArray;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 217
    .local v12, "_collectionTags":Landroidx/collection/LongSparseArray;
    :goto_0
    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v13

    if-eqz v13, :cond_1

    .line 218
    const-wide/16 v16, 0x0

    .line 219
    .local v16, "_tmpKey":J
    invoke-interface {v4, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v18

    move-wide/from16 v20, v18

    .line 220
    .end local v16    # "_tmpKey":J
    .local v20, "_tmpKey":J
    move-wide/from16 v14, v20

    .end local v20    # "_tmpKey":J
    .local v14, "_tmpKey":J
    invoke-virtual {v12, v14, v15}, Landroidx/collection/LongSparseArray;->containsKey(J)Z

    move-result v17

    if-nez v17, :cond_0

    .line 221
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v13, v17

    check-cast v13, Ljava/util/List;

    invoke-virtual {v12, v14, v15, v13}, Landroidx/collection/LongSparseArray;->put(JLjava/lang/Object;)V

    const/4 v14, 0x1

    const/4 v15, 0x0

    .end local v14    # "_tmpKey":J
    goto :goto_0

    .line 220
    .restart local v14    # "_tmpKey":J
    :cond_0
    const/4 v14, 0x1

    const/4 v15, 0x0

    goto :goto_0

    .line 224
    .end local v14    # "_tmpKey":J
    :cond_1
    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->reset()V

    .line 225
    invoke-direct {v1, v2, v12}, Lcom/example/data/TagDao_Impl;->__fetchRelationshiptagTableAscomExampleDataTag(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/LongSparseArray;)V

    .line 226
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    check-cast v13, Ljava/util/List;

    .line 227
    .local v13, "_result":Ljava/util/List;
    :goto_1
    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v14

    if-eqz v14, :cond_5

    .line 228
    const/4 v14, 0x0

    .line 229
    .local v14, "_item":Lcom/example/data/DhikrWithTags;
    const/4 v15, 0x0

    .line 230
    .local v15, "_tmpDhikr":Lcom/example/data/Dhikr;
    const/16 v17, 0x0

    .line 231
    .local v17, "_tmpId":I
    invoke-interface {v4, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    .line 232
    .end local v17    # "_tmpId":I
    .local v2, "_tmpId":I
    const/4 v3, 0x0

    .line 233
    .local v3, "_tmpTitle":Ljava/lang/String;
    invoke-interface {v4, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v21

    .line 234
    .end local v3    # "_tmpTitle":Ljava/lang/String;
    .local v21, "_tmpTitle":Ljava/lang/String;
    const/4 v3, 0x0

    .line 235
    .local v3, "_tmpContent":Ljava/lang/String;
    invoke-interface {v4, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v22

    .line 236
    .end local v3    # "_tmpContent":Ljava/lang/String;
    .local v22, "_tmpContent":Ljava/lang/String;
    const/4 v3, 0x0

    .line 237
    .local v3, "_tmpIsFavorite":Z
    const/16 v17, 0x0

    .line 238
    .local v17, "_tmp":I
    move/from16 v20, v2

    move/from16 v19, v3

    .end local v2    # "_tmpId":I
    .end local v3    # "_tmpIsFavorite":Z
    .local v19, "_tmpIsFavorite":Z
    .local v20, "_tmpId":I
    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    .line 239
    .end local v17    # "_tmp":I
    .local v2, "_tmp":I
    if-eqz v2, :cond_2

    const/16 v23, 0x1

    goto :goto_2

    :cond_2
    const/16 v23, 0x0

    .line 240
    .end local v19    # "_tmpIsFavorite":Z
    .local v23, "_tmpIsFavorite":Z
    :goto_2
    const/4 v3, 0x0

    .line 241
    .local v3, "_tmpReminderTimes":Ljava/util/List;
    const/16 v17, 0x0

    .line 242
    .local v17, "_tmp_1":Ljava/lang/String;
    invoke-interface {v4, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v29, v19

    .line 243
    .end local v17    # "_tmp_1":Ljava/lang/String;
    .local v29, "_tmp_1":Ljava/lang/String;
    move/from16 v17, v2

    .end local v2    # "_tmp":I
    .local v17, "_tmp":I
    iget-object v2, v1, Lcom/example/data/TagDao_Impl;->__converters:Lcom/example/data/Converters;

    move-object/from16 v1, v29

    .end local v29    # "_tmp_1":Ljava/lang/String;
    .local v1, "_tmp_1":Ljava/lang/String;
    invoke-virtual {v2, v1}, Lcom/example/data/Converters;->fromString(Ljava/lang/String;)Ljava/util/List;

    move-result-object v24

    .line 244
    .end local v3    # "_tmpReminderTimes":Ljava/util/List;
    .local v24, "_tmpReminderTimes":Ljava/util/List;
    const/4 v2, 0x0

    .line 245
    .local v2, "_tmpIsEnabled":Z
    const/4 v3, 0x0

    .line 246
    .local v3, "_tmp_2":I
    move-object/from16 v29, v1

    move/from16 v19, v2

    .end local v1    # "_tmp_1":Ljava/lang/String;
    .end local v2    # "_tmpIsEnabled":Z
    .local v19, "_tmpIsEnabled":Z
    .restart local v29    # "_tmp_1":Ljava/lang/String;
    invoke-interface {v4, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    .line 247
    .end local v3    # "_tmp_2":I
    .local v1, "_tmp_2":I
    if-eqz v1, :cond_3

    const/16 v25, 0x1

    goto :goto_3

    :cond_3
    const/16 v25, 0x0

    .line 248
    .end local v19    # "_tmpIsEnabled":Z
    .local v25, "_tmpIsEnabled":Z
    :goto_3
    const/4 v2, 0x0

    .line 249
    .local v2, "_tmpReadCount":I
    move v3, v1

    move/from16 v19, v2

    .end local v1    # "_tmp_2":I
    .end local v2    # "_tmpReadCount":I
    .restart local v3    # "_tmp_2":I
    .local v19, "_tmpReadCount":I
    invoke-interface {v4, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    .line 250
    .end local v19    # "_tmpReadCount":I
    .local v1, "_tmpReadCount":I
    const-wide/16 v26, 0x0

    .line 251
    .local v26, "_tmpLastReadTime":J
    invoke-interface {v4, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v30

    move-wide/from16 v27, v30

    .line 253
    .end local v26    # "_tmpLastReadTime":J
    .local v27, "_tmpLastReadTime":J
    new-instance v19, Lcom/example/data/Dhikr;

    move/from16 v26, v1

    .end local v1    # "_tmpReadCount":I
    .local v26, "_tmpReadCount":I
    invoke-direct/range {v19 .. v28}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJ)V

    .line 252
    move-object/from16 v1, v19

    .line 254
    .end local v15    # "_tmpDhikr":Lcom/example/data/Dhikr;
    .local v1, "_tmpDhikr":Lcom/example/data/Dhikr;
    const/4 v2, 0x0

    .line 255
    .local v2, "_tmpTagsCollection":Ljava/util/List;
    const-wide/16 v30, 0x0

    .line 256
    .local v30, "_tmpKey_1":J
    invoke-interface {v4, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v32

    move-wide/from16 v34, v32

    .line 257
    .end local v30    # "_tmpKey_1":J
    .local v34, "_tmpKey_1":J
    move-object/from16 v19, v2

    move v15, v3

    move-wide/from16 v2, v34

    .end local v3    # "_tmp_2":I
    .end local v34    # "_tmpKey_1":J
    .local v2, "_tmpKey_1":J
    .local v15, "_tmp_2":I
    .local v19, "_tmpTagsCollection":Ljava/util/List;
    invoke-virtual {v12, v2, v3}, Landroidx/collection/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v30

    if-eqz v30, :cond_4

    check-cast v30, Ljava/util/List;

    move-object/from16 v19, v30

    .line 258
    move/from16 v30, v0

    .end local v0    # "_columnIndexOfId":I
    .local v30, "_columnIndexOfId":I
    new-instance v0, Lcom/example/data/DhikrWithTags;

    move-wide/from16 v31, v2

    move-object/from16 v2, v19

    .end local v19    # "_tmpTagsCollection":Ljava/util/List;
    .local v2, "_tmpTagsCollection":Ljava/util/List;
    .local v31, "_tmpKey_1":J
    invoke-direct {v0, v1, v2}, Lcom/example/data/DhikrWithTags;-><init>(Lcom/example/data/Dhikr;Ljava/util/List;)V

    .line 259
    .end local v14    # "_item":Lcom/example/data/DhikrWithTags;
    .local v0, "_item":Lcom/example/data/DhikrWithTags;
    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v0, v30

    goto/16 :goto_1

    .line 257
    .end local v30    # "_columnIndexOfId":I
    .end local v31    # "_tmpKey_1":J
    .local v0, "_columnIndexOfId":I
    .local v2, "_tmpKey_1":J
    .restart local v14    # "_item":Lcom/example/data/DhikrWithTags;
    .restart local v19    # "_tmpTagsCollection":Ljava/util/List;
    :cond_4
    move/from16 v30, v0

    move-wide/from16 v31, v2

    .end local v0    # "_columnIndexOfId":I
    .end local v2    # "_tmpKey_1":J
    .restart local v30    # "_columnIndexOfId":I
    .restart local v31    # "_tmpKey_1":J
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .end local v4    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .end local p0    # "$_sql":Ljava/lang/String;
    .end local p1    # "this$0":Lcom/example/data/TagDao_Impl;
    .end local p2    # "_connection":Landroidx/sqlite/SQLiteConnection;
    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    .end local v1    # "_tmpDhikr":Lcom/example/data/Dhikr;
    .end local v14    # "_item":Lcom/example/data/DhikrWithTags;
    .end local v15    # "_tmp_2":I
    .end local v17    # "_tmp":I
    .end local v19    # "_tmpTagsCollection":Ljava/util/List;
    .end local v20    # "_tmpId":I
    .end local v21    # "_tmpTitle":Ljava/lang/String;
    .end local v22    # "_tmpContent":Ljava/lang/String;
    .end local v23    # "_tmpIsFavorite":Z
    .end local v24    # "_tmpReminderTimes":Ljava/util/List;
    .end local v25    # "_tmpIsEnabled":Z
    .end local v26    # "_tmpReadCount":I
    .end local v27    # "_tmpLastReadTime":J
    .end local v29    # "_tmp_1":Ljava/lang/String;
    .end local v30    # "_columnIndexOfId":I
    .end local v31    # "_tmpKey_1":J
    .restart local v0    # "_columnIndexOfId":I
    .restart local v4    # "_stmt":Landroidx/sqlite/SQLiteStatement;
    .restart local p0    # "$_sql":Ljava/lang/String;
    .restart local p1    # "this$0":Lcom/example/data/TagDao_Impl;
    .restart local p2    # "_connection":Landroidx/sqlite/SQLiteConnection;
    :cond_5
    move/from16 v30, v0

    .line 263
    .end local v0    # "_columnIndexOfId":I
    .end local v5    # "_columnIndexOfTitle":I
    .end local v6    # "_columnIndexOfContent":I
    .end local v7    # "_columnIndexOfIsFavorite":I
    .end local v8    # "_columnIndexOfReminderTimes":I
    .end local v9    # "_columnIndexOfIsEnabled":I
    .end local v10    # "_columnIndexOfReadCount":I
    .end local v11    # "_columnIndexOfLastReadTime":I
    .end local v12    # "_collectionTags":Landroidx/collection/LongSparseArray;
    .end local v13    # "_result":Ljava/util/List;
    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 264
    return-object v13

    .line 263
    :catchall_0
    move-exception v0

    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method static final getTagById$lambda$6(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/example/data/Tag;
    .locals 11
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$tagId"    # J
    .param p3, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-interface {p3, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 148
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 149
    const/4 v1, 0x1

    .line 150
    .local v1, "_argIndex":I
    :try_start_0
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 151
    const-string v2, "tagId"

    invoke-static {v0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    .line 152
    .local v2, "_columnIndexOfTagId":I
    const-string v3, "name"

    invoke-static {v0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    .line 153
    .local v3, "_columnIndexOfName":I
    const-string v4, "colorHex"

    invoke-static {v0, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 154
    .local v4, "_columnIndexOfColorHex":I
    const/4 v5, 0x0

    .line 155
    .local v5, "_result":Lcom/example/data/Tag;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 156
    const-wide/16 v6, 0x0

    .line 157
    .local v6, "_tmpTagId":J
    invoke-interface {v0, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    .line 158
    .end local v6    # "_tmpTagId":J
    .local v8, "_tmpTagId":J
    const/4 v6, 0x0

    .line 159
    .local v6, "_tmpName":Ljava/lang/String;
    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    .line 160
    .end local v6    # "_tmpName":Ljava/lang/String;
    .local v7, "_tmpName":Ljava/lang/String;
    const/4 v6, 0x0

    .line 161
    .local v6, "_tmpColorHex":Ljava/lang/String;
    invoke-interface {v0, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v10

    .line 162
    .end local v6    # "_tmpColorHex":Ljava/lang/String;
    .local v10, "_tmpColorHex":Ljava/lang/String;
    new-instance v6, Lcom/example/data/Tag;

    invoke-direct {v6, v8, v9, v7, v10}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v5    # "_result":Lcom/example/data/Tag;
    .end local v7    # "_tmpName":Ljava/lang/String;
    .end local v8    # "_tmpTagId":J
    .end local v10    # "_tmpColorHex":Ljava/lang/String;
    .local v6, "_result":Lcom/example/data/Tag;
    goto :goto_0

    .line 164
    .end local v6    # "_result":Lcom/example/data/Tag;
    .restart local v5    # "_result":Lcom/example/data/Tag;
    :cond_0
    const/4 v6, 0x0

    .line 166
    .end local v5    # "_result":Lcom/example/data/Tag;
    .restart local v6    # "_result":Lcom/example/data/Tag;
    :goto_0
    nop

    .line 168
    .end local v1    # "_argIndex":I
    .end local v2    # "_columnIndexOfTagId":I
    .end local v3    # "_columnIndexOfName":I
    .end local v4    # "_columnIndexOfColorHex":I
    .end local v6    # "_result":Lcom/example/data/Tag;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 169
    return-object v6

    .line 168
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getTagByName$lambda$7(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/example/data/Tag;
    .locals 11
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$name"    # Ljava/lang/String;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 177
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 178
    const/4 v1, 0x1

    .line 179
    .local v1, "_argIndex":I
    :try_start_0
    invoke-interface {v0, v1, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 180
    const-string v2, "tagId"

    invoke-static {v0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    .line 181
    .local v2, "_columnIndexOfTagId":I
    const-string v3, "name"

    invoke-static {v0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    .line 182
    .local v3, "_columnIndexOfName":I
    const-string v4, "colorHex"

    invoke-static {v0, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 183
    .local v4, "_columnIndexOfColorHex":I
    const/4 v5, 0x0

    .line 184
    .local v5, "_result":Lcom/example/data/Tag;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 185
    const-wide/16 v6, 0x0

    .line 186
    .local v6, "_tmpTagId":J
    invoke-interface {v0, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    .line 187
    .end local v6    # "_tmpTagId":J
    .local v8, "_tmpTagId":J
    const/4 v6, 0x0

    .line 188
    .local v6, "_tmpName":Ljava/lang/String;
    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    .line 189
    .end local v6    # "_tmpName":Ljava/lang/String;
    .local v7, "_tmpName":Ljava/lang/String;
    const/4 v6, 0x0

    .line 190
    .local v6, "_tmpColorHex":Ljava/lang/String;
    invoke-interface {v0, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v10

    .line 191
    .end local v6    # "_tmpColorHex":Ljava/lang/String;
    .local v10, "_tmpColorHex":Ljava/lang/String;
    new-instance v6, Lcom/example/data/Tag;

    invoke-direct {v6, v8, v9, v7, v10}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v5    # "_result":Lcom/example/data/Tag;
    .end local v7    # "_tmpName":Ljava/lang/String;
    .end local v8    # "_tmpTagId":J
    .end local v10    # "_tmpColorHex":Ljava/lang/String;
    .local v6, "_result":Lcom/example/data/Tag;
    goto :goto_0

    .line 193
    .end local v6    # "_result":Lcom/example/data/Tag;
    .restart local v5    # "_result":Lcom/example/data/Tag;
    :cond_0
    const/4 v6, 0x0

    .line 195
    .end local v5    # "_result":Lcom/example/data/Tag;
    .restart local v6    # "_result":Lcom/example/data/Tag;
    :goto_0
    nop

    .line 197
    .end local v1    # "_argIndex":I
    .end local v2    # "_columnIndexOfTagId":I
    .end local v3    # "_columnIndexOfName":I
    .end local v4    # "_columnIndexOfColorHex":I
    .end local v6    # "_result":Lcom/example/data/Tag;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 198
    return-object v6

    .line 197
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getTagsForDhikr$lambda$10(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 12
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$dhikrId"    # I
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 340
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 341
    const/4 v1, 0x1

    .line 342
    .local v1, "_argIndex":I
    int-to-long v2, p1

    :try_start_0
    invoke-interface {v0, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 343
    const-string v2, "tagId"

    invoke-static {v0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    .line 344
    .local v2, "_columnIndexOfTagId":I
    const-string v3, "name"

    invoke-static {v0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    .line 345
    .local v3, "_columnIndexOfName":I
    const-string v4, "colorHex"

    invoke-static {v0, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 346
    .local v4, "_columnIndexOfColorHex":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/List;

    .line 347
    .local v5, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 348
    const/4 v6, 0x0

    .line 349
    .local v6, "_item":Lcom/example/data/Tag;
    const-wide/16 v7, 0x0

    .line 350
    .local v7, "_tmpTagId":J
    invoke-interface {v0, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v9

    .line 351
    .end local v7    # "_tmpTagId":J
    .local v9, "_tmpTagId":J
    const/4 v7, 0x0

    .line 352
    .local v7, "_tmpName":Ljava/lang/String;
    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    .line 353
    .end local v7    # "_tmpName":Ljava/lang/String;
    .local v8, "_tmpName":Ljava/lang/String;
    const/4 v7, 0x0

    .line 354
    .local v7, "_tmpColorHex":Ljava/lang/String;
    invoke-interface {v0, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v11

    .line 355
    .end local v7    # "_tmpColorHex":Ljava/lang/String;
    .local v11, "_tmpColorHex":Ljava/lang/String;
    new-instance v7, Lcom/example/data/Tag;

    invoke-direct {v7, v9, v10, v8, v11}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 356
    .end local v6    # "_item":Lcom/example/data/Tag;
    .local v7, "_item":Lcom/example/data/Tag;
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 358
    .end local v7    # "_item":Lcom/example/data/Tag;
    .end local v8    # "_tmpName":Ljava/lang/String;
    .end local v9    # "_tmpTagId":J
    .end local v11    # "_tmpColorHex":Ljava/lang/String;
    :cond_0
    nop

    .line 360
    .end local v1    # "_argIndex":I
    .end local v2    # "_columnIndexOfTagId":I
    .end local v3    # "_columnIndexOfName":I
    .end local v4    # "_columnIndexOfColorHex":I
    .end local v5    # "_result":Ljava/util/List;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 361
    return-object v5

    .line 360
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final getTagsForDhikrSync$lambda$11(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 12
    .param p0, "$_sql"    # Ljava/lang/String;
    .param p1, "$dhikrId"    # I
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    .line 370
    .local v0, "_stmt":Landroidx/sqlite/SQLiteStatement;
    nop

    .line 371
    const/4 v1, 0x1

    .line 372
    .local v1, "_argIndex":I
    int-to-long v2, p1

    :try_start_0
    invoke-interface {v0, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 373
    const-string v2, "tagId"

    invoke-static {v0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    .line 374
    .local v2, "_columnIndexOfTagId":I
    const-string v3, "name"

    invoke-static {v0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    .line 375
    .local v3, "_columnIndexOfName":I
    const-string v4, "colorHex"

    invoke-static {v0, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    .line 376
    .local v4, "_columnIndexOfColorHex":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/List;

    .line 377
    .local v5, "_result":Ljava/util/List;
    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 378
    const/4 v6, 0x0

    .line 379
    .local v6, "_item":Lcom/example/data/Tag;
    const-wide/16 v7, 0x0

    .line 380
    .local v7, "_tmpTagId":J
    invoke-interface {v0, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v9

    .line 381
    .end local v7    # "_tmpTagId":J
    .local v9, "_tmpTagId":J
    const/4 v7, 0x0

    .line 382
    .local v7, "_tmpName":Ljava/lang/String;
    invoke-interface {v0, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    .line 383
    .end local v7    # "_tmpName":Ljava/lang/String;
    .local v8, "_tmpName":Ljava/lang/String;
    const/4 v7, 0x0

    .line 384
    .local v7, "_tmpColorHex":Ljava/lang/String;
    invoke-interface {v0, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v11

    .line 385
    .end local v7    # "_tmpColorHex":Ljava/lang/String;
    .local v11, "_tmpColorHex":Ljava/lang/String;
    new-instance v7, Lcom/example/data/Tag;

    invoke-direct {v7, v9, v10, v8, v11}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 386
    .end local v6    # "_item":Lcom/example/data/Tag;
    .local v7, "_item":Lcom/example/data/Tag;
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 388
    .end local v7    # "_item":Lcom/example/data/Tag;
    .end local v8    # "_tmpName":Ljava/lang/String;
    .end local v9    # "_tmpTagId":J
    .end local v11    # "_tmpColorHex":Ljava/lang/String;
    :cond_0
    nop

    .line 390
    .end local v1    # "_argIndex":I
    .end local v2    # "_columnIndexOfTagId":I
    .end local v3    # "_columnIndexOfName":I
    .end local v4    # "_columnIndexOfColorHex":I
    .end local v5    # "_result":Ljava/util/List;
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 391
    return-object v5

    .line 390
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v1
.end method

.method static final insertDhikrTagCrossRef$lambda$1(Lcom/example/data/TagDao_Impl;Lcom/example/data/DhikrTagCrossRef;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/example/data/TagDao_Impl;
    .param p1, "$crossRef"    # Lcom/example/data/DhikrTagCrossRef;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__insertAdapterOfDhikrTagCrossRef:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V

    .line 95
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final insertDhikrTagCrossRefs$lambda$2(Lcom/example/data/TagDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/TagDao_Impl;
    .param p1, "$crossRefs"    # Ljava/util/List;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__insertAdapterOfDhikrTagCrossRef:Landroidx/room/EntityInsertAdapter;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0, p2, v1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V

    .line 100
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final insertTag$lambda$0(Lcom/example/data/TagDao_Impl;Lcom/example/data/Tag;Landroidx/sqlite/SQLiteConnection;)J
    .locals 2
    .param p0, "this$0"    # Lcom/example/data/TagDao_Impl;
    .param p1, "$tag"    # Lcom/example/data/Tag;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__insertAdapterOfTag:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnId(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J

    move-result-wide v0

    .line 89
    .local v0, "_result":J
    return-wide v0
.end method

.method static final updateTag$lambda$4(Lcom/example/data/TagDao_Impl;Lcom/example/data/Tag;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/example/data/TagDao_Impl;
    .param p1, "$tag"    # Lcom/example/data/Tag;
    .param p2, "_connection"    # Landroidx/sqlite/SQLiteConnection;

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__updateAdapterOfTag:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {v0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handle(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I

    .line 110
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public deleteDhikrRefsForTag(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "tagId"    # J
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 424
    const-string v0, "DELETE FROM dhikr_tag_cross_ref WHERE tagId = ?"

    .line 425
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda10;

    invoke-direct {v2, v0, p1, p2}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda10;-><init>(Ljava/lang/String;J)V

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

.method public deleteTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "tag"    # Lcom/example/data/Tag;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Tag;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 102
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda5;-><init>(Lcom/example/data/TagDao_Impl;Lcom/example/data/Tag;)V

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

    .line 105
    return-object v0
.end method

.method public deleteTagById(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "tagId"    # J
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 396
    const-string v0, "DELETE FROM tag_table WHERE tagId = ?"

    .line 397
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda13;

    invoke-direct {v2, v0, p1, p2}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda13;-><init>(Ljava/lang/String;J)V

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

.method public deleteTagsForDhikr(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "dhikrId"    # I
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

    .line 410
    const-string v0, "DELETE FROM dhikr_tag_cross_ref WHERE dhikrId = ?"

    .line 411
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;I)V

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

.method public getAllTags()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Tag;",
            ">;>;"
        }
    .end annotation

    .line 118
    const-string v0, "SELECT * FROM tag_table ORDER BY name ASC"

    .line 119
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "tag_table"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda7;

    invoke-direct {v3, v0}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda7;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public getDhikrWithTagsById(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "dhikrId"    # I
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/DhikrWithTags;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 269
    const-string v0, "SELECT * FROM dhikr_table WHERE id = ?"

    .line 270
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda9;

    invoke-direct {v2, v0, p1, p0}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda9;-><init>(Ljava/lang/String;ILcom/example/data/TagDao_Impl;)V

    const/4 v3, 0x1

    invoke-static {v1, v3, v3, v2, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public getDhikrsWithTags()Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/DhikrWithTags;",
            ">;>;"
        }
    .end annotation

    .line 203
    const-string v0, "SELECT * FROM dhikr_table"

    .line 204
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "tag_table"

    const-string v3, "dhikr_table"

    const-string v4, "dhikr_tag_cross_ref"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda2;

    invoke-direct {v3, v0, p0}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;Lcom/example/data/TagDao_Impl;)V

    const/4 v4, 0x1

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public getTagById(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "tagId"    # J
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/Tag;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 145
    const-string v0, "SELECT * FROM tag_table WHERE tagId = ?"

    .line 146
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda14;

    invoke-direct {v2, v0, p1, p2}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda14;-><init>(Ljava/lang/String;J)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2, p3}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public getTagByName(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/Tag;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 174
    const-string v0, "SELECT * FROM tag_table WHERE name = ? LIMIT 1"

    .line 175
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda15;

    invoke-direct {v2, v0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda15;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public getTagsForDhikr(I)Lkotlinx/coroutines/flow/Flow;
    .locals 5
    .param p1, "dhikrId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Tag;",
            ">;>;"
        }
    .end annotation

    .line 337
    nop

    .line 336
    const-string v0, "SELECT T.* FROM tag_table T INNER JOIN dhikr_tag_cross_ref R ON T.tagId = R.tagId WHERE R.dhikrId = ?"

    .line 338
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v2, "tag_table"

    const-string v3, "dhikr_tag_cross_ref"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda12;

    invoke-direct {v3, v0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda12;-><init>(Ljava/lang/String;I)V

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    return-object v1
.end method

.method public getTagsForDhikrSync(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "dhikrId"    # I
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/example/data/Tag;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 367
    nop

    .line 366
    const-string v0, "SELECT T.* FROM tag_table T INNER JOIN dhikr_tag_cross_ref R ON T.tagId = R.tagId WHERE R.dhikrId = ?"

    .line 368
    .local v0, "_sql":Ljava/lang/String;
    iget-object v1, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v2, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda6;

    invoke-direct {v2, v0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda6;-><init>(Ljava/lang/String;I)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public insertDhikrTagCrossRef(Lcom/example/data/DhikrTagCrossRef;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "crossRef"    # Lcom/example/data/DhikrTagCrossRef;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/DhikrTagCrossRef;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda3;-><init>(Lcom/example/data/TagDao_Impl;Lcom/example/data/DhikrTagCrossRef;)V

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

    .line 95
    return-object v0
.end method

.method public insertDhikrTagCrossRefs(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "crossRefs"    # Ljava/util/List;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/DhikrTagCrossRef;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda4;-><init>(Lcom/example/data/TagDao_Impl;Ljava/util/List;)V

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

    .line 100
    return-object v0
.end method

.method public insertTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "tag"    # Lcom/example/data/Tag;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Tag;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda8;

    invoke-direct {v1, p0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda8;-><init>(Lcom/example/data/TagDao_Impl;Lcom/example/data/Tag;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 90
    return-object v0
.end method

.method public updateDhikrTags(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "dhikrId"    # I
    .param p2, "tagIds"    # Ljava/util/List;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/TagDao_Impl$updateDhikrTags$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/example/data/TagDao_Impl$updateDhikrTags$2;-><init>(Lcom/example/data/TagDao_Impl;ILjava/util/List;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p3}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 115
    return-object v0
.end method

.method public updateTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "tag"    # Lcom/example/data/Tag;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Tag;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lcom/example/data/TagDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda11;

    invoke-direct {v1, p0, p1}, Lcom/example/data/TagDao_Impl$$ExternalSyntheticLambda11;-><init>(Lcom/example/data/TagDao_Impl;Lcom/example/data/Tag;)V

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

    .line 110
    return-object v0
.end method
