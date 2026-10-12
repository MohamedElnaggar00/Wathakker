.class public final Lcom/example/alarm/AlarmScheduler;
.super Ljava/lang/Object;
.source "AlarmScheduler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/alarm/AlarmScheduler$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlarmScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlarmScheduler.kt\ncom/example/alarm/AlarmScheduler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1878#2,3:158\n*S KotlinDebug\n*F\n+ 1 AlarmScheduler.kt\ncom/example/alarm/AlarmScheduler\n*L\n24#1:158,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ(\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/example/alarm/AlarmScheduler;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "alarmManager",
        "Landroid/app/AlarmManager;",
        "schedule",
        "",
        "dhikr",
        "Lcom/example/data/Dhikr;",
        "scheduleSnooze",
        "id",
        "",
        "title",
        "",
        "content",
        "minutes",
        "cancel",
        "Companion",
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

.field public static final Companion:Lcom/example/alarm/AlarmScheduler$Companion;

.field private static final MAX_TIMES_PER_DHIKR:I = 0x14

.field private static final TAG:Ljava/lang/String; = "AlarmScheduler"


# instance fields
.field private final alarmManager:Landroid/app/AlarmManager;

.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/alarm/AlarmScheduler$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/alarm/AlarmScheduler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/alarm/AlarmScheduler;->Companion:Lcom/example/alarm/AlarmScheduler$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/alarm/AlarmScheduler;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/alarm/AlarmScheduler;->context:Landroid/content/Context;

    .line 13
    iget-object v0, p0, Lcom/example/alarm/AlarmScheduler;->context:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/app/AlarmManager;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/AlarmManager;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    .line 12
    return-void
.end method

