.class public final synthetic Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/Modifier;

.field public final synthetic f$1:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lkotlin/jvm/functions/Function3;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$7:Z

.field public final synthetic f$8:Ljava/lang/String;

.field public final synthetic f$9:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ColorScheme;Ljava/lang/String;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$0:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$1:Landroidx/compose/material3/ColorScheme;

    iput-object p3, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$2:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$3:Z

    iput-object p5, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$4:Lkotlin/jvm/functions/Function3;

    iput-object p6, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$5:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$6:Lkotlin/jvm/functions/Function0;

    iput-boolean p8, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$7:Z

    iput-object p9, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$8:Ljava/lang/String;

    iput-object p10, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$9:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$0:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$1:Landroidx/compose/material3/ColorScheme;

    iget-object v2, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$2:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$3:Z

    iget-object v4, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$4:Lkotlin/jvm/functions/Function3;

    iget-object v5, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$5:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$6:Lkotlin/jvm/functions/Function0;

    iget-boolean v7, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$7:Z

    iget-object v8, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$8:Ljava/lang/String;

    iget-object v9, p0, Lcom/example/ui/oneui/OneUIDialogKt$$ExternalSyntheticLambda4;->f$9:Ljava/lang/String;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/example/ui/oneui/OneUIDialogKt;->OneUIDialogSurface$lambda$9(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ColorScheme;Ljava/lang/String;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
