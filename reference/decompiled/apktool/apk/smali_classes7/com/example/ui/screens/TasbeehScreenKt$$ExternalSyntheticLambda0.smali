.class public final synthetic Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$1:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:F

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material3/ColorScheme;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Lkotlin/jvm/functions/Function0;FI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/material3/ColorScheme;

    iput-object p2, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    iput-object p3, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function0;

    iput p4, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$3:F

    iput p5, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/material3/ColorScheme;

    iget-object v1, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    iget-object v2, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function0;

    iget v3, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$3:F

    iget v4, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda0;->f$4:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/ui/screens/TasbeehScreenKt;->TasbeehContent$lambda$25$lambda$24$lambda$16(Landroidx/compose/material3/ColorScheme;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Lkotlin/jvm/functions/Function0;FILandroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
