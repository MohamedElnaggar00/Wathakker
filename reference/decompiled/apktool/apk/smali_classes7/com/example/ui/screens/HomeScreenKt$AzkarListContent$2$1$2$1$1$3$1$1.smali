.class final Lcom/example/ui/screens/HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1;
.super Ljava/lang/Object;
.source "HomeScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/HomeScreenKt;->AzkarListContent(Ljava/util/List;ILjava/util/List;Ljava/util/Map;Lcom/example/data/Tag;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V
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
.field final synthetic $onSelectTag:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/example/data/Tag;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sel:Z

.field final synthetic $tag:Lcom/example/data/Tag;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;ZLcom/example/data/Tag;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/example/data/Tag;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lcom/example/data/Tag;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1;->$onSelectTag:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lcom/example/ui/screens/HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1;->$sel:Z

    iput-object p3, p0, Lcom/example/ui/screens/HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1;->$tag:Lcom/example/data/Tag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 150
    invoke-virtual {p0}, Lcom/example/ui/screens/HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/example/ui/screens/HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1;->$onSelectTag:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lcom/example/ui/screens/HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1;->$sel:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/example/ui/screens/HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1;->$tag:Lcom/example/data/Tag;

    :goto_0
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
