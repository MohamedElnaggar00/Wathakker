.class final Lcom/example/lockwidgets/HomeWidgets$State;
.super Ljava/lang/Object;
.source "HomeWidgets.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/lockwidgets/HomeWidgets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "State"
.end annotation


# instance fields
.field arabic:Z

.field at:J

.field city:Ljava/lang/String;

.field day:Ljava/lang/String;

.field gday:Ljava/lang/String;

.field gmonth:Ljava/lang/String;

.field greg:Ljava/lang/String;

.field gyear:Ljava/lang/String;

.field hday:Ljava/lang/String;

.field hijri:Ljava/lang/String;

.field hmonth:Ljava/lang/String;

.field hyear:Ljava/lang/String;

.field names:[Ljava/lang/String;

.field next:I

.field now:J

.field prev:J

.field previous:I

.field ts:[J


# direct methods
.method constructor <init>()V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/example/lockwidgets/HomeWidgets$State;->now:J

    return-void
.end method
