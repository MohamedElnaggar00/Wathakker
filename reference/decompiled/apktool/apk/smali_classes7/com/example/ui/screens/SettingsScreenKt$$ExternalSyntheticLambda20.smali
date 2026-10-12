.class public final synthetic Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda20;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/viewmodel/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/viewmodel/MainViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda20;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda20;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/example/ui/screens/SettingsScreenKt;->SettingsScreen$lambda$9$lambda$8(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/activity/result/ActivityResult;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
