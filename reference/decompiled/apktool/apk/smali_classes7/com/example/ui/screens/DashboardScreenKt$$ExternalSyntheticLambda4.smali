.class public final synthetic Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Dhikr;

.field public final synthetic f$1:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Lcom/example/ui/screens/DhikrInstance;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Dhikr;Landroidx/compose/material3/ColorScheme;Lkotlin/jvm/functions/Function0;Lcom/example/ui/screens/DhikrInstance;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;->f$0:Lcom/example/data/Dhikr;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;->f$1:Landroidx/compose/material3/ColorScheme;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;->f$3:Lcom/example/ui/screens/DhikrInstance;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;->f$0:Lcom/example/data/Dhikr;

    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;->f$1:Landroidx/compose/material3/ColorScheme;

    iget-object v2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda4;->f$3:Lcom/example/ui/screens/DhikrInstance;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/example/ui/screens/DashboardScreenKt;->DhikrHighlightCard$lambda$33(Lcom/example/data/Dhikr;Landroidx/compose/material3/ColorScheme;Lkotlin/jvm/functions/Function0;Lcom/example/ui/screens/DhikrInstance;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
