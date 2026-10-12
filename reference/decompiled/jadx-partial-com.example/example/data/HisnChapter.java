package com.example.data;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hisn.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/example/data/HisnChapter;", "", "id", "", "order", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(IILjava/lang/String;)V", "getId", "()I", "getOrder", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HisnChapter {
    public static final int $stable = 0;
    private final int id;
    private final String name;
    private final int order;

    public static /* synthetic */ HisnChapter copy$default(HisnChapter hisnChapter, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hisnChapter.id;
        }
        if ((i3 & 2) != 0) {
            i2 = hisnChapter.order;
        }
        if ((i3 & 4) != 0) {
            str = hisnChapter.name;
        }
        return hisnChapter.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final HisnChapter copy(int id, int order, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new HisnChapter(id, order, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HisnChapter)) {
            return false;
        }
        HisnChapter hisnChapter = (HisnChapter) other;
        return this.id == hisnChapter.id && this.order == hisnChapter.order && Intrinsics.areEqual(this.name, hisnChapter.name);
    }

    public int hashCode() {
        return (((this.id * 31) + this.order) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "HisnChapter(id=" + this.id + ", order=" + this.order + ", name=" + this.name + ")";
    }

    public HisnChapter(int id, int order, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.order = order;
        this.name = name;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getName() {
        return this.name;
    }
}
