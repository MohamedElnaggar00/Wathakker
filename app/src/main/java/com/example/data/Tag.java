package com.example.data;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tag.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/example/data/Tag;", "", "tagId", "", HintConstants.AUTOFILL_HINT_NAME, "", "colorHex", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getTagId", "()J", "getName", "()Ljava/lang/String;", "getColorHex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Tag {
    public static final int $stable = 0;
    private final String colorHex;
    private final String name;
    private final long tagId;

    public static /* synthetic */ Tag copy$default(Tag tag, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tag.tagId;
        }
        if ((i & 2) != 0) {
            str = tag.name;
        }
        if ((i & 4) != 0) {
            str2 = tag.colorHex;
        }
        return tag.copy(j, str, str2);
    }

    public final Tag copy(long tagId, String name, String colorHex) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        return new Tag(tagId, name, colorHex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) other;
        return this.tagId == tag.tagId && Intrinsics.areEqual(this.name, tag.name) && Intrinsics.areEqual(this.colorHex, tag.colorHex);
    }

    public int hashCode() {
        return (((Dhikr$$ExternalSyntheticBackport1.m(this.tagId) * 31) + this.name.hashCode()) * 31) + this.colorHex.hashCode();
    }

    public String toString() {
        return "Tag(tagId=" + this.tagId + ", name=" + this.name + ", colorHex=" + this.colorHex + ")";
    }

    public Tag(long tagId, String name, String colorHex) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        this.tagId = tagId;
        this.name = name;
        this.colorHex = colorHex;
    }

    public /* synthetic */ Tag(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, (i & 4) != 0 ? "#008080" : str2);
    }

    public final long getTagId() {
        return this.tagId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getColorHex() {
        return this.colorHex;
    }
}
