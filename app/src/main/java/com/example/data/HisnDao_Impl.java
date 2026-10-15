package com.example.data;

import androidx.autofill.HintConstants;
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

/* compiled from: HisnDao_Impl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u001cH\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u001cH\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00120\u001cH\u0016J\u000e\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u001cH\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u001c2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0016J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120\u001c2\u0006\u0010&\u001a\u00020'H\u0016J\u001e\u0010)\u001a\u00020\u00102\u0006\u0010%\u001a\u00020!2\u0006\u0010*\u001a\u00020!H\u0096@¢\u0006\u0002\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/example/data/HisnDao_Impl;", "Lcom/example/data/HisnDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfHisnChapter", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/HisnChapter;", "__insertAdapterOfHisnItem", "Lcom/example/data/HisnItem;", "__insertAdapterOfHisnFavorite", "Lcom/example/data/HisnFavorite;", "__insertAdapterOfHisnRead", "Lcom/example/data/HisnRead;", "insertChapters", "", "list", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertItems", "addFavorite", "fav", "(Lcom/example/data/HisnFavorite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRead", "read", "(Lcom/example/data/HisnRead;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chapters", "Lkotlinx/coroutines/flow/Flow;", "allItems", "itemCounts", "Lcom/example/data/ChapterItemCount;", "chapterCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favorites", "readToday", "chapterId", "date", "", "chaptersReadOn", "removeFavorite", "itemId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HisnDao_Impl implements HisnDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<HisnChapter> __insertAdapterOfHisnChapter;
    private final EntityInsertAdapter<HisnFavorite> __insertAdapterOfHisnFavorite;
    private final EntityInsertAdapter<HisnItem> __insertAdapterOfHisnItem;
    private final EntityInsertAdapter<HisnRead> __insertAdapterOfHisnRead;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public HisnDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfHisnChapter = new EntityInsertAdapter<HisnChapter>() { // from class: com.example.data.HisnDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `hisn_chapter` (`id`,`order`,`name`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, HisnChapter entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getOrder());
                statement.bindText(3, entity.getName());
            }
        };
        this.__insertAdapterOfHisnItem = new EntityInsertAdapter<HisnItem>() { // from class: com.example.data.HisnDao_Impl.2
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `hisn_item` (`id`,`chapterId`,`order`,`text`,`count`,`fadl`,`source`,`hokm`) VALUES (?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, HisnItem entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getChapterId());
                statement.bindLong(3, entity.getOrder());
                statement.bindText(4, entity.getText());
                statement.bindLong(5, entity.getCount());
                statement.bindText(6, entity.getFadl());
                statement.bindText(7, entity.getSource());
                statement.bindText(8, entity.getHokm());
            }
        };
        this.__insertAdapterOfHisnFavorite = new EntityInsertAdapter<HisnFavorite>() { // from class: com.example.data.HisnDao_Impl.3
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `hisn_favorite` (`id`,`chapterId`,`itemId`) VALUES (nullif(?, 0),?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, HisnFavorite entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getChapterId());
                statement.bindLong(3, entity.getItemId());
            }
        };
        this.__insertAdapterOfHisnRead = new EntityInsertAdapter<HisnRead>() { // from class: com.example.data.HisnDao_Impl.4
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `hisn_read` (`id`,`chapterId`,`dateString`,`timestamp`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, HisnRead entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getChapterId());
                statement.bindText(3, entity.getDateString());
                statement.bindLong(4, entity.getTimestamp());
            }
        };
    }

    @Override // com.example.data.HisnDao
    public Object insertChapters(final List<HisnChapter> list, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.insertChapters$lambda$0(HisnDao_Impl.this, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertChapters$lambda$0(HisnDao_Impl this$0, List $list, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfHisnChapter.insert(_connection, $list);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.HisnDao
    public Object insertItems(final List<HisnItem> list, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.insertItems$lambda$1(HisnDao_Impl.this, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertItems$lambda$1(HisnDao_Impl this$0, List $list, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfHisnItem.insert(_connection, $list);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.HisnDao
    public Object addFavorite(final HisnFavorite fav, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.addFavorite$lambda$2(HisnDao_Impl.this, fav, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit addFavorite$lambda$2(HisnDao_Impl this$0, HisnFavorite $fav, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfHisnFavorite.insert(_connection, (SQLiteConnection) $fav);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.HisnDao
    public Object insertRead(final HisnRead read, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.insertRead$lambda$3(HisnDao_Impl.this, read, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertRead$lambda$3(HisnDao_Impl this$0, HisnRead $read, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfHisnRead.insert(_connection, (SQLiteConnection) $read);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.HisnDao
    public Flow<List<HisnChapter>> chapters() {
        final String _sql = "SELECT * FROM hisn_chapter ORDER BY `order`";
        return FlowUtil.createFlow(this.__db, false, new String[]{"hisn_chapter"}, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.chapters$lambda$4(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List chapters$lambda$4(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfOrder = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "order");
            int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, HintConstants.AUTOFILL_HINT_NAME);
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_columnIndexOfId);
                int _tmpOrder = (int) _stmt.getLong(_columnIndexOfOrder);
                String _tmpName = _stmt.getText(_columnIndexOfName);
                HisnChapter _item = new HisnChapter(_tmpId, _tmpOrder, _tmpName);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HisnDao
    public Flow<List<HisnItem>> allItems() {
        final String _sql = "SELECT * FROM hisn_item ORDER BY chapterId, `order`";
        return FlowUtil.createFlow(this.__db, false, new String[]{"hisn_item"}, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.allItems$lambda$5(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List allItems$lambda$5(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfChapterId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chapterId");
            int _columnIndexOfOrder = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "order");
            int _columnIndexOfText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "text");
            int _columnIndexOfCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "count");
            int _columnIndexOfFadl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fadl");
            int _columnIndexOfSource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "source");
            int _columnIndexOfHokm = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hokm");
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_columnIndexOfId);
                int _columnIndexOfId2 = _columnIndexOfId;
                int _tmpChapterId = (int) _stmt.getLong(_columnIndexOfChapterId);
                int _tmpOrder = (int) _stmt.getLong(_columnIndexOfOrder);
                String _tmpText = _stmt.getText(_columnIndexOfText);
                int _tmpCount = (int) _stmt.getLong(_columnIndexOfCount);
                String _tmpFadl = _stmt.getText(_columnIndexOfFadl);
                String _tmpSource = _stmt.getText(_columnIndexOfSource);
                String _tmpHokm = _stmt.getText(_columnIndexOfHokm);
                HisnItem _item = new HisnItem(_tmpId, _tmpChapterId, _tmpOrder, _tmpText, _tmpCount, _tmpFadl, _tmpSource, _tmpHokm);
                _result.add(_item);
                _columnIndexOfId = _columnIndexOfId2;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HisnDao
    public Flow<List<ChapterItemCount>> itemCounts() {
        final String _sql = "SELECT chapterId, COUNT(*) AS itemCount FROM hisn_item GROUP BY chapterId";
        return FlowUtil.createFlow(this.__db, false, new String[]{"hisn_item"}, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.itemCounts$lambda$6(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List itemCounts$lambda$6(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _tmpChapterId = (int) _stmt.getLong(0);
                int _tmpItemCount = (int) _stmt.getLong(1);
                ChapterItemCount _item = new ChapterItemCount(_tmpChapterId, _tmpItemCount);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HisnDao
    public Object chapterCount(Continuation<? super Integer> continuation) {
        final String _sql = "SELECT COUNT(*) FROM hisn_chapter";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(HisnDao_Impl.chapterCount$lambda$7(_sql, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int chapterCount$lambda$7(String $_sql, SQLiteConnection _connection) {
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

    @Override // com.example.data.HisnDao
    public Flow<List<HisnFavorite>> favorites() {
        final String _sql = "SELECT * FROM hisn_favorite";
        return FlowUtil.createFlow(this.__db, false, new String[]{"hisn_favorite"}, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.favorites$lambda$8(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List favorites$lambda$8(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfChapterId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chapterId");
            int _columnIndexOfItemId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "itemId");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpId = _stmt.getLong(_columnIndexOfId);
                int _tmpChapterId = (int) _stmt.getLong(_columnIndexOfChapterId);
                int _tmpItemId = (int) _stmt.getLong(_columnIndexOfItemId);
                HisnFavorite _item = new HisnFavorite(_tmpId, _tmpChapterId, _tmpItemId);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HisnDao
    public Flow<Integer> readToday(final int chapterId, final String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        final String _sql = "SELECT COUNT(*) FROM hisn_read WHERE chapterId = ? AND dateString = ?";
        return FlowUtil.createFlow(this.__db, false, new String[]{"hisn_read"}, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(HisnDao_Impl.readToday$lambda$9(_sql, chapterId, date, (SQLiteConnection) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int readToday$lambda$9(String $_sql, int $chapterId, String $date, SQLiteConnection _connection) {
        int _tmp;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $chapterId);
            _stmt.bindText(2, $date);
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

    @Override // com.example.data.HisnDao
    public Flow<List<Integer>> chaptersReadOn(final String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        final String _sql = "SELECT chapterId FROM hisn_read WHERE dateString = ? GROUP BY chapterId";
        return FlowUtil.createFlow(this.__db, false, new String[]{"hisn_read"}, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.chaptersReadOn$lambda$10(_sql, date, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List chaptersReadOn$lambda$10(String $_sql, String $date, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $date);
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _item = (int) _stmt.getLong(0);
                _result.add(Integer.valueOf(_item));
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.HisnDao
    public Object removeFavorite(final int chapterId, final int itemId, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM hisn_favorite WHERE chapterId = ? AND itemId = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.HisnDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnDao_Impl.removeFavorite$lambda$11(_sql, chapterId, itemId, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit removeFavorite$lambda$11(String $_sql, int $chapterId, int $itemId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $chapterId);
            _stmt.bindLong(2, $itemId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: HisnDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/HisnDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
