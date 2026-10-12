package com.example.ui.viewmodel;

import com.example.data.DhikrRepository;
import com.example.data.Tag;
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
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$deleteTag$1", f = "MainViewModel.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class MainViewModel$deleteTag$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Tag $tag;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$deleteTag$1(MainViewModel mainViewModel, Tag tag, Continuation<? super MainViewModel$deleteTag$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
        this.$tag = tag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$deleteTag$1(this.this$0, this.$tag, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$deleteTag$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        MutableStateFlow mutableStateFlow;
        DhikrRepository dhikrRepository;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                mutableStateFlow = this.this$0._selectedTag;
                Tag tag = (Tag) mutableStateFlow.getValue();
                boolean z = false;
                if (tag != null && tag.getTagId() == this.$tag.getTagId()) {
                    z = true;
                }
                if (z) {
                    mutableStateFlow2 = this.this$0._selectedTag;
                    mutableStateFlow2.setValue(null);
                }
                dhikrRepository = this.this$0.repository;
                this.label = 1;
                if (dhikrRepository.deleteTag(this.$tag, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
