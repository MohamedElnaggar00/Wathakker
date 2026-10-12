.class public final synthetic Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:I

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;->f$0:Ljava/lang/String;

    iput p2, p0, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;->f$1:I

    iput p3, p0, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;->f$0:Ljava/lang/String;

    iget v1, p0, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;->f$1:I

    iget v2, p0, Lcom/example/data/HisnDao_Impl$$ExternalSyntheticLambda6;->f$2:I

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, p1}, Lcom/example/data/HisnDao_Impl;->removeFavorite$lambda$11(Ljava/lang/String;IILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
