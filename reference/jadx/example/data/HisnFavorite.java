package com.example.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Hisn.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/example/data/HisnFavorite;", "", "id", "", "chapterId", "", "itemId", "<init>", "(JII)V", "getId", "()J", "getChapterId", "()I", "getItemId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HisnFavorite {
    public static final int $stable = 0;
    private final int chapterId;
    private final long id;
    private final int itemId;

    public static /* synthetic */ HisnFavorite copy$default(HisnFavorite hisnFavorite, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = hisnFavorite.id;
        }
        if ((i3 & 2) != 0) {
            i = hisnFavorite.chapterId;
        }
        if ((i3 & 4) != 0) {
            i2 = hisnFavorite.itemId;
        }
        return hisnFavorite.copy(j, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    public final HisnFavorite copy(long id, int chapterId, int itemId) {
        return new HisnFavorite(id, chapterId, itemId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HisnFavorite)) {
            return false;
        }
        HisnFavorite hisnFavorite = (HisnFavorite) other;
        return this.id == hisnFavorite.id && this.chapterId == hisnFavorite.chapterId && this.itemId == hisnFavorite.itemId;
    }

    public int hashCode() {
        return (((Dhikr$$ExternalSyntheticBackport1.m(this.id) * 31) + this.chapterId) * 31) + this.itemId;
    }

    public String toString() {
        return "HisnFavorite(id=" + this.id + ", chapterId=" + this.chapterId + ", itemId=" + this.itemId + ")";
    }

    public HisnFavorite(long id, int chapterId, int itemId) {
        this.id = id;
        this.chapterId = chapterId;
        this.itemId = itemId;
    }

    public /* synthetic */ HisnFavorite(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, i, (i3 & 4) != 0 ? 0 : i2);
    }

    public final long getId() {
        return this.id;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final int getItemId() {
        return this.itemId;
    }
}
