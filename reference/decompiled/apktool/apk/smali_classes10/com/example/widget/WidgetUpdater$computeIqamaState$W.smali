.class public final Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
.super Ljava/lang/Object;
.source "WidgetUpdater.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/widget/WidgetUpdater;->computeIqamaState(Landroid/content/Context;Lcom/example/widget/WidgetUpdater$PrayerState;J)Lcom/example/widget/WidgetUpdater$IqamaState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "W"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002*\u0001\u0000\u0008\u008a\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J,\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "com/example/widget/WidgetUpdater$computeIqamaState$W",
        "",
        "name",
        "",
        "adhan",
        "",
        "iqama",
        "<init>",
        "(Ljava/lang/String;JJ)V",
        "getName",
        "()Ljava/lang/String;",
        "getAdhan",
        "()J",
        "getIqama",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/String;JJ)Lcom/example/widget/WidgetUpdater$computeIqamaState$W;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final adhan:J

.field private final iqama:J

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "adhan"    # J
    .param p4, "iqama"    # J

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->name:Ljava/lang/String;

    iput-wide p2, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->adhan:J

    iput-wide p4, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->iqama:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/widget/WidgetUpdater$computeIqamaState$W;Ljava/lang/String;JJILjava/lang/Object;)Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->adhan:J

    :cond_1
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_2

    iget-wide p4, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->iqama:J

    :cond_2
    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->copy(Ljava/lang/String;JJ)Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->adhan:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->iqama:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;JJ)Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;-><init>(Ljava/lang/String;JJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    iget-object v3, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->name:Ljava/lang/String;

    iget-object v4, v1, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->name:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->adhan:J

    iget-wide v5, v1, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->adhan:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->iqama:J

    iget-wide v5, v1, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->iqama:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAdhan()J
    .locals 2

    .line 145
    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->adhan:J

    return-wide v0
.end method

.method public final getIqama()J
    .locals 2

    .line 145
    iget-wide v0, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->iqama:J

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->adhan:J

    invoke-static {v2, v3}, Lcom/example/widget/WidgetUpdater$IqamaState$$ExternalSyntheticBackport0;->m(J)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->iqama:J

    invoke-static {v2, v3}, Lcom/example/widget/WidgetUpdater$IqamaState$$ExternalSyntheticBackport0;->m(J)I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->name:Ljava/lang/String;

    iget-wide v1, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->adhan:J

    iget-wide v3, p0, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->iqama:J

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "W(name="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", adhan="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iqama="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
