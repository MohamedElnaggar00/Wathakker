package com.example.ui.components;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WheelTimePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.components.WheelTimePickerKt$WheelPickerColumn$1$1", f = "WheelTimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class WheelTimePickerKt$WheelPickerColumn$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Integer, Unit> $onSelectedIndexChanged;
    final /* synthetic */ State<Integer> $selectedIndex$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WheelTimePickerKt$WheelPickerColumn$1$1(Function1<? super Integer, Unit> function1, State<Integer> state, Continuation<? super WheelTimePickerKt$WheelPickerColumn$1$1> continuation) {
        super(2, continuation);
        this.$onSelectedIndexChanged = function1;
        this.$selectedIndex$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WheelTimePickerKt$WheelPickerColumn$1$1(this.$onSelectedIndexChanged, this.$selectedIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WheelTimePickerKt$WheelPickerColumn$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        int WheelPickerColumn_HYR8e34$lambda$23;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Function1<Integer, Unit> function1 = this.$onSelectedIndexChanged;
                WheelPickerColumn_HYR8e34$lambda$23 = WheelTimePickerKt.WheelPickerColumn_HYR8e34$lambda$23(this.$selectedIndex$delegate);
                function1.invoke(Boxing.boxInt(WheelPickerColumn_HYR8e34$lambda$23));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
