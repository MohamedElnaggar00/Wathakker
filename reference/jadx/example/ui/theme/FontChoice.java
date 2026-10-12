package com.example.ui.theme;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Type.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/example/ui/theme/FontChoice;", "", "id", "", "titleAr", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitleAr", "APP", "APP_LIGHT", "APP_BOLD", "SYSTEM", "CAIRO", "NASKH", "AMIRI", "RUQAA", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum FontChoice {
    APP("app", "خط التطبيق"),
    APP_LIGHT("app_light", "خط التطبيق الخفيف"),
    APP_BOLD("app_bold", "خط التطبيق العريض"),
    SYSTEM("system", "خط النظام"),
    CAIRO("cairo", "خط القاهرة"),
    NASKH("naskh", "خط النسخ"),
    AMIRI("amiri", "خط أميري"),
    RUQAA("ruqaa", "خط الرقعة (للمناسبات)");

    private final String id;
    private final String titleAr;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<FontChoice> getEntries() {
        return $ENTRIES;
    }

    FontChoice(String id, String titleAr) {
        this.id = id;
        this.titleAr = titleAr;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitleAr() {
        return this.titleAr;
    }

    /* compiled from: Type.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/example/ui/theme/FontChoice$Companion;", "", "<init>", "()V", "fromId", "Lcom/example/ui/theme/FontChoice;", "id", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FontChoice fromId(String id) {
            Object obj;
            Iterator it = FontChoice.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((FontChoice) obj).getId(), id)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            FontChoice fontChoice = (FontChoice) obj;
            return fontChoice == null ? FontChoice.APP : fontChoice;
        }
    }
}
