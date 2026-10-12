.class public final Lcom/example/ui/oneui/SettingsAction;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# static fields
.field public static final INSTANCE:Lcom/example/ui/oneui/SettingsAction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/example/ui/oneui/SettingsAction;

    invoke-direct {v0}, Lcom/example/ui/oneui/SettingsAction;-><init>()V

    sput-object v0, Lcom/example/ui/oneui/SettingsAction;->INSTANCE:Lcom/example/ui/oneui/SettingsAction;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/example/ui/oneui/HeaderTools;->settings()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
