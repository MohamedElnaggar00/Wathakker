.class final Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AppDatabase.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1;->onCreate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDatabase.kt\ncom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1869#2,2:110\n*S KotlinDebug\n*F\n+ 1 AppDatabase.kt\ncom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1\n*L\n94#1:110,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.data.AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1"
    f = "AppDatabase.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x55,
        0x5e
    }
    m = "invokeSuspend"
    n = {
        "dao\\1",
        "defaultAdhkar\\1",
        "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$1\\1\\52\\0",
        "tagDao\\2",
        "$this$forEach\\3",
        "defaultTags\\2",
        "element\\3",
        "it\\4",
        "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0",
        "$i$f$forEach\\3\\94",
        "$i$a$-forEach-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2$1\\4\\110\\2"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "I$0",
        "I$1",
        "I$2"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;

    invoke-direct {v0, p2}, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 50
    iget v2, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    packed-switch v2, :pswitch_data_0

    .end local p0    # "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    :pswitch_0
    iget v2, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->I$2:I

    .local v2, "$i$a$-forEach-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2$1\\4\\110\\2":I
    iget v3, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->I$1:I

    .local v3, "$i$f$forEach\\3\\94":I
    iget v4, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->I$0:I

    .local v4, "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0":I
    iget-object v5, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lcom/example/data/Tag;

    .local v5, "it\\4":Lcom/example/data/Tag;
    iget-object v7, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$4:Ljava/lang/Object;

    .local v7, "element\\3":Ljava/lang/Object;
    iget-object v8, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    .local v9, "defaultTags\\2":Ljava/util/List;
    iget-object v10, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    .local v10, "$this$forEach\\3":Ljava/lang/Iterable;
    iget-object v11, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/example/data/TagDao;

    .local v11, "tagDao\\2":Lcom/example/data/TagDao;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v12, v5

    move-object v13, v11

    move v5, v4

    move-object v11, v10

    move v4, v3

    move-object v10, v9

    move-object/from16 v3, p1

    move-object v9, v8

    move-object v8, v7

    move-object v7, v1

    goto/16 :goto_2

    .end local v2    # "$i$a$-forEach-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2$1\\4\\110\\2":I
    .end local v3    # "$i$f$forEach\\3\\94":I
    .end local v4    # "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0":I
    .end local v5    # "it\\4":Lcom/example/data/Tag;
    .end local v7    # "element\\3":Ljava/lang/Object;
    .end local v9    # "defaultTags\\2":Ljava/util/List;
    .end local v10    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v11    # "tagDao\\2":Lcom/example/data/TagDao;
    :pswitch_1
    iget v2, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->I$0:I

    .local v2, "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$1\\1\\52\\0":I
    iget-object v8, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    .local v8, "defaultAdhkar\\1":Ljava/util/List;
    iget-object v9, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/example/data/DhikrDao;

    .local v9, "dao\\1":Lcom/example/data/DhikrDao;
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 96
    .end local v2    # "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$1\\1\\52\\0":I
    .end local v8    # "defaultAdhkar\\1":Ljava/util/List;
    .end local v9    # "dao\\1":Lcom/example/data/DhikrDao;
    :catch_0
    move-exception v0

    move-object/from16 v2, p1

    move-object v5, v1

    goto/16 :goto_3

    .line 50
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    nop

    .line 52
    :try_start_2
    invoke-static {}, Lcom/example/data/AppDatabase;->access$getINSTANCE$cp()Lcom/example/data/AppDatabase;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v2, :cond_1

    :try_start_3
    invoke-virtual {v2}, Lcom/example/data/AppDatabase;->dhikrDao()Lcom/example/data/DhikrDao;

    move-result-object v2

    if-eqz v2, :cond_1

    move-object v9, v2

    .restart local v9    # "dao\\1":Lcom/example/data/DhikrDao;
    const/4 v2, 0x0

    .line 54
    .restart local v2    # "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$1\\1\\52\\0":I
    const/4 v8, 0x5

    new-array v8, v8, [Lcom/example/data/Dhikr;

    new-instance v10, Lcom/example/data/Dhikr;

    .line 55
    const-string v12, "\u0633\u0624\u0627\u0644 \u0627\u0644\u0639\u0641\u0648 \u0648\u0627\u0644\u0639\u0627\u0641\u064a\u0629"

    .line 56
    const-string v13, "\u0627\u0644\u0644\u0647\u0645 \u0625\u0646\u0643 \u0639\u0641\u0648 \u062a\u062d\u0628 \u0627\u0644\u0639\u0641\u0648 \u0641\u0627\u0639\u0641 \u0639\u0646\u064a"

    .line 54
    nop

    .line 57
    const-string v11, "10:00"

    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    .line 58
    nop

    .line 54
    const/16 v20, 0xc9

    const/16 v21, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    invoke-direct/range {v10 .. v21}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v10, v8, v5

    .line 60
    new-instance v11, Lcom/example/data/Dhikr;

    .line 61
    const-string v13, "\u0627\u0644\u062b\u0628\u0627\u062a \u0639\u0644\u0649 \u0627\u0644\u062f\u064a\u0646"

    .line 62
    const-string v14, "\u064a\u0627 \u0645\u0642\u0644\u0628 \u0627\u0644\u0642\u0644\u0648\u0628 \u062b\u0628\u062a \u0642\u0644\u0628\u064a \u0639\u0644\u0649 \u062f\u064a\u0646\u0643"

    .line 60
    nop

    .line 63
    const-string v10, "14:00"

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    .line 64
    nop

    .line 60
    const/16 v21, 0xc9

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    invoke-direct/range {v11 .. v22}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v11, v8, v7

    .line 54
    nop

    .line 66
    new-instance v12, Lcom/example/data/Dhikr;

    .line 67
    const-string v14, "\u062e\u064a\u0631 \u0627\u0644\u062f\u0646\u064a\u0627 \u0648\u0627\u0644\u0622\u062e\u0631\u0629"

    .line 68
    const-string v15, "\u0627\u0644\u0644\u0647\u0645 \u0622\u062a\u0646\u0627 \u0641\u064a \u0627\u0644\u062f\u0646\u064a\u0627 \u062d\u0633\u0646\u0629 \u0648\u0641\u064a \u0627\u0644\u0622\u062e\u0631\u0629 \u062d\u0633\u0646\u0629 \u0648\u0642\u0646\u0627 \u0639\u0630\u0627\u0628 \u0627\u0644\u0646\u0627\u0631"

    .line 66
    nop

    .line 69
    const-string v10, "18:00"

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    .line 70
    nop

    .line 66
    const/16 v22, 0xc9

    const/16 v23, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    invoke-direct/range {v12 .. v23}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v12, v8, v6

    .line 54
    nop

    .line 72
    new-instance v13, Lcom/example/data/Dhikr;

    .line 73
    const-string v15, "\u0633\u0624\u0627\u0644 \u0627\u0644\u0647\u062f\u0649 \u0648\u0627\u0644\u062a\u0642\u0649"

    .line 74
    const-string v16, "\u0627\u0644\u0644\u0647\u0645 \u0625\u0646\u064a \u0623\u0633\u0623\u0644\u0643 \u0627\u0644\u0647\u062f\u0649 \u0648\u0627\u0644\u062a\u0642\u0649 \u0648\u0627\u0644\u0639\u0641\u0627\u0641 \u0648\u0627\u0644\u063a\u0646\u0649"

    .line 72
    nop

    .line 75
    const-string v10, "08:00"

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    .line 76
    nop

    .line 72
    const/16 v23, 0xc9

    const/16 v24, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    invoke-direct/range {v13 .. v24}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v13, v8, v3

    .line 54
    nop

    .line 78
    new-instance v14, Lcom/example/data/Dhikr;

    .line 79
    const-string v16, "\u0627\u0644\u0625\u0639\u0627\u0646\u0629 \u0639\u0644\u0649 \u0627\u0644\u0630\u0643\u0631"

    .line 80
    const-string v17, "\u0627\u0644\u0644\u0647\u0645 \u0623\u0639\u0646\u064a \u0639\u0644\u0649 \u0630\u0643\u0631\u0643 \u0648\u0634\u0643\u0631\u0643 \u0648\u062d\u0633\u0646 \u0639\u0628\u0627\u062f\u062a\u0643"

    .line 78
    nop

    .line 81
    const-string v10, "20:00"

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    .line 82
    nop

    .line 78
    const/16 v24, 0xc9

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    invoke-direct/range {v14 .. v25}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v14, v8, v4

    .line 54
    nop

    .line 53
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 85
    .restart local v8    # "defaultAdhkar\\1":Ljava/util/List;
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$1:Ljava/lang/Object;

    iput v2, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->I$0:I

    iput v7, v1, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->label:I

    invoke-interface {v9, v8, v1}, Lcom/example/data/DhikrDao;->insertAll(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-ne v10, v0, :cond_0

    .line 50
    return-object v0

    .line 86
    :cond_0
    :goto_0
    nop

    .line 52
    .end local v2    # "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$1\\1\\52\\0":I
    .end local v8    # "defaultAdhkar\\1":Ljava/util/List;
    .end local v9    # "dao\\1":Lcom/example/data/DhikrDao;
    :cond_1
    nop

    .line 87
    :try_start_4
    invoke-static {}, Lcom/example/data/AppDatabase;->access$getINSTANCE$cp()Lcom/example/data/AppDatabase;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/example/data/AppDatabase;->tagDao()Lcom/example/data/TagDao;

    move-result-object v2

    if-eqz v2, :cond_4

    .local v2, "tagDao\\2":Lcom/example/data/TagDao;
    const/4 v8, 0x0

    .line 89
    .local v8, "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0":I
    new-array v4, v4, [Lcom/example/data/Tag;

    new-instance v9, Lcom/example/data/Tag;

    const-string v12, "\u0623\u0630\u0643\u0627\u0631 \u0627\u0644\u0635\u0628\u0627\u062d"

    const-string v13, "#008080"

    const/4 v14, 0x1

    const/4 v15, 0x0

    const-wide/16 v10, 0x0

    invoke-direct/range {v9 .. v15}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v9, v4, v5

    .line 90
    new-instance v10, Lcom/example/data/Tag;

    const-string v13, "\u0623\u0630\u0643\u0627\u0631 \u0627\u0644\u0645\u0633\u0627\u0621"

    const-string v14, "#800080"

    const/4 v15, 0x1

    const/16 v16, 0x0

    const-wide/16 v11, 0x0

    invoke-direct/range {v10 .. v16}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v10, v4, v7

    .line 89
    nop

    .line 91
    new-instance v11, Lcom/example/data/Tag;

    const-string v14, "\u0623\u0630\u0643\u0627\u0631 \u0627\u0644\u0646\u0648\u0645"

    const-string v15, "#1E3A8A"

    const/16 v16, 0x1

    const/16 v17, 0x0

    const-wide/16 v12, 0x0

    invoke-direct/range {v11 .. v17}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v11, v4, v6

    .line 89
    nop

    .line 92
    new-instance v12, Lcom/example/data/Tag;

    const-string v15, "\u0623\u062f\u0639\u064a\u0629 \u0639\u0627\u0645\u0629"

    const-string v16, "#059669"

    const/16 v17, 0x1

    const/16 v18, 0x0

    const-wide/16 v13, 0x0

    invoke-direct/range {v12 .. v18}, Lcom/example/data/Tag;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v12, v4, v3

    .line 89
    nop

    .line 88
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 94
    .local v3, "defaultTags\\2":Ljava/util/List;
    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 110
    .local v5, "$i$f$forEach\\3\\94":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    move-object v11, v2

    move-object v9, v3

    move-object v10, v4

    move v3, v5

    move v4, v8

    move-object/from16 v2, p1

    move-object v5, v1

    move-object v8, v7

    .end local v8    # "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0":I
    .end local p0    # "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v2, "$result":Ljava/lang/Object;
    .local v3, "$i$f$forEach\\3\\94":I
    .local v4, "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0":I
    .local v5, "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    .local v9, "defaultTags\\2":Ljava/util/List;
    .restart local v10    # "$this$forEach\\3":Ljava/lang/Iterable;
    .restart local v11    # "tagDao\\2":Lcom/example/data/TagDao;
    :goto_1
    :try_start_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .restart local v7    # "element\\3":Ljava/lang/Object;
    move-object v12, v7

    check-cast v12, Lcom/example/data/Tag;

    .local v12, "it\\4":Lcom/example/data/Tag;
    const/4 v13, 0x0

    .line 94
    .local v13, "$i$a$-forEach-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2$1\\4\\110\\2":I
    iput-object v11, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$0:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$3:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$4:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->L$5:Ljava/lang/Object;

    iput v4, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->I$0:I

    iput v3, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->I$1:I

    iput v13, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->I$2:I

    iput v6, v5, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;->label:I

    invoke-interface {v11, v12, v5}, Lcom/example/data/TagDao;->insertTag(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v14
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    if-ne v14, v0, :cond_2

    .line 50
    return-object v0

    .line 94
    :cond_2
    move/from16 v26, v3

    move-object v3, v2

    move v2, v13

    move-object v13, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v5

    move v5, v4

    move/from16 v4, v26

    .end local v9    # "defaultTags\\2":Ljava/util/List;
    .local v2, "$i$a$-forEach-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2$1\\4\\110\\2":I
    .local v3, "$result":Ljava/lang/Object;
    .local v4, "$i$f$forEach\\3\\94":I
    .local v5, "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0":I
    .local v7, "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    .local v8, "element\\3":Ljava/lang/Object;
    .local v10, "defaultTags\\2":Ljava/util/List;
    .local v11, "$this$forEach\\3":Ljava/lang/Iterable;
    .local v13, "tagDao\\2":Lcom/example/data/TagDao;
    :goto_2
    nop

    .line 110
    .end local v2    # "$i$a$-forEach-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2$1\\4\\110\\2":I
    .end local v8    # "element\\3":Ljava/lang/Object;
    .end local v12    # "it\\4":Lcom/example/data/Tag;
    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v7

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v13

    goto :goto_1

    .line 111
    .end local v7    # "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    .end local v13    # "tagDao\\2":Lcom/example/data/TagDao;
    .local v2, "$result":Ljava/lang/Object;
    .local v3, "$i$f$forEach\\3\\94":I
    .local v4, "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0":I
    .local v5, "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    .restart local v9    # "defaultTags\\2":Ljava/util/List;
    .local v10, "$this$forEach\\3":Ljava/lang/Iterable;
    .local v11, "tagDao\\2":Lcom/example/data/TagDao;
    :cond_3
    nop

    .line 95
    .end local v3    # "$i$f$forEach\\3\\94":I
    .end local v10    # "$this$forEach\\3":Ljava/lang/Iterable;
    nop

    .line 87
    .end local v4    # "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0":I
    .end local v9    # "defaultTags\\2":Ljava/util/List;
    .end local v11    # "tagDao\\2":Lcom/example/data/TagDao;
    goto :goto_4

    .line 96
    :catch_1
    move-exception v0

    goto :goto_3

    .line 87
    .end local v2    # "$result":Ljava/lang/Object;
    .end local v5    # "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_4
    move-object/from16 v2, p1

    move-object v5, v1

    goto :goto_4

    .line 96
    :catch_2
    move-exception v0

    move-object/from16 v2, p1

    move-object v5, v1

    .line 97
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "e":Ljava/lang/Exception;
    .restart local v2    # "$result":Ljava/lang/Object;
    .restart local v5    # "this":Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 99
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