.method public static synthetic scheduleSnooze$default(Lcom/example/alarm/AlarmScheduler;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    .line 93
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/16 p4, 0xa

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/alarm/AlarmScheduler;->scheduleSnooze(ILjava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final cancel(Lcom/example/data/Dhikr;)V
    .locals 5
    .param p1, "dhikr"    # Lcom/example/data/Dhikr;

    const-string v0, "dhikr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    if-nez v0, :cond_0

    return-void

    .line 140
    :cond_0
    const/4 v0, 0x0

    .local v0, "index":I
    :goto_0
    const/16 v1, 0x14

    if-ge v0, v1, :cond_2

    .line 141
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/example/alarm/AlarmScheduler;->context:Landroid/content/Context;

    const-class v3, Lcom/example/alarm/AlarmReceiver;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 142
    .local v1, "intent":Landroid/content/Intent;
    invoke-virtual {p1}, Lcom/example/data/Dhikr;->getId()I

    move-result v2

    mul-int/lit8 v2, v2, 0x64

    add-int/2addr v2, v0

    .line 144
    .local v2, "requestCode":I
    iget-object v3, p0, Lcom/example/alarm/AlarmScheduler;->context:Landroid/content/Context;

    .line 145
    nop

    .line 146
    nop

    .line 147
    nop

    .line 143
    const/high16 v4, 0x24000000

    invoke-static {v3, v2, v1, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 150
    .local v3, "pendingIntent":Landroid/app/PendingIntent;
    if-eqz v3, :cond_1

    .line 151
    iget-object v4, p0, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v4, v3}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 152
    invoke-virtual {v3}, Landroid/app/PendingIntent;->cancel()V

    .line 140
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "requestCode":I
    .end local v3    # "pendingIntent":Landroid/app/PendingIntent;
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 155
    .end local v0    # "index":I
    :cond_2
    return-void
.end method

.method public final schedule(Lcom/example/data/Dhikr;)V
    .locals 21
    .param p1, "dhikr"    # Lcom/example/data/Dhikr;

    move-object/from16 v1, p0

    const-string v0, "dhikr"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget-object v0, v1, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    if-nez v0, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-virtual/range {p0 .. p1}, Lcom/example/alarm/AlarmScheduler;->cancel(Lcom/example/data/Dhikr;)V

    .line 24
    invoke-virtual {v2}, Lcom/example/data/Dhikr;->getReminderTimes()Ljava/util/List;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 158
    .local v4, "$i$f$forEachIndexed\\1\\24":I
    const/4 v0, 0x0

    .line 159
    .local v0, "index\\1":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "item\\1":Ljava/lang/Object;
    add-int/lit8 v7, v0, 0x1

    .end local v0    # "index\\1":I
    .local v7, "index\\1":I
    if-gez v0, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    move-object v8, v6

    check-cast v8, Ljava/lang/String;

    .local v0, "index\\2":I
    .local v8, "timeStr\\2":Ljava/lang/String;
    move v9, v0

    .end local v0    # "index\\2":I
    .local v9, "index\\2":I
    const/4 v10, 0x0

    .line 25
    .local v10, "$i$a$-forEachIndexed-AlarmScheduler$schedule$1\\2\\159\\0":I
    move-object v11, v8

    check-cast v11, Ljava/lang/CharSequence;

    const-string v0, ":"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v11

    .line 26
    .local v11, "parts\\2":Ljava/util/List;
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    const/4 v12, 0x2

    if-ne v0, v12, :cond_7

    .line 27
    const/4 v12, 0x0

    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v13, v0

    .line 28
    .local v13, "hour\\2":I
    const/4 v0, 0x1

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v14

    if-eqz v14, :cond_5

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    .line 30
    .local v14, "minute\\2":I
    new-instance v15, Landroid/content/Intent;

    iget-object v0, v1, Lcom/example/alarm/AlarmScheduler;->context:Landroid/content/Context;

    const-class v12, Lcom/example/alarm/AlarmReceiver;

    invoke-direct {v15, v0, v12}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v0, v15

    .local v0, "$this$schedule_u24lambda_u242_u24lambda_u240\\3":Landroid/content/Intent;
    const/4 v12, 0x0

    .line 31
    .local v12, "$i$a$-apply-AlarmScheduler$schedule$1$intent$1\\3\\30\\2":I
    const-string v2, "DHIKR_ID"

    move-object/from16 v17, v3

    .end local v3    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .local v17, "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    invoke-virtual/range {p1 .. p1}, Lcom/example/data/Dhikr;->getId()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 32
    const-string v2, "DHIKR_TITLE"

    invoke-virtual/range {p1 .. p1}, Lcom/example/data/Dhikr;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    const-string v2, "DHIKR_CONTENT"

    invoke-virtual/range {p1 .. p1}, Lcom/example/data/Dhikr;->getContent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    nop

    .line 30
    .end local v0    # "$this$schedule_u24lambda_u242_u24lambda_u240\\3":Landroid/content/Intent;
    .end local v12    # "$i$a$-apply-AlarmScheduler$schedule$1$intent$1\\3\\30\\2":I
    nop

    .line 36
    .local v15, "intent\\2":Landroid/content/Intent;
    invoke-virtual/range {p1 .. p1}, Lcom/example/data/Dhikr;->getId()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    add-int v2, v0, v9

    .line 38
    .local v2, "requestCode\\2":I
    iget-object v0, v1, Lcom/example/alarm/AlarmScheduler;->context:Landroid/content/Context;

    .line 39
    nop

    .line 40
    nop

    .line 41
    nop

    .line 37
    const/high16 v3, 0xc000000

    invoke-static {v0, v2, v15, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 44
    .local v3, "pendingIntent\\2":Landroid/app/PendingIntent;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    move-object v12, v0

    .local v12, "$this$schedule_u24lambda_u242_u24lambda_u241\\4":Ljava/util/Calendar;
    const/16 v18, 0x0

    .line 45
    .local v18, "$i$a$-apply-AlarmScheduler$schedule$1$calendar$1\\4\\44\\2":I
    move-object/from16 v19, v0

    const/16 v0, 0xb

    invoke-virtual {v12, v0, v13}, Ljava/util/Calendar;->set(II)V

    .line 46
    const/16 v0, 0xc

    invoke-virtual {v12, v0, v14}, Ljava/util/Calendar;->set(II)V

    .line 47
    const/16 v0, 0xd

    move/from16 v20, v2

    const/4 v2, 0x0

    .end local v2    # "requestCode\\2":I
    .local v20, "requestCode\\2":I
    invoke-virtual {v12, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 48
    const/16 v0, 0xe

    invoke-virtual {v12, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 50
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    const/4 v0, 0x5

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v2}, Ljava/util/Calendar;->add(II)V

    .line 53
    :cond_2
    nop

    .line 44
    .end local v12    # "$this$schedule_u24lambda_u242_u24lambda_u241\\4":Ljava/util/Calendar;
    .end local v18    # "$i$a$-apply-AlarmScheduler$schedule$1$calendar$1\\4\\44\\2":I
    nop

    .line 55
    .local v19, "calendar\\2":Ljava/util/Calendar;
    nop

    .line 56
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 71
    iget-object v2, v1, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    .line 56
    const/16 v12, 0x1f

    if-lt v0, v12, :cond_4

    .line 57
    :try_start_1
    invoke-virtual {v2}, Landroid/app/AlarmManager;->canScheduleExactAlarms()Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 64
    iget-object v2, v1, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    .line 57
    if-eqz v0, :cond_3

    .line 58
    nop

    .line 59
    nop

    .line 60
    move v12, v4

    move-object/from16 v16, v5

    .end local v4    # "$i$f$forEachIndexed\\1\\24":I
    .local v12, "$i$f$forEachIndexed\\1\\24":I
    :try_start_2
    invoke-virtual/range {v19 .. v19}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 61
    nop

    .line 58
    move-object/from16 v18, v6

    const/4 v6, 0x0

    .end local v6    # "item\\1":Ljava/lang/Object;
    .local v18, "item\\1":Ljava/lang/Object;
    :try_start_3
    invoke-virtual {v2, v6, v4, v5, v3}, Landroid/app/AlarmManager;->setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    goto :goto_1

    .line 77
    .end local v18    # "item\\1":Ljava/lang/Object;
    .restart local v6    # "item\\1":Ljava/lang/Object;
    :catch_0
    move-exception v0

    move-object/from16 v18, v6

    .end local v6    # "item\\1":Ljava/lang/Object;
    .restart local v18    # "item\\1":Ljava/lang/Object;
    goto :goto_2

    .line 64
    .end local v12    # "$i$f$forEachIndexed\\1\\24":I
    .end local v18    # "item\\1":Ljava/lang/Object;
    .restart local v4    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v6    # "item\\1":Ljava/lang/Object;
    :cond_3
    move v12, v4

    move-object/from16 v16, v5

    move-object/from16 v18, v6

    .line 65
    .end local v4    # "$i$f$forEachIndexed\\1\\24":I
    .end local v6    # "item\\1":Ljava/lang/Object;
    .restart local v12    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v18    # "item\\1":Ljava/lang/Object;
    nop

    .line 66
    invoke-virtual/range {v19 .. v19}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    .line 67
    nop

    .line 64
    const/4 v6, 0x0

    invoke-virtual {v2, v6, v4, v5, v3}, Landroid/app/AlarmManager;->setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    goto :goto_1

    .line 71
    .end local v12    # "$i$f$forEachIndexed\\1\\24":I
    .end local v18    # "item\\1":Ljava/lang/Object;
    .restart local v4    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v6    # "item\\1":Ljava/lang/Object;
    :cond_4
    move v12, v4

    move-object/from16 v16, v5

    move-object/from16 v18, v6

    .line 72
    .end local v4    # "$i$f$forEachIndexed\\1\\24":I
    .end local v6    # "item\\1":Ljava/lang/Object;
    .restart local v12    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v18    # "item\\1":Ljava/lang/Object;
    nop

    .line 73
    invoke-virtual/range {v19 .. v19}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    .line 74
    nop

    .line 71
    const/4 v6, 0x0

    invoke-virtual {v2, v6, v4, v5, v3}, Landroid/app/AlarmManager;->setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_5

    .line 77
    :catch_1
    move-exception v0

    goto :goto_2

    .end local v12    # "$i$f$forEachIndexed\\1\\24":I
    .end local v18    # "item\\1":Ljava/lang/Object;
    .restart local v4    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v6    # "item\\1":Ljava/lang/Object;
    :catch_2
    move-exception v0

    move v12, v4

    move-object/from16 v16, v5

    move-object/from16 v18, v6

    .end local v4    # "$i$f$forEachIndexed\\1\\24":I
    .end local v6    # "item\\1":Ljava/lang/Object;
    .restart local v12    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v18    # "item\\1":Ljava/lang/Object;
    :goto_2
    move-object v2, v0

    .line 78
    .local v2, "e\\2":Ljava/lang/Exception;
    invoke-virtual/range {p1 .. p1}, Lcom/example/data/Dhikr;->getId()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error scheduling alarm for Dhikr id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v4, v2

    check-cast v4, Ljava/lang/Throwable;

    const-string v5, "AlarmScheduler"

    invoke-static {v5, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    nop

    .line 80
    :try_start_4
    iget-object v0, v1, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 81
    nop

    .line 82
    move-object v4, v2

    .end local v2    # "e\\2":Ljava/lang/Exception;
    .local v4, "e\\2":Ljava/lang/Exception;
    :try_start_5
    invoke-virtual/range {v19 .. v19}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    .line 83
    nop

    .line 80
    const/4 v6, 0x0

    invoke-virtual {v0, v6, v1, v2, v3}, Landroid/app/AlarmManager;->setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_4

    .line 85
    :catch_3
    move-exception v0

    goto :goto_3

    .end local v4    # "e\\2":Ljava/lang/Exception;
    .restart local v2    # "e\\2":Ljava/lang/Exception;
    :catch_4
    move-exception v0

    move-object v4, v2

    .line 86
    .end local v2    # "e\\2":Ljava/lang/Exception;
    .local v0, "e2\\2":Ljava/lang/Exception;
    .restart local v4    # "e\\2":Ljava/lang/Exception;
    :goto_3
    const-string v1, "Fallback alarm scheduling failed"

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {v5, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .end local v0    # "e2\\2":Ljava/lang/Exception;
    :goto_4
    goto :goto_5

    .line 28
    .end local v12    # "$i$f$forEachIndexed\\1\\24":I
    .end local v14    # "minute\\2":I
    .end local v15    # "intent\\2":Landroid/content/Intent;
    .end local v17    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v18    # "item\\1":Ljava/lang/Object;
    .end local v19    # "calendar\\2":Ljava/util/Calendar;
    .end local v20    # "requestCode\\2":I
    .local v3, "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .local v4, "$i$f$forEachIndexed\\1\\24":I
    .restart local v6    # "item\\1":Ljava/lang/Object;
    :cond_5
    move-object/from16 v17, v3

    move v12, v4

    move-object/from16 v16, v5

    move-object/from16 v18, v6

    .end local v3    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEachIndexed\\1\\24":I
    .end local v6    # "item\\1":Ljava/lang/Object;
    .restart local v12    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v17    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .restart local v18    # "item\\1":Ljava/lang/Object;
    goto :goto_6

    .line 27
    .end local v12    # "$i$f$forEachIndexed\\1\\24":I
    .end local v13    # "hour\\2":I
    .end local v17    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v18    # "item\\1":Ljava/lang/Object;
    .restart local v3    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .restart local v4    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v6    # "item\\1":Ljava/lang/Object;
    :cond_6
    move-object/from16 v17, v3

    move v12, v4

    move-object/from16 v16, v5

    move-object/from16 v18, v6

    .end local v3    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEachIndexed\\1\\24":I
    .end local v6    # "item\\1":Ljava/lang/Object;
    .restart local v12    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v17    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .restart local v18    # "item\\1":Ljava/lang/Object;
    goto :goto_6

    .line 26
    .end local v12    # "$i$f$forEachIndexed\\1\\24":I
    .end local v17    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v18    # "item\\1":Ljava/lang/Object;
    .restart local v3    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .restart local v4    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v6    # "item\\1":Ljava/lang/Object;
    :cond_7
    move-object/from16 v17, v3

    move v12, v4

    move-object/from16 v16, v5

    move-object/from16 v18, v6

    .line 90
    .end local v3    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEachIndexed\\1\\24":I
    .end local v6    # "item\\1":Ljava/lang/Object;
    .restart local v12    # "$i$f$forEachIndexed\\1\\24":I
    .restart local v17    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .restart local v18    # "item\\1":Ljava/lang/Object;
    :goto_5
    nop

    .line 159
    .end local v8    # "timeStr\\2":Ljava/lang/String;
    .end local v9    # "index\\2":I
    .end local v10    # "$i$a$-forEachIndexed-AlarmScheduler$schedule$1\\2\\159\\0":I
    .end local v11    # "parts\\2":Ljava/util/List;
    :goto_6
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v0, v7

    move v4, v12

    move-object/from16 v5, v16

    move-object/from16 v3, v17

    .end local v18    # "item\\1":Ljava/lang/Object;
    goto/16 :goto_0

    .line 160
    .end local v7    # "index\\1":I
    .end local v12    # "$i$f$forEachIndexed\\1\\24":I
    .end local v17    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .local v0, "index\\1":I
    .restart local v3    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .restart local v4    # "$i$f$forEachIndexed\\1\\24":I
    :cond_8
    nop

    .line 91
    .end local v0    # "index\\1":I
    .end local v3    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEachIndexed\\1\\24":I
    return-void
.end method

.method public final scheduleSnooze(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 9
    .param p1, "id"    # I
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "content"    # Ljava/lang/String;
    .param p4, "minutes"    # I

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    if-nez v0, :cond_0

    return-void

    .line 95
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    mul-int/lit8 v2, p4, 0x3c

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    .line 96
    .local v0, "triggerAtMillis":J
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/example/alarm/AlarmScheduler;->context:Landroid/content/Context;

    const-class v4, Lcom/example/alarm/AlarmReceiver;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v3, v2

    .local v3, "$this$scheduleSnooze_u24lambda_u243\\1":Landroid/content/Intent;
    const/4 v4, 0x0

    .line 97
    .local v4, "$i$a$-apply-AlarmScheduler$scheduleSnooze$intent$1\\1\\96\\0":I
    const-string v5, "DHIKR_ID"

    invoke-virtual {v3, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 98
    const-string v5, "DHIKR_TITLE"

    invoke-virtual {v3, v5, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    const-string v5, "DHIKR_CONTENT"

    invoke-virtual {v3, v5, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    const-string v5, "IS_SNOOZE"

    const/4 v6, 0x1

    invoke-virtual {v3, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 101
    nop

    .line 96
    .end local v3    # "$this$scheduleSnooze_u24lambda_u243\\1":Landroid/content/Intent;
    .end local v4    # "$i$a$-apply-AlarmScheduler$scheduleSnooze$intent$1\\1\\96\\0":I
    nop

    .line 103
    .local v2, "intent":Landroid/content/Intent;
    mul-int/lit8 v3, p1, 0x64

    add-int/lit8 v3, v3, 0x63

    .line 105
    .local v3, "requestCode":I
    iget-object v4, p0, Lcom/example/alarm/AlarmScheduler;->context:Landroid/content/Context;

    .line 106
    nop

    .line 107
    nop

    .line 108
    nop

    .line 104
    const/high16 v5, 0xc000000

    invoke-static {v4, v3, v2, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 111
    .local v4, "pendingIntent":Landroid/app/PendingIntent;
    nop

    .line 112
    :try_start_0
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    iget-object v6, p0, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    .line 112
    const/4 v7, 0x0

    const/16 v8, 0x1f

    if-lt v5, v8, :cond_2

    .line 113
    :try_start_1
    invoke-virtual {v6}, Landroid/app/AlarmManager;->canScheduleExactAlarms()Z

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 120
    iget-object v6, p0, Lcom/example/alarm/AlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    .line 113
    if-eqz v5, :cond_1

    .line 114
    nop

    .line 115
    nop

    .line 116
    nop

    .line 117
    nop

    .line 114
    :try_start_2
    invoke-virtual {v6, v7, v0, v1, v4}, Landroid/app/AlarmManager;->setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    goto :goto_0

    .line 120
    :cond_1
    nop

    .line 121
    nop

    .line 122
    nop

    .line 123
    nop

    .line 120
    invoke-virtual {v6, v7, v0, v1, v4}, Landroid/app/AlarmManager;->setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    goto :goto_0

    .line 127
    :cond_2
    nop

    .line 128
    nop

    .line 129
    nop

    .line 130
    nop

    .line 127
    invoke-virtual {v6, v7, v0, v1, v4}, Landroid/app/AlarmManager;->setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 133
    :catch_0
    move-exception v5

    .line 134
    .local v5, "e":Ljava/lang/Exception;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Error scheduling snooze alarm for Dhikr id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v7, v5

    check-cast v7, Ljava/lang/Throwable;

    const-string v8, "AlarmScheduler"

    invoke-static {v8, v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 136
    .end local v5    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method
