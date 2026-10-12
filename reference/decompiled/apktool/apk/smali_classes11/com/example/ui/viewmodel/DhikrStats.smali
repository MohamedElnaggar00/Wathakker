.class public final Lcom/example/ui/viewmodel/DhikrStats;
.super Ljava/lang/Object;
.source "MainViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001BU\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u001a\u0008\u0002\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u001b\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\tH\u00c6\u0003JW\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u001a\u0008\u0002\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\tH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR#\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\""
    }
    d2 = {
        "Lcom/example/ui/viewmodel/DhikrStats;",
        "",
        "todayCount",
        "",
        "weekCount",
        "monthCount",
        "totalCount",
        "streakDays",
        "topReadDhikr",
        "",
        "Lkotlin/Pair;",
        "<init>",
        "(IIIIILjava/util/List;)V",
        "getTodayCount",
        "()I",
        "getWeekCount",
        "getMonthCount",
        "getTotalCount",
        "getStreakDays",
        "getTopReadDhikr",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final monthCount:I

.field private final streakDays:I

.field private final todayCount:I

.field private final topReadDhikr:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private final totalCount:I

.field private final weekCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/ui/viewmodel/DhikrStats;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/example/ui/viewmodel/DhikrStats;-><init>(IIIIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIILjava/util/List;)V
    .locals 1
    .param p1, "todayCount"    # I
    .param p2, "weekCount"    # I
    .param p3, "monthCount"    # I
    .param p4, "totalCount"    # I
    .param p5, "streakDays"    # I
    .param p6, "topReadDhikr"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "topReadDhikr"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput p1, p0, Lcom/example/ui/viewmodel/DhikrStats;->todayCount:I

    .line 25
    iput p2, p0, Lcom/example/ui/viewmodel/DhikrStats;->weekCount:I

    .line 26
    iput p3, p0, Lcom/example/ui/viewmodel/DhikrStats;->monthCount:I

    .line 27
    iput p4, p0, Lcom/example/ui/viewmodel/DhikrStats;->totalCount:I

    .line 28
    iput p5, p0, Lcom/example/ui/viewmodel/DhikrStats;->streakDays:I

    .line 29
    iput-object p6, p0, Lcom/example/ui/viewmodel/DhikrStats;->topReadDhikr:Ljava/util/List;

    .line 23
    return-void
.end method

.method public synthetic constructor <init>(IIIIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 23
    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    .line 24
    move p1, v0

    .line 23
    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 25
    move p2, v0

    .line 23
    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 26
    move p3, v0

    .line 23
    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 27
    move p4, v0

    .line 23
    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    .line 28
    move p5, v0

    .line 23
    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 29
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p6

    move-object p7, p6

    goto :goto_0

    .line 23
    :cond_5
    move-object p7, p6

    :goto_0
    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lcom/example/ui/viewmodel/DhikrStats;-><init>(IIIIILjava/util/List;)V

    .line 30
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/ui/viewmodel/DhikrStats;IIIIILjava/util/List;ILjava/lang/Object;)Lcom/example/ui/viewmodel/DhikrStats;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/example/ui/viewmodel/DhikrStats;->todayCount:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/example/ui/viewmodel/DhikrStats;->weekCount:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/example/ui/viewmodel/DhikrStats;->monthCount:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/example/ui/viewmodel/DhikrStats;->totalCount:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/example/ui/viewmodel/DhikrStats;->streakDays:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/example/ui/viewmodel/DhikrStats;->topReadDhikr:Ljava/util/List;

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/example/ui/viewmodel/DhikrStats;->copy(IIIIILjava/util/List;)Lcom/example/ui/viewmodel/DhikrStats;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->todayCount:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->weekCount:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->monthCount:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->totalCount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->streakDays:I

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->topReadDhikr:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IIIIILjava/util/List;)Lcom/example/ui/viewmodel/DhikrStats;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Lcom/example/ui/viewmodel/DhikrStats;"
        }
    .end annotation

    const-string v0, "topReadDhikr"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/example/ui/viewmodel/DhikrStats;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/example/ui/viewmodel/DhikrStats;-><init>(IIIIILjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/ui/viewmodel/DhikrStats;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/ui/viewmodel/DhikrStats;

    iget v3, p0, Lcom/example/ui/viewmodel/DhikrStats;->todayCount:I

    iget v4, v1, Lcom/example/ui/viewmodel/DhikrStats;->todayCount:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/example/ui/viewmodel/DhikrStats;->weekCount:I

    iget v4, v1, Lcom/example/ui/viewmodel/DhikrStats;->weekCount:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget v3, p0, Lcom/example/ui/viewmodel/DhikrStats;->monthCount:I

    iget v4, v1, Lcom/example/ui/viewmodel/DhikrStats;->monthCount:I

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget v3, p0, Lcom/example/ui/viewmodel/DhikrStats;->totalCount:I

    iget v4, v1, Lcom/example/ui/viewmodel/DhikrStats;->totalCount:I

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget v3, p0, Lcom/example/ui/viewmodel/DhikrStats;->streakDays:I

    iget v4, v1, Lcom/example/ui/viewmodel/DhikrStats;->streakDays:I

    if-eq v3, v4, :cond_6

    return v2

    :cond_6
    iget-object v3, p0, Lcom/example/ui/viewmodel/DhikrStats;->topReadDhikr:Ljava/util/List;

    iget-object v1, v1, Lcom/example/ui/viewmodel/DhikrStats;->topReadDhikr:Ljava/util/List;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMonthCount()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->monthCount:I

    return v0
.end method

.method public final getStreakDays()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->streakDays:I

    return v0
.end method

.method public final getTodayCount()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->todayCount:I

    return v0
.end method

.method public final getTopReadDhikr()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->topReadDhikr:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalCount()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->totalCount:I

    return v0
.end method

.method public final getWeekCount()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->weekCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->todayCount:I

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/example/ui/viewmodel/DhikrStats;->weekCount:I

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/example/ui/viewmodel/DhikrStats;->monthCount:I

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/example/ui/viewmodel/DhikrStats;->totalCount:I

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/example/ui/viewmodel/DhikrStats;->streakDays:I

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/example/ui/viewmodel/DhikrStats;->topReadDhikr:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/example/ui/viewmodel/DhikrStats;->todayCount:I

    iget v1, p0, Lcom/example/ui/viewmodel/DhikrStats;->weekCount:I

    iget v2, p0, Lcom/example/ui/viewmodel/DhikrStats;->monthCount:I

    iget v3, p0, Lcom/example/ui/viewmodel/DhikrStats;->totalCount:I

    iget v4, p0, Lcom/example/ui/viewmodel/DhikrStats;->streakDays:I

    iget-object v5, p0, Lcom/example/ui/viewmodel/DhikrStats;->topReadDhikr:Ljava/util/List;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DhikrStats(todayCount="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", weekCount="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", monthCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", streakDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", topReadDhikr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
