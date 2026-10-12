package com.example.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: DhikrDao.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/example/data/DhikrDao;", "", "getAllDhikr", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/Dhikr;", "getFavoriteDhikr", "getEnabledDhikr", "getEnabledDhikrSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDhikrById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "", "lastReadTime", "", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDhikr", "dhikr", "(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "dhikrList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDhikr", "deleteDhikrById", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DhikrDao {
    Object deleteDhikrById(int i, Continuation<? super Unit> continuation);

    Flow<List<Dhikr>> getAllDhikr();

    Object getDhikrById(int i, Continuation<? super Dhikr> continuation);

    Flow<List<Dhikr>> getEnabledDhikr();

    Object getEnabledDhikrSync(Continuation<? super List<Dhikr>> continuation);

    Flow<List<Dhikr>> getFavoriteDhikr();

    Object insertAll(List<Dhikr> list, Continuation<? super Unit> continuation);

    Object insertDhikr(Dhikr dhikr, Continuation<? super Long> continuation);

    Object markAsRead(int i, long j, Continuation<? super Unit> continuation);

    Object updateDhikr(Dhikr dhikr, Continuation<? super Unit> continuation);

    /* compiled from: DhikrDao.kt */
    /* renamed from: com.example.data.DhikrDao$-CC, reason: invalid class name */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object markAsRead$default(DhikrDao dhikrDao, int i, long j, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsRead");
            }
            if ((i2 & 2) != 0) {
                j = System.currentTimeMillis();
            }
            return dhikrDao.markAsRead(i, j, continuation);
        }
    }

    /* compiled from: DhikrDao.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }
}
