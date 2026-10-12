.class public final Lcom/example/fajr/ui/FajrAlarmActivity;
.super Landroidx/activity/ComponentActivity;
.source "FajrAlarmActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFajrAlarmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FajrAlarmActivity.kt\ncom/example/fajr/ui/FajrAlarmActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,356:1\n1#2:357\n1282#3,6:358\n1282#3,6:364\n*S KotlinDebug\n*F\n+ 1 FajrAlarmActivity.kt\ncom/example/fajr/ui/FajrAlarmActivity\n*L\n76#1:358,6\n77#1:364,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0008\u0010\u0013\u001a\u00020\rH\u0002J\u0008\u0010\u0014\u001a\u00020\rH\u0002J\u0008\u0010\u0015\u001a\u00020\rH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/example/fajr/ui/FajrAlarmActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "mediaPlayer",
        "Landroid/media/MediaPlayer;",
        "vibrator",
        "Landroid/os/Vibrator;",
        "handler",
        "Landroid/os/Handler;",
        "autoStopRunnable",
        "Ljava/lang/Runnable;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "startAlarmEffects",
        "prefs",
        "Lcom/example/fajr/data/FajrPreferences;",
        "handleAutoStop",
        "stopAndFinish",
        "onDestroy",
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
.field private autoStopRunnable:Ljava/lang/Runnable;

.field private final handler:Landroid/os/Handler;

.field private mediaPlayer:Landroid/media/MediaPlayer;

.field private vibrator:Landroid/os/Vibrator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/fajr/ui/FajrAlarmActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 43
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 47
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->handler:Landroid/os/Handler;

    .line 43
    return-void
.end method

.method private final handleAutoStop()V
    .locals 3

    .line 143
    new-instance v0, Lcom/example/fajr/data/FajrPreferences;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    .line 144
    .local v0, "prefs":Lcom/example/fajr/data/FajrPreferences;
    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getSnoozeCount()I

    move-result v1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_0

    .line 145
    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getSnoozeCount()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/example/fajr/data/FajrPreferences;->setSnoozeCount(I)V

    .line 146
    new-instance v1, Lcom/example/fajr/alarm/FajrAlarmScheduler;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/example/fajr/alarm/FajrAlarmScheduler;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getMaxDurationMinutes()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleSnooze(I)V

    .line 148
    :cond_0
    invoke-direct {p0}, Lcom/example/fajr/ui/FajrAlarmActivity;->stopAndFinish()V

    .line 149
    return-void
.end method

