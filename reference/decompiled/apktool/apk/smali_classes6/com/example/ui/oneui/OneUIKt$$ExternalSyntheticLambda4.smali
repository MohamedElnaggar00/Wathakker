.class public final synthetic Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/Modifier;

.field public final synthetic f$1:Landroidx/compose/foundation/shape/RoundedCornerShape;

.field public final synthetic f$2:J

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/shape/RoundedCornerShape;JLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$0:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$1:Landroidx/compose/foundation/shape/RoundedCornerShape;

    iput-wide p3, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$2:J

    iput-object p5, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$4:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p7, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$5:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$0:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$1:Landroidx/compose/foundation/shape/RoundedCornerShape;

    iget-wide v2, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$2:J

    iget-object v4, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$4:Landroidx/compose/foundation/layout/PaddingValues;

    iget-object v6, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda4;->f$5:Lkotlin/jvm/functions/Function3;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/example/ui/oneui/OneUIKt;->OneUICard_uDo3WH8$lambda$21(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/shape/RoundedCornerShape;JLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
