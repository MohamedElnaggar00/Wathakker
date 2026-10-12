package com.example.ui.components;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WheelTimePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.components.WheelTimePickerKt$WheelTimePicker$1$1", f = "WheelTimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class WheelTimePickerKt$WheelTimePicker$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Integer, Integer, Unit> $onTimeSelected;
    final /* synthetic */ MutableState<Integer> $selectedAmPmIndex$delegate;
    final /* synthetic */ MutableState<Integer> $selectedHour12Index$delegate;
    final /* synthetic */ MutableState<Integer> $selectedMinuteIndex$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WheelTimePickerKt$WheelTimePicker$1$1(Function2<? super Integer, ? super Integer, Unit> function2, MutableState<Integer> mutableState, MutableState<Integer> mutableState2, MutableState<Integer> mutableState3, Continuation<? super WheelTimePickerKt$WheelTimePicker$1$1> continuation) {
        super(2, continuation);
        this.$onTimeSelected = function2;
        this.$selectedHour12Index$delegate = mutableState;
        this.$selectedAmPmIndex$delegate = mutableState2;
        this.$selectedMinuteIndex$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WheelTimePickerKt$WheelTimePicker$1$1(this.$onTimeSelected, this.$selectedHour12Index$delegate, this.$selectedAmPmIndex$delegate, this.$selectedMinuteIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WheelTimePickerKt$WheelTimePicker$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        int WheelTimePicker$lambda$3;
        int WheelTimePicker$lambda$9;
        int WheelTimePicker$lambda$6;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                WheelTimePicker$lambda$3 = WheelTimePickerKt.WheelTimePicker$lambda$3(this.$selectedHour12Index$delegate);
                int h12 = WheelTimePicker$lambda$3 + 1;
                WheelTimePicker$lambda$9 = WheelTimePickerKt.WheelTimePicker$lambda$9(this.$selectedAmPmIndex$delegate);
                int h24 = 0;
                boolean isAm = WheelTimePicker$lambda$9 == 0;
                if (!isAm || h12 != 12) {
                    if (isAm) {
                        h24 = h12;
                    } else if (!isAm && h12 == 12) {
                        h24 = 12;
                    } else {
                        h24 = h12 + 12;
                    }
                }
                Function2<Integer, Integer, Unit> function2 = this.$onTimeSelected;
                Integer boxInt = Boxing.boxInt(h24);
                WheelTimePicker$lambda$6 = WheelTimePickerKt.WheelTimePicker$lambda$6(this.$selectedMinuteIndex$delegate);
                function2.invoke(boxInt, Boxing.boxInt(WheelTimePicker$lambda$6));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
