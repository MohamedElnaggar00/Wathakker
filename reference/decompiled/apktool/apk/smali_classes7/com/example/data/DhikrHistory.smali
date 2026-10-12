.class public final Lcom/example/data/DhikrHistory;
.super Ljava/lang/Object;
.source "DhikrHistory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0008H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/example/data/DhikrHistory;",
        "",
        "historyId",
        "",
        "dhikrId",
        "",
        "timestamp",
        "dateString",
        "",
        "<init>",
        "(JIJLjava/lang/String;)V",
        "getHistoryId",
        "()J",
        "getDhikrId",
        "()I",
        "getTimestamp",
        "getDateString",
        "()Ljava/lang/String;",
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
.field private final dateString:Ljava/lang/String;

.field private final dhikrId:I

.field private final historyId:J

.field private final timestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JIJLjava/lang/String;)V
    .locals 1
    .param p1, "historyId"    # J
    .param p3, "dhikrId"    # I
    .param p4, "timestamp"    # J
    .param p6, "dateString"    # Ljava/lang/String;

    const-string v0, "dateString"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-wide p1, p0, Lcom/example/data/DhikrHistory;->historyId:J

    .line 9
    iput p3, p0, Lcom/example/data/DhikrHistory;->dhikrId:I

    .line 10
    iput-wide p4, p0, Lcom/example/data/DhikrHistory;->timestamp:J

    .line 11
    iput-object p6, p0, Lcom/example/data/DhikrHistory;->dateString:Ljava/lang/String;

    .line 7
    return-void
.end method

.method public synthetic constructor <init>(JIJLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    .line 7
    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 8
    const-wide/16 p1, 0x0

    move-wide v1, p1

    goto :goto_0

    .line 7
    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_1

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    move-wide v4, p4

    goto :goto_1

    .line 7
    :cond_1
    move-wide v4, p4

    :goto_1
    move-object v0, p0

    move v3, p3

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/example/data/DhikrHistory;-><init>(JIJLjava/lang/String;)V

    .line 12
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/data/DhikrHistory;JIJLjava/lang/String;ILjava/lang/Object;)Lcom/example/data/DhikrHistory;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/example/data/DhikrHistory;->historyId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/example/data/DhikrHistory;->dhikrId:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-wide p4, p0, Lcom/example/data/DhikrHistory;->timestamp:J

    :cond_2
    move-wide v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p6, p0, Lcom/example/data/DhikrHistory;->dateString:Ljava/lang/String;

    :cond_3
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/example/data/DhikrHistory;->copy(JIJLjava/lang/String;)Lcom/example/data/DhikrHistory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/example/data/DhikrHistory;->historyId:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/example/data/DhikrHistory;->dhikrId:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/example/data/DhikrHistory;->timestamp:J

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/example/data/DhikrHistory;->dateString:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JIJLjava/lang/String;)Lcom/example/data/DhikrHistory;
    .locals 8

    const-string v0, "dateString"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/example/data/DhikrHistory;

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/example/data/DhikrHistory;-><init>(JIJLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/data/DhikrHistory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/data/DhikrHistory;

    iget-wide v3, p0, Lcom/example/data/DhikrHistory;->historyId:J

    iget-wide v5, v1, Lcom/example/data/DhikrHistory;->historyId:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/example/data/DhikrHistory;->dhikrId:I

    iget v4, v1, Lcom/example/data/DhikrHistory;->dhikrId:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/example/data/DhikrHistory;->timestamp:J

    iget-wide v5, v1, Lcom/example/data/DhikrHistory;->timestamp:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/example/data/DhikrHistory;->dateString:Ljava/lang/String;

    iget-object v1, v1, Lcom/example/data/DhikrHistory;->dateString:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDateString()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/example/data/DhikrHistory;->dateString:Ljava/lang/String;

    return-object v0
.end method

.method public final getDhikrId()I
    .locals 1

    .line 9
    iget v0, p0, Lcom/example/data/DhikrHistory;->dhikrId:I

    return v0
.end method

.method public final getHistoryId()J
    .locals 2

    .line 8
    iget-wide v0, p0, Lcom/example/data/DhikrHistory;->historyId:J

    return-wide v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 10
    iget-wide v0, p0, Lcom/example/data/DhikrHistory;->timestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/example/data/DhikrHistory;->historyId:J

    invoke-static {v0, v1}, Lcom/example/data/Dhikr$$ExternalSyntheticBackport1;->m(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/example/data/DhikrHistory;->dhikrId:I

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/example/data/DhikrHistory;->timestamp:J

    invoke-static {v2, v3}, Lcom/example/data/Dhikr$$ExternalSyntheticBackport1;->m(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/example/data/DhikrHistory;->dateString:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/example/data/DhikrHistory;->historyId:J

    iget v2, p0, Lcom/example/data/DhikrHistory;->dhikrId:I

    iget-wide v3, p0, Lcom/example/data/DhikrHistory;->timestamp:J

    iget-object v5, p0, Lcom/example/data/DhikrHistory;->dateString:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DhikrHistory(historyId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dhikrId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dateString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
