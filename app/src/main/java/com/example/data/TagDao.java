package com.example.data;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: TagDao.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H§@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00040\u0003H'J\u0018\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001eH'J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ$\u0010&\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0097@¢\u0006\u0002\u0010(¨\u0006)À\u0006\u0003"}, d2 = {"Lcom/example/data/TagDao;", "", "getAllTags", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/Tag;", "getTagById", "tagId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTagByName", HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTag", "tag", "(Lcom/example/data/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTag", "", "deleteTag", "deleteTagById", "insertDhikrTagCrossRef", "crossRef", "Lcom/example/data/DhikrTagCrossRef;", "(Lcom/example/data/DhikrTagCrossRef;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDhikrTagCrossRefs", "crossRefs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTagsForDhikr", "dhikrId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDhikrRefsForTag", "getDhikrsWithTags", "Lcom/example/data/DhikrWithTags;", "getDhikrWithTagsById", "getTagsForDhikr", "getTagsForDhikrSync", "updateDhikrTags", "tagIds", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TagDao {
    Object deleteDhikrRefsForTag(long j, Continuation<? super Unit> continuation);

    Object deleteTag(Tag tag, Continuation<? super Unit> continuation);

    Object deleteTagById(long j, Continuation<? super Unit> continuation);

    Object deleteTagsForDhikr(int i, Continuation<? super Unit> continuation);

    Flow<List<Tag>> getAllTags();

    Object getDhikrWithTagsById(int i, Continuation<? super DhikrWithTags> continuation);

    Flow<List<DhikrWithTags>> getDhikrsWithTags();

    Object getTagById(long j, Continuation<? super Tag> continuation);

    Object getTagByName(String str, Continuation<? super Tag> continuation);

    Flow<List<Tag>> getTagsForDhikr(int dhikrId);

    Object getTagsForDhikrSync(int i, Continuation<? super List<Tag>> continuation);

    Object insertDhikrTagCrossRef(DhikrTagCrossRef dhikrTagCrossRef, Continuation<? super Unit> continuation);

    Object insertDhikrTagCrossRefs(List<DhikrTagCrossRef> list, Continuation<? super Unit> continuation);

    Object insertTag(Tag tag, Continuation<? super Long> continuation);

    Object updateDhikrTags(int i, List<Long> list, Continuation<? super Unit> continuation);

    Object updateTag(Tag tag, Continuation<? super Unit> continuation);

    /* compiled from: TagDao.kt */
    /* renamed from: com.example.data.TagDao$-CC, reason: invalid class name */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class CC {
        /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[LOOP:0: B:16:0x0083->B:18:0x0089, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ Object updateDhikrTags$suspendImpl(TagDao $this, int dhikrId, List<Long> list, Continuation<? super Unit> continuation) {
            TagDao$updateDhikrTags$1 tagDao$updateDhikrTags$1;
            List tagIds;
            Iterator it;
            List refs;
            TagDao $this2 = $this;
            int dhikrId2 = dhikrId;
            if (continuation instanceof TagDao$updateDhikrTags$1) {
                tagDao$updateDhikrTags$1 = (TagDao$updateDhikrTags$1) continuation;
                if ((tagDao$updateDhikrTags$1.label & Integer.MIN_VALUE) != 0) {
                    tagDao$updateDhikrTags$1.label -= Integer.MIN_VALUE;
                    Object $result = tagDao$updateDhikrTags$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (tagDao$updateDhikrTags$1.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            tagDao$updateDhikrTags$1.L$0 = $this2;
                            tagIds = list;
                            tagDao$updateDhikrTags$1.L$1 = tagIds;
                            tagDao$updateDhikrTags$1.I$0 = dhikrId2;
                            tagDao$updateDhikrTags$1.label = 1;
                            if ($this2.deleteTagsForDhikr(dhikrId2, tagDao$updateDhikrTags$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            List list2 = tagIds;
                            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new DhikrTagCrossRef(dhikrId2, ((Number) it.next()).longValue()));
                            }
                            refs = (List) arrayList;
                            if (!refs.isEmpty()) {
                                return Unit.INSTANCE;
                            }
                            tagDao$updateDhikrTags$1.L$0 = SpillingKt.nullOutSpilledVariable($this2);
                            tagDao$updateDhikrTags$1.L$1 = SpillingKt.nullOutSpilledVariable(tagIds);
                            tagDao$updateDhikrTags$1.L$2 = SpillingKt.nullOutSpilledVariable(refs);
                            tagDao$updateDhikrTags$1.I$0 = dhikrId2;
                            tagDao$updateDhikrTags$1.label = 2;
                            if ($this2.insertDhikrTagCrossRefs(refs, tagDao$updateDhikrTags$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        case 1:
                            dhikrId2 = tagDao$updateDhikrTags$1.I$0;
                            tagIds = (List) tagDao$updateDhikrTags$1.L$1;
                            $this2 = (TagDao) tagDao$updateDhikrTags$1.L$0;
                            ResultKt.throwOnFailure($result);
                            List list22 = tagIds;
                            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                            it = list22.iterator();
                            while (it.hasNext()) {
                            }
                            refs = (List) arrayList2;
                            if (!refs.isEmpty()) {
                            }
                            break;
                        case 2:
                            int i = tagDao$updateDhikrTags$1.I$0;
                            ResultKt.throwOnFailure($result);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            tagDao$updateDhikrTags$1 = new TagDao$updateDhikrTags$1($this2, (Continuation) continuation);
            Object $result2 = tagDao$updateDhikrTags$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (tagDao$updateDhikrTags$1.label) {
            }
        }
    }

    /* compiled from: TagDao.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Object updateDhikrTags(TagDao $this, int dhikrId, List<Long> list, Continuation<? super Unit> continuation) {
            return CC.updateDhikrTags$suspendImpl($this, dhikrId, list, continuation);
        }
    }
}
