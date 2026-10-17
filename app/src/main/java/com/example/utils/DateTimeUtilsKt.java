package com.example.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import com.example.ui.i18n.L10n;
import com.example.ui.i18n.S;

/* compiled from: DateTimeUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"formatTimeStr12h", "", "timeStr", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimeUtilsKt {
    public static final String formatTimeStr12h(String timeStr) {
        boolean isAm;
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        List parts = StringsKt.split((CharSequence) timeStr, new String[]{":"}, false, 0);
        if (parts.size() != 2) {
            return timeStr;
        }
        Integer intOrNull = StringsKt.toIntOrNull((String) parts.get(0));
        if (intOrNull == null) {
            return timeStr;
        }
        int hour = intOrNull.intValue();
        Integer intOrNull2 = StringsKt.toIntOrNull((String) parts.get(1));
        if (intOrNull2 == null) {
            return timeStr;
        }
        int minute = intOrNull2.intValue();
        if (hour >= 12) {
            isAm = false;
        } else {
            isAm = true;
        }
        int displayHour = hour % 12 != 0 ? hour % 12 : 12;
        String amPm = isAm ? L10n.INSTANCE.t(S.AmMarker) : L10n.INSTANCE.t(S.PmMarker);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), "%02d:%02d %s", Arrays.copyOf(new Object[]{Integer.valueOf(displayHour), Integer.valueOf(minute), amPm}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}

