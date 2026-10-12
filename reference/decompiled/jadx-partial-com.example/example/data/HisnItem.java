package com.example.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hisn.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006&"}, d2 = {"Lcom/example/data/HisnItem;", "", "id", "", "chapterId", "order", "text", "", "count", "fadl", "source", "hokm", "<init>", "(IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getChapterId", "getOrder", "getText", "()Ljava/lang/String;", "getCount", "getFadl", "getSource", "getHokm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HisnItem {
    public static final int $stable = 0;
    private final int chapterId;
    private final int count;
    private final String fadl;
    private final String hokm;
    private final int id;
    private final int order;
    private final String source;
    private final String text;

    public static /* synthetic */ HisnItem copy$default(HisnItem hisnItem, int i, int i2, int i3, String str, int i4, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = hisnItem.id;
        }
        if ((i5 & 2) != 0) {
            i2 = hisnItem.chapterId;
        }
        if ((i5 & 4) != 0) {
            i3 = hisnItem.order;
        }
        if ((i5 & 8) != 0) {
            str = hisnItem.text;
        }
        if ((i5 & 16) != 0) {
            i4 = hisnItem.count;
        }
        if ((i5 & 32) != 0) {
            str2 = hisnItem.fadl;
        }
        if ((i5 & 64) != 0) {
            str3 = hisnItem.source;
        }
        if ((i5 & 128) != 0) {
            str4 = hisnItem.hokm;
        }
        String str5 = str3;
        String str6 = str4;
        int i6 = i4;
        String str7 = str2;
        return hisnItem.copy(i, i2, i3, str, i6, str7, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFadl() {
        return this.fadl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final String getHokm() {
        return this.hokm;
    }

    public final HisnItem copy(int id, int chapterId, int order, String text, int count, String fadl, String source, String hokm) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fadl, "fadl");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(hokm, "hokm");
        return new HisnItem(id, chapterId, order, text, count, fadl, source, hokm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HisnItem)) {
            return false;
        }
        HisnItem hisnItem = (HisnItem) other;
        return this.id == hisnItem.id && this.chapterId == hisnItem.chapterId && this.order == hisnItem.order && Intrinsics.areEqual(this.text, hisnItem.text) && this.count == hisnItem.count && Intrinsics.areEqual(this.fadl, hisnItem.fadl) && Intrinsics.areEqual(this.source, hisnItem.source) && Intrinsics.areEqual(this.hokm, hisnItem.hokm);
    }

    public int hashCode() {
        return (((((((((((((this.id * 31) + this.chapterId) * 31) + this.order) * 31) + this.text.hashCode()) * 31) + this.count) * 31) + this.fadl.hashCode()) * 31) + this.source.hashCode()) * 31) + this.hokm.hashCode();
    }

    public String toString() {
        return "HisnItem(id=" + this.id + ", chapterId=" + this.chapterId + ", order=" + this.order + ", text=" + this.text + ", count=" + this.count + ", fadl=" + this.fadl + ", source=" + this.source + ", hokm=" + this.hokm + ")";
    }

    public HisnItem(int id, int chapterId, int order, String text, int count, String fadl, String source, String hokm) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fadl, "fadl");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(hokm, "hokm");
        this.id = id;
        this.chapterId = chapterId;
        this.order = order;
        this.text = text;
        this.count = count;
        this.fadl = fadl;
        this.source = source;
        this.hokm = hokm;
    }

    public final int getId() {
        return this.id;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getText() {
        return this.text;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getFadl() {
        return this.fadl;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getHokm() {
        return this.hokm;
    }
}
