.class public final synthetic Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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

    iput p1, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;->f$0:I

    iput-object p2, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;->f$1:Ljava/util/List;

    iput p3, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;->f$2:F

    iput-object p4, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;->f$3:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget v0, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;->f$0:I

    iget-object v1, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;->f$1:Ljava/util/List;

    iget v2, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;->f$2:F

    iget-object v3, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;->f$3:Landroidx/compose/runtime/State;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27(ILjava/util/List;FLandroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
