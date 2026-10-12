.class final Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;
.super Ljava/lang/Object;
.source "PrayerTimesCalculator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/fajr/calculation/PrayerTimesCalculator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SolarParams"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;",
        "",
        "transit",
        "",
        "declination",
        "<init>",
        "(DD)V",
        "getTransit",
        "()D",
        "getDeclination",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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


# instance fields
.field private final declination:D

.field private final transit:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0
    .param p1, "transit"    # D
    .param p3, "declination"    # D

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->transit:D

    iput-wide p3, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->declination:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;DDILjava/lang/Object;)Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->transit:D

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    iget-wide p3, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->declination:D

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->copy(DD)Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->transit:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->declination:D

    return-wide v0
.end method

.method public final copy(DD)Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;
    .locals 1

    new-instance v0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;-><init>(DD)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;

    iget-wide v3, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->transit:D

    iget-wide v5, v1, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->transit:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->declination:D

    iget-wide v5, v1, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->declination:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDeclination()D
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->declination:D

    return-wide v0
.end method

.method public final getTransit()D
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->transit:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->transit:D

    invoke-static {v0, v1}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams$$ExternalSyntheticBackport0;->m(D)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->declination:D

    invoke-static {v2, v3}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams$$ExternalSyntheticBackport0;->m(D)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->transit:D

    iget-wide v2, p0, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->declination:D

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SolarParams(transit="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", declination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
