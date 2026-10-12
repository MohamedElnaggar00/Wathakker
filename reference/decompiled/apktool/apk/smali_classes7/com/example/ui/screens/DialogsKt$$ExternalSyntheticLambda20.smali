.class public final synthetic Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda20;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Landroidx/compose/material3/ColorScheme;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/ColorScheme;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda20;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda20;->f$1:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda20;->f$2:Landroidx/compose/material3/ColorScheme;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda20;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda20;->f$1:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda20;->f$2:Landroidx/compose/material3/ColorScheme;

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/DialogsKt;->TimesEditor$lambda$65(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/ColorScheme;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
