.class public final synthetic Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Lcom/example/data/Dhikr;

.field public final synthetic f$2:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$3:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/example/data/Dhikr;Landroidx/compose/material3/ColorScheme;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;->f$1:Lcom/example/data/Dhikr;

    iput-object p3, p0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;->f$2:Landroidx/compose/material3/ColorScheme;

    iput-object p4, p0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;->f$3:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;->f$1:Lcom/example/data/Dhikr;

    iget-object v2, p0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;->f$2:Landroidx/compose/material3/ColorScheme;

    iget-object v3, p0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;->f$3:Ljava/lang/String;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/RemindersScreenKt;->ReminderRow$lambda$17(Ljava/lang/String;Lcom/example/data/Dhikr;Landroidx/compose/material3/ColorScheme;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
