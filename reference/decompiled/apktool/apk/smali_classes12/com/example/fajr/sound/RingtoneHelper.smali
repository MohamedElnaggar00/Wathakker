.class public final Lcom/example/fajr/sound/RingtoneHelper;
.super Ljava/lang/Object;
.source "RingtoneHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/example/fajr/sound/RingtoneHelper;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "mediaPlayer",
        "Landroid/media/MediaPlayer;",
        "getValidRingtoneUri",
        "Landroid/net/Uri;",
        "prefs",
        "Lcom/example/fajr/data/FajrPreferences;",
        "isUriAccessible",
        "",
        "uri",
        "getRingtoneTitle",
        "",
        "playPreview",
        "",
        "volume",
        "",
        "stopPreview",
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
.field private final context:Landroid/content/Context;

.field private mediaPlayer:Landroid/media/MediaPlayer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/fajr/sound/RingtoneHelper;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/sound/RingtoneHelper;->context:Landroid/content/Context;

    return-void
.end method

.method private final isUriAccessible(Landroid/net/Uri;)Z
    .locals 2
    .param p1, "uri"    # Landroid/net/Uri;

    .line 31
    nop

    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/example/fajr/sound/RingtoneHelper;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "r"

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    .line 33
    .local v0, "pfd":Landroid/os/ParcelFileDescriptor;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    :cond_0
    nop

    .end local v0    # "pfd":Landroid/os/ParcelFileDescriptor;
    const/4 v0, 0x1

    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    .local v0, "e":Ljava/lang/Exception;
    const/4 v1, 0x0

    move v0, v1

    .line 31
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return v0
.end method

.method public static synthetic playPreview$default(Lcom/example/fajr/sound/RingtoneHelper;Landroid/net/Uri;FILjava/lang/Object;)V
    .locals 0

    .line 62
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, 0x3f4ccccd    # 0.8f

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/example/fajr/sound/RingtoneHelper;->playPreview(Landroid/net/Uri;F)V

    return-void
.end method


