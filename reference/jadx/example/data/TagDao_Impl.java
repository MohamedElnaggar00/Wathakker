package com.example.data;

import androidx.autofill.HintConstants;
import androidx.collection.LongSparseArray;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
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

/* compiled from: TagDao_Impl.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH\u0096@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0013J$\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0096@¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001a0$H\u0016J\u0018\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010&\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020*H\u0096@¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001a0$H\u0016J\u0018\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u001f\u001a\u00020 H\u0096@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001a0$2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0096@¢\u0006\u0002\u0010/J\u0016\u00102\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010'J\u0016\u00103\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0096@¢\u0006\u0002\u0010/J\u0016\u00104\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010'J$\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0:09H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/example/data/TagDao_Impl;", "Lcom/example/data/TagDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfTag", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/Tag;", "__insertAdapterOfDhikrTagCrossRef", "Lcom/example/data/DhikrTagCrossRef;", "__deleteAdapterOfTag", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "__updateAdapterOfTag", "__converters", "Lcom/example/data/Converters;", "insertTag", "", "tag", "(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDhikrTagCrossRef", "", "crossRef", "(Lcom/example/data/DhikrTagCrossRef;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDhikrTagCrossRefs", "crossRefs", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTag", "updateTag", "updateDhikrTags", "dhikrId", "", "tagIds", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTags", "Lkotlinx/coroutines/flow/Flow;", "getTagById", "tagId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTagByName", HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDhikrsWithTags", "Lcom/example/data/DhikrWithTags;", "getDhikrWithTagsById", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTagsForDhikr", "getTagsForDhikrSync", "deleteTagById", "deleteTagsForDhikr", "deleteDhikrRefsForTag", "__fetchRelationshiptagTableAscomExampleDataTag", "_connection", "Landroidx/sqlite/SQLiteConnection;", "_map", "Landroidx/collection/LongSparseArray;", "", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TagDao_Impl implements TagDao {
    private final Converters __converters;
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<Tag> __deleteAdapterOfTag;
    private final EntityInsertAdapter<DhikrTagCrossRef> __insertAdapterOfDhikrTagCrossRef;
    private final EntityInsertAdapter<Tag> __insertAdapterOfTag;
    private final EntityDeleteOrUpdateAdapter<Tag> __updateAdapterOfTag;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public TagDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new Converters();
        this.__db = __db;
        this.__insertAdapterOfTag = new EntityInsertAdapter<Tag>() { // from class: com.example.data.TagDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `tag_table` (`tagId`,`name`,`colorHex`) VALUES (nullif(?, 0),?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, Tag entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo7532bindLong(1, entity.getTagId());
                statement.mo7534bindText(2, entity.getName());
                statement.mo7534bindText(3, entity.getColorHex());
            }
        };
        this.__insertAdapterOfDhikrTagCrossRef = new EntityInsertAdapter<DhikrTagCrossRef>() { // from class: com.example.data.TagDao_Impl.2
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `dhikr_tag_cross_ref` (`dhikrId`,`tagId`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, DhikrTagCrossRef entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo7532bindLong(1, entity.getDhikrId());
                statement.mo7532bindLong(2, entity.getTagId());
            }
        };
        this.__deleteAdapterOfTag = new EntityDeleteOrUpdateAdapter<Tag>() { // from class: com.example.data.TagDao_Impl.3
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "DELETE FROM `tag_table` WHERE `tagId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, Tag entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo7532bindLong(1, entity.getTagId());
            }
        };
        this.__updateAdapterOfTag = new EntityDeleteOrUpdateAdapter<Tag>() { // from class: com.example.data.TagDao_Impl.4
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "UPDATE OR ABORT `tag_table` SET `tagId` = ?,`name` = ?,`colorHex` = ? WHERE `tagId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, Tag entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo7532bindLong(1, entity.getTagId());
                statement.mo7534bindText(2, entity.getName());
                statement.mo7534bindText(3, entity.getColorHex());
                statement.mo7532bindLong(4, entity.getTagId());
            }
        };
    }

    @Override // com.example.data.TagDao
    public Object insertTag(final Tag tag, Continuation<? super Long> continuation) {
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(TagDao_Impl.insertTag$lambda$0(TagDao_Impl.this, tag, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long insertTag$lambda$0(TagDao_Impl this$0, Tag $tag, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        long _result = this$0.__insertAdapterOfTag.insertAndReturnId(_connection, $tag);
        return _result;
    }

    @Override // com.example.data.TagDao
    public Object insertDhikrTagCrossRef(final DhikrTagCrossRef crossRef, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.insertDhikrTagCrossRef$lambda$1(TagDao_Impl.this, crossRef, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertDhikrTagCrossRef$lambda$1(TagDao_Impl this$0, DhikrTagCrossRef $crossRef, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfDhikrTagCrossRef.insert(_connection, (SQLiteConnection) $crossRef);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.TagDao
    public Object insertDhikrTagCrossRefs(final List<DhikrTagCrossRef> list, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.insertDhikrTagCrossRefs$lambda$2(TagDao_Impl.this, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertDhikrTagCrossRefs$lambda$2(TagDao_Impl this$0, List $crossRefs, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfDhikrTagCrossRef.insert(_connection, $crossRefs);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.TagDao
    public Object deleteTag(final Tag tag, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.deleteTag$lambda$3(TagDao_Impl.this, tag, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteTag$lambda$3(TagDao_Impl this$0, Tag $tag, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__deleteAdapterOfTag.handle(_connection, $tag);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.TagDao
    public Object updateTag(final Tag tag, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.updateTag$lambda$4(TagDao_Impl.this, tag, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit updateTag$lambda$4(TagDao_Impl this$0, Tag $tag, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__updateAdapterOfTag.handle(_connection, $tag);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.TagDao
    public Object updateDhikrTags(int dhikrId, List<Long> list, Continuation<? super Unit> continuation) {
        Object performInTransactionSuspending = DBUtil.performInTransactionSuspending(this.__db, new TagDao_Impl$updateDhikrTags$2(this, dhikrId, list, null), continuation);
        return performInTransactionSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performInTransactionSuspending : Unit.INSTANCE;
    }

    @Override // com.example.data.TagDao
    public Flow<List<Tag>> getAllTags() {
        final String _sql = "SELECT * FROM tag_table ORDER BY name ASC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"tag_table"}, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.getAllTags$lambda$5(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllTags$lambda$5(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfTagId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tagId");
            int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, HintConstants.AUTOFILL_HINT_NAME);
            int _columnIndexOfColorHex = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "colorHex");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpTagId = _stmt.getLong(_columnIndexOfTagId);
                String _tmpName = _stmt.getText(_columnIndexOfName);
                String _tmpColorHex = _stmt.getText(_columnIndexOfColorHex);
                Tag _item = new Tag(_tmpTagId, _tmpName, _tmpColorHex);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.TagDao
    public Object getTagById(final long tagId, Continuation<? super Tag> continuation) {
        final String _sql = "SELECT * FROM tag_table WHERE tagId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.getTagById$lambda$6(_sql, tagId, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Tag getTagById$lambda$6(String $_sql, long $tagId, SQLiteConnection _connection) {
        Tag _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo7532bindLong(1, $tagId);
            int _columnIndexOfTagId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tagId");
            int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, HintConstants.AUTOFILL_HINT_NAME);
            int _columnIndexOfColorHex = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "colorHex");
            if (_stmt.step()) {
                long _tmpTagId = _stmt.getLong(_columnIndexOfTagId);
                String _tmpName = _stmt.getText(_columnIndexOfName);
                String _tmpColorHex = _stmt.getText(_columnIndexOfColorHex);
                _result = new Tag(_tmpTagId, _tmpName, _tmpColorHex);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.TagDao
    public Object getTagByName(final String name, Continuation<? super Tag> continuation) {
        final String _sql = "SELECT * FROM tag_table WHERE name = ? LIMIT 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.getTagByName$lambda$7(_sql, name, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Tag getTagByName$lambda$7(String $_sql, String $name, SQLiteConnection _connection) {
        Tag _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo7534bindText(1, $name);
            int _columnIndexOfTagId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tagId");
            int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, HintConstants.AUTOFILL_HINT_NAME);
            int _columnIndexOfColorHex = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "colorHex");
            if (_stmt.step()) {
                long _tmpTagId = _stmt.getLong(_columnIndexOfTagId);
                String _tmpName = _stmt.getText(_columnIndexOfName);
                String _tmpColorHex = _stmt.getText(_columnIndexOfColorHex);
                _result = new Tag(_tmpTagId, _tmpName, _tmpColorHex);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.TagDao
    public Flow<List<DhikrWithTags>> getDhikrsWithTags() {
        final String _sql = "SELECT * FROM dhikr_table";
        return FlowUtil.createFlow(this.__db, true, new String[]{"dhikr_tag_cross_ref", "tag_table", "dhikr_table"}, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.getDhikrsWithTags$lambda$8(_sql, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getDhikrsWithTags$lambda$8(String $_sql, TagDao_Impl this$0, SQLiteConnection _connection) {
        TagDao_Impl tagDao_Impl = this$0;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
            int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
            int _columnIndexOfIsFavorite = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isFavorite");
            int _columnIndexOfReminderTimes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reminderTimes");
            int _columnIndexOfIsEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isEnabled");
            int _columnIndexOfReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "readCount");
            int _columnIndexOfLastReadTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadTime");
            LongSparseArray _collectionTags = new LongSparseArray(0, 1, null);
            while (_stmt.step()) {
                long _tmpKey = _stmt.getLong(_columnIndexOfId);
                if (!_collectionTags.containsKey(_tmpKey)) {
                    _collectionTags.put(_tmpKey, new ArrayList());
                }
            }
            _stmt.reset();
            tagDao_Impl.__fetchRelationshiptagTableAscomExampleDataTag(_connection, _collectionTags);
            List _result = new ArrayList();
            while (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_columnIndexOfId);
                String _tmpTitle = _stmt.getText(_columnIndexOfTitle);
                String _tmpContent = _stmt.getText(_columnIndexOfContent);
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsFavorite);
                boolean _tmpIsFavorite = _tmp != 0;
                String _tmp_1 = _stmt.getText(_columnIndexOfReminderTimes);
                List _tmpReminderTimes = tagDao_Impl.__converters.fromString(_tmp_1);
                int _tmp_2 = (int) _stmt.getLong(_columnIndexOfIsEnabled);
                boolean _tmpIsEnabled = _tmp_2 != 0;
                int _tmpReadCount = (int) _stmt.getLong(_columnIndexOfReadCount);
                long _tmpLastReadTime = _stmt.getLong(_columnIndexOfLastReadTime);
                Dhikr _tmpDhikr = new Dhikr(_tmpId, _tmpTitle, _tmpContent, _tmpIsFavorite, _tmpReminderTimes, _tmpIsEnabled, _tmpReadCount, _tmpLastReadTime);
                long _tmpKey_1 = _stmt.getLong(_columnIndexOfId);
                List<Tag> list = _collectionTags.get(_tmpKey_1);
                if (list == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                List<Tag> _tmpTagsCollection = list;
                int _columnIndexOfId2 = _columnIndexOfId;
                DhikrWithTags _item = new DhikrWithTags(_tmpDhikr, _tmpTagsCollection);
                _result.add(_item);
                tagDao_Impl = this$0;
                _columnIndexOfId = _columnIndexOfId2;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.TagDao
    public Object getDhikrWithTagsById(final int dhikrId, Continuation<? super DhikrWithTags> continuation) {
        final String _sql = "SELECT * FROM dhikr_table WHERE id = ?";
        return DBUtil.performSuspending(this.__db, true, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.getDhikrWithTagsById$lambda$9(_sql, dhikrId, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final DhikrWithTags getDhikrWithTagsById$lambda$9(String $_sql, int $dhikrId, TagDao_Impl this$0, SQLiteConnection _connection) {
        SQLiteStatement _stmt;
        DhikrWithTags _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt2 = _connection.prepare($_sql);
        try {
            _stmt2.mo7532bindLong(1, $dhikrId);
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt2, "id");
            int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt2, "title");
            int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt2, "content");
            int _columnIndexOfIsFavorite = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt2, "isFavorite");
            int _columnIndexOfReminderTimes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt2, "reminderTimes");
            int _columnIndexOfIsEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt2, "isEnabled");
            int _columnIndexOfReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt2, "readCount");
            int _columnIndexOfLastReadTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt2, "lastReadTime");
            LongSparseArray _collectionTags = new LongSparseArray(0, 1, null);
            while (_stmt2.step()) {
                long _tmpKey = _stmt2.getLong(_columnIndexOfId);
                _stmt = _stmt2;
                try {
                    if (_collectionTags.containsKey(_tmpKey)) {
                        _stmt2 = _stmt;
                    } else {
                        _collectionTags.put(_tmpKey, new ArrayList());
                        _stmt2 = _stmt;
                    }
                } catch (Throwable th) {
                    th = th;
                    _stmt.close();
                    throw th;
                }
            }
            SQLiteStatement _stmt3 = _stmt2;
            _stmt3.reset();
            this$0.__fetchRelationshiptagTableAscomExampleDataTag(_connection, _collectionTags);
            if (_stmt3.step()) {
                int _tmpId = (int) _stmt3.getLong(_columnIndexOfId);
                String _tmpTitle = _stmt3.getText(_columnIndexOfTitle);
                String _tmpContent = _stmt3.getText(_columnIndexOfContent);
                int _tmp = (int) _stmt3.getLong(_columnIndexOfIsFavorite);
                boolean _tmpIsFavorite = _tmp != 0;
                String _tmp_1 = _stmt3.getText(_columnIndexOfReminderTimes);
                List _tmpReminderTimes = this$0.__converters.fromString(_tmp_1);
                int _tmp_2 = (int) _stmt3.getLong(_columnIndexOfIsEnabled);
                boolean _tmpIsEnabled = _tmp_2 != 0;
                int _tmpReadCount = (int) _stmt3.getLong(_columnIndexOfReadCount);
                long _tmpLastReadTime = _stmt3.getLong(_columnIndexOfLastReadTime);
                Dhikr _tmpDhikr = new Dhikr(_tmpId, _tmpTitle, _tmpContent, _tmpIsFavorite, _tmpReminderTimes, _tmpIsEnabled, _tmpReadCount, _tmpLastReadTime);
                long _tmpKey_1 = _stmt3.getLong(_columnIndexOfId);
                List<Tag> list = _collectionTags.get(_tmpKey_1);
                if (list == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                List<Tag> _tmpTagsCollection = list;
                _result = new DhikrWithTags(_tmpDhikr, _tmpTagsCollection);
            } else {
                _result = null;
            }
            _stmt3.close();
            return _result;
        } catch (Throwable th2) {
            th = th2;
            _stmt = _stmt2;
        }
    }

    @Override // com.example.data.TagDao
    public Flow<List<Tag>> getTagsForDhikr(final int dhikrId) {
        final String _sql = "SELECT T.* FROM tag_table T INNER JOIN dhikr_tag_cross_ref R ON T.tagId = R.tagId WHERE R.dhikrId = ?";
        return FlowUtil.createFlow(this.__db, false, new String[]{"tag_table", "dhikr_tag_cross_ref"}, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.getTagsForDhikr$lambda$10(_sql, dhikrId, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getTagsForDhikr$lambda$10(String $_sql, int $dhikrId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo7532bindLong(1, $dhikrId);
            int _columnIndexOfTagId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tagId");
            int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, HintConstants.AUTOFILL_HINT_NAME);
            int _columnIndexOfColorHex = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "colorHex");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpTagId = _stmt.getLong(_columnIndexOfTagId);
                String _tmpName = _stmt.getText(_columnIndexOfName);
                String _tmpColorHex = _stmt.getText(_columnIndexOfColorHex);
                Tag _item = new Tag(_tmpTagId, _tmpName, _tmpColorHex);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.TagDao
    public Object getTagsForDhikrSync(final int dhikrId, Continuation<? super List<Tag>> continuation) {
        final String _sql = "SELECT T.* FROM tag_table T INNER JOIN dhikr_tag_cross_ref R ON T.tagId = R.tagId WHERE R.dhikrId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.getTagsForDhikrSync$lambda$11(_sql, dhikrId, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getTagsForDhikrSync$lambda$11(String $_sql, int $dhikrId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo7532bindLong(1, $dhikrId);
            int _columnIndexOfTagId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tagId");
            int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, HintConstants.AUTOFILL_HINT_NAME);
            int _columnIndexOfColorHex = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "colorHex");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpTagId = _stmt.getLong(_columnIndexOfTagId);
                String _tmpName = _stmt.getText(_columnIndexOfName);
                String _tmpColorHex = _stmt.getText(_columnIndexOfColorHex);
                Tag _item = new Tag(_tmpTagId, _tmpName, _tmpColorHex);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.TagDao
    public Object deleteTagById(final long tagId, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM tag_table WHERE tagId = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.deleteTagById$lambda$12(_sql, tagId, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteTagById$lambda$12(String $_sql, long $tagId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo7532bindLong(1, $tagId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.example.data.TagDao
    public Object deleteTagsForDhikr(final int dhikrId, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM dhikr_tag_cross_ref WHERE dhikrId = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.deleteTagsForDhikr$lambda$13(_sql, dhikrId, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteTagsForDhikr$lambda$13(String $_sql, int $dhikrId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo7532bindLong(1, $dhikrId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.example.data.TagDao
    public Object deleteDhikrRefsForTag(final long tagId, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM dhikr_tag_cross_ref WHERE tagId = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TagDao_Impl.deleteDhikrRefsForTag$lambda$14(_sql, tagId, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteDhikrRefsForTag$lambda$14(String $_sql, long $tagId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo7532bindLong(1, $tagId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    private final void __fetchRelationshiptagTableAscomExampleDataTag(final SQLiteConnection _connection, LongSparseArray<List<Tag>> _map) {
        LongSparseArray<List<Tag>> longSparseArray = _map;
        if (longSparseArray.isEmpty()) {
            return;
        }
        if (longSparseArray.size() > 999) {
            RelationUtil.recursiveFetchLongSparseArray(longSparseArray, true, new Function1() { // from class: com.example.data.TagDao_Impl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TagDao_Impl.__fetchRelationshiptagTableAscomExampleDataTag$lambda$15(TagDao_Impl.this, _connection, (LongSparseArray) obj);
                }
            });
            return;
        }
        StringBuilder _stringBuilder = new StringBuilder();
        _stringBuilder.append("SELECT `tag_table`.`tagId` AS `tagId`,`tag_table`.`name` AS `name`,`tag_table`.`colorHex` AS `colorHex`,_junction.`dhikrId` FROM `dhikr_tag_cross_ref` AS _junction INNER JOIN `tag_table` ON (_junction.`tagId` = `tag_table`.`tagId`) WHERE _junction.`dhikrId` IN (");
        int _inputSize = longSparseArray.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(")");
        String _sql = _stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(_sql, "toString(...)");
        SQLiteStatement _stmt = _connection.prepare(_sql);
        int size = longSparseArray.size();
        int i = 1;
        for (int _argIndex = 0; _argIndex < size; _argIndex++) {
            long _item = longSparseArray.keyAt(_argIndex);
            _stmt.mo7532bindLong(i, _item);
            i++;
        }
        int _itemKeyIndex = 3;
        while (_stmt.step()) {
            try {
                long _tmpKey = _stmt.getLong(_itemKeyIndex);
                List _tmpRelation = longSparseArray.get(_tmpKey);
                if (_tmpRelation != null) {
                    long _tmpTagId = _stmt.getLong(0);
                    String _tmpName = _stmt.getText(1);
                    String _tmpColorHex = _stmt.getText(2);
                    int _itemKeyIndex2 = _itemKeyIndex;
                    StringBuilder _stringBuilder2 = _stringBuilder;
                    try {
                        Tag _item_1 = new Tag(_tmpTagId, _tmpName, _tmpColorHex);
                        _tmpRelation.add(_item_1);
                        longSparseArray = _map;
                        _itemKeyIndex = _itemKeyIndex2;
                        _stringBuilder = _stringBuilder2;
                    } catch (Throwable th) {
                        th = th;
                        _stmt.close();
                        throw th;
                    }
                } else {
                    longSparseArray = _map;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        _stmt.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit __fetchRelationshiptagTableAscomExampleDataTag$lambda$15(TagDao_Impl this$0, SQLiteConnection $_connection, LongSparseArray _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        this$0.__fetchRelationshiptagTableAscomExampleDataTag($_connection, _tmpMap);
        return Unit.INSTANCE;
    }

    /* compiled from: TagDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/TagDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
