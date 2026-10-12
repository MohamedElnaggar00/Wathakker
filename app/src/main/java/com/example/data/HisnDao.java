package com.example.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Hisn.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H'J\u000e\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H§@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003H'J\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH§@¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H'J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0006\u0010 \u001a\u00020!H'¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/example/data/HisnDao;", "", "chapters", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/HisnChapter;", "allItems", "Lcom/example/data/HisnItem;", "itemCounts", "Lcom/example/data/ChapterItemCount;", "chapterCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertChapters", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertItems", "favorites", "Lcom/example/data/HisnFavorite;", "addFavorite", "fav", "(Lcom/example/data/HisnFavorite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFavorite", "chapterId", "itemId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRead", "read", "Lcom/example/data/HisnRead;", "(Lcom/example/data/HisnRead;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readToday", "date", "", "chaptersReadOn", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HisnDao {
    Object addFavorite(HisnFavorite hisnFavorite, Continuation<? super Unit> continuation);

    Flow<List<HisnItem>> allItems();

    Object chapterCount(Continuation<? super Integer> continuation);

    Flow<List<HisnChapter>> chapters();

    Flow<List<Integer>> chaptersReadOn(String date);

    Flow<List<HisnFavorite>> favorites();

    Object insertChapters(List<HisnChapter> list, Continuation<? super Unit> continuation);

    Object insertItems(List<HisnItem> list, Continuation<? super Unit> continuation);

    Object insertRead(HisnRead hisnRead, Continuation<? super Unit> continuation);

    Flow<List<ChapterItemCount>> itemCounts();

    Flow<Integer> readToday(int chapterId, String date);

    Object removeFavorite(int i, int i2, Continuation<? super Unit> continuation);
}
