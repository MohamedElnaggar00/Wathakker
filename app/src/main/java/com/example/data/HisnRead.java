package com.example.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hisn.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/example/data/HisnRead;", "", "id", "", "chapterId", "", "dateString", "", "timestamp", "<init>", "(JILjava/lang/String;J)V", "getId", "()J", "getChapterId", "()I", "getDateString", "()Ljava/lang/String;", "getTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HisnRead {
    public static final int $stable = 0;
    private final int chapterId;
    private final String dateString;
    private final long id;
    private final long timestamp;

    public static /* synthetic */ HisnRead copy$default(HisnRead hisnRead, long j, int i, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hisnRead.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            i = hisnRead.chapterId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = hisnRead.dateString;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            j2 = hisnRead.timestamp;
        }
        return hisnRead.copy(j3, i3, str2, j2);
    }

    public final HisnRead copy(long id, int chapterId, String dateString, long timestamp) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        return new HisnRead(id, chapterId, dateString, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HisnRead)) {
            return false;
        }
        HisnRead hisnRead = (HisnRead) other;
        return this.id == hisnRead.id && this.chapterId == hisnRead.chapterId && Intrinsics.areEqual(this.dateString, hisnRead.dateString) && this.timestamp == hisnRead.timestamp;
    }

    public int hashCode() {
        return (((((Dhikr$$ExternalSyntheticBackport1.m(this.id) * 31) + this.chapterId) * 31) + this.dateString.hashCode()) * 31) + Dhikr$$ExternalSyntheticBackport1.m(this.timestamp);
    }

    public String toString() {
        return "HisnRead(id=" + this.id + ", chapterId=" + this.chapterId + ", dateString=" + this.dateString + ", timestamp=" + this.timestamp + ")";
    }

    public HisnRead(long id, int chapterId, String dateString, long timestamp) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        this.id = id;
        this.chapterId = chapterId;
        this.dateString = dateString;
        this.timestamp = timestamp;
    }

    public /* synthetic */ HisnRead(long j, int i, String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, i, str, j2);
    }


    public final long getId() {
        return this.id;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final String getDateString() {
        return this.dateString;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