# virtual methods
.method public final getRingtoneTitle(Landroid/net/Uri;)Ljava/lang/String;
    .locals 9
    .param p1, "uri"    # Landroid/net/Uri;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    nop

    .line 43
    :try_start_0
    iget-object v0, p0, Lcom/example/fajr/sound/RingtoneHelper;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    .end local p1    # "uri":Landroid/net/Uri;
    .local v2, "uri":Landroid/net/Uri;
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    check-cast p1, Ljava/io/Closeable;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    move-object v4, p1

    check-cast v4, Landroid/database/Cursor;

    .local v4, "cursor\\1":Landroid/database/Cursor;
    const/4 v5, 0x0

    .line 44
    .local v5, "$i$a$-use-RingtoneHelper$getRingtoneTitle$1\\1\\43\\0":I
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 45
    const-string v6, "_display_name"

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 46
    .local v6, "nameIndex\\1":I
    const/4 v7, -0x1

    if-eq v6, v7, :cond_2

    .line 47
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 48
    .local v7, "name\\1":Ljava/lang/String;
    move-object v8, v7

    check-cast v8, Ljava/lang/CharSequence;

    if-eqz v8, :cond_1

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    move v8, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v8, v1

    :goto_1
    if-nez v8, :cond_2

    .end local v4    # "cursor\\1":Landroid/database/Cursor;
    .end local v5    # "$i$a$-use-RingtoneHelper$getRingtoneTitle$1\\1\\43\\0":I
    .end local v6    # "nameIndex\\1":I
    .end local v7    # "name\\1":Ljava/lang/String;
    :try_start_3
    invoke-static {p1, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object v7

    .line 51
    .restart local v4    # "cursor\\1":Landroid/database/Cursor;
    .restart local v5    # "$i$a$-use-RingtoneHelper$getRingtoneTitle$1\\1\\43\\0":I
    :cond_2
    nop

    .end local v4    # "cursor\\1":Landroid/database/Cursor;
    .end local v5    # "$i$a$-use-RingtoneHelper$getRingtoneTitle$1\\1\\43\\0":I
    :try_start_4
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 43
    :try_start_5
    invoke-static {p1, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, v0

    .end local v2    # "uri":Landroid/net/Uri;
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .restart local v2    # "uri":Landroid/net/Uri;
    :catchall_1
    move-exception v0

    :try_start_7
    invoke-static {p1, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v2    # "uri":Landroid/net/Uri;
    throw v0

    .line 53
    .restart local v2    # "uri":Landroid/net/Uri;
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/example/fajr/sound/RingtoneHelper;->context:Landroid/content/Context;

    invoke-static {p1, v2}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    move-result-object p1

    .line 54
    .local p1, "ringtone":Landroid/media/Ringtone;
    if-eqz p1, :cond_4

    iget-object v3, p0, Lcom/example/fajr/sound/RingtoneHelper;->context:Landroid/content/Context;

    invoke-virtual {p1, v3}, Landroid/media/Ringtone;->getTitle(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 55
    .local v3, "title":Ljava/lang/String;
    :cond_4
    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    if-nez v4, :cond_6

    :cond_5
    move v0, v1

    :cond_6
    if-nez v0, :cond_7

    return-object v3

    .line 56
    .end local v3    # "title":Ljava/lang/String;
    .end local p1    # "ringtone":Landroid/media/Ringtone;
    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    .end local v2    # "uri":Landroid/net/Uri;
    .local p1, "uri":Landroid/net/Uri;
    :catch_1
    move-exception v0

    move-object v2, p1

    move-object p1, v0

    .line 57
    .restart local v2    # "uri":Landroid/net/Uri;
    .local p1, "e":Ljava/lang/Exception;
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 59
    .end local p1    # "e":Ljava/lang/Exception;
    :cond_7
    const-string p1, "\u0646\u063a\u0645\u0629 \u0627\u0644\u0645\u0646\u0628\u0647 \u0627\u0644\u0627\u0641\u062a\u0631\u0627\u0636\u064a\u0629"

    return-object p1
.end method

.method public final getValidRingtoneUri(Lcom/example/fajr/data/FajrPreferences;)Landroid/net/Uri;
    .locals 4
    .param p1, "prefs"    # Lcom/example/fajr/data/FajrPreferences;

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1}, Lcom/example/fajr/data/FajrPreferences;->getRingtoneUri()Ljava/lang/String;

    move-result-object v0

    .line 18
    .local v0, "savedUriStr":Ljava/lang/String;
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    if-lez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 19
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 20
    .local v1, "uri":Landroid/net/Uri;
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lcom/example/fajr/sound/RingtoneHelper;->isUriAccessible(Landroid/net/Uri;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 21
    return-object v1

    .line 25
    .end local v1    # "uri":Landroid/net/Uri;
    :cond_1
    const/4 v1, 0x4

    invoke-static {v1}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object v1

    if-nez v1, :cond_2

    .line 26
    invoke-static {v2}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object v1

    .line 25
    if-nez v1, :cond_2

    .line 27
    sget-object v1, Landroid/provider/Settings$System;->DEFAULT_ALARM_ALERT_URI:Landroid/net/Uri;

    const-string v2, "DEFAULT_ALARM_ALERT_URI"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    :cond_2
    return-object v1
.end method

.method public final playPreview(Landroid/net/Uri;F)V
    .locals 6
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "volume"    # F

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0}, Lcom/example/fajr/sound/RingtoneHelper;->stopPreview()V

    .line 64
    nop

    .line 65
    const/4 v0, 0x4

    :try_start_0
    new-instance v1, Landroid/media/MediaPlayer;

    invoke-direct {v1}, Landroid/media/MediaPlayer;-><init>()V

    move-object v2, v1

    .local v2, "$this$playPreview_u24lambda_u241\\1":Landroid/media/MediaPlayer;
    const/4 v3, 0x0

    .line 66
    .local v3, "$i$a$-apply-RingtoneHelper$playPreview$1\\1\\65\\0":I
    nop

    .line 67
    new-instance v4, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v4}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 68
    invoke-virtual {v4, v0}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v4

    .line 69
    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v4

    .line 70
    invoke-virtual {v4}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v4

    .line 66
    invoke-virtual {v2, v4}, Landroid/media/MediaPlayer;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    .line 72
    iget-object v4, p0, Lcom/example/fajr/sound/RingtoneHelper;->context:Landroid/content/Context;

    invoke-virtual {v2, v4, p1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 73
    invoke-virtual {v2, p2, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 74
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepare()V

    .line 75
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->start()V

    .line 76
    nop

    .line 65
    .end local v2    # "$this$playPreview_u24lambda_u241\\1":Landroid/media/MediaPlayer;
    .end local v3    # "$i$a$-apply-RingtoneHelper$playPreview$1\\1\\65\\0":I
    iput-object v1, p0, Lcom/example/fajr/sound/RingtoneHelper;->mediaPlayer:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 77
    :catch_0
    move-exception v1

    .line 78
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 80
    nop

    .line 81
    :try_start_1
    invoke-static {v0}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object v0

    .line 82
    .local v0, "defaultUri":Landroid/net/Uri;
    iget-object v2, p0, Lcom/example/fajr/sound/RingtoneHelper;->context:Landroid/content/Context;

    invoke-static {v2, v0}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/MediaPlayer;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object v3, v2

    .local v3, "$this$playPreview_u24lambda_u242\\2":Landroid/media/MediaPlayer;
    const/4 v4, 0x0

    .line 83
    .local v4, "$i$a$-apply-RingtoneHelper$playPreview$2\\2\\82\\0":I
    invoke-virtual {v3, p2, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 84
    invoke-virtual {v3}, Landroid/media/MediaPlayer;->start()V

    .line 85
    nop

    .line 82
    .end local v3    # "$this$playPreview_u24lambda_u242\\2":Landroid/media/MediaPlayer;
    .end local v4    # "$i$a$-apply-RingtoneHelper$playPreview$2\\2\\82\\0":I
    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-object v2, p0, Lcom/example/fajr/sound/RingtoneHelper;->mediaPlayer:Landroid/media/MediaPlayer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .end local v0    # "defaultUri":Landroid/net/Uri;
    goto :goto_1

    .line 86
    :catch_1
    move-exception v0

    .line 87
    .local v0, "ex":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 90
    .end local v0    # "ex":Ljava/lang/Exception;
    .end local v1    # "e":Ljava/lang/Exception;
    :goto_1
    return-void
.end method

.method public final stopPreview()V
    .locals 3

    .line 93
    nop

    .line 94
    :try_start_0
    iget-object v0, p0, Lcom/example/fajr/sound/RingtoneHelper;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .local v0, "it\\1":Landroid/media/MediaPlayer;
    const/4 v1, 0x0

    .line 95
    .local v1, "$i$a$-let-RingtoneHelper$stopPreview$1\\1\\94\\0":I
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 96
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 98
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 99
    nop

    .line 94
    .end local v0    # "it\\1":Landroid/media/MediaPlayer;
    .end local v1    # "$i$a$-let-RingtoneHelper$stopPreview$1\\1\\94\\0":I
    :cond_1
    nop

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/example/fajr/sound/RingtoneHelper;->mediaPlayer:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 101
    :catch_0
    move-exception v0

    .line 102
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 104
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method
