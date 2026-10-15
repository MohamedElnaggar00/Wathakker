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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$addTag$1", f = "MainViewModel.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class MainViewModel$addTag$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $colorHex;
    final /* synthetic */ String $name;
    final /* synthetic */ Function1<Tag, Unit> $onCreated;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainViewModel$addTag$1(MainViewModel mainViewModel, String str, String str2, Function1<? super Tag, Unit> function1, Continuation<? super MainViewModel$addTag$1> continuation) {
        super(2, (Continuation) continuation);
        this.this$0 = mainViewModel;
        this.$name = str;
        this.$colorHex = str2;
        this.$onCreated = (Function1) function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation) new MainViewModel$addTag$1(this.this$0, this.$name, this.$colorHex, this.$onCreated, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$addTag$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        DhikrRepository dhikrRepository;
        Object orCreateTagByName;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                dhikrRepository = this.this$0.repository;
                this.label = 1;
                orCreateTagByName = dhikrRepository.getOrCreateTagByName(this.$name, this.$colorHex, this);
                if (orCreateTagByName == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                orCreateTagByName = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Tag tag = (Tag) orCreateTagByName;
        Function1<Tag, Unit> function1 = this.$onCreated;
        if (function1 != null) {
            function1.invoke(tag);
        }
        return Unit.INSTANCE;
    }
}
