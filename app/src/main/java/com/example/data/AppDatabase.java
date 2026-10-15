package com.example.data;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: AppDatabase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/example/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "dhikrDao", "Lcom/example/data/DhikrDao;", "tagDao", "Lcom/example/data/TagDao;", "historyDao", "Lcom/example/data/HistoryDao;", "hisnDao", "Lcom/example/data/HisnDao;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AppDatabase extends RoomDatabase {
    private static volatile AppDatabase INSTANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Migration MIGRATION_7_8 = new Migration() { // from class: com.example.data.AppDatabase$Companion$MIGRATION_7_8$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS `hisn_chapter` (`id` INTEGER NOT NULL, `order` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db.execSQL("CREATE TABLE IF NOT EXISTS `hisn_item` (`id` INTEGER NOT NULL, `chapterId` INTEGER NOT NULL, `order` INTEGER NOT NULL, `text` TEXT NOT NULL, `count` INTEGER NOT NULL, `fadl` TEXT NOT NULL, `source` TEXT NOT NULL, `hokm` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db.execSQL("CREATE INDEX IF NOT EXISTS `index_hisn_item_chapterId` ON `hisn_item` (`chapterId`)");
            db.execSQL("CREATE TABLE IF NOT EXISTS `hisn_favorite` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chapterId` INTEGER NOT NULL, `itemId` INTEGER NOT NULL)");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_hisn_favorite_chapterId_itemId` ON `hisn_favorite` (`chapterId`, `itemId`)");
            db.execSQL("CREATE TABLE IF NOT EXISTS `hisn_read` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chapterId` INTEGER NOT NULL, `dateString` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
        }
    };

    public abstract DhikrDao dhikrDao();

    public abstract HisnDao hisnDao();

    public abstract HistoryDao historyDao();

    public abstract TagDao tagDao();

    /* compiled from: AppDatabase.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/data/AppDatabase$Companion;", "", "<init>", "()V", "MIGRATION_7_8", "Landroidx/room/migration/Migration;", "getMIGRATION_7_8", "()Landroidx/room/migration/Migration;", "INSTANCE", "Lcom/example/data/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Migration getMIGRATION_7_8() {
            return AppDatabase.MIGRATION_7_8;
        }

        public final AppDatabase getDatabase(Context context) {
            AppDatabase appDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            AppDatabase appDatabase2 = AppDatabase.INSTANCE;
            if (appDatabase2 != null) {
                return appDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                appDatabase = (AppDatabase) Room.databaseBuilder(applicationContext, AppDatabase.class, "wazakkir_database").addMigrations(AppDatabase.INSTANCE.getMIGRATION_7_8()).fallbackToDestructiveMigration().addCallback(new RoomDatabase.Callback() { // from class: com.example.data.AppDatabase$Companion$getDatabase$1$instance$1
                    @Override // androidx.room.RoomDatabase.Callback
                    public void onCreate(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onCreate(db);
                        BuildersKt.launch(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, kotlinx.coroutines.CoroutineStart.DEFAULT, new AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1(null));
                    }
                }).build();
                Companion companion = AppDatabase.INSTANCE;
                AppDatabase.INSTANCE = appDatabase;
            }
            return appDatabase;
        }
    }
}
