package com.example.ui.viewmodel;

import androidx.compose.runtime.ComposerKt;
import androidx.core.view.InputDeviceCompat;
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
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$addDhikrWithScheduleAndTags$1", f = "MainViewModel.kt", i = {0, 1, 1, 1}, l = {InputDeviceCompat.SOURCE_KEYBOARD, 261}, m = "invokeSuspend", n = {"newDhikr", "newDhikr", "scheduledDhikr", "id"}, s = {"L$0", "L$0", "L$1", "J$0"})
/* loaded from: classes11.dex */
public final class MainViewModel$addDhikrWithScheduleAndTags$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $content;
    final /* synthetic */ List<Long> $tagIds;
    final /* synthetic */ List<String> $times;
    final /* synthetic */ String $title;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$addDhikrWithScheduleAndTags$1(String str, String str2, List<String> list, MainViewModel mainViewModel, List<Long> list2, Continuation<? super MainViewModel$addDhikrWithScheduleAndTags$1> continuation) {
        super(2, (Continuation) continuation);
        this.$title = str;
        this.$content = str2;
        this.$times = list;
        this.this$0 = mainViewModel;
        this.$tagIds = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$addDhikrWithScheduleAndTags$1(this.$title, this.$content, this.$times, this.this$0, this.$tagIds, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$addDhikrWithScheduleAndTags$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object $result) {
        DhikrRepository dhikrRepository;
        Object insert;
        Dhikr newDhikr;
        AlarmScheduler alarmScheduler;
        DhikrRepository dhikrRepository2;
        long id;
        Dhikr scheduledDhikr;
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
                long id2 = ((Number) insert).longValue();
                Dhikr scheduledDhikr2 = Dhikr.copy$default(newDhikr, (int) id2, null, null, false, null, false, 0, 0L, 254, null);
                alarmScheduler = this.this$0.alarmScheduler;
                alarmScheduler.schedule(scheduledDhikr2);
                if (!this.$tagIds.isEmpty()) {
                    dhikrRepository2 = this.this$0.repository;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(newDhikr);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(scheduledDhikr2);
                    this.J$0 = id2;
                    this.label = 2;
                    if (dhikrRepository2.updateDhikrTags((int) id2, this.$tagIds, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    id = id2;
                    scheduledDhikr = scheduledDhikr2;
                }
                return Unit.INSTANCE;
            case 1:
                Dhikr newDhikr3 = (Dhikr) this.L$0;
                ResultKt.throwOnFailure($result);
                insert = $result;
                newDhikr = newDhikr3;
                long id22 = ((Number) insert).longValue();
                Dhikr scheduledDhikr22 = Dhikr.copy$default(newDhikr, (int) id22, null, null, false, null, false, 0, 0L, 254, null);
                alarmScheduler = this.this$0.alarmScheduler;
                alarmScheduler.schedule(scheduledDhikr22);
                if (!this.$tagIds.isEmpty()) {
                }
                return Unit.INSTANCE;
            case 2:
                id = this.J$0;
                scheduledDhikr = (Dhikr) this.L$1;
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
