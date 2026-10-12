package com.example.ui.screens;

import com.example.data.Dhikr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardScreen.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/example/ui/screens/DhikrInstance;", "", "dhikr", "Lcom/example/data/Dhikr;", "hour", "", "minute", "<init>", "(Lcom/example/data/Dhikr;II)V", "getDhikr", "()Lcom/example/data/Dhikr;", "getHour", "()I", "getMinute", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DhikrInstance {
    public static final int $stable = 8;
    private final Dhikr dhikr;
    private final int hour;
    private final int minute;

    public static /* synthetic */ DhikrInstance copy$default(DhikrInstance dhikrInstance, Dhikr dhikr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            dhikr = dhikrInstance.dhikr;
        }
        if ((i3 & 2) != 0) {
            i = dhikrInstance.hour;
        }
        if ((i3 & 4) != 0) {
            i2 = dhikrInstance.minute;
        }
        return dhikrInstance.copy(dhikr, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final Dhikr getDhikr() {
        return this.dhikr;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    public final DhikrInstance copy(Dhikr dhikr, int hour, int minute) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        return new DhikrInstance(dhikr, hour, minute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DhikrInstance)) {
            return false;
        }
        DhikrInstance dhikrInstance = (DhikrInstance) other;
        return Intrinsics.areEqual(this.dhikr, dhikrInstance.dhikr) && this.hour == dhikrInstance.hour && this.minute == dhikrInstance.minute;
    }

    public int hashCode() {
        return (((this.dhikr.hashCode() * 31) + this.hour) * 31) + this.minute;
    }

    public String toString() {
        return "DhikrInstance(dhikr=" + this.dhikr + ", hour=" + this.hour + ", minute=" + this.minute + ")";
    }

    public DhikrInstance(Dhikr dhikr, int hour, int minute) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        this.dhikr = dhikr;
        this.hour = hour;
        this.minute = minute;
    }

    public final Dhikr getDhikr() {
        return this.dhikr;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }
}
