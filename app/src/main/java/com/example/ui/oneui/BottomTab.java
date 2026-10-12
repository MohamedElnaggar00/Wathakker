package com.example.ui.oneui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneUI.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR$\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/example/ui/oneui/BottomTab;", "", "route", "", "label", "icon", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Color;", "", "Landroidx/compose/runtime/Composable;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "getRoute", "()Ljava/lang/String;", "getLabel", "getIcon", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BottomTab {
    public static final int $stable = 0;
    private final Function3<Color, Composer, Integer, Unit> icon;
    private final String label;
    private final String route;

    /* JADX WARN: Multi-variable type inference failed */
    public BottomTab(String route, String label, Function3<? super Color, ? super Composer, ? super Integer, Unit> icon) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.route = route;
        this.label = label;
        this.icon = icon;
    }

    public final String getRoute() {
        return this.route;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Function3<Color, Composer, Integer, Unit> getIcon() {
        return this.icon;
    }
}
