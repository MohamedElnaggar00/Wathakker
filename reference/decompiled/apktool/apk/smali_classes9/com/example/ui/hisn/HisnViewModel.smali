.class public final Lcom/example/ui/hisn/HisnViewModel;
.super Landroidx/lifecycle/AndroidViewModel;
.source "HisnViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHisnViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HisnViewModel.kt\ncom/example/ui/hisn/HisnViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,67:1\n49#2:68\n51#2:72\n49#2:73\n51#2:77\n46#3:69\n51#3:71\n46#3:74\n51#3:76\n105#4:70\n105#4:75\n*S KotlinDebug\n*F\n+ 1 HisnViewModel.kt\ncom/example/ui/hisn/HisnViewModel\n*L\n38#1:68\n38#1:72\n42#1:73\n42#1:77\n38#1:69\n38#1:71\n42#1:74\n42#1:76\n38#1:70\n42#1:75\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$J\u0016\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$2\u0006\u0010/\u001a\u00020$J\u0018\u00100\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$2\u0006\u0010/\u001a\u00020$H\u0002J\u000e\u00101\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0011R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u001c0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0011R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001c0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0011R#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0011R\u001d\u0010&\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\'0\u001c0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0011R\u001d\u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0*0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u0011\u00a8\u00062"
    }
    d2 = {
        "Lcom/example/ui/hisn/HisnViewModel;",
        "Landroidx/lifecycle/AndroidViewModel;",
        "application",
        "Landroid/app/Application;",
        "<init>",
        "(Landroid/app/Application;)V",
        "dao",
        "Lcom/example/data/HisnDao;",
        "today",
        "",
        "getToday",
        "()Ljava/lang/String;",
        "_query",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "query",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getQuery",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "setQuery",
        "",
        "q",
        "_onlyFavorites",
        "",
        "onlyFavorites",
        "getOnlyFavorites",
        "setOnlyFavorites",
        "v",
        "chapters",
        "",
        "Lcom/example/data/HisnChapter;",
        "getChapters",
        "allItems",
        "Lcom/example/data/HisnItem;",
        "getAllItems",
        "itemCounts",
        "",
        "",
        "getItemCounts",
        "favorites",
        "Lcom/example/data/HisnFavorite;",
        "getFavorites",
        "readToday",
        "",
        "getReadToday",
        "toggleChapterFavorite",
        "chapterId",
        "toggleItemFavorite",
        "itemId",
        "toggle",
        "markChapterRead",
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
.field private final _onlyFavorites:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _query:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final allItems:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private final chapters:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnChapter;",
            ">;>;"
        }
    .end annotation
.end field

.field private final dao:Lcom/example/data/HisnDao;

.field private final favorites:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnFavorite;",
            ">;>;"
        }
    .end annotation
.end field

