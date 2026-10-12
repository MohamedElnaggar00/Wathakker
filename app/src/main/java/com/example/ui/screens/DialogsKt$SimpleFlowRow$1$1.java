package com.example.ui.screens;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Dialogs.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DialogsKt$SimpleFlowRow$1$1 implements MeasurePolicy {
    final /* synthetic */ float $spacing;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogsKt$SimpleFlowRow$1$1(float f) {
        this.$spacing = f;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends IntrinsicMeasurable> list, int width) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, $this$maxIntrinsicHeight, list, width);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> list, int height) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, $this$maxIntrinsicWidth, list, height);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends IntrinsicMeasurable> list, int width) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, $this$minIntrinsicHeight, list, width);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> list, int height) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, $this$minIntrinsicWidth, list, height);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo32measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long constraints) {
        long m7158copyZbe2FdA;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        final int h = Layout.mo364roundToPx0680j_4(this.$spacing);
        final int v = Layout.mo364roundToPx0680j_4(this.$spacing);
        List<? extends Measurable> list = measurables;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterable<Measurable> iterable = list;
        for (Measurable measurable : iterable) {
            m7158copyZbe2FdA = Constraints.m7158copyZbe2FdA(constraints, (r12 & 1) != 0 ? Constraints.m7171getMinWidthimpl(constraints) : 0, (r12 & 2) != 0 ? Constraints.m7169getMaxWidthimpl(constraints) : 0, (r12 & 4) != 0 ? Constraints.m7170getMinHeightimpl(constraints) : 0, (r12 & 8) != 0 ? Constraints.m7168getMaxHeightimpl(constraints) : 0);
            arrayList.add(measurable.mo5918measureBRTryo0(m7158copyZbe2FdA));
            iterable = iterable;
        }
        List<Placeable> placeables = (List) arrayList;
        final List rows = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = arrayList2;
        int w = 0;
        for (Placeable pl : placeables) {
            if (!arrayList3.isEmpty() && w + h + pl.getWidth() > Constraints.m7169getMaxWidthimpl(constraints)) {
                rows.add(arrayList3);
                w = 0;
                arrayList3 = new ArrayList();
            }
            List cur = arrayList3;
            if (!cur.isEmpty()) {
                w += h;
            }
            arrayList3.add(pl);
            w += pl.getWidth();
        }
        if (!arrayList3.isEmpty()) {
            rows.add(arrayList3);
        }
        List list2 = rows;
        Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int height = ((Placeable) it2.next()).getHeight();
            while (it2.hasNext()) {
                int height2 = ((Placeable) it2.next()).getHeight();
                if (height < height2) {
                    height = height2;
                }
            }
            arrayList4.add(Integer.valueOf(height));
        }
        final List rowHeights = (List) arrayList4;
        int totalH = RangesKt.coerceIn(CollectionsKt.sumOfInt(rowHeights) + (RangesKt.coerceAtLeast(rows.size() - 1, 0) * v), Constraints.m7170getMinHeightimpl(constraints), Constraints.m7168getMaxHeightimpl(constraints));
        return MeasureScope.CC.layout$default(Layout, Constraints.m7169getMaxWidthimpl(constraints), totalH, null, new Function1() { // from class: com.example.ui.screens.DialogsKt$SimpleFlowRow$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogsKt$SimpleFlowRow$1$1.measure_3p2s80s$lambda$5(rows, rowHeights, v, h, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit measure_3p2s80s$lambda$5(List $rows, List $rowHeights, int $v, int $h, Placeable.PlacementScope $this$layout) {
        Placeable.PlacementScope layout = $this$layout;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int i = 0;
        int y = 0;
        for (Object obj : $rows) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i3 = i;
            int i4 = 0;
            for (Placeable placeable : (List) obj) {
                Placeable.PlacementScope.placeRelative$default(layout, placeable, i4, y, 0.0f, 4, null);
                i4 += placeable.getWidth() + $h;
                layout = $this$layout;
            }
            y += ((Number) $rowHeights.get(i3)).intValue() + $v;
            layout = $this$layout;
            i = i2;
        }
        return Unit.INSTANCE;
    }
}
