.class public final Lcom/example/data/DhikrTagCrossRef;
.super Ljava/lang/Object;
.source "DhikrTagCrossRef.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/example/data/DhikrTagCrossRef;",
        "",
        "dhikrId",
        "",
        "tagId",
        "",
        "<init>",
        "(IJ)V",
        "getDhikrId",
        "()I",
        "getTagId",
        "()J",
        "component1",
        "component2",
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
.field private final dhikrId:I

.field private final tagId:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0
    .param p1, "dhikrId"    # I
    .param p2, "tagId"    # J

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lcom/example/data/DhikrTagCrossRef;->dhikrId:I

    .line 16
    iput-wide p2, p0, Lcom/example/data/DhikrTagCrossRef;->tagId:J

    .line 14
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/data/DhikrTagCrossRef;IJILjava/lang/Object;)Lcom/example/data/DhikrTagCrossRef;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/example/data/DhikrTagCrossRef;->dhikrId:I

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lcom/example/data/DhikrTagCrossRef;->tagId:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/example/data/DhikrTagCrossRef;->copy(IJ)Lcom/example/data/DhikrTagCrossRef;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/example/data/DhikrTagCrossRef;->dhikrId:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/example/data/DhikrTagCrossRef;->tagId:J

    return-wide v0
.end method

.method public final copy(IJ)Lcom/example/data/DhikrTagCrossRef;
    .locals 1

    new-instance v0, Lcom/example/data/DhikrTagCrossRef;

    invoke-direct {v0, p1, p2, p3}, Lcom/example/data/DhikrTagCrossRef;-><init>(IJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/data/DhikrTagCrossRef;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/data/DhikrTagCrossRef;

    iget v3, p0, Lcom/example/data/DhikrTagCrossRef;->dhikrId:I

    iget v4, v1, Lcom/example/data/DhikrTagCrossRef;->dhikrId:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/example/data/DhikrTagCrossRef;->tagId:J

    iget-wide v5, v1, Lcom/example/data/DhikrTagCrossRef;->tagId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDhikrId()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/example/data/DhikrTagCrossRef;->dhikrId:I

    return v0
.end method

.method public final getTagId()J
    .locals 2

    .line 16
    iget-wide v0, p0, Lcom/example/data/DhikrTagCrossRef;->tagId:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/example/data/DhikrTagCrossRef;->dhikrId:I

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/example/data/DhikrTagCrossRef;->tagId:J

    invoke-static {v2, v3}, Lcom/example/data/Dhikr$$ExternalSyntheticBackport1;->m(J)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/example/data/DhikrTagCrossRef;->dhikrId:I

    iget-wide v1, p0, Lcom/example/data/DhikrTagCrossRef;->tagId:J

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DhikrTagCrossRef(dhikrId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", tagId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
