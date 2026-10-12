package com.example.ui.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\tHÆ\u0003JW\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/example/ui/viewmodel/DhikrStats;", "", "todayCount", "", "weekCount", "monthCount", "totalCount", "streakDays", "topReadDhikr", "", "Lkotlin/Pair;", "<init>", "(IIIIILjava/util/List;)V", "getTodayCount", "()I", "getWeekCount", "getMonthCount", "getTotalCount", "getStreakDays", "getTopReadDhikr", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DhikrStats {
    public static final int $stable = 8;
    private final int monthCount;
    private final int streakDays;
    private final int todayCount;
    private final List<Pair<Integer, Integer>> topReadDhikr;
    private final int totalCount;
    private final int weekCount;

    public DhikrStats() {
        this(0, 0, 0, 0, 0, null, 63, null);
    }

    public static /* synthetic */ DhikrStats copy$default(DhikrStats dhikrStats, int i, int i2, int i3, int i4, int i5, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = dhikrStats.todayCount;
        }
        if ((i6 & 2) != 0) {
            i2 = dhikrStats.weekCount;
        }
        if ((i6 & 4) != 0) {
            i3 = dhikrStats.monthCount;
        }
        if ((i6 & 8) != 0) {
            i4 = dhikrStats.totalCount;
        }
        if ((i6 & 16) != 0) {
            i5 = dhikrStats.streakDays;
        }
        if ((i6 & 32) != 0) {
            list = dhikrStats.topReadDhikr;
        }
        int i7 = i5;
        List list2 = list;
        return dhikrStats.copy(i, i2, i3, i4, i7, list2);
    }

    public final List<Pair<Integer, Integer>> component6() {
        return this.topReadDhikr;
    }

    public final DhikrStats copy(int todayCount, int weekCount, int monthCount, int totalCount, int streakDays, List<Pair<Integer, Integer>> topReadDhikr) {
        Intrinsics.checkNotNullParameter(topReadDhikr, "topReadDhikr");
        return new DhikrStats(todayCount, weekCount, monthCount, totalCount, streakDays, topReadDhikr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DhikrStats)) {
            return false;
        }
        DhikrStats dhikrStats = (DhikrStats) other;
        return this.todayCount == dhikrStats.todayCount && this.weekCount == dhikrStats.weekCount && this.monthCount == dhikrStats.monthCount && this.totalCount == dhikrStats.totalCount && this.streakDays == dhikrStats.streakDays && Intrinsics.areEqual(this.topReadDhikr, dhikrStats.topReadDhikr);
    }

    public int hashCode() {
        return (((((((((this.todayCount * 31) + this.weekCount) * 31) + this.monthCount) * 31) + this.totalCount) * 31) + this.streakDays) * 31) + this.topReadDhikr.hashCode();
    }

    public String toString() {
        return "DhikrStats(todayCount=" + this.todayCount + ", weekCount=" + this.weekCount + ", monthCount=" + this.monthCount + ", totalCount=" + this.totalCount + ", streakDays=" + this.streakDays + ", topReadDhikr=" + this.topReadDhikr + ")";
    }

    public DhikrStats(int todayCount, int weekCount, int monthCount, int totalCount, int streakDays, List<Pair<Integer, Integer>> topReadDhikr) {
        Intrinsics.checkNotNullParameter(topReadDhikr, "topReadDhikr");
        this.todayCount = todayCount;
        this.weekCount = weekCount;
        this.monthCount = monthCount;
        this.totalCount = totalCount;
        this.streakDays = streakDays;
        this.topReadDhikr = topReadDhikr;
    }

    public /* synthetic */ DhikrStats(int i, int i2, int i3, int i4, int i5, List list, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final int getTodayCount() {
        return this.todayCount;
    }

    public final int getWeekCount() {
        return this.weekCount;
    }

    public final int getMonthCount() {
        return this.monthCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getStreakDays() {
        return this.streakDays;
    }

    public final List<Pair<Integer, Integer>> getTopReadDhikr() {
        return this.topReadDhikr;
    }
}
