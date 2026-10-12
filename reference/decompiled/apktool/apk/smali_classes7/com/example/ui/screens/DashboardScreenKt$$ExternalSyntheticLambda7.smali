.class public final synthetic Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/screens/DhikrInstance;

.field public final synthetic f$1:Lcom/example/ui/screens/DhikrInstance;

.field public final synthetic f$2:Lcom/example/ui/viewmodel/DhikrStats;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/screens/DhikrInstance;Lcom/example/ui/screens/DhikrInstance;Lcom/example/ui/viewmodel/DhikrStats;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$0:Lcom/example/ui/screens/DhikrInstance;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$1:Lcom/example/ui/screens/DhikrInstance;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$2:Lcom/example/ui/viewmodel/DhikrStats;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$3:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$4:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$0:Lcom/example/ui/screens/DhikrInstance;

    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$1:Lcom/example/ui/screens/DhikrInstance;

    iget-object v2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$2:Lcom/example/ui/viewmodel/DhikrStats;

    iget-object v3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$3:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda7;->f$4:Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/DashboardScreenKt;->HomeContent$lambda$26$lambda$25(Lcom/example/ui/screens/DhikrInstance;Lcom/example/ui/screens/DhikrInstance;Lcom/example/ui/viewmodel/DhikrStats;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
