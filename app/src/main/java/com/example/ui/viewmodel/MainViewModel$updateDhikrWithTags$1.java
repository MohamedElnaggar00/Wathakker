package com.example.ui.viewmodel;

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
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$updateDhikrWithTags$1", f = "MainViewModel.kt", i = {0, 1}, l = {269, 270}, m = "invokeSuspend", n = {"updated", "updated"}, s = {"L$0", "L$0"})
/* loaded from: classes11.dex */
public final class MainViewModel$updateDhikrWithTags$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Dhikr $dhikr;
    final /* synthetic */ String $newContent;
    final /* synthetic */ String $newTitle;
    final /* synthetic */ List<Long> $tagIds;
    Object L$0;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$updateDhikrWithTags$1(Dhikr dhikr, String str, String str2, MainViewModel mainViewModel, List<Long> list, Continuation<? super MainViewModel$updateDhikrWithTags$1> continuation) {
        super(2, (Continuation) continuation);
        this.$dhikr = dhikr;
        this.$newTitle = str;
        this.$newContent = str2;
        this.this$0 = mainViewModel;
        this.$tagIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation) new MainViewModel$updateDhikrWithTags$1(this.$dhikr, this.$newTitle, this.$newContent, this.this$0, this.$tagIds, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$updateDhikrWithTags$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object $result) {
        Dhikr updated;
        DhikrRepository dhikrRepository;
        DhikrRepository dhikrRepository2;
        Dhikr updated2;
        AlarmScheduler alarmScheduler;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                updated = Dhikr.copy$default(this.$dhikr, 0, this.$newTitle, this.$newContent, false, null, false, 0, 0L, 249, null);
                dhikrRepository = this.this$0.repository;
                this.L$0 = updated;
                this.label = 1;
                if (dhikrRepository.update(updated, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dhikrRepository2 = this.this$0.repository;
                this.L$0 = updated;
                this.label = 2;
                if (dhikrRepository2.updateDhikrTags(this.$dhikr.getId(), this.$tagIds, this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                updated2 = updated;
                if (updated2.isEnabled()) {
                    alarmScheduler = this.this$0.alarmScheduler;
                    alarmScheduler.schedule(updated2);
                }
                return Unit.INSTANCE;
            case 1:
                updated = (Dhikr) this.L$0;
                ResultKt.throwOnFailure($result);
                dhikrRepository2 = this.this$0.repository;
                this.L$0 = updated;
                this.label = 2;
                if (dhikrRepository2.updateDhikrTags(this.$dhikr.getId(), this.$tagIds, this) != coroutine_suspended) {
                }
                break;
            case 2:
                updated2 = (Dhikr) this.L$0;
                ResultKt.throwOnFailure($result);
                if (updated2.isEnabled()) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
