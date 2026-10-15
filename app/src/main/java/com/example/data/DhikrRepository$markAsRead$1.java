package com.example.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DhikrRepository.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.DhikrRepository", f = "DhikrRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {31, 32}, m = "markAsRead", n = {"sdf", "dateStr", "id", "now", "sdf", "dateStr", "id", "now"}, s = {"L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes7.dex */
public final class DhikrRepository$markAsRead$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DhikrRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DhikrRepository$markAsRead$1(DhikrRepository dhikrRepository, Continuation<? super DhikrRepository$markAsRead$1> continuation) {
        super((Continuation) continuation);
        this.this$0 = dhikrRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.markAsRead(0, this);
    }
}
