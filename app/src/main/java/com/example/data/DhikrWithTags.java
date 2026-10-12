package com.example.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DhikrWithTags.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/example/data/DhikrWithTags;", "", "dhikr", "Lcom/example/data/Dhikr;", "tags", "", "Lcom/example/data/Tag;", "<init>", "(Lcom/example/data/Dhikr;Ljava/util/List;)V", "getDhikr", "()Lcom/example/data/Dhikr;", "getTags", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DhikrWithTags {
    public static final int $stable = 8;
    private final Dhikr dhikr;
    private final List<Tag> tags;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DhikrWithTags copy$default(DhikrWithTags dhikrWithTags, Dhikr dhikr, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            dhikr = dhikrWithTags.dhikr;
        }
        if ((i & 2) != 0) {
            list = dhikrWithTags.tags;
        }
        return dhikrWithTags.copy(dhikr, list);
    }

    public final List<Tag> component2() {
        return this.tags;
    }

    public final DhikrWithTags copy(Dhikr dhikr, List<Tag> tags) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new DhikrWithTags(dhikr, tags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DhikrWithTags)) {
            return false;
        }
        DhikrWithTags dhikrWithTags = (DhikrWithTags) other;
        return Intrinsics.areEqual(this.dhikr, dhikrWithTags.dhikr) && Intrinsics.areEqual(this.tags, dhikrWithTags.tags);
    }

    public int hashCode() {
        return (this.dhikr.hashCode() * 31) + this.tags.hashCode();
    }

    public String toString() {
        return "DhikrWithTags(dhikr=" + this.dhikr + ", tags=" + this.tags + ")";
    }

    public DhikrWithTags(Dhikr dhikr, List<Tag> tags) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.dhikr = dhikr;
        this.tags = tags;
    }

    public /* synthetic */ DhikrWithTags(Dhikr dhikr, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dhikr, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final Dhikr getDhikr() {
        return this.dhikr;
    }

    public final List<Tag> getTags() {
        return this.tags;
    }
}
