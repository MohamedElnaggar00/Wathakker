package com.example.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: HistoryDao.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\u0003H'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bH'J\u000e\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/example/data/HistoryDao;", "", "insertHistory", "", "history", "Lcom/example/data/DhikrHistory;", "(Lcom/example/data/DhikrHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllHistory", "Lkotlinx/coroutines/flow/Flow;", "", "getCountSince", "", "startTime", "getTotalCount", "getDistinctReadDates", "", "clearHistory", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HistoryDao {
    Object clearHistory(Continuation<? super Unit> continuation);

    Flow<List<DhikrHistory>> getAllHistory();

    Flow<Integer> getCountSince(long startTime);

    Flow<List<String>> getDistinctReadDates();

    Flow<Integer> getTotalCount();

    Object insertHistory(DhikrHistory dhikrHistory, Continuation<? super Long> continuation);
}
