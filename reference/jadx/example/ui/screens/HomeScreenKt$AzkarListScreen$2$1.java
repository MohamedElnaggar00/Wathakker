package com.example.ui.screens;

import com.example.data.Tag;
import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class HomeScreenKt$AzkarListScreen$2$1 extends FunctionReferenceImpl implements Function1<Tag, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public HomeScreenKt$AzkarListScreen$2$1(Object obj) {
        super(1, obj, MainViewModel.class, "setSelectedTag", "setSelectedTag(Lcom/example/data/Tag;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Tag tag) {
        invoke2(tag);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Tag p0) {
        ((MainViewModel) this.receiver).setSelectedTag(p0);
    }
}
