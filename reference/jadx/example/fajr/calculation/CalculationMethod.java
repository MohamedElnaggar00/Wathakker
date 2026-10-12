package com.example.fajr.calculation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EGYPTIAN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PrayerTimesCalculator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B9\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, d2 = {"Lcom/example/fajr/calculation/CalculationMethod;", "", "id", "", "titleAr", "", "fajrAngle", "", "ishaAngle", "ishaMinutesAfterMaghrib", "<init>", "(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;)V", "getId", "()I", "getTitleAr", "()Ljava/lang/String;", "getFajrAngle", "()D", "getIshaAngle", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getIshaMinutesAfterMaghrib", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "MUSLIM_WORLD_LEAGUE", "EGYPTIAN", "UMM_AL_QURA", "ISNA", "KARACHI", "DUBAI", "KUWAIT", "QATAR", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalculationMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CalculationMethod[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CalculationMethod DUBAI;
    public static final CalculationMethod EGYPTIAN;
    public static final CalculationMethod ISNA;
    public static final CalculationMethod KARACHI;
    public static final CalculationMethod KUWAIT;
    public static final CalculationMethod MUSLIM_WORLD_LEAGUE = new CalculationMethod("MUSLIM_WORLD_LEAGUE", 0, 0, "رابطة العالم الإسلامي (18°)", 18.0d, Double.valueOf(17.0d), null, 16, null);
    public static final CalculationMethod QATAR;
    public static final CalculationMethod UMM_AL_QURA;
    private final double fajrAngle;
    private final int id;
    private final Double ishaAngle;
    private final Integer ishaMinutesAfterMaghrib;
    private final String titleAr;

    private static final /* synthetic */ CalculationMethod[] $values() {
        return new CalculationMethod[]{MUSLIM_WORLD_LEAGUE, EGYPTIAN, UMM_AL_QURA, ISNA, KARACHI, DUBAI, KUWAIT, QATAR};
    }

    public static EnumEntries<CalculationMethod> getEntries() {
        return $ENTRIES;
    }

    public static CalculationMethod valueOf(String str) {
        return (CalculationMethod) Enum.valueOf(CalculationMethod.class, str);
    }

    public static CalculationMethod[] values() {
        return (CalculationMethod[]) $VALUES.clone();
    }

    private CalculationMethod(String $enum$name, int $enum$ordinal, int id, String titleAr, double fajrAngle, Double ishaAngle, Integer ishaMinutesAfterMaghrib) {
        this.id = id;
        this.titleAr = titleAr;
        this.fajrAngle = fajrAngle;
        this.ishaAngle = ishaAngle;
        this.ishaMinutesAfterMaghrib = ishaMinutesAfterMaghrib;
    }

    /* synthetic */ CalculationMethod(String str, int i, int i2, String str2, double d, Double d2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, d, (i3 & 8) != 0 ? null : d2, (i3 & 16) != 0 ? null : num);
    }

    public final double getFajrAngle() {
        return this.fajrAngle;
    }

    public final int getId() {
        return this.id;
    }

    public final Double getIshaAngle() {
        return this.ishaAngle;
    }

    public final Integer getIshaMinutesAfterMaghrib() {
        return this.ishaMinutesAfterMaghrib;
    }

    public final String getTitleAr() {
        return this.titleAr;
    }

    static {
        Double valueOf = Double.valueOf(17.5d);
        EGYPTIAN = new CalculationMethod("EGYPTIAN", 1, 1, "الهيئة المصرية العامة للمساحة (19.5°)", 19.5d, valueOf, null, 16, null);
        int i = 90;
        UMM_AL_QURA = new CalculationMethod("UMM_AL_QURA", 2, 2, "أم القرى - مكة المكرمة (18.5°)", 18.5d, null, i, 8, null);
        ISNA = new CalculationMethod("ISNA", 3, 3, "الجمعية الإسلامية لشمال أمريكا (15°)", 15.0d, Double.valueOf(15.0d), null, 16, null);
        KARACHI = new CalculationMethod("KARACHI", 4, 4, "جامعة العلوم الإسلامية بكراتشي (18°)", 18.0d, Double.valueOf(18.0d), null, 16, null);
        DUBAI = new CalculationMethod("DUBAI", 5, 5, "دبي (18.2°)", 18.2d, Double.valueOf(18.2d), null, 16, null);
        KUWAIT = new CalculationMethod("KUWAIT", 6, 6, "الكويت (18°)", 18.0d, valueOf, null, 16, null);
        QATAR = new CalculationMethod("QATAR", 7, 7, "قطر (18°)", 18.0d, null, i, 8, null);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        INSTANCE = new Companion(null);
    }

    /* compiled from: PrayerTimesCalculator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/example/fajr/calculation/CalculationMethod$Companion;", "", "<init>", "()V", "fromId", "Lcom/example/fajr/calculation/CalculationMethod;", "id", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CalculationMethod fromId(int id) {
            CalculationMethod calculationMethod;
            CalculationMethod[] values = CalculationMethod.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    calculationMethod = values[i];
                    if (calculationMethod.getId() == id) {
                        break;
                    }
                    i++;
                } else {
                    calculationMethod = null;
                    break;
                }
            }
            return calculationMethod == null ? CalculationMethod.MUSLIM_WORLD_LEAGUE : calculationMethod;
        }
    }
}
