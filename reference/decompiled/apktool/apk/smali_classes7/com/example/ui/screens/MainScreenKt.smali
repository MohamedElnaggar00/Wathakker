.class public final Lcom/example/ui/screens/MainScreenKt;
.super Ljava/lang/Object;
.source "MainScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/example/ui/screens/MainScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,181:1\n68#2:182\n57#2,10:183\n68#2:306\n57#2,10:307\n1282#3,6:193\n1282#3,6:199\n1282#3,6:205\n1282#3,3:218\n1285#3,3:222\n1282#3,6:234\n1282#3,6:240\n1282#3,6:246\n1282#3,6:252\n1282#3,6:258\n1282#3,6:264\n1282#3,6:270\n1282#3,6:276\n1282#3,6:282\n1282#3,6:288\n1282#3,6:294\n1282#3,6:300\n1282#3,6:317\n1282#3,6:323\n1282#3,6:365\n1282#3,6:371\n1282#3,6:377\n1282#3,6:383\n1282#3,6:389\n1282#3,6:395\n1282#3,6:401\n1282#3,6:407\n1282#3,6:417\n1282#3,6:423\n1282#3,6:429\n1282#3,6:435\n1282#3,6:441\n607#4:211\n604#4,6:212\n605#5:221\n85#6:225\n85#6:226\n85#6:227\n117#6,2:228\n85#6:230\n117#6,2:231\n85#6:233\n71#7:329\n68#7,6:330\n74#7:364\n78#7:416\n79#8,6:336\n86#8,4:351\n90#8,2:361\n94#8:415\n368#9,9:342\n377#9:363\n378#9,2:413\n4034#10,6:355\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/example/ui/screens/MainScreenKt\n*L\n75#1:182\n75#1:183,10\n126#1:306\n126#1:307,10\n76#1:193,6\n77#1:199,6\n78#1:205,6\n79#1:218,3\n79#1:222,3\n102#1:234,6\n103#1:240,6\n104#1:246,6\n105#1:252,6\n106#1:258,6\n114#1:264,6\n115#1:270,6\n118#1:276,6\n119#1:282,6\n120#1:288,6\n121#1:294,6\n123#1:300,6\n127#1:317,6\n129#1:323,6\n94#1:365,6\n95#1:371,6\n96#1:377,6\n97#1:383,6\n98#1:389,6\n135#1:395,6\n146#1:401,6\n150#1:407,6\n164#1:417,6\n165#1:423,6\n169#1:429,6\n175#1:435,6\n176#1:441,6\n79#1:211\n79#1:212,6\n79#1:221\n73#1:225\n74#1:226\n76#1:227\n76#1:228,2\n77#1:230\n77#1:231,2\n81#1:233\n87#1:329\n87#1:330,6\n87#1:364\n87#1:416\n87#1:336,6\n87#1:351,4\n87#1:361,2\n87#1:415\n87#1:342,9\n87#1:363\n87#1:413,2\n87#1:355,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u001a\u0015\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\u000c\"\u0017\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\r\u00b2\u0006\u000c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002\u00b2\u0006\u0010\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0001X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002"
    }
    d2 = {
        "oneUITabs",
        "",
        "Lcom/example/ui/oneui/BottomTab;",
        "getOneUITabs",
        "()Ljava/util/List;",
        "oneUIDrawerItems",
        "Lcom/example/ui/oneui/OneUIDrawerItem;",
        "getOneUIDrawerItems",
        "MainScreen",
        "",
        "viewModel",
        "Lcom/example/ui/viewmodel/MainViewModel;",
        "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;I)V",
        "app",
        "selectedDhikrNotif",
        "Lcom/example/data/Dhikr;",
        "allTags",
        "Lcom/example/data/Tag;",
        "showAddDialog",
        "",
        "drawerOpen",
        "backEntry",
        "Landroidx/navigation/NavBackStackEntry;"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final oneUIDrawerItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/ui/oneui/OneUIDrawerItem;",
            ">;"
        }
    .end annotation
.end field

