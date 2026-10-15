package com.example.ui.viewmodel;

import androidx.compose.runtime.ComposerKt;
import com.example.alarm.AlarmScheduler;
import com.example.data.Dhikr;
import com.example.data.DhikrRepository;
import java.util.List;
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
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$updateTimes$1", f = "MainViewModel.kt", i = {0}, l = {240}, m = "invokeSuspend", n = {"updated"}, s = {"L$0"})
/* loaded from: classes11.dex */
public final class MainViewModel$updateTimes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Dhikr $dhikr;
    final /* synthetic */ List<String> $newTimes;
    Object L$0;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$updateTimes$1(Dhikr dhikr, List<String> list, MainViewModel mainViewModel, Continuation<? super MainViewModel$updateTimes$1> continuation) {
        super(2, (Continuation) continuation);
        this.$dhikr = dhikr;
        this.$newTimes = list;
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$updateTimes$1(this.$dhikr, this.$newTimes, this.this$0, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$updateTimes$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        DhikrRepository dhikrRepository;
        Dhikr updated;
        AlarmScheduler alarmScheduler;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Dhikr updated2 = Dhikr.copy$default(this.$dhikr, 0, null, null, false, this.$newTimes, true, 0, 0L, ComposerKt.reuseKey, null);
                dhikrRepository = this.this$0.repository;
                this.L$0 = updated2;
                this.label = 1;
                if (dhikrRepository.update(updated2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                updated = updated2;
                break;
            case 1:
                updated = (Dhikr) this.L$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        alarmScheduler = this.this$0.alarmScheduler;
        alarmScheduler.schedule(updated);
        return Unit.INSTANCE;
    }
}
