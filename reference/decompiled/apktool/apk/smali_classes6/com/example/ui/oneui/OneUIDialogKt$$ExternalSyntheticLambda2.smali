.class public final synthetic Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Ljava/lang/String;

.field public final synthetic f$5:Z

.field public final synthetic f$6:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function3;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$4:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$5:Z

    iput-object p7, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$6:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$4:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$5:Z

    iget-object v6, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda2;->f$6:Lkotlin/jvm/functions/Function3;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/example/ui/oneui/OneUIDialogKt;->OneUIDialog$lambda$11(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
