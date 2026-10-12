package com.example.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DhikrHistory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/example/data/DhikrHistory;", "", "historyId", "", "dhikrId", "", "timestamp", "dateString", "", "<init>", "(JIJLjava/lang/String;)V", "getHistoryId", "()J", "getDhikrId", "()I", "getTimestamp", "getDateString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DhikrHistory {
    public static final int $stable = 0;
    private final String dateString;
    private final int dhikrId;
    private final long historyId;
    private final long timestamp;

    public static /* synthetic */ DhikrHistory copy$default(DhikrHistory dhikrHistory, long j, int i, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dhikrHistory.historyId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            i = dhikrHistory.dhikrId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j2 = dhikrHistory.timestamp;
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            str = dhikrHistory.dateString;
        }
        return dhikrHistory.copy(j3, i3, j4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getHistoryId() {
        return this.historyId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDhikrId() {
        return this.dhikrId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDateString() {
        return this.dateString;
    }

    public final DhikrHistory copy(long historyId, int dhikrId, long timestamp, String dateString) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        return new DhikrHistory(historyId, dhikrId, timestamp, dateString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DhikrHistory)) {
            return false;
        }
        DhikrHistory dhikrHistory = (DhikrHistory) other;
        return this.historyId == dhikrHistory.historyId && this.dhikrId == dhikrHistory.dhikrId && this.timestamp == dhikrHistory.timestamp && Intrinsics.areEqual(this.dateString, dhikrHistory.dateString);
    }

    public int hashCode() {
        return (((((Dhikr$$ExternalSyntheticBackport1.m(this.historyId) * 31) + this.dhikrId) * 31) + Dhikr$$ExternalSyntheticBackport1.m(this.timestamp)) * 31) + this.dateString.hashCode();
    }

    public String toString() {
        return "DhikrHistory(historyId=" + this.historyId + ", dhikrId=" + this.dhikrId + ", timestamp=" + this.timestamp + ", dateString=" + this.dateString + ")";
    }

    public DhikrHistory(long historyId, int dhikrId, long timestamp, String dateString) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        this.historyId = historyId;
        this.dhikrId = dhikrId;
        this.timestamp = timestamp;
        this.dateString = dateString;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DhikrHistory(long j, int i, long j2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, i, r4, str);
        long j3;
        long j4;
        if ((i2 & 1) == 0) {
            j3 = j;
        } else {
            j3 = 0;
        }
        if ((i2 & 4) == 0) {
            j4 = j2;
        } else {
            j4 = System.currentTimeMillis();
        }
    }

    public final long getHistoryId() {
        return this.historyId;
    }

    public final int getDhikrId() {
        return this.dhikrId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getDateString() {
        return this.dateString;
    }
}
