.class public final Lcom/example/utils/DateTimeUtilsKt;
.super Ljava/lang/Object;
.source "DateTimeUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "formatTimeStr12h",
        "",
        "timeStr",
        "app"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final formatTimeStr12h(Ljava/lang/String;)Ljava/lang/String;
    .locals 14
    .param p0, "timeStr"    # Ljava/lang/String;

    const-string v0, "timeStr"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    move-object v1, p0

    check-cast v1, Ljava/lang/CharSequence;

    const-string v0, ":"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 10
    .local v0, "parts":Ljava/util/List;
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    return-object p0

    .line 11
    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 12
    .local v3, "hour":I
    const/4 v4, 0x1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 13
    .local v5, "minute":I
    const/16 v6, 0xc

    if-ge v3, v6, :cond_1

    move v7, v4

    goto :goto_0

    :cond_1
    move v7, v1

    .line 14
    .local v7, "isAm":Z
    :goto_0
    rem-int/lit8 v8, v3, 0xc

    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    rem-int/lit8 v6, v3, 0xc

    .line 15
    .local v6, "displayHour":I
    :goto_1
    if-eqz v7, :cond_3

    const-string v8, "\u0635"

    goto :goto_2

    :cond_3
    const-string v8, "\u0645"

    .line 16
    .local v8, "amPm":Ljava/lang/String;
    :goto_2
    sget-object v9, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x3

    new-array v13, v12, [Ljava/lang/Object;

    aput-object v10, v13, v1

    aput-object v11, v13, v4

    aput-object v8, v13, v2

    invoke-static {v13, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%02d:%02d %s"

    invoke-static {v9, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    .line 12
    .end local v5    # "minute":I
    .end local v6    # "displayHour":I
    .end local v7    # "isAm":Z
    .end local v8    # "amPm":Ljava/lang/String;
    :cond_4
    return-object p0

    .line 11
    .end local v3    # "hour":I
    :cond_5
    return-object p0
.end method
