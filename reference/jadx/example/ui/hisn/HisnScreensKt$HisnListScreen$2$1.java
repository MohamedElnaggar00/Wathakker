package com.example.ui.hisn;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HisnScreens.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class HisnScreensKt$HisnListScreen$2$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public HisnScreensKt$HisnListScreen$2$1(Object obj) {
        super(1, obj, HisnViewModel.class, "setOnlyFavorites", "setOnlyFavorites(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean p0) {
        ((HisnViewModel) this.receiver).setOnlyFavorites(p0);
    }
}
