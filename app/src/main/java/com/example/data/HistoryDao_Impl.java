package com.example.data;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: HistoryDao_Impl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000eH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000eH\u0016J\u000e\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/example/data/HistoryDao_Impl;", "Lcom/example/data/HistoryDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfDhikrHistory", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/DhikrHistory;", "insertHistory", "", "history", "(Lcom/example/data/DhikrHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllHistory", "Lkotlinx/coroutines/flow/Flow;", "", "getCountSince", "", "startTime", "getTotalCount", "getDistinctReadDates", "", "clearHistory", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HistoryDao_Impl implements HistoryDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<DhikrHistory> __insertAdapterOfDhikrHistory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public HistoryDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfDhikrHistory = new EntityInsertAdapter<DhikrHistory>() { // from class: com.example.data.HistoryDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `dhikr_history` (`historyId`,`dhikrId`,`timestamp`,`dateString`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, DhikrHistory entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo7532bindLong(1, entity.getHistoryId());
                statement.mo7532bindLong(2, entity.getDhikrId());
                statement.mo7532bindLong(3, entity.getTimestamp());
                statement.mo7534bindText(4, entity.getDateString());
            }
        };
    }

    @Override // com.example.data.HistoryDao
    public Object insertHistory(final DhikrHistory history, Continuation<? super Long> continuation) {
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.HistoryDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(HistoryDao_Impl.insertHistory$lambda$0(HistoryDao_Impl.this, history, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long insertHistory$lambda$0(HistoryDao_Impl this$0, DhikrHistory $history, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        long _result = this$0.__insertAdapterOfDhikrHistory.insertAndReturnId(_connection, $history);
        return _result;
    }

    @Override // com.example.data.HistoryDao
    public Flow<List<DhikrHistory>> getAllHistory() {
        final String _sql = "SELECT * FROM dhikr_history ORDER BY timestamp DESC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"dhikr_history"}, new Function1() { // from class: com.example.data.HistoryDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDao_Impl.getAllHistory$lambda$1(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllHistory$lambda$1(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfHistoryId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "historyId");
            int _columnIndexOfDhikrId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "dhikrId");
            int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
            int _columnIndexOfDateString = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "dateString");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpHistoryId = _stmt.getLong(_columnIndexOfHistoryId);
                int _tmpDhikrId = (int) _stmt.getLong(_columnIndexOfDhikrId);
                long _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
                String _tmpDateString = _stmt.getText(_columnIndexOfDateString);
                DhikrHistory _item = new DhikrHistory(_tmpHistoryId, _tmpDhikrId, _tmpTimestamp, _tmpDateString);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HistoryDao
    public Flow<Integer> getCountSince(final long startTime) {
        final String _sql = "SELECT COUNT(*) FROM dhikr_history WHERE timestamp >= ?";
        return FlowUtil.createFlow(this.__db, false, new String[]{"dhikr_history"}, new Function1() { // from class: com.example.data.HistoryDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(HistoryDao_Impl.getCountSince$lambda$2(_sql, startTime, (SQLiteConnection) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int getCountSince$lambda$2(String $_sql, long $startTime, SQLiteConnection _connection) {
        int _tmp;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo7532bindLong(1, $startTime);
            if (_stmt.step()) {
                _tmp = (int) _stmt.getLong(0);
            } else {
                _tmp = 0;
            }
            return _tmp;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HistoryDao
    public Flow<Integer> getTotalCount() {
        final String _sql = "SELECT COUNT(*) FROM dhikr_history";
        return FlowUtil.createFlow(this.__db, false, new String[]{"dhikr_history"}, new Function1() { // from class: com.example.data.HistoryDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(HistoryDao_Impl.getTotalCount$lambda$3(_sql, (SQLiteConnection) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int getTotalCount$lambda$3(String $_sql, SQLiteConnection _connection) {
        int _tmp;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            if (_stmt.step()) {
                _tmp = (int) _stmt.getLong(0);
            } else {
                _tmp = 0;
            }
            return _tmp;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HistoryDao
    public Flow<List<String>> getDistinctReadDates() {
        final String _sql = "SELECT DISTINCT dateString FROM dhikr_history ORDER BY dateString DESC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"dhikr_history"}, new Function1() { // from class: com.example.data.HistoryDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDao_Impl.getDistinctReadDates$lambda$4(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getDistinctReadDates$lambda$4(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _item = _stmt.getText(0);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HistoryDao
    public Object clearHistory(Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM dhikr_history";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.HistoryDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDao_Impl.clearHistory$lambda$5(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit clearHistory$lambda$5(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: HistoryDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/HistoryDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
