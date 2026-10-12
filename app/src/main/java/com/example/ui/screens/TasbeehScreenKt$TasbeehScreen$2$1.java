package com.example.ui.screens;

import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TasbeehScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class TasbeehScreenKt$TasbeehScreen$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public TasbeehScreenKt$TasbeehScreen$2$1(Object obj) {
        super(0, obj, MainViewModel.class, "resetTasbeeh", "resetTasbeeh()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MainViewModel) this.receiver).resetTasbeeh();
    }
}
