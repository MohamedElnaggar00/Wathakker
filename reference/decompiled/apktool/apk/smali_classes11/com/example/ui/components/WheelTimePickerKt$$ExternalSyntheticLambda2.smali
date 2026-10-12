.class public final synthetic Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:I

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Landroidx/compose/ui/Modifier;

.field public final synthetic f$4:I

.field public final synthetic f$5:F

.field public final synthetic f$6:I

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$0:Ljava/util/List;

    iput p2, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$1:I

    iput-object p3, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$3:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$4:I

    iput p6, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$5:F

    iput p7, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$6:I

    iput p8, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$0:Ljava/util/List;

    iget v1, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$1:I

    iget-object v2, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$3:Landroidx/compose/ui/Modifier;

    iget v4, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$4:I

    iget v5, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$5:F

    iget v6, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$6:I

    iget v7, p0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn_HYR8e34$lambda$30(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
