.class public final Lcom/example/data/HisnImporter;
.super Ljava/lang/Object;
.source "HisnImporter.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHisnImporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HisnImporter.kt\ncom/example/data/HisnImporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/example/data/HisnImporter;",
        "",
        "<init>",
        "()V",
        "ensureImported",
        "",
        "context",
        "Landroid/content/Context;",
        "dao",
        "Lcom/example/data/HisnDao;",
        "(Landroid/content/Context;Lcom/example/data/HisnDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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

.field public static final INSTANCE:Lcom/example/data/HisnImporter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/example/data/HisnImporter;

    invoke-direct {v0}, Lcom/example/data/HisnImporter;-><init>()V

    sput-object v0, Lcom/example/data/HisnImporter;->INSTANCE:Lcom/example/data/HisnImporter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ensureImported(Landroid/content/Context;Lcom/example/data/HisnDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 31
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "dao"    # Lcom/example/data/HisnDao;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/example/data/HisnDao;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/example/data/HisnImporter$ensureImported$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/example/data/HisnImporter$ensureImported$1;

    iget v3, v2, Lcom/example/data/HisnImporter$ensureImported$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v3, v2, Lcom/example/data/HisnImporter$ensureImported$1;->label:I

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/example/data/HisnImporter$ensureImported$1;->label:I

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/example/data/HisnImporter$ensureImported$1;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1}, Lcom/example/data/HisnImporter$ensureImported$1;-><init>(Lcom/example/data/HisnImporter;Lkotlin/coroutines/Continuation;)V

    .local v2, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v4, v2, Lcom/example/data/HisnImporter$ensureImported$1;->result:Ljava/lang/Object;

    .local v4, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 8
    iget v6, v2, Lcom/example/data/HisnImporter$ensureImported$1;->label:I

    const-string v7, "getString(...)"

    const-string v8, "order"

    const-string v9, "id"

    const/4 v11, 0x1

    packed-switch v6, :pswitch_data_0

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "$result":Ljava/lang/Object;
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v4    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v5, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lorg/json/JSONArray;

    .local v5, "items":Lorg/json/JSONArray;
    iget-object v6, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$4:Ljava/lang/Object;

    check-cast v6, Lorg/json/JSONArray;

    .local v6, "chapters":Lorg/json/JSONArray;
    iget-object v7, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lorg/json/JSONObject;

    .local v7, "root":Lorg/json/JSONObject;
    iget-object v8, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .local v8, "text":Ljava/lang/String;
    iget-object v9, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$1:Ljava/lang/Object;

    move-object v0, v9

    check-cast v0, Lcom/example/data/HisnDao;

    .end local p2    # "dao":Lcom/example/data/HisnDao;
    .local v0, "dao":Lcom/example/data/HisnDao;
    iget-object v9, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$0:Ljava/lang/Object;

    check-cast v9, Landroid/content/Context;

    .end local p1    # "context":Landroid/content/Context;
    .local v9, "context":Landroid/content/Context;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v19, v4

    goto/16 :goto_6

    .end local v0    # "dao":Lcom/example/data/HisnDao;
    .end local v5    # "items":Lorg/json/JSONArray;
    .end local v6    # "chapters":Lorg/json/JSONArray;
    .end local v7    # "root":Lorg/json/JSONObject;
    .end local v8    # "text":Ljava/lang/String;
    .end local v9    # "context":Landroid/content/Context;
    .restart local p1    # "context":Landroid/content/Context;
    .restart local p2    # "dao":Lcom/example/data/HisnDao;
    :pswitch_1
    iget-object v6, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$5:Ljava/lang/Object;

    check-cast v6, Lorg/json/JSONArray;

    .local v6, "items":Lorg/json/JSONArray;
    iget-object v12, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$4:Ljava/lang/Object;

    check-cast v12, Lorg/json/JSONArray;

    .local v12, "chapters":Lorg/json/JSONArray;
    iget-object v13, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$3:Ljava/lang/Object;

    check-cast v13, Lorg/json/JSONObject;

    .local v13, "root":Lorg/json/JSONObject;
    iget-object v14, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$2:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    .local v14, "text":Ljava/lang/String;
    iget-object v15, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$1:Ljava/lang/Object;

    move-object v0, v15

    check-cast v0, Lcom/example/data/HisnDao;

    .end local p2    # "dao":Lcom/example/data/HisnDao;
    .restart local v0    # "dao":Lcom/example/data/HisnDao;
    iget-object v15, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$0:Ljava/lang/Object;

    check-cast v15, Landroid/content/Context;

    .end local p1    # "context":Landroid/content/Context;
    .local v15, "context":Landroid/content/Context;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v19, v4

    move-object/from16 v20, v15

    move-object v15, v14

    move-object v14, v6

    move-object v6, v12

    goto/16 :goto_4

    .end local v0    # "dao":Lcom/example/data/HisnDao;
    .end local v6    # "items":Lorg/json/JSONArray;
    .end local v12    # "chapters":Lorg/json/JSONArray;
    .end local v13    # "root":Lorg/json/JSONObject;
    .end local v14    # "text":Ljava/lang/String;
    .end local v15    # "context":Landroid/content/Context;
    .restart local p1    # "context":Landroid/content/Context;
    .restart local p2    # "dao":Lcom/example/data/HisnDao;
    :pswitch_2
    iget-object v6, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$1:Ljava/lang/Object;

    move-object v0, v6

    check-cast v0, Lcom/example/data/HisnDao;

    .end local p2    # "dao":Lcom/example/data/HisnDao;
    .restart local v0    # "dao":Lcom/example/data/HisnDao;
    iget-object v6, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$0:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    .end local p1    # "context":Landroid/content/Context;
    .local v6, "context":Landroid/content/Context;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v12, v0

    move-object v0, v4

    goto :goto_1

    .end local v0    # "dao":Lcom/example/data/HisnDao;
    .end local v6    # "context":Landroid/content/Context;
    .restart local p1    # "context":Landroid/content/Context;
    .restart local p2    # "dao":Lcom/example/data/HisnDao;
    :pswitch_3
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    move-object/from16 v6, p1

    iput-object v6, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$0:Ljava/lang/Object;

    iput-object v0, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$1:Ljava/lang/Object;

    iput v11, v2, Lcom/example/data/HisnImporter$ensureImported$1;->label:I

    invoke-interface {v0, v2}, Lcom/example/data/HisnDao;->chapterCount(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v5, :cond_1

    .line 8
    return-object v5

    .line 9
    :cond_1
    move-object/from16 v30, v12

    move-object v12, v0

    move-object/from16 v0, v30

    .end local p1    # "context":Landroid/content/Context;
    .end local p2    # "dao":Lcom/example/data/HisnDao;
    .restart local v6    # "context":Landroid/content/Context;
    .local v12, "dao":Lcom/example/data/HisnDao;
    :goto_1
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lez v0, :cond_2

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 10
    :cond_2
    invoke-virtual {v6}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v13, "hisn_elmoslem.json"

    invoke-virtual {v0, v13}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    const-string v13, "open(...)"

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v14, Ljava/io/InputStreamReader;

    invoke-direct {v14, v0, v13}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    check-cast v14, Ljava/io/Reader;

    instance-of v0, v14, Ljava/io/BufferedReader;

    if-eqz v0, :cond_3

    check-cast v14, Ljava/io/BufferedReader;

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/io/BufferedReader;

    const/16 v13, 0x2000

    invoke-direct {v0, v14, v13}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v14, v0

    :goto_2
    check-cast v14, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v14

    check-cast v0, Ljava/io/BufferedReader;

    .line 34
    .local v0, "it\\1":Ljava/io/BufferedReader;
    const/4 v13, 0x0

    .line 10
    .local v13, "$i$a$-use-HisnImporter$ensureImported$text$1\\1\\10\\0":I
    move-object v15, v0

    check-cast v15, Ljava/io/Reader;

    invoke-static {v15}, Lkotlin/io/TextStreamsKt;->readText(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "it\\1":Ljava/io/BufferedReader;
    .end local v13    # "$i$a$-use-HisnImporter$ensureImported$text$1\\1\\10\\0":I
    const/4 v0, 0x0

    invoke-static {v14, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 11
    .local v15, "text":Ljava/lang/String;
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v15}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    .local v0, "root":Lorg/json/JSONObject;
    const-string v13, "chapters"

    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v13

    .line 13
    .local v13, "chapters":Lorg/json/JSONArray;
    const-string v14, "items"

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v14

    .line 14
    .local v14, "items":Lorg/json/JSONArray;
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    move-result v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 p1, v0

    const/4 v0, 0x0

    .end local v0    # "root":Lorg/json/JSONObject;
    .local p1, "root":Lorg/json/JSONObject;
    :goto_3
    if-ge v0, v10, :cond_4

    move/from16 p2, v0

    .local p2, "i\\2":I
    const/16 v17, 0x0

    .line 15
    .local v17, "$i$a$-List-HisnImporter$ensureImported$2\\2\\14\\0":I
    move/from16 v18, v0

    .end local p2    # "i\\2":I
    .local v0, "i\\2":I
    invoke-virtual {v13, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 16
    .local v1, "o\\2":Lorg/json/JSONObject;
    nop

    .end local v0    # "i\\2":I
    .restart local p2    # "i\\2":I
    new-instance v0, Lcom/example/data/HisnChapter;

    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v19, v4

    .end local v4    # "$result":Ljava/lang/Object;
    .local v19, "$result":Ljava/lang/Object;
    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v20, v6

    .end local v6    # "context":Landroid/content/Context;
    .local v20, "context":Landroid/content/Context;
    const-string v6, "name"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v3, v4, v6}, Lcom/example/data/HisnChapter;-><init>(IILjava/lang/String;)V

    .line 14
    .end local v1    # "o\\2":Lorg/json/JSONObject;
    .end local v17    # "$i$a$-List-HisnImporter$ensureImported$2\\2\\14\\0":I
    .end local p2    # "i\\2":I
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v18, 0x1

    move-object/from16 v3, p0

    move-object/from16 v1, p3

    move-object/from16 v4, v19

    move-object/from16 v6, v20

    goto :goto_3

    .end local v19    # "$result":Ljava/lang/Object;
    .end local v20    # "context":Landroid/content/Context;
    .restart local v4    # "$result":Ljava/lang/Object;
    .restart local v6    # "context":Landroid/content/Context;
    :cond_4
    move-object/from16 v19, v4

    move-object/from16 v20, v6

    .end local v4    # "$result":Ljava/lang/Object;
    .end local v6    # "context":Landroid/content/Context;
    .restart local v19    # "$result":Ljava/lang/Object;
    .restart local v20    # "context":Landroid/content/Context;
    check-cast v11, Ljava/util/List;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$0:Ljava/lang/Object;

    iput-object v12, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$1:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$2:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$3:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$4:Ljava/lang/Object;

    iput-object v14, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$5:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v2, Lcom/example/data/HisnImporter$ensureImported$1;->label:I

    invoke-interface {v12, v11, v2}, Lcom/example/data/HisnDao;->insertChapters(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_5

    .line 8
    return-object v5

    .line 14
    :cond_5
    move-object v0, v12

    move-object v6, v13

    move-object/from16 v13, p1

    .line 18
    .end local v12    # "dao":Lcom/example/data/HisnDao;
    .end local p1    # "root":Lorg/json/JSONObject;
    .local v0, "dao":Lcom/example/data/HisnDao;
    .local v6, "chapters":Lorg/json/JSONArray;
    .local v13, "root":Lorg/json/JSONObject;
    :goto_4
    invoke-virtual {v14}, Lorg/json/JSONArray;->length()I

    move-result v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v1, :cond_6

    move v4, v10

    .local v4, "i\\3":I
    const/4 v11, 0x0

    .line 19
    .local v11, "$i$a$-List-HisnImporter$ensureImported$3\\3\\18\\0":I
    invoke-virtual {v14, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    .line 20
    .local v12, "o\\3":Lorg/json/JSONObject;
    new-instance v21, Lcom/example/data/HisnItem;

    .line 21
    invoke-virtual {v12, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 22
    move/from16 p1, v1

    const-string v1, "chapterId"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v23

    .line 23
    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v24

    .line 24
    const-string v1, "text"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    move-object/from16 v25, v1

    const-string v1, "count"

    move/from16 p2, v4

    const/4 v4, 0x1

    .end local v4    # "i\\3":I
    .local p2, "i\\3":I
    invoke-virtual {v12, v1, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v26

    .line 26
    const-string v1, "fadl"

    const-string v4, ""

    invoke-virtual {v12, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v16, v6

    .end local v6    # "chapters":Lorg/json/JSONArray;
    .local v16, "chapters":Lorg/json/JSONArray;
    const-string v6, "optString(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    move-object/from16 v27, v1

    const-string v1, "source"

    invoke-virtual {v12, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    move-object/from16 v28, v1

    const-string v1, "hokm"

    invoke-virtual {v12, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    move-object/from16 v29, v1

    invoke-direct/range {v21 .. v29}, Lcom/example/data/HisnItem;-><init>(IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    move-object/from16 v1, v21

    .line 18
    .end local v11    # "$i$a$-List-HisnImporter$ensureImported$3\\3\\18\\0":I
    .end local v12    # "o\\3":Lorg/json/JSONObject;
    .end local p2    # "i\\3":I
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    move/from16 v1, p1

    move-object/from16 v6, v16

    goto :goto_5

    .end local v16    # "chapters":Lorg/json/JSONArray;
    .restart local v6    # "chapters":Lorg/json/JSONArray;
    :cond_6
    move-object/from16 v16, v6

    .end local v6    # "chapters":Lorg/json/JSONArray;
    .restart local v16    # "chapters":Lorg/json/JSONArray;
    check-cast v3, Ljava/util/List;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$1:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$2:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$3:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$4:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v2, Lcom/example/data/HisnImporter$ensureImported$1;->L$5:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v2, Lcom/example/data/HisnImporter$ensureImported$1;->label:I

    invoke-interface {v0, v3, v2}, Lcom/example/data/HisnDao;->insertItems(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_7

    .line 8
    return-object v5

    .line 18
    :cond_7
    move-object v7, v13

    move-object v5, v14

    move-object v8, v15

    move-object/from16 v6, v16

    move-object/from16 v9, v20

    .line 31
    .end local v13    # "root":Lorg/json/JSONObject;
    .end local v14    # "items":Lorg/json/JSONArray;
    .end local v15    # "text":Ljava/lang/String;
    .end local v16    # "chapters":Lorg/json/JSONArray;
    .end local v20    # "context":Landroid/content/Context;
    .restart local v5    # "items":Lorg/json/JSONArray;
    .restart local v6    # "chapters":Lorg/json/JSONArray;
    .restart local v7    # "root":Lorg/json/JSONObject;
    .restart local v8    # "text":Ljava/lang/String;
    .restart local v9    # "context":Landroid/content/Context;
    :goto_6
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 10
    .end local v0    # "dao":Lcom/example/data/HisnDao;
    .end local v5    # "items":Lorg/json/JSONArray;
    .end local v7    # "root":Lorg/json/JSONObject;
    .end local v8    # "text":Ljava/lang/String;
    .end local v9    # "context":Landroid/content/Context;
    .end local v19    # "$result":Ljava/lang/Object;
    .local v4, "$result":Ljava/lang/Object;
    .local v6, "context":Landroid/content/Context;
    .local v12, "dao":Lcom/example/data/HisnDao;
    :catchall_0
    move-exception v0

    move-object/from16 v19, v4

    move-object/from16 v20, v6

    move-object v1, v0

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "$result":Ljava/lang/Object;
    .end local v6    # "context":Landroid/content/Context;
    .end local v12    # "dao":Lcom/example/data/HisnDao;
    .end local p3    # "$completion":Lkotlin/coroutines/Continuation;
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v12    # "dao":Lcom/example/data/HisnDao;
    .restart local v19    # "$result":Ljava/lang/Object;
    .restart local v20    # "context":Landroid/content/Context;
    .restart local p3    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_1
    move-exception v0

    invoke-static {v14, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
