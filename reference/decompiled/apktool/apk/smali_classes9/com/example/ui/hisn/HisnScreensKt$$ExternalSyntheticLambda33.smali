.class public final synthetic Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/HisnItem;

.field public final synthetic f$1:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$2:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableIntState;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Z

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/HisnItem;Landroidx/compose/material3/ColorScheme;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;ZLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$0:Lcom/example/data/HisnItem;

    iput-object p2, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$1:Landroidx/compose/material3/ColorScheme;

    iput-object p3, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$2:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    iput-object p4, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$3:Landroidx/compose/runtime/MutableIntState;

    iput-object p5, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$4:Landroidx/compose/runtime/MutableState;

    iput-boolean p6, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$5:Z

    iput-object p7, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$6:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$0:Lcom/example/data/HisnItem;

    iget-object v1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$1:Landroidx/compose/material3/ColorScheme;

    iget-object v2, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$2:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    iget-object v3, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$3:Landroidx/compose/runtime/MutableIntState;

    iget-object v4, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$4:Landroidx/compose/runtime/MutableState;

    iget-boolean v5, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$5:Z

    iget-object v6, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda33;->f$6:Lkotlin/jvm/functions/Function0;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/example/ui/hisn/HisnScreensKt;->HisnItemCard$lambda$54(Lcom/example/data/HisnItem;Landroidx/compose/material3/ColorScheme;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
