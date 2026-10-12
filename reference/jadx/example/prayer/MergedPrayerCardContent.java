package com.example.prayer;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ColorScheme;
import androidx.compose.runtime.Composer;
import com.example.ui.oneui.OneUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes10.dex */
public final class MergedPrayerCardContent implements Function3 {
    private final ColorScheme f0;
    private final String f1;
    private final String f2;
    private final Function0 f3;
    private final float f4;
    private final String f5;
    private final String f6;
    private final String f7;

    public MergedPrayerCardContent(ColorScheme colorScheme, String str, String str2, Function0 function0, float f, String str3, String str4, String str5) {
        this.f0 = colorScheme;
        this.f1 = str;
        this.f2 = str2;
        this.f3 = function0;
        this.f4 = f;
        this.f5 = str3;
        this.f6 = str4;
        this.f7 = str5;
    }

    @Override // kotlin.jvm.functions.Function3
    public Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope columnScope = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).intValue();
        PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48$lambda$36$lambda$35(this.f0, this.f1, this.f2, this.f3, columnScope, composer, 0);
        OneUIKt.m7682OneUIDividerkHDZbjc(12.0f, composer, 0, 0);
        PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48$lambda$42$lambda$41(this.f4, this.f0, this.f5, this.f6, this.f7, columnScope, composer, 0);
        return Unit.INSTANCE;
    }
}
