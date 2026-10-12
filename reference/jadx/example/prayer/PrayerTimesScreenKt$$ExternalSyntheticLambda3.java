package com.example.prayer;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.ColorScheme;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class PrayerTimesScreenKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ ColorScheme f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Function0 f$3;

    public /* synthetic */ PrayerTimesScreenKt$$ExternalSyntheticLambda3(ColorScheme colorScheme, String str, String str2, Function0 function0) {
        this.f$0 = colorScheme;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48$lambda$36(this.f$0, this.f$1, this.f$2, this.f$3, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
    }
}
