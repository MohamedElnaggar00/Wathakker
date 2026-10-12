package com.example.prayer;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrayerTimesScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/example/prayer/PrayerRowDisplay;", "", HintConstants.AUTOFILL_HINT_NAME, "", "timeText", "isNext", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/graphics/vector/ImageVector;)V", "getName", "()Ljava/lang/String;", "getTimeText", "()Z", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PrayerRowDisplay {
    public static final int $stable = 0;
    private final ImageVector icon;
    private final boolean isNext;
    private final String name;
    private final String timeText;

    public PrayerRowDisplay(String name, String timeText, boolean isNext, ImageVector icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(timeText, "timeText");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.name = name;
        this.timeText = timeText;
        this.isNext = isNext;
        this.icon = icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTimeText() {
        return this.timeText;
    }

    /* renamed from: isNext, reason: from getter */
    public final boolean getIsNext() {
        return this.isNext;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }
}
