package com.example.ui.screens;

import com.example.data.Dhikr;
import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemindersScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class RemindersScreenKt$RemindersScreen$1$1 extends FunctionReferenceImpl implements Function1<Dhikr, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RemindersScreenKt$RemindersScreen$1$1(Object obj) {
        super(1, obj, MainViewModel.class, "toggleEnabled", "toggleEnabled(Lcom/example/data/Dhikr;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Dhikr dhikr) {
        invoke2(dhikr);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Dhikr p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MainViewModel) this.receiver).toggleEnabled(p0);
    }
}
