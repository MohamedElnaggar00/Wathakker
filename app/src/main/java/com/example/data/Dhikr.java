package com.example.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dhikr.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/example/data/Dhikr;", "", "id", "", "title", "", "content", "isFavorite", "", "reminderTimes", "", "isEnabled", "readCount", "lastReadTime", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJ)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getContent", "()Z", "getReminderTimes", "()Ljava/util/List;", "getReadCount", "getLastReadTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Dhikr {
    public static final int $stable = 8;
    private final String content;
    private final int id;
    private final boolean isEnabled;
    private final boolean isFavorite;
    private final long lastReadTime;
    private final int readCount;
    private final List<String> reminderTimes;
    private final String title;

    public static /* synthetic */ Dhikr copy$default(Dhikr dhikr, int i, String str, String str2, boolean z, List list, boolean z2, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dhikr.id;
        }
        if ((i3 & 2) != 0) {
            str = dhikr.title;
        }
        if ((i3 & 4) != 0) {
            str2 = dhikr.content;
        }
        if ((i3 & 8) != 0) {
            z = dhikr.isFavorite;
        }
        if ((i3 & 16) != 0) {
            list = dhikr.reminderTimes;
        }
        if ((i3 & 32) != 0) {
            z2 = dhikr.isEnabled;
        }
        if ((i3 & 64) != 0) {
            i2 = dhikr.readCount;
        }
        if ((i3 & 128) != 0) {
            j = dhikr.lastReadTime;
        }
        long j2 = j;
        boolean z3 = z2;
        int i4 = i2;
        List list2 = list;
        String str3 = str2;
        return dhikr.copy(i, str, str3, z, list2, z3, i4, j2);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final List<String> component5() {
        return this.reminderTimes;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final Dhikr copy(int id, String title, String content, boolean isFavorite, List<String> reminderTimes, boolean isEnabled, int readCount, long lastReadTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(reminderTimes, "reminderTimes");
        return new Dhikr(id, title, content, isFavorite, reminderTimes, isEnabled, readCount, lastReadTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dhikr)) {
            return false;
        }
        Dhikr dhikr = (Dhikr) other;
        return this.id == dhikr.id && Intrinsics.areEqual(this.title, dhikr.title) && Intrinsics.areEqual(this.content, dhikr.content) && this.isFavorite == dhikr.isFavorite && Intrinsics.areEqual(this.reminderTimes, dhikr.reminderTimes) && this.isEnabled == dhikr.isEnabled && this.readCount == dhikr.readCount && this.lastReadTime == dhikr.lastReadTime;
    }

    public int hashCode() {
        return (((((((((((((this.id * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + Dhikr$$ExternalSyntheticBackport0.m(this.isFavorite)) * 31) + this.reminderTimes.hashCode()) * 31) + Dhikr$$ExternalSyntheticBackport0.m(this.isEnabled)) * 31) + this.readCount) * 31) + Dhikr$$ExternalSyntheticBackport1.m(this.lastReadTime);
    }

    public String toString() {
        return "Dhikr(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", isFavorite=" + this.isFavorite + ", reminderTimes=" + this.reminderTimes + ", isEnabled=" + this.isEnabled + ", readCount=" + this.readCount + ", lastReadTime=" + this.lastReadTime + ")";
    }

    public Dhikr(int id, String title, String content, boolean isFavorite, List<String> reminderTimes, boolean isEnabled, int readCount, long lastReadTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(reminderTimes, "reminderTimes");
        this.id = id;
        this.title = title;
        this.content = content;
        this.isFavorite = isFavorite;
        this.reminderTimes = reminderTimes;
        this.isEnabled = isEnabled;
        this.readCount = readCount;
        this.lastReadTime = lastReadTime;
    }

    public /* synthetic */ Dhikr(int i, String str, String str2, boolean z, List list, boolean z2, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, str, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? CollectionsKt.listOf("09:00") : list, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? 0L : j);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final List<String> getReminderTimes() {
        return this.reminderTimes;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final int getReadCount() {
        return this.readCount;
    }

    public final long getLastReadTime() {
        return this.lastReadTime;
    }
}
