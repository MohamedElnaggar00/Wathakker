package com.example.ui.screens;

import com.example.ui.theme.FontChoice;
import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class SettingsScreenKt$SettingsScreen$5$1 extends FunctionReferenceImpl implements Function1<FontChoice, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SettingsScreenKt$SettingsScreen$5$1(Object obj) {
        super(1, obj, MainViewModel.class, "updateAppFont", "updateAppFont(Lcom/example/ui/theme/FontChoice;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FontChoice fontChoice) {
        invoke2(fontChoice);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FontChoice p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MainViewModel) this.receiver).updateAppFont(p0);
    }
}
