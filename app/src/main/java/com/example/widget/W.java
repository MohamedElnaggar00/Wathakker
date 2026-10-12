package com.example.widget;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetUpdater.kt */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J,\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"com/example/widget/WidgetUpdater$computeIqamaState$W", "", HintConstants.AUTOFILL_HINT_NAME, "", "adhan", "", "iqama", "<init>", "(Ljava/lang/String;JJ)V", "getName", "()Ljava/lang/String;", "getAdhan", "()J", "getIqama", "component1", "component2", "component3", "copy", "(Ljava/lang/String;JJ)Lcom/example/widget/WidgetUpdater$computeIqamaState$W;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.example.widget.WidgetUpdater$computeIqamaState$W, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class W {
    private final long adhan;
    private final long iqama;
    private final String name;

    public static /* synthetic */ W copy$default(W w, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w.name;
        }
        if ((i & 2) != 0) {
            j = w.adhan;
        }
        if ((i & 4) != 0) {
            j2 = w.iqama;
        }
        return w.copy(str, j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAdhan() {
        return this.adhan;
    }

    /* renamed from: component3, reason: from getter */
    public final long getIqama() {
        return this.iqama;
    }

    public final W copy(String name, long adhan, long iqama) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new W(name, adhan, iqama);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof W)) {
            return false;
        }
        W w = (W) other;
        return Intrinsics.areEqual(this.name, w.name) && this.adhan == w.adhan && this.iqama == w.iqama;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + WidgetUpdater$IqamaState$$ExternalSyntheticBackport0.m(this.adhan)) * 31) + WidgetUpdater$IqamaState$$ExternalSyntheticBackport0.m(this.iqama);
    }

    public String toString() {
        return "W(name=" + this.name + ", adhan=" + this.adhan + ", iqama=" + this.iqama + ")";
    }

    public W(String name, long adhan, long iqama) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.adhan = adhan;
        this.iqama = iqama;
    }

    public final long getAdhan() {
        return this.adhan;
    }

    public final long getIqama() {
        return this.iqama;
    }

    public final String getName() {
        return this.name;
    }
}
