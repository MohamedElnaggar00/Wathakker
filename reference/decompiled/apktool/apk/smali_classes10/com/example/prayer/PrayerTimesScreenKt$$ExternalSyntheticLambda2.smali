.class public final synthetic Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material3/ColorScheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/material3/ColorScheme;

    iput-object p2, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/material3/ColorScheme;

    iget-object v1, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function0;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/example/prayer/PrayerTimesScreenKt;->PrayerTimesContent$lambda$49$lambda$48$lambda$36$lambda$35(Landroidx/compose/material3/ColorScheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
