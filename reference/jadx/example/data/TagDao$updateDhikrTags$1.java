package com.example.data;

import com.example.data.TagDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TagDao.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.TagDao", f = "TagDao.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {64, 67}, m = "updateDhikrTags$suspendImpl", n = {"$this", "tagIds", "dhikrId", "$this", "tagIds", "refs", "dhikrId"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes7.dex */
public final class TagDao$updateDhikrTags$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagDao this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagDao$updateDhikrTags$1(TagDao tagDao, Continuation<? super TagDao$updateDhikrTags$1> continuation) {
        super(continuation);
        this.this$0 = tagDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TagDao.CC.updateDhikrTags$suspendImpl(this.this$0, 0, null, this);
    }
}
