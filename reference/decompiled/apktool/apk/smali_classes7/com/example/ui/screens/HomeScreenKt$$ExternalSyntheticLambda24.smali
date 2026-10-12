.class public final synthetic Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Dhikr;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Ljava/util/List;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$8:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$9:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ColorScheme;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$0:Lcom/example/data/Dhikr;

    iput-object p2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$2:Landroidx/compose/material3/ColorScheme;

    iput-object p4, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$5:Ljava/util/List;

    iput-object p7, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$6:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$7:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$8:Lkotlin/jvm/functions/Function0;

    iput-object p10, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$9:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$0:Lcom/example/data/Dhikr;

    iget-object v1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$2:Landroidx/compose/material3/ColorScheme;

    iget-object v3, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$5:Ljava/util/List;

    iget-object v6, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$6:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$7:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$8:Lkotlin/jvm/functions/Function0;

    iget-object v9, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda24;->f$9:Lkotlin/jvm/functions/Function0;

    move-object v10, p1

    check-cast v10, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v11, p2

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/example/ui/screens/HomeScreenKt;->DhikrItemCard$lambda$88(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ColorScheme;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
