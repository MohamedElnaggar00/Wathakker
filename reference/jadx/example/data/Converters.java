package com.example.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Converters.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/example/data/Converters;", "", "<init>", "()V", "fromString", "", "", "value", "toString", "list", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Converters {
    public static final int $stable = 0;

    public final List<String> fromString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Iterable split$default = StringsKt.split$default((CharSequence) value, new String[]{","}, false, 0, 6, (Object) null);
        Collection arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }

    public final String toString(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
    }
}
