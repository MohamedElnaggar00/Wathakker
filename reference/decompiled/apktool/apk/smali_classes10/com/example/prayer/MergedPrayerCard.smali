.class public final Lcom/example/prayer/MergedPrayerCard;
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

    iput-object p1, p0, Lcom/example/prayer/MergedPrayerCard;->f0:Landroidx/compose/material3/ColorScheme;

    iput-object p2, p0, Lcom/example/prayer/MergedPrayerCard;->f1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/prayer/MergedPrayerCard;->f2:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/prayer/MergedPrayerCard;->f3:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lcom/example/prayer/MergedPrayerCard;->f4:F

    iput-object p6, p0, Lcom/example/prayer/MergedPrayerCard;->f5:Ljava/lang/String;

    iput-object p7, p0, Lcom/example/prayer/MergedPrayerCard;->f6:Ljava/lang/String;

    iput-object p8, p0, Lcom/example/prayer/MergedPrayerCard;->f7:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    new-instance v0, Lcom/example/prayer/MergedPrayerCardContent;

    iget-object v1, p0, Lcom/example/prayer/MergedPrayerCard;->f0:Landroidx/compose/material3/ColorScheme;

    iget-object v2, p0, Lcom/example/prayer/MergedPrayerCard;->f1:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/prayer/MergedPrayerCard;->f2:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/prayer/MergedPrayerCard;->f3:Lkotlin/jvm/functions/Function0;

    iget v5, p0, Lcom/example/prayer/MergedPrayerCard;->f4:F

    iget-object v6, p0, Lcom/example/prayer/MergedPrayerCard;->f5:Ljava/lang/String;

    iget-object v7, p0, Lcom/example/prayer/MergedPrayerCard;->f6:Ljava/lang/String;

    iget-object v8, p0, Lcom/example/prayer/MergedPrayerCard;->f7:Ljava/lang/String;

    invoke-direct/range {v0 .. v8}, Lcom/example/prayer/MergedPrayerCardContent;-><init>(Landroidx/compose/material3/ColorScheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v0

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v6, p2

    const/4 v7, 0x0

    const/16 v8, 0xb

    invoke-static/range {v0 .. v8}, Lcom/example/ui/oneui/OneUIKt;->OneUICard-uDo3WH8(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
