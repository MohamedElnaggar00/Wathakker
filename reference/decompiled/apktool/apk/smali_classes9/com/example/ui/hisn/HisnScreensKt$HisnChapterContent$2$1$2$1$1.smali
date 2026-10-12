.class final Lcom/example/ui/hisn/HisnScreensKt$HisnChapterContent$2$1$2$1$1;
.super Ljava/lang/Object;
.source "HisnScreens.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/hisn/HisnScreensKt;->HisnChapterContent(Lcom/example/data/HisnChapter;Ljava/util/List;ZLjava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $item:Lcom/example/data/HisnItem;

.field final synthetic $onToggleItemFavorite:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/example/data/HisnItem;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/HisnItem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/example/data/HisnItem;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/example/data/HisnItem;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/hisn/HisnScreensKt$HisnChapterContent$2$1$2$1$1;->$onToggleItemFavorite:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/hisn/HisnScreensKt$HisnChapterContent$2$1$2$1$1;->$item:Lcom/example/data/HisnItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 177
    invoke-virtual {p0}, Lcom/example/ui/hisn/HisnScreensKt$HisnChapterContent$2$1$2$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 177
    iget-object v0, p0, Lcom/example/ui/hisn/HisnScreensKt$HisnChapterContent$2$1$2$1$1;->$onToggleItemFavorite:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/example/ui/hisn/HisnScreensKt$HisnChapterContent$2$1$2$1$1;->$item:Lcom/example/data/HisnItem;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
