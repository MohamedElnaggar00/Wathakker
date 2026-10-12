package com.example.prayer;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DarkModeKt;
import androidx.compose.material.icons.outlined.FilterDramaKt;
import androidx.compose.material.icons.outlined.LightModeKt;
import androidx.compose.material.icons.outlined.LocationOnKt;
import androidx.compose.material.icons.outlined.MosqueKt;
import androidx.compose.material.icons.outlined.NightsStayKt;
import androidx.compose.material.icons.outlined.WbSunnyKt;
import androidx.compose.material.icons.outlined.WbTwilightKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.example.fajr.calculation.CalculationMethod;
import com.example.fajr.calculation.PrayerTimesCalculator;
import com.example.fajr.data.CityItem;
import com.example.fajr.data.FajrPreferences;
import com.example.fajr.ui.CitySearchDialogKt;
import com.example.ui.oneui.OneUIDimens;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.theme.ColorKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrayerTimesScreen.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a{\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"PrayerTimesScreen", "", "onMenu", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "formatPrayerTime", "", "millis", "", "formatCountdown", "PrayerTimesContent", "city", "country", "hijriText", "gregorianText", "nextPrayerName", "nextPrayerTime", "countdownText", NotificationCompat.CATEGORY_PROGRESS, "", "rows", "", "Lcom/example/prayer/PrayerRowDisplay;", "onChangeCity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "app", "latitude", "", "longitude", "showCitySearch", "", "now"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PrayerTimesScreenKt {
    private static Modifier NextLabelOffset() {
        return OffsetKt.m689offsetVpY3zN4(Modifier.INSTANCE, 0.0f, 6.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesContent$lambda$50(String str, String str2, String str3, String str4, String str5, String str6, String str7, float f, List list, Function0 function0, Function0 function02, int i, int i2, int i3, Composer composer, int i4) {
        PrayerTimesContent(str, str2, str3, str4, str5, str6, str7, f, list, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesScreen$lambda$32(Function0 function0, int i, int i2, Composer composer, int i3) {
        PrayerTimesScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static String SavedCity(Composer composer) {
        return new FajrPreferences((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getCityName();
    }

    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v6 */
    public static final void PrayerTimesScreen(Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        final Function0 onMenu;
        int r17;
        int i2;
        int $dirty;
        Object next;
        Object next2;
        Object obj;
        Triple prev;
        final MutableState showCitySearch$delegate;
        final MutableState showCitySearch$delegate2;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Object mutableStateOf$default3;
        Object mutableStateOf$default4;
        Object mutableStateOf$default5;
        Object mutableStateOf$default6;
        Composer $composer2 = $composer.startRestartGroup(-1804255818);
        ComposerKt.sourceInformation($composer2, "C(PrayerTimesScreen)N(onMenu)50@2033L7,51@2057L37,52@2115L43,53@2180L44,54@2241L43,55@2304L46,56@2377L34,58@2428L55,59@2509L109,59@2488L130,113@4942L25,101@4423L575:PrayerTimesScreen.kt#6no35k");
        int $dirty2 = $changed;
        int i3 = i & 1;
        if (i3 != 0) {
            $dirty2 |= 6;
            function02 = function0;
        } else if (($changed & 6) == 0) {
            function02 = function0;
            $dirty2 |= $composer2.changedInstance(function02) ? 4 : 2;
        } else {
            function02 = function0;
        }
        if ($composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            onMenu = i3 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1804255818, $dirty2, -1, "com.example.prayer.PrayerTimesScreen (PrayerTimesScreen.kt:49)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart($composer2, 1276950395, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                r17 = 0;
                Object fajrPreferences = new FajrPreferences(context);
                $composer2.updateRememberedValue(fajrPreferences);
                rememberedValue = fajrPreferences;
            } else {
                r17 = 0;
            }
            final FajrPreferences prefs = (FajrPreferences) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1276952257, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i2 = 1;
                mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Double.valueOf(prefs.getLatitude()), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default6);
                rememberedValue2 = mutableStateOf$default6;
            } else {
                i2 = 1;
            }
            final MutableState latitude$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1276954338, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Double.valueOf(prefs.getLongitude()), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default5);
                rememberedValue3 = mutableStateOf$default5;
            }
            final MutableState longitude$delegate = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1276956289, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(prefs.getCityName(), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default4);
                rememberedValue4 = mutableStateOf$default4;
            }
            final MutableState city$delegate = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1276958308, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(prefs.getCountryName(), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default3);
                rememberedValue5 = mutableStateOf$default3;
            }
            final MutableState country$delegate = (MutableState) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1276960632, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(r17 != 0), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default2);
                rememberedValue6 = mutableStateOf$default2;
            }
            MutableState showCitySearch$delegate3 = (MutableState) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1276962285, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(System.currentTimeMillis()), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default);
                rememberedValue7 = mutableStateOf$default;
            }
            MutableState now$delegate = (MutableState) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 1276964931, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue8 = $composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object obj2 = (Function2) new PrayerTimesScreenKt$PrayerTimesScreen$1$1(now$delegate, null);
                $composer2.updateRememberedValue(obj2);
                rememberedValue8 = obj2;
            } else {
                $dirty = $dirty2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, $composer2, 6);
            CalculationMethod method = CalculationMethod.INSTANCE.fromId(prefs.getCalculationMethodId());
            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(PrayerTimesScreen$lambda$17(now$delegate));
            PrayerTimesCalculator prayerTimesCalculator = PrayerTimesCalculator.INSTANCE;
            Intrinsics.checkNotNull(cal);
            PrayerTimesCalculator.DayPrayerTimes today = prayerTimesCalculator.calculateAll(cal, PrayerTimesScreen$lambda$2(latitude$delegate), PrayerTimesScreen$lambda$5(longitude$delegate), method);
            Triple[] tripleArr = new Triple[6];
            tripleArr[r17] = new Triple("الفجر", Long.valueOf(today.getFajr()), WbTwilightKt.getWbTwilight(Icons.Outlined.INSTANCE));
            tripleArr[i2] = new Triple("الشروق", Long.valueOf(today.getSunrise()), WbSunnyKt.getWbSunny(Icons.Outlined.INSTANCE));
            tripleArr[2] = new Triple("الظهر", Long.valueOf(today.getDhuhr()), LightModeKt.getLightMode(Icons.Outlined.INSTANCE));
            tripleArr[3] = new Triple("العصر", Long.valueOf(today.getAsr()), FilterDramaKt.getFilterDrama(Icons.Outlined.INSTANCE));
            tripleArr[4] = new Triple("المغرب", Long.valueOf(today.getMaghrib()), NightsStayKt.getNightsStay(Icons.Outlined.INSTANCE));
            tripleArr[5] = new Triple("العشاء", Long.valueOf(today.getIsha()), DarkModeKt.getDarkMode(Icons.Outlined.INSTANCE));
            List ordered = CollectionsKt.listOf((Object[]) tripleArr);
            Iterator it = ordered.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if ((((Number) ((Triple) next).getSecond()).longValue() > PrayerTimesScreen$lambda$17(now$delegate) ? i2 : r17) != 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next != null) {
                next2 = next;
            } else {
                Object clone = cal.clone();
                Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.Calendar");
                Calendar tomorrowCal = (Calendar) clone;
                tomorrowCal.add(6, i2);
                PrayerTimesCalculator.DayPrayerTimes tomorrow = PrayerTimesCalculator.INSTANCE.calculateAll(tomorrowCal, PrayerTimesScreen$lambda$2(latitude$delegate), PrayerTimesScreen$lambda$5(longitude$delegate), method);
                Object next3 = new Triple("الفجر", Long.valueOf(tomorrow.getFajr()), WbTwilightKt.getWbTwilight(Icons.Outlined.INSTANCE));
                next2 = next3;
            }
            ListIterator listIterator = ordered.listIterator(ordered.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    Object previous = listIterator.previous();
                    if (((Number) ((Triple) previous).getSecond()).longValue() <= PrayerTimesScreen$lambda$17(now$delegate) ? true : (r17 != 0)) {
                        obj = previous;
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Triple prev2 = (Triple) obj;
            if (prev2 != null) {
                prev = prev2;
            } else {
                Object clone2 = cal.clone();
                Intrinsics.checkNotNull(clone2, "null cannot be cast to non-null type java.util.Calendar");
                Calendar yesterdayCal = (Calendar) clone2;
                yesterdayCal.add(6, -1);
                PrayerTimesCalculator.DayPrayerTimes yesterday = PrayerTimesCalculator.INSTANCE.calculateAll(yesterdayCal, PrayerTimesScreen$lambda$2(latitude$delegate), PrayerTimesScreen$lambda$5(longitude$delegate), method);
                prev = new Triple("العشاء", Long.valueOf(yesterday.getIsha()), DarkModeKt.getDarkMode(Icons.Outlined.INSTANCE));
            }
            long interval = RangesKt.coerceAtLeast(((Number) ((Triple) next2).getSecond()).longValue() - ((Number) prev.getSecond()).longValue(), 1L);
            float progress = RangesKt.coerceIn(((float) (PrayerTimesScreen$lambda$17(now$delegate) - ((Number) prev.getSecond()).longValue())) / ((float) interval), 0.0f, 1.0f);
            long remaining = RangesKt.coerceAtLeast(((Number) ((Triple) next2).getSecond()).longValue() - PrayerTimesScreen$lambda$17(now$delegate), 0L);
            String gregorian = new SimpleDateFormat("EEEE، d MMMM yyyy", new Locale("ar", "EG")).format(cal.getTime());
            String hijri = HijriDate.INSTANCE.format(cal);
            String gregorian2 = gregorian;
            String gregorian3 = PrayerTimesScreen$lambda$8(city$delegate);
            String hijri2 = hijri;
            String hijri3 = PrayerTimesScreen$lambda$11(country$delegate);
            Intrinsics.checkNotNull(gregorian2);
            String str = (String) ((Triple) next2).getFirst();
            String formatPrayerTime = formatPrayerTime(((Number) ((Triple) next2).getSecond()).longValue());
            String str2 = str;
            String formatCountdown = formatCountdown(remaining);
            List list = ordered;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterable<Triple> iterable = list;
            for (Triple triple : iterable) {
                Iterable iterable2 = list;
                String str3 = (String) triple.component1();
                long longValue = ((Number) triple.component2()).longValue();
                Iterable iterable3 = iterable;
                ImageVector imageVector = (ImageVector) triple.component3();
                String hijri4 = hijri2;
                String gregorian4 = gregorian2;
                String gregorian5 = formatPrayerTime(longValue);
                String str4 = str2;
                arrayList.add(new PrayerRowDisplay(str3, gregorian5, (Intrinsics.areEqual(str3, ((Triple) next2).getFirst()) && longValue == ((Number) ((Triple) next2).getSecond()).longValue()) ? true : (r17 != 0), imageVector));
                hijri2 = hijri4;
                iterable = iterable3;
                list = iterable2;
                gregorian2 = gregorian4;
                str2 = str4;
            }
            String hijri5 = hijri2;
            String gregorian6 = gregorian2;
            String str5 = str2;
            ArrayList arrayList2 = (List) arrayList;
            ComposerKt.sourceInformationMarkerStart($composer2, 1277042703, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            Object rememberedValue9 = $composer2.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                showCitySearch$delegate = showCitySearch$delegate3;
                Object obj3 = new Function0() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PrayerTimesScreenKt.PrayerTimesScreen$lambda$27$lambda$26(MutableState.this);
                    }
                };
                $composer2.updateRememberedValue(obj3);
                rememberedValue9 = obj3;
            } else {
                showCitySearch$delegate = showCitySearch$delegate3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            MutableState showCitySearch$delegate4 = showCitySearch$delegate;
            PrayerTimesContent(gregorian3, hijri3, hijri5, gregorian6, str5, formatPrayerTime, formatCountdown, progress, arrayList2, (Function0) rememberedValue9, onMenu, $composer2, 805306368, $dirty & 14, 0);
            if (PrayerTimesScreen$lambda$14(showCitySearch$delegate4)) {
                $composer2.startReplaceGroup(933717424);
                ComposerKt.sourceInformation($composer2, "119@5076L26,120@5133L479,118@5034L588");
                ComposerKt.sourceInformationMarkerStart($composer2, 1277046992, "CC(remember):PrayerTimesScreen.kt#9igjgp");
                Object rememberedValue10 = $composer2.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    showCitySearch$delegate2 = showCitySearch$delegate4;
                    Object obj4 = new Function0() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PrayerTimesScreenKt.PrayerTimesScreen$lambda$29$lambda$28(MutableState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj4);
                    rememberedValue10 = obj4;
                } else {
                    showCitySearch$delegate2 = showCitySearch$delegate4;
                }
                Function0 function03 = (Function0) rememberedValue10;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1277049269, "CC(remember):PrayerTimesScreen.kt#9igjgp");
                boolean changedInstance = $composer2.changedInstance(prefs);
                Object rememberedValue11 = $composer2.rememberedValue();
                if (changedInstance || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    final MutableState showCitySearch$delegate5 = showCitySearch$delegate2;
                    Object obj5 = new Function1() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            return PrayerTimesScreenKt.PrayerTimesScreen$lambda$31$lambda$30(FajrPreferences.this, latitude$delegate, longitude$delegate, city$delegate, country$delegate, showCitySearch$delegate5, (CityItem) obj6);
                        }
                    };
                    $composer2.updateRememberedValue(obj5);
                    rememberedValue11 = obj5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                CitySearchDialogKt.CitySearchDialog(function03, (Function1) rememberedValue11, $composer2, 6);
            } else {
                $composer2.startReplaceGroup(928713900);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            onMenu = function02;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return PrayerTimesScreenKt.PrayerTimesScreen$lambda$32(Function0.this, $changed, i, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    private static final double PrayerTimesScreen$lambda$2(MutableState<Double> mutableState) {
        return mutableState.getValue().doubleValue();
    }

    private static final void PrayerTimesScreen$lambda$3(MutableState<Double> mutableState, double d) {
        mutableState.setValue(Double.valueOf(d));
    }

    private static final double PrayerTimesScreen$lambda$5(MutableState<Double> mutableState) {
        return mutableState.getValue().doubleValue();
    }

    private static final void PrayerTimesScreen$lambda$6(MutableState<Double> mutableState, double d) {
        mutableState.setValue(Double.valueOf(d));
    }

    private static final String PrayerTimesScreen$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String PrayerTimesScreen$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean PrayerTimesScreen$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PrayerTimesScreen$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final long PrayerTimesScreen$lambda$17(MutableState<Long> mutableState) {
        return mutableState.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PrayerTimesScreen$lambda$18(MutableState<Long> mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesScreen$lambda$27$lambda$26(MutableState $showCitySearch$delegate) {
        PrayerTimesScreen$lambda$15($showCitySearch$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesScreen$lambda$29$lambda$28(MutableState $showCitySearch$delegate) {
        PrayerTimesScreen$lambda$15($showCitySearch$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesScreen$lambda$31$lambda$30(FajrPreferences $prefs, MutableState $latitude$delegate, MutableState $longitude$delegate, MutableState $city$delegate, MutableState $country$delegate, MutableState $showCitySearch$delegate, CityItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        $prefs.setLatitude(item.getLatitude());
        $prefs.setLongitude(item.getLongitude());
        $prefs.setCityName(item.getCityNameAr());
        $prefs.setCountryName(item.getCountryNameAr());
        $prefs.setUseCurrentLocation(false);
        PrayerTimesScreen$lambda$3($latitude$delegate, item.getLatitude());
        PrayerTimesScreen$lambda$6($longitude$delegate, item.getLongitude());
        $city$delegate.setValue(item.getCityNameAr());
        $country$delegate.setValue(item.getCountryNameAr());
        PrayerTimesScreen$lambda$15($showCitySearch$delegate, false);
        return Unit.INSTANCE;
    }

    private static final String formatPrayerTime(long millis) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(millis);
        String ampm = cal.get(9) == 0 ? "ص" : "م";
        return new SimpleDateFormat("hh:mm", Locale.US).format(cal.getTime()) + " " + ampm;
    }

    private static final String formatCountdown(long millis) {
        long totalSeconds = millis / 1000;
        long h = totalSeconds / 3600;
        long m = (totalSeconds % 3600) / 60;
        long s = totalSeconds % 60;
        String format = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(h), Long.valueOf(m), Long.valueOf(s)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrayerTimesContent(final String city, final String country, final String hijriText, final String gregorianText, final String nextPrayerName, final String nextPrayerTime, final String countdownText, final float progress, final List<PrayerRowDisplay> rows, final Function0<Unit> onChangeCity, Function0<Unit> function0, Composer $composer, final int $changed, final int $changed1, final int i) {
        Function0 onMenu;
        Composer $composer2;
        final Function0 onMenu2;
        int $dirty1;
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(hijriText, "hijriText");
        Intrinsics.checkNotNullParameter(gregorianText, "gregorianText");
        Intrinsics.checkNotNullParameter(nextPrayerName, "nextPrayerName");
        Intrinsics.checkNotNullParameter(nextPrayerTime, "nextPrayerTime");
        Intrinsics.checkNotNullParameter(countdownText, "countdownText");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(onChangeCity, "onChangeCity");
        Composer $composer3 = $composer.startRestartGroup(1360949258);
        ComposerKt.sourceInformation($composer3, "C(PrayerTimesContent)N(city,country,hijriText,gregorianText,nextPrayerName,nextPrayerTime,countdownText,progress,rows,onChangeCity,onMenu)165@6567L11,170@6697L6396,166@6583L6510:PrayerTimesScreen.kt#6no35k");
        int $dirty = $changed;
        int $dirty12 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(city) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(country) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(hijriText) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(gregorianText) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(nextPrayerName) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changed(nextPrayerTime) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changed(countdownText) ? 1048576 : 524288;
        }
        if ((12582912 & $changed) == 0) {
            $dirty |= $composer3.changed(progress) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changedInstance(rows) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty |= $composer3.changedInstance(onChangeCity) ? 536870912 : 268435456;
        }
        int i2 = i & 1024;
        if (i2 != 0) {
            $dirty12 |= 6;
            onMenu = function0;
        } else if (($changed1 & 6) == 0) {
            onMenu = function0;
            $dirty12 |= $composer3.changedInstance(onMenu) ? 4 : 2;
        } else {
            onMenu = function0;
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty12 & 3) == 2) ? false : true, $dirty & 1)) {
            if (i2 != 0) {
                onMenu = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1360949258, $dirty, $dirty12, "com.example.prayer.PrayerTimesContent (PrayerTimesScreen.kt:164)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            String str = city + "، " + country;
            ComposerKt.sourceInformationMarkerStart($composer3, -2092766362, "CC(remember):PrayerTimesScreen.kt#9igjgp");
            boolean changed = (($dirty & 896) == 256) | $composer3.changed(cs) | (($dirty & 7168) == 2048) | ((1879048192 & $dirty) == 536870912) | ((3670016 & $dirty) == 1048576) | (($dirty & 57344) == 16384) | ((458752 & $dirty) == 131072) | ((29360128 & $dirty) == 8388608) | $composer3.changedInstance(rows);
            Object rememberedValue = $composer3.rememberedValue();
            if (!changed && rememberedValue != Composer.INSTANCE.getEmpty()) {
                $dirty1 = $dirty12;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer2 = $composer3;
                Function0 onMenu3 = onMenu;
                OneUIKt.m7686OneUIScreengMrHQkA("مواعيد الصلاة", null, null, null, onMenu3, null, null, 0.0f, (Function1) rememberedValue, $composer2, (($dirty1 << 12) & 57344) | 6, 234);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                onMenu2 = onMenu3;
            }
            $dirty1 = $dirty12;
            rememberedValue = new Function1() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48(ColorScheme.this, hijriText, gregorianText, onChangeCity, progress, countdownText, nextPrayerName, nextPrayerTime, rows, (LazyListScope) obj);
                }
            };
            $composer3.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            Function0 onMenu32 = onMenu;
            OneUIKt.m7686OneUIScreengMrHQkA("مواعيد الصلاة", null, null, null, onMenu32, null, null, 0.0f, (Function1) rememberedValue, $composer2, (($dirty1 << 12) & 57344) | 6, 234);
            if (ComposerKt.isTraceInProgress()) {
            }
            onMenu2 = onMenu32;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onMenu2 = onMenu;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrayerTimesScreenKt.PrayerTimesContent$lambda$50(city, country, hijriText, gregorianText, nextPrayerName, nextPrayerTime, countdownText, progress, rows, onChangeCity, onMenu2, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesContent$lambda$49$lambda$48$lambda$36(final ColorScheme $cs, final String $hijriText, final String $gregorianText, final Function0 $onChangeCity, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C173@6871L1362,173@6829L1404:PrayerTimesScreen.kt#6no35k");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917454572, $changed, -1, "com.example.prayer.PrayerTimesContent.<anonymous>.<anonymous>.<anonymous> (PrayerTimesScreen.kt:173)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(20)), 0L, ComposableLambdaKt.rememberComposableLambda(19507671, true, new Function3() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48$lambda$36$lambda$35(ColorScheme.this, $hijriText, $gregorianText, $onChangeCity, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit PrayerTimesContent$lambda$49$lambda$48$lambda$36$lambda$35(ColorScheme $cs, String $hijriText, String $gregorianText, Function0 $onChangeCity, ColumnScope OneUICard, Composer $composer, int $changed) {
        int i;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C176@6968L10,174@6889L210,180@7116L29,183@7245L10,181@7162L171,186@7350L30,187@7397L822:PrayerTimesScreen.kt#6no35k");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(19507671, $changed, -1, "com.example.prayer.PrayerTimesContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrayerTimesScreen.kt:174)");
            }
            TextKt.m2816Text4IGK_g($hijriText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), $composer, 6);
            TextKt.m2816Text4IGK_g($gregorianText, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(12))), Dp.m7226constructorimpl(0), Dp.m7226constructorimpl(6));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m731paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
                i = 384;
            } else {
                i = 384;
                if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i4 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1893114931, "C194@7724L228,200@7973L28,203@8114L10,201@8022L179:PrayerTimesScreen.kt#6no35k");
                    IconKt.m2273Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, PaddingKt.m730padding3ABfNKs(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), 11.0f), $cs.getOnSurfaceVariant(), $composer, 432, 0);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
                    TextKt.m2816Text4IGK_g(SavedCity($composer), (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, 6, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i42 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1893114931, "C194@7724L228,200@7973L28,203@8114L10,201@8022L179:PrayerTimesScreen.kt#6no35k");
            IconKt.m2273Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, PaddingKt.m730padding3ABfNKs(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), 11.0f), $cs.getOnSurfaceVariant(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
            TextKt.m2816Text4IGK_g(SavedCity($composer), (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesContent$lambda$49$lambda$48$lambda$42(final float $progress, final ColorScheme $cs, final String $countdownText, final String $nextPrayerName, final String $nextPrayerTime, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C212@8442L2220,212@8400L2262:PrayerTimesScreen.kt#6no35k");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1452819165, $changed, -1, "com.example.prayer.PrayerTimesContent.<anonymous>.<anonymous>.<anonymous> (PrayerTimesScreen.kt:212)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(20)), 0L, ComposableLambdaKt.rememberComposableLambda(-1091364530, true, new Function3() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48$lambda$42$lambda$41($progress, $cs, $countdownText, $nextPrayerName, $nextPrayerTime, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x056a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit PrayerTimesContent$lambda$49$lambda$48$lambda$42$lambda$41(float $progress, ColorScheme $cs, String $countdownText, String $nextPrayerName, String $nextPrayerTime, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Composer m3828constructorimpl;
        Function0 function03;
        Composer m3828constructorimpl2;
        int i;
        Function0 function04;
        Composer m3828constructorimpl3;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C213@8460L913,235@9390L30,236@9437L1110,262@10564L30,263@10611L37:PrayerTimesScreen.kt#6no35k");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091364530, $changed, -1, "com.example.prayer.PrayerTimesContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrayerTimesScreen.kt:213)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl4.getInserting() && Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i4 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1962544644, "C214@8534L560,228@9115L29,231@9259L10,229@9165L190:PrayerTimesScreen.kt#6no35k");
                Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), $cs.getSurfaceVariant(), null, 2, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                    function02 = constructor2;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor2;
                    $composer.useNode();
                }
                m3828constructorimpl = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i7 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -524456021, "C221@8828L244:PrayerTimesScreen.kt#6no35k");
                    IconKt.m2273Iconww6aTOc(MosqueKt.getMosque(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), ColorKt.getOneUIActiveGreen(), $composer, 432, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    TextKt.m2816Text4IGK_g("الصلاة القادمة", NextLabelOffset(), $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 6, 0, 65528);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), $composer, 6);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, bottom, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i8 = ((((438 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        function03 = constructor3;
                        $composer.createNode(function03);
                    } else {
                        function03 = constructor3;
                        $composer.useNode();
                    }
                    m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl2.getInserting()) {
                        i = 438;
                        if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i9 = (i8 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            int i10 = ((i >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 651529221, "C243@9745L10,241@9654L278,248@9953L576:PrayerTimesScreen.kt#6no35k");
                            TextKt.m2816Text4IGK_g($countdownText, (Modifier) null, ColorKt.getOneUITimeCyan(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 199680, 0, 65490);
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier modifier2 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier2);
                            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            int i11 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer.startReusableNode();
                            if ($composer.getInserting()) {
                                function04 = constructor4;
                                $composer.createNode(function04);
                            } else {
                                function04 = constructor4;
                                $composer.useNode();
                            }
                            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                int i12 = (i11 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                int i13 = ((384 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, 1101972258, "C251@10123L10,249@10023L255,257@10403L10,255@10303L204:PrayerTimesScreen.kt#6no35k");
                                TextKt.m2816Text4IGK_g($nextPrayerName, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                                TextKt.m2816Text4IGK_g($nextPrayerTime, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                                OneUIKt.m7684OneUIProgressBareaDK9VM($progress, null, ColorKt.getOneUIActiveGreen(), 0L, $composer, 0, 10);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            int i122 = (i11 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            int i132 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 1101972258, "C251@10123L10,249@10023L255,257@10403L10,255@10303L204:PrayerTimesScreen.kt#6no35k");
                            TextKt.m2816Text4IGK_g($nextPrayerName, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                            TextKt.m2816Text4IGK_g($nextPrayerTime, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                            OneUIKt.m7684OneUIProgressBareaDK9VM($progress, null, ColorKt.getOneUIActiveGreen(), 0L, $composer, 0, 10);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    } else {
                        i = 438;
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i92 = (i8 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                    int i102 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 651529221, "C243@9745L10,241@9654L278,248@9953L576:PrayerTimesScreen.kt#6no35k");
                    TextKt.m2816Text4IGK_g($countdownText, (Modifier) null, ColorKt.getOneUITimeCyan(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 199680, 0, 65490);
                    Alignment.Horizontal end2 = Alignment.INSTANCE.getEnd();
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier22 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier($composer, modifier22);
                    Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    int i112 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl3.getInserting()) {
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        int i1222 = (i112 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                        int i1322 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1101972258, "C251@10123L10,249@10023L255,257@10403L10,255@10303L204:PrayerTimesScreen.kt#6no35k");
                        TextKt.m2816Text4IGK_g($nextPrayerName, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                        TextKt.m2816Text4IGK_g($nextPrayerTime, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                        OneUIKt.m7684OneUIProgressBareaDK9VM($progress, null, ColorKt.getOneUIActiveGreen(), 0L, $composer, 0, 10);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42), setCompositeKeyHash42);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                    int i12222 = (i112 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                    int i13222 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1101972258, "C251@10123L10,249@10023L255,257@10403L10,255@10303L204:PrayerTimesScreen.kt#6no35k");
                    TextKt.m2816Text4IGK_g($nextPrayerName, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                    TextKt.m2816Text4IGK_g($nextPrayerTime, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                    OneUIKt.m7684OneUIProgressBareaDK9VM($progress, null, ColorKt.getOneUIActiveGreen(), 0L, $composer, 0, 10);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i62 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i72 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -524456021, "C221@8828L244:PrayerTimesScreen.kt#6no35k");
                IconKt.m2273Iconww6aTOc(MosqueKt.getMosque(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), ColorKt.getOneUIActiveGreen(), $composer, 432, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                TextKt.m2816Text4IGK_g("الصلاة القادمة", NextLabelOffset(), $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 6, 0, 65528);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), $composer, 6);
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical bottom2 = Alignment.INSTANCE.getBottom();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween2, bottom2, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2);
                Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                int i82 = ((((438 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                int i922 = (i82 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                int i1022 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 651529221, "C243@9745L10,241@9654L278,248@9953L576:PrayerTimesScreen.kt#6no35k");
                TextKt.m2816Text4IGK_g($countdownText, (Modifier) null, ColorKt.getOneUITimeCyan(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 199680, 0, 65490);
                Alignment.Horizontal end22 = Alignment.INSTANCE.getEnd();
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap422 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier422 = ComposedModifierKt.materializeModifier($composer, modifier222);
                Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                int i1122 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422), setCompositeKeyHash422);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                int i122222 = (i1122 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                int i132222 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1101972258, "C251@10123L10,249@10023L255,257@10403L10,255@10303L204:PrayerTimesScreen.kt#6no35k");
                TextKt.m2816Text4IGK_g($nextPrayerName, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                TextKt.m2816Text4IGK_g($nextPrayerTime, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                OneUIKt.m7684OneUIProgressBareaDK9VM($progress, null, ColorKt.getOneUIActiveGreen(), 0L, $composer, 0, 10);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            int i42 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1962544644, "C214@8534L560,228@9115L29,231@9259L10,229@9165L190:PrayerTimesScreen.kt#6no35k");
            Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), $cs.getSurfaceVariant(), null, 2, null);
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i622 = (i52 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                int i722 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -524456021, "C221@8828L244:PrayerTimesScreen.kt#6no35k");
                IconKt.m2273Iconww6aTOc(MosqueKt.getMosque(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), ColorKt.getOneUIActiveGreen(), $composer, 432, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                TextKt.m2816Text4IGK_g("الصلاة القادمة", NextLabelOffset(), $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 6, 0, 65528);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), $composer, 6);
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical bottom22 = Alignment.INSTANCE.getBottom();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween22, bottom22, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i822 = ((((438 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i9222 = (i822 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
                int i10222 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 651529221, "C243@9745L10,241@9654L278,248@9953L576:PrayerTimesScreen.kt#6no35k");
                TextKt.m2816Text4IGK_g($countdownText, (Modifier) null, ColorKt.getOneUITimeCyan(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 199680, 0, 65490);
                Alignment.Horizontal end222 = Alignment.INSTANCE.getEnd();
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier2222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier($composer, modifier2222);
                Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                int i11222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4222));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4222), setCompositeKeyHash4222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                int i1222222 = (i11222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                int i1322222 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1101972258, "C251@10123L10,249@10023L255,257@10403L10,255@10303L204:PrayerTimesScreen.kt#6no35k");
                TextKt.m2816Text4IGK_g($nextPrayerName, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                TextKt.m2816Text4IGK_g($nextPrayerTime, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                OneUIKt.m7684OneUIProgressBareaDK9VM($progress, null, ColorKt.getOneUIActiveGreen(), 0L, $composer, 0, 10);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i6222 = (i52 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            int i7222 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -524456021, "C221@8828L244:PrayerTimesScreen.kt#6no35k");
            IconKt.m2273Iconww6aTOc(MosqueKt.getMosque(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), ColorKt.getOneUIActiveGreen(), $composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            TextKt.m2816Text4IGK_g("الصلاة القادمة", NextLabelOffset(), $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 6, 0, 65528);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), $composer, 6);
            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical bottom222 = Alignment.INSTANCE.getBottom();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(spaceBetween222, bottom222, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i8222 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i92222 = (i8222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
            int i102222 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 651529221, "C243@9745L10,241@9654L278,248@9953L576:PrayerTimesScreen.kt#6no35k");
            TextKt.m2816Text4IGK_g($countdownText, (Modifier) null, ColorKt.getOneUITimeCyan(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 199680, 0, 65490);
            Alignment.Horizontal end2222 = Alignment.INSTANCE.getEnd();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier22222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end2222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash42222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap42222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier($composer, modifier22222);
            Function0 constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
            int i112222 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl3.getInserting()) {
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42222));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42222), setCompositeKeyHash42222);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
            int i12222222 = (i112222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
            int i13222222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1101972258, "C251@10123L10,249@10023L255,257@10403L10,255@10303L204:PrayerTimesScreen.kt#6no35k");
            TextKt.m2816Text4IGK_g($nextPrayerName, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            TextKt.m2816Text4IGK_g($nextPrayerTime, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
            OneUIKt.m7684OneUIProgressBareaDK9VM($progress, null, ColorKt.getOneUIActiveGreen(), 0L, $composer, 0, 10);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesContent$lambda$49$lambda$48(final ColorScheme $cs, String $hijriText, String $gregorianText, Function0 $onChangeCity, float $progress, String $countdownText, String $nextPrayerName, String $nextPrayerTime, final List $rows, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, "prayer-overview", null, ComposableLambdaKt.composableLambdaInstance(917454572, true, new MergedPrayerCard($cs, $hijriText, $gregorianText, $onChangeCity, $progress, $countdownText, $nextPrayerName, $nextPrayerTime)), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "prayer-list", null, ComposableLambdaKt.composableLambdaInstance(-186748380, true, new Function3() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48$lambda$47($rows, $cs, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimesContent$lambda$49$lambda$48$lambda$47(final List $rows, final ColorScheme $cs, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C269@10797L2280,269@10787L2290:PrayerTimesScreen.kt#6no35k");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-186748380, $changed, -1, "com.example.prayer.PrayerTimesContent.<anonymous>.<anonymous>.<anonymous> (PrayerTimesScreen.kt:269)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(174706255, true, new Function3() { // from class: com.example.prayer.PrayerTimesScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PrayerTimesScreenKt.PrayerTimesContent$lambda$49$lambda$48$lambda$47$lambda$46($rows, $cs, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit PrayerTimesContent$lambda$49$lambda$48$lambda$47$lambda$46(List $rows, ColorScheme $cs, ColumnScope OneUICard, Composer $composer, int $changed) {
        long m4524getTransparent0d7_KjU;
        Function0 function0;
        long surfaceVariant;
        Function0 function02;
        Composer m3828constructorimpl;
        Composer composer;
        List list = $rows;
        Composer composer2 = $composer;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation(composer2, "C*274@11011L2034:PrayerTimesScreen.kt#6no35k");
        int i = 0;
        int i2 = 1;
        if (!composer2.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(174706255, $changed, -1, "com.example.prayer.PrayerTimesContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrayerTimesScreen.kt:270)");
            }
            List list2 = list;
            int i3 = 0;
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                PrayerRowDisplay prayerRowDisplay = (PrayerRowDisplay) obj;
                if (i4 <= 0 || prayerRowDisplay.getIsNext() || ((PrayerRowDisplay) list.get(i4 - 1)).getIsNext()) {
                    composer2.startReplaceGroup(2075434043);
                } else {
                    composer2.startReplaceGroup(2086277533);
                    ComposerKt.sourceInformation(composer2, "272@10954L14");
                    OneUIKt.m7682OneUIDividerkHDZbjc(0.0f, composer2, i, i2);
                }
                composer2.endReplaceGroup();
                Modifier clip = ClipKt.clip(PaddingKt.m731paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i2, null), Dp.m7226constructorimpl(8), Dp.m7226constructorimpl(4)), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(OneUIDimens.INSTANCE.m7676getCardRadiusD9Ej5fM()));
                if (prayerRowDisplay.getIsNext()) {
                    m4524getTransparent0d7_KjU = Color.m4487copywmQWz5c(r17, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r17) : 0.14f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r17) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r17) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.getOneUIActiveGreen()) : 0.0f);
                } else {
                    m4524getTransparent0d7_KjU = Color.INSTANCE.m4524getTransparent0d7_KjU();
                }
                Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(BackgroundKt.m231backgroundbw27NRU$default(clip, m4524getTransparent0d7_KjU, null, 2, null), Dp.m7226constructorimpl(12), Dp.m7226constructorimpl(10));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                Iterable iterable = list2;
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m731paddingVpY3zN4);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i6 = ((((384 << 3) & 112) << 6) & 896) | 6;
                int i7 = i3;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer.useNode();
                }
                Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i8 = (i6 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i9 = ((384 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, 2059723342, "C283@11533L692,297@12250L29,300@12398L10,298@12304L319,304@12648L27,307@12798L10,305@12700L323:PrayerTimesScreen.kt#6no35k");
                    Modifier clip2 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(38)), RoundedCornerShapeKt.getCircleShape());
                    if (prayerRowDisplay.getIsNext()) {
                        surfaceVariant = $cs.getSurfaceVariant();
                    } else {
                        surfaceVariant = Color.m4487copywmQWz5c(r37, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r37) : 0.18f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r37) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r37) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.getOneUIActiveGreen()) : 0.0f);
                    }
                    Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(clip2, surfaceVariant, null, 2, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i10 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        function02 = constructor2;
                        $composer.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        composer = $composer;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i11 = (i10 >> 6) & 14;
                            Composer composer3 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            int i12 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer3, -903522878, "C290@11907L292:PrayerTimesScreen.kt#6no35k");
                            IconKt.m2273Iconww6aTOc(prayerRowDisplay.getIcon(), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), prayerRowDisplay.getIsNext() ? ColorKt.getOneUIActiveGreen() : $cs.getOnSurfaceVariant(), composer3, 432, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                            TextKt.m2816Text4IGK_g(prayerRowDisplay.getName(), (Modifier) null, prayerRowDisplay.getIsNext() ? ColorKt.getOneUIActiveGreen() : $cs.getOnSurface(), 0L, (FontStyle) null, prayerRowDisplay.getIsNext() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65498);
                            SpacerKt.Spacer(RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
                            TextKt.m2816Text4IGK_g(prayerRowDisplay.getTimeText(), (Modifier) null, prayerRowDisplay.getIsNext() ? $cs.getPrimary() : $cs.getOnSurface(), 0L, (FontStyle) null, prayerRowDisplay.getIsNext() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65498);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            list = $rows;
                            i = 0;
                            i4 = i5;
                            list2 = iterable;
                            i3 = i7;
                            i2 = 1;
                            composer2 = $composer;
                        }
                    } else {
                        composer = $composer;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i112 = (i10 >> 6) & 14;
                    Composer composer32 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer32, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i122 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer32, -903522878, "C290@11907L292:PrayerTimesScreen.kt#6no35k");
                    IconKt.m2273Iconww6aTOc(prayerRowDisplay.getIcon(), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), prayerRowDisplay.getIsNext() ? ColorKt.getOneUIActiveGreen() : $cs.getOnSurfaceVariant(), composer32, 432, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer32);
                    ComposerKt.sourceInformationMarkerEnd(composer32);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                    TextKt.m2816Text4IGK_g(prayerRowDisplay.getName(), (Modifier) null, prayerRowDisplay.getIsNext() ? ColorKt.getOneUIActiveGreen() : $cs.getOnSurface(), 0L, (FontStyle) null, prayerRowDisplay.getIsNext() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65498);
                    SpacerKt.Spacer(RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
                    TextKt.m2816Text4IGK_g(prayerRowDisplay.getTimeText(), (Modifier) null, prayerRowDisplay.getIsNext() ? $cs.getPrimary() : $cs.getOnSurface(), 0L, (FontStyle) null, prayerRowDisplay.getIsNext() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65498);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    list = $rows;
                    i = 0;
                    i4 = i5;
                    list2 = iterable;
                    i3 = i7;
                    i2 = 1;
                    composer2 = $composer;
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i82 = (i6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i92 = ((384 >> 6) & 112) | 6;
                RowScope rowScope2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 2059723342, "C283@11533L692,297@12250L29,300@12398L10,298@12304L319,304@12648L27,307@12798L10,305@12700L323:PrayerTimesScreen.kt#6no35k");
                Modifier clip22 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(38)), RoundedCornerShapeKt.getCircleShape());
                if (prayerRowDisplay.getIsNext()) {
                }
                Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(clip22, surfaceVariant, null, 2, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default2);
                Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                int i102 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl.getInserting()) {
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i1122 = (i102 >> 6) & 14;
                Composer composer322 = composer;
                ComposerKt.sourceInformationMarkerStart(composer322, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                int i1222 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer322, -903522878, "C290@11907L292:PrayerTimesScreen.kt#6no35k");
                IconKt.m2273Iconww6aTOc(prayerRowDisplay.getIcon(), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), prayerRowDisplay.getIsNext() ? ColorKt.getOneUIActiveGreen() : $cs.getOnSurfaceVariant(), composer322, 432, 0);
                ComposerKt.sourceInformationMarkerEnd(composer322);
                ComposerKt.sourceInformationMarkerEnd(composer322);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                TextKt.m2816Text4IGK_g(prayerRowDisplay.getName(), (Modifier) null, prayerRowDisplay.getIsNext() ? ColorKt.getOneUIActiveGreen() : $cs.getOnSurface(), 0L, (FontStyle) null, prayerRowDisplay.getIsNext() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65498);
                SpacerKt.Spacer(RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
                TextKt.m2816Text4IGK_g(prayerRowDisplay.getTimeText(), (Modifier) null, prayerRowDisplay.getIsNext() ? $cs.getPrimary() : $cs.getOnSurface(), 0L, (FontStyle) null, prayerRowDisplay.getIsNext() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65498);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                list = $rows;
                i = 0;
                i4 = i5;
                list2 = iterable;
                i3 = i7;
                i2 = 1;
                composer2 = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
