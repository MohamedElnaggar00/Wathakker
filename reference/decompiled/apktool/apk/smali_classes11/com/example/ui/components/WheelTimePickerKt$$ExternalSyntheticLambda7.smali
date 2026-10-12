.class public final synthetic Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:F

.field public final synthetic f$3:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;FLandroidx/compose/runtime/State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;->f$0:I

    iput-object p2, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;->f$1:Ljava/util/List;

    iput p3, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;->f$2:F

    iput-object p4, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;->f$3:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget v0, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;->f$0:I

    iget-object v1, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;->f$1:Ljava/util/List;

    iget v2, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;->f$2:F

    iget-object v3, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;->f$3:Landroidx/compose/runtime/State;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27$lambda$26(ILjava/util/List;FLandroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
