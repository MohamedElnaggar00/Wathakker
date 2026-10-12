.class public final synthetic Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/foundation/layout/ColumnScope;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$5:Ljava/util/List;

.field public final synthetic f$6:Ljava/util/List;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/layout/ColumnScope;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$0:Landroidx/compose/foundation/layout/ColumnScope;

    iput-object p2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$4:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$5:Ljava/util/List;

    iput-object p7, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$6:Ljava/util/List;

    iput-object p8, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$7:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$0:Landroidx/compose/foundation/layout/ColumnScope;

    iget-object v1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$4:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$5:Ljava/util/List;

    iget-object v6, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$6:Ljava/util/List;

    iget-object v7, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$7:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda12;->f$8:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/example/ui/screens/DialogsKt;->DhikrAddForm$lambda$54(Landroidx/compose/foundation/layout/ColumnScope;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
