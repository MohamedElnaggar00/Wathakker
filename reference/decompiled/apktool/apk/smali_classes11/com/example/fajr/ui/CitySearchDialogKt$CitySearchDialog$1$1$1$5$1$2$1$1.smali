.class final Lcom/example/fajr/ui/CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1;
.super Ljava/lang/Object;
.source "CitySearchDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/fajr/ui/CitySearchDialogKt;->CitySearchDialog(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $city:Lcom/example/fajr/data/CityItem;

.field final synthetic $onCitySelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/example/fajr/data/CityItem;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDismiss:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/example/fajr/data/CityItem;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/example/fajr/data/CityItem;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/example/fajr/data/CityItem;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/fajr/ui/CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1;->$onCitySelected:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/fajr/ui/CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1;->$city:Lcom/example/fajr/data/CityItem;

    iput-object p3, p0, Lcom/example/fajr/ui/CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1;->$onDismiss:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 108
    invoke-virtual {p0}, Lcom/example/fajr/ui/CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/example/fajr/ui/CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1;->$onCitySelected:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/example/fajr/ui/CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1;->$city:Lcom/example/fajr/data/CityItem;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    iget-object v0, p0, Lcom/example/fajr/ui/CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1;->$onDismiss:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 111
    return-void
.end method
