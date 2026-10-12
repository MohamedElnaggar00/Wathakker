.class public final synthetic Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/fajr/data/FajrPreferences;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/fajr/data/FajrPreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$0:Lcom/example/fajr/data/FajrPreferences;

    iput-object p2, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$3:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$5:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$0:Lcom/example/fajr/data/FajrPreferences;

    iget-object v1, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$3:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/prayer/PrayerTimesScreenKt$$ExternalSyntheticLambda8;->f$5:Landroidx/compose/runtime/MutableState;

    move-object v6, p1

    check-cast v6, Lcom/example/fajr/data/CityItem;

    invoke-static/range {v0 .. v6}, Lcom/example/prayer/PrayerTimesScreenKt;->PrayerTimesScreen$lambda$31$lambda$30(Lcom/example/fajr/data/FajrPreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/example/fajr/data/CityItem;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