.field private static final oneUITabs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/ui/oneui/BottomTab;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 51
    nop

    .line 52
    const/4 v0, 0x5

    new-array v1, v0, [Lcom/example/ui/oneui/BottomTab;

    .line 53
    new-instance v2, Lcom/example/ui/oneui/BottomTab;

    sget-object v4, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;

    invoke-virtual {v4}, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->getLambda$467767065$app()Lkotlin/jvm/functions/Function3;

    move-result-object v4

    const-string v5, "prayer"

    const-string v6, "\u0627\u0644\u0635\u0644\u0627\u0629"

    invoke-direct {v2, v5, v6, v4}, Lcom/example/ui/oneui/BottomTab;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    const/4 v4, 0x0

    aput-object v2, v1, v4

    .line 52
    nop

    .line 54
    new-instance v2, Lcom/example/ui/oneui/BottomTab;

    sget-object v5, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;

    invoke-virtual {v5}, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->getLambda$1635963320$app()Lkotlin/jvm/functions/Function3;

    move-result-object v5

    const-string v6, "azkar"

    const-string v7, "\u0627\u0644\u0623\u0630\u0643\u0627\u0631"

    invoke-direct {v2, v6, v7, v5}, Lcom/example/ui/oneui/BottomTab;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    const/4 v5, 0x1

    aput-object v2, v1, v5

    .line 52
    nop

    .line 55
    new-instance v2, Lcom/example/ui/oneui/BottomTab;

    sget-object v6, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;

    invoke-virtual {v6}, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->getLambda$-1490807721$app()Lkotlin/jvm/functions/Function3;

    move-result-object v6

    const-string v7, "hisn"

    const-string v8, "\u062d\u0635\u0646 \u0627\u0644\u0645\u0633\u0644\u0645"

    invoke-direct {v2, v7, v8, v6}, Lcom/example/ui/oneui/BottomTab;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    const/4 v6, 0x2

    aput-object v2, v1, v6

    .line 52
    nop

    new-instance v2, Lcom/example/ui/oneui/BottomTab;

    sget-object v7, Lcom/example/ui/screens/FajrTabIcon;->INSTANCE:Lcom/example/ui/screens/FajrTabIcon;

    const-string v8, "fajr_settings"

    const-string v9, "\u0627\u0644\u0641\u062c\u0631"

    invoke-direct {v2, v8, v9, v7}, Lcom/example/ui/oneui/BottomTab;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    const/4 v7, 0x3

    aput-object v2, v1, v7

    .line 56
    new-instance v2, Lcom/example/ui/oneui/BottomTab;

    sget-object v7, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;

    invoke-virtual {v7}, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->getLambda$-322611466$app()Lkotlin/jvm/functions/Function3;

    move-result-object v7

    const-string v8, "tasbeeh"

    const-string v9, "\u0627\u0644\u0633\u0628\u062d\u0629"

    invoke-direct {v2, v8, v9, v7}, Lcom/example/ui/oneui/BottomTab;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    const/4 v7, 0x4

    aput-object v2, v1, v7

    .line 52
    nop

    .line 51
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/example/ui/screens/MainScreenKt;->oneUITabs:Ljava/util/List;

    .line 59
    nop

    .line 60
    const/4 v1, 0x6

    new-array v1, v1, [Lcom/example/ui/oneui/OneUIDrawerItem;

    new-instance v8, Lcom/example/ui/oneui/OneUIDrawerItem;

    sget-object v2, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v2}, Landroidx/compose/material/icons/outlined/StarKt;->getStar(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v11

    const-wide v9, 0xffe5b455L

    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v12

    const/4 v14, 0x0

    const-string v9, "favorites"

    const-string v10, "\u0627\u0644\u0645\u0641\u0636\u0644\u0629"

    invoke-direct/range {v8 .. v14}, Lcom/example/ui/oneui/OneUIDrawerItem;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    aput-object v8, v1, v3

    .line 61
    new-instance v9, Lcom/example/ui/oneui/OneUIDrawerItem;

    sget-object v2, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v2}, Landroidx/compose/material/icons/outlined/NotificationsKt;->getNotifications(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v12

    const-wide v2, 0xffe5b455L

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v13

    const/4 v15, 0x0

    const-string v10, "reminders"

    const-string v11, "\u0627\u0644\u062a\u0646\u0628\u064a\u0647\u0627\u062a"

    invoke-direct/range {v9 .. v15}, Lcom/example/ui/oneui/OneUIDrawerItem;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x1

    aput-object v9, v1, v4

    .line 60
    nop

    .line 62
    new-instance v10, Lcom/example/ui/oneui/OneUIDrawerItem;

    sget-object v2, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v2}, Landroidx/compose/material/icons/outlined/BarChartKt;->getBarChart(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v13

    const-wide v2, 0xff4dd0c4L

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v14

    const/16 v16, 0x0

    const-string v11, "statistics"

    const-string v12, "\u0627\u0644\u0625\u062d\u0635\u0627\u0626\u064a\u0627\u062a"

    invoke-direct/range {v10 .. v16}, Lcom/example/ui/oneui/OneUIDrawerItem;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x2

    aput-object v10, v1, v5

    .line 60
    nop

    .line 63
    new-instance v11, Lcom/example/ui/oneui/OneUIDrawerItem;

    sget-object v2, Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;

    invoke-static {v2}, Landroidx/compose/material/icons/automirrored/outlined/LabelKt;->getLabel(Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v14

    const-wide v2, 0xffbd9feaL

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v15

    const/16 v17, 0x0

    const-string v12, "tags"

    const-string v13, "\u0627\u0644\u062a\u0635\u0646\u064a\u0641\u0627\u062a"

    invoke-direct/range {v11 .. v17}, Lcom/example/ui/oneui/OneUIDrawerItem;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x3

    aput-object v11, v1, v6

    .line 60
    nop

    .line 65
    new-instance v13, Lcom/example/ui/oneui/OneUIDrawerItem;

    sget-object v2, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v2}, Landroidx/compose/material/icons/outlined/SettingsKt;->getSettings(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v16

    const-wide v2, 0xff90a4aeL

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v17

    const/16 v19, 0x0

    const-string v14, "settings"

    const-string v15, "\u0627\u0644\u0625\u0639\u062f\u0627\u062f\u0627\u062a"

    invoke-direct/range {v13 .. v19}, Lcom/example/ui/oneui/OneUIDrawerItem;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x4

    aput-object v13, v1, v0

    .line 60
    nop

    .line 66
    new-instance v2, Lcom/example/ui/oneui/OneUIDrawerItem;

    sget-object v0, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v0}, Landroidx/compose/material/icons/outlined/InfoKt;->getInfo(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v5

    const-wide v3, 0xff8e8e93L

    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v6

    const/4 v8, 0x0

    const-string v3, "about"

    const-string v4, "\u062d\u0648\u0644 \u0627\u0644\u062a\u0637\u0628\u064a\u0642"

    invoke-direct/range {v2 .. v8}, Lcom/example/ui/oneui/OneUIDrawerItem;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x6

    const/4 v0, 0x5

    aput-object v2, v1, v0

    .line 60
    nop

    .line 59
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/example/ui/screens/MainScreenKt;->oneUIDrawerItems:Ljava/util/List;

    return-void
.end method

.method static final FajrTabScreen(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "CN(it)125@7454L11,126@7529L32,126@7486L76:MainScreen.kt#2thlc2"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v5, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:125)"

    const v6, -0x5eb37ca1

    move/from16 v7, p2

    invoke-static {v6, v7, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v7, p2

    .line 126
    :goto_0
    const/4 v2, 0x0

    move v5, v2

    .local v5, "$changed\\1":I
    move-object/from16 v13, p1

    .local v13, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 306
    .local v6, "$i$f$viewModel\\1\\126":I
    const v8, 0x671a9c9b

    const-string v9, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67"

    invoke-static {v13, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 307
    sget-object v8, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    const/4 v9, 0x6

    invoke-virtual {v8, v13, v9}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 310
    .local v9, "viewModelStoreOwner\\1":Landroidx/lifecycle/ViewModelStoreOwner;
    const/4 v10, 0x0

    .line 311
    .local v10, "key\\1":Ljava/lang/String;
    const/4 v11, 0x0

    .line 313
    .local v11, "factory\\1":Landroidx/lifecycle/ViewModelProvider$Factory;
    instance-of v8, v9, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    if-eqz v8, :cond_1

    .line 314
    move-object v8, v9

    check-cast v8, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    invoke-interface {v8}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v8

    move-object v12, v8

    goto :goto_1

    .line 316
    :cond_1
    sget-object v8, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    check-cast v8, Landroidx/lifecycle/viewmodel/CreationExtras;

    move-object v12, v8

    :goto_1
    nop

    .local v12, "extras\\1":Landroidx/lifecycle/viewmodel/CreationExtras;
    const-class v8, Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    .line 306
    shl-int/lit8 v14, v5, 0x3

    and-int/lit8 v14, v14, 0x70

    shl-int/lit8 v15, v5, 0x3

    and-int/lit16 v15, v15, 0x380

    or-int/2addr v14, v15

    shl-int/lit8 v15, v5, 0x3

    and-int/lit16 v15, v15, 0x1c00

    or-int/2addr v14, v15

    const v15, 0xe000

    shl-int/lit8 v16, v5, 0x3

    and-int v15, v16, v15

    or-int/2addr v14, v15

    const/4 v15, 0x0

    invoke-static/range {v8 .. v15}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Lkotlin/reflect/KClass;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    move-result-object v8

    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 126
    .end local v5    # "$changed\\1":I
    .end local v6    # "$i$f$viewModel\\1\\126":I
    .end local v9    # "viewModelStoreOwner\\1":Landroidx/lifecycle/ViewModelStoreOwner;
    .end local v10    # "key\\1":Ljava/lang/String;
    .end local v11    # "factory\\1":Landroidx/lifecycle/ViewModelProvider$Factory;
    .end local v12    # "extras\\1":Landroidx/lifecycle/viewmodel/CreationExtras;
    .end local v13    # "$composer\\1":Landroidx/compose/runtime/Composer;
    move-object v5, v8

    check-cast v5, Lcom/example/fajr/ui/FajrViewModel;

    .line 127
    .local v5, "fajrViewModel":Lcom/example/fajr/ui/FajrViewModel;
    const v6, -0x7fc6c7c1

    const-string v8, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {v1, v6, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .local v6, "invalid\\3":Z
    move-object/from16 v8, p1

    .local v8, "$this$cache\\3":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 317
    .local v9, "$i$f$cache\\3\\127":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .local v10, "it\\3":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 318
    .local v11, "$i$a$-let-ComposerKt$cache$1\\4\\317\\3":I
    if-nez v6, :cond_3

    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v10, v12, :cond_2

    goto :goto_2

    .line 322
    :cond_2
    goto :goto_3

    .line 319
    :cond_3
    :goto_2
    const/4 v12, 0x0

    .line 127
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$9$1\\5\\319\\0":I
    new-instance v13, Lcom/example/ui/screens/FajrDrawerAction;

    invoke-direct {v13, v0}, Lcom/example/ui/screens/FajrDrawerAction;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 319
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$9$1\\5\\319\\0":I
    nop

    .line 320
    .local v13, "value\\4":Ljava/lang/Object;
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 321
    move-object v10, v13

    .line 317
    .end local v10    # "it\\3":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\4\\317\\3":I
    .end local v13    # "value\\4":Ljava/lang/Object;
    :goto_3
    nop

    .line 127
    .end local v6    # "invalid\\3":Z
    .end local v8    # "$this$cache\\3":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache\\3\\127":I
    check-cast v10, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v5, v10, v1, v2, v2}, Lcom/example/fajr/ui/FajrSettingsScreenKt;->FajrSettingsScreen(Lcom/example/fajr/ui/FajrViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 128
    :cond_4
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 307
    .local v5, "$changed\\1":I
    .local v6, "$i$f$viewModel\\1\\126":I
    .local v13, "$composer\\1":Landroidx/compose/runtime/Composer;
    :cond_5
    const/4 v2, 0x0

    .line 308
    .local v2, "$i$a$-checkNotNull-ViewModelKt__ViewModelKt$viewModel$1\\2\\307\\1":I
    nop

    .line 307
    .end local v2    # "$i$a$-checkNotNull-ViewModelKt__ViewModelKt$viewModel$1\\2\\307\\1":I
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v8, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v2, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static final MainScreen(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .param p0, "viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v1, p0

    move/from16 v13, p2

    const-string v0, "viewModel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    const v0, -0x19500707

    move-object/from16 v2, p1

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(MainScreen)N(viewModel)70@3732L23,71@3776L19,72@3866L29,73@3933L29,74@4002L11,75@4039L34,76@4096L34,77@4183L18,77@4152L50,78@4219L24,80@4280L30,85@4552L5063,85@4492L5123:MainScreen.kt#2thlc2"

    invoke-static {v6, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p2

    .local v2, "$dirty":I
    and-int/lit8 v3, v13, 0x6

    const/4 v9, 0x2

    if-nez v3, :cond_1

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v9

    :goto_0
    or-int/2addr v2, v3

    :cond_1
    move v14, v2

    .end local v2    # "$dirty":I
    .local v14, "$dirty":I
    and-int/lit8 v2, v14, 0x3

    const/4 v15, 0x1

    const/4 v10, 0x0

    if-eq v2, v9, :cond_2

    move v2, v15

    goto :goto_1

    :cond_2
    move v2, v10

    :goto_1
    and-int/lit8 v3, v14, 0x1

    invoke-interface {v6, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, -0x1

    const-string v3, "com.example.ui.screens.MainScreen (MainScreen.kt:69)"

    invoke-static {v0, v14, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3
    new-array v0, v10, [Landroidx/navigation/Navigator;

    .line 71
    invoke-static {v0, v6, v10}, Landroidx/navigation/compose/NavHostControllerKt;->rememberNavController([Landroidx/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavHostController;

    move-result-object v0

    .line 72
    .local v0, "navController":Landroidx/navigation/NavHostController;
    invoke-static {v0}, Lcom/example/ui/oneui/HeaderTools;->setNav(Ljava/lang/Object;)V

    invoke-static {v10, v6, v10, v15}, Ldev/chrisbanes/haze/HazeKt;->rememberHazeState(ZLandroidx/compose/runtime/Composer;II)Ldev/chrisbanes/haze/HazeState;

    move-result-object v11

    .line 73
    .local v11, "hazeState":Ldev/chrisbanes/haze/HazeState;
    invoke-virtual {v1}, Lcom/example/ui/viewmodel/MainViewModel;->getSelectedDhikrFromNotification()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    const/4 v7, 0x0

    const/4 v8, 0x7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v12

    .line 74
    .local v12, "selectedDhikrNotif$delegate":Landroidx/compose/runtime/State;
    invoke-virtual {v1}, Lcom/example/ui/viewmodel/MainViewModel;->getAllTags()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    invoke-static/range {v2 .. v8}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 75
    .local v8, "allTags$delegate":Landroidx/compose/runtime/State;
    move v2, v10

    .local v2, "$changed\\1":I
    move-object v3, v6

    .local v3, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 182
    .local v4, "$i$f$viewModel\\1\\75":I
    const v5, 0x671a9c9b

    const-string v7, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67"

    invoke-static {v3, v5, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 183
    sget-object v5, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    const/4 v7, 0x6

    invoke-virtual {v5, v3, v7}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v17

    if-eqz v17, :cond_a

    move-object/from16 v5, v17

    .line 186
    .local v5, "viewModelStoreOwner\\1":Landroidx/lifecycle/ViewModelStoreOwner;
    const/16 v18, 0x0

    .line 187
    .local v18, "key\\1":Ljava/lang/String;
    const/16 v19, 0x0

    .line 189
    .local v19, "factory\\1":Landroidx/lifecycle/ViewModelProvider$Factory;
    instance-of v7, v5, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    if-eqz v7, :cond_4

    .line 190
    move-object v7, v5

    check-cast v7, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    invoke-interface {v7}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v7

    move-object/from16 v20, v7

    goto :goto_2

    .line 192
    :cond_4
    sget-object v7, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    check-cast v7, Landroidx/lifecycle/viewmodel/CreationExtras;

    move-object/from16 v20, v7

    :goto_2
    nop

    .local v20, "extras\\1":Landroidx/lifecycle/viewmodel/CreationExtras;
    const-class v7, Lcom/example/ui/hisn/HisnViewModel;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v16

    .line 182
    shl-int/lit8 v7, v2, 0x3

    and-int/lit8 v7, v7, 0x70

    move/from16 p1, v15

    shl-int/lit8 v15, v2, 0x3

    and-int/lit16 v15, v15, 0x380

    or-int/2addr v7, v15

    shl-int/lit8 v15, v2, 0x3

    and-int/lit16 v15, v15, 0x1c00

    or-int/2addr v7, v15

    const v15, 0xe000

    shl-int/lit8 v17, v2, 0x3

    and-int v15, v17, v15

    or-int v22, v7, v15

    const/16 v23, 0x0

    move-object/from16 v21, v3

    move-object/from16 v17, v5

    .end local v3    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v5    # "viewModelStoreOwner\\1":Landroidx/lifecycle/ViewModelStoreOwner;
    .local v17, "viewModelStoreOwner\\1":Landroidx/lifecycle/ViewModelStoreOwner;
    .local v21, "$composer\\1":Landroidx/compose/runtime/Composer;
    invoke-static/range {v16 .. v23}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Lkotlin/reflect/KClass;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    move-result-object v3

    invoke-static/range {v21 .. v21}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 75
    .end local v2    # "$changed\\1":I
    .end local v4    # "$i$f$viewModel\\1\\75":I
    .end local v17    # "viewModelStoreOwner\\1":Landroidx/lifecycle/ViewModelStoreOwner;
    .end local v18    # "key\\1":Ljava/lang/String;
    .end local v19    # "factory\\1":Landroidx/lifecycle/ViewModelProvider$Factory;
    .end local v20    # "extras\\1":Landroidx/lifecycle/viewmodel/CreationExtras;
    .end local v21    # "$composer\\1":Landroidx/compose/runtime/Composer;
    move-object v15, v3

    check-cast v15, Lcom/example/ui/hisn/HisnViewModel;

    .line 76
    .local v15, "hisnViewModel":Lcom/example/ui/hisn/HisnViewModel;
    const v2, -0x56a30e5

    const-string v3, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {v6, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\3":Z
    move-object v4, v6

    .local v4, "$this$cache\\3":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 193
    .local v5, "$i$f$cache\\3\\76":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\3":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 194
    .local v16, "$i$a$-let-ComposerKt$cache$1\\4\\193\\3":I
    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v18, v10

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    move/from16 v17, v2

    .end local v2    # "invalid\\3":Z
    .local v17, "invalid\\3":Z
    const/4 v2, 0x0

    if-ne v7, v10, :cond_5

    .line 195
    const/4 v10, 0x0

    .line 76
    .local v10, "$i$a$-cache-MainScreenKt$MainScreen$showAddDialog$2\\5\\195\\0":I
    move-object/from16 v19, v0

    .end local v0    # "navController":Landroidx/navigation/NavHostController;
    .local v19, "navController":Landroidx/navigation/NavHostController;
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v2, v9, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    .line 195
    .end local v10    # "$i$a$-cache-MainScreenKt$MainScreen$showAddDialog$2\\5\\195\\0":I
    nop

    .line 196
    .local v0, "value\\4":Ljava/lang/Object;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 197
    move-object v7, v0

    .end local v0    # "value\\4":Ljava/lang/Object;
    goto :goto_3

    .line 198
    .end local v19    # "navController":Landroidx/navigation/NavHostController;
    .local v0, "navController":Landroidx/navigation/NavHostController;
    :cond_5
    move-object/from16 v19, v0

    .line 193
    .end local v0    # "navController":Landroidx/navigation/NavHostController;
    .end local v7    # "it\\3":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\4\\193\\3":I
    .restart local v19    # "navController":Landroidx/navigation/NavHostController;
    :goto_3
    nop

    .line 76
    .end local v4    # "$this$cache\\3":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache\\3\\76":I
    .end local v17    # "invalid\\3":Z
    move-object v10, v7

    check-cast v10, Landroidx/compose/runtime/MutableState;

    .local v10, "showAddDialog$delegate":Landroidx/compose/runtime/MutableState;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 77
    const v0, -0x56a29c5

    invoke-static {v6, v0, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\6":Z
    move-object v4, v6

    .local v4, "$this$cache\\6":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 199
    .local v5, "$i$f$cache\\6\\77":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\6":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 200
    .local v16, "$i$a$-let-ComposerKt$cache$1\\7\\199\\6":I
    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_6

    .line 201
    const/4 v2, 0x0

    .line 77
    .local v2, "$i$a$-cache-MainScreenKt$MainScreen$drawerOpen$2\\8\\201\\0":I
    move/from16 v17, v0

    .end local v0    # "invalid\\6":Z
    .local v17, "invalid\\6":Z
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, v9, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    .line 201
    .end local v2    # "$i$a$-cache-MainScreenKt$MainScreen$drawerOpen$2\\8\\201\\0":I
    nop

    .line 202
    .local v0, "value\\7":Ljava/lang/Object;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 203
    move-object v7, v0

    .end local v0    # "value\\7":Ljava/lang/Object;
    goto :goto_4

    .line 204
    .end local v17    # "invalid\\6":Z
    .local v0, "invalid\\6":Z
    :cond_6
    move/from16 v17, v0

    const/4 v1, 0x0

    .line 199
    .end local v0    # "invalid\\6":Z
    .end local v7    # "it\\6":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\7\\199\\6":I
    .restart local v17    # "invalid\\6":Z
    :goto_4
    nop

    .line 77
    .end local v4    # "$this$cache\\6":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache\\6\\77":I
    .end local v17    # "invalid\\6":Z
    move-object v9, v7

    check-cast v9, Landroidx/compose/runtime/MutableState;

    .local v9, "drawerOpen$delegate":Landroidx/compose/runtime/MutableState;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 78
    const v0, -0x56a1ef5

    invoke-static {v6, v0, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\9":Z
    move-object v2, v6

    .local v2, "$this$cache\\9":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 205
    .local v3, "$i$f$cache\\9\\78":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\9":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 206
    .local v5, "$i$a$-let-ComposerKt$cache$1\\10\\205\\9":I
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v4, v7, :cond_7

    .line 207
    const/4 v7, 0x0

    .local v7, "$i$a$-cache-MainScreenKt$MainScreen$pagerState$1\\11\\207\\0":I
    new-instance v16, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda38;

    invoke-direct/range {v16 .. v16}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda38;-><init>()V

    .end local v7    # "$i$a$-cache-MainScreenKt$MainScreen$pagerState$1\\11\\207\\0":I
    move-object/from16 v7, v16

    .line 208
    .local v7, "value\\10":Ljava/lang/Object;
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 209
    move-object v4, v7

    .end local v7    # "value\\10":Ljava/lang/Object;
    goto :goto_5

    .line 210
    :cond_7
    nop

    .line 205
    .end local v4    # "it\\9":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-ComposerKt$cache$1\\10\\205\\9":I
    :goto_5
    nop

    .line 78
    .end local v0    # "invalid\\9":Z
    .end local v2    # "$this$cache\\9":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\9\\78":I
    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object/from16 v21, v6

    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v6, 0x180

    const/4 v7, 0x2

    invoke-static {}, Lcom/example/lockwidgets/HomeWidgets;->initialPage()I

    move-result v2

    const/4 v3, 0x0

    move-object/from16 v5, v21

    .end local v21    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/pager/PagerStateKt;->rememberPagerState(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;

    move-result-object v3

    .line 79
    move-object v0, v5

    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v0, "$composer":Landroidx/compose/runtime/Composer;
    .local v3, "pagerState":Landroidx/compose/foundation/pager/PagerState;
    move/from16 v2, v18

    .local v2, "$changed\\12":I
    move-object v4, v0

    .local v4, "$composer\\12":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 211
    .local v5, "$i$f$rememberCoroutineScope\\12\\79":I
    const v6, 0x2e20b340

    const-string v7, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp"

    invoke-static {v4, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 212
    nop

    .line 216
    move-object v6, v4

    .line 217
    .local v6, "composer\\12":Landroidx/compose/runtime/Composer;
    const v7, 0x28c10104

    const-string v1, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v4, v7, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v1, 0x0

    .local v1, "invalid\\13":Z
    move-object v7, v4

    .local v7, "$this$cache\\13":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 218
    .local v16, "$i$f$cache\\13\\217":I
    move/from16 v17, v1

    .end local v1    # "invalid\\13":Z
    .local v17, "invalid\\13":Z
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it\\13":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 219
    .local v21, "$i$a$-let-ComposerKt$cache$1\\14\\218\\13":I
    sget-object v22, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v23, v2

    .end local v2    # "$changed\\12":I
    .local v23, "$changed\\12":I
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_8

    .line 220
    const/4 v2, 0x0

    .line 217
    .local v2, "$i$a$-cache-EffectsKt$rememberCoroutineScope$2\\15\\220\\12":I
    const/16 v22, 0x0

    .line 221
    .local v22, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1\\16\\217\\0":I
    sget-object v22, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 217
    .end local v22    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1\\16\\217\\0":I
    move-object/from16 v24, v1

    .end local v1    # "it\\13":Ljava/lang/Object;
    .local v24, "it\\13":Ljava/lang/Object;
    move-object/from16 v1, v22

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v6}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    .line 220
    .end local v2    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$2\\15\\220\\12":I
    nop

    .line 222
    .local v1, "value\\14":Ljava/lang/Object;
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 223
    nop

    .end local v1    # "value\\14":Ljava/lang/Object;
    goto :goto_6

    .line 224
    .end local v24    # "it\\13":Ljava/lang/Object;
    .local v1, "it\\13":Ljava/lang/Object;
    :cond_8
    move-object/from16 v24, v1

    .line 218
    .end local v1    # "it\\13":Ljava/lang/Object;
    .end local v21    # "$i$a$-let-ComposerKt$cache$1\\14\\218\\13":I
    :goto_6
    nop

    .line 217
    .end local v7    # "$this$cache\\13":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache\\13\\217":I
    .end local v17    # "invalid\\13":Z
    move-object v7, v1

    check-cast v7, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 211
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 217
    nop

    .line 79
    .end local v4    # "$composer\\12":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$rememberCoroutineScope\\12\\79":I
    .end local v6    # "composer\\12":Landroidx/compose/runtime/Composer;
    .end local v23    # "$changed\\12":I
    nop

    .line 81
    .local v7, "scope":Lkotlinx/coroutines/CoroutineScope;
    move-object/from16 v1, v19

    check-cast v1, Landroidx/navigation/NavController;

    move/from16 v2, v18

    invoke-static {v1, v0, v2}, Landroidx/navigation/compose/NavHostControllerKt;->currentBackStackEntryAsState(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v16

    .line 82
    .local v16, "backEntry$delegate":Landroidx/compose/runtime/State;
    invoke-static/range {v16 .. v16}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$10(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroidx/navigation/NavBackStackEntry;->getDestination()Landroidx/navigation/NavDestination;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroidx/navigation/NavDestination;->getRoute()Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_9
    const/4 v2, 0x0

    .line 83
    .local v2, "route":Ljava/lang/String;
    :goto_7
    const-string v1, "tabs"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 84
    .local v5, "isTab":Z
    sget-object v1, Lcom/example/ui/screens/MainScreenKt;->oneUITabs:Ljava/util/List;

    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    move-result v4

    sget-object v6, Lcom/example/ui/screens/MainScreenKt;->oneUITabs:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    move-object/from16 v21, v0

    const/4 v0, 0x0

    .end local v0    # "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v4, v0, v6}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/ui/oneui/BottomTab;

    invoke-virtual {v0}, Lcom/example/ui/oneui/BottomTab;->getRoute()Ljava/lang/String;

    move-result-object v6

    .line 86
    .local v6, "currentTabRoute":Ljava/lang/String;
    invoke-static {}, Lcom/example/ui/oneui/GlassKt;->getLocalHazeState()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v0

    move-object v1, v0

    new-instance v0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;

    move-object/from16 v17, v11

    move/from16 v18, v14

    move-object v4, v15

    move-object/from16 v15, v21

    move-object v14, v1

    move-object v11, v8

    move-object/from16 v1, p0

    move-object v8, v2

    move-object/from16 v2, v19

    .end local v14    # "$dirty":I
    .end local v19    # "navController":Landroidx/navigation/NavHostController;
    .end local v21    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "navController":Landroidx/navigation/NavHostController;
    .local v4, "hisnViewModel":Lcom/example/ui/hisn/HisnViewModel;
    .local v8, "route":Ljava/lang/String;
    .local v11, "allTags$delegate":Landroidx/compose/runtime/State;
    .local v15, "$composer":Landroidx/compose/runtime/Composer;
    .local v17, "hazeState":Ldev/chrisbanes/haze/HazeState;
    .local v18, "$dirty":I
    invoke-direct/range {v0 .. v12}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/hisn/HisnViewModel;ZLjava/lang/String;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .end local v2    # "navController":Landroidx/navigation/NavHostController;
    .restart local v19    # "navController":Landroidx/navigation/NavHostController;
    const/16 v2, 0x36

    move-object/from16 v20, v3

    .end local v3    # "pagerState":Landroidx/compose/foundation/pager/PagerState;
    .local v20, "pagerState":Landroidx/compose/foundation/pager/PagerState;
    const v3, -0x1b552247

    move-object/from16 v21, v4

    move/from16 v4, p1

    .end local v4    # "hisnViewModel":Lcom/example/ui/hisn/HisnViewModel;
    .local v21, "hisnViewModel":Lcom/example/ui/hisn/HisnViewModel;
    invoke-static {v3, v4, v0, v15, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sget v2, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v14, v0, v15, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v5    # "isTab":Z
    .end local v6    # "currentTabRoute":Ljava/lang/String;
    .end local v7    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .end local v8    # "route":Ljava/lang/String;
    .end local v9    # "drawerOpen$delegate":Landroidx/compose/runtime/MutableState;
    .end local v10    # "showAddDialog$delegate":Landroidx/compose/runtime/MutableState;
    .end local v11    # "allTags$delegate":Landroidx/compose/runtime/State;
    .end local v12    # "selectedDhikrNotif$delegate":Landroidx/compose/runtime/State;
    .end local v16    # "backEntry$delegate":Landroidx/compose/runtime/State;
    .end local v17    # "hazeState":Ldev/chrisbanes/haze/HazeState;
    .end local v19    # "navController":Landroidx/navigation/NavHostController;
    .end local v20    # "pagerState":Landroidx/compose/foundation/pager/PagerState;
    .end local v21    # "hisnViewModel":Lcom/example/ui/hisn/HisnViewModel;
    goto :goto_8

    .line 183
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v18    # "$dirty":I
    .local v0, "navController":Landroidx/navigation/NavHostController;
    .local v2, "$changed\\1":I
    .local v3, "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v4, "$i$f$viewModel\\1\\75":I
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "allTags$delegate":Landroidx/compose/runtime/State;
    .local v11, "hazeState":Ldev/chrisbanes/haze/HazeState;
    .restart local v12    # "selectedDhikrNotif$delegate":Landroidx/compose/runtime/State;
    .restart local v14    # "$dirty":I
    :cond_a
    move-object/from16 v19, v0

    move-object/from16 v21, v3

    .end local v0    # "navController":Landroidx/navigation/NavHostController;
    .end local v3    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .restart local v19    # "navController":Landroidx/navigation/NavHostController;
    .local v21, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v0, 0x0

    .line 184
    .local v0, "$i$a$-checkNotNull-ViewModelKt__ViewModelKt$viewModel$1\\2\\183\\1":I
    nop

    .line 183
    .end local v0    # "$i$a$-checkNotNull-ViewModelKt__ViewModelKt$viewModel$1\\2\\183\\1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    .end local v2    # "$changed\\1":I
    .end local v4    # "$i$f$viewModel\\1\\75":I
    .end local v8    # "allTags$delegate":Landroidx/compose/runtime/State;
    .end local v11    # "hazeState":Ldev/chrisbanes/haze/HazeState;
    .end local v12    # "selectedDhikrNotif$delegate":Landroidx/compose/runtime/State;
    .end local v19    # "navController":Landroidx/navigation/NavHostController;
    .end local v21    # "$composer\\1":Landroidx/compose/runtime/Composer;
    :cond_b
    move-object v15, v6

    move/from16 v18, v14

    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v14    # "$dirty":I
    .restart local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v18    # "$dirty":I
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 180
    :cond_c
    :goto_8
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v2, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda40;

    invoke-direct {v2, v1, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda40;-><init>(Lcom/example/ui/viewmodel/MainViewModel;I)V

    invoke-interface {v0, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_d
    return-void
.end method

.method private static final MainScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/example/data/Dhikr;
    .locals 4
    .param p0, "$selectedDhikrNotif$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/example/data/Dhikr;",
            ">;)",
            "Lcom/example/data/Dhikr;"
        }
    .end annotation

    .line 73
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 225
    .local v3, "$i$f$getValue\\1\\73":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue\\1\\73":I
    check-cast v0, Lcom/example/data/Dhikr;

    .line 73
    return-object v0
.end method

.method private static final MainScreen$lambda$1(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 4
    .param p0, "$allTags$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Lcom/example/data/Tag;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/example/data/Tag;",
            ">;"
        }
    .end annotation

    .line 74
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 226
    .local v3, "$i$f$getValue\\1\\74":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue\\1\\74":I
    check-cast v0, Ljava/util/List;

    .line 74
    return-object v0
.end method

.method private static final MainScreen$lambda$10(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;
    .locals 4
    .param p0, "$backEntry$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;)",
            "Landroidx/navigation/NavBackStackEntry;"
        }
    .end annotation

    .line 81
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 233
    .local v3, "$i$f$getValue\\1\\81":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue\\1\\81":I
    check-cast v0, Landroidx/navigation/NavBackStackEntry;

    .line 81
    return-object v0
.end method

.method private static final MainScreen$lambda$3(Landroidx/compose/runtime/MutableState;)Z
    .locals 4
    .param p0, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 76
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "this_\\1":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property\\1":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 227
    .local v3, "$i$f$getValue\\1\\76":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "this_\\1":Ljava/lang/Object;
    .end local v2    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue\\1\\76":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 76
    return v0
.end method

.method private static final MainScreen$lambda$4(Landroidx/compose/runtime/MutableState;Z)V
    .locals 5
    .param p0, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "<set-?>"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 76
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v4, 0x0

    .line 228
    .local v4, "$i$f$setValue\\1\\76":I
    invoke-interface {v3, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 229
    nop

    .line 76
    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v4    # "$i$f$setValue\\1\\76":I
    return-void
.end method

.method private static final MainScreen$lambda$6(Landroidx/compose/runtime/MutableState;)Z
    .locals 4
    .param p0, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 77
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "this_\\1":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property\\1":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 230
    .local v3, "$i$f$getValue\\1\\77":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "this_\\1":Ljava/lang/Object;
    .end local v2    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue\\1\\77":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 77
    return v0
.end method

.method private static final MainScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V
    .locals 5
    .param p0, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "<set-?>"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 77
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v4, 0x0

    .line 231
    .local v4, "$i$f$setValue\\1\\77":I
    invoke-interface {v3, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 232
    nop

    .line 77
    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v4    # "$i$f$setValue\\1\\77":I
    return-void
.end method

.method static final MainScreen$lambda$88(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/hisn/HisnViewModel;ZLjava/lang/String;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 47
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$navController"    # Landroidx/navigation/NavHostController;
    .param p2, "$pagerState"    # Landroidx/compose/foundation/pager/PagerState;
    .param p3, "$hisnViewModel"    # Lcom/example/ui/hisn/HisnViewModel;
    .param p4, "$isTab"    # Z
    .param p5, "$currentTabRoute"    # Ljava/lang/String;
    .param p6, "$scope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p7, "$route"    # Ljava/lang/String;
    .param p8, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p9, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p10, "$allTags$delegate"    # Landroidx/compose/runtime/State;
    .param p11, "$selectedDhikrNotif$delegate"    # Landroidx/compose/runtime/State;
    .param p12, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p13, "$changed"    # I

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v1, p2

    move-object/from16 v15, p6

    move-object/from16 v7, p12

    move/from16 v8, p13

    const-string v0, "C86@4562L4332:MainScreen.kt#2thlc2"

    invoke-static {v7, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v8, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v0, v4, :cond_0

    move v0, v6

    goto :goto_0

    :cond_0
    move v0, v5

    :goto_0
    and-int/lit8 v4, v8, 0x1

    invoke-interface {v7, v0, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v4, "com.example.ui.screens.MainScreen.<anonymous> (MainScreen.kt:86)"

    const v9, -0x1b552247

    invoke-static {v9, v8, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    :cond_1
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v4, 0x0

    const/4 v9, 0x0

    invoke-static {v0, v4, v6, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    .local v10, "modifier\\1":Landroidx/compose/ui/Modifier;
    const/4 v0, 0x6

    .local v0, "$changed\\1":I
    move-object/from16 v11, p12

    .local v11, "$composer\\1":Landroidx/compose/runtime/Composer;
    move/from16 v16, v0

    .end local v0    # "$changed\\1":I
    .local v16, "$changed\\1":I
    const/16 v17, 0x0

    .line 329
    .local v17, "$i$f$Box\\1\\87":I
    const v0, 0x2bb5b5d7

    const-string v12, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    invoke-static {v11, v0, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 330
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v12

    .line 331
    .local v12, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    const/4 v13, 0x0

    .line 334
    .local v13, "propagateMinConstraints\\1":Z
    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v14

    .local v14, "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v0, v16, 0x3

    and-int/lit8 v0, v0, 0x70

    .line 335
    move/from16 v18, v0

    .local v18, "$changed\\2":I
    const/16 v19, 0x0

    .line 336
    .local v19, "$i$f$Layout\\2\\335":I
    const v0, -0x4ee9b9da

    const-string v4, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v11, v0, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 337
    invoke-static {v11, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v21

    .line 338
    .local v21, "compositeKeyHash\\2":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v0

    .line 339
    .local v0, "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v11, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 341
    .local v4, "materialized\\2":Landroidx/compose/ui/Modifier;
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    shl-int/lit8 v6, v18, 0x6

    and-int/lit16 v6, v6, 0x380

    or-int/lit8 v6, v6, 0x6

    .line 340
    nop

    .local v5, "factory\\3":Lkotlin/jvm/functions/Function0;
    move/from16 v23, v6

    .local v23, "$changed\\3":I
    const/16 v24, 0x0

    .line 342
    .local v24, "$i$f$ReusableComposeNode\\3\\340":I
    const v6, -0x2942ffcf

    const-string v9, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v11, v6, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 343
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v6

    instance-of v6, v6, Landroidx/compose/runtime/Applier;

    if-nez v6, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 344
    :cond_2
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 345
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 346
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 348
    :cond_3
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 350
    :goto_1
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .local v6, "$this$Layout_u24lambda_u240\\4":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 351
    .local v9, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\4\\350\\2":I
    sget-object v26, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v27, v5

    .end local v5    # "factory\\3":Lkotlin/jvm/functions/Function0;
    .local v27, "factory\\3":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v6, v14, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 352
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v6, v0, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 354
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    .local v5, "block\\5":Lkotlin/jvm/functions/Function2;
    const/16 v26, 0x0

    .line 355
    .local v26, "$i$f$set-impl\\5\\354":I
    move-object/from16 v28, v6

    .local v28, "$this$set_impl_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/16 v29, 0x0

    .line 356
    .local v29, "$i$a$-with-Updater$set$1\\6\\355\\5":I
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v30

    if-nez v30, :cond_5

    move-object/from16 v30, v0

    .end local v0    # "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    .local v30, "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v7, v28

    goto :goto_3

    .end local v30    # "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v0    # "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    :cond_5
    move-object/from16 v30, v0

    .line 357
    .end local v0    # "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v30    # "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    :goto_2
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v7, v28

    .end local v28    # "$this$set_impl_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .local v7, "$this$set_impl_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 358
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 360
    :goto_3
    nop

    .line 355
    .end local v7    # "$this$set_impl_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v29    # "$i$a$-with-Updater$set$1\\6\\355\\5":I
    nop

    .line 360
    nop

    .line 361
    .end local v5    # "block\\5":Lkotlin/jvm/functions/Function2;
    .end local v26    # "$i$f$set-impl\\5\\354":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v4, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 362
    nop

    .line 350
    .end local v6    # "$this$Layout_u24lambda_u240\\4":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\4\\350\\2":I
    nop

    .line 363
    shr-int/lit8 v0, v23, 0x6

    and-int/lit8 v26, v0, 0xe

    .local v26, "$changed\\7":I
    move-object v0, v11

    .local v0, "$composer\\7":Landroidx/compose/runtime/Composer;
    move-object v7, v0

    .end local v0    # "$composer\\7":Landroidx/compose/runtime/Composer;
    .local v7, "$composer\\7":Landroidx/compose/runtime/Composer;
    const/16 v28, 0x0

    .line 364
    .local v28, "$i$a$-Layout-BoxKt$Box$1\\7\\363\\1":I
    const v0, -0x7ff519f7    # -1.000876E-39f

    const-string v5, "C73@3429L9:Box.kt#2w3rfo"

    invoke-static {v7, v0, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    shr-int/lit8 v5, v16, 0x6

    and-int/lit8 v5, v5, 0x70

    or-int/lit8 v29, v5, 0x6

    .local v29, "$changed\\8":I
    check-cast v0, Landroidx/compose/foundation/layout/BoxScope;

    move-object v9, v11

    .end local v11    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v0, "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    .local v9, "$composer\\1":Landroidx/compose/runtime/Composer;
    move-object v11, v7

    .local v11, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/16 v40, 0x0

    .line 88
    .local v40, "$i$a$-Box-MainScreenKt$MainScreen$1$1\\8\\364\\0":I
    const v5, -0x44c7a694

    const-string v6, "C93@4983L73,94@5095L23,95@5161L24,96@5227L74,97@5320L2359,87@4604L3075,145@8334L105,149@8469L22,141@8147L737:MainScreen.kt#2thlc2"

    invoke-static {v11, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 89
    nop

    .line 90
    nop

    .line 91
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object/from16 v20, v0

    move-object/from16 v22, v4

    const/4 v0, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    .end local v0    # "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    .end local v4    # "materialized\\2":Landroidx/compose/ui/Modifier;
    .local v20, "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    .local v22, "materialized\\2":Landroidx/compose/ui/Modifier;
    invoke-static {v5, v0, v4, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v25

    .line 94
    const v0, 0x27127468

    const-string v4, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {v11, v0, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\9":Z
    move-object v5, v11

    .local v5, "$this$cache\\9":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 365
    .local v6, "$i$f$cache\\9\\94":I
    move/from16 v31, v0

    .end local v0    # "invalid\\9":Z
    .local v31, "invalid\\9":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it\\9":Ljava/lang/Object;
    const/16 v32, 0x0

    .line 366
    .local v32, "$i$a$-let-ComposerKt$cache$1\\10\\365\\9":I
    sget-object v33, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v34, v6

    .end local v6    # "$i$f$cache\\9\\94":I
    .local v34, "$i$f$cache\\9\\94":I
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_6

    .line 367
    const/4 v6, 0x0

    .local v6, "$i$a$-cache-MainScreenKt$MainScreen$1$1$1\\11\\367\\8":I
    new-instance v33, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda14;

    invoke-direct/range {v33 .. v33}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda14;-><init>()V

    .end local v6    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$1\\11\\367\\8":I
    move-object/from16 v6, v33

    .line 368
    .local v6, "value\\10":Ljava/lang/Object;
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 369
    move-object v0, v6

    .end local v6    # "value\\10":Ljava/lang/Object;
    goto :goto_4

    .line 370
    :cond_6
    nop

    .line 365
    .end local v0    # "it\\9":Ljava/lang/Object;
    .end local v32    # "$i$a$-let-ComposerKt$cache$1\\10\\365\\9":I
    :goto_4
    nop

    .line 94
    .end local v5    # "$this$cache\\9":Landroidx/compose/runtime/Composer;
    .end local v31    # "invalid\\9":Z
    .end local v34    # "$i$f$cache\\9\\94":I
    move-object/from16 v31, v0

    check-cast v31, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 95
    const v0, 0x27128236

    invoke-static {v11, v0, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\12":Z
    move-object v5, v11

    .local v5, "$this$cache\\12":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 371
    .local v6, "$i$f$cache\\12\\95":I
    move/from16 v32, v0

    .end local v0    # "invalid\\12":Z
    .local v32, "invalid\\12":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it\\12":Ljava/lang/Object;
    const/16 v33, 0x0

    .line 372
    .local v33, "$i$a$-let-ComposerKt$cache$1\\13\\371\\12":I
    sget-object v34, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v35, v6

    .end local v6    # "$i$f$cache\\12\\95":I
    .local v35, "$i$f$cache\\12\\95":I
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_7

    .line 373
    const/4 v6, 0x0

    .local v6, "$i$a$-cache-MainScreenKt$MainScreen$1$1$2\\14\\373\\8":I
    new-instance v34, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda18;

    invoke-direct/range {v34 .. v34}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda18;-><init>()V

    .end local v6    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$2\\14\\373\\8":I
    move-object/from16 v6, v34

    .line 374
    .local v6, "value\\13":Ljava/lang/Object;
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 375
    move-object v0, v6

    .end local v6    # "value\\13":Ljava/lang/Object;
    goto :goto_5

    .line 376
    :cond_7
    nop

    .line 371
    .end local v0    # "it\\12":Ljava/lang/Object;
    .end local v33    # "$i$a$-let-ComposerKt$cache$1\\13\\371\\12":I
    :goto_5
    nop

    .line 95
    .end local v5    # "$this$cache\\12":Landroidx/compose/runtime/Composer;
    .end local v32    # "invalid\\12":Z
    .end local v35    # "$i$f$cache\\12\\95":I
    move-object/from16 v32, v0

    check-cast v32, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 96
    const v0, 0x27128a77

    invoke-static {v11, v0, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\15":Z
    move-object v5, v11

    .local v5, "$this$cache\\15":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 377
    .local v6, "$i$f$cache\\15\\96":I
    move/from16 v33, v0

    .end local v0    # "invalid\\15":Z
    .local v33, "invalid\\15":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it\\15":Ljava/lang/Object;
    const/16 v34, 0x0

    .line 378
    .local v34, "$i$a$-let-ComposerKt$cache$1\\16\\377\\15":I
    sget-object v35, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v36, v6

    .end local v6    # "$i$f$cache\\15\\96":I
    .local v36, "$i$f$cache\\15\\96":I
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_8

    .line 379
    const/4 v6, 0x0

    .local v6, "$i$a$-cache-MainScreenKt$MainScreen$1$1$3\\17\\379\\8":I
    new-instance v35, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda19;

    invoke-direct/range {v35 .. v35}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda19;-><init>()V

    .end local v6    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$3\\17\\379\\8":I
    move-object/from16 v6, v35

    .line 380
    .local v6, "value\\16":Ljava/lang/Object;
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 381
    move-object v0, v6

    .end local v6    # "value\\16":Ljava/lang/Object;
    goto :goto_6

    .line 382
    :cond_8
    nop

    .line 377
    .end local v0    # "it\\15":Ljava/lang/Object;
    .end local v34    # "$i$a$-let-ComposerKt$cache$1\\16\\377\\15":I
    :goto_6
    nop

    .line 96
    .end local v5    # "$this$cache\\15":Landroidx/compose/runtime/Composer;
    .end local v33    # "invalid\\15":Z
    .end local v36    # "$i$f$cache\\15\\96":I
    move-object/from16 v33, v0

    check-cast v33, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 97
    const v0, 0x271292e9

    invoke-static {v11, v0, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\18":Z
    move-object v5, v11

    .local v5, "$this$cache\\18":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 383
    .local v6, "$i$f$cache\\18\\97":I
    move/from16 v34, v0

    .end local v0    # "invalid\\18":Z
    .local v34, "invalid\\18":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it\\18":Ljava/lang/Object;
    const/16 v35, 0x0

    .line 384
    .local v35, "$i$a$-let-ComposerKt$cache$1\\19\\383\\18":I
    sget-object v36, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v37, v6

    .end local v6    # "$i$f$cache\\18\\97":I
    .local v37, "$i$f$cache\\18\\97":I
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_9

    .line 385
    const/4 v6, 0x0

    .local v6, "$i$a$-cache-MainScreenKt$MainScreen$1$1$4\\20\\385\\8":I
    new-instance v36, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda20;

    invoke-direct/range {v36 .. v36}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda20;-><init>()V

    .end local v6    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$4\\20\\385\\8":I
    move-object/from16 v6, v36

    .line 386
    .local v6, "value\\19":Ljava/lang/Object;
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 387
    move-object v0, v6

    .end local v6    # "value\\19":Ljava/lang/Object;
    goto :goto_7

    .line 388
    :cond_9
    nop

    .line 383
    .end local v0    # "it\\18":Ljava/lang/Object;
    .end local v35    # "$i$a$-let-ComposerKt$cache$1\\19\\383\\18":I
    :goto_7
    nop

    .line 97
    .end local v5    # "$this$cache\\18":Landroidx/compose/runtime/Composer;
    .end local v34    # "invalid\\18":Z
    .end local v37    # "$i$f$cache\\18\\97":I
    move-object/from16 v34, v0

    check-cast v34, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 98
    const v0, 0x2712a776

    invoke-static {v11, v0, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    move-object/from16 v5, p3

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    .local v0, "invalid\\21":Z
    move-object v6, v11

    .local v6, "$this$cache\\21":Landroidx/compose/runtime/Composer;
    move/from16 v35, v0

    .end local v0    # "invalid\\21":Z
    .local v35, "invalid\\21":Z
    const/16 v36, 0x0

    .line 389
    .local v36, "$i$f$cache\\21\\98":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it\\21":Ljava/lang/Object;
    const/16 v37, 0x0

    .line 390
    .local v37, "$i$a$-let-ComposerKt$cache$1\\22\\389\\21":I
    if-nez v35, :cond_b

    sget-object v38, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v38 .. v38}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_a

    goto :goto_8

    .line 394
    :cond_a
    move-object/from16 v42, v4

    move-object/from16 v41, v20

    move-object/from16 v20, v7

    move-object v7, v6

    goto :goto_9

    .line 391
    :cond_b
    :goto_8
    const/16 v38, 0x0

    .line 98
    .local v38, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5\\23\\391\\8":I
    move-object v1, v0

    .end local v0    # "it\\21":Ljava/lang/Object;
    .local v1, "it\\21":Ljava/lang/Object;
    new-instance v0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;

    move-object/from16 v39, v1

    move-object/from16 v42, v4

    move-object v4, v5

    move-object/from16 v41, v20

    move-object/from16 v1, p2

    move-object/from16 v5, p8

    move-object/from16 v20, v7

    move-object v7, v6

    move-object/from16 v6, p9

    .end local v1    # "it\\21":Ljava/lang/Object;
    .end local v6    # "$this$cache\\21":Landroidx/compose/runtime/Composer;
    .local v7, "$this$cache\\21":Landroidx/compose/runtime/Composer;
    .local v20, "$composer\\7":Landroidx/compose/runtime/Composer;
    .local v39, "it\\21":Ljava/lang/Object;
    .local v41, "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    invoke-direct/range {v0 .. v6}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;-><init>(Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/hisn/HisnViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    .line 391
    .end local v38    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5\\23\\391\\8":I
    nop

    .line 392
    .local v0, "value\\22":Ljava/lang/Object;
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 393
    nop

    .line 389
    .end local v0    # "value\\22":Ljava/lang/Object;
    .end local v37    # "$i$a$-let-ComposerKt$cache$1\\22\\389\\21":I
    .end local v39    # "it\\21":Ljava/lang/Object;
    :goto_9
    nop

    .line 98
    .end local v7    # "$this$cache\\21":Landroidx/compose/runtime/Composer;
    .end local v35    # "invalid\\21":Z
    .end local v36    # "$i$f$cache\\21\\98":I
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 88
    const-string v1, "tabs"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, v9

    .end local v9    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v7, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    move-object v2, v12

    .end local v12    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v2, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    const v12, 0x6db01b0

    move v5, v13

    .end local v13    # "propagateMinConstraints\\1":Z
    .local v5, "propagateMinConstraints\\1":Z
    const/4 v13, 0x0

    move-object v6, v14

    .end local v14    # "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v6, "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    const/16 v14, 0x218

    move-object/from16 v43, v2

    move/from16 v44, v5

    move-object/from16 v45, v6

    move-object/from16 v46, v20

    move-object/from16 v2, v25

    move-object/from16 v5, v31

    move-object/from16 v6, v32

    move-object/from16 v8, v34

    move-object/from16 v25, v7

    move-object/from16 v20, v10

    move-object/from16 v7, v33

    move-object v10, v0

    move-object/from16 v0, p1

    .end local v2    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .end local v5    # "propagateMinConstraints\\1":Z
    .end local v6    # "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v7    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v10    # "modifier\\1":Landroidx/compose/ui/Modifier;
    .local v20, "modifier\\1":Landroidx/compose/ui/Modifier;
    .local v25, "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v43, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v44, "propagateMinConstraints\\1":Z
    .local v45, "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v46, "$composer\\7":Landroidx/compose/runtime/Composer;
    invoke-static/range {v0 .. v14}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    .line 131
    move-object v7, v0

    if-eqz p4, :cond_e

    const v0, -0x449a900c

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "134@7859L172,131@7721L399"

    invoke-static {v11, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 133
    sget-object v31, Lcom/example/ui/screens/MainScreenKt;->oneUITabs:Ljava/util/List;

    .line 134
    nop

    .line 135
    const v0, 0x2713dc4b

    move-object/from16 v8, v42

    invoke-static {v11, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    move-object/from16 v9, p2

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    .local v0, "invalid\\24":Z
    move-object v1, v11

    .local v1, "$this$cache\\24":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 395
    .local v2, "$i$f$cache\\24\\135":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it\\24":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 396
    .local v4, "$i$a$-let-ComposerKt$cache$1\\25\\395\\24":I
    if-nez v0, :cond_d

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_c

    goto :goto_a

    .line 400
    :cond_c
    goto :goto_b

    .line 397
    :cond_d
    :goto_a
    const/4 v5, 0x0

    .line 135
    .local v5, "$i$a$-cache-MainScreenKt$MainScreen$1$1$6\\26\\397\\8":I
    new-instance v6, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda23;

    invoke-direct {v6, v15, v9}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda23;-><init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;)V

    .line 397
    .end local v5    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$6\\26\\397\\8":I
    nop

    .line 398
    .local v6, "value\\25":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 399
    move-object v3, v6

    .line 395
    .end local v3    # "it\\24":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1\\25\\395\\24":I
    .end local v6    # "value\\25":Ljava/lang/Object;
    :goto_b
    nop

    .line 135
    .end local v0    # "invalid\\24":Z
    .end local v1    # "$this$cache\\24":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\24\\135":I
    move-object/from16 v33, v3

    check-cast v33, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 139
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getBottomCenter()Landroidx/compose/ui/Alignment;

    move-result-object v1

    move-object/from16 v2, v41

    .end local v41    # "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    .local v2, "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    invoke-interface {v2, v0, v1}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v34

    .line 132
    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v32, p5

    move-object/from16 v35, v11

    .end local v11    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v35, "$composer\\8":Landroidx/compose/runtime/Composer;
    invoke-static/range {v31 .. v37}, Lcom/example/ui/oneui/OneUIKt;->OneUIBottomBar(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 131
    .end local v35    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .restart local v11    # "$composer\\8":Landroidx/compose/runtime/Composer;
    goto :goto_c

    .end local v2    # "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    .restart local v41    # "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    :cond_e
    move-object/from16 v9, p2

    move-object/from16 v2, v41

    move-object/from16 v8, v42

    .end local v41    # "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    .restart local v2    # "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    const v0, -0x450f613d

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 143
    invoke-static/range {p8 .. p8}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$6(Landroidx/compose/runtime/MutableState;)Z

    move-result v31

    .line 144
    if-eqz p4, :cond_f

    move-object/from16 v32, p5

    goto :goto_d

    :cond_f
    move-object/from16 v32, p7

    .line 145
    :goto_d
    sget-object v33, Lcom/example/ui/screens/MainScreenKt;->oneUIDrawerItems:Ljava/util/List;

    .line 146
    const v0, 0x27141768

    invoke-static {v11, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\27":Z
    move-object v1, v11

    .local v1, "$this$cache\\27":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 401
    .local v3, "$i$f$cache\\27\\146":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\27":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 402
    .local v5, "$i$a$-let-ComposerKt$cache$1\\28\\401\\27":I
    if-nez v0, :cond_11

    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_10

    goto :goto_e

    .line 406
    :cond_10
    move-object/from16 v12, p8

    goto :goto_f

    .line 403
    :cond_11
    :goto_e
    const/4 v6, 0x0

    .line 146
    .local v6, "$i$a$-cache-MainScreenKt$MainScreen$1$1$7\\29\\403\\8":I
    new-instance v10, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda24;

    move-object/from16 v12, p8

    invoke-direct {v10, v7, v12}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda24;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/MutableState;)V

    .line 403
    .end local v6    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$7\\29\\403\\8":I
    nop

    .line 404
    .local v10, "value\\28":Ljava/lang/Object;
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 405
    move-object v4, v10

    .line 401
    .end local v4    # "it\\27":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-ComposerKt$cache$1\\28\\401\\27":I
    .end local v10    # "value\\28":Ljava/lang/Object;
    :goto_f
    nop

    .line 146
    .end local v0    # "invalid\\27":Z
    .end local v1    # "$this$cache\\27":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\27\\146":I
    move-object/from16 v34, v4

    check-cast v34, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 150
    const v0, 0x271427f5

    invoke-static {v11, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\30":Z
    move-object v1, v11

    .local v1, "$this$cache\\30":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 407
    .local v3, "$i$f$cache\\30\\150":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\30":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 408
    .local v5, "$i$a$-let-ComposerKt$cache$1\\31\\407\\30":I
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_12

    .line 409
    const/4 v6, 0x0

    .line 150
    .local v6, "$i$a$-cache-MainScreenKt$MainScreen$1$1$8\\32\\409\\8":I
    new-instance v10, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda25;

    invoke-direct {v10, v12}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda25;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 409
    .end local v6    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$8\\32\\409\\8":I
    nop

    .line 410
    .local v10, "value\\31":Ljava/lang/Object;
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 411
    move-object v4, v10

    .end local v10    # "value\\31":Ljava/lang/Object;
    goto :goto_10

    .line 412
    :cond_12
    nop

    .line 407
    .end local v4    # "it\\30":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-ComposerKt$cache$1\\31\\407\\30":I
    :goto_10
    nop

    .line 150
    .end local v0    # "invalid\\30":Z
    .end local v1    # "$this$cache\\30":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\30\\150":I
    move-object/from16 v35, v4

    check-cast v35, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    sget-object v0, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;

    invoke-virtual {v0}, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;->getLambda$99215418$app()Lkotlin/jvm/functions/Function2;

    move-result-object v36

    .line 142
    const v38, 0x36000

    const/16 v39, 0x0

    move-object/from16 v37, v11

    .end local v11    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v37, "$composer\\8":Landroidx/compose/runtime/Composer;
    invoke-static/range {v31 .. v39}, Lcom/example/ui/oneui/OneUIKt;->OneUIDrawer(ZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 88
    .end local v37    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .restart local v11    # "$composer\\8":Landroidx/compose/runtime/Composer;
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 159
    nop

    .line 364
    .end local v2    # "$this$MainScreen_u24lambda_u2488_u24lambda_u2476\\8":Landroidx/compose/foundation/layout/BoxScope;
    .end local v11    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v29    # "$changed\\8":I
    .end local v40    # "$i$a$-Box-MainScreenKt$MainScreen$1$1\\8\\364\\0":I
    invoke-static/range {v46 .. v46}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 363
    .end local v26    # "$changed\\7":I
    .end local v28    # "$i$a$-Layout-BoxKt$Box$1\\7\\363\\1":I
    .end local v46    # "$composer\\7":Landroidx/compose/runtime/Composer;
    nop

    .line 413
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 342
    invoke-static/range {v25 .. v25}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 414
    nop

    .line 336
    .end local v23    # "$changed\\3":I
    .end local v24    # "$i$f$ReusableComposeNode\\3\\340":I
    .end local v27    # "factory\\3":Lkotlin/jvm/functions/Function0;
    invoke-static/range {v25 .. v25}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 415
    nop

    .line 329
    .end local v18    # "$changed\\2":I
    .end local v19    # "$i$f$Layout\\2\\335":I
    .end local v21    # "compositeKeyHash\\2":I
    .end local v22    # "materialized\\2":Landroidx/compose/ui/Modifier;
    .end local v30    # "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static/range {v25 .. v25}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 416
    nop

    .line 161
    .end local v16    # "$changed\\1":I
    .end local v17    # "$i$f$Box\\1\\87":I
    .end local v20    # "modifier\\1":Landroidx/compose/ui/Modifier;
    .end local v25    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v43    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .end local v44    # "propagateMinConstraints\\1":Z
    .end local v45    # "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-static/range {p9 .. p9}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$3(Landroidx/compose/runtime/MutableState;)Z

    move-result v0

    if-eqz v0, :cond_18

    const v0, 0x4822770e

    move-object/from16 v3, p12

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "163@9016L25,164@9071L183,168@9286L24,161@8937L387"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 163
    invoke-static/range {p10 .. p10}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$1(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object v0

    .line 164
    const v1, 0x656c8192

    invoke-static {v3, v1, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v1, 0x0

    .local v1, "invalid\\33":Z
    move-object/from16 v2, p12

    .local v2, "$this$cache\\33":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 417
    .local v4, "$i$f$cache\\33\\164":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\33":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 418
    .local v6, "$i$a$-let-ComposerKt$cache$1\\34\\417\\33":I
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v5, v10, :cond_13

    .line 419
    const/4 v10, 0x0

    .line 164
    .local v10, "$i$a$-cache-MainScreenKt$MainScreen$1$2\\35\\419\\0":I
    new-instance v11, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda26;

    move-object/from16 v13, p9

    invoke-direct {v11, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda26;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 419
    .end local v10    # "$i$a$-cache-MainScreenKt$MainScreen$1$2\\35\\419\\0":I
    nop

    .line 420
    .local v11, "value\\34":Ljava/lang/Object;
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 421
    move-object v5, v11

    .end local v11    # "value\\34":Ljava/lang/Object;
    goto :goto_11

    .line 422
    :cond_13
    move-object/from16 v13, p9

    .line 417
    .end local v5    # "it\\33":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\34\\417\\33":I
    :goto_11
    nop

    .line 164
    .end local v1    # "invalid\\33":Z
    .end local v2    # "$this$cache\\33":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\33\\164":I
    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 165
    const v2, 0x656c8910

    invoke-static {v3, v2, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    move-object/from16 v10, p0

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid\\36":Z
    move-object/from16 v4, p12

    .local v4, "$this$cache\\36":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 423
    .local v5, "$i$f$cache\\36\\165":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\36":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 424
    .local v11, "$i$a$-let-ComposerKt$cache$1\\37\\423\\36":I
    if-nez v2, :cond_15

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v6, v14, :cond_14

    goto :goto_12

    .line 428
    :cond_14
    move-object/from16 v16, v0

    goto :goto_13

    .line 425
    :cond_15
    :goto_12
    const/4 v14, 0x0

    .line 165
    .local v14, "$i$a$-cache-MainScreenKt$MainScreen$1$3\\38\\425\\0":I
    move-object/from16 v16, v0

    new-instance v0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;

    invoke-direct {v0, v10, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/MutableState;)V

    .line 425
    .end local v14    # "$i$a$-cache-MainScreenKt$MainScreen$1$3\\38\\425\\0":I
    nop

    .line 426
    .local v0, "value\\37":Ljava/lang/Object;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 427
    move-object v6, v0

    .line 423
    .end local v0    # "value\\37":Ljava/lang/Object;
    .end local v6    # "it\\36":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\37\\423\\36":I
    :goto_13
    nop

    .line 165
    .end local v2    # "invalid\\36":Z
    .end local v4    # "$this$cache\\36":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache\\36\\165":I
    move-object v2, v6

    check-cast v2, Lkotlin/jvm/functions/Function4;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 169
    const v0, 0x656ca351

    invoke-static {v3, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\39":Z
    move-object/from16 v4, p12

    .local v4, "$this$cache\\39":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 429
    .local v5, "$i$f$cache\\39\\169":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\39":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 430
    .local v11, "$i$a$-let-ComposerKt$cache$1\\40\\429\\39":I
    if-nez v0, :cond_17

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v6, v14, :cond_16

    goto :goto_14

    .line 434
    :cond_16
    move/from16 v17, v0

    goto :goto_15

    .line 431
    :cond_17
    :goto_14
    const/4 v14, 0x0

    .line 169
    .local v14, "$i$a$-cache-MainScreenKt$MainScreen$1$4\\41\\431\\0":I
    move/from16 v17, v0

    .end local v0    # "invalid\\39":Z
    .local v17, "invalid\\39":Z
    new-instance v0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda15;

    invoke-direct {v0, v10}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda15;-><init>(Lcom/example/ui/viewmodel/MainViewModel;)V

    .line 431
    .end local v14    # "$i$a$-cache-MainScreenKt$MainScreen$1$4\\41\\431\\0":I
    nop

    .line 432
    .local v0, "value\\40":Ljava/lang/Object;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 433
    move-object v6, v0

    .line 429
    .end local v0    # "value\\40":Ljava/lang/Object;
    .end local v6    # "it\\39":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\40\\429\\39":I
    :goto_15
    nop

    .line 169
    .end local v4    # "$this$cache\\39":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache\\39\\169":I
    .end local v17    # "invalid\\39":Z
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 162
    const/16 v5, 0x30

    move-object v3, v6

    const/4 v6, 0x0

    move-object/from16 v4, p12

    move-object/from16 v0, v16

    invoke-static/range {v0 .. v6}, Lcom/example/ui/screens/DialogsKt;->DhikrAddDialog(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 161
    move-object v3, v4

    goto :goto_16

    :cond_18
    move-object/from16 v10, p0

    move-object/from16 v13, p9

    move-object/from16 v3, p12

    const v0, 0x479b30c9

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_16
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 172
    invoke-static/range {p11 .. p11}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/example/data/Dhikr;

    move-result-object v0

    if-nez v0, :cond_19

    const v0, 0x48290c12

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_1b

    :cond_19
    const v1, 0x48290c13

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "*174@9468L50,175@9551L34,172@9390L209"

    invoke-static {v3, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .local v0, "dhikr\\42":Lcom/example/data/Dhikr;
    const/4 v6, 0x0

    .line 174
    .local v6, "$i$a$-let-MainScreenKt$MainScreen$1$5\\42\\172\\0":I
    nop

    .line 175
    const v1, 0x481824b2

    invoke-static {v3, v1, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    .local v1, "invalid\\43":Z
    move-object/from16 v2, p12

    .local v2, "$this$cache\\43":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 435
    .local v4, "$i$f$cache\\43\\175":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\43":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 436
    .local v11, "$i$a$-let-ComposerKt$cache$1\\44\\435\\43":I
    if-nez v1, :cond_1b

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v5, v14, :cond_1a

    goto :goto_17

    .line 440
    :cond_1a
    move/from16 v16, v1

    goto :goto_18

    .line 437
    :cond_1b
    :goto_17
    const/4 v14, 0x0

    .line 175
    .local v14, "$i$a$-cache-MainScreenKt$MainScreen$1$5$1\\45\\437\\42":I
    move/from16 v16, v1

    .end local v1    # "invalid\\43":Z
    .local v16, "invalid\\43":Z
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda16;

    invoke-direct {v1, v10}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda16;-><init>(Lcom/example/ui/viewmodel/MainViewModel;)V

    .line 437
    .end local v14    # "$i$a$-cache-MainScreenKt$MainScreen$1$5$1\\45\\437\\42":I
    nop

    .line 438
    .local v1, "value\\44":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 439
    move-object v5, v1

    .line 435
    .end local v1    # "value\\44":Ljava/lang/Object;
    .end local v5    # "it\\43":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\44\\435\\43":I
    :goto_18
    nop

    .line 175
    .end local v2    # "$this$cache\\43":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\43\\175":I
    .end local v16    # "invalid\\43":Z
    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 176
    const v2, 0x48182f02

    invoke-static {v3, v2, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    .local v2, "invalid\\46":Z
    move-object/from16 v4, p12

    .local v4, "$this$cache\\46":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 441
    .local v5, "$i$f$cache\\46\\176":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it\\46":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 442
    .local v11, "$i$a$-let-ComposerKt$cache$1\\47\\441\\46":I
    if-nez v2, :cond_1d

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v8, v14, :cond_1c

    goto :goto_19

    .line 446
    :cond_1c
    move-object/from16 v16, v1

    goto :goto_1a

    .line 443
    :cond_1d
    :goto_19
    const/4 v14, 0x0

    .line 176
    .local v14, "$i$a$-cache-MainScreenKt$MainScreen$1$5$2\\48\\443\\42":I
    move-object/from16 v16, v1

    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda17;

    invoke-direct {v1, v10, v0}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda17;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Lcom/example/data/Dhikr;)V

    .line 443
    .end local v14    # "$i$a$-cache-MainScreenKt$MainScreen$1$5$2\\48\\443\\42":I
    nop

    .line 444
    .local v1, "value\\47":Ljava/lang/Object;
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 445
    move-object v8, v1

    .line 441
    .end local v1    # "value\\47":Ljava/lang/Object;
    .end local v8    # "it\\46":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\47\\441\\46":I
    :goto_1a
    nop

    .line 176
    .end local v2    # "invalid\\46":Z
    .end local v4    # "$this$cache\\46":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache\\46\\176":I
    move-object v2, v8

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 173
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, v16

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/DialogsKt;->DhikrDetailDialog(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 178
    nop

    .end local v0    # "dhikr\\42":Lcom/example/data/Dhikr;
    .end local v6    # "$i$a$-let-MainScreenKt$MainScreen$1$5\\42\\172\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 172
    invoke-interface/range {p12 .. p12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_1b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1c

    .line 86
    :cond_1e
    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object v9, v1

    move-object v10, v2

    move-object v7, v3

    invoke-interface/range {p12 .. p12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 179
    :cond_1f
    :goto_1c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$13$lambda$12(Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;
    .locals 5
    .param p0, "$this$NavHost"    # Landroidx/compose/animation/AnimatedContentTransitionScope;

    const-string v0, "$this$NavHost"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutSlowInEasing()Landroidx/compose/animation/core/Easing;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0x12c

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v1, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/core/FiniteAnimationSpec;

    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda44;

    invoke-direct {v1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda44;-><init>()V

    invoke-static {v0, v1}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;

    move-result-object v0

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$13$lambda$12$lambda$11(I)I
    .locals 1
    .param p0, "it"    # I

    .line 94
    neg-int v0, p0

    return v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$15$lambda$14(Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;
    .locals 1
    .param p0, "$this$NavHost"    # Landroidx/compose/animation/AnimatedContentTransitionScope;

    const-string v0, "$this$NavHost"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    sget-object v0, Landroidx/compose/animation/ExitTransition;->Companion:Landroidx/compose/animation/ExitTransition$Companion;

    invoke-virtual {v0}, Landroidx/compose/animation/ExitTransition$Companion;->getNone()Landroidx/compose/animation/ExitTransition;

    move-result-object v0

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$17$lambda$16(Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;
    .locals 1
    .param p0, "$this$NavHost"    # Landroidx/compose/animation/AnimatedContentTransitionScope;

    const-string v0, "$this$NavHost"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    sget-object v0, Landroidx/compose/animation/EnterTransition;->Companion:Landroidx/compose/animation/EnterTransition$Companion;

    invoke-virtual {v0}, Landroidx/compose/animation/EnterTransition$Companion;->getNone()Landroidx/compose/animation/EnterTransition;

    move-result-object v0

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$20$lambda$19(Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;
    .locals 5
    .param p0, "$this$NavHost"    # Landroidx/compose/animation/AnimatedContentTransitionScope;

    const-string v0, "$this$NavHost"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutSlowInEasing()Landroidx/compose/animation/core/Easing;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0x12c

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v1, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/core/FiniteAnimationSpec;

    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;

    invoke-direct {v1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;-><init>()V

    invoke-static {v0, v1}, Landroidx/compose/animation/EnterExitTransitionKt;->slideOutHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;

    move-result-object v0

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$20$lambda$19$lambda$18(I)I
    .locals 1
    .param p0, "it"    # I

    .line 97
    neg-int v0, p0

    return v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68(Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/hisn/HisnViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;
    .locals 16
    .param p0, "$pagerState"    # Landroidx/compose/foundation/pager/PagerState;
    .param p1, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p2, "$navController"    # Landroidx/navigation/NavHostController;
    .param p3, "$hisnViewModel"    # Lcom/example/ui/hisn/HisnViewModel;
    .param p4, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p5, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p6, "$this$NavHost"    # Landroidx/navigation/NavGraphBuilder;

    const-string v0, "$this$NavHost"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    new-instance v0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;-><init>(Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/hisn/HisnViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    move-object v1, v0

    move-object v0, v2

    move-object v13, v3

    const v2, 0x3c93f322

    const/4 v14, 0x1

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const/16 v11, 0xfe

    const/4 v12, 0x0

    const-string v2, "tabs"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 110
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda1;-><init>()V

    const-string v2, "id"

    invoke-static {v2, v1}, Landroidx/navigation/NamedNavArgumentKt;->navArgument(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NamedNavArgument;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda2;

    move-object/from16 v15, p3

    invoke-direct {v1, v15, v13, v0}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda2;-><init>(Lcom/example/ui/hisn/HisnViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/viewmodel/MainViewModel;)V

    const v2, -0x33709f27    # -7.5171528E7f

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const/16 v11, 0xfc

    const-string v2, "hisn/{id}"

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 118
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda3;

    invoke-direct {v1, v0, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda3;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;)V

    const v2, -0x65511966

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const/16 v11, 0xfe

    const-string v2, "favorites"

    const/4 v3, 0x0

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 119
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda4;

    invoke-direct {v1, v0, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda4;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;)V

    const v2, 0x68ce6c5b

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "reminders"

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 120
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda5;

    invoke-direct {v1, v0, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda5;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;)V

    const v2, 0x36edf21c

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "statistics"

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 121
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda6;

    invoke-direct {v1, v0, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda6;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;)V

    const v2, 0x50d77dd

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "tags"

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 122
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda7;

    invoke-direct {v1, v0, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda7;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;)V

    const v2, -0x2cd30262

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "settings"

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 125
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda8;

    invoke-direct {v1, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda8;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, -0x5eb37ca1

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "fajr_settings"

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 129
    new-instance v1, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda9;

    invoke-direct {v1, v13}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda9;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, 0x6f6c0920

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "about"

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 130
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38(Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/hisn/HisnViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 18
    .param p0, "$pagerState"    # Landroidx/compose/foundation/pager/PagerState;
    .param p1, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p2, "$navController"    # Landroidx/navigation/NavHostController;
    .param p3, "$hisnViewModel"    # Lcom/example/ui/hisn/HisnViewModel;
    .param p4, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p5, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p6, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p7, "it"    # Landroidx/navigation/NavBackStackEntry;
    .param p8, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p9, "$changed"    # I

    move-object/from16 v14, p8

    const-string v0, "$this$composable"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v2, p7

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CN(it)99@5450L747,99@5379L818:MainScreen.kt#2thlc2"

    invoke-static {v14, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v3, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:99)"

    const v4, 0x3c93f322

    move/from16 v5, p9

    invoke-static {v4, v5, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v5, p9

    .line 100
    :goto_0
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-static {v0, v3, v6, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v7, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda12;

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    invoke-direct/range {v7 .. v12}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda12;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/hisn/HisnViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    const/16 v3, 0x36

    const v4, -0x33a3f6bc    # -5.7681168E7f

    invoke-static {v4, v6, v7, v14, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lkotlin/jvm/functions/Function4;

    const/16 v16, 0xc00

    const/16 v17, 0x1ffc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v15, 0x30

    move-object v1, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v17}, Landroidx/compose/foundation/pager/PagerKt;->HorizontalPager-oI3XNZo(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 109
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/hisn/HisnViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/pager/PagerScope;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 15
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$navController"    # Landroidx/navigation/NavHostController;
    .param p2, "$hisnViewModel"    # Lcom/example/ui/hisn/HisnViewModel;
    .param p3, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p4, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p5, "$this$HorizontalPager"    # Landroidx/compose/foundation/pager/PagerScope;
    .param p6, "page"    # I
    .param p7, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p8, "$changed"    # I

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v5, p7

    const-string v2, "$this$HorizontalPager"

    move-object/from16 v8, p5

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "CN(page):MainScreen.kt#2thlc2"

    invoke-static {v5, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:100)"

    const v4, -0x33a3f6bc    # -5.7681168E7f

    move/from16 v9, p8

    invoke-static {v4, v9, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v9, p8

    .line 101
    :goto_0
    sget-object v2, Lcom/example/ui/screens/MainScreenKt;->oneUITabs:Ljava/util/List;

    move/from16 v10, p6

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/example/ui/oneui/BottomTab;

    invoke-virtual {v2}, Lcom/example/ui/oneui/BottomTab;->getRoute()Ljava/lang/String;

    move-result-object v2

    const-string v3, "fajr_settings"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const v2, 0x76543210

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v2, 0x0

    invoke-static {v1, v5, v2}, Lcom/example/ui/screens/MainScreenKt;->FajrTabScreen(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    goto/16 :goto_c

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x0

    const-string v6, "CC(remember):MainScreen.kt#9igjgp"

    sparse-switch v3, :sswitch_data_0

    move-object/from16 v14, p4

    goto/16 :goto_b

    :sswitch_0
    const-string v3, "azkar"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    move-object/from16 v14, p4

    goto/16 :goto_b

    .line 104
    :cond_2
    const v2, 0x257ef500

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "103@5840L24,103@5875L21,103@5805L92"

    invoke-static {v5, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v2, 0x257ef91c

    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\10":Z
    move-object/from16 v3, p7

    .local v3, "$this$cache\\10":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 246
    .local v4, "$i$f$cache\\10\\104":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\10":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 247
    .local v11, "$i$a$-let-ComposerKt$cache$1\\11\\246\\10":I
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v7, v12, :cond_3

    .line 248
    const/4 v12, 0x0

    .line 104
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$4\\12\\248\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda31;

    move-object/from16 v14, p4

    invoke-direct {v13, v14}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda31;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 248
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$4\\12\\248\\0":I
    nop

    .line 249
    .local v13, "value\\11":Ljava/lang/Object;
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 250
    move-object v7, v13

    .end local v13    # "value\\11":Ljava/lang/Object;
    goto :goto_1

    .line 251
    :cond_3
    move-object/from16 v14, p4

    .line 246
    .end local v7    # "it\\10":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\11\\246\\10":I
    :goto_1
    nop

    .line 104
    .end local v2    # "invalid\\10":Z
    .end local v3    # "$this$cache\\10":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\10\\104":I
    move-object v3, v7

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v2, 0x257efd79

    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\13":Z
    move-object/from16 v4, p7

    .local v4, "$this$cache\\13":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 246
    .local v6, "$i$f$cache\\13\\104":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\13":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 247
    .local v11, "$i$a$-let-ComposerKt$cache$1\\14\\246\\13":I
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v7, v12, :cond_4

    .line 248
    const/4 v12, 0x0

    .line 104
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$5\\15\\248\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda32;

    invoke-direct {v13, v1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda32;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 248
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$5\\15\\248\\0":I
    nop

    .line 249
    .local v13, "value\\14":Ljava/lang/Object;
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 250
    move-object v7, v13

    .end local v13    # "value\\14":Ljava/lang/Object;
    goto :goto_2

    .line 251
    :cond_4
    nop

    .line 246
    .end local v7    # "it\\13":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\14\\246\\13":I
    :goto_2
    nop

    .line 104
    .end local v2    # "invalid\\13":Z
    .end local v4    # "$this$cache\\13":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\13\\104":I
    move-object v4, v7

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/example/ui/screens/HomeScreenKt;->AzkarListScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_d

    .line 101
    :sswitch_1
    move-object/from16 v14, p4

    const-string v3, "home"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 102
    const v2, 0x257ed58b

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "101@5593L30,101@5634L21,101@5553L103"

    invoke-static {v5, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v2, 0x257eda42

    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid\\1":Z
    move-object/from16 v3, p7

    .local v3, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 234
    .local v4, "$i$f$cache\\1\\102":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\1":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 235
    .local v11, "$i$a$-let-ComposerKt$cache$1\\2\\234\\1":I
    if-nez v2, :cond_6

    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v7, v12, :cond_5

    goto :goto_3

    .line 239
    :cond_5
    goto :goto_4

    .line 236
    :cond_6
    :goto_3
    const/4 v12, 0x0

    .line 102
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$1\\3\\236\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda28;

    invoke-direct {v13, v0}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda28;-><init>(Landroidx/navigation/NavHostController;)V

    .line 236
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$1\\3\\236\\0":I
    nop

    .line 237
    .local v13, "value\\2":Ljava/lang/Object;
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 238
    move-object v7, v13

    .line 234
    .end local v7    # "it\\1":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\2\\234\\1":I
    .end local v13    # "value\\2":Ljava/lang/Object;
    :goto_4
    nop

    .line 102
    .end local v2    # "invalid\\1":Z
    .end local v3    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\102":I
    move-object v3, v7

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v2, 0x257edf59

    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\4":Z
    move-object/from16 v4, p7

    .local v4, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 234
    .local v6, "$i$f$cache\\4\\102":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\4":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 235
    .local v11, "$i$a$-let-ComposerKt$cache$1\\5\\234\\4":I
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v7, v12, :cond_7

    .line 236
    const/4 v12, 0x0

    .line 102
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$2\\6\\236\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda29;

    invoke-direct {v13, v1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda29;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 236
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$2\\6\\236\\0":I
    nop

    .line 237
    .local v13, "value\\5":Ljava/lang/Object;
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 238
    move-object v7, v13

    .end local v13    # "value\\5":Ljava/lang/Object;
    goto :goto_5

    .line 239
    :cond_7
    nop

    .line 234
    .end local v7    # "it\\4":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\5\\234\\4":I
    :goto_5
    nop

    .line 102
    .end local v2    # "invalid\\4":Z
    .end local v4    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\4\\102":I
    move-object v4, v7

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v6, 0x180

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/example/ui/screens/DashboardScreenKt;->DashboardScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_d

    .line 101
    :sswitch_2
    move-object/from16 v14, p4

    const-string v3, "hisn"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_b

    .line 105
    :cond_8
    const v2, 0x257f0577

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "104@5975L43,104@6029L21,104@5936L115"

    invoke-static {v5, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v2, 0x257f0a0f

    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid\\16":Z
    move-object/from16 v3, p7

    .local v3, "$this$cache\\16":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 252
    .local v4, "$i$f$cache\\16\\105":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\16":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 253
    .local v11, "$i$a$-let-ComposerKt$cache$1\\17\\252\\16":I
    if-nez v2, :cond_a

    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v7, v12, :cond_9

    goto :goto_6

    .line 257
    :cond_9
    goto :goto_7

    .line 254
    :cond_a
    :goto_6
    const/4 v12, 0x0

    .line 105
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$6\\18\\254\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda34;

    invoke-direct {v13, v0}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda34;-><init>(Landroidx/navigation/NavHostController;)V

    .line 254
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$6\\18\\254\\0":I
    nop

    .line 255
    .local v13, "value\\17":Ljava/lang/Object;
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 256
    move-object v7, v13

    .line 252
    .end local v7    # "it\\16":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\17\\252\\16":I
    .end local v13    # "value\\17":Ljava/lang/Object;
    :goto_7
    nop

    .line 105
    .end local v2    # "invalid\\16":Z
    .end local v3    # "$this$cache\\16":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\16\\105":I
    move-object v3, v7

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v2, 0x257f10b9

    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\19":Z
    move-object/from16 v4, p7

    .local v4, "$this$cache\\19":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 252
    .local v6, "$i$f$cache\\19\\105":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\19":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 253
    .local v11, "$i$a$-let-ComposerKt$cache$1\\20\\252\\19":I
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v7, v12, :cond_b

    .line 254
    const/4 v12, 0x0

    .line 105
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$7\\21\\254\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda35;

    invoke-direct {v13, v1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda35;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 254
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$7\\21\\254\\0":I
    nop

    .line 255
    .local v13, "value\\20":Ljava/lang/Object;
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 256
    move-object v7, v13

    .end local v13    # "value\\20":Ljava/lang/Object;
    goto :goto_8

    .line 257
    :cond_b
    nop

    .line 252
    .end local v7    # "it\\19":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\20\\252\\19":I
    :goto_8
    nop

    .line 105
    .end local v2    # "invalid\\19":Z
    .end local v4    # "$this$cache\\19":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\19\\105":I
    move-object v4, v7

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v6, 0x180

    const/4 v7, 0x0

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v7}, Lcom/example/ui/hisn/HisnScreensKt;->HisnListScreen(Lcom/example/ui/hisn/HisnViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_d

    .line 101
    :sswitch_3
    move-object/from16 v14, p4

    const-string v3, "prayer"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_b

    .line 103
    :cond_c
    const v2, 0x257ee9b5

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "102@5743L21,102@5716L49"

    invoke-static {v5, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v2, 0x257eecf9

    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\7":Z
    move-object/from16 v3, p7

    .local v3, "$this$cache\\7":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 240
    .local v6, "$i$f$cache\\7\\103":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\7":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 241
    .local v11, "$i$a$-let-ComposerKt$cache$1\\8\\240\\7":I
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v7, v12, :cond_d

    .line 242
    const/4 v12, 0x0

    .line 103
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$3\\9\\242\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda30;

    invoke-direct {v13, v1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda30;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 242
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$3\\9\\242\\0":I
    nop

    .line 243
    .local v13, "value\\8":Ljava/lang/Object;
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 244
    move-object v7, v13

    .end local v13    # "value\\8":Ljava/lang/Object;
    goto :goto_9

    .line 245
    :cond_d
    nop

    .line 240
    .end local v7    # "it\\7":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\8\\240\\7":I
    :goto_9
    nop

    .line 103
    .end local v2    # "invalid\\7":Z
    .end local v3    # "$this$cache\\7":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\7\\103":I
    check-cast v7, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v2, 0x6

    invoke-static {v7, v5, v2, v4}, Lcom/example/prayer/PrayerTimesScreenKt;->PrayerTimesScreen(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_d

    .line 101
    :sswitch_4
    move-object/from16 v14, p4

    const-string v3, "tasbeeh"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_b

    .line 106
    :cond_e
    const v2, 0x257f18dc

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "105@6127L21,105@6093L56"

    invoke-static {v5, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v2, 0x257f1cf9

    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\22":Z
    move-object/from16 v3, p7

    .local v3, "$this$cache\\22":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 258
    .local v6, "$i$f$cache\\22\\106":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\22":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 259
    .local v11, "$i$a$-let-ComposerKt$cache$1\\23\\258\\22":I
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v7, v12, :cond_f

    .line 260
    const/4 v12, 0x0

    .line 106
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$8\\24\\260\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda36;

    invoke-direct {v13, v1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda36;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 260
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$1$1$8\\24\\260\\0":I
    nop

    .line 261
    .local v13, "value\\23":Ljava/lang/Object;
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 262
    move-object v7, v13

    .end local v13    # "value\\23":Ljava/lang/Object;
    goto :goto_a

    .line 263
    :cond_f
    nop

    .line 258
    .end local v7    # "it\\22":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\23\\258\\22":I
    :goto_a
    nop

    .line 106
    .end local v2    # "invalid\\22":Z
    .end local v3    # "$this$cache\\22":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\22\\106":I
    check-cast v7, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v2, 0x30

    invoke-static {p0, v7, v5, v2, v4}, Lcom/example/ui/screens/TasbeehScreenKt;->TasbeehScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    goto :goto_c

    :cond_10
    :goto_b
    const v2, -0x75f84262

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 108
    :cond_11
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5ba46f34 -> :sswitch_4
        -0x3a6cd819 -> :sswitch_3
        0x30df1c -> :sswitch_2
        0x30f4df -> :sswitch_1
        0x58ffb03 -> :sswitch_0
    .end sparse-switch
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$22$lambda$21(Landroidx/navigation/NavHostController;Ljava/lang/String;)Lkotlin/Unit;
    .locals 7
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    move-object v1, p0

    check-cast v1, Landroidx/navigation/NavController;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    .end local p1    # "it":Ljava/lang/String;
    .local v2, "it":Ljava/lang/String;
    invoke-static/range {v1 .. v6}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$24$lambda$23(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1
    .param p0, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 102
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$26$lambda$25(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1
    .param p0, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 103
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$28$lambda$27(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1
    .param p0, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 104
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$4(Landroidx/compose/runtime/MutableState;Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$30$lambda$29(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1
    .param p0, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 104
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$32$lambda$31(Landroidx/navigation/NavHostController;Lcom/example/data/HisnChapter;)Lkotlin/Unit;
    .locals 7
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;
    .param p1, "it"    # Lcom/example/data/HisnChapter;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    move-object v1, p0

    check-cast v1, Landroidx/navigation/NavController;

    invoke-virtual {p1}, Lcom/example/data/HisnChapter;->getId()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hisn/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$34$lambda$33(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1
    .param p0, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 105
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$36$lambda$35(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1
    .param p0, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 106
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$39(Landroidx/navigation/NavArgumentBuilder;)Lkotlin/Unit;
    .locals 1
    .param p0, "$this$navArgument"    # Landroidx/navigation/NavArgumentBuilder;

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    sget-object v0, Landroidx/navigation/NavType;->IntType:Landroidx/navigation/NavType;

    invoke-virtual {p0, v0}, Landroidx/navigation/NavArgumentBuilder;->setType(Landroidx/navigation/NavType;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44(Lcom/example/ui/hisn/HisnViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 9
    .param p0, "$hisnViewModel"    # Lcom/example/ui/hisn/HisnViewModel;
    .param p1, "$navController"    # Landroidx/navigation/NavHostController;
    .param p2, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p3, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p4, "entry"    # Landroidx/navigation/NavBackStackEntry;
    .param p5, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p6, "$changed"    # I

    const-string v0, "$this$composable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entry"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CN(entry)113@6532L32,114@6607L85,110@6357L357:MainScreen.kt#2thlc2"

    invoke-static {p5, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:110)"

    const v2, -0x33709f27    # -7.5171528E7f

    invoke-static {v2, p6, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 112
    :cond_0
    invoke-virtual {p4}, Landroidx/navigation/NavBackStackEntry;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    move v1, v0

    .line 113
    nop

    .line 114
    const v0, -0x19c55787

    const-string v2, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {p5, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v3, p5

    .local v3, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 264
    .local v4, "$i$f$cache\\1\\114":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 265
    .local v6, "$i$a$-let-ComposerKt$cache$1\\2\\264\\1":I
    if-nez v0, :cond_3

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_2

    goto :goto_1

    .line 269
    :cond_2
    goto :goto_2

    .line 266
    :cond_3
    :goto_1
    const/4 v7, 0x0

    .line 114
    .local v7, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$3$1\\3\\266\\0":I
    new-instance v8, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda22;

    invoke-direct {v8, p1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda22;-><init>(Landroidx/navigation/NavHostController;)V

    .line 266
    .end local v7    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$3$1\\3\\266\\0":I
    nop

    .line 267
    .local v8, "value\\2":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 268
    move-object v5, v8

    .line 264
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\2\\264\\1":I
    .end local v8    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 114
    .end local v0    # "invalid\\1":Z
    .end local v3    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\114":I
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 115
    const v0, -0x19c54df2

    invoke-static {p5, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\4":Z
    move-object v2, p5

    .local v2, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 270
    .local v4, "$i$f$cache\\4\\115":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\4":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 271
    .local v6, "$i$a$-let-ComposerKt$cache$1\\5\\270\\4":I
    if-nez v0, :cond_5

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_4

    goto :goto_3

    .line 275
    :cond_4
    goto :goto_4

    .line 272
    :cond_5
    :goto_3
    const/4 v7, 0x0

    .line 115
    .local v7, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$3$2\\6\\272\\0":I
    new-instance v8, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda33;

    invoke-direct {v8, p2}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda33;-><init>(Lcom/example/ui/viewmodel/MainViewModel;)V

    .line 272
    .end local v7    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$3$2\\6\\272\\0":I
    nop

    .line 273
    .local v8, "value\\5":Ljava/lang/Object;
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 274
    move-object v5, v8

    .line 270
    .end local v5    # "it\\4":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\5\\270\\4":I
    .end local v8    # "value\\5":Ljava/lang/Object;
    :goto_4
    nop

    .line 115
    .end local v0    # "invalid\\4":Z
    .end local v2    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\4\\115":I
    move-object v4, v5

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-static {p5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 111
    const/4 v6, 0x0

    move-object v2, p0

    move-object v5, p5

    .end local p0    # "$hisnViewModel":Lcom/example/ui/hisn/HisnViewModel;
    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$hisnViewModel":Lcom/example/ui/hisn/HisnViewModel;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v6}, Lcom/example/ui/hisn/HisnScreensKt;->HisnChapterScreen(ILcom/example/ui/hisn/HisnViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 117
    :cond_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44$lambda$41$lambda$40(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 1
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 114
    invoke-virtual {p0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44$lambda$43$lambda$42(Lcom/example/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "content"    # Ljava/lang/String;

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    const-string v0, "09:00"

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/example/ui/viewmodel/MainViewModel;->addDhikrWithSchedule(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$47(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$navController"    # Landroidx/navigation/NavHostController;
    .param p2, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p3, "it"    # Landroidx/navigation/NavBackStackEntry;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    const-string v0, "$this$composable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CN(it)117@6802L32,117@6775L59:MainScreen.kt#2thlc2"

    invoke-static {p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:117)"

    const v2, -0x65511966

    invoke-static {v2, p5, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 118
    :cond_0
    const v0, -0x55705426

    const-string v1, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v1, p4

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 276
    .local v2, "$i$f$cache\\1\\118":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 277
    .local v4, "$i$a$-let-ComposerKt$cache$1\\2\\276\\1":I
    if-nez v0, :cond_2

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    goto :goto_0

    .line 281
    :cond_1
    goto :goto_1

    .line 278
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 118
    .local v5, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$4$1\\3\\278\\0":I
    new-instance v6, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda37;

    invoke-direct {v6, p1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda37;-><init>(Landroidx/navigation/NavHostController;)V

    .line 278
    .end local v5    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$4$1\\3\\278\\0":I
    nop

    .line 279
    .local v6, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 280
    move-object v3, v6

    .line 276
    .end local v3    # "it\\1":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1\\2\\276\\1":I
    .end local v6    # "value\\2":Ljava/lang/Object;
    :goto_1
    nop

    .line 118
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\1\\118":I
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v0, 0x0

    invoke-static {p0, v3, p4, v0}, Lcom/example/ui/screens/FavoritesScreenKt;->FavoritesScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$47$lambda$46$lambda$45(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 1
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 118
    invoke-virtual {p0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$50(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$navController"    # Landroidx/navigation/NavHostController;
    .param p2, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p3, "it"    # Landroidx/navigation/NavBackStackEntry;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    const-string v0, "$this$composable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CN(it)118@6906L32,118@6879L59:MainScreen.kt#2thlc2"

    invoke-static {p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:118)"

    const v2, 0x68ce6c5b

    invoke-static {v2, p5, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 119
    :cond_0
    const v0, 0x6ee4c55b

    const-string v1, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v1, p4

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 282
    .local v2, "$i$f$cache\\1\\119":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 283
    .local v4, "$i$a$-let-ComposerKt$cache$1\\2\\282\\1":I
    if-nez v0, :cond_2

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    goto :goto_0

    .line 287
    :cond_1
    goto :goto_1

    .line 284
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 119
    .local v5, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$5$1\\3\\284\\0":I
    new-instance v6, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda41;

    invoke-direct {v6, p1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda41;-><init>(Landroidx/navigation/NavHostController;)V

    .line 284
    .end local v5    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$5$1\\3\\284\\0":I
    nop

    .line 285
    .local v6, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 286
    move-object v3, v6

    .line 282
    .end local v3    # "it\\1":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1\\2\\282\\1":I
    .end local v6    # "value\\2":Ljava/lang/Object;
    :goto_1
    nop

    .line 119
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\1\\119":I
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v0, 0x0

    invoke-static {p0, v3, p4, v0}, Lcom/example/ui/screens/RemindersScreenKt;->RemindersScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$50$lambda$49$lambda$48(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 1
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 119
    invoke-virtual {p0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$53(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$navController"    # Landroidx/navigation/NavHostController;
    .param p2, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p3, "it"    # Landroidx/navigation/NavBackStackEntry;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    const-string v0, "$this$composable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CN(it)119@7012L32,119@6984L60:MainScreen.kt#2thlc2"

    invoke-static {p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:119)"

    const v2, 0x36edf21c

    invoke-static {v2, p5, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 120
    :cond_0
    const v0, 0x3339defc

    const-string v1, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v1, p4

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 288
    .local v2, "$i$f$cache\\1\\120":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 289
    .local v4, "$i$a$-let-ComposerKt$cache$1\\2\\288\\1":I
    if-nez v0, :cond_2

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    goto :goto_0

    .line 293
    :cond_1
    goto :goto_1

    .line 290
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 120
    .local v5, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$6$1\\3\\290\\0":I
    new-instance v6, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda10;

    invoke-direct {v6, p1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda10;-><init>(Landroidx/navigation/NavHostController;)V

    .line 290
    .end local v5    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$6$1\\3\\290\\0":I
    nop

    .line 291
    .local v6, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 292
    move-object v3, v6

    .line 288
    .end local v3    # "it\\1":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1\\2\\288\\1":I
    .end local v6    # "value\\2":Ljava/lang/Object;
    :goto_1
    nop

    .line 120
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\1\\120":I
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v0, 0x0

    invoke-static {p0, v3, p4, v0}, Lcom/example/ui/screens/StatisticsScreenKt;->StatisticsScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$53$lambda$52$lambda$51(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 1
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 120
    invoke-virtual {p0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$56(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$navController"    # Landroidx/navigation/NavHostController;
    .param p2, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p3, "it"    # Landroidx/navigation/NavBackStackEntry;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    const-string v0, "$this$composable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CN(it)120@7106L32,120@7084L54:MainScreen.kt#2thlc2"

    invoke-static {p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:120)"

    const v2, 0x50d77dd

    invoke-static {v2, p5, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 121
    :cond_0
    const v0, -0x8710843

    const-string v1, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v1, p4

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 294
    .local v2, "$i$f$cache\\1\\121":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 295
    .local v4, "$i$a$-let-ComposerKt$cache$1\\2\\294\\1":I
    if-nez v0, :cond_2

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    goto :goto_0

    .line 299
    :cond_1
    goto :goto_1

    .line 296
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 121
    .local v5, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$7$1\\3\\296\\0":I
    new-instance v6, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda45;

    invoke-direct {v6, p1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda45;-><init>(Landroidx/navigation/NavHostController;)V

    .line 296
    .end local v5    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$7$1\\3\\296\\0":I
    nop

    .line 297
    .local v6, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 298
    move-object v3, v6

    .line 294
    .end local v3    # "it\\1":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1\\2\\294\\1":I
    .end local v6    # "value\\2":Ljava/lang/Object;
    :goto_1
    nop

    .line 121
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\1\\121":I
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v0, 0x0

    invoke-static {p0, v3, p4, v0}, Lcom/example/ui/screens/TagsScreenKt;->TagsScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$56$lambda$55$lambda$54(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 1
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 121
    invoke-virtual {p0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 11
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$navController"    # Landroidx/navigation/NavHostController;
    .param p2, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p3, "it"    # Landroidx/navigation/NavBackStackEntry;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    move-object v3, p4

    const-string v0, "$this$composable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object v6, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CN(it)122@7237L32,122@7290L43,122@7202L132:MainScreen.kt#2thlc2"

    invoke-static {p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:122)"

    const v2, -0x2cd30262

    move/from16 v7, p5

    invoke-static {v2, v7, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v7, p5

    .line 123
    :goto_0
    const v0, -0x441beaa2

    const-string v1, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v2, p4

    .local v2, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 300
    .local v4, "$i$f$cache\\1\\123":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 301
    .local v8, "$i$a$-let-ComposerKt$cache$1\\2\\300\\1":I
    if-nez v0, :cond_2

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v5, v9, :cond_1

    goto :goto_1

    .line 305
    :cond_1
    goto :goto_2

    .line 302
    :cond_2
    :goto_1
    const/4 v9, 0x0

    .line 123
    .local v9, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$8$1\\3\\302\\0":I
    new-instance v10, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {v10, p1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda0;-><init>(Landroidx/navigation/NavHostController;)V

    .line 302
    .end local v9    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$8$1\\3\\302\\0":I
    nop

    .line 303
    .local v10, "value\\2":Ljava/lang/Object;
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 304
    move-object v5, v10

    .line 300
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1\\2\\300\\1":I
    .end local v10    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 123
    .end local v0    # "invalid\\1":Z
    .end local v2    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\123":I
    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-static {p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v0, -0x441be3f7

    invoke-static {p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\4":Z
    move-object v1, p4

    .local v1, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 300
    .local v2, "$i$f$cache\\4\\123":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\4":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 301
    .local v8, "$i$a$-let-ComposerKt$cache$1\\5\\300\\4":I
    if-nez v0, :cond_4

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v4, v9, :cond_3

    goto :goto_3

    .line 305
    :cond_3
    goto :goto_4

    .line 302
    :cond_4
    :goto_3
    const/4 v9, 0x0

    .line 123
    .local v9, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$8$2\\6\\302\\0":I
    new-instance v10, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda11;

    invoke-direct {v10, p1}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda11;-><init>(Landroidx/navigation/NavHostController;)V

    .line 302
    .end local v9    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$8$2\\6\\302\\0":I
    nop

    .line 303
    .local v10, "value\\5":Ljava/lang/Object;
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 304
    move-object v4, v10

    .line 300
    .end local v4    # "it\\4":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1\\5\\300\\4":I
    .end local v10    # "value\\5":Ljava/lang/Object;
    :goto_4
    nop

    .line 123
    .end local v0    # "invalid\\4":Z
    .end local v1    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\4\\123":I
    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v4, 0x0

    move-object v1, v5

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/SettingsScreenKt;->SettingsScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 124
    :cond_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61$lambda$58$lambda$57(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 1
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 123
    invoke-virtual {p0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61$lambda$60$lambda$59(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 6
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 123
    move-object v0, p0

    check-cast v0, Landroidx/navigation/NavController;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, "fajr_settings"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$64(Landroidx/navigation/NavHostController;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 17
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;
    .param p1, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p2, "it"    # Landroidx/navigation/NavBackStackEntry;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "$this$composable"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "CN(it)125@7454L11,126@7529L32,126@7486L76:MainScreen.kt#2thlc2"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v5, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:125)"

    const v6, -0x5eb37ca1

    move/from16 v7, p4

    invoke-static {v6, v7, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v7, p4

    .line 126
    :goto_0
    const/4 v2, 0x0

    move v5, v2

    .local v5, "$changed\\1":I
    move-object/from16 v13, p3

    .local v13, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 306
    .local v6, "$i$f$viewModel\\1\\126":I
    const v8, 0x671a9c9b

    const-string v9, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67"

    invoke-static {v13, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 307
    sget-object v8, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    const/4 v9, 0x6

    invoke-virtual {v8, v13, v9}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 310
    .local v9, "viewModelStoreOwner\\1":Landroidx/lifecycle/ViewModelStoreOwner;
    const/4 v10, 0x0

    .line 311
    .local v10, "key\\1":Ljava/lang/String;
    const/4 v11, 0x0

    .line 313
    .local v11, "factory\\1":Landroidx/lifecycle/ViewModelProvider$Factory;
    instance-of v8, v9, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    if-eqz v8, :cond_1

    .line 314
    move-object v8, v9

    check-cast v8, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    invoke-interface {v8}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v8

    move-object v12, v8

    goto :goto_1

    .line 316
    :cond_1
    sget-object v8, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    check-cast v8, Landroidx/lifecycle/viewmodel/CreationExtras;

    move-object v12, v8

    :goto_1
    nop

    .local v12, "extras\\1":Landroidx/lifecycle/viewmodel/CreationExtras;
    const-class v8, Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    .line 306
    shl-int/lit8 v14, v5, 0x3

    and-int/lit8 v14, v14, 0x70

    shl-int/lit8 v15, v5, 0x3

    and-int/lit16 v15, v15, 0x380

    or-int/2addr v14, v15

    shl-int/lit8 v15, v5, 0x3

    and-int/lit16 v15, v15, 0x1c00

    or-int/2addr v14, v15

    const v15, 0xe000

    shl-int/lit8 v16, v5, 0x3

    and-int v15, v16, v15

    or-int/2addr v14, v15

    const/4 v15, 0x0

    invoke-static/range {v8 .. v15}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Lkotlin/reflect/KClass;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    move-result-object v8

    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 126
    .end local v5    # "$changed\\1":I
    .end local v6    # "$i$f$viewModel\\1\\126":I
    .end local v9    # "viewModelStoreOwner\\1":Landroidx/lifecycle/ViewModelStoreOwner;
    .end local v10    # "key\\1":Ljava/lang/String;
    .end local v11    # "factory\\1":Landroidx/lifecycle/ViewModelProvider$Factory;
    .end local v12    # "extras\\1":Landroidx/lifecycle/viewmodel/CreationExtras;
    .end local v13    # "$composer\\1":Landroidx/compose/runtime/Composer;
    move-object v5, v8

    check-cast v5, Lcom/example/fajr/ui/FajrViewModel;

    .line 127
    .local v5, "fajrViewModel":Lcom/example/fajr/ui/FajrViewModel;
    const v6, -0x7fc6c7c1

    const-string v8, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {v1, v6, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .local v6, "invalid\\3":Z
    move-object/from16 v8, p3

    .local v8, "$this$cache\\3":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 317
    .local v9, "$i$f$cache\\3\\127":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .local v10, "it\\3":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 318
    .local v11, "$i$a$-let-ComposerKt$cache$1\\4\\317\\3":I
    if-nez v6, :cond_3

    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v10, v12, :cond_2

    goto :goto_2

    .line 322
    :cond_2
    goto :goto_3

    .line 319
    :cond_3
    :goto_2
    const/4 v12, 0x0

    .line 127
    .local v12, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$9$1\\5\\319\\0":I
    new-instance v13, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda43;

    invoke-direct {v13, v0}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda43;-><init>(Landroidx/navigation/NavHostController;)V

    .line 319
    .end local v12    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$9$1\\5\\319\\0":I
    nop

    .line 320
    .local v13, "value\\4":Ljava/lang/Object;
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 321
    move-object v10, v13

    .line 317
    .end local v10    # "it\\3":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1\\4\\317\\3":I
    .end local v13    # "value\\4":Ljava/lang/Object;
    :goto_3
    nop

    .line 127
    .end local v6    # "invalid\\3":Z
    .end local v8    # "$this$cache\\3":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache\\3\\127":I
    check-cast v10, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v5, v10, v1, v2, v2}, Lcom/example/fajr/ui/FajrSettingsScreenKt;->FajrSettingsScreen(Lcom/example/fajr/ui/FajrViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 128
    :cond_4
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 307
    .local v5, "$changed\\1":I
    .local v6, "$i$f$viewModel\\1\\126":I
    .local v13, "$composer\\1":Landroidx/compose/runtime/Composer;
    :cond_5
    const/4 v2, 0x0

    .line 308
    .local v2, "$i$a$-checkNotNull-ViewModelKt__ViewModelKt$viewModel$1\\2\\307\\1":I
    nop

    .line 307
    .end local v2    # "$i$a$-checkNotNull-ViewModelKt__ViewModelKt$viewModel$1\\2\\307\\1":I
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v8, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v2, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$64$lambda$63$lambda$62(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 1
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 127
    invoke-virtual {p0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$67(Landroidx/navigation/NavHostController;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;
    .param p1, "$this$composable"    # Landroidx/compose/animation/AnimatedContentScope;
    .param p2, "it"    # Landroidx/navigation/NavBackStackEntry;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CN(it)128@7631L32,128@7619L44:MainScreen.kt#2thlc2"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:128)"

    const v2, 0x6f6c0920

    invoke-static {v2, p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 129
    :cond_0
    const v0, 0x448e4300    # 1138.0938f

    const-string v1, "CC(remember):MainScreen.kt#9igjgp"

    invoke-static {p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v1, p3

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 323
    .local v2, "$i$f$cache\\1\\129":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 324
    .local v4, "$i$a$-let-ComposerKt$cache$1\\2\\323\\1":I
    if-nez v0, :cond_2

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    goto :goto_0

    .line 328
    :cond_1
    goto :goto_1

    .line 325
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 129
    .local v5, "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$10$1\\3\\325\\0":I
    new-instance v6, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda42;

    invoke-direct {v6, p0}, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda42;-><init>(Landroidx/navigation/NavHostController;)V

    .line 325
    .end local v5    # "$i$a$-cache-MainScreenKt$MainScreen$1$1$5$1$10$1\\3\\325\\0":I
    nop

    .line 326
    .local v6, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 327
    move-object v3, v6

    .line 323
    .end local v3    # "it\\1":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1\\2\\323\\1":I
    .end local v6    # "value\\2":Ljava/lang/Object;
    :goto_1
    nop

    .line 129
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\1\\129":I
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v0, 0x0

    invoke-static {v3, p3, v0}, Lcom/example/ui/screens/AboutScreenKt;->AboutScreen(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$67$lambda$66$lambda$65(Landroidx/navigation/NavHostController;)Lkotlin/Unit;
    .locals 1
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;

    .line 129
    invoke-virtual {p0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$71$lambda$70(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/oneui/BottomTab;)Lkotlin/Unit;
    .locals 9
    .param p0, "$scope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p1, "$pagerState"    # Landroidx/compose/foundation/pager/PagerState;
    .param p2, "tab"    # Lcom/example/ui/oneui/BottomTab;

    const-string v0, "tab"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    sget-object v0, Lcom/example/ui/screens/MainScreenKt;->oneUITabs:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 137
    .local v0, "i":I
    if-ltz v0, :cond_0

    new-instance v1, Lcom/example/ui/screens/MainScreenKt$MainScreen$1$1$6$1$1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lcom/example/ui/screens/MainScreenKt$MainScreen$1$1$6$1$1;-><init>(Landroidx/compose/foundation/pager/PagerState;ILkotlin/coroutines/Continuation;)V

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    .end local p0    # "$scope":Lkotlinx/coroutines/CoroutineScope;
    .local v3, "$scope":Lkotlinx/coroutines/CoroutineScope;
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    goto :goto_0

    .end local v3    # "$scope":Lkotlinx/coroutines/CoroutineScope;
    .restart local p0    # "$scope":Lkotlinx/coroutines/CoroutineScope;
    :cond_0
    move-object v3, p0

    .line 138
    .end local p0    # "$scope":Lkotlinx/coroutines/CoroutineScope;
    .restart local v3    # "$scope":Lkotlinx/coroutines/CoroutineScope;
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$73$lambda$72(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 7
    .param p0, "$navController"    # Landroidx/navigation/NavHostController;
    .param p1, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p2, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V

    .line 148
    move-object v1, p0

    check-cast v1, Landroidx/navigation/NavController;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p2

    .end local p2    # "it":Ljava/lang/String;
    .local v2, "it":Ljava/lang/String;
    invoke-static/range {v1 .. v6}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 149
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p2
.end method

.method static final MainScreen$lambda$88$lambda$76$lambda$75$lambda$74(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1
    .param p0, "$drawerOpen$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 150
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$78$lambda$77(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1
    .param p0, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 164
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$4(Landroidx/compose/runtime/MutableState;Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$80$lambda$79(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lkotlin/Unit;
    .locals 1
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$showAddDialog$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "content"    # Ljava/lang/String;
    .param p4, "times"    # Ljava/util/List;
    .param p5, "tagIds"    # Ljava/util/List;

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "times"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tagIds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    invoke-virtual {p0, p2, p3, p4, p5}, Lcom/example/ui/viewmodel/MainViewModel;->addDhikrWithScheduleAndTags(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 167
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$4(Landroidx/compose/runtime/MutableState;Z)V

    .line 168
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$82$lambda$81(Lcom/example/ui/viewmodel/MainViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 7
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    .end local p0    # "$viewModel":Lcom/example/ui/viewmodel/MainViewModel;
    .end local p1    # "it":Ljava/lang/String;
    .local v1, "$viewModel":Lcom/example/ui/viewmodel/MainViewModel;
    .local v2, "it":Ljava/lang/String;
    invoke-static/range {v1 .. v6}, Lcom/example/ui/viewmodel/MainViewModel;->addTag$default(Lcom/example/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final MainScreen$lambda$88$lambda$87$lambda$84$lambda$83(Lcom/example/ui/viewmodel/MainViewModel;)Lkotlin/Unit;
    .locals 1
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;

    .line 175
    invoke-virtual {p0}, Lcom/example/ui/viewmodel/MainViewModel;->clearSelectedDhikrFromNotification()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$88$lambda$87$lambda$86$lambda$85(Lcom/example/ui/viewmodel/MainViewModel;Lcom/example/data/Dhikr;)Lkotlin/Unit;
    .locals 1
    .param p0, "$viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "$dhikr"    # Lcom/example/data/Dhikr;

    .line 176
    invoke-virtual {p1}, Lcom/example/data/Dhikr;->getId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/example/ui/viewmodel/MainViewModel;->markAsRead(I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$89(Lcom/example/ui/viewmodel/MainViewModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p1, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p2, v0}, Lcom/example/ui/screens/MainScreenKt;->MainScreen(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MainScreen$lambda$9$lambda$8()I
    .locals 1

    .line 78
    sget-object v0, Lcom/example/ui/screens/MainScreenKt;->oneUITabs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public static final getOneUIDrawerItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/ui/oneui/OneUIDrawerItem;",
            ">;"
        }
    .end annotation

    .line 59
    sget-object v0, Lcom/example/ui/screens/MainScreenKt;->oneUIDrawerItems:Ljava/util/List;

    return-object v0
.end method

.method public static final getOneUITabs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/ui/oneui/BottomTab;",
            ">;"
        }
    .end annotation

    .line 51
    sget-object v0, Lcom/example/ui/screens/MainScreenKt;->oneUITabs:Ljava/util/List;

    return-object v0
.end method
