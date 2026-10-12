.class final Lcom/example/widget/WidgetUpdater$IqamaState;
.super Ljava/lang/Object;
.source "WidgetUpdater.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/widget/WidgetUpdater;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "IqamaState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0082\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000f\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/example/widget/WidgetUpdater$IqamaState;",
        "",
        "prayerName",
        "",
        "adhanMillis",
        "",
        "iqamaMillis",
        "progressPct",
        "",
        "nextIqamaMillis",
        "<init>",
        "(Ljava/lang/String;JJIJ)V",
        "getPrayerName",
        "()Ljava/lang/String;",
        "getAdhanMillis",
        "()J",
        "getIqamaMillis",
        "getProgressPct",
        "()I",
        "getNextIqamaMillis",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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


# instance fields
.field private final adhanMillis:J

.field private final iqamaMillis:J

.field private final nextIqamaMillis:J

.field private final prayerName:Ljava/lang/String;

.field private final progressPct:I


# direct methods
.method public constructor <init>(Ljava/lang/String;JJIJ)V
    .locals 1
    .param p1, "prayerName"    # Ljava/lang/String;
    .param p2, "adhanMillis"    # J
    .param p4, "iqamaMillis"    # J
    .param p6, "progressPct"    # I
    .param p7, "nextIqamaMillis"    # J

    const-string v0, "prayerName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->prayerName:Ljava/lang/String;

    iput-wide p2, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->adhanMillis:J

    iput-wide p4, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->iqamaMillis:J

    .line 137
    iput p6, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->progressPct:I

    iput-wide p7, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->nextIqamaMillis:J

    .line 135
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/widget/WidgetUpdater$IqamaState;Ljava/lang/String;JJIJILjava/lang/Object;)Lcom/example/widget/WidgetUpdater$IqamaState;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->prayerName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-wide p2, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->adhanMillis:J

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-wide p4, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->iqamaMillis:J

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p6, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->progressPct:I

    :cond_3
    and-int/lit8 p9, p9, 0x10

    if-eqz p9, :cond_4

    iget-wide p7, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->nextIqamaMillis:J

    :cond_4
    move-wide p9, p7

    move p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p10}, Lcom/example/widget/WidgetUpdater$IqamaState;->copy(Ljava/lang/String;JJIJ)Lcom/example/widget/WidgetUpdater$IqamaState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->prayerName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->adhanMillis:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->iqamaMillis:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->progressPct:I

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->nextIqamaMillis:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;JJIJ)Lcom/example/widget/WidgetUpdater$IqamaState;
    .locals 10

    const-string v0, "prayerName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/example/widget/WidgetUpdater$IqamaState;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move/from16 v7, p6

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/example/widget/WidgetUpdater$IqamaState;-><init>(Ljava/lang/String;JJIJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/widget/WidgetUpdater$IqamaState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/widget/WidgetUpdater$IqamaState;

    iget-object v3, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->prayerName:Ljava/lang/String;

    iget-object v4, v1, Lcom/example/widget/WidgetUpdater$IqamaState;->prayerName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->adhanMillis:J

    iget-wide v5, v1, Lcom/example/widget/WidgetUpdater$IqamaState;->adhanMillis:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->iqamaMillis:J

    iget-wide v5, v1, Lcom/example/widget/WidgetUpdater$IqamaState;->iqamaMillis:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_4

    return v2

    :cond_4
    iget v3, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->progressPct:I

    iget v4, v1, Lcom/example/widget/WidgetUpdater$IqamaState;->progressPct:I

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->nextIqamaMillis:J

    iget-wide v5, v1, Lcom/example/widget/WidgetUpdater$IqamaState;->nextIqamaMillis:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAdhanMillis()J
    .locals 2

    .line 136
    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->adhanMillis:J

    return-wide v0
.end method

.method public final getIqamaMillis()J
    .locals 2

    .line 136
    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->iqamaMillis:J

    return-wide v0
.end method

.method public final getNextIqamaMillis()J
    .locals 2

    .line 137
    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->nextIqamaMillis:J

    return-wide v0
.end method

.method public final getPrayerName()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->prayerName:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgressPct()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->progressPct:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->prayerName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->adhanMillis:J

    invoke-static {v2, v3}, Lcom/example/widget/WidgetUpdater$IqamaState$$ExternalSyntheticBackport0;->m(J)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->iqamaMillis:J

    invoke-static {v2, v3}, Lcom/example/widget/WidgetUpdater$IqamaState$$ExternalSyntheticBackport0;->m(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->progressPct:I

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->nextIqamaMillis:J

    invoke-static {v2, v3}, Lcom/example/widget/WidgetUpdater$IqamaState$$ExternalSyntheticBackport0;->m(J)I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->prayerName:Ljava/lang/String;

    iget-wide v1, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->adhanMillis:J

    iget-wide v3, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->iqamaMillis:J

    iget v5, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->progressPct:I

    iget-wide v6, p0, Lcom/example/widget/WidgetUpdater$IqamaState;->nextIqamaMillis:J

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "IqamaState(prayerName="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, ", adhanMillis="

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iqamaMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", progressPct="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nextIqamaMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