.method static final onCreate$lambda$6(Lcom/example/fajr/ui/FajrAlarmActivity;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8
    .param p0, "this$0"    # Lcom/example/fajr/ui/FajrAlarmActivity;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C72@2737L597,72@2718L616:FajrAlarmActivity.kt#jcb7bm"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.fajr.ui.FajrAlarmActivity.onCreate.<anonymous> (FajrAlarmActivity.kt:72)"

    const v3, -0x2e0dcaa6

    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 73
    :cond_1
    new-instance v0, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0}, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda5;-><init>(Lcom/example/fajr/ui/FajrAlarmActivity;)V

    const/16 v1, 0x36

    const v3, -0x645156fb

    invoke-static {v3, v2, v0, p1, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/16 v6, 0xc00

    const/4 v7, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, p1

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/ThemeKt;->MyApplicationTheme(Lcom/example/ui/theme/FontChoice;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 72
    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_2
    move-object v5, p1

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v5    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 86
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method static final onCreate$lambda$6$lambda$5(Lcom/example/fajr/ui/FajrAlarmActivity;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 5
    .param p0, "this$0"    # Lcom/example/fajr/ui/FajrAlarmActivity;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C73@2885L435,73@2755L565:FajrAlarmActivity.kt#jcb7bm"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.fajr.ui.FajrAlarmActivity.onCreate.<anonymous>.<anonymous> (FajrAlarmActivity.kt:73)"

    const v3, -0x645156fb

    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 74
    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v0

    new-instance v1, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda0;-><init>(Lcom/example/fajr/ui/FajrAlarmActivity;)V

    const/16 v3, 0x36

    const v4, 0x56ab0c45

    invoke-static {v4, v2, v1, p1, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    sget v2, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p1, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 73
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 85
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final onCreate$lambda$6$lambda$5$lambda$4(Lcom/example/fajr/ui/FajrAlarmActivity;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 9
    .param p0, "this$0"    # Lcom/example/fajr/ui/FajrAlarmActivity;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C75@2960L19,76@3016L264,74@2907L395:FajrAlarmActivity.kt#jcb7bm"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.fajr.ui.FajrAlarmActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FajrAlarmActivity.kt:74)"

    const v3, 0x56ab0c45

    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 76
    :cond_1
    const v0, 0x58191878

    const-string v1, "CC(remember):FajrAlarmActivity.kt#9igjgp"

    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v3, p1

    .local v3, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 358
    .local v4, "$i$f$cache\\1\\76":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 359
    .local v6, "$i$a$-let-ComposerKt$cache$1\\2\\358\\1":I
    if-nez v0, :cond_3

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_2

    goto :goto_1

    .line 363
    :cond_2
    goto :goto_2

    .line 360
    :cond_3
    :goto_1
    const/4 v7, 0x0

    .line 76
    .local v7, "$i$a$-cache-FajrAlarmActivity$onCreate$1$1$1$1\\3\\360\\0":I
    new-instance v8, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda1;

    invoke-direct {v8, p0}, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda1;-><init>(Lcom/example/fajr/ui/FajrAlarmActivity;)V

    .line 360
    .end local v7    # "$i$a$-cache-FajrAlarmActivity$onCreate$1$1$1$1\\3\\360\\0":I
    nop

    .line 361
    .local v8, "value\\2":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 362
    move-object v5, v8

    .line 358
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\2\\358\\1":I
    .end local v8    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 76
    .end local v0    # "invalid\\1":Z
    .end local v3    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\76":I
    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 77
    const v0, 0x5819206d

    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\4":Z
    move-object v1, p1

    .local v1, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 364
    .local v3, "$i$f$cache\\4\\77":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\4":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 365
    .local v6, "$i$a$-let-ComposerKt$cache$1\\5\\364\\4":I
    if-nez v0, :cond_5

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v4, v7, :cond_4

    goto :goto_3

    .line 369
    :cond_4
    goto :goto_4

    .line 366
    :cond_5
    :goto_3
    const/4 v7, 0x0

    .line 77
    .local v7, "$i$a$-cache-FajrAlarmActivity$onCreate$1$1$1$2\\6\\366\\0":I
    new-instance v8, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda2;

    invoke-direct {v8, p0}, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda2;-><init>(Lcom/example/fajr/ui/FajrAlarmActivity;)V

    .line 366
    .end local v7    # "$i$a$-cache-FajrAlarmActivity$onCreate$1$1$1$2\\6\\366\\0":I
    nop

    .line 367
    .local v8, "value\\5":Ljava/lang/Object;
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 368
    move-object v4, v8

    .line 364
    .end local v4    # "it\\4":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\5\\364\\4":I
    .end local v8    # "value\\5":Ljava/lang/Object;
    :goto_4
    nop

    .line 77
    .end local v0    # "invalid\\4":Z
    .end local v1    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\4\\77":I
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 75
    invoke-static {v5, v4, p1, v2}, Lcom/example/fajr/ui/FajrAlarmActivityKt;->FajrAlarmScreen(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_5

    .line 74
    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 84
    :cond_7
    :goto_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final onCreate$lambda$6$lambda$5$lambda$4$lambda$1$lambda$0(Lcom/example/fajr/ui/FajrAlarmActivity;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/example/fajr/ui/FajrAlarmActivity;

    .line 76
    invoke-direct {p0}, Lcom/example/fajr/ui/FajrAlarmActivity;->stopAndFinish()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final onCreate$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(Lcom/example/fajr/ui/FajrAlarmActivity;I)Lkotlin/Unit;
    .locals 3
    .param p0, "this$0"    # Lcom/example/fajr/ui/FajrAlarmActivity;
    .param p1, "minutes"    # I

    .line 78
    new-instance v0, Lcom/example/fajr/data/FajrPreferences;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    .line 79
    .local v0, "p":Lcom/example/fajr/data/FajrPreferences;
    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getSnoozeCount()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/example/fajr/data/FajrPreferences;->setSnoozeCount(I)V

    .line 80
    new-instance v1, Lcom/example/fajr/alarm/FajrAlarmScheduler;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/example/fajr/alarm/FajrAlarmScheduler;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p1}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleSnooze(I)V

    .line 81
    invoke-direct {p0}, Lcom/example/fajr/ui/FajrAlarmActivity;->stopAndFinish()V

    .line 82
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private final startAlarmEffects(Lcom/example/fajr/data/FajrPreferences;)V
    .locals 8
    .param p1, "prefs"    # Lcom/example/fajr/data/FajrPreferences;

    .line 91
    nop

    .line 92
    :try_start_0
    new-instance v0, Lcom/example/fajr/sound/RingtoneHelper;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/example/fajr/sound/RingtoneHelper;-><init>(Landroid/content/Context;)V

    .line 93
    .local v0, "ringtoneHelper":Lcom/example/fajr/sound/RingtoneHelper;
    invoke-virtual {v0, p1}, Lcom/example/fajr/sound/RingtoneHelper;->getValidRingtoneUri(Lcom/example/fajr/data/FajrPreferences;)Landroid/net/Uri;

    move-result-object v1

    .line 94
    .local v1, "uri":Landroid/net/Uri;
    invoke-virtual {p1}, Lcom/example/fajr/data/FajrPreferences;->getAlarmVolume()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    .line 96
    .local v2, "volume":F
    new-instance v3, Landroid/media/MediaPlayer;

    invoke-direct {v3}, Landroid/media/MediaPlayer;-><init>()V

    move-object v4, v3

    .local v4, "$this$startAlarmEffects_u24lambda_u247\\1":Landroid/media/MediaPlayer;
    const/4 v5, 0x0

    .line 97
    .local v5, "$i$a$-apply-FajrAlarmActivity$startAlarmEffects$1\\1\\96\\0":I
    nop

    .line 98
    new-instance v6, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v6}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 99
    const/4 v7, 0x4

    invoke-virtual {v6, v7}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v6

    .line 100
    const/4 v7, 0x2

    invoke-virtual {v6, v7}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v6

    .line 101
    invoke-virtual {v6}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v6

    .line 97
    invoke-virtual {v4, v6}, Landroid/media/MediaPlayer;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    .line 103
    move-object v6, p0

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v4, v6, v1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 104
    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 105
    invoke-virtual {v4, v2, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 106
    invoke-virtual {v4}, Landroid/media/MediaPlayer;->prepare()V

    .line 107
    invoke-virtual {v4}, Landroid/media/MediaPlayer;->start()V

    .line 108
    nop

    .line 96
    .end local v4    # "$this$startAlarmEffects_u24lambda_u247\\1":Landroid/media/MediaPlayer;
    .end local v5    # "$i$a$-apply-FajrAlarmActivity$startAlarmEffects$1\\1\\96\\0":I
    iput-object v3, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .end local v0    # "ringtoneHelper":Lcom/example/fajr/sound/RingtoneHelper;
    .end local v1    # "uri":Landroid/net/Uri;
    .end local v2    # "volume":F
    goto :goto_0

    .line 109
    :catch_0
    move-exception v0

    .line 110
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 114
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    invoke-virtual {p1}, Lcom/example/fajr/data/FajrPreferences;->isVibrationEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 115
    nop

    .line 116
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 117
    const-string v0, "vibrator_manager"

    invoke-virtual {p0, v0}, Lcom/example/fajr/ui/FajrAlarmActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.os.VibratorManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/os/VibratorManager;

    .line 118
    .local v0, "vibratorManager":Landroid/os/VibratorManager;
    invoke-virtual {v0}, Landroid/os/VibratorManager;->getDefaultVibrator()Landroid/os/Vibrator;

    move-result-object v1

    iput-object v1, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->vibrator:Landroid/os/Vibrator;

    .end local v0    # "vibratorManager":Landroid/os/VibratorManager;
    goto :goto_1

    .line 121
    :cond_0
    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Lcom/example/fajr/ui/FajrAlarmActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.os.Vibrator"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->vibrator:Landroid/os/Vibrator;

    .line 124
    :goto_1
    const/4 v0, 0x5

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    .line 125
    .local v0, "pattern":[J
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 129
    iget-object v2, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->vibrator:Landroid/os/Vibrator;

    .line 125
    const/4 v3, 0x0

    const/16 v4, 0x1a

    if-lt v1, v4, :cond_1

    .line 126
    if-eqz v2, :cond_2

    :try_start_2
    invoke-static {v0, v3}, Landroid/os/VibrationEffect;->createWaveform([JI)Landroid/os/VibrationEffect;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    goto :goto_2

    .line 129
    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2, v0, v3}, Landroid/os/Vibrator;->vibrate([JI)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 131
    .end local v0    # "pattern":[J
    :catch_1
    move-exception v0

    .line 132
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 137
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_2
    :goto_2
    const-wide/32 v0, 0xea60

    .line 138
    .local v0, "maxDurationMs":J
    new-instance v2, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda4;

    invoke-direct {v2, p0}, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda4;-><init>(Lcom/example/fajr/ui/FajrAlarmActivity;)V

    iput-object v2, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->autoStopRunnable:Ljava/lang/Runnable;

    .line 139
    iget-object v2, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->handler:Landroid/os/Handler;

    iget-object v3, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->autoStopRunnable:Ljava/lang/Runnable;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 140
    return-void

    :array_0
    .array-data 8
        0x0
        0x320
        0x1f4
        0x320
        0x1f4
    .end array-data
.end method

.method static final startAlarmEffects$lambda$8(Lcom/example/fajr/ui/FajrAlarmActivity;)V
    .locals 0
    .param p0, "this$0"    # Lcom/example/fajr/ui/FajrAlarmActivity;

    .line 138
    invoke-direct {p0}, Lcom/example/fajr/ui/FajrAlarmActivity;->handleAutoStop()V

    return-void
.end method

.method private final stopAndFinish()V
    .locals 4

    .line 151
    iget-object v0, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->autoStopRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 357
    .local v0, "it\\1":Ljava/lang/Runnable;
    const/4 v1, 0x0

    .line 151
    .local v1, "$i$a$-let-FajrAlarmActivity$stopAndFinish$1\\1\\151\\0":I
    iget-object v2, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 152
    .end local v0    # "it\\1":Ljava/lang/Runnable;
    .end local v1    # "$i$a$-let-FajrAlarmActivity$stopAndFinish$1\\1\\151\\0":I
    :cond_0
    nop

    .line 153
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_2

    .local v1, "it\\2":Landroid/media/MediaPlayer;
    const/4 v2, 0x0

    .line 154
    .local v2, "$i$a$-let-FajrAlarmActivity$stopAndFinish$2\\2\\153\\0":I
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 155
    :cond_1
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    .line 156
    nop

    .line 153
    .end local v1    # "it\\2":Landroid/media/MediaPlayer;
    .end local v2    # "$i$a$-let-FajrAlarmActivity$stopAndFinish$2\\2\\153\\0":I
    :cond_2
    nop

    .line 157
    iput-object v0, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 158
    :catch_0
    move-exception v1

    .line 159
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 162
    .end local v1    # "e":Ljava/lang/Exception;
    :goto_0
    nop

    .line 163
    :try_start_1
    iget-object v1, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->vibrator:Landroid/os/Vibrator;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/os/Vibrator;->cancel()V

    .line 164
    :cond_3
    iput-object v0, p0, Lcom/example/fajr/ui/FajrAlarmActivity;->vibrator:Landroid/os/Vibrator;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 165
    :catch_1
    move-exception v0

    .line 166
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 169
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_1
    invoke-virtual {p0}, Lcom/example/fajr/ui/FajrAlarmActivity;->finish()V

    .line 170
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 51
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v0, v1, :cond_0

    .line 55
    invoke-virtual {p0, v3}, Lcom/example/fajr/ui/FajrAlarmActivity;->setShowWhenLocked(Z)V

    .line 56
    invoke-virtual {p0, v3}, Lcom/example/fajr/ui/FajrAlarmActivity;->setTurnScreenOn(Z)V

    .line 57
    const-string v0, "keyguard"

    invoke-virtual {p0, v0}, Lcom/example/fajr/ui/FajrAlarmActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.KeyguardManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/KeyguardManager;

    .line 58
    .local v0, "keyguardManager":Landroid/app/KeyguardManager;
    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1, v2}, Landroid/app/KeyguardManager;->requestDismissKeyguard(Landroid/app/Activity;Landroid/app/KeyguardManager$KeyguardDismissCallback;)V

    .end local v0    # "keyguardManager":Landroid/app/KeyguardManager;
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p0}, Lcom/example/fajr/ui/FajrAlarmActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 62
    nop

    .line 61
    const v1, 0x680080

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 69
    :goto_0
    new-instance v0, Lcom/example/fajr/data/FajrPreferences;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    .line 70
    .local v0, "prefs":Lcom/example/fajr/data/FajrPreferences;
    invoke-direct {p0, v0}, Lcom/example/fajr/ui/FajrAlarmActivity;->startAlarmEffects(Lcom/example/fajr/data/FajrPreferences;)V

    .line 72
    move-object v1, p0

    check-cast v1, Landroidx/activity/ComponentActivity;

    new-instance v4, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda3;

    invoke-direct {v4, p0}, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda3;-><init>(Lcom/example/fajr/ui/FajrAlarmActivity;)V

    const v5, -0x2e0dcaa6

    invoke-static {v5, v3, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-static {v1, v2, v4, v3, v2}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 87
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 173
    invoke-direct {p0}, Lcom/example/fajr/ui/FajrAlarmActivity;->stopAndFinish()V

    .line 174
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onDestroy()V

    .line 175
    return-void
.end method
