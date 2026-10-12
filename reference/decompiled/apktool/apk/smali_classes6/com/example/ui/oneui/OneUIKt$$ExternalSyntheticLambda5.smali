.class public final synthetic Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/Modifier;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic f$3:J

.field public final synthetic f$4:Lkotlin/jvm/functions/Function3;

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;JLkotlin/jvm/functions/Function3;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$0:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$2:Landroidx/compose/foundation/layout/PaddingValues;

    iput-wide p4, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$3:J

    iput-object p6, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$4:Lkotlin/jvm/functions/Function3;

    iput p7, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$5:I

    iput p8, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$0:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$2:Landroidx/compose/foundation/layout/PaddingValues;

    iget-wide v3, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$3:J

    iget-object v5, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$4:Lkotlin/jvm/functions/Function3;

    iget v6, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$5:I

    iget v7, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda5;->f$6:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/example/ui/oneui/OneUIKt;->OneUICard_uDo3WH8$lambda$22(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;JLkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
