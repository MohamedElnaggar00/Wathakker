package com.example.ui.oneui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OneUI.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.oneui.OneUIKt$OneUIScreen$1$1", f = "OneUI.kt", i = {0, 0}, l = {89}, m = "invokeSuspend", n = {"prevIndex", "prevOffset"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class OneUIKt$OneUIScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ MutableState<Boolean> $scrollingUp;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneUIKt$OneUIScreen$1$1(LazyListState lazyListState, MutableState<Boolean> mutableState, Continuation<? super OneUIKt$OneUIScreen$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$scrollingUp = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneUIKt$OneUIScreen$1$1(this.$listState, this.$scrollingUp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneUIKt$OneUIScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final Ref.IntRef prevIndex = new Ref.IntRef();
                prevIndex.element = this.$listState.getFirstVisibleItemIndex();
                final Ref.IntRef prevOffset = new Ref.IntRef();
                prevOffset.element = this.$listState.getFirstVisibleItemScrollOffset();
                final LazyListState lazyListState = this.$listState;
                Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.example.ui.oneui.OneUIKt$OneUIScreen$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Pair pair;
                        pair = TuplesKt.to(Integer.valueOf(r0.getFirstVisibleItemIndex()), Integer.valueOf(LazyListState.this.getFirstVisibleItemScrollOffset()));
                        return pair;
                    }
                });
                final MutableState<Boolean> mutableState = this.$scrollingUp;
                this.L$0 = SpillingKt.nullOutSpilledVariable(prevIndex);
                this.L$1 = SpillingKt.nullOutSpilledVariable(prevOffset);
                this.label = 1;
                if (snapshotFlow.collect(new FlowCollector() { // from class: com.example.ui.oneui.OneUIKt$OneUIScreen$1$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                        return emit((Pair<Integer, Integer>) value, (Continuation<? super Unit>) $completion);
                    }

                    public final Object emit(Pair<Integer, Integer> pair, Continuation<? super Unit> continuation) {
                        int i = pair.component1().intValue();
                        int o = pair.component2().intValue();
                        mutableState.setValue(Boxing.boxBoolean(i < prevIndex.element || (i == prevIndex.element && o <= prevOffset.element)));
                        prevIndex.element = i;
                        prevOffset.element = o;
                        return Unit.INSTANCE;
                    }
                }, this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
