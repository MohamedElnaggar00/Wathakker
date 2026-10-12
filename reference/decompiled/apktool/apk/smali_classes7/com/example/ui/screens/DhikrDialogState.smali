.class public final Lcom/example/ui/screens/DhikrDialogState;
.super Ljava/lang/Object;
.source "HomeScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeScreen.kt\ncom/example/ui/screens/DhikrDialogState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,281:1\n85#2:282\n117#2,2:283\n85#2:285\n117#2,2:286\n*S KotlinDebug\n*F\n+ 1 HomeScreen.kt\ncom/example/ui/screens/DhikrDialogState\n*L\n35#1:282\n35#1:283,2\n36#1:285\n36#1:286,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR/\u0010\r\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u000e\u0010\u0008\"\u0004\u0008\u000f\u0010\n\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/example/ui/screens/DhikrDialogState;",
        "",
        "<init>",
        "()V",
        "<set-?>",
        "Lcom/example/data/Dhikr;",
        "times",
        "getTimes",
        "()Lcom/example/data/Dhikr;",
        "setTimes",
        "(Lcom/example/data/Dhikr;)V",
        "times$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "edit",
        "getEdit",
        "setEdit",
        "edit$delegate",
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
.field private final edit$delegate:Landroidx/compose/runtime/MutableState;

.field private final times$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Lcom/example/ui/screens/DhikrDialogState;->times$delegate:Landroidx/compose/runtime/MutableState;

    .line 36
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Lcom/example/ui/screens/DhikrDialogState;->edit$delegate:Landroidx/compose/runtime/MutableState;

    .line 34
    return-void
.end method


# virtual methods
.method public final getEdit()Lcom/example/data/Dhikr;
    .locals 4

    .line 36
    iget-object v0, p0, Lcom/example/ui/screens/DhikrDialogState;->edit$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 285
    .local v3, "$i$f$getValue\\1\\36":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\36":I
    check-cast v0, Lcom/example/data/Dhikr;

    .line 36
    return-object v0
.end method

.method public final getTimes()Lcom/example/data/Dhikr;
    .locals 4

    .line 35
    iget-object v0, p0, Lcom/example/ui/screens/DhikrDialogState;->times$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 282
    .local v3, "$i$f$getValue\\1\\35":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\35":I
    check-cast v0, Lcom/example/data/Dhikr;

    .line 35
    return-object v0
.end method

.method public final setEdit(Lcom/example/data/Dhikr;)V
    .locals 5
    .param p1, "<set-?>"    # Lcom/example/data/Dhikr;

    .line 36
    iget-object v0, p0, Lcom/example/ui/screens/DhikrDialogState;->edit$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 286
    .local v4, "$i$f$setValue\\1\\36":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 287
    nop

    .line 36
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\36":I
    return-void
.end method

.method public final setTimes(Lcom/example/data/Dhikr;)V
    .locals 5
    .param p1, "<set-?>"    # Lcom/example/data/Dhikr;

    .line 35
    iget-object v0, p0, Lcom/example/ui/screens/DhikrDialogState;->times$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 283
    .local v4, "$i$f$setValue\\1\\35":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 284
    nop

    .line 35
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\35":I
    return-void
.end method
