package com.example.data;

import androidx.autofill.HintConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: DhikrRepository.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010'\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020*2\u0006\u0010'\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010(J\u0016\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010-J\u0016\u0010/\u001a\u00020*2\u0006\u0010'\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010(J\u0016\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020*2\u0006\u00101\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u00102J\u0016\u00104\u001a\u00020*2\u0006\u00101\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u00102J$\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u001e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0\fH\u0086@¢\u0006\u0002\u00108J \u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020!H\u0086@¢\u0006\u0002\u0010<R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000f¨\u0006="}, d2 = {"Lcom/example/data/DhikrRepository;", "", "dhikrDao", "Lcom/example/data/DhikrDao;", "tagDao", "Lcom/example/data/TagDao;", "historyDao", "Lcom/example/data/HistoryDao;", "<init>", "(Lcom/example/data/DhikrDao;Lcom/example/data/TagDao;Lcom/example/data/HistoryDao;)V", "allDhikr", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/Dhikr;", "getAllDhikr", "()Lkotlinx/coroutines/flow/Flow;", "favoriteDhikr", "getFavoriteDhikr", "enabledDhikr", "getEnabledDhikr", "allTags", "Lcom/example/data/Tag;", "getAllTags", "dhikrsWithTags", "Lcom/example/data/DhikrWithTags;", "getDhikrsWithTags", "allHistory", "Lcom/example/data/DhikrHistory;", "getAllHistory", "totalHistoryCount", "", "getTotalHistoryCount", "distinctReadDates", "", "getDistinctReadDates", "getHistoryCountSince", "startTime", "", "getDhikrById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "", "insert", "dhikr", "(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "delete", "insertTag", "tag", "(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTag", "deleteTag", "updateDhikrTags", "dhikrId", "tagIds", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrCreateTagByName", HintConstants.AUTOFILL_HINT_NAME, "colorHex", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DhikrRepository {
    public static final int $stable = 8;
    private final Flow<List<Dhikr>> allDhikr;
    private final Flow<List<DhikrHistory>> allHistory;
    private final Flow<List<Tag>> allTags;
    private final DhikrDao dhikrDao;
    private final Flow<List<DhikrWithTags>> dhikrsWithTags;
    private final Flow<List<String>> distinctReadDates;
    private final Flow<List<Dhikr>> enabledDhikr;
    private final Flow<List<Dhikr>> favoriteDhikr;
    private final HistoryDao historyDao;
    private final TagDao tagDao;
    private final Flow<Integer> totalHistoryCount;

    public DhikrRepository(DhikrDao dhikrDao, TagDao tagDao, HistoryDao historyDao) {
        Intrinsics.checkNotNullParameter(dhikrDao, "dhikrDao");
        Intrinsics.checkNotNullParameter(tagDao, "tagDao");
        Intrinsics.checkNotNullParameter(historyDao, "historyDao");
        this.dhikrDao = dhikrDao;
        this.tagDao = tagDao;
        this.historyDao = historyDao;
        this.allDhikr = this.dhikrDao.getAllDhikr();
        this.favoriteDhikr = this.dhikrDao.getFavoriteDhikr();
        this.enabledDhikr = this.dhikrDao.getEnabledDhikr();
        this.allTags = this.tagDao.getAllTags();
        this.dhikrsWithTags = this.tagDao.getDhikrsWithTags();
        this.allHistory = this.historyDao.getAllHistory();
        this.totalHistoryCount = this.historyDao.getTotalCount();
        this.distinctReadDates = this.historyDao.getDistinctReadDates();
    }

    public final Flow<List<Dhikr>> getAllDhikr() {
        return this.allDhikr;
    }

    public final Flow<List<Dhikr>> getFavoriteDhikr() {
        return this.favoriteDhikr;
    }

    public final Flow<List<Dhikr>> getEnabledDhikr() {
        return this.enabledDhikr;
    }

    public final Flow<List<Tag>> getAllTags() {
        return this.allTags;
    }

    public final Flow<List<DhikrWithTags>> getDhikrsWithTags() {
        return this.dhikrsWithTags;
    }

    public final Flow<List<DhikrHistory>> getAllHistory() {
        return this.allHistory;
    }

    public final Flow<Integer> getTotalHistoryCount() {
        return this.totalHistoryCount;
    }

    public final Flow<List<String>> getDistinctReadDates() {
        return this.distinctReadDates;
    }

    public final Flow<Integer> getHistoryCountSince(long startTime) {
        return this.historyDao.getCountSince(startTime);
    }

    public final Object getDhikrById(int id, Continuation<? super Dhikr> continuation) {
        return this.dhikrDao.getDhikrById(id, continuation);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markAsRead(int id, Continuation<? super Unit> continuation) {
        DhikrRepository$markAsRead$1 dhikrRepository$markAsRead$1;
        SimpleDateFormat sdf;
        String dateStr;
        int id2;
        long now;
        HistoryDao historyDao;
        DhikrHistory dhikrHistory;
        if (continuation instanceof DhikrRepository$markAsRead$1) {
            dhikrRepository$markAsRead$1 = (DhikrRepository$markAsRead$1) continuation;
            if ((dhikrRepository$markAsRead$1.label & Integer.MIN_VALUE) != 0) {
                dhikrRepository$markAsRead$1.label -= Integer.MIN_VALUE;
                Object $result = dhikrRepository$markAsRead$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (dhikrRepository$markAsRead$1.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        long now2 = System.currentTimeMillis();
                        sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                        String dateStr2 = sdf.format(new Date(now2));
                        DhikrDao dhikrDao = this.dhikrDao;
                        dhikrRepository$markAsRead$1.L$0 = SpillingKt.nullOutSpilledVariable(sdf);
                        dhikrRepository$markAsRead$1.L$1 = dateStr2;
                        dhikrRepository$markAsRead$1.I$0 = id;
                        dhikrRepository$markAsRead$1.J$0 = now2;
                        dhikrRepository$markAsRead$1.label = 1;
                        if (dhikrDao.markAsRead(id, now2, dhikrRepository$markAsRead$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dateStr = dateStr2;
                        id2 = id;
                        now = now2;
                        historyDao = this.historyDao;
                        Intrinsics.checkNotNull(dateStr);
                        dhikrHistory = new DhikrHistory(0L, id2, now, dateStr, 1, null);
                        dhikrRepository$markAsRead$1.L$0 = SpillingKt.nullOutSpilledVariable(sdf);
                        dhikrRepository$markAsRead$1.L$1 = SpillingKt.nullOutSpilledVariable(dateStr);
                        dhikrRepository$markAsRead$1.I$0 = id2;
                        dhikrRepository$markAsRead$1.J$0 = now;
                        dhikrRepository$markAsRead$1.label = 2;
                        if (historyDao.insertHistory(dhikrHistory, dhikrRepository$markAsRead$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        long now3 = dhikrRepository$markAsRead$1.J$0;
                        int id3 = dhikrRepository$markAsRead$1.I$0;
                        String dateStr3 = (String) dhikrRepository$markAsRead$1.L$1;
                        SimpleDateFormat sdf2 = (SimpleDateFormat) dhikrRepository$markAsRead$1.L$0;
                        ResultKt.throwOnFailure($result);
                        dateStr = dateStr3;
                        sdf = sdf2;
                        id2 = id3;
                        now = now3;
                        historyDao = this.historyDao;
                        Intrinsics.checkNotNull(dateStr);
                        dhikrHistory = new DhikrHistory(0L, id2, now, dateStr, 1, null);
                        dhikrRepository$markAsRead$1.L$0 = SpillingKt.nullOutSpilledVariable(sdf);
                        dhikrRepository$markAsRead$1.L$1 = SpillingKt.nullOutSpilledVariable(dateStr);
                        dhikrRepository$markAsRead$1.I$0 = id2;
                        dhikrRepository$markAsRead$1.J$0 = now;
                        dhikrRepository$markAsRead$1.label = 2;
                        if (historyDao.insertHistory(dhikrHistory, dhikrRepository$markAsRead$1) != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        long j = dhikrRepository$markAsRead$1.J$0;
                        int i = dhikrRepository$markAsRead$1.I$0;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dhikrRepository$markAsRead$1 = new DhikrRepository$markAsRead$1(this, continuation);
        Object $result2 = dhikrRepository$markAsRead$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (dhikrRepository$markAsRead$1.label) {
        }
    }

    public final Object insert(Dhikr dhikr, Continuation<? super Long> continuation) {
        return this.dhikrDao.insertDhikr(dhikr, continuation);
    }

    public final Object update(Dhikr dhikr, Continuation<? super Unit> continuation) {
        Object updateDhikr = this.dhikrDao.updateDhikr(dhikr, continuation);
        return updateDhikr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateDhikr : Unit.INSTANCE;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delete(int id, Continuation<? super Unit> continuation) {
        DhikrRepository$delete$1 dhikrRepository$delete$1;
        TagDao tagDao;
        if (continuation instanceof DhikrRepository$delete$1) {
            dhikrRepository$delete$1 = (DhikrRepository$delete$1) continuation;
            if ((dhikrRepository$delete$1.label & Integer.MIN_VALUE) != 0) {
                dhikrRepository$delete$1.label -= Integer.MIN_VALUE;
                Object $result = dhikrRepository$delete$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (dhikrRepository$delete$1.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        DhikrDao dhikrDao = this.dhikrDao;
                        dhikrRepository$delete$1.I$0 = id;
                        dhikrRepository$delete$1.label = 1;
                        if (dhikrDao.deleteDhikrById(id, dhikrRepository$delete$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tagDao = this.tagDao;
                        dhikrRepository$delete$1.I$0 = id;
                        dhikrRepository$delete$1.label = 2;
                        if (tagDao.deleteTagsForDhikr(id, dhikrRepository$delete$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        id = dhikrRepository$delete$1.I$0;
                        ResultKt.throwOnFailure($result);
                        tagDao = this.tagDao;
                        dhikrRepository$delete$1.I$0 = id;
                        dhikrRepository$delete$1.label = 2;
                        if (tagDao.deleteTagsForDhikr(id, dhikrRepository$delete$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 2:
                        int id2 = dhikrRepository$delete$1.I$0;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dhikrRepository$delete$1 = new DhikrRepository$delete$1(this, continuation);
        Object $result2 = dhikrRepository$delete$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (dhikrRepository$delete$1.label) {
        }
    }

    public final Object insertTag(Tag tag, Continuation<? super Long> continuation) {
        return this.tagDao.insertTag(tag, continuation);
    }

    public final Object updateTag(Tag tag, Continuation<? super Unit> continuation) {
        Object updateTag = this.tagDao.updateTag(tag, continuation);
        return updateTag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateTag : Unit.INSTANCE;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteTag(Tag tag, Continuation<? super Unit> continuation) {
        DhikrRepository$deleteTag$1 dhikrRepository$deleteTag$1;
        TagDao tagDao;
        if (continuation instanceof DhikrRepository$deleteTag$1) {
            dhikrRepository$deleteTag$1 = (DhikrRepository$deleteTag$1) continuation;
            if ((dhikrRepository$deleteTag$1.label & Integer.MIN_VALUE) != 0) {
                dhikrRepository$deleteTag$1.label -= Integer.MIN_VALUE;
                Object $result = dhikrRepository$deleteTag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (dhikrRepository$deleteTag$1.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        TagDao tagDao2 = this.tagDao;
                        long tagId = tag.getTagId();
                        dhikrRepository$deleteTag$1.L$0 = tag;
                        dhikrRepository$deleteTag$1.label = 1;
                        if (tagDao2.deleteDhikrRefsForTag(tagId, dhikrRepository$deleteTag$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tagDao = this.tagDao;
                        dhikrRepository$deleteTag$1.L$0 = SpillingKt.nullOutSpilledVariable(tag);
                        dhikrRepository$deleteTag$1.label = 2;
                        if (tagDao.deleteTag(tag, dhikrRepository$deleteTag$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        tag = (Tag) dhikrRepository$deleteTag$1.L$0;
                        ResultKt.throwOnFailure($result);
                        tagDao = this.tagDao;
                        dhikrRepository$deleteTag$1.L$0 = SpillingKt.nullOutSpilledVariable(tag);
                        dhikrRepository$deleteTag$1.label = 2;
                        if (tagDao.deleteTag(tag, dhikrRepository$deleteTag$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dhikrRepository$deleteTag$1 = new DhikrRepository$deleteTag$1(this, continuation);
        Object $result2 = dhikrRepository$deleteTag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (dhikrRepository$deleteTag$1.label) {
        }
    }

    public final Object updateDhikrTags(int dhikrId, List<Long> list, Continuation<? super Unit> continuation) {
        Object updateDhikrTags = this.tagDao.updateDhikrTags(dhikrId, list, continuation);
        return updateDhikrTags == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateDhikrTags : Unit.INSTANCE;
    }

    public static /* synthetic */ Object getOrCreateTagByName$default(DhikrRepository dhikrRepository, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "#008080";
        }
        return dhikrRepository.getOrCreateTagByName(str, str2, continuation);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOrCreateTagByName(String name, String colorHex, Continuation<? super Tag> continuation) {
        DhikrRepository$getOrCreateTagByName$1 dhikrRepository$getOrCreateTagByName$1;
        Object tagByName;
        String colorHex2;
        Tag existing;
        Object insertTag;
        Tag newTag;
        if (continuation instanceof DhikrRepository$getOrCreateTagByName$1) {
            dhikrRepository$getOrCreateTagByName$1 = (DhikrRepository$getOrCreateTagByName$1) continuation;
            if ((dhikrRepository$getOrCreateTagByName$1.label & Integer.MIN_VALUE) != 0) {
                dhikrRepository$getOrCreateTagByName$1.label -= Integer.MIN_VALUE;
                Object $result = dhikrRepository$getOrCreateTagByName$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (dhikrRepository$getOrCreateTagByName$1.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        TagDao tagDao = this.tagDao;
                        String obj = StringsKt.trim((CharSequence) name).toString();
                        dhikrRepository$getOrCreateTagByName$1.L$0 = name;
                        dhikrRepository$getOrCreateTagByName$1.L$1 = colorHex;
                        dhikrRepository$getOrCreateTagByName$1.label = 1;
                        tagByName = tagDao.getTagByName(obj, dhikrRepository$getOrCreateTagByName$1);
                        if (tagByName == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        colorHex2 = colorHex;
                        existing = (Tag) tagByName;
                        if (existing == null) {
                            return existing;
                        }
                        Tag newTag2 = new Tag(0L, StringsKt.trim((CharSequence) name).toString(), colorHex2, 1, null);
                        TagDao tagDao2 = this.tagDao;
                        dhikrRepository$getOrCreateTagByName$1.L$0 = SpillingKt.nullOutSpilledVariable(name);
                        dhikrRepository$getOrCreateTagByName$1.L$1 = SpillingKt.nullOutSpilledVariable(colorHex2);
                        dhikrRepository$getOrCreateTagByName$1.L$2 = SpillingKt.nullOutSpilledVariable(existing);
                        dhikrRepository$getOrCreateTagByName$1.L$3 = newTag2;
                        dhikrRepository$getOrCreateTagByName$1.label = 2;
                        insertTag = tagDao2.insertTag(newTag2, dhikrRepository$getOrCreateTagByName$1);
                        if (insertTag == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        newTag = newTag2;
                        long id = ((Number) insertTag).longValue();
                        return Tag.copy$default(newTag, id, null, null, 6, null);
                    case 1:
                        String colorHex3 = (String) dhikrRepository$getOrCreateTagByName$1.L$1;
                        name = (String) dhikrRepository$getOrCreateTagByName$1.L$0;
                        ResultKt.throwOnFailure($result);
                        tagByName = $result;
                        colorHex2 = colorHex3;
                        existing = (Tag) tagByName;
                        if (existing == null) {
                        }
                        break;
                    case 2:
                        newTag = (Tag) dhikrRepository$getOrCreateTagByName$1.L$3;
                        ResultKt.throwOnFailure($result);
                        insertTag = $result;
                        long id2 = ((Number) insertTag).longValue();
                        return Tag.copy$default(newTag, id2, null, null, 6, null);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dhikrRepository$getOrCreateTagByName$1 = new DhikrRepository$getOrCreateTagByName$1(this, continuation);
        Object $result2 = dhikrRepository$getOrCreateTagByName$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (dhikrRepository$getOrCreateTagByName$1.label) {
        }
    }
}
