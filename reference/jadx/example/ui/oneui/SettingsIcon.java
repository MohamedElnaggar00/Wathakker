package com.example.ui.oneui;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class SettingsIcon implements Function2 {
    public static final SettingsIcon INSTANCE = new SettingsIcon();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        return OneUIKt.SettingsGlyph(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable), composer, ((Integer) obj2).intValue());
    }
}
