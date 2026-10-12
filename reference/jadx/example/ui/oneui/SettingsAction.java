package com.example.ui.oneui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class SettingsAction implements Function0 {
    public static final SettingsAction INSTANCE = new SettingsAction();

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        HeaderTools.settings();
        return Unit.INSTANCE;
    }
}
