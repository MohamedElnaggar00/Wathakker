package com.example.ui.screens;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.LabelKt;
import androidx.compose.material.icons.outlined.AlarmKt;
import androidx.compose.material.icons.outlined.BarChartKt;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.material.icons.outlined.NotificationsKt;
import androidx.compose.material.icons.outlined.SettingsKt;
import androidx.compose.material.icons.outlined.StarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import com.example.ui.oneui.OneUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoreScreen.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"MoreScreen", "", "onNavigate", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MoreRow", "title", "summary", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MoreScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreRow$lambda$22(String str, String str2, ImageVector imageVector, Function0 function0, int i, Composer composer, int i2) {
        MoreRow(str, str2, imageVector, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$20(Function1 function1, int i, Composer composer, int i2) {
        MoreScreen(function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MoreScreen(final Function1<? super String, Unit> onNavigate, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(onNavigate, "onNavigate");
        Composer $composer2 = $composer.startRestartGroup(730312179);
        ComposerKt.sourceInformation($composer2, "C(MoreScreen)N(onNavigate)12@442L1176,12@412L1206:MoreScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onNavigate) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(730312179, $dirty, -1, "com.example.ui.screens.MoreScreen (MoreScreen.kt:11)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1750338923, "CC(remember):MoreScreen.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MoreScreenKt.MoreScreen$lambda$19$lambda$18(Function1.this, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIKt.m7686OneUIScreengMrHQkA("المزيد", null, null, null, null, null, null, 0.0f, (Function1) rememberedValue, $composer2, 6, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MoreScreenKt.MoreScreen$lambda$20(Function1.this, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18(final Function1 $onNavigate, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, "g1", null, ComposableLambdaKt.composableLambdaInstance(-2096634159, true, new Function3() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$9(Function1.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "g2", null, ComposableLambdaKt.composableLambdaInstance(1614544826, true, new Function3() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$17(Function1.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$9(final Function1 $onNavigate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C14@493L608,14@483L618:MoreScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2096634159, $changed, -1, "com.example.ui.screens.MoreScreen.<anonymous>.<anonymous>.<anonymous> (MoreScreen.kt:14)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(-64543610, true, new Function3() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8(Function1.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8(final Function1 $onNavigate, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C15@573L27,15@511L89,16@617L27,17@734L27,17@661L100,18@778L27,19@896L28,19@822L102,20@941L27,21@1065L22,21@985L102:MoreScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-64543610, $changed, -1, "com.example.ui.screens.MoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MoreScreen.kt:15)");
            }
            ImageVector star = StarKt.getStar(Icons.Outlined.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, -1896864479, "CC(remember):MoreScreen.kt#9igjgp");
            boolean changed = $composer.changed($onNavigate);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$1$lambda$0(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MoreRow("المفضلة", "الأذكار التي تحبها", star, (Function0) rememberedValue, $composer, 54);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            ImageVector notifications = NotificationsKt.getNotifications(Icons.Outlined.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, -1896859327, "CC(remember):MoreScreen.kt#9igjgp");
            boolean changed2 = $composer.changed($onNavigate);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$3$lambda$2(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MoreRow("التنبيهات", "جميع أوقات التذكير", notifications, (Function0) rememberedValue2, $composer, 54);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            ImageVector barChart = BarChartKt.getBarChart(Icons.Outlined.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, -1896854142, "CC(remember):MoreScreen.kt#9igjgp");
            boolean changed3 = $composer.changed($onNavigate);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$5$lambda$4(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
                rememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MoreRow("الإحصائيات", "السجل والأيام المتتالية", barChart, (Function0) rememberedValue3, $composer, 54);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            ImageVector label = LabelKt.getLabel(Icons.AutoMirrored.Filled.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, -1896848740, "CC(remember):MoreScreen.kt#9igjgp");
            boolean changed4 = $composer.changed($onNavigate);
            Object rememberedValue4 = $composer.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$7$lambda$6(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj4);
                rememberedValue4 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MoreRow("التصنيفات", "تنظيم الأذكار بالألوان", label, (Function0) rememberedValue4, $composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$1$lambda$0(Function1 $onNavigate) {
        $onNavigate.invoke("favorites");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$3$lambda$2(Function1 $onNavigate) {
        $onNavigate.invoke("reminders");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$5$lambda$4(Function1 $onNavigate) {
        $onNavigate.invoke("statistics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$7$lambda$6(Function1 $onNavigate) {
        $onNavigate.invoke("tags");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$17(final Function1 $onNavigate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C25@1161L441,25@1151L451:MoreScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614544826, $changed, -1, "com.example.ui.screens.MoreScreen.<anonymous>.<anonymous>.<anonymous> (MoreScreen.kt:25)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(243442735, true, new Function3() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16(Function1.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16(final Function1 $onNavigate, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C26@1250L31,26@1179L102,27@1298L27,28@1414L26,28@1342L98,29@1457L27,30@1565L23,30@1501L87:MoreScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(243442735, $changed, -1, "com.example.ui.screens.MoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MoreScreen.kt:26)");
            }
            ImageVector alarm = AlarmKt.getAlarm(Icons.Outlined.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, 2020237230, "CC(remember):MoreScreen.kt#9igjgp");
            boolean changed = $composer.changed($onNavigate);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$11$lambda$10(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MoreRow("منبه صلاة الفجر", "حسب موقعك الجغرافي", alarm, (Function0) rememberedValue, $composer, 54);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            ImageVector settings = SettingsKt.getSettings(Icons.Outlined.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, 2020242473, "CC(remember):MoreScreen.kt#9igjgp");
            boolean changed2 = $composer.changed($onNavigate);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$13$lambda$12(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MoreRow("الإعدادات", "الاهتزاز والخط والنغمة", settings, (Function0) rememberedValue2, $composer, 54);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            ImageVector info = InfoKt.getInfo(Icons.Outlined.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, 2020247302, "CC(remember):MoreScreen.kt#9igjgp");
            boolean changed3 = $composer.changed($onNavigate);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoreScreenKt.MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
                rememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MoreRow("حول التطبيق", "الإصدار والمطوّر", info, (Function0) rememberedValue3, $composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$11$lambda$10(Function1 $onNavigate) {
        $onNavigate.invoke("fajr_settings");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$13$lambda$12(Function1 $onNavigate) {
        $onNavigate.invoke("settings");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14(Function1 $onNavigate) {
        $onNavigate.invoke("about");
        return Unit.INSTANCE;
    }

    private static final void MoreRow(final String title, final String summary, final ImageVector icon, final Function0<Unit> function0, Composer $composer, final int $changed) {
        String str;
        String str2;
        Function0<Unit> function02;
        Composer $composer2 = $composer.startRestartGroup(-568571142);
        ComposerKt.sourceInformation($composer2, "C(MoreRow)N(title,summary,icon,onClick)40@1849L24,38@1768L149:MoreScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = title;
            $dirty |= $composer2.changed(str) ? 4 : 2;
        } else {
            str = title;
        }
        if (($changed & 48) == 0) {
            str2 = summary;
            $dirty |= $composer2.changed(str2) ? 32 : 16;
        } else {
            str2 = summary;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(icon) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if (!$composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-568571142, $dirty, -1, "com.example.ui.screens.MoreRow (MoreScreen.kt:37)");
            }
            OneUIKt.m7685OneUIRowRFMEUTM(str, null, str2, ComposableLambdaKt.rememberComposableLambda(-1204007254, true, new Function2() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MoreScreenKt.MoreRow$lambda$21(ImageVector.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableSingletons$MoreScreenKt.INSTANCE.getLambda$1944419529$app(), function02, 0L, $composer2, ($dirty & 14) | 27648 | (($dirty << 3) & 896) | (458752 & ($dirty << 6)), 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.MoreScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MoreScreenKt.MoreRow$lambda$22(title, summary, icon, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MoreRow$lambda$21(ImageVector $icon, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C40@1851L20:MoreScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1204007254, $changed, -1, "com.example.ui.screens.MoreRow.<anonymous> (MoreScreen.kt:40)");
            }
            OneUIKt.m7683OneUIIconBadgeaMcp0Q($icon, 0L, 0.0f, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
