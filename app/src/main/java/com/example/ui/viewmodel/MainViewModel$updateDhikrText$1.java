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

/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$updateDhikrText$1", f = "MainViewModel.kt", i = {0}, l = {280}, m = "invokeSuspend", n = {"updated"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class MainViewModel$updateDhikrText$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Dhikr $dhikr;
    final /* synthetic */ String $newContent;
    final /* synthetic */ String $newTitle;
    Object L$0;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$updateDhikrText$1(Dhikr dhikr, String str, String str2, MainViewModel mainViewModel, Continuation<? super MainViewModel$updateDhikrText$1> continuation) {
        super(2, (Continuation) continuation);
        this.$dhikr = dhikr;
        this.$newTitle = str;
        this.$newContent = str2;
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$updateDhikrText$1(this.$dhikr, this.$newTitle, this.$newContent, this.this$0, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$updateDhikrText$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Dhikr updated2 = Dhikr.copy$default(this.$dhikr, 0, this.$newTitle, this.$newContent, false, null, false, 0, 0L, 249, null);
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
        if (updated.isEnabled()) {
            alarmScheduler = this.this$0.alarmScheduler;
            alarmScheduler.schedule(updated);
        }
        return Unit.INSTANCE;
    }
}
