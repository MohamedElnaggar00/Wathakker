.class public final synthetic Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda8;
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
    check-cast p1, Lcom/example/data/Dhikr;

    invoke-static {p1}, Lcom/example/ui/screens/HomeScreenKt;->dhikrCards$lambda$51(Lcom/example/data/Dhikr;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
