package com.example.ui.screens;

import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SettingsScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class SettingsScreenKt$SettingsScreen$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SettingsScreenKt$SettingsScreen$1$1(Object obj) {
        super(1, obj, MainViewModel.class, "updateVibrationEnabled", "updateVibrationEnabled(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean p0) {
        ((MainViewModel) this.receiver).updateVibrationEnabled(p0);
    }
}
