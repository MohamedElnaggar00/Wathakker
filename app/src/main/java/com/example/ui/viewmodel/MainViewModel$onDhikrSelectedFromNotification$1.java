package com.example.ui.viewmodel;

import com.example.data.Dhikr;
import com.example.data.DhikrRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$onDhikrSelectedFromNotification$1", f = "MainViewModel.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class MainViewModel$onDhikrSelectedFromNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $dhikrId;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$onDhikrSelectedFromNotification$1(MainViewModel mainViewModel, int i, Continuation<? super MainViewModel$onDhikrSelectedFromNotification$1> continuation) {
        super(2, (Continuation) continuation);
        this.this$0 = mainViewModel;
        this.$dhikrId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation) new MainViewModel$onDhikrSelectedFromNotification$1(this.this$0, this.$dhikrId, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$onDhikrSelectedFromNotification$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        DhikrRepository dhikrRepository;
        Object dhikrById;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                dhikrRepository = this.this$0.repository;
                this.label = 1;
                dhikrById = dhikrRepository.getDhikrById(this.$dhikrId, this);
                if (dhikrById == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                dhikrById = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Dhikr dhikr = (Dhikr) dhikrById;
        mutableStateFlow = this.this$0._selectedDhikrFromNotification;
        mutableStateFlow.setValue(dhikr);
        return Unit.INSTANCE;
    }
}
