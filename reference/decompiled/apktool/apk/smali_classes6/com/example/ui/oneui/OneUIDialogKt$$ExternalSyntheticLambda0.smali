.class public final synthetic Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroid/view/View;

.field public final synthetic f$1:Landroidx/compose/ui/unit/Density;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroidx/compose/ui/unit/Density;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda0;->f$0:Landroid/view/View;

    iput-object p2, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/ui/unit/Density;

    iput p3, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda0;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda0;->f$0:Landroid/view/View;

    iget-object v1, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/ui/unit/Density;

    iget v2, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda0;->f$2:I

    invoke-static {v0, v1, v2}, Lcom/example/ui/oneui/OneUIDialogKt;->BlurBehindDialogWindow$lambda$2$lambda$1(Landroid/view/View;Landroidx/compose/ui/unit/Density;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
