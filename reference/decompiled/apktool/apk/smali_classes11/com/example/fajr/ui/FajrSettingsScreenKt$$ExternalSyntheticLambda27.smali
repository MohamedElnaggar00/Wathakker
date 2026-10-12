.class public final synthetic Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda27;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/example/fajr/ui/FajrViewModel;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/example/fajr/ui/FajrViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda27;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda27;->f$1:Lcom/example/fajr/ui/FajrViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda27;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda27;->f$1:Lcom/example/fajr/ui/FajrViewModel;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lcom/example/fajr/ui/FajrSettingsScreenKt;->FajrSettingsScreen$lambda$18$lambda$17(Landroid/content/Context;Lcom/example/fajr/ui/FajrViewModel;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
