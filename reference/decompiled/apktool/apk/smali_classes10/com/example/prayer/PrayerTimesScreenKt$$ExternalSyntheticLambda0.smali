.class public final synthetic Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:F

.field public final synthetic f$1:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(FLandroidx/compose/material3/ColorScheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$0:F

    iput-object p2, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/material3/ColorScheme;

    iput-object p3, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$4:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget v0, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$0:F

    iget-object v1, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/material3/ColorScheme;

    iget-object v2, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda0;->f$4:Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/prayer/PrayerTimesScreenKt;->PrayerTimesContent$lambda$49$lambda$48$lambda$42$lambda$41(FLandroidx/compose/material3/ColorScheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
