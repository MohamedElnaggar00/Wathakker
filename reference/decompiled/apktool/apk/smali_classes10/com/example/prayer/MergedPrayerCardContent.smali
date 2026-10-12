.class public final Lcom/example/prayer/MergedPrayerCardContent;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field private final f0:Landroidx/compose/material3/ColorScheme;

.field private final f1:Ljava/lang/String;

.field private final f2:Ljava/lang/String;

.field private final f3:Lkotlin/jvm/functions/Function0;

.field private final f4:F

.field private final f5:Ljava/lang/String;

.field private final f6:Ljava/lang/String;

.field private final f7:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/ColorScheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/prayer/MergedPrayerCardContent;->f0:Landroidx/compose/material3/ColorScheme;

    iput-object p2, p0, Lcom/example/prayer/MergedPrayerCardContent;->f1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/prayer/MergedPrayerCardContent;->f2:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/prayer/MergedPrayerCardContent;->f3:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lcom/example/prayer/MergedPrayerCardContent;->f4:F

    iput-object p6, p0, Lcom/example/prayer/MergedPrayerCardContent;->f5:Ljava/lang/String;

    iput-object p7, p0, Lcom/example/prayer/MergedPrayerCardContent;->f6:Ljava/lang/String;

    iput-object p8, p0, Lcom/example/prayer/MergedPrayerCardContent;->f7:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lcom/example/prayer/MergedPrayerCardContent;->f0:Landroidx/compose/material3/ColorScheme;

    iget-object v1, p0, Lcom/example/prayer/MergedPrayerCardContent;->f1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/prayer/MergedPrayerCardContent;->f2:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/prayer/MergedPrayerCardContent;->f3:Lkotlin/jvm/functions/Function0;

    move-object v4, p1

    move-object v5, p2

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/example/prayer/PrayerTimesScreenKt;->PrayerTimesContent$lambda$49$lambda$48$lambda$36$lambda$35(Landroidx/compose/material3/ColorScheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    const/high16 v0, 0x41400000    # 12.0f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, p2, v1, v2}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    iget v0, p0, Lcom/example/prayer/MergedPrayerCardContent;->f4:F

    iget-object v1, p0, Lcom/example/prayer/MergedPrayerCardContent;->f0:Landroidx/compose/material3/ColorScheme;

    iget-object v2, p0, Lcom/example/prayer/MergedPrayerCardContent;->f5:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/prayer/MergedPrayerCardContent;->f6:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/prayer/MergedPrayerCardContent;->f7:Ljava/lang/String;

    move-object v5, p1

    move-object v6, p2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lcom/example/prayer/PrayerTimesScreenKt;->PrayerTimesContent$lambda$49$lambda$48$lambda$42$lambda$41(FLandroidx/compose/material3/ColorScheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
