.class public final Lcom/example/MainActivity;
.super Landroidx/activity/ComponentActivity;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/example/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,67:1\n70#2,11:68\n85#3:79\n1282#4,6:80\n1282#4,6:86\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/example/MainActivity\n*L\n23#1:68,11\n32#1:79\n37#1:80,6\n39#1:86,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/example/MainActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "mainViewModel",
        "Lcom/example/ui/viewmodel/MainViewModel;",
        "getMainViewModel",
        "()Lcom/example/ui/viewmodel/MainViewModel;",
        "mainViewModel$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "handleIntent",
        "app",
        "appFont",
        "Lcom/example/ui/theme/FontChoice;"
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
.field private final mainViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/MainActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 22
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 23
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 68
    .local v0, "$this$viewModels_u24default\\1":Landroidx/activity/ComponentActivity;
    nop

    .line 69
    const/4 v1, 0x0

    .line 68
    .local v1, "extrasProducer\\1":Lkotlin/jvm/functions/Function0;
    nop

    .line 70
    const/4 v2, 0x0

    .line 68
    .local v2, "factoryProducer\\1":Lkotlin/jvm/functions/Function0;
    const/4 v3, 0x0

    .line 72
    .local v3, "$i$f$viewModels\\1\\23":I
    new-instance v4, Lcom/example/MainActivity$special$$inlined$viewModels$default$1;

    invoke-direct {v4, v0}, Lcom/example/MainActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 74
    .local v4, "factoryPromise\\1":Lkotlin/jvm/functions/Function0;
    new-instance v5, Landroidx/lifecycle/ViewModelLazy;

    const-class v6, Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    .line 76
    new-instance v7, Lcom/example/MainActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v7, v0}, Lcom/example/MainActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 77
    nop

    .line 78
    new-instance v8, Lcom/example/MainActivity$special$$inlined$viewModels$default$3;

    invoke-direct {v8, v1, v0}, Lcom/example/MainActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 74
    invoke-direct {v5, v6, v7, v4, v8}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v5, Lkotlin/Lazy;

    .line 23
    .end local v0    # "$this$viewModels_u24default\\1":Landroidx/activity/ComponentActivity;
    .end local v1    # "extrasProducer\\1":Lkotlin/jvm/functions/Function0;
    .end local v2    # "factoryProducer\\1":Lkotlin/jvm/functions/Function0;
    .end local v3    # "$i$f$viewModels\\1\\23":I
    .end local v4    # "factoryPromise\\1":Lkotlin/jvm/functions/Function0;
    iput-object v5, p0, Lcom/example/MainActivity;->mainViewModel$delegate:Lkotlin/Lazy;

    .line 22
    return-void
.end method

.method private final getMainViewModel()Lcom/example/ui/viewmodel/MainViewModel;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/example/MainActivity;->mainViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/ui/viewmodel/MainViewModel;

    return-object v0
.end method

.method private final handleIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    invoke-static {p1}, Lcom/example/lockwidgets/HomeWidgets;->handleIntent(Landroid/content/Intent;)Z

    .line 61
    const/4 v0, -0x1

    if-eqz p1, :cond_0

    const-string v1, "DHIKR_ID"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 62
    .local v1, "dhikrId":I
    :goto_0
    if-eq v1, v0, :cond_1

    .line 63
    invoke-direct {p0}, Lcom/example/MainActivity;->getMainViewModel()Lcom/example/ui/viewmodel/MainViewModel;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/example/ui/viewmodel/MainViewModel;->onDhikrSelectedFromNotification(I)V

    .line 65
    :cond_1
    return-void
.end method

