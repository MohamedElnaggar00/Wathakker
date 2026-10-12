.class public final Lcom/example/data/DhikrRepository;
.super Ljava/lang/Object;
.source "DhikrRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0013\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0014\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010\'\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020*2\u0006\u0010\'\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010(J\u0016\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010-J\u0016\u0010/\u001a\u00020*2\u0006\u0010\'\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010(J\u0016\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u00102J\u0016\u00103\u001a\u00020*2\u0006\u00101\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u00102J\u0016\u00104\u001a\u00020*2\u0006\u00101\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u00102J$\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u001e2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020%0\u000cH\u0086@\u00a2\u0006\u0002\u00108J \u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020!2\u0008\u0008\u0002\u0010;\u001a\u00020!H\u0086@\u00a2\u0006\u0002\u0010<R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000fR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00180\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u000fR\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u000fR\u0017\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u000fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u000f\u00a8\u0006="
    }
    d2 = {
        "Lcom/example/data/DhikrRepository;",
        "",
        "dhikrDao",
        "Lcom/example/data/DhikrDao;",
        "tagDao",
        "Lcom/example/data/TagDao;",
        "historyDao",
        "Lcom/example/data/HistoryDao;",
        "<init>",
        "(Lcom/example/data/DhikrDao;Lcom/example/data/TagDao;Lcom/example/data/HistoryDao;)V",
        "allDhikr",
        "Lkotlinx/coroutines/flow/Flow;",
        "",
        "Lcom/example/data/Dhikr;",
        "getAllDhikr",
        "()Lkotlinx/coroutines/flow/Flow;",
        "favoriteDhikr",
        "getFavoriteDhikr",
        "enabledDhikr",
        "getEnabledDhikr",
        "allTags",
        "Lcom/example/data/Tag;",
        "getAllTags",
        "dhikrsWithTags",
        "Lcom/example/data/DhikrWithTags;",
        "getDhikrsWithTags",
        "allHistory",
        "Lcom/example/data/DhikrHistory;",
        "getAllHistory",
        "totalHistoryCount",
        "",
        "getTotalHistoryCount",
        "distinctReadDates",
        "",
        "getDistinctReadDates",
        "getHistoryCountSince",
        "startTime",
        "",
        "getDhikrById",
        "id",
        "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "markAsRead",
        "",
        "insert",
        "dhikr",
        "(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "update",
        "delete",
        "insertTag",
        "tag",
        "(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateTag",
        "deleteTag",
        "updateDhikrTags",
        "dhikrId",
        "tagIds",
        "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getOrCreateTagByName",
        "name",
        "colorHex",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final allDhikr:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation
.end field

.field private final allHistory:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/DhikrHistory;",
            ">;>;"
        }
    .end annotation
.end field

.field private final allTags:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Tag;",
            ">;>;"
        }
    .end annotation
.end field

.field private final dhikrDao:Lcom/example/data/DhikrDao;

.field private final dhikrsWithTags:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/DhikrWithTags;",
            ">;>;"
        }
    .end annotation
.end field

.field private final distinctReadDates:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final enabledDhikr:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation
.end field

.field private final favoriteDhikr:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation
.end field

.field private final historyDao:Lcom/example/data/HistoryDao;

.field private final tagDao:Lcom/example/data/TagDao;

.field private final totalHistoryCount:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/data/DhikrRepository;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/example/data/DhikrDao;Lcom/example/data/TagDao;Lcom/example/data/HistoryDao;)V
    .locals 1
    .param p1, "dhikrDao"    # Lcom/example/data/DhikrDao;
    .param p2, "tagDao"    # Lcom/example/data/TagDao;
    .param p3, "historyDao"    # Lcom/example/data/HistoryDao;

    const-string v0, "dhikrDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tagDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "historyDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    .line 7
    iput-object p2, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    .line 8
    iput-object p3, p0, Lcom/example/data/DhikrRepository;->historyDao:Lcom/example/data/HistoryDao;

    .line 10
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    invoke-interface {v0}, Lcom/example/data/DhikrDao;->getAllDhikr()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/DhikrRepository;->allDhikr:Lkotlinx/coroutines/flow/Flow;

    .line 11
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    invoke-interface {v0}, Lcom/example/data/DhikrDao;->getFavoriteDhikr()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/DhikrRepository;->favoriteDhikr:Lkotlinx/coroutines/flow/Flow;

    .line 12
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    invoke-interface {v0}, Lcom/example/data/DhikrDao;->getEnabledDhikr()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/DhikrRepository;->enabledDhikr:Lkotlinx/coroutines/flow/Flow;

    .line 13
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    invoke-interface {v0}, Lcom/example/data/TagDao;->getAllTags()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/DhikrRepository;->allTags:Lkotlinx/coroutines/flow/Flow;

    .line 14
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    invoke-interface {v0}, Lcom/example/data/TagDao;->getDhikrsWithTags()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/DhikrRepository;->dhikrsWithTags:Lkotlinx/coroutines/flow/Flow;

    .line 15
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->historyDao:Lcom/example/data/HistoryDao;

    invoke-interface {v0}, Lcom/example/data/HistoryDao;->getAllHistory()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/DhikrRepository;->allHistory:Lkotlinx/coroutines/flow/Flow;

    .line 16
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->historyDao:Lcom/example/data/HistoryDao;

    invoke-interface {v0}, Lcom/example/data/HistoryDao;->getTotalCount()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/DhikrRepository;->totalHistoryCount:Lkotlinx/coroutines/flow/Flow;

    .line 17
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->historyDao:Lcom/example/data/HistoryDao;

    invoke-interface {v0}, Lcom/example/data/HistoryDao;->getDistinctReadDates()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/data/DhikrRepository;->distinctReadDates:Lkotlinx/coroutines/flow/Flow;

    .line 5
    return-void
