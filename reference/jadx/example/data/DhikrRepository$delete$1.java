package com.example.data;

import androidx.core.view.MotionEventCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DhikrRepository.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.DhikrRepository", f = "DhikrRepository.kt", i = {0, 1}, l = {MotionEventCompat.AXIS_GENERIC_13, MotionEventCompat.AXIS_GENERIC_14}, m = "delete", n = {"id", "id"}, s = {"I$0", "I$0"})
/* loaded from: classes7.dex */
public final class DhikrRepository$delete$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DhikrRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DhikrRepository$delete$1(DhikrRepository dhikrRepository, Continuation<? super DhikrRepository$delete$1> continuation) {
        super(continuation);
        this.this$0 = dhikrRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.delete(0, this);
    }
}
