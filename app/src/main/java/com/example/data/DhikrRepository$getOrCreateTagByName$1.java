package com.example.data;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DhikrRepository.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.DhikrRepository", f = "DhikrRepository.kt", i = {0, 0, 1, 1, 1, 1}, l = {67, 70}, m = "getOrCreateTagByName", n = {HintConstants.AUTOFILL_HINT_NAME, "colorHex", HintConstants.AUTOFILL_HINT_NAME, "colorHex", "existing", "newTag"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes7.dex */
public final class DhikrRepository$getOrCreateTagByName$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DhikrRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DhikrRepository$getOrCreateTagByName$1(DhikrRepository dhikrRepository, Continuation<? super DhikrRepository$getOrCreateTagByName$1> continuation) {
        super(continuation);
        this.this$0 = dhikrRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getOrCreateTagByName(null, null, this);
    }
}
