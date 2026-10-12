.class public final synthetic Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$4:Z

.field public final synthetic f$5:Ljava/lang/String;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$3:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$4:Z

    iput-object p6, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$5:Ljava/lang/String;

    iput-object p7, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$6:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$3:Lkotlin/jvm/functions/Function1;

    iget-boolean v4, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$4:Z

    iget-object v5, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$5:Ljava/lang/String;

    iget-object v6, p0, Lcom/example/ui/screens/SettingsScreenKt$$ExternalSyntheticLambda13;->f$6:Lkotlin/jvm/functions/Function0;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v7}, Lcom/example/ui/screens/SettingsScreenKt;->SettingsContent$lambda$42$lambda$41(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
