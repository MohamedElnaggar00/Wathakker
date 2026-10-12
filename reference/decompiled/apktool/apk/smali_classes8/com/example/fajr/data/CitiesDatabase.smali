.class public final Lcom/example/fajr/data/CitiesDatabase;
.super Ljava/lang/Object;
.source "CitiesDatabase.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCitiesDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CitiesDatabase.kt\ncom/example/fajr/data/CitiesDatabase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n774#2:128\n865#2,2:129\n*S KotlinDebug\n*F\n+ 1 CitiesDatabase.kt\ncom/example/fajr/data/CitiesDatabase\n*L\n119#1:128\n119#1:129,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/example/fajr/data/CitiesDatabase;",
        "",
        "<init>",
        "()V",
        "cities",
        "",
        "Lcom/example/fajr/data/CityItem;",
        "getCities",
        "()Ljava/util/List;",
        "searchCities",
        "query",
        "",
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

.field public static final INSTANCE:Lcom/example/fajr/data/CitiesDatabase;

.field private static final cities:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/fajr/data/CityItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, Lcom/example/fajr/data/CitiesDatabase;

    invoke-direct {v0}, Lcom/example/fajr/data/CitiesDatabase;-><init>()V

    sput-object v0, Lcom/example/fajr/data/CitiesDatabase;->INSTANCE:Lcom/example/fajr/data/CitiesDatabase;

    .line 14
    nop

    .line 16
    const/16 v0, 0x42

    new-array v0, v0, [Lcom/example/fajr/data/CityItem;

    new-instance v1, Lcom/example/fajr/data/CityItem;

    const-wide v6, 0x40356c28f5c28f5cL    # 21.4225

    const-wide v8, 0x4043e9c0ebedfa44L    # 39.8262

    const-string v2, "\u0645\u0643\u0629 \u0627\u0644\u0645\u0643\u0631\u0645\u0629"

    const-string v3, "Makkah"

    const-string v4, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v5, "Saudi Arabia"

    invoke-direct/range {v1 .. v9}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 17
    new-instance v3, Lcom/example/fajr/data/CityItem;

    const-wide v8, 0x4038779a6b50b0f2L    # 24.4672

    const-wide v10, 0x4043ce3bcd35a858L    # 39.6112

    const-string v4, "\u0627\u0644\u0645\u062f\u064a\u0646\u0629 \u0627\u0644\u0645\u0646\u0648\u0631\u0629"

    const-string v5, "Madinah"

    const-string v6, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v7, "Saudi Arabia"

    invoke-direct/range {v3 .. v11}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/4 v1, 0x1

    aput-object v3, v0, v1

    .line 16
    nop

    .line 18
    new-instance v4, Lcom/example/fajr/data/CityItem;

    const-wide v9, 0x4038b6ae7d566cf4L    # 24.7136

    const-wide v11, 0x404756703afb7e91L    # 46.6753

    const-string v5, "\u0627\u0644\u0631\u064a\u0627\u0636"

    const-string v6, "Riyadh"

    const-string v7, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v8, "Saudi Arabia"

    invoke-direct/range {v4 .. v12}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/4 v1, 0x2

    aput-object v4, v0, v1

    .line 16
    nop

    .line 19
    new-instance v5, Lcom/example/fajr/data/CityItem;

    const-wide v10, 0x40358b15b573eab3L    # 21.5433

    const-wide v12, 0x4043961e4f765fd9L    # 39.1728

    const-string v6, "\u062c\u062f\u0629"

    const-string v7, "Jeddah"

    const-string v8, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v9, "Saudi Arabia"

    invoke-direct/range {v5 .. v13}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/4 v1, 0x3

    aput-object v5, v0, v1

    .line 16
    nop

    .line 20
    new-instance v6, Lcom/example/fajr/data/CityItem;

    const-wide v11, 0x403a6bb2fec56d5dL    # 26.4207

    const-wide v13, 0x40490b5dcc63f141L    # 50.0888

    const-string v7, "\u0627\u0644\u062f\u0645\u0627\u0645"

    const-string v8, "Dammam"

    const-string v9, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v10, "Saudi Arabia"

    invoke-direct/range {v6 .. v14}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/4 v1, 0x4

    aput-object v6, v0, v1

    .line 16
    nop

    .line 21
    new-instance v7, Lcom/example/fajr/data/CityItem;

    const-wide v12, 0x403a379a6b50b0f2L    # 26.2172

    const-wide v14, 0x4049193a92a30553L    # 50.1971

    const-string v8, "\u0627\u0644\u062e\u0628\u0631"

    const-string v9, "Khobar"

    const-string v10, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v11, "Saudi Arabia"

    invoke-direct/range {v7 .. v15}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/4 v1, 0x5

    aput-object v7, v0, v1

    .line 16
    nop

    .line 22
    new-instance v8, Lcom/example/fajr/data/CityItem;

    const-wide v13, 0x40323765fd8adabaL    # 18.2164

    const-wide v15, 0x404540adab9f559bL    # 42.5053

    const-string v9, "\u0623\u0628\u0647\u0627"

    const-string v10, "Abha"

    const-string v11, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v12, "Saudi Arabia"

    invoke-direct/range {v8 .. v16}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/4 v1, 0x6

    aput-object v8, v0, v1

    .line 16
    nop

    .line 23
    new-instance v9, Lcom/example/fajr/data/CityItem;

    const-wide v14, 0x403c622d0e560419L    # 28.3835

    const-wide v16, 0x404248793dd97f63L    # 36.5662

    const-string v10, "\u062a\u0628\u0648\u0643"

    const-string v11, "Tabuk"

    const-string v12, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v13, "Saudi Arabia"

    invoke-direct/range {v9 .. v17}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/4 v1, 0x7

    aput-object v9, v0, v1

    .line 16
    nop

    .line 24
    new-instance v10, Lcom/example/fajr/data/CityItem;

    const-wide v15, 0x4035490ff9724745L    # 21.2854

    const-wide v17, 0x40443652bd3c3611L    # 40.4244

    const-string v11, "\u0627\u0644\u0637\u0627\u0626\u0641"

    const-string v12, "Taif"

    const-string v13, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v14, "Saudi Arabia"

    invoke-direct/range {v10 .. v18}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v1, 0x8

    aput-object v10, v0, v1

    .line 16
    nop

    .line 25
    new-instance v11, Lcom/example/fajr/data/CityItem;

    const-wide v16, 0x403a5374bc6a7efaL    # 26.326

    const-wide v18, 0x4045fccccccccccdL    # 43.975

    const-string v12, "\u0628\u0631\u064a\u062f\u0629"

    const-string v13, "Buraidah"

    const-string v14, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0633\u0639\u0648\u062f\u064a\u0629"

    const-string v15, "Saudi Arabia"

    invoke-direct/range {v11 .. v19}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x9

    aput-object v11, v0, v2

    .line 16
    nop

    .line 28
    new-instance v12, Lcom/example/fajr/data/CityItem;

    const-wide v17, 0x403e0b5dcc63f141L    # 30.0444

    const-wide v19, 0x403f3c56d5cfaaceL    # 31.2357

    const-string v13, "\u0627\u0644\u0642\u0627\u0647\u0631\u0629"

    const-string v14, "Cairo"

    const-string v15, "\u0645\u0635\u0631"

    const-string v16, "Egypt"

    invoke-direct/range {v12 .. v20}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0xa

    aput-object v12, v0, v2

    .line 16
    nop

    .line 29
    new-instance v3, Lcom/example/fajr/data/CityItem;

    const-wide v8, 0x403f3339c0ebedfaL    # 31.2001

    const-wide v10, 0x403deb2fec56d5d0L    # 29.9187

    const-string v4, "\u0627\u0644\u0625\u0633\u0643\u0646\u062f\u0631\u064a\u0629"

    const-string v5, "Alexandria"

    const-string v6, "\u0645\u0635\u0631"

    const-string v7, "Egypt"

    invoke-direct/range {v3 .. v11}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0xb

    aput-object v3, v0, v2

    .line 16
    nop

    .line 30
    new-instance v4, Lcom/example/fajr/data/CityItem;

    const-wide v9, 0x403e035a858793deL    # 30.0131

    const-wide v11, 0x403f357a786c2268L    # 31.2089

    const-string v5, "\u0627\u0644\u062c\u064a\u0632\u0629"

    const-string v6, "Giza"

    const-string v7, "\u0645\u0635\u0631"

    const-string v8, "Egypt"

    invoke-direct/range {v4 .. v12}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0xc

    aput-object v4, v0, v2

    .line 16
    nop

    .line 31
    new-instance v5, Lcom/example/fajr/data/CityItem;

    const-wide v10, 0x403f0a786c22680aL    # 31.0409

    const-wide v12, 0x403f60e560418937L    # 31.3785

    const-string v6, "\u0627\u0644\u0645\u0646\u0635\u0648\u0631\u0629"

    const-string v7, "Mansoura"

    const-string v8, "\u0645\u0635\u0631"

    const-string v9, "Egypt"

    invoke-direct/range {v5 .. v13}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0xd

    aput-object v5, v0, v2

    .line 16
    nop

    .line 32
    new-instance v6, Lcom/example/fajr/data/CityItem;

    const-wide v11, 0x403ec95810624dd3L    # 30.7865

    const-wide v13, 0x403f001a36e2eb1cL    # 31.0004

    const-string v7, "\u0637\u0646\u0637\u0627"

    const-string v8, "Tanta"

    const-string v9, "\u0645\u0635\u0631"

    const-string v10, "Egypt"

    invoke-direct/range {v6 .. v14}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0xe

    aput-object v6, v0, v2

    .line 16
    nop

    .line 33
    new-instance v7, Lcom/example/fajr/data/CityItem;

    const-wide v12, 0x403f43eab367a0f9L    # 31.2653

    const-wide v14, 0x404026a4a8c154caL    # 32.3019

    const-string v8, "\u0628\u0648\u0631\u0633\u0639\u064a\u062f"

    const-string v9, "Port Said"

    const-string v10, "\u0645\u0635\u0631"

    const-string v11, "Egypt"

    invoke-direct/range {v7 .. v15}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0xf

    aput-object v7, v0, v2

    .line 16
    nop

    .line 34
    new-instance v8, Lcom/example/fajr/data/CityItem;

    const-wide v13, 0x403df780346dc5d6L    # 29.9668

    const-wide v15, 0x4040465fd8adab9fL    # 32.5498

    const-string v9, "\u0627\u0644\u0633\u0648\u064a\u0633"

    const-string v10, "Suez"

    const-string v11, "\u0645\u0635\u0631"

    const-string v12, "Egypt"

    invoke-direct/range {v8 .. v16}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x10

    aput-object v8, v0, v2

    .line 16
    nop

    .line 35
    new-instance v9, Lcom/example/fajr/data/CityItem;

    const-wide v14, 0x4039afec56d5cfabL    # 25.6872

    const-wide v16, 0x404051de69ad42c4L    # 32.6396

    const-string v10, "\u0627\u0644\u0623\u0642\u0635\u0631"

    const-string v11, "Luxor"

    const-string v12, "\u0645\u0635\u0631"

    const-string v13, "Egypt"

    invoke-direct/range {v9 .. v17}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x11

    aput-object v9, v0, v2

    .line 16
    nop

    .line 36
    new-instance v10, Lcom/example/fajr/data/CityItem;

    const-wide v15, 0x403816c226809d49L    # 24.0889

    const-wide v17, 0x4040732ca57a786cL    # 32.8998

    const-string v11, "\u0623\u0633\u0648\u0627\u0646"

    const-string v12, "Aswan"

    const-string v13, "\u0645\u0635\u0631"

    const-string v14, "Egypt"

    invoke-direct/range {v10 .. v18}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x12

    aput-object v10, v0, v2

    .line 16
    nop

    .line 37
    new-instance v11, Lcom/example/fajr/data/CityItem;

    const-wide v16, 0x403b2da5119ce076L    # 27.1783

    const-wide v18, 0x403f2f972474538fL    # 31.1859

    const-string v12, "\u0623\u0633\u064a\u0648\u0637"

    const-string v13, "Asyut"

    const-string v14, "\u0645\u0635\u0631"

    const-string v15, "Egypt"

    invoke-direct/range {v11 .. v19}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x13

    aput-object v11, v0, v2

    .line 16
    nop

    .line 38
    new-instance v12, Lcom/example/fajr/data/CityItem;

    const-wide v17, 0x403e967381d7dbf5L    # 30.5877

    const-wide v19, 0x403f8083126e978dL    # 31.502

    const-string v13, "\u0627\u0644\u0632\u0642\u0627\u0632\u064a\u0642"

    const-string v14, "Zagazig"

    const-string v15, "\u0645\u0635\u0631"

    const-string v16, "Egypt"

    invoke-direct/range {v12 .. v20}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x14

    aput-object v12, v0, v2

    .line 16
    nop

    .line 41
    new-instance v3, Lcom/example/fajr/data/CityItem;

    const-wide v8, 0x40387432ca57a787L    # 24.4539

    const-wide v10, 0x404b304b5dcc63f1L    # 54.3773

    const-string v4, "\u0623\u0628\u0648\u0638\u0628\u064a"

    const-string v5, "Abu Dhabi"

    const-string v6, "\u0627\u0644\u0625\u0645\u0627\u0631\u0627\u062a \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0645\u062a\u062d\u062f\u0629"

    const-string v7, "UAE"

    invoke-direct/range {v3 .. v11}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x15

    aput-object v3, v0, v2

    .line 16
    nop

    .line 42
    new-instance v4, Lcom/example/fajr/data/CityItem;

    const-wide v9, 0x4039346dc5d63886L    # 25.2048

    const-wide v11, 0x404ba2a9930be0dfL    # 55.2708

    const-string v5, "\u062f\u0628\u064a"

    const-string v6, "Dubai"

    const-string v7, "\u0627\u0644\u0625\u0645\u0627\u0631\u0627\u062a \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0645\u062a\u062d\u062f\u0629"

    const-string v8, "UAE"

    invoke-direct/range {v4 .. v12}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x16

    aput-object v4, v0, v2

    .line 16
    nop

    .line 43
    new-instance v5, Lcom/example/fajr/data/CityItem;

    const-wide v10, 0x403958a71de69ad4L    # 25.3463

    const-wide v12, 0x404bb5e00d1b7176L    # 55.4209

    const-string v6, "\u0627\u0644\u0634\u0627\u0631\u0642\u0629"

    const-string v7, "Sharjah"

    const-string v8, "\u0627\u0644\u0625\u0645\u0627\u0631\u0627\u062a \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0645\u062a\u062d\u062f\u0629"

    const-string v9, "UAE"

    invoke-direct/range {v5 .. v13}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x17

    aput-object v5, v0, v2

    .line 16
    nop

    .line 44
    new-instance v6, Lcom/example/fajr/data/CityItem;

    const-wide v11, 0x403967bb2fec56d6L    # 25.4052

    const-wide v13, 0x404bc1bda5119ce0L    # 55.5136

    const-string v7, "\u0639\u062c\u0645\u0627\u0646"

    const-string v8, "Ajman"

    const-string v9, "\u0627\u0644\u0625\u0645\u0627\u0631\u0627\u062a \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0645\u062a\u062d\u062f\u0629"

    const-string v10, "UAE"

    invoke-direct/range {v6 .. v14}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x18

    aput-object v6, v0, v2

    .line 16
    nop

    .line 45
    new-instance v7, Lcom/example/fajr/data/CityItem;

    const-wide v12, 0x4039ca1cac083127L    # 25.7895

    const-wide v14, 0x404bf8bac710cb29L    # 55.9432

    const-string v8, "\u0631\u0623\u0633 \u0627\u0644\u062e\u064a\u0645\u0629"

    const-string v9, "Ras Al Khaimah"

    const-string v10, "\u0627\u0644\u0625\u0645\u0627\u0631\u0627\u062a \u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0645\u062a\u062d\u062f\u0629"

    const-string v11, "UAE"

    invoke-direct/range {v7 .. v15}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x19

    aput-object v7, v0, v2

    .line 16
    nop

    .line 48
    new-instance v8, Lcom/example/fajr/data/CityItem;

    const-wide v13, 0x403d603afb7e9100L    # 29.3759

    const-wide v15, 0x4047fd1b71758e22L    # 47.9774

    const-string v9, "\u0627\u0644\u0643\u0648\u064a\u062a"

    const-string v10, "Kuwait City"

    const-string v11, "\u0627\u0644\u0643\u0648\u064a\u062a"

    const-string v12, "Kuwait"

    invoke-direct/range {v8 .. v16}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x1a

    aput-object v8, v0, v2

    .line 16
    nop

    .line 49
    new-instance v9, Lcom/example/fajr/data/CityItem;

    const-wide v14, 0x403d5532617c1bdaL    # 29.3328

    const-wide v16, 0x4048039f559b3d08L    # 48.0283

    const-string v10, "\u062d\u0648\u0644\u064a"

    const-string v11, "Hawalli"

    const-string v12, "\u0627\u0644\u0643\u0648\u064a\u062a"

    const-string v13, "Kuwait"

    invoke-direct/range {v9 .. v17}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x1b

    aput-object v9, v0, v2

    .line 16
    nop

    .line 50
    new-instance v10, Lcom/example/fajr/data/CityItem;

    const-wide v15, 0x403d13c36113404fL    # 29.0772

    const-wide v17, 0x40480abd3c361134L    # 48.0839

    const-string v11, "\u0627\u0644\u0623\u062d\u0645\u062f\u064a"

    const-string v12, "Ahmadi"

    const-string v13, "\u0627\u0644\u0643\u0648\u064a\u062a"

    const-string v14, "Kuwait"

    invoke-direct/range {v10 .. v18}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x1c

    aput-object v10, v0, v2

    .line 16
    nop

    .line 53
    new-instance v11, Lcom/example/fajr/data/CityItem;

    const-wide v16, 0x4039490ff9724745L    # 25.2854

    const-wide v18, 0x4049c3f7ced91687L    # 51.531

    const-string v12, "\u0627\u0644\u062f\u0648\u062d\u0629"

    const-string v13, "Doha"

    const-string v14, "\u0642\u0637\u0631"

    const-string v15, "Qatar"

    invoke-direct/range {v11 .. v19}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x1d

    aput-object v11, v0, v2

    .line 16
    nop

    .line 54
    new-instance v12, Lcom/example/fajr/data/CityItem;

    const-wide v17, 0x40394ab9f559b3d0L    # 25.2919

    const-wide v19, 0x4049b652bd3c3611L    # 51.4244

    const-string v13, "\u0627\u0644\u0631\u064a\u0627\u0646"

    const-string v14, "Al Rayyan"

    const-string v15, "\u0642\u0637\u0631"

    const-string v16, "Qatar"

    invoke-direct/range {v12 .. v20}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x1e

    aput-object v12, v0, v2

    .line 16
    nop

    .line 57
    new-instance v3, Lcom/example/fajr/data/CityItem;

    const-wide v8, 0x403ff205bc01a36eL    # 31.9454

    const-wide v10, 0x4041f6d5cfaacd9fL    # 35.9284

    const-string v4, "\u0639\u0645\u0651\u0627\u0646"

    const-string v5, "Amman"

    const-string v6, "\u0627\u0644\u0623\u0631\u062f\u0646"

    const-string v7, "Jordan"

    invoke-direct/range {v3 .. v11}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x1f

    aput-object v3, v0, v2

    .line 16
    nop

    .line 58
    new-instance v4, Lcom/example/fajr/data/CityItem;

    const-wide v9, 0x404007c84b5dcc64L    # 32.0608

    const-wide v11, 0x40420c0ebedfa440L    # 36.0942

    const-string v5, "\u0627\u0644\u0632\u0631\u0642\u0627\u0621"

    const-string v6, "Zarqa"

    const-string v7, "\u0627\u0644\u0623\u0631\u062f\u0646"

    const-string v8, "Jordan"

    invoke-direct/range {v4 .. v12}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x20

    aput-object v4, v0, v2

    .line 16
    nop

    .line 59
    new-instance v5, Lcom/example/fajr/data/CityItem;

    const-wide v10, 0x4040474538ef34d7L    # 32.5568

    const-wide v12, 0x4041ec67381d7dbfL    # 35.8469

    const-string v6, "\u0625\u0631\u0628\u062f"

    const-string v7, "Irbid"

    const-string v8, "\u0627\u0644\u0623\u0631\u062f\u0646"

    const-string v9, "Jordan"

    invoke-direct/range {v5 .. v13}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x21

    aput-object v5, v0, v2

    .line 16
    nop

    .line 60
    new-instance v6, Lcom/example/fajr/data/CityItem;

    const-wide v11, 0x403d8837b4a2339cL    # 29.5321

    const-wide v13, 0x404180ce703afb7fL    # 35.0063

    const-string v7, "\u0627\u0644\u0639\u0642\u0628\u0629"

    const-string v8, "Aqaba"

    const-string v9, "\u0627\u0644\u0623\u0631\u062f\u0646"

    const-string v10, "Jordan"

    invoke-direct/range {v6 .. v14}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x22

    aput-object v6, v0, v2

    .line 16
    nop

    .line 63
    new-instance v7, Lcom/example/fajr/data/CityItem;

    const-wide v12, 0x403fc4af4f0d844dL    # 31.7683

    const-wide v14, 0x40419b5a858793deL    # 35.2137

    const-string v8, "\u0627\u0644\u0642\u062f\u0633 \u0627\u0644\u0634\u0631\u064a\u0641"

    const-string v9, "Jerusalem"

    const-string v10, "\u0641\u0644\u0633\u0637\u064a\u0646"

    const-string v11, "Palestine"

    invoke-direct/range {v7 .. v15}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x23

    aput-object v7, v0, v2

    .line 16
    nop

    .line 64
    new-instance v8, Lcom/example/fajr/data/CityItem;

    const-wide v13, 0x403f806f69446738L    # 31.5017

    const-wide v15, 0x40413bc01a36e2ebL    # 34.4668

    const-string v9, "\u063a\u0632\u0629"

    const-string v10, "Gaza"

    const-string v11, "\u0641\u0644\u0633\u0637\u064a\u0646"

    const-string v12, "Palestine"

    invoke-direct/range {v8 .. v16}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x24

    aput-object v8, v0, v2

    .line 16
    nop

    .line 65
    new-instance v9, Lcom/example/fajr/data/CityItem;

    const-wide v14, 0x403fe75f6fd21ff3L    # 31.9038

    const-wide v16, 0x40419a0902de00d2L    # 35.2034

    const-string v10, "\u0631\u0627\u0645 \u0627\u0644\u0644\u0647"

    const-string v11, "Ramallah"

    const-string v12, "\u0641\u0644\u0633\u0637\u064a\u0646"

    const-string v13, "Palestine"

    invoke-direct/range {v9 .. v17}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x25

    aput-object v9, v0, v2

    .line 16
    nop

    .line 66
    new-instance v10, Lcom/example/fajr/data/CityItem;

    const-wide v15, 0x40401c4d013a92a3L    # 32.2211

    const-wide v17, 0x4041a0902de00d1bL    # 35.2544

    const-string v11, "\u0646\u0627\u0628\u0644\u0633"

    const-string v12, "Nablus"

    const-string v13, "\u0641\u0644\u0633\u0637\u064a\u0646"

    const-string v14, "Palestine"

    invoke-direct/range {v10 .. v18}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x26

    aput-object v10, v0, v2

    .line 16
    nop

    .line 69
    new-instance v11, Lcom/example/fajr/data/CityItem;

    const-wide v16, 0x4040a858793dd97fL    # 33.3152

    const-wide v18, 0x40462edc5d638866L    # 44.3661

    const-string v12, "\u0628\u063a\u062f\u0627\u062f"

    const-string v13, "Baghdad"

    const-string v14, "\u0627\u0644\u0639\u0631\u0627\u0642"

    const-string v15, "Iraq"

    invoke-direct/range {v11 .. v19}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x27

    aput-object v11, v0, v2

    .line 16
    nop

    .line 70
    new-instance v12, Lcom/example/fajr/data/CityItem;

    const-wide v17, 0x4042185532617c1cL    # 36.1901

    const-wide v19, 0x4046012a30553261L    # 44.0091

    const-string v13, "\u0623\u0631\u0628\u064a\u0644"

    const-string v14, "Erbil"

    const-string v15, "\u0627\u0644\u0639\u0631\u0627\u0642"

    const-string v16, "Iraq"

    invoke-direct/range {v12 .. v20}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x28

    aput-object v12, v0, v2

    .line 16
    nop

    .line 71
    new-instance v3, Lcom/example/fajr/data/CityItem;

    const-wide v8, 0x403e8212d77318fcL    # 30.5081

    const-wide v10, 0x4047e449ba5e353fL    # 47.7835

    const-string v4, "\u0627\u0644\u0628\u0635\u0631\u0629"

    const-string v5, "Basra"

    const-string v6, "\u0627\u0644\u0639\u0631\u0627\u0642"

    const-string v7, "Iraq"

    invoke-direct/range {v3 .. v11}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x29

    aput-object v3, v0, v2

    .line 16
    nop

    .line 72
    new-instance v4, Lcom/example/fajr/data/CityItem;

    const-wide v9, 0x40422b851eb851ecL    # 36.34

    const-wide v11, 0x404590a3d70a3d71L    # 43.13

    const-string v5, "\u0627\u0644\u0645\u0648\u0635\u0644"

    const-string v6, "Mosul"

    const-string v7, "\u0627\u0644\u0639\u0631\u0627\u0642"

    const-string v8, "Iraq"

    invoke-direct/range {v4 .. v12}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x2a

    aput-object v4, v0, v2

    .line 16
    nop

    .line 75
    new-instance v5, Lcom/example/fajr/data/CityItem;

    const-wide v10, 0x4042607c84b5dcc6L    # 36.7538

    const-wide v12, 0x4008786c226809d5L    # 3.0588

    const-string v6, "\u0627\u0644\u062c\u0632\u0627\u0626\u0631 \u0627\u0644\u0639\u0627\u0635\u0645\u0629"

    const-string v7, "Algiers"

    const-string v8, "\u0627\u0644\u062c\u0632\u0627\u0626\u0631"

    const-string v9, "Algeria"

    invoke-direct/range {v5 .. v13}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x2b

    aput-object v5, v0, v2

    .line 16
    nop

    .line 76
    new-instance v6, Lcom/example/fajr/data/CityItem;

    const-wide v11, 0x4041d93a92a30553L    # 35.6971

    const-wide v13, -0x401bd07c84b5dcc6L    # -0.6308

    const-string v7, "\u0648\u0647\u0631\u0627\u0646"

    const-string v8, "Oran"

    const-string v9, "\u0627\u0644\u062c\u0632\u0627\u0626\u0631"

    const-string v10, "Algeria"

    invoke-direct/range {v6 .. v14}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x2c

    aput-object v6, v0, v2

    .line 16
    nop

    .line 77
    new-instance v7, Lcom/example/fajr/data/CityItem;

    const-wide v12, 0x40422eb851eb851fL    # 36.365

    const-wide v14, 0x401a7573eab367a1L    # 6.6147

    const-string v8, "\u0642\u0633\u0646\u0637\u064a\u0646\u0629"

    const-string v9, "Constantine"

    const-string v10, "\u0627\u0644\u062c\u0632\u0627\u0626\u0631"

    const-string v11, "Algeria"

    invoke-direct/range {v7 .. v15}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x2d

    aput-object v7, v0, v2

    .line 16
    nop

    .line 80
    new-instance v8, Lcom/example/fajr/data/CityItem;

    const-wide v13, 0x404102acd9e83e42L    # 34.0209

    const-wide v15, -0x3fe4a2339c0ebee0L    # -6.8416

    const-string v9, "\u0627\u0644\u0631\u0628\u0627\u0637"

    const-string v10, "Rabat"

    const-string v11, "\u0627\u0644\u0645\u063a\u0631\u0628"

    const-string v12, "Morocco"

    invoke-direct/range {v8 .. v16}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x2e

    aput-object v8, v0, v2

    .line 16
    nop

    .line 81
    new-instance v9, Lcom/example/fajr/data/CityItem;

    const-wide v14, 0x4040c95b573eab36L    # 33.5731

    const-wide v16, -0x3fe1a40b780346dcL    # -7.5898

    const-string v10, "\u0627\u0644\u062f\u0627\u0631 \u0627\u0644\u0628\u064a\u0636\u0627\u0621"

    const-string v11, "Casablanca"

    const-string v12, "\u0627\u0644\u0645\u063a\u0631\u0628"

    const-string v13, "Morocco"

    invoke-direct/range {v9 .. v17}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x2f

    aput-object v9, v0, v2

    .line 16
    nop

    .line 82
    new-instance v10, Lcom/example/fajr/data/CityItem;

    const-wide v15, 0x403fa126e978d4feL    # 31.6295

    const-wide v17, -0x3fe0135a858793deL    # -7.9811

    const-string v11, "\u0645\u0631\u0627\u0643\u0634"

    const-string v12, "Marrakesh"

    const-string v13, "\u0627\u0644\u0645\u063a\u0631\u0628"

    const-string v14, "Morocco"

    invoke-direct/range {v10 .. v18}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x30

    aput-object v10, v0, v2

    .line 16
    nop

    .line 83
    new-instance v11, Lcom/example/fajr/data/CityItem;

    const-wide v16, 0x404104432ca57a78L    # 34.0333

    const-wide/high16 v18, -0x3fec000000000000L    # -5.0

    const-string v12, "\u0641\u0627\u0633"

    const-string v13, "Fes"

    const-string v14, "\u0627\u0644\u0645\u063a\u0631\u0628"

    const-string v15, "Morocco"

    invoke-direct/range {v11 .. v19}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x31

    aput-object v11, v0, v2

    .line 16
    nop

    .line 84
    new-instance v12, Lcom/example/fajr/data/CityItem;

    const-wide v17, 0x4041e1374bc6a7f0L    # 35.7595

    const-wide v19, -0x3fe8a9fbe76c8b44L    # -5.834

    const-string v13, "\u0637\u0646\u062c\u0629"

    const-string v14, "Tangier"

    const-string v15, "\u0627\u0644\u0645\u063a\u0631\u0628"

    const-string v16, "Morocco"

    invoke-direct/range {v12 .. v20}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x32

    aput-object v12, v0, v2

    .line 16
    nop

    .line 87
    new-instance v3, Lcom/example/fajr/data/CityItem;

    const-wide v8, 0x4042673b645a1cacL    # 36.8065

    const-wide v10, 0x40245ced916872b0L    # 10.1815

    const-string v4, "\u062a\u0648\u0646\u0633"

    const-string v5, "Tunis"

    const-string v6, "\u062a\u0648\u0646\u0633"

    const-string v7, "Tunisia"

    invoke-direct/range {v3 .. v11}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x33

    aput-object v3, v0, v2

    .line 16
    nop

    .line 88
    new-instance v4, Lcom/example/fajr/data/CityItem;

    const-wide v9, 0x40415ecbfb15b574L    # 34.7406

    const-wide v11, 0x402585460aa64c30L    # 10.7603

    const-string v5, "\u0635\u0641\u0627\u0642\u0633"

    const-string v6, "Sfax"

    const-string v7, "\u062a\u0648\u0646\u0633"

    const-string v8, "Tunisia"

    invoke-direct/range {v4 .. v12}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x34

    aput-object v4, v0, v2

    .line 16
    nop

    .line 91
    new-instance v5, Lcom/example/fajr/data/CityItem;

    const-wide v10, 0x403a3a7ef9db22d1L    # 26.2285

    const-wide v12, 0x40494b020c49ba5eL    # 50.586

    const-string v6, "\u0627\u0644\u0645\u0646\u0627\u0645\u0629"

    const-string v7, "Manama"

    const-string v8, "\u0627\u0644\u0628\u062d\u0631\u064a\u0646"

    const-string v9, "Bahrain"

    invoke-direct/range {v5 .. v13}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x35

    aput-object v5, v0, v2

    .line 16
    nop

    .line 94
    new-instance v6, Lcom/example/fajr/data/CityItem;

    const-wide v11, 0x403796872b020c4aL    # 23.588

    const-wide v13, 0x404d3102de00d1b7L    # 58.3829

    const-string v7, "\u0645\u0633\u0642\u0637"

    const-string v8, "Muscat"

    const-string v9, "\u0639\u0645\u0627\u0646"

    const-string v10, "Oman"

    invoke-direct/range {v6 .. v14}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x36

    aput-object v6, v0, v2

    .line 16
    nop

    .line 95
    new-instance v7, Lcom/example/fajr/data/CityItem;

    const-wide v12, 0x403103dd97f62b6bL    # 17.0151

    const-wide v14, 0x404b0bd3c3611340L    # 54.0924

    const-string v8, "\u0635\u0644\u0627\u0644\u0629"

    const-string v9, "Salalah"

    const-string v10, "\u0639\u0645\u0627\u0646"

    const-string v11, "Oman"

    invoke-direct/range {v7 .. v15}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x37

    aput-object v7, v0, v2

    .line 16
    nop

    .line 98
    new-instance v8, Lcom/example/fajr/data/CityItem;

    const-wide v13, 0x402f005bc01a36e3L    # 15.5007

    const-wide v15, 0x404047aacd9e83e4L    # 32.5599

    const-string v9, "\u0627\u0644\u062e\u0631\u0637\u0648\u0645"

    const-string v10, "Khartoum"

    const-string v11, "\u0627\u0644\u0633\u0648\u062f\u0627\u0646"

    const-string v12, "Sudan"

    invoke-direct/range {v8 .. v16}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x38

    aput-object v8, v0, v2

    .line 16
    nop

    .line 101
    new-instance v9, Lcom/example/fajr/data/CityItem;

    const-wide v14, 0x4040718fc504816fL    # 32.8872

    const-wide v16, 0x402a61f212d77319L    # 13.1913

    const-string v10, "\u0637\u0631\u0627\u0628\u0644\u0633"

    const-string v11, "Tripoli"

    const-string v12, "\u0644\u064a\u0628\u064a\u0627"

    const-string v13, "Libya"

    invoke-direct/range {v9 .. v17}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x39

    aput-object v9, v0, v2

    .line 16
    nop

    .line 102
    new-instance v10, Lcom/example/fajr/data/CityItem;

    const-wide v15, 0x40400ef0068db8bbL    # 32.1167

    const-wide v17, 0x40341113404ea4a9L    # 20.0667

    const-string v11, "\u0628\u0646\u063a\u0627\u0632\u064a"

    const-string v12, "Benghazi"

    const-string v13, "\u0644\u064a\u0628\u064a\u0627"

    const-string v14, "Libya"

    invoke-direct/range {v10 .. v18}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x3a

    aput-object v10, v0, v2

    .line 16
    nop

    .line 105
    new-instance v11, Lcom/example/fajr/data/CityItem;

    const-wide v16, 0x4044810cb295e9e2L    # 41.0082

    const-wide v18, 0x403cfa786c22680aL    # 28.9784

    const-string v12, "\u0625\u0633\u0637\u0646\u0628\u0648\u0644"

    const-string v13, "Istanbul"

    const-string v14, "\u062a\u0631\u0643\u064a\u0627"

    const-string v15, "Turkey"

    invoke-direct/range {v11 .. v19}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x3b

    aput-object v11, v0, v2

    .line 16
    nop

    .line 106
    new-instance v12, Lcom/example/fajr/data/CityItem;

    const-wide v17, 0x4043f779a6b50b0fL    # 39.9334

    const-wide v19, 0x40406e0aa64c2f83L    # 32.8597

    const-string v13, "\u0623\u0646\u0642\u0631\u0629"

    const-string v14, "Ankara"

    const-string v15, "\u062a\u0631\u0643\u064a\u0627"

    const-string v16, "Turkey"

    invoke-direct/range {v12 .. v20}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x3c

    aput-object v12, v0, v2

    .line 16
    nop

    .line 109
    new-instance v3, Lcom/example/fajr/data/CityItem;

    const-wide v8, 0x4049c0f27bb2fec5L    # 51.5074

    const-wide v10, -0x403fa43fe5c91d15L    # -0.1278

    const-string v4, "\u0644\u0646\u062f\u0646"

    const-string v5, "London"

    const-string v6, "\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0645\u062a\u062d\u062f\u0629"

    const-string v7, "UK"

    invoke-direct/range {v3 .. v11}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x3d

    aput-object v3, v0, v2

    .line 16
    nop

    .line 110
    new-instance v4, Lcom/example/fajr/data/CityItem;

    const-wide v9, 0x4043741f212d7732L    # 38.9072

    const-wide v11, -0x3facbda36e2eb1c4L    # -77.0369

    const-string v5, "\u0648\u0627\u0634\u0646\u0637\u0646"

    const-string v6, "Washington D.C."

    const-string v7, "\u0627\u0644\u0648\u0644\u0627\u064a\u0627\u062a \u0627\u0644\u0645\u062a\u062d\u062f\u0629"

    const-string v8, "USA"

    invoke-direct/range {v4 .. v12}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x3e

    aput-object v4, v0, v2

    .line 16
    nop

    .line 111
    new-instance v5, Lcom/example/fajr/data/CityItem;

    const-wide v10, 0x40445b3d07c84b5eL    # 40.7128

    const-wide v12, -0x3fad7f9db22d0e56L    # -74.006

    const-string v6, "\u0646\u064a\u0648\u064a\u0648\u0631\u0643"

    const-string v7, "New York"

    const-string v8, "\u0627\u0644\u0648\u0644\u0627\u064a\u0627\u062a \u0627\u0644\u0645\u062a\u062d\u062f\u0629"

    const-string v9, "USA"

    invoke-direct/range {v5 .. v13}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x3f

    aput-object v5, v0, v2

    .line 16
    nop

    .line 112
    new-instance v6, Lcom/example/fajr/data/CityItem;

    const-wide v11, 0x40486da5119ce076L    # 48.8566

    const-wide v13, 0x4002d14e3bcd35a8L    # 2.3522

    const-string v7, "\u0628\u0627\u0631\u064a\u0633"

    const-string v8, "Paris"

    const-string v9, "\u0641\u0631\u0646\u0633\u0627"

    const-string v10, "France"

    invoke-direct/range {v6 .. v14}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x40

    aput-object v6, v0, v2

    .line 16
    nop

    .line 113
    new-instance v7, Lcom/example/fajr/data/CityItem;

    const-wide v12, 0x404a428f5c28f5c3L    # 52.52

    const-wide v14, 0x402acf5c28f5c28fL    # 13.405

    const-string v8, "\u0628\u0631\u0644\u064a\u0646"

    const-string v9, "Berlin"

    const-string v10, "\u0623\u0644\u0645\u0627\u0646\u064a\u0627"

    const-string v11, "Germany"

    invoke-direct/range {v7 .. v15}, Lcom/example/fajr/data/CityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    const/16 v2, 0x41

    aput-object v7, v0, v2

    .line 16
    nop

    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/example/fajr/data/CitiesDatabase;->cities:Ljava/util/List;

    sput v1, Lcom/example/fajr/data/CitiesDatabase;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCities()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/fajr/data/CityItem;",
            ">;"
        }
    .end annotation

    .line 14
    sget-object v0, Lcom/example/fajr/data/CitiesDatabase;->cities:Ljava/util/List;

    return-object v0
