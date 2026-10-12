.class public final synthetic Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/example/fajr/ui/FajrAlarmActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/example/fajr/ui/FajrAlarmActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda4;->f$0:Lcom/example/fajr/ui/FajrAlarmActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/fajr/ui/FajrAlarmActivity$$ExternalSyntheticLambda4;->f$0:Lcom/example/fajr/ui/FajrAlarmActivity;

    invoke-static {v0}, Lcom/example/fajr/ui/FajrAlarmActivity;->startAlarmEffects$lambda$8(Lcom/example/fajr/ui/FajrAlarmActivity;)V

    return-void
.end method
