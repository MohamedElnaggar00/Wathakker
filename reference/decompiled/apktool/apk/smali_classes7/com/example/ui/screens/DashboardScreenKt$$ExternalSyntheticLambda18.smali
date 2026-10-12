.class public final synthetic Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda18;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/example/ui/screens/DhikrInstance;

    invoke-static {p1}, Lcom/example/ui/screens/DashboardScreenKt;->computeInstances$lambda$0(Lcom/example/ui/screens/DhikrInstance;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1
.end method
