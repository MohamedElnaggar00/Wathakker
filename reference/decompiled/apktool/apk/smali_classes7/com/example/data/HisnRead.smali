.class public final Lcom/example/data/HisnRead;
.super Ljava/lang/Object;
.source "Hisn.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000c\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/example/data/HisnRead;",
        "",
        "id",
        "",
        "chapterId",
        "",
        "dateString",
        "",
        "timestamp",
        "<init>",
        "(JILjava/lang/String;J)V",
        "getId",
        "()J",
        "getChapterId",
        "()I",
        "getDateString",
        "()Ljava/lang/String;",
        "getTimestamp",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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

.field private final dateString:Ljava/lang/String;

.field private final id:J

.field private final timestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JILjava/lang/String;J)V
    .locals 1
    .param p1, "id"    # J
    .param p3, "chapterId"    # I
    .param p4, "dateString"    # Ljava/lang/String;
    .param p5, "timestamp"    # J

    const-string v0, "dateString"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-wide p1, p0, Lcom/example/data/HisnRead;->id:J

    .line 46
    iput p3, p0, Lcom/example/data/HisnRead;->chapterId:I

    .line 47
    iput-object p4, p0, Lcom/example/data/HisnRead;->dateString:Ljava/lang/String;

    .line 48
    iput-wide p5, p0, Lcom/example/data/HisnRead;->timestamp:J

    .line 44
    return-void
.end method

.method public synthetic constructor <init>(JILjava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    .line 44
    and-int/lit8 p7, p7, 0x1

    if-eqz p7, :cond_0

    .line 45
    const-wide/16 p1, 0x0

    move-wide v1, p1

    goto :goto_0

    .line 44
    :cond_0
    move-wide v1, p1

    :goto_0
    move-object v0, p0

    move v3, p3

    move-object v4, p4

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/example/data/HisnRead;-><init>(JILjava/lang/String;J)V

    .line 49
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/data/HisnRead;JILjava/lang/String;JILjava/lang/Object;)Lcom/example/data/HisnRead;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/example/data/HisnRead;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/example/data/HisnRead;->chapterId:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/example/data/HisnRead;->dateString:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-wide p5, p0, Lcom/example/data/HisnRead;->timestamp:J

    :cond_3
    move-object v0, p0

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/example/data/HisnRead;->copy(JILjava/lang/String;J)Lcom/example/data/HisnRead;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/example/data/HisnRead;->id:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/example/data/HisnRead;->chapterId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/example/data/HisnRead;->dateString:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/example/data/HisnRead;->timestamp:J

    return-wide v0
.end method

.method public final copy(JILjava/lang/String;J)Lcom/example/data/HisnRead;
    .locals 8

    const-string v0, "dateString"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/example/data/HisnRead;

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move-wide v6, p5

    invoke-direct/range {v1 .. v7}, Lcom/example/data/HisnRead;-><init>(JILjava/lang/String;J)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/data/HisnRead;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/data/HisnRead;

    iget-wide v3, p0, Lcom/example/data/HisnRead;->id:J

    iget-wide v5, v1, Lcom/example/data/HisnRead;->id:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/example/data/HisnRead;->chapterId:I

    iget v4, v1, Lcom/example/data/HisnRead;->chapterId:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/example/data/HisnRead;->dateString:Ljava/lang/String;

    iget-object v4, v1, Lcom/example/data/HisnRead;->dateString:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/example/data/HisnRead;->timestamp:J

    iget-wide v5, v1, Lcom/example/data/HisnRead;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getChapterId()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/example/data/HisnRead;->chapterId:I

    return v0
.end method

.method public final getDateString()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/example/data/HisnRead;->dateString:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/example/data/HisnRead;->id:J

    return-wide v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 48
    iget-wide v0, p0, Lcom/example/data/HisnRead;->timestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/example/data/HisnRead;->id:J

    invoke-static {v0, v1}, Lcom/example/data/Dhikr$$ExternalSyntheticBackport1;->m(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/example/data/HisnRead;->chapterId:I

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/example/data/HisnRead;->dateString:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/example/data/HisnRead;->timestamp:J

    invoke-static {v2, v3}, Lcom/example/data/Dhikr$$ExternalSyntheticBackport1;->m(J)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/example/data/HisnRead;->id:J

    iget v2, p0, Lcom/example/data/HisnRead;->chapterId:I

    iget-object v3, p0, Lcom/example/data/HisnRead;->dateString:Ljava/lang/String;

    iget-wide v4, p0, Lcom/example/data/HisnRead;->timestamp:J

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "HisnRead(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", chapterId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dateString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