.method static final onCreate$lambda$5(Lcom/example/MainActivity;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 14
    .param p0, "this$0"    # Lcom/example/MainActivity;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move/from16 v7, p2

    const-string v0, "C31@1143L16,36@1377L25,34@1268L134,38@1449L327,38@1428L348,48@1831L69,48@1790L110:MainActivity.kt#to5c3"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v7, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, v7, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.MainActivity.onCreate.<anonymous> (MainActivity.kt:31)"

    const v5, -0x23d4bb05

    invoke-static {v5, v7, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 32
    :cond_1
    invoke-direct {p0}, Lcom/example/MainActivity;->getMainViewModel()Lcom/example/ui/viewmodel/MainViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/example/ui/viewmodel/MainViewModel;->getAppFont()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, v2, v3}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 36
    .local v8, "appFont$delegate":Landroidx/compose/runtime/State;
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 37
    const v2, 0x7e6e15f4

    const-string v5, "CC(remember):MainActivity.kt#9igjgp"

    invoke-static {p1, v2, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\1":Z
    move-object v6, p1

    .local v6, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 80
    .local v9, "$i$f$cache\\1\\37":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .local v10, "it\\1":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 81
    .local v11, "$i$a$-let-ComposerKt$cache$1\\2\\80\\1":I
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v10, v12, :cond_2

    .line 82
    const/4 v12, 0x0

    .local v12, "$i$a$-cache-MainActivity$onCreate$1$launcher$1\\3\\82\\0":I
    new-instance v13, Lcom/example/MainActivity$$ExternalSyntheticLambda0;

    invoke-direct {v13}, Lcom/example/MainActivity$$ExternalSyntheticLambda0;-><init>()V

    .line 83
    .end local v12    # "$i$a$-cache-MainActivity$onCreate$1$launcher$1\\3\\82\\0":I
    .local v13, "value\\2":Ljava/lang/Object;
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 84
    move-object v10, v13

    .end local v13    # "value\\2":Ljava/lang/Object;
    goto :goto_1

    .line 85
    :cond_2
    nop

    .line 80
    .end local v10    # "it\\1":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\2\\80\\1":I
    :goto_1
    nop

    .line 37
    .end local v2    # "invalid\\1":Z
    .end local v6    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache\\1\\37":I
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 35
    const/16 v2, 0x30

    invoke-static {v0, v10, p1, v2}, Landroidx/activity/compose/ActivityResultRegistryKt;->rememberLauncherForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;

    move-result-object v9

    .line 39
    .local v9, "launcher":Landroidx/activity/compose/ManagedActivityResultLauncher;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v2, 0x7e6e2022

    invoke-static {p1, v2, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid\\4":Z
    move-object v5, p1

    .local v5, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 86
    .local v6, "$i$f$cache\\4\\39":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .local v10, "it\\4":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 87
    .local v11, "$i$a$-let-ComposerKt$cache$1\\5\\86\\4":I
    if-nez v2, :cond_4

    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v10, v12, :cond_3

    goto :goto_2

    .line 91
    :cond_3
    goto :goto_3

    .line 88
    :cond_4
    :goto_2
    const/4 v12, 0x0

    .line 39
    .local v12, "$i$a$-cache-MainActivity$onCreate$1$1\\6\\88\\0":I
    new-instance v13, Lcom/example/MainActivity$onCreate$1$1$1;

    invoke-direct {v13, v9, v1}, Lcom/example/MainActivity$onCreate$1$1$1;-><init>(Landroidx/activity/compose/ManagedActivityResultLauncher;Lkotlin/coroutines/Continuation;)V

    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 88
    .end local v12    # "$i$a$-cache-MainActivity$onCreate$1$1\\6\\88\\0":I
    nop

    .line 89
    .local v13, "value\\5":Ljava/lang/Object;
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 90
    move-object v10, v13

    .line 86
    .end local v10    # "it\\4":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\5\\86\\4":I
    .end local v13    # "value\\5":Ljava/lang/Object;
    :goto_3
    nop

    .line 39
    .end local v2    # "invalid\\4":Z
    .end local v5    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\4\\39":I
    check-cast v10, Lkotlin/jvm/functions/Function2;

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v1, 0x6

    invoke-static {v0, v10, p1, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 49
    invoke-static {v8}, Lcom/example/MainActivity;->onCreate$lambda$5$lambda$0(Landroidx/compose/runtime/State;)Lcom/example/ui/theme/FontChoice;

    move-result-object v0

    new-instance v1, Lcom/example/MainActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/example/MainActivity$$ExternalSyntheticLambda1;-><init>(Lcom/example/MainActivity;)V

    const/16 v2, 0x36

    const v5, 0x7e66dd66

    invoke-static {v5, v3, v1, p1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/16 v5, 0xc00

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lcom/example/ui/theme/ThemeKt;->MyApplicationTheme(Lcom/example/ui/theme/FontChoice;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v8    # "appFont$delegate":Landroidx/compose/runtime/State;
    .end local v9    # "launcher":Landroidx/activity/compose/ManagedActivityResultLauncher;
    goto :goto_4

    .line 31
    :cond_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 52
    :cond_6
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final onCreate$lambda$5$lambda$0(Landroidx/compose/runtime/State;)Lcom/example/ui/theme/FontChoice;
    .locals 4
    .param p0, "$appFont$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/example/ui/theme/FontChoice;",
            ">;)",
            "Lcom/example/ui/theme/FontChoice;"
        }
    .end annotation

    .line 32
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 79
    .local v3, "$i$f$getValue\\1\\32":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue\\1\\32":I
    check-cast v0, Lcom/example/ui/theme/FontChoice;

    .line 32
    return-object v0
.end method

.method static final onCreate$lambda$5$lambda$2$lambda$1(Z)Lkotlin/Unit;
    .locals 1
    .param p0, "isGranted"    # Z

    .line 37
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final onCreate$lambda$5$lambda$4(Lcom/example/MainActivity;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 4
    .param p0, "this$0"    # Lcom/example/MainActivity;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C49@1849L37:MainActivity.kt#to5c3"

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

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:49)"

    const v3, 0x7e66dd66

    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 50
    :cond_1
    invoke-direct {p0}, Lcom/example/MainActivity;->getMainViewModel()Lcom/example/ui/viewmodel/MainViewModel;

    move-result-object v0

    invoke-static {v0, p1, v2}, Lcom/example/ui/screens/MainScreenKt;->MainScreen(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 49
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 51
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 26
    invoke-virtual {p0}, Lcom/example/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/example/lockwidgets/HomeWidgets;->handleIntent(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    sget-object v0, Lcom/example/widget/WidgetUpdater;->INSTANCE:Lcom/example/widget/WidgetUpdater;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/example/widget/WidgetUpdater;->updateAll(Landroid/content/Context;)V

    .line 28
    invoke-virtual {p0}, Lcom/example/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/example/MainActivity;->handleIntent(Landroid/content/Intent;)V

    .line 30
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, v2}, Landroidx/activity/EdgeToEdge;->enable$default(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;ILjava/lang/Object;)V

    .line 31
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/example/MainActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/example/MainActivity$$ExternalSyntheticLambda2;-><init>(Lcom/example/MainActivity;)V

    const v3, -0x23d4bb05

    const/4 v4, 0x1

    invoke-static {v3, v4, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v2, v1, v4, v2}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 53
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 57
    invoke-direct {p0, p1}, Lcom/example/MainActivity;->handleIntent(Landroid/content/Intent;)V

    invoke-static {p1}, Lcom/example/lockwidgets/HomeWidgets;->handleIntent(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/example/MainActivity;->setIntent(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/example/MainActivity;->recreate()V

    .line 58
    :cond_0
    return-void
.end method
