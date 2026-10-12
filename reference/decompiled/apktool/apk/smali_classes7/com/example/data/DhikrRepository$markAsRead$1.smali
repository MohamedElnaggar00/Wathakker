.class final Lcom/example/data/DhikrRepository$markAsRead$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "DhikrRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/data/DhikrRepository;->markAsRead(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.data.DhikrRepository"
    f = "DhikrRepository.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x1f,
        0x20
    }
    m = "markAsRead"
    n = {
        "sdf",
        "dateStr",
        "id",
        "now",
        "sdf",
        "dateStr",
        "id",
        "now"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "J$0",
        "L$0",
        "L$1",
        "I$0",
        "J$0"
    }
.end annotation


# instance fields
.field I$0:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/example/data/DhikrRepository;


# direct methods
.method constructor <init>(Lcom/example/data/DhikrRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/DhikrRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/DhikrRepository$markAsRead$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/data/DhikrRepository$markAsRead$1;->this$0:Lcom/example/data/DhikrRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lcom/example/data/DhikrRepository$markAsRead$1;->result:Ljava/lang/Object;

    iget v0, p0, Lcom/example/data/DhikrRepository$markAsRead$1;->label:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/example/data/DhikrRepository$markAsRead$1;->label:I

    iget-object v0, p0, Lcom/example/data/DhikrRepository$markAsRead$1;->this$0:Lcom/example/data/DhikrRepository;

    const/4 v1, 0x0

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    invoke-virtual {v0, v1, v2}, Lcom/example/data/DhikrRepository;->markAsRead(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
