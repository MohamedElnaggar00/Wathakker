.class public final Lcom/example/widget/WidgetConfigActivity;
.super Landroidx/activity/ComponentActivity;
.source "WidgetConfigActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWidgetConfigActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetConfigActivity.kt\ncom/example/widget/WidgetConfigActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,138:1\n1282#2,6:139\n*S KotlinDebug\n*F\n+ 1 WidgetConfigActivity.kt\ncom/example/widget/WidgetConfigActivity\n*L\n53#1:139,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/example/widget/WidgetConfigActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "appWidgetId",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private appWidgetId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/widget/WidgetConfigActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    return-void
.end method

.method static final onCreate$lambda$3(Lcom/example/fajr/data/FajrPreferences;Lcom/example/widget/WidgetConfigActivity;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 5
    .param p0, "$prefs"    # Lcom/example/fajr/data/FajrPreferences;
    .param p1, "this$0"    # Lcom/example/widget/WidgetConfigActivity;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    const-string v0, "C51@2237L445,51@2161L521:WidgetConfigActivity.kt#9u2u6t"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.widget.WidgetConfigActivity.onCreate.<anonymous> (WidgetConfigActivity.kt:51)"

    const v3, -0x774e0533

    invoke-static {v3, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 52
    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v0

    new-instance v1, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda0;-><init>(Lcom/example/fajr/data/FajrPreferences;Lcom/example/widget/WidgetConfigActivity;)V

    const/16 v3, 0x36

    const v4, -0x35598073    # -5455814.5f

    invoke-static {v4, v2, v1, p2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    sget v2, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p2, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 51
    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 63
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final onCreate$lambda$3$lambda$2(Lcom/example/fajr/data/FajrPreferences;Lcom/example/widget/WidgetConfigActivity;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 9
    .param p0, "$prefs"    # Lcom/example/fajr/data/FajrPreferences;
    .param p1, "this$0"    # Lcom/example/widget/WidgetConfigActivity;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    const-string v0, "C52@2300L368,52@2255L413:WidgetConfigActivity.kt#9u2u6t"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.widget.WidgetConfigActivity.onCreate.<anonymous>.<anonymous> (WidgetConfigActivity.kt:52)"

    const v3, -0x35598073    # -5455814.5f

    invoke-static {v3, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 53
    :cond_1
    invoke-virtual {p0}, Lcom/example/fajr/data/FajrPreferences;->getWidgetBarColor()Ljava/lang/String;

    move-result-object v0

    const v1, -0x44fb2663

    const-string v3, "CC(remember):WidgetConfigActivity.kt#9igjgp"

    invoke-static {p2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    .local v1, "invalid\\1":Z
    move-object v3, p2

    .local v3, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 139
    .local v4, "$i$f$cache\\1\\53":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 140
    .local v6, "$i$a$-let-ComposerKt$cache$1\\2\\139\\1":I
    if-nez v1, :cond_3

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_2

    goto :goto_1

    .line 144
    :cond_2
    goto :goto_2

    .line 141
    :cond_3
    :goto_1
    const/4 v7, 0x0

    .line 53
    .local v7, "$i$a$-cache-WidgetConfigActivity$onCreate$1$1$1\\3\\141\\0":I
    new-instance v8, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda1;

    invoke-direct {v8, p0, p1}, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda1;-><init>(Lcom/example/fajr/data/FajrPreferences;Lcom/example/widget/WidgetConfigActivity;)V

    .line 141
    .end local v7    # "$i$a$-cache-WidgetConfigActivity$onCreate$1$1$1\\3\\141\\0":I
    nop

    .line 142
    .local v8, "value\\2":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 143
    move-object v5, v8

    .line 139
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\2\\139\\1":I
    .end local v8    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 53
    .end local v1    # "invalid\\1":Z
    .end local v3    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\53":I
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v0, v5, p2, v2}, Lcom/example/widget/WidgetConfigActivityKt;->access$ConfigScreen(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_3

    .line 52
    :cond_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 62
    :cond_5
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final onCreate$lambda$3$lambda$2$lambda$1$lambda$0(Lcom/example/fajr/data/FajrPreferences;Lcom/example/widget/WidgetConfigActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3
    .param p0, "$prefs"    # Lcom/example/fajr/data/FajrPreferences;
    .param p1, "this$0"    # Lcom/example/widget/WidgetConfigActivity;
    .param p2, "choice"    # Ljava/lang/String;

    const-string v0, "choice"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0, p2}, Lcom/example/fajr/data/FajrPreferences;->setWidgetBarColor(Ljava/lang/String;)V

    .line 55
    sget-object v0, Lcom/example/widget/WidgetUpdater;->INSTANCE:Lcom/example/widget/WidgetUpdater;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/example/widget/WidgetUpdater;->updateAll(Landroid/content/Context;)V

    .line 56
    nop

    .line 57
    nop

    .line 58
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "appWidgetId"

    iget v2, p1, Lcom/example/widget/WidgetConfigActivity;->appWidgetId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    .line 56
    const/4 v1, -0x1

    invoke-virtual {p1, v1, v0}, Lcom/example/widget/WidgetConfigActivity;->setResult(ILandroid/content/Intent;)V

    .line 60
    invoke-virtual {p1}, Lcom/example/widget/WidgetConfigActivity;->finish()V

    .line 61
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 44
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/example/widget/WidgetConfigActivity;->setResult(I)V

    .line 46
    invoke-virtual {p0}, Lcom/example/widget/WidgetConfigActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 47
    nop

    .line 48
    nop

    .line 46
    const-string v2, "appWidgetId"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    .line 49
    :cond_0
    nop

    .line 46
    :goto_0
    iput v0, p0, Lcom/example/widget/WidgetConfigActivity;->appWidgetId:I

    .line 50
    new-instance v0, Lcom/example/fajr/data/FajrPreferences;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    .line 51
    .local v0, "prefs":Lcom/example/fajr/data/FajrPreferences;
    move-object v1, p0

    check-cast v1, Landroidx/activity/ComponentActivity;

    new-instance v2, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda2;

    invoke-direct {v2, v0, p0}, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda2;-><init>(Lcom/example/fajr/data/FajrPreferences;Lcom/example/widget/WidgetConfigActivity;)V

    const v3, -0x774e0533

    const/4 v4, 0x1

    invoke-static {v3, v4, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v4, v3}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 64
    return-void
.end method
