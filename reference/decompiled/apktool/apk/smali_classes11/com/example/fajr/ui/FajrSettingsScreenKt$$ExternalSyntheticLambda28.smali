.class public final synthetic Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda28;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/fajr/ui/FajrViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/example/fajr/ui/FajrViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda28;->f$0:Lcom/example/fajr/ui/FajrViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda28;->f$0:Lcom/example/fajr/ui/FajrViewModel;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, p1}, Lcom/example/fajr/ui/FajrSettingsScreenKt;->FajrSettingsScreen$lambda$21$lambda$20(Lcom/example/fajr/ui/FajrViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
