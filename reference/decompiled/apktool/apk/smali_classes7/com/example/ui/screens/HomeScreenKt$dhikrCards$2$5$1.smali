.class final Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$5$1;
.super Ljava/lang/Object;
.source "HomeScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
.field final synthetic $dhikr:Lcom/example/data/Dhikr;

.field final synthetic $onDelete:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/example/data/Dhikr;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Dhikr;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/example/data/Dhikr;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/example/data/Dhikr;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$5$1;->$onDelete:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$5$1;->$dhikr:Lcom/example/data/Dhikr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 189
    invoke-virtual {p0}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$5$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 189
    iget-object v0, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$5$1;->$onDelete:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$5$1;->$dhikr:Lcom/example/data/Dhikr;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
