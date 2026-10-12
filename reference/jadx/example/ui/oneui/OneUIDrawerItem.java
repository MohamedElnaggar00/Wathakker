package com.example.ui.oneui;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneUI.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/example/ui/oneui/OneUIDrawerItem;", "", "route", "", "label", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "tint", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRoute", "()Ljava/lang/String;", "getLabel", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getTint-0d7_KjU", "()J", "J", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneUIDrawerItem {
    public static final int $stable = 0;
    private final ImageVector icon;
    private final String label;
    private final String route;
    private final long tint;

    public /* synthetic */ OneUIDrawerItem(String str, String str2, ImageVector imageVector, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, imageVector, j);
    }

    private OneUIDrawerItem(String route, String label, ImageVector icon, long tint) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.route = route;
        this.label = label;
        this.icon = icon;
        this.tint = tint;
    }

    public final String getRoute() {
        return this.route;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    /* renamed from: getTint-0d7_KjU, reason: not valid java name and from getter */
    public final long getTint() {
        return this.tint;
    }
}
