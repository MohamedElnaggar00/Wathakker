.class public final Lcom/example/data/HisnFavorite;
.super Ljava/lang/Object;
.source "Hisn.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/example/data/HisnFavorite;",
        "",
        "id",
        "",
        "chapterId",
        "",
        "itemId",
        "<init>",
        "(JII)V",
        "getId",
        "()J",
        "getChapterId",
        "()I",
        "getItemId",
        "component1",
        "component2",
        "component3",
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
.field private final chapterId:I

.field private final id:J

.field private final itemId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JII)V
    .locals 0
    .param p1, "id"    # J
    .param p3, "chapterId"    # I
    .param p4, "itemId"    # I

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-wide p1, p0, Lcom/example/data/HisnFavorite;->id:J

    .line 39
    iput p3, p0, Lcom/example/data/HisnFavorite;->chapterId:I

    .line 40
    iput p4, p0, Lcom/example/data/HisnFavorite;->itemId:I

    .line 37
    return-void
.end method

.method public synthetic constructor <init>(JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 37
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 38
    const-wide/16 p1, 0x0

    .line 37
    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    .line 40
    const/4 p4, 0x0

    .line 37
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/example/data/HisnFavorite;-><init>(JII)V

    .line 41
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/data/HisnFavorite;JIIILjava/lang/Object;)Lcom/example/data/HisnFavorite;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/example/data/HisnFavorite;->id:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p3, p0, Lcom/example/data/HisnFavorite;->chapterId:I

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget p4, p0, Lcom/example/data/HisnFavorite;->itemId:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/data/HisnFavorite;->copy(JII)Lcom/example/data/HisnFavorite;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/example/data/HisnFavorite;->id:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/example/data/HisnFavorite;->chapterId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/example/data/HisnFavorite;->itemId:I

    return v0
.end method

.method public final copy(JII)Lcom/example/data/HisnFavorite;
    .locals 1

    new-instance v0, Lcom/example/data/HisnFavorite;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/example/data/HisnFavorite;-><init>(JII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/data/HisnFavorite;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/data/HisnFavorite;

    iget-wide v3, p0, Lcom/example/data/HisnFavorite;->id:J

    iget-wide v5, v1, Lcom/example/data/HisnFavorite;->id:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/example/data/HisnFavorite;->chapterId:I

    iget v4, v1, Lcom/example/data/HisnFavorite;->chapterId:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget v3, p0, Lcom/example/data/HisnFavorite;->itemId:I

    iget v1, v1, Lcom/example/data/HisnFavorite;->itemId:I

    if-eq v3, v1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getChapterId()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/example/data/HisnFavorite;->chapterId:I

    return v0
.end method

.method public final getId()J
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/example/data/HisnFavorite;->id:J

    return-wide v0
.end method

.method public final getItemId()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/example/data/HisnFavorite;->itemId:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/example/data/HisnFavorite;->id:J

    invoke-static {v0, v1}, Lcom/example/data/Dhikr$$ExternalSyntheticBackport1;->m(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/example/data/HisnFavorite;->chapterId:I

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/example/data/HisnFavorite;->itemId:I

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/example/data/HisnFavorite;->id:J

    iget v2, p0, Lcom/example/data/HisnFavorite;->chapterId:I

    iget v3, p0, Lcom/example/data/HisnFavorite;->itemId:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HisnFavorite(id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", chapterId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", itemId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
