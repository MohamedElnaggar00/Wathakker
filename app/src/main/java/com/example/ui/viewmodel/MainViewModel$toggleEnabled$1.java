package com.example.ui.viewmodel;

import com.example.alarm.AlarmScheduler;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$toggleEnabled$1", f = "MainViewModel.kt", i = {0}, l = {228}, m = "invokeSuspend", n = {"newState"}, s = {"I$0"})
/* loaded from: classes11.dex */
public final class MainViewModel$toggleEnabled$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Dhikr $dhikr;
    int I$0;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$toggleEnabled$1(Dhikr dhikr, MainViewModel mainViewModel, Continuation<? super MainViewModel$toggleEnabled$1> continuation) {
        super(2, (Continuation) continuation);
        this.$dhikr = dhikr;
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation) new MainViewModel$toggleEnabled$1(this.$dhikr, this.this$0, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$toggleEnabled$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DhikrRepository dhikrRepository;
        int i;
        AlarmScheduler alarmScheduler;
        AlarmScheduler alarmScheduler2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                int i2 = !this.$dhikr.isEnabled() ? 1 : 0;
                dhikrRepository = this.this$0.repository;
                Dhikr dhikr = this.$dhikr;
                boolean z = i2 != 0;
                this.I$0 = i2;
                this.label = 1;
                if (dhikrRepository.update(Dhikr.copy$default(dhikr, 0, null, null, false, null, z, 0, 0L, 223, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i2;
                break;
            case 1:
                i = this.I$0;
                ResultKt.throwOnFailure(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MainViewModel mainViewModel = this.this$0;
        if (i != 0) {
            alarmScheduler2 = mainViewModel.alarmScheduler;
            alarmScheduler2.schedule(this.$dhikr);
        } else {
            alarmScheduler = mainViewModel.alarmScheduler;
            alarmScheduler.cancel(this.$dhikr);
        }
        return Unit.INSTANCE;
    }
}
