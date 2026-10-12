package com.example.prayer;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.ColorScheme;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function3;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class PrayerTimesScreenKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ float f$0;
    public final /* synthetic */ ColorScheme f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ PrayerTimesScreenKt$$ExternalSyntheticLambda4(float f, ColorScheme colorScheme, String str, String str2, String str3) {
        this.f$0 = f;
        this.f$1 = colorScheme;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = str3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48$lambda$42(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
    }
}
