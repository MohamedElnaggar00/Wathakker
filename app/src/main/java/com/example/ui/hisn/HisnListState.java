package com.example.ui.hisn;

import com.example.data.HisnChapter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HisnScreens.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003Jc\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/example/ui/hisn/HisnListState;", "", "chapters", "", "Lcom/example/data/HisnChapter;", "itemCounts", "", "", "favoriteChapterIds", "", "readTodayIds", "query", "", "onlyFavorites", "", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Z)V", "getChapters", "()Ljava/util/List;", "getItemCounts", "()Ljava/util/Map;", "getFavoriteChapterIds", "()Ljava/util/Set;", "getReadTodayIds", "getQuery", "()Ljava/lang/String;", "getOnlyFavorites", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HisnListState {
    public static final int $stable = 8;
    private final List<HisnChapter> chapters;
    private final Set<Integer> favoriteChapterIds;
    private final Map<Integer, Integer> itemCounts;
    private final boolean onlyFavorites;
    private final String query;
    private final Set<Integer> readTodayIds;

    public static /* synthetic */ HisnListState copy$default(HisnListState hisnListState, List list, Map map, Set set, Set set2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hisnListState.chapters;
        }
        if ((i & 2) != 0) {
            map = hisnListState.itemCounts;
        }
        if ((i & 4) != 0) {
            set = hisnListState.favoriteChapterIds;
        }
        if ((i & 8) != 0) {
            set2 = hisnListState.readTodayIds;
        }
        if ((i & 16) != 0) {
            str = hisnListState.query;
        }
        if ((i & 32) != 0) {
            z = hisnListState.onlyFavorites;
        }
        String str2 = str;
        boolean z2 = z;
        return hisnListState.copy(list, map, set, set2, str2, z2);
    }

    public final List<HisnChapter> component1() {
        return this.chapters;
    }

    public final Map<Integer, Integer> component2() {
        return this.itemCounts;
    }

    public final Set<Integer> component3() {
        return this.favoriteChapterIds;
    }

    public final Set<Integer> component4() {
        return this.readTodayIds;
    }

    public final HisnListState copy(List<HisnChapter> chapters, Map<Integer, Integer> itemCounts, Set<Integer> favoriteChapterIds, Set<Integer> readTodayIds, String query, boolean onlyFavorites) {
        Intrinsics.checkNotNullParameter(chapters, "chapters");
        Intrinsics.checkNotNullParameter(itemCounts, "itemCounts");
        Intrinsics.checkNotNullParameter(favoriteChapterIds, "favoriteChapterIds");
        Intrinsics.checkNotNullParameter(readTodayIds, "readTodayIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return new HisnListState(chapters, itemCounts, favoriteChapterIds, readTodayIds, query, onlyFavorites);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HisnListState)) {
            return false;
        }
        HisnListState hisnListState = (HisnListState) other;
        return Intrinsics.areEqual(this.chapters, hisnListState.chapters) && Intrinsics.areEqual(this.itemCounts, hisnListState.itemCounts) && Intrinsics.areEqual(this.favoriteChapterIds, hisnListState.favoriteChapterIds) && Intrinsics.areEqual(this.readTodayIds, hisnListState.readTodayIds) && Intrinsics.areEqual(this.query, hisnListState.query) && this.onlyFavorites == hisnListState.onlyFavorites;
    }

    public int hashCode() {
        return (((((((((this.chapters.hashCode() * 31) + this.itemCounts.hashCode()) * 31) + this.favoriteChapterIds.hashCode()) * 31) + this.readTodayIds.hashCode()) * 31) + this.query.hashCode()) * 31) + HisnListState$$ExternalSyntheticBackport0.m(this.onlyFavorites);
    }

    public String toString() {
        return "HisnListState(chapters=" + this.chapters + ", itemCounts=" + this.itemCounts + ", favoriteChapterIds=" + this.favoriteChapterIds + ", readTodayIds=" + this.readTodayIds + ", query=" + this.query + ", onlyFavorites=" + this.onlyFavorites + ")";
    }

    public HisnListState(List<HisnChapter> chapters, Map<Integer, Integer> itemCounts, Set<Integer> favoriteChapterIds, Set<Integer> readTodayIds, String query, boolean onlyFavorites) {
        Intrinsics.checkNotNullParameter(chapters, "chapters");
        Intrinsics.checkNotNullParameter(itemCounts, "itemCounts");
        Intrinsics.checkNotNullParameter(favoriteChapterIds, "favoriteChapterIds");
        Intrinsics.checkNotNullParameter(readTodayIds, "readTodayIds");
        Intrinsics.checkNotNullParameter(query, "query");
        this.chapters = chapters;
        this.itemCounts = itemCounts;
        this.favoriteChapterIds = favoriteChapterIds;
        this.readTodayIds = readTodayIds;
        this.query = query;
        this.onlyFavorites = onlyFavorites;
    }

    public final List<HisnChapter> getChapters() {
        return this.chapters;
    }

    public final Map<Integer, Integer> getItemCounts() {
        return this.itemCounts;
    }

    public final Set<Integer> getFavoriteChapterIds() {
        return this.favoriteChapterIds;
    }

    public final Set<Integer> getReadTodayIds() {
        return this.readTodayIds;
    }

    public final String getQuery() {
        return this.query;
    }

    public final boolean getOnlyFavorites() {
        return this.onlyFavorites;
    }
}
