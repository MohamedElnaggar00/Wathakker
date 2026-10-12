.class public final synthetic Lcom/example/data/DhikrDao$-CC;
.super Ljava/lang/Object;
.source "DhikrDao.kt"


# direct methods
.method public static synthetic markAsRead$default(Lcom/example/data/DhikrDao;IJLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 27
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    .line 27
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/example/data/DhikrDao;->markAsRead(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: markAsRead"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