.field private final itemCounts:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private final onlyFavorites:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final query:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final readToday:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/ui/hisn/HisnViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 13
    .param p1, "application"    # Landroid/app/Application;

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0, p1}, Landroidx/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 22
    sget-object v0, Lcom/example/data/AppDatabase;->Companion:Lcom/example/data/AppDatabase$Companion;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/example/data/AppDatabase$Companion;->getDatabase(Landroid/content/Context;)Lcom/example/data/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/example/data/AppDatabase;->hisnDao()Lcom/example/data/HisnDao;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->dao:Lcom/example/data/HisnDao;

    .line 26
    const-string v0, ""

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->_query:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 27
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->_query:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->query:Lkotlinx/coroutines/flow/StateFlow;

    .line 30
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->_onlyFavorites:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 31
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->_onlyFavorites:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->onlyFavorites:Lkotlinx/coroutines/flow/StateFlow;

    .line 35
    nop

    .line 34
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->dao:Lcom/example/data/HisnDao;

    invoke-interface {v0}, Lcom/example/data/HisnDao;->chapters()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 35
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    sget-object v2, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-wide/16 v3, 0x1388

    const-wide/16 v5, 0x0

    invoke-static/range {v2 .. v8}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->chapters:Lkotlinx/coroutines/flow/StateFlow;

    .line 37
    nop

    .line 36
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->dao:Lcom/example/data/HisnDao;

    invoke-interface {v0}, Lcom/example/data/HisnDao;->allItems()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 37
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    sget-object v2, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    const-wide/16 v3, 0x1388

    invoke-static/range {v2 .. v8}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->allItems:Lkotlinx/coroutines/flow/StateFlow;

    .line 39
    nop

    .line 38
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->dao:Lcom/example/data/HisnDao;

    invoke-interface {v0}, Lcom/example/data/HisnDao;->itemCounts()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .local v0, "$this$map\\1":Lkotlinx/coroutines/flow/Flow;
    const/4 v1, 0x0

    .line 68
    .local v1, "$i$f$map\\1\\38":I
    move-object v2, v0

    .local v2, "$this$unsafeTransform\\2":Lkotlinx/coroutines/flow/Flow;
    const/4 v3, 0x0

    .line 69
    .local v3, "$i$f$unsafeTransform\\2\\68":I
    const/4 v4, 0x0

    .line 70
    .local v4, "$i$f$unsafeFlow\\3\\69":I
    new-instance v5, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1;

    invoke-direct {v5, v2}, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v5, Lkotlinx/coroutines/flow/Flow;

    .line 71
    .end local v4    # "$i$f$unsafeFlow\\3\\69":I
    nop

    .line 72
    .end local v2    # "$this$unsafeTransform\\2":Lkotlinx/coroutines/flow/Flow;
    .end local v3    # "$i$f$unsafeTransform\\2\\68":I
    nop

    .line 39
    .end local v0    # "$this$map\\1":Lkotlinx/coroutines/flow/Flow;
    .end local v1    # "$i$f$map\\1\\38":I
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    sget-object v6, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-wide/16 v7, 0x1388

    const-wide/16 v9, 0x0

    invoke-static/range {v6 .. v12}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    invoke-static {v5, v0, v1, v2}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->itemCounts:Lkotlinx/coroutines/flow/StateFlow;

    .line 41
    nop

    .line 40
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->dao:Lcom/example/data/HisnDao;

    invoke-interface {v0}, Lcom/example/data/HisnDao;->favorites()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 41
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    sget-object v2, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-wide/16 v3, 0x1388

    const-wide/16 v5, 0x0

    invoke-static/range {v2 .. v8}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->favorites:Lkotlinx/coroutines/flow/StateFlow;

    .line 43
    nop

    .line 42
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->dao:Lcom/example/data/HisnDao;

    invoke-direct {p0}, Lcom/example/ui/hisn/HisnViewModel;->getToday()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/example/data/HisnDao;->chaptersReadOn(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .local v0, "$this$map\\4":Lkotlinx/coroutines/flow/Flow;
    const/4 v1, 0x0

    .line 73
    .local v1, "$i$f$map\\4\\42":I
    move-object v2, v0

    .local v2, "$this$unsafeTransform\\5":Lkotlinx/coroutines/flow/Flow;
    const/4 v3, 0x0

    .line 74
    .local v3, "$i$f$unsafeTransform\\5\\73":I
    const/4 v4, 0x0

    .line 75
    .local v4, "$i$f$unsafeFlow\\6\\74":I
    new-instance v5, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$2;

    invoke-direct {v5, v2}, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$2;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v5, Lkotlinx/coroutines/flow/Flow;

    .line 76
    .end local v4    # "$i$f$unsafeFlow\\6\\74":I
    nop

    .line 77
    .end local v2    # "$this$unsafeTransform\\5":Lkotlinx/coroutines/flow/Flow;
    .end local v3    # "$i$f$unsafeTransform\\5\\73":I
    nop

    .line 43
    .end local v0    # "$this$map\\4":Lkotlinx/coroutines/flow/Flow;
    .end local v1    # "$i$f$map\\4\\42":I
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    sget-object v6, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    const-wide/16 v7, 0x1388

    invoke-static/range {v6 .. v12}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v1

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v2

    invoke-static {v5, v0, v1, v2}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->readToday:Lkotlinx/coroutines/flow/StateFlow;

    .line 45
    nop

    .line 46
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/example/ui/hisn/HisnViewModel$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Lcom/example/ui/hisn/HisnViewModel$1;-><init>(Lcom/example/ui/hisn/HisnViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 49
    nop

    .line 21
    return-void
.end method

.method public static final synthetic access$getDao$p(Lcom/example/ui/hisn/HisnViewModel;)Lcom/example/data/HisnDao;
    .locals 1
    .param p0, "$this"    # Lcom/example/ui/hisn/HisnViewModel;

    .line 21
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->dao:Lcom/example/data/HisnDao;

    return-object v0
.end method

.method public static final synthetic access$getToday(Lcom/example/ui/hisn/HisnViewModel;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/example/ui/hisn/HisnViewModel;

    .line 21
    invoke-direct {p0}, Lcom/example/ui/hisn/HisnViewModel;->getToday()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getToday()Ljava/lang/String;
    .locals 3

    .line 24
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final toggle(II)V
    .locals 7
    .param p1, "chapterId"    # I
    .param p2, "itemId"    # I

    .line 55
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, p2, v3}, Lcom/example/ui/hisn/HisnViewModel$toggle$1;-><init>(Lcom/example/ui/hisn/HisnViewModel;IILkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 59
    return-void
.end method


# virtual methods
.method public final getAllItems()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnItem;",
            ">;>;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->allItems:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getChapters()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnChapter;",
            ">;>;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->chapters:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getFavorites()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/example/data/HisnFavorite;",
            ">;>;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->favorites:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getItemCounts()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->itemCounts:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getOnlyFavorites()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->onlyFavorites:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getQuery()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->query:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getReadToday()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->readToday:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final markChapterRead(I)V
    .locals 7
    .param p1, "chapterId"    # I

    .line 62
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;-><init>(Lcom/example/ui/hisn/HisnViewModel;ILkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 65
    return-void
.end method

.method public final setOnlyFavorites(Z)V
    .locals 2
    .param p1, "v"    # Z

    .line 32
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->_onlyFavorites:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setQuery(Ljava/lang/String;)V
    .locals 1
    .param p1, "q"    # Ljava/lang/String;

    const-string v0, "q"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lcom/example/ui/hisn/HisnViewModel;->_query:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final toggleChapterFavorite(I)V
    .locals 1
    .param p1, "chapterId"    # I

    .line 51
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/example/ui/hisn/HisnViewModel;->toggle(II)V

    return-void
.end method

.method public final toggleItemFavorite(II)V
    .locals 0
    .param p1, "chapterId"    # I
    .param p2, "itemId"    # I

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/example/ui/hisn/HisnViewModel;->toggle(II)V

    return-void
.end method
