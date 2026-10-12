.class public final synthetic Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroidx/compose/foundation/lazy/LazyListState;

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/lazy/LazyListState;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/foundation/lazy/LazyListState;

    iput p2, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda0;->f$1:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/foundation/lazy/LazyListState;

    iget v1, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda0;->f$1:I

    invoke-static {v0, v1}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn_HYR8e34$lambda$22$lambda$21(Landroidx/compose/foundation/lazy/LazyListState;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