.end method

.method public final searchCities(Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .param p1, "query"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/example/fajr/data/CityItem;",
            ">;"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/example/fajr/data/CitiesDatabase;->cities:Ljava/util/List;

    return-object v0

    .line 118
    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .local v0, "q":Ljava/lang/String;
    sget-object v1, Lcom/example/fajr/data/CitiesDatabase;->cities:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$filter\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 128
    .local v2, "$i$f$filter\\1\\119":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\2":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$filterTo\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 129
    .local v5, "$i$f$filterTo\\2\\128":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\2":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/example/fajr/data/CityItem;

    .local v8, "it\\3":Lcom/example/fajr/data/CityItem;
    const/4 v9, 0x0

    .line 120
    .local v9, "$i$a$-filter-CitiesDatabase$searchCities$1\\3\\129\\0":I
    invoke-virtual {v8}, Lcom/example/fajr/data/CityItem;->getCityNameAr()Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    move-object v11, v0

    check-cast v11, Ljava/lang/CharSequence;

    const/4 v12, 0x1

    invoke-static {v10, v11, v12}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_3

    .line 121
    invoke-virtual {v8}, Lcom/example/fajr/data/CityItem;->getCityNameEn()Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    move-object v11, v0

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11, v12}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_3

    .line 122
    invoke-virtual {v8}, Lcom/example/fajr/data/CityItem;->getCountryNameAr()Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    move-object v11, v0

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11, v12}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_3

    .line 123
    invoke-virtual {v8}, Lcom/example/fajr/data/CityItem;->getCountryNameEn()Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    move-object v11, v0

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11, v12}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    nop

    .line 129
    .end local v8    # "it\\3":Lcom/example/fajr/data/CityItem;
    .end local v9    # "$i$a$-filter-CitiesDatabase$searchCities$1\\3\\129\\0":I
    :goto_2
    if-eqz v12, :cond_1

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 130
    .end local v7    # "element\\2":Ljava/lang/Object;
    :cond_4
    nop

    .end local v3    # "destination\\2":Ljava/util/Collection;
    .end local v4    # "$this$filterTo\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filterTo\\2\\128":I
    check-cast v3, Ljava/util/List;

    .line 128
    nop

    .line 119
    .end local v1    # "$this$filter\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$filter\\1\\119":I
    return-object v3
.end method
