.class final Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$6$1$1;
.super Ljava/lang/Object;
.source "HomeScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/HomeScreenKt;->dhikrCards(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/example/data/Tag;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/example/data/Tag;",
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
.field final synthetic $f:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/example/data/Tag;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedTag:Lcom/example/data/Tag;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Tag;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/example/data/Tag;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/example/data/Tag;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$6$1$1;->$f:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$6$1$1;->$selectedTag:Lcom/example/data/Tag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 190
    move-object v0, p1

    check-cast v0, Lcom/example/data/Tag;

    invoke-virtual {p0, v0}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$6$1$1;->invoke(Lcom/example/data/Tag;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Lcom/example/data/Tag;)V
    .locals 7
    .param p1, "tag"    # Lcom/example/data/Tag;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$6$1$1;->$f:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$6$1$1;->$selectedTag:Lcom/example/data/Tag;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/example/data/Tag;->getTagId()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/example/data/Tag;->getTagId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
