package com.example.ui.hisn;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: HisnViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"normalizeArabic", "", "s", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HisnViewModelKt {
    public static final String normalizeArabic(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return s.replaceAll("[\u064B-\u0652\u0670\u06D6-\u06ED\u0640]", "").replaceAll("[\u0622\u0623\u0625\u0671]", "ا").replace((char) 1609, (char) 1610).replace((char) 1577, (char) 1607);
    }
}
