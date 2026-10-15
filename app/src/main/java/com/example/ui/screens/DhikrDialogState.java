package com.example.ui.screens;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.example.data.Dhikr;
import kotlin.Metadata;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR/\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/example/ui/screens/DhikrDialogState;", "", "<init>", "()V", "<set-?>", "Lcom/example/data/Dhikr;", "times", "getTimes", "()Lcom/example/data/Dhikr;", "setTimes", "(Lcom/example/data/Dhikr;)V", "times$delegate", "Landroidx/compose/runtime/MutableState;", "edit", "getEdit", "setEdit", "edit$delegate", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DhikrDialogState {
    public static final int $stable = 0;

    /* renamed from: edit$delegate, reason: from kotlin metadata */
    private final MutableState edit;

    /* renamed from: times$delegate, reason: from kotlin metadata */
    private final MutableState times;

    public DhikrDialogState() {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.structuralEqualityPolicy());
        this.times = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.structuralEqualityPolicy());
        this.edit = mutableStateOf$default2;
    }

    public final Dhikr getTimes() {
        return (Dhikr) this.times.getValue();
    }

    public final void setTimes(Dhikr dhikr) {
        this.times.setValue(dhikr);
    }

    public final Dhikr getEdit() {
        return (Dhikr) this.edit.getValue();
    }

    public final void setEdit(Dhikr dhikr) {
        this.edit.setValue(dhikr);
    }
}
