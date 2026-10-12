.class public final synthetic Lcom/example/lockwidgets/LockWidgets$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/lockwidgets/LockWidgets$$ExternalSyntheticLambda0;->f$0:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/lockwidgets/LockWidgets$$ExternalSyntheticLambda0;->f$0:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/example/lockwidgets/LockWidgets;->lambda$watchLanguage$0(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method
