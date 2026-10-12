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
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$addDhikrWithSchedule$1", f = "MainViewModel.kt", i = {0}, l = {248}, m = "invokeSuspend", n = {"newDhikr"}, s = {"L$0"})
/* loaded from: classes11.dex */
public final class MainViewModel$addDhikrWithSchedule$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $content;
    final /* synthetic */ List<String> $times;
    final /* synthetic */ String $title;
    Object L$0;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$addDhikrWithSchedule$1(String str, String str2, List<String> list, MainViewModel mainViewModel, Continuation<? super MainViewModel$addDhikrWithSchedule$1> continuation) {
        super(2, continuation);
        this.$title = str;
        this.$content = str2;
        this.$times = list;
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$addDhikrWithSchedule$1(this.$title, this.$content, this.$times, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$addDhikrWithSchedule$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        DhikrRepository dhikrRepository;
        Object insert;
        Dhikr newDhikr;
        AlarmScheduler alarmScheduler;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Dhikr newDhikr2 = new Dhikr(0, this.$title, this.$content, false, this.$times, true, 0, 0L, ComposerKt.providerKey, null);
                dhikrRepository = this.this$0.repository;
                this.L$0 = newDhikr2;
                this.label = 1;
                insert = dhikrRepository.insert(newDhikr2, this);
                if (insert == coroutine_suspended) {
                    return coroutine_suspended;
                }
                newDhikr = newDhikr2;
                break;
            case 1:
                Dhikr newDhikr3 = (Dhikr) this.L$0;
                ResultKt.throwOnFailure($result);
                insert = $result;
                newDhikr = newDhikr3;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long id = ((Number) insert).longValue();
        Dhikr scheduledDhikr = Dhikr.copy$default(newDhikr, (int) id, null, null, false, null, false, 0, 0L, 254, null);
        alarmScheduler = this.this$0.alarmScheduler;
        alarmScheduler.schedule(scheduledDhikr);
        return Unit.INSTANCE;
    }
}
