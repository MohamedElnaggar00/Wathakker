package com.example.data;

import androidx.room.EntityDeleteOrUpdateAdapter;
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

/* compiled from: DhikrDao_Impl.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u0018H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u0018H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u0018H\u0016J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0096@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/example/data/DhikrDao_Impl;", "Lcom/example/data/DhikrDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfDhikr", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/Dhikr;", "__converters", "Lcom/example/data/Converters;", "__updateAdapterOfDhikr", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "insertDhikr", "", "dhikr", "(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "", "dhikrList", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDhikr", "getAllDhikr", "Lkotlinx/coroutines/flow/Flow;", "getFavoriteDhikr", "getEnabledDhikr", "getEnabledDhikrSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDhikrById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "lastReadTime", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDhikrById", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DhikrDao_Impl implements DhikrDao {
    private final Converters __converters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Dhikr> __insertAdapterOfDhikr;
    private final EntityDeleteOrUpdateAdapter<Dhikr> __updateAdapterOfDhikr;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DhikrDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new Converters();
        this.__db = __db;
        this.__insertAdapterOfDhikr = new EntityInsertAdapter<Dhikr>() { // from class: com.example.data.DhikrDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `dhikr_table` (`id`,`title`,`content`,`isFavorite`,`reminderTimes`,`isEnabled`,`readCount`,`lastReadTime`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, Dhikr entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindText(2, entity.getTitle());
                statement.bindText(3, entity.getContent());
                statement.bindLong(4, entity.isFavorite() ? 1L : 0L);
                statement.bindText(5, DhikrDao_Impl.this.__converters.toString(entity.getReminderTimes()));
                statement.bindLong(6, entity.isEnabled() ? 1L : 0L);
                statement.bindLong(7, entity.getReadCount());
                statement.bindLong(8, entity.getLastReadTime());
            }
        };
        this.__updateAdapterOfDhikr = new EntityDeleteOrUpdateAdapter<Dhikr>() { // from class: com.example.data.DhikrDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "UPDATE OR ABORT `dhikr_table` SET `id` = ?,`title` = ?,`content` = ?,`isFavorite` = ?,`reminderTimes` = ?,`isEnabled` = ?,`readCount` = ?,`lastReadTime` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, Dhikr entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindText(2, entity.getTitle());
                statement.bindText(3, entity.getContent());
                statement.bindLong(4, entity.isFavorite() ? 1L : 0L);
                statement.bindText(5, DhikrDao_Impl.this.__converters.toString(entity.getReminderTimes()));
                statement.bindLong(6, entity.isEnabled() ? 1L : 0L);
                statement.bindLong(7, entity.getReadCount());
                statement.bindLong(8, entity.getLastReadTime());
                statement.bindLong(9, entity.getId());
            }
        };
    }

    @Override // com.example.data.DhikrDao
    public Object insertDhikr(final Dhikr dhikr, Continuation<? super Long> continuation) {
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(DhikrDao_Impl.insertDhikr$lambda$0(DhikrDao_Impl.this, dhikr, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long insertDhikr$lambda$0(DhikrDao_Impl this$0, Dhikr $dhikr, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        long _result = this$0.__insertAdapterOfDhikr.insertAndReturnId(_connection, $dhikr);
        return _result;
    }

    @Override // com.example.data.DhikrDao
    public Object insertAll(final List<Dhikr> list, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.insertAll$lambda$1(DhikrDao_Impl.this, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertAll$lambda$1(DhikrDao_Impl this$0, List $dhikrList, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfDhikr.insert(_connection, $dhikrList);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.DhikrDao
    public Object updateDhikr(final Dhikr dhikr, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.updateDhikr$lambda$2(DhikrDao_Impl.this, dhikr, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit updateDhikr$lambda$2(DhikrDao_Impl this$0, Dhikr $dhikr, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__updateAdapterOfDhikr.handle(_connection, $dhikr);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.DhikrDao
    public Flow<List<Dhikr>> getAllDhikr() {
        final String _sql = "SELECT * FROM dhikr_table";
        return FlowUtil.createFlow(this.__db, false, new String[]{"dhikr_table"}, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.getAllDhikr$lambda$3(_sql, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllDhikr$lambda$3(String $_sql, DhikrDao_Impl this$0, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _tmp_2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
            int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
            int _columnIndexOfIsFavorite = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isFavorite");
            int _columnIndexOfReminderTimes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reminderTimes");
            int _columnIndexOfIsEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isEnabled");
            int _columnIndexOfReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "readCount");
            int _columnIndexOfLastReadTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadTime");
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_tmp_2);
                String _tmpTitle = _stmt.getText(_columnIndexOfTitle);
                String _tmpContent = _stmt.getText(_columnIndexOfContent);
                int _columnIndexOfId = _tmp_2;
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsFavorite);
                boolean _tmpIsFavorite = _tmp != 0;
                String _tmp_1 = _stmt.getText(_columnIndexOfReminderTimes);
                List _tmpReminderTimes = this$0.__converters.fromString(_tmp_1);
                int _tmp_22 = (int) _stmt.getLong(_columnIndexOfIsEnabled);
                boolean _tmpIsEnabled = _tmp_22 != 0;
                int _tmpReadCount = (int) _stmt.getLong(_columnIndexOfReadCount);
                long _tmpLastReadTime = _stmt.getLong(_columnIndexOfLastReadTime);
                Dhikr _item = new Dhikr(_tmpId, _tmpTitle, _tmpContent, _tmpIsFavorite, _tmpReminderTimes, _tmpIsEnabled, _tmpReadCount, _tmpLastReadTime);
                _result.add(_item);
                _tmp_2 = _columnIndexOfId;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.DhikrDao
    public Flow<List<Dhikr>> getFavoriteDhikr() {
        final String _sql = "SELECT * FROM dhikr_table WHERE isFavorite = 1";
        return FlowUtil.createFlow(this.__db, false, new String[]{"dhikr_table"}, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.getFavoriteDhikr$lambda$4(_sql, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getFavoriteDhikr$lambda$4(String $_sql, DhikrDao_Impl this$0, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _tmp_2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
            int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
            int _columnIndexOfIsFavorite = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isFavorite");
            int _columnIndexOfReminderTimes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reminderTimes");
            int _columnIndexOfIsEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isEnabled");
            int _columnIndexOfReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "readCount");
            int _columnIndexOfLastReadTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadTime");
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_tmp_2);
                String _tmpTitle = _stmt.getText(_columnIndexOfTitle);
                String _tmpContent = _stmt.getText(_columnIndexOfContent);
                int _columnIndexOfId = _tmp_2;
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsFavorite);
                boolean _tmpIsFavorite = _tmp != 0;
                String _tmp_1 = _stmt.getText(_columnIndexOfReminderTimes);
                List _tmpReminderTimes = this$0.__converters.fromString(_tmp_1);
                int _tmp_22 = (int) _stmt.getLong(_columnIndexOfIsEnabled);
                boolean _tmpIsEnabled = _tmp_22 != 0;
                int _tmpReadCount = (int) _stmt.getLong(_columnIndexOfReadCount);
                long _tmpLastReadTime = _stmt.getLong(_columnIndexOfLastReadTime);
                Dhikr _item = new Dhikr(_tmpId, _tmpTitle, _tmpContent, _tmpIsFavorite, _tmpReminderTimes, _tmpIsEnabled, _tmpReadCount, _tmpLastReadTime);
                _result.add(_item);
                _tmp_2 = _columnIndexOfId;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.DhikrDao
    public Flow<List<Dhikr>> getEnabledDhikr() {
        final String _sql = "SELECT * FROM dhikr_table WHERE isEnabled = 1";
        return FlowUtil.createFlow(this.__db, false, new String[]{"dhikr_table"}, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.getEnabledDhikr$lambda$5(_sql, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getEnabledDhikr$lambda$5(String $_sql, DhikrDao_Impl this$0, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _tmp_2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
            int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
            int _columnIndexOfIsFavorite = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isFavorite");
            int _columnIndexOfReminderTimes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reminderTimes");
            int _columnIndexOfIsEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isEnabled");
            int _columnIndexOfReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "readCount");
            int _columnIndexOfLastReadTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadTime");
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_tmp_2);
                String _tmpTitle = _stmt.getText(_columnIndexOfTitle);
                String _tmpContent = _stmt.getText(_columnIndexOfContent);
                int _columnIndexOfId = _tmp_2;
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsFavorite);
                boolean _tmpIsFavorite = _tmp != 0;
                String _tmp_1 = _stmt.getText(_columnIndexOfReminderTimes);
                List _tmpReminderTimes = this$0.__converters.fromString(_tmp_1);
                int _tmp_22 = (int) _stmt.getLong(_columnIndexOfIsEnabled);
                boolean _tmpIsEnabled = _tmp_22 != 0;
                int _tmpReadCount = (int) _stmt.getLong(_columnIndexOfReadCount);
                long _tmpLastReadTime = _stmt.getLong(_columnIndexOfLastReadTime);
                Dhikr _item = new Dhikr(_tmpId, _tmpTitle, _tmpContent, _tmpIsFavorite, _tmpReminderTimes, _tmpIsEnabled, _tmpReadCount, _tmpLastReadTime);
                _result.add(_item);
                _tmp_2 = _columnIndexOfId;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.DhikrDao
    public Object getEnabledDhikrSync(Continuation<? super List<Dhikr>> continuation) {
        final String _sql = "SELECT * FROM dhikr_table WHERE isEnabled = 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.getEnabledDhikrSync$lambda$6(_sql, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getEnabledDhikrSync$lambda$6(String $_sql, DhikrDao_Impl this$0, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _tmp_2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
            int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
            int _columnIndexOfIsFavorite = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isFavorite");
            int _columnIndexOfReminderTimes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reminderTimes");
            int _columnIndexOfIsEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isEnabled");
            int _columnIndexOfReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "readCount");
            int _columnIndexOfLastReadTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadTime");
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_tmp_2);
                String _tmpTitle = _stmt.getText(_columnIndexOfTitle);
                String _tmpContent = _stmt.getText(_columnIndexOfContent);
                int _columnIndexOfId = _tmp_2;
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsFavorite);
                boolean _tmpIsFavorite = _tmp != 0;
                String _tmp_1 = _stmt.getText(_columnIndexOfReminderTimes);
                List _tmpReminderTimes = this$0.__converters.fromString(_tmp_1);
                int _tmp_22 = (int) _stmt.getLong(_columnIndexOfIsEnabled);
                boolean _tmpIsEnabled = _tmp_22 != 0;
                int _tmpReadCount = (int) _stmt.getLong(_columnIndexOfReadCount);
                long _tmpLastReadTime = _stmt.getLong(_columnIndexOfLastReadTime);
                Dhikr _item = new Dhikr(_tmpId, _tmpTitle, _tmpContent, _tmpIsFavorite, _tmpReminderTimes, _tmpIsEnabled, _tmpReadCount, _tmpLastReadTime);
                _result.add(_item);
                _tmp_2 = _columnIndexOfId;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.DhikrDao
    public Object getDhikrById(final int id, Continuation<? super Dhikr> continuation) {
        final String _sql = "SELECT * FROM dhikr_table WHERE id = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.getDhikrById$lambda$7(_sql, id, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Dhikr getDhikrById$lambda$7(String $_sql, int $id, DhikrDao_Impl this$0, SQLiteConnection _connection) {
        Dhikr _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $id);
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
            int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
            int _columnIndexOfIsFavorite = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isFavorite");
            int _columnIndexOfReminderTimes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reminderTimes");
            int _columnIndexOfIsEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isEnabled");
            int _columnIndexOfReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "readCount");
            int _columnIndexOfLastReadTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadTime");
            if (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_columnIndexOfId);
                String _tmpTitle = _stmt.getText(_columnIndexOfTitle);
                String _tmpContent = _stmt.getText(_columnIndexOfContent);
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsFavorite);
                boolean _tmpIsFavorite = _tmp != 0;
                String _tmp_1 = _stmt.getText(_columnIndexOfReminderTimes);
                List _tmpReminderTimes = this$0.__converters.fromString(_tmp_1);
                int _tmp_2 = (int) _stmt.getLong(_columnIndexOfIsEnabled);
                boolean _tmpIsEnabled = _tmp_2 != 0;
                int _tmpReadCount = (int) _stmt.getLong(_columnIndexOfReadCount);
                long _tmpLastReadTime = _stmt.getLong(_columnIndexOfLastReadTime);
                _result = new Dhikr(_tmpId, _tmpTitle, _tmpContent, _tmpIsFavorite, _tmpReminderTimes, _tmpIsEnabled, _tmpReadCount, _tmpLastReadTime);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.DhikrDao
    public Object markAsRead(final int id, final long lastReadTime, Continuation<? super Unit> continuation) {
        final String _sql = "UPDATE dhikr_table SET readCount = readCount + 1, lastReadTime = ? WHERE id = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.markAsRead$lambda$8(_sql, lastReadTime, id, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit markAsRead$lambda$8(String $_sql, long $lastReadTime, int $id, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $lastReadTime);
            _stmt.bindLong(2, $id);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.example.data.DhikrDao
    public Object deleteDhikrById(final int id, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM dhikr_table WHERE id = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.DhikrDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DhikrDao_Impl.deleteDhikrById$lambda$9(_sql, id, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteDhikrById$lambda$9(String $_sql, int $id, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $id);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: DhikrDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/DhikrDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