.end method

.method public static synthetic getOrCreateTagByName$default(Lcom/example/data/DhikrRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 66
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p2, "#008080"

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/example/data/DhikrRepository;->getOrCreateTagByName(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final delete(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    instance-of v0, p2, Lcom/example/data/DhikrRepository$delete$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/example/data/DhikrRepository$delete$1;

    iget v1, v0, Lcom/example/data/DhikrRepository$delete$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/example/data/DhikrRepository$delete$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/example/data/DhikrRepository$delete$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/example/data/DhikrRepository$delete$1;

    invoke-direct {v0, p0, p2}, Lcom/example/data/DhikrRepository$delete$1;-><init>(Lcom/example/data/DhikrRepository;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/example/data/DhikrRepository$delete$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 43
    iget v3, v0, Lcom/example/data/DhikrRepository$delete$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget p1, v0, Lcom/example/data/DhikrRepository$delete$1;->I$0:I

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    iget p1, v0, Lcom/example/data/DhikrRepository$delete$1;->I$0:I

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    iget-object v3, p0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    iput p1, v0, Lcom/example/data/DhikrRepository$delete$1;->I$0:I

    const/4 v4, 0x1

    iput v4, v0, Lcom/example/data/DhikrRepository$delete$1;->label:I

    invoke-interface {v3, p1, v0}, Lcom/example/data/DhikrDao;->deleteDhikrById(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    .line 43
    return-object v2

    .line 45
    :cond_1
    :goto_1
    iget-object v3, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    iput p1, v0, Lcom/example/data/DhikrRepository$delete$1;->I$0:I

    const/4 v4, 0x2

    iput v4, v0, Lcom/example/data/DhikrRepository$delete$1;->label:I

    invoke-interface {v3, p1, v0}, Lcom/example/data/TagDao;->deleteTagsForDhikr(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_2

    .line 43
    return-object v2

    .line 46
    :cond_2
    :goto_2
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final deleteTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
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

    instance-of v0, p2, Lcom/example/data/DhikrRepository$deleteTag$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/example/data/DhikrRepository$deleteTag$1;

    iget v1, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/example/data/DhikrRepository$deleteTag$1;

    invoke-direct {v0, p0, p2}, Lcom/example/data/DhikrRepository$deleteTag$1;-><init>(Lcom/example/data/DhikrRepository;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 57
    iget v3, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v2, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Lcom/example/data/Tag;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    iget-object v3, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->L$0:Ljava/lang/Object;

    move-object p1, v3

    check-cast p1, Lcom/example/data/Tag;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    iget-object v3, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    invoke-virtual {p1}, Lcom/example/data/Tag;->getTagId()J

    move-result-wide v4

    iput-object p1, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->label:I

    invoke-interface {v3, v4, v5, v0}, Lcom/example/data/TagDao;->deleteDhikrRefsForTag(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    .line 57
    return-object v2

    .line 59
    :cond_1
    :goto_1
    iget-object v3, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v0, Lcom/example/data/DhikrRepository$deleteTag$1;->label:I

    invoke-interface {v3, p1, v0}, Lcom/example/data/TagDao;->deleteTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_2

    .line 57
    return-object v2

    .line 60
    :cond_2
    :goto_2
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getAllDhikr()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->allDhikr:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getAllHistory()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/DhikrHistory;",
            ">;>;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->allHistory:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getAllTags()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Tag;",
            ">;>;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->allTags:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getDhikrById(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    .line 24
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    invoke-interface {v0, p1, p2}, Lcom/example/data/DhikrDao;->getDhikrById(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getDhikrsWithTags()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/DhikrWithTags;",
            ">;>;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->dhikrsWithTags:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getDistinctReadDates()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->distinctReadDates:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getEnabledDhikr()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->enabledDhikr:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getFavoriteDhikr()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->favoriteDhikr:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getHistoryCountSince(J)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p1, "startTime"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->historyDao:Lcom/example/data/HistoryDao;

    invoke-interface {v0, p1, p2}, Lcom/example/data/HistoryDao;->getCountSince(J)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public final getOrCreateTagByName(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "colorHex"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/Tag;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;

    iget v1, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;

    invoke-direct {v0, p0, p3}, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;-><init>(Lcom/example/data/DhikrRepository;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 66
    iget v3, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v2, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Tag;

    .local v2, "newTag":Lcom/example/data/Tag;
    iget-object v3, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/example/data/Tag;

    .local v3, "existing":Lcom/example/data/Tag;
    iget-object v4, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$1:Ljava/lang/Object;

    move-object p2, v4

    check-cast p2, Ljava/lang/String;

    iget-object v4, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$0:Ljava/lang/Object;

    move-object p1, v4

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v1

    move-object v9, v3

    goto/16 :goto_2

    .end local v2    # "newTag":Lcom/example/data/Tag;
    .end local v3    # "existing":Lcom/example/data/Tag;
    :pswitch_1
    iget-object v3, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$1:Ljava/lang/Object;

    move-object p2, v3

    check-cast p2, Ljava/lang/String;

    iget-object v3, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$0:Ljava/lang/Object;

    move-object p1, v3

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v1

    move-object v7, p2

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    iget-object v3, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    move-object v4, p1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object p1, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->label:I

    invoke-interface {v3, v4, v0}, Lcom/example/data/TagDao;->getTagByName(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    .line 66
    return-object v2

    .line 67
    :cond_1
    move-object v7, p2

    .line 66
    .end local p2    # "colorHex":Ljava/lang/String;
    .local v7, "colorHex":Ljava/lang/String;
    :goto_1
    move-object p2, v3

    check-cast p2, Lcom/example/data/Tag;

    .line 68
    .local p2, "existing":Lcom/example/data/Tag;
    if-eqz p2, :cond_2

    return-object p2

    .line 69
    :cond_2
    new-instance v3, Lcom/example/data/Tag;

    move-object v4, p1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v4, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    .local v3, "newTag":Lcom/example/data/Tag;
    iget-object v4, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$1:Ljava/lang/Object;

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->L$3:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v0, Lcom/example/data/DhikrRepository$getOrCreateTagByName$1;->label:I

    invoke-interface {v4, v3, v0}, Lcom/example/data/TagDao;->insertTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_3

    .line 66
    return-object v2

    .line 70
    :cond_3
    move-object v9, p2

    move-object v2, v3

    move-object p2, v7

    .end local v3    # "newTag":Lcom/example/data/Tag;
    .end local v7    # "colorHex":Ljava/lang/String;
    .restart local v2    # "newTag":Lcom/example/data/Tag;
    .local v9, "existing":Lcom/example/data/Tag;
    .local p2, "colorHex":Ljava/lang/String;
    :goto_2
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    .line 71
    .local v3, "id":J
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/example/data/Tag;->copy$default(Lcom/example/data/Tag;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/example/data/Tag;

    move-result-object v5

    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getTotalHistoryCount()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->totalHistoryCount:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final insert(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    .line 36
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    invoke-interface {v0, p1, p2}, Lcom/example/data/DhikrDao;->insertDhikr(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final insertTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    .line 50
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    invoke-interface {v0, p1, p2}, Lcom/example/data/TagDao;->insertTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final markAsRead(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20
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

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/example/data/DhikrRepository$markAsRead$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/example/data/DhikrRepository$markAsRead$1;

    iget v4, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v4, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->label:I

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/example/data/DhikrRepository$markAsRead$1;

    invoke-direct {v3, v0, v2}, Lcom/example/data/DhikrRepository$markAsRead$1;-><init>(Lcom/example/data/DhikrRepository;Lkotlin/coroutines/Continuation;)V

    .local v3, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v4, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->result:Ljava/lang/Object;

    .local v4, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 27
    iget v6, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->label:I

    packed-switch v6, :pswitch_data_0

    .end local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "$result":Ljava/lang/Object;
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .restart local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v4    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-wide v5, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->J$0:J

    .local v5, "now":J
    iget v1, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->I$0:I

    .end local p1    # "id":I
    .local v1, "id":I
    iget-object v7, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .local v7, "dateStr":Ljava/lang/String;
    iget-object v8, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/text/SimpleDateFormat;

    .local v8, "sdf":Ljava/text/SimpleDateFormat;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    .end local v1    # "id":I
    .end local v5    # "now":J
    .end local v7    # "dateStr":Ljava/lang/String;
    .end local v8    # "sdf":Ljava/text/SimpleDateFormat;
    .restart local p1    # "id":I
    :pswitch_1
    iget-wide v6, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->J$0:J

    .local v6, "now":J
    iget v1, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->I$0:I

    .end local p1    # "id":I
    .restart local v1    # "id":I
    iget-object v8, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .local v8, "dateStr":Ljava/lang/String;
    iget-object v9, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/text/SimpleDateFormat;

    .local v9, "sdf":Ljava/text/SimpleDateFormat;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v17, v8

    move-object v8, v9

    move v14, v1

    move-wide v15, v6

    goto :goto_1

    .end local v1    # "id":I
    .end local v6    # "now":J
    .end local v8    # "dateStr":Ljava/lang/String;
    .end local v9    # "sdf":Ljava/text/SimpleDateFormat;
    .restart local p1    # "id":I
    :pswitch_2
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 29
    .restart local v6    # "now":J
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v9, "yyyy-MM-dd"

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v8, v9, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 30
    .local v8, "sdf":Ljava/text/SimpleDateFormat;
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    .line 31
    .local v9, "dateStr":Ljava/lang/String;
    iget-object v10, v0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->L$1:Ljava/lang/Object;

    iput v1, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->I$0:I

    iput-wide v6, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->J$0:J

    const/4 v11, 0x1

    iput v11, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->label:I

    invoke-interface {v10, v1, v6, v7, v3}, Lcom/example/data/DhikrDao;->markAsRead(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_1

    .line 27
    return-object v5

    .line 31
    :cond_1
    move-object/from16 v17, v9

    move v14, v1

    move-wide v15, v6

    .line 32
    .end local v6    # "now":J
    .end local v9    # "dateStr":Ljava/lang/String;
    .end local p1    # "id":I
    .local v14, "id":I
    .local v15, "now":J
    .local v17, "dateStr":Ljava/lang/String;
    :goto_1
    iget-object v1, v0, Lcom/example/data/DhikrRepository;->historyDao:Lcom/example/data/HistoryDao;

    new-instance v11, Lcom/example/data/DhikrHistory;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/16 v18, 0x1

    const/16 v19, 0x0

    const-wide/16 v12, 0x0

    invoke-direct/range {v11 .. v19}, Lcom/example/data/DhikrHistory;-><init>(JIJLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-wide v6, v15

    .end local v15    # "now":J
    .restart local v6    # "now":J
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->L$0:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->L$1:Ljava/lang/Object;

    iput v14, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->I$0:I

    iput-wide v6, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->J$0:J

    const/4 v9, 0x2

    iput v9, v3, Lcom/example/data/DhikrRepository$markAsRead$1;->label:I

    invoke-interface {v1, v11, v3}, Lcom/example/data/HistoryDao;->insertHistory(Lcom/example/data/DhikrHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_2

    .line 27
    return-object v5

    .line 32
    :cond_2
    move-wide v5, v6

    move v1, v14

    move-object/from16 v7, v17

    .line 33
    .end local v6    # "now":J
    .end local v14    # "id":I
    .end local v17    # "dateStr":Ljava/lang/String;
    .restart local v1    # "id":I
    .restart local v5    # "now":J
    .restart local v7    # "dateStr":Ljava/lang/String;
    :goto_2
    sget-object v9, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final update(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    .line 40
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->dhikrDao:Lcom/example/data/DhikrDao;

    invoke-interface {v0, p1, p2}, Lcom/example/data/DhikrDao;->updateDhikr(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    return-object v0
.end method

.method public final updateDhikrTags(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    .line 63
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    invoke-interface {v0, p1, p2, p3}, Lcom/example/data/TagDao;->updateDhikrTags(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 64
    return-object v0
.end method

.method public final updateTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    .line 54
    iget-object v0, p0, Lcom/example/data/DhikrRepository;->tagDao:Lcom/example/data/TagDao;

    invoke-interface {v0, p1, p2}, Lcom/example/data/TagDao;->updateTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 55
    return-object v0
.end method
