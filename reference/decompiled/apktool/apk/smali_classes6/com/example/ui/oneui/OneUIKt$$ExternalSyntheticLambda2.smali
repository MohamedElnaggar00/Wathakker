.class public final synthetic Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material3/ColorScheme;Ljava/util/List;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/material3/ColorScheme;

    iput-object p2, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$1:Ljava/util/List;

    iput-object p3, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$4:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/material3/ColorScheme;

    iget-object v1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$1:Ljava/util/List;

    iget-object v2, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda2;->f$4:Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/animation/AnimatedVisibilityScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/ui/oneui/OneUIKt;->OneUIDrawer$lambda$80$lambda$79(Landroidx/compose/material3/ColorScheme;Ljava/util/List;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
