package com.example.ui.oneui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.outlined.SearchKt;
import androidx.compose.material.icons.outlined.SettingsKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import dev.chrisbanes.haze.HazeKt;
import dev.chrisbanes.haze.HazeState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OneUI.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u001a \u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!\u001a]\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u0012H\u0007¢\u0006\u0004\b,\u0010-\u001a+\u0010.\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020&2\b\b\u0002\u00100\u001a\u00020\u0012H\u0007¢\u0006\u0004\b1\u00102\u001aw\u00103\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\r2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\r2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u00107\u001a\u00020&H\u0007¢\u0006\u0004\b8\u00109\u001aM\u0010:\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020 2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010<\u001a\u00020 H\u0007¢\u0006\u0002\u0010=\u001a;\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00032\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010B\u001aC\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020 2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010F\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\bG\u0010H\u001a5\u0010I\u001a\u00020\u00012\u0006\u0010J\u001a\u00020 2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010L\u001a'\u0010M\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010N\u001a\u001f\u0010O\u001a\u00020&2\u0006\u0010P\u001a\u00020\u00032\b\b\u0002\u0010Q\u001a\u00020&¢\u0006\u0004\bR\u0010S\u001a\u000e\u0010T\u001a\u00020\u00032\u0006\u0010U\u001a\u00020V\u001a\u000e\u0010W\u001a\u00020\u00032\u0006\u0010U\u001a\u00020V\u001aA\u0010X\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020 2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010[\u001a9\u0010\\\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010<\u001a\u00020 H\u0007¢\u0006\u0002\u0010]\u001a5\u0010^\u001a\u00020\u00012\u0006\u0010_\u001a\u00020`2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010a\u001a\u00020&H\u0007¢\u0006\u0004\bb\u0010c\u001aC\u0010d\u001a\u00020\u00012\f\u0010e\u001a\b\u0012\u0004\u0012\u00020g0f2\b\u0010h\u001a\u0004\u0018\u00010\u00032\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010j\u001aQ\u0010k\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00032\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010l\u001a\u00020 2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010n\u001af\u0010o\u001a\u00020\u00012\u0006\u0010p\u001a\u00020 2\b\u0010q\u001a\u0004\u0018\u00010\u00032\f\u0010r\u001a\b\u0012\u0004\u0012\u00020s0f2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0015\b\u0002\u0010t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010u¨\u0006v²\u0006\n\u0010w\u001a\u00020`X\u008a\u0084\u0002²\u0006\n\u0010x\u001a\u00020`X\u008a\u0084\u0002²\u0006\n\u0010y\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u0010z\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u0010{\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u00020&X\u008a\u0084\u0002"}, d2 = {"OneUIScreen", "", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "subtitle", "onBack", "Lkotlin/Function0;", "onMenu", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "bottomPadding", "Landroidx/compose/ui/unit/Dp;", "content", "Landroidx/compose/foundation/lazy/LazyListScope;", "OneUIScreen-gMrHQkA", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/lazy/LazyListState;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "OneUIIconAction", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "contentDescription", "onClick", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SectionLabel", "text", "accent", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "OneUICard", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "color", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/foundation/layout/ColumnScope;", "OneUICard-uDo3WH8", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OneUIDivider", "inset", "OneUIDivider-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)V", "OneUIIconBadge", "tint", "size", "OneUIIconBadge-aM-cp0Q", "(Landroidx/compose/ui/graphics/vector/ImageVector;JFLandroidx/compose/runtime/Composer;II)V", "OneUIRow", "summary", "leading", "trailing", "titleColor", "OneUIRow-RFMEUTM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V", "OneUIButton", "filled", "destructive", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/vector/ImageVector;ZLandroidx/compose/runtime/Composer;II)V", "OneUISearchField", "value", "onValueChange", "placeholder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OneUIChip", "label", "selected", "dot", "OneUIChip-M8YrEPQ", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "OneUISwitch", "checked", "onCheckedChange", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OneUIEmptyState", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "parseColorSafe", "hex", "fallback", "parseColorSafe-4WTKRHQ", "(Ljava/lang/String;J)J", "azkarCount", "n", "", "readsCount", "OneUIMenu", "expanded", "onDismiss", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "OneUIMenuItem", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/vector/ImageVector;ZLandroidx/compose/runtime/Composer;II)V", "OneUIProgressBar", NotificationCompat.CATEGORY_PROGRESS, "", "trackColor", "OneUIProgressBar-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "OneUIBottomBar", "tabs", "", "Lcom/example/ui/oneui/BottomTab;", "selectedRoute", "onSelect", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OneUITextField", "singleLine", "leadingIcon", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;II)V", "OneUIDrawer", "open", "currentRoute", "items", "Lcom/example/ui/oneui/OneUIDrawerItem;", "footer", "(ZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app", "fraction", "barAlpha", "bg", "track", "thumb"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneUIKt {
    public static void DrawerHeader(Composer composer) {
        TextKt.m2816Text4IGK_g("وَذكّر", PaddingKt.m732paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 48.0f, 0.0f, 2, null), ColorKt.Color(4293783021L), TextUnitKt.getSp(30), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131024);
        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, 32.0f), composer, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIBottomBar$lambda$62(List list, String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OneUIBottomBar(list, str, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIButton$lambda$30(String str, Function0 function0, Modifier modifier, boolean z, ImageVector imageVector, boolean z2, int i, int i2, Composer composer, int i3) {
        OneUIButton(str, function0, modifier, z, imageVector, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUICard_uDo3WH8$lambda$22(Modifier modifier, Function0 function0, PaddingValues paddingValues, long j, Function3 function3, int i, int i2, Composer composer, int i3) {
        m7680OneUICarduDo3WH8(modifier, function0, paddingValues, j, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIChip_M8YrEPQ$lambda$38(String str, boolean z, Function0 function0, Modifier modifier, Color color, int i, int i2, Composer composer, int i3) {
        m7681OneUIChipM8YrEPQ(str, z, function0, modifier, color, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIDivider_kHDZbjc$lambda$23(float f, int i, int i2, Composer composer, int i3) {
        m7682OneUIDividerkHDZbjc(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIDrawer$lambda$81(boolean z, String str, List list, Function1 function1, Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        OneUIDrawer(z, str, list, function1, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIEmptyState$lambda$47(String str, ImageVector imageVector, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OneUIEmptyState(str, imageVector, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIIconAction$lambda$19(ImageVector imageVector, String str, Function0 function0, int i, Composer composer, int i2) {
        OneUIIconAction(imageVector, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIIconBadge_aM_cp0Q$lambda$25(ImageVector imageVector, long j, float f, int i, int i2, Composer composer, int i3) {
        m7683OneUIIconBadgeaMcp0Q(imageVector, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIMenu$lambda$48(boolean z, Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        OneUIMenu(z, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIMenuItem$lambda$51(String str, Function0 function0, ImageVector imageVector, boolean z, int i, int i2, Composer composer, int i3) {
        OneUIMenuItem(str, function0, imageVector, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIProgressBar_eaDK9VM$lambda$53(float f, Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        m7684OneUIProgressBareaDK9VM(f, modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIRow_RFMEUTM$lambda$28(String str, Modifier modifier, String str2, Function2 function2, Function2 function22, Function0 function0, long j, int i, int i2, Composer composer, int i3) {
        m7685OneUIRowRFMEUTM(str, modifier, str2, function2, function22, function0, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIScreen_gMrHQkA$lambda$17(String str, Modifier modifier, String str2, Function0 function0, Function0 function02, Function3 function3, LazyListState lazyListState, float f, Function1 function1, int i, int i2, Composer composer, int i3) {
        m7686OneUIScreengMrHQkA(str, modifier, str2, function0, function02, function3, lazyListState, f, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUISearchField$lambda$35(String str, Function1 function1, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OneUISearchField(str, function1, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUISwitch$lambda$45(boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OneUISwitch(z, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUITextField$lambda$66(String str, Function1 function1, String str2, Modifier modifier, boolean z, ImageVector imageVector, int i, int i2, Composer composer, int i3) {
        OneUITextField(str, function1, str2, modifier, z, imageVector, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SectionLabel$lambda$20(String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SectionLabel(str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04e0  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 17 */
    /* renamed from: OneUIScreen-gMrHQkA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7686OneUIScreengMrHQkA(final String title, Modifier modifier, String subtitle, Function0<Unit> function0, Function0<Unit> function02, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, LazyListState listState, float bottomPadding, final Function1<? super LazyListScope, Unit> content, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        String subtitle2;
        Function0 onMenu;
        Function3 function32;
        LazyListState listState2;
        int i2;
        Composer $composer2;
        final float bottomPadding2;
        final Function3 actions;
        final LazyListState listState3;
        final Modifier modifier3;
        final String subtitle3;
        final Function0 onMenu2;
        final Function0 onBack;
        Function3 actions2;
        Function0 onBack2;
        Modifier modifier4;
        float bottomPadding3;
        final LazyListState listState4;
        final String subtitle4;
        Function0 onMenu3;
        int $dirty;
        Function0 onMenu4;
        float expandedPx;
        Function0 onBack3;
        Modifier modifier5;
        MutableState scrollingUp;
        boolean changed;
        Object rememberedValue;
        Function3 actions3;
        int $dirty2;
        Composer composer;
        final Function0 onBack4;
        Modifier modifier6;
        int i3;
        Composer composer2;
        float statusTop;
        Function0 onMenu5;
        String subtitle5;
        Composer composer3;
        Function0 function03;
        Composer m3828constructorimpl;
        Alignment.Vertical vertical;
        Arrangement.Horizontal horizontal;
        Function0 onBack5;
        Function0 function04;
        Composer m3828constructorimpl2;
        Arrangement.Horizontal horizontal2;
        MeasurePolicy measurePolicy;
        Composer composer4;
        ColorScheme colorScheme;
        Composer composer5;
        Function0 onBack6;
        boolean z;
        Function3 actions4;
        Composer m3828constructorimpl3;
        Composer composer6;
        int i4;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer3 = $composer.startRestartGroup(1451694130);
        ComposerKt.sourceInformation($composer3, "C(OneUIScreen)N(title,modifier,subtitle,onBack,onMenu,actions,listState,bottomPadding:c#ui.unit.Dp,content)74@3131L7,75@3172L10,75@3183L17,77@3324L195,84@3635L33,85@3699L394,85@3673L420,94@4114L152,99@4294L11,100@4352L7,101@4364L4073:OneUI.kt#78813j");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(title) ? 4 : 2;
        }
        int i5 = i & 2;
        if (i5 != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i6 = i & 4;
        if (i6 != 0) {
            $dirty3 |= 384;
            subtitle2 = subtitle;
        } else if (($changed & 384) == 0) {
            subtitle2 = subtitle;
            $dirty3 |= $composer3.changed(subtitle2) ? 256 : 128;
        } else {
            subtitle2 = subtitle;
        }
        int i7 = i & 8;
        if (i7 != 0) {
            $dirty3 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty3 |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        int i8 = i & 16;
        if (i8 != 0) {
            $dirty3 |= 24576;
            onMenu = function02;
        } else if (($changed & 24576) == 0) {
            onMenu = function02;
            $dirty3 |= $composer3.changedInstance(onMenu) ? 16384 : 8192;
        } else {
            onMenu = function02;
        }
        int i9 = i & 32;
        if (i9 != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function32 = function3;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            function32 = function3;
            $dirty3 |= $composer3.changedInstance(function32) ? 131072 : 65536;
        } else {
            function32 = function3;
        }
        if (($changed & 1572864) == 0) {
            if ((i & 64) == 0) {
                listState2 = listState;
                if ($composer3.changed(listState2)) {
                    i4 = 1048576;
                    $dirty3 |= i4;
                }
            } else {
                listState2 = listState;
            }
            i4 = 524288;
            $dirty3 |= i4;
        } else {
            listState2 = listState;
        }
        int $dirty4 = $dirty3;
        int $dirty5 = i & 128;
        if ($dirty5 != 0) {
            $dirty4 |= 12582912;
            i2 = $dirty5;
        } else if (($changed & 12582912) == 0) {
            i2 = $dirty5;
            $dirty4 |= $composer3.changed(bottomPadding) ? 8388608 : 4194304;
        } else {
            i2 = $dirty5;
        }
        if (($changed & 100663296) == 0) {
            $dirty4 |= $composer3.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ($composer3.shouldExecute(($dirty4 & 38347923) != 38347922, $dirty4 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "70@3001L23");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    subtitle2 = null;
                }
                Function0 onBack7 = i7 != 0 ? null : function0;
                if (i8 != 0) {
                    onMenu = null;
                }
                actions2 = i9 != 0 ? null : function32;
                if ((i & 64) != 0) {
                    $dirty4 &= -3670017;
                    listState2 = LazyListStateKt.rememberLazyListState(0, 0, $composer3, 0, 3);
                }
                if (i2 != 0) {
                    Modifier modifier7 = modifier2;
                    onBack2 = onBack7;
                    modifier4 = modifier7;
                    bottomPadding3 = Dp.m7226constructorimpl(120);
                    listState4 = listState2;
                    subtitle4 = subtitle2;
                    onMenu3 = onMenu;
                    $dirty = $dirty4;
                } else {
                    Modifier modifier8 = modifier2;
                    onBack2 = onBack7;
                    modifier4 = modifier8;
                    bottomPadding3 = bottomPadding;
                    listState4 = listState2;
                    subtitle4 = subtitle2;
                    onMenu3 = onMenu;
                    $dirty = $dirty4;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 64) != 0) {
                    $dirty4 &= -3670017;
                }
                bottomPadding3 = bottomPadding;
                actions2 = function32;
                listState4 = listState2;
                modifier4 = modifier2;
                subtitle4 = subtitle2;
                onMenu3 = onMenu;
                $dirty = $dirty4;
                onBack2 = function0;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1451694130, $dirty, -1, "com.example.ui.oneui.OneUIScreen (OneUI.kt:73)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density density = (Density) consume;
            final float statusTop2 = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, $composer3, 6), $composer3, 0).getTop();
            final float expandedPx2 = density.mo370toPx0680j_4(OneUIDimens.INSTANCE.m7677getHeaderCollapseDistanceD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart($composer3, -786293163, "CC(remember):OneUI.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            Function3 actions5 = actions2;
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object derivedStateOf = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(OneUIKt.OneUIScreen_gMrHQkA$lambda$2$lambda$1(LazyListState.this, expandedPx2));
                    }
                });
                onMenu4 = onMenu3;
                $composer3.updateRememberedValue(derivedStateOf);
                rememberedValue2 = derivedStateOf;
            } else {
                onMenu4 = onMenu3;
            }
            final State fraction$delegate = (State) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -786283373, "CC(remember):OneUI.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                expandedPx = expandedPx2;
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(rememberedValue3);
            } else {
                expandedPx = expandedPx2;
            }
            MutableState scrollingUp2 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -786280964, "CC(remember):OneUI.kt#9igjgp");
            boolean z2 = (((3670016 & $dirty) ^ 1572864) > 1048576 && $composer3.changed(listState4)) || ($dirty & 1572864) == 1048576;
            Object rememberedValue4 = $composer3.rememberedValue();
            if (z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                onBack3 = onBack2;
                Object obj = (Function2) new OneUIKt$OneUIScreen$1$1(listState4, scrollingUp2, null);
                $composer3.updateRememberedValue(obj);
                rememberedValue4 = obj;
            } else {
                onBack3 = onBack2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(listState4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, $composer3, ($dirty >> 18) & 14);
            int $dirty6 = $dirty;
            State barAlpha$delegate = AnimateAsStateKt.animateFloatAsState(OneUIScreen_gMrHQkA$lambda$3(fraction$delegate), AnimationSpecKt.tween$default(180, 0, null, 6, null), 0.0f, "barAlpha", null, $composer3, 3120, 20);
            long bg = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getBackground();
            ProvidableCompositionLocal<HazeState> localHazeState = GlassKt.getLocalHazeState();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = $composer3.consume(localHazeState);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            HazeState hazeState = (HazeState) consume2;
            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), bg, null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, m231backgroundbw27NRU$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer m3828constructorimpl4 = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl4.getInserting()) {
                modifier5 = modifier4;
                scrollingUp = scrollingUp2;
            } else {
                modifier5 = modifier4;
                scrollingUp = scrollingUp2;
                if (Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = (i10 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i12 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 36088221, "C113@4885L1493,102@4417L1961:OneUI.kt#78813j");
                    LazyListState listState5 = listState4;
                    Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(hazeState == null ? HazeKt.hazeSource$default(Modifier.INSTANCE, hazeState, 0.0f, null, 6, null) : Modifier.INSTANCE);
                    float bottomPadding4 = bottomPadding3;
                    PaddingValues m727PaddingValuesa9UjIt4$default = PaddingKt.m727PaddingValuesa9UjIt4$default(OneUIDimens.INSTANCE.m7678getScreenPaddingD9Ej5fM(), 0.0f, OneUIDimens.INSTANCE.m7678getScreenPaddingD9Ej5fM(), bottomPadding4, 2, null);
                    Arrangement.HorizontalOrVertical m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                    ComposerKt.sourceInformationMarkerStart($composer3, 2079386573, "CC(remember):OneUI.kt#9igjgp");
                    changed = $composer3.changed(statusTop2) | ((57344 & $dirty6) != 16384) | (($dirty6 & 7168) != 2048) | (($dirty6 & 14) != 4) | (($dirty6 & 896) != 256) | ((234881024 & $dirty6) != 67108864);
                    rememberedValue = $composer3.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        actions3 = actions5;
                        $dirty2 = $dirty6;
                        composer = $composer3;
                        final Function0 onMenu6 = onMenu4;
                        onBack4 = onBack3;
                        modifier6 = modifier5;
                        i3 = 1;
                        composer2 = $composer3;
                        statusTop = statusTop2;
                        onMenu5 = onMenu6;
                        subtitle5 = subtitle4;
                        rememberedValue = new Function1() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OneUIKt.OneUIScreen_gMrHQkA$lambda$16$lambda$11$lambda$10(Function1.this, statusTop2, fraction$delegate, onMenu6, onBack4, title, subtitle4, (LazyListScope) obj2);
                            }
                        };
                        $composer3.updateRememberedValue(rememberedValue);
                    } else {
                        actions3 = actions5;
                        $dirty2 = $dirty6;
                        subtitle5 = subtitle4;
                        statusTop = statusTop2;
                        composer = $composer3;
                        onMenu5 = onMenu4;
                        onBack4 = onBack3;
                        modifier6 = modifier5;
                        i3 = 1;
                        composer2 = $composer3;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LazyDslKt.LazyColumn(then, listState5, m727PaddingValuesa9UjIt4$default, false, m610spacedBy0680j_4, null, null, false, (Function1) rememberedValue, composer2, (($dirty2 >> 15) & 112) | 24576, 232);
                    composer3 = composer2;
                    int i13 = (OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate) > 0.01f ? 1 : (OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate) == 0.01f ? 0 : -1));
                    composer3.startReplaceGroup(38148604);
                    ComposerKt.sourceInformation(composer3, "150@6598L11,151@6622L1799");
                    final ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable);
                    Modifier m734paddingqDBjuR0$default = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(statusTop + Dp.m7226constructorimpl(10)), Dp.m7226constructorimpl(16), 0.0f, 8, null);
                    OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate);
                    Modifier alpha = AlphaKt.alpha(m734paddingqDBjuR0$default, 1.0f);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Dp.m7226constructorimpl(10);
                    Arrangement.Horizontal spaceBetween = arrangement.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, alpha);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i14 = ((((432 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        function03 = constructor2;
                        composer3.useNode();
                    } else {
                        function03 = constructor2;
                        composer3.createNode(function03);
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl(composer3);
                    Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        vertical = centerVertically;
                        horizontal = spaceBetween;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i15 = (i14 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i16 = ((432 >> 6) & 112) | 6;
                            RowScope rowScope = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, -201580431, "C162@7067L67,159@6972L1016:OneUI.kt#78813j");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            RowScope.CC.weight$default(rowScope, companion, 1.0f, false, 2, null);
                            Modifier m782width3ABfNKs = SizeKt.m782width3ABfNKs(companion, 52.0f);
                            RoundedCornerShapeKt.getCircleShape();
                            colorScheme2.getSurface();
                            onBack5 = onBack4;
                            Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(SizeKt.m763height3ABfNKs(HeaderTools.scrollTile(m782width3ABfNKs, OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate)), Dp.m7226constructorimpl(52)), Dp.m7226constructorimpl(6), 0.0f, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, centerVertically2, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m732paddingVpY3zN4$default);
                            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            int i17 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                function04 = constructor3;
                                composer3.createNode(function04);
                            } else {
                                function04 = constructor3;
                                composer3.useNode();
                            }
                            m3828constructorimpl2 = Updater.m3828constructorimpl(composer3);
                            Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3828constructorimpl2.getInserting()) {
                                horizontal2 = start;
                                measurePolicy = rowMeasurePolicy2;
                            } else {
                                horizontal2 = start;
                                measurePolicy = rowMeasurePolicy2;
                                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i18 = (i17 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    int i19 = ((384 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1097976500, "C176@7742L10,174@7659L311:OneUI.kt#78813j");
                                    if (onBack5 == null) {
                                        onBack5 = onMenu5;
                                    }
                                    if (onBack5 == null) {
                                        composer3.startReplaceGroup(-1097970146);
                                        ComposerKt.sourceInformation(composer3, "168@7409L124,168@7380L153");
                                        composer4 = composer3;
                                        colorScheme = colorScheme2;
                                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-364625133, true, new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda27
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj2, Object obj3) {
                                                return OneUIKt.OneUIScreen_gMrHQkA$lambda$16$lambda$15$lambda$13$lambda$12(ColorScheme.this, (Composer) obj2, ((Integer) obj3).intValue());
                                            }
                                        }, composer3, 54);
                                        if (onMenu5 != null) {
                                            rememberComposableLambda = ComposableSingletons$OneUIKt.INSTANCE.getLambda$512895802$app();
                                        }
                                        IconButtonKt.IconButton(onBack5, null, false, null, null, rememberComposableLambda, composer3, (($dirty2 >> 9) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        onBack6 = onBack5;
                                        composer5 = composer3;
                                        composer5.endReplaceGroup();
                                        z = 6;
                                    } else {
                                        composer4 = composer3;
                                        colorScheme = colorScheme2;
                                        composer5 = composer3;
                                        onBack6 = onBack5;
                                        composer5.startReplaceGroup(-1097768646);
                                        ComposerKt.sourceInformation(composer5, "172@7587L29");
                                        z = 6;
                                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), composer5, 6);
                                        composer5.endReplaceGroup();
                                    }
                                    MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getTitleMedium();
                                    colorScheme.getOnSurface();
                                    TextUnitKt.getSp(18);
                                    TextOverflow.INSTANCE.m7132getEllipsisgIe3tQ8();
                                    Composer composer7 = composer5;
                                    int i20 = ($dirty2 & 14) | 3072;
                                    $composer2 = $composer3;
                                    Composer composer8 = composer;
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    actions4 = actions3;
                                    composer3.startReplaceGroup(-200567538);
                                    ComposerKt.sourceInformation(composer3, "186@8115L67,184@8048L341");
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    RoundedCornerShapeKt.getCircleShape();
                                    colorScheme.getSurface();
                                    Modifier m732paddingVpY3zN4$default2 = PaddingKt.m732paddingVpY3zN4$default(SizeKt.m763height3ABfNKs(HeaderTools.scrollTile(companion2, OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate)), Dp.m7226constructorimpl(52)), Dp.m7226constructorimpl(6), 0.0f, 2, null);
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, m732paddingVpY3zN4$default2);
                                    Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i21 = ((((384 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.useNode();
                                    } else {
                                        composer3.createNode(constructor4);
                                    }
                                    m3828constructorimpl3 = Updater.m3828constructorimpl(composer3);
                                    Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3828constructorimpl3.getInserting()) {
                                        composer6 = composer3;
                                        if (Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i22 = (i21 >> 6) & 14;
                                            Composer composer9 = composer6;
                                            ComposerKt.sourceInformationMarkerStart(composer9, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer9, -1997082908, "C190@8378L9:OneUI.kt#78813j");
                                            Integer valueOf = Integer.valueOf(((((384 >> 6) & 112) | 6) & 14) | (($dirty2 >> 12) & 112));
                                            HeaderTools.settingsButton(composer9);
                                            if (actions4 != null) {
                                                actions4.invoke(rowScopeInstance2, composer9, valueOf);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer9);
                                            ComposerKt.sourceInformationMarkerEnd(composer9);
                                            composer6.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            composer3.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer8);
                                            $composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            actions = actions4;
                                            onBack = onBack6;
                                            listState3 = listState5;
                                            bottomPadding2 = bottomPadding4;
                                            modifier3 = modifier6;
                                            subtitle3 = subtitle5;
                                            onMenu2 = onMenu5;
                                        }
                                    } else {
                                        composer6 = composer3;
                                    }
                                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i222 = (i21 >> 6) & 14;
                                    Composer composer92 = composer6;
                                    ComposerKt.sourceInformationMarkerStart(composer92, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer92, -1997082908, "C190@8378L9:OneUI.kt#78813j");
                                    Integer valueOf2 = Integer.valueOf(((((384 >> 6) & 112) | 6) & 14) | (($dirty2 >> 12) & 112));
                                    HeaderTools.settingsButton(composer92);
                                    if (actions4 != null) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer92);
                                    ComposerKt.sourceInformationMarkerEnd(composer92);
                                    composer6.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    composer3.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer8);
                                    $composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    actions = actions4;
                                    onBack = onBack6;
                                    listState3 = listState5;
                                    bottomPadding2 = bottomPadding4;
                                    modifier3 = modifier6;
                                    subtitle3 = subtitle5;
                                    onMenu2 = onMenu5;
                                }
                            }
                            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i182 = (i17 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            int i192 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer3, -1097976500, "C176@7742L10,174@7659L311:OneUI.kt#78813j");
                            if (onBack5 == null) {
                            }
                            if (onBack5 == null) {
                            }
                            MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getTitleMedium();
                            colorScheme.getOnSurface();
                            TextUnitKt.getSp(18);
                            TextOverflow.INSTANCE.m7132getEllipsisgIe3tQ8();
                            Composer composer72 = composer5;
                            int i202 = ($dirty2 & 14) | 3072;
                            $composer2 = $composer3;
                            Composer composer82 = composer;
                            ComposerKt.sourceInformationMarkerEnd(composer72);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            actions4 = actions3;
                            composer3.startReplaceGroup(-200567538);
                            ComposerKt.sourceInformation(composer3, "186@8115L67,184@8048L341");
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            RoundedCornerShapeKt.getCircleShape();
                            colorScheme.getSurface();
                            Modifier m732paddingVpY3zN4$default22 = PaddingKt.m732paddingVpY3zN4$default(SizeKt.m763height3ABfNKs(HeaderTools.scrollTile(companion22, OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate)), Dp.m7226constructorimpl(52)), Dp.m7226constructorimpl(6), 0.0f, 2, null);
                            Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer3, m732paddingVpY3zN4$default22);
                            Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                            int i212 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                            }
                            m3828constructorimpl3 = Updater.m3828constructorimpl(composer3);
                            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3828constructorimpl3.getInserting()) {
                            }
                            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42));
                            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42), setCompositeKeyHash42);
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                            int i2222 = (i212 >> 6) & 14;
                            Composer composer922 = composer6;
                            ComposerKt.sourceInformationMarkerStart(composer922, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer922, -1997082908, "C190@8378L9:OneUI.kt#78813j");
                            Integer valueOf22 = Integer.valueOf(((((384 >> 6) & 112) | 6) & 14) | (($dirty2 >> 12) & 112));
                            HeaderTools.settingsButton(composer922);
                            if (actions4 != null) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer922);
                            ComposerKt.sourceInformationMarkerEnd(composer922);
                            composer6.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer82);
                            $composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            actions = actions4;
                            onBack = onBack6;
                            listState3 = listState5;
                            bottomPadding2 = bottomPadding4;
                            modifier3 = modifier6;
                            subtitle3 = subtitle5;
                            onMenu2 = onMenu5;
                        }
                    } else {
                        vertical = centerVertically;
                        horizontal = spaceBetween;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i152 = (i14 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i162 = ((432 >> 6) & 112) | 6;
                    RowScope rowScope2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -201580431, "C162@7067L67,159@6972L1016:OneUI.kt#78813j");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    RowScope.CC.weight$default(rowScope2, companion3, 1.0f, false, 2, null);
                    Modifier m782width3ABfNKs2 = SizeKt.m782width3ABfNKs(companion3, 52.0f);
                    RoundedCornerShapeKt.getCircleShape();
                    colorScheme2.getSurface();
                    onBack5 = onBack4;
                    Modifier m732paddingVpY3zN4$default3 = PaddingKt.m732paddingVpY3zN4$default(SizeKt.m763height3ABfNKs(HeaderTools.scrollTile(m782width3ABfNKs2, OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate)), Dp.m7226constructorimpl(52)), Dp.m7226constructorimpl(6), 0.0f, 2, null);
                    Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                    MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(start2, centerVertically22, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, m732paddingVpY3zN4$default3);
                    Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    int i172 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                    }
                    m3828constructorimpl2 = Updater.m3828constructorimpl(composer3);
                    Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl2.getInserting()) {
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    int i1822 = (i172 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                    int i1922 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1097976500, "C176@7742L10,174@7659L311:OneUI.kt#78813j");
                    if (onBack5 == null) {
                    }
                    if (onBack5 == null) {
                    }
                    MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getTitleMedium();
                    colorScheme.getOnSurface();
                    TextUnitKt.getSp(18);
                    TextOverflow.INSTANCE.m7132getEllipsisgIe3tQ8();
                    Composer composer722 = composer5;
                    int i2022 = ($dirty2 & 14) | 3072;
                    $composer2 = $composer3;
                    Composer composer822 = composer;
                    ComposerKt.sourceInformationMarkerEnd(composer722);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    actions4 = actions3;
                    composer3.startReplaceGroup(-200567538);
                    ComposerKt.sourceInformation(composer3, "186@8115L67,184@8048L341");
                    Modifier.Companion companion222 = Modifier.INSTANCE;
                    RoundedCornerShapeKt.getCircleShape();
                    colorScheme.getSurface();
                    Modifier m732paddingVpY3zN4$default222 = PaddingKt.m732paddingVpY3zN4$default(SizeKt.m763height3ABfNKs(HeaderTools.scrollTile(companion222, OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate)), Dp.m7226constructorimpl(52)), Dp.m7226constructorimpl(6), 0.0f, 2, null);
                    Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(composer3, m732paddingVpY3zN4$default222);
                    Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    int i2122 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl(composer3);
                    Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422), setCompositeKeyHash422);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                    int i22222 = (i2122 >> 6) & 14;
                    Composer composer9222 = composer6;
                    ComposerKt.sourceInformationMarkerStart(composer9222, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer9222, -1997082908, "C190@8378L9:OneUI.kt#78813j");
                    Integer valueOf222 = Integer.valueOf(((((384 >> 6) & 112) | 6) & 14) | (($dirty2 >> 12) & 112));
                    HeaderTools.settingsButton(composer9222);
                    if (actions4 != null) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer9222);
                    ComposerKt.sourceInformationMarkerEnd(composer9222);
                    composer6.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer822);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    actions = actions4;
                    onBack = onBack6;
                    listState3 = listState5;
                    bottomPadding2 = bottomPadding4;
                    modifier3 = modifier6;
                    subtitle3 = subtitle5;
                    onMenu2 = onMenu5;
                }
            }
            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i112 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i122 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 36088221, "C113@4885L1493,102@4417L1961:OneUI.kt#78813j");
            LazyListState listState52 = listState4;
            Modifier then2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(hazeState == null ? HazeKt.hazeSource$default(Modifier.INSTANCE, hazeState, 0.0f, null, 6, null) : Modifier.INSTANCE);
            float bottomPadding42 = bottomPadding3;
            PaddingValues m727PaddingValuesa9UjIt4$default2 = PaddingKt.m727PaddingValuesa9UjIt4$default(OneUIDimens.INSTANCE.m7678getScreenPaddingD9Ej5fM(), 0.0f, OneUIDimens.INSTANCE.m7678getScreenPaddingD9Ej5fM(), bottomPadding42, 2, null);
            Arrangement.HorizontalOrVertical m610spacedBy0680j_42 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer3, 2079386573, "CC(remember):OneUI.kt#9igjgp");
            changed = $composer3.changed(statusTop2) | ((57344 & $dirty6) != 16384) | (($dirty6 & 7168) != 2048) | (($dirty6 & 14) != 4) | (($dirty6 & 896) != 256) | ((234881024 & $dirty6) != 67108864);
            rememberedValue = $composer3.rememberedValue();
            if (changed) {
            }
            actions3 = actions5;
            $dirty2 = $dirty6;
            composer = $composer3;
            final Function0 onMenu62 = onMenu4;
            onBack4 = onBack3;
            modifier6 = modifier5;
            i3 = 1;
            composer2 = $composer3;
            statusTop = statusTop2;
            onMenu5 = onMenu62;
            subtitle5 = subtitle4;
            rememberedValue = new Function1() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OneUIKt.OneUIScreen_gMrHQkA$lambda$16$lambda$11$lambda$10(Function1.this, statusTop2, fraction$delegate, onMenu62, onBack4, title, subtitle4, (LazyListScope) obj2);
                }
            };
            $composer3.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LazyDslKt.LazyColumn(then2, listState52, m727PaddingValuesa9UjIt4$default2, false, m610spacedBy0680j_42, null, null, false, (Function1) rememberedValue, composer2, (($dirty2 >> 15) & 112) | 24576, 232);
            composer3 = composer2;
            int i132 = (OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate) > 0.01f ? 1 : (OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate) == 0.01f ? 0 : -1));
            composer3.startReplaceGroup(38148604);
            ComposerKt.sourceInformation(composer3, "150@6598L11,151@6622L1799");
            final ColorScheme colorScheme22 = MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable);
            Modifier m734paddingqDBjuR0$default2 = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(statusTop + Dp.m7226constructorimpl(10)), Dp.m7226constructorimpl(16), 0.0f, 8, null);
            OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate);
            Modifier alpha2 = AlphaKt.alpha(m734paddingqDBjuR0$default2, 1.0f);
            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Dp.m7226constructorimpl(10);
            Arrangement.Horizontal spaceBetween2 = arrangement2.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically4, composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, alpha2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i142 = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl(composer3);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i1522 = (i142 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i1622 = ((432 >> 6) & 112) | 6;
            RowScope rowScope22 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer3, -201580431, "C162@7067L67,159@6972L1016:OneUI.kt#78813j");
            Modifier.Companion companion32 = Modifier.INSTANCE;
            RowScope.CC.weight$default(rowScope22, companion32, 1.0f, false, 2, null);
            Modifier m782width3ABfNKs22 = SizeKt.m782width3ABfNKs(companion32, 52.0f);
            RoundedCornerShapeKt.getCircleShape();
            colorScheme22.getSurface();
            onBack5 = onBack4;
            Modifier m732paddingVpY3zN4$default32 = PaddingKt.m732paddingVpY3zN4$default(SizeKt.m763height3ABfNKs(HeaderTools.scrollTile(m782width3ABfNKs22, OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate)), Dp.m7226constructorimpl(52)), Dp.m7226constructorimpl(6), 0.0f, 2, null);
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Arrangement.Horizontal start22 = Arrangement.INSTANCE.getStart();
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(start22, centerVertically222, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap322 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(composer3, m732paddingVpY3zN4$default32);
            Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
            int i1722 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl(composer3);
            Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
            int i18222 = (i1722 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
            int i19222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -1097976500, "C176@7742L10,174@7659L311:OneUI.kt#78813j");
            if (onBack5 == null) {
            }
            if (onBack5 == null) {
            }
            MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getTitleMedium();
            colorScheme.getOnSurface();
            TextUnitKt.getSp(18);
            TextOverflow.INSTANCE.m7132getEllipsisgIe3tQ8();
            Composer composer7222 = composer5;
            int i20222 = ($dirty2 & 14) | 3072;
            $composer2 = $composer3;
            Composer composer8222 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer7222);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            actions4 = actions3;
            composer3.startReplaceGroup(-200567538);
            ComposerKt.sourceInformation(composer3, "186@8115L67,184@8048L341");
            Modifier.Companion companion2222 = Modifier.INSTANCE;
            RoundedCornerShapeKt.getCircleShape();
            colorScheme.getSurface();
            Modifier m732paddingVpY3zN4$default2222 = PaddingKt.m732paddingVpY3zN4$default(SizeKt.m763height3ABfNKs(HeaderTools.scrollTile(companion2222, OneUIScreen_gMrHQkA$lambda$6(barAlpha$delegate)), Dp.m7226constructorimpl(52)), Dp.m7226constructorimpl(6), 0.0f, 2, null);
            Alignment.Vertical centerVertically3222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap4222 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(composer3, m732paddingVpY3zN4$default2222);
            Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
            int i21222 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            m3828constructorimpl3 = Updater.m3828constructorimpl(composer3);
            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl3.getInserting()) {
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4222));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4222), setCompositeKeyHash4222);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
            int i222222 = (i21222 >> 6) & 14;
            Composer composer92222 = composer6;
            ComposerKt.sourceInformationMarkerStart(composer92222, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer92222, -1997082908, "C190@8378L9:OneUI.kt#78813j");
            Integer valueOf2222 = Integer.valueOf(((((384 >> 6) & 112) | 6) & 14) | (($dirty2 >> 12) & 112));
            HeaderTools.settingsButton(composer92222);
            if (actions4 != null) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer92222);
            ComposerKt.sourceInformationMarkerEnd(composer92222);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer8222);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            actions = actions4;
            onBack = onBack6;
            listState3 = listState52;
            bottomPadding2 = bottomPadding42;
            modifier3 = modifier6;
            subtitle3 = subtitle5;
            onMenu2 = onMenu5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            bottomPadding2 = bottomPadding;
            actions = function32;
            listState3 = listState2;
            modifier3 = modifier2;
            subtitle3 = subtitle2;
            onMenu2 = onMenu;
            onBack = function0;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OneUIKt.OneUIScreen_gMrHQkA$lambda$17(title, modifier3, subtitle3, onBack, onMenu2, actions, listState3, bottomPadding2, content, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final float OneUIScreen_gMrHQkA$lambda$3(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final float OneUIScreen_gMrHQkA$lambda$2$lambda$1(LazyListState $listState, float $expandedPx) {
        if ($listState.getFirstVisibleItemIndex() > 0) {
            return 1.0f;
        }
        return RangesKt.coerceIn($listState.getFirstVisibleItemScrollOffset() / $expandedPx, 0.0f, 1.0f);
    }

    private static final float OneUIScreen_gMrHQkA$lambda$6(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIScreen_gMrHQkA$lambda$16$lambda$11$lambda$10(Function1 $content, final float $statusTop, final State $fraction$delegate, final Function0 $onMenu, final Function0 $onBack, final String $title, final String $subtitle, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.item$default(LazyColumn, "oneui-header", null, ComposableLambdaKt.composableLambdaInstance(1846200268, true, new Function3() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return OneUIKt.OneUIScreen_gMrHQkA$lambda$16$lambda$11$lambda$10$lambda$9($statusTop, $fraction$delegate, $onMenu, $onBack, $title, $subtitle, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        $content.invoke(LazyColumn);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0257  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OneUIScreen_gMrHQkA$lambda$16$lambda$11$lambda$10$lambda$9(float $statusTop, State $fraction$delegate, Function0 $onMenu, Function0 $onBack, String $title, String $subtitle, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Composer composer2;
        Function0 function02;
        Composer m3828constructorimpl;
        Composer composer3;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C115@4944L1388:OneUI.kt#78813j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1846200268, $changed, -1, "com.example.ui.oneui.OneUIScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OneUI.kt:115)");
            }
            Modifier alpha = AlphaKt.alpha(PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl($statusTop + Dp.m7226constructorimpl(4)), 0.0f, Dp.m7226constructorimpl(16), 5, null), 1.0f - Math.min(OneUIScreen_gMrHQkA$lambda$3($fraction$delegate) * 3.0f, 1.0f));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, alpha);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2 = (i >> 6) & 14;
                    composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i3 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1172684819, "C127@5608L706:OneUI.kt#78813j");
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, 52.0f), composer2, 0);
                    composer2.startReplaceGroup(1167510112);
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        function02 = constructor2;
                        composer2.useNode();
                    } else {
                        function02 = constructor2;
                        composer2.createNode(function02);
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl(composer2);
                    Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        composer3 = composer2;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i5 = (i4 >> 6) & 14;
                            Composer composer4 = composer3;
                            ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            int i6 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -96210720, "C130@5732L10,131@5808L11,128@5641L311:OneUI.kt#78813j");
                            TextKt.m2816Text4IGK_g($title, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnBackground(), TextUnitKt.getSp(36), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(44), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getHeadlineLarge(), composer4, 3072, 6, 64498);
                            if ($subtitle != null) {
                                composer4.startReplaceGroup(-95866683);
                                ComposerKt.sourceInformation(composer4, "138@6131L10,139@6208L11,136@6029L237");
                                TextKt.m2816Text4IGK_g($subtitle, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyMedium(), composer4, 0, 0, 65530);
                            } else {
                                composer4.startReplaceGroup(-101827766);
                            }
                            composer4.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    } else {
                        composer3 = composer2;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i52 = (i4 >> 6) & 14;
                    Composer composer42 = composer3;
                    ComposerKt.sourceInformationMarkerStart(composer42, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    int i62 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer42, -96210720, "C130@5732L10,131@5808L11,128@5641L311:OneUI.kt#78813j");
                    TextKt.m2816Text4IGK_g($title, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer42, MaterialTheme.$stable).getOnBackground(), TextUnitKt.getSp(36), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(44), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer42, MaterialTheme.$stable).getHeadlineLarge(), composer42, 3072, 6, 64498);
                    if ($subtitle != null) {
                    }
                    composer42.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i32 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 1172684819, "C127@5608L706:OneUI.kt#78813j");
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, 52.0f), composer2, 0);
            composer2.startReplaceGroup(1167510112);
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, modifier2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i42 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl(composer2);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i522 = (i42 >> 6) & 14;
            Composer composer422 = composer3;
            ComposerKt.sourceInformationMarkerStart(composer422, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
            int i622 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer422, -96210720, "C130@5732L10,131@5808L11,128@5641L311:OneUI.kt#78813j");
            TextKt.m2816Text4IGK_g($title, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer422, MaterialTheme.$stable).getOnBackground(), TextUnitKt.getSp(36), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(44), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer422, MaterialTheme.$stable).getHeadlineLarge(), composer422, 3072, 6, 64498);
            if ($subtitle != null) {
            }
            composer422.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer422);
            ComposerKt.sourceInformationMarkerEnd(composer422);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIScreen_gMrHQkA$lambda$16$lambda$15$lambda$13$lambda$12(ColorScheme $cs, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C169@7439L68:OneUI.kt#78813j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-364625133, $changed, -1, "com.example.ui.oneui.OneUIScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OneUI.kt:169)");
            }
            IconKt.m2273Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), (String) null, (Modifier) null, $cs.getOnSurface(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsGlyph(ColorScheme $cs, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C169@7439L68:OneUI.kt#78813j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-364625133, $changed, -1, "com.example.ui.oneui.OneUIScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OneUI.kt:169)");
            }
            IconKt.m2273Iconww6aTOc(SettingsKt.getSettings(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, $cs.getOnSurface(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void OneUIIconAction(final ImageVector icon, final String contentDescription, Function0<Unit> onClick, Composer $composer, final int $changed) {
        final Function0 onClick2;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer2 = $composer.startRestartGroup(-905915509);
        ComposerKt.sourceInformation($composer2, "C(OneUIIconAction)N(icon,contentDescription,onClick)199@8578L93,199@8548L123:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(contentDescription) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onClick) ? 256 : 128;
        }
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            onClick2 = onClick;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-905915509, $dirty, -1, "com.example.ui.oneui.OneUIIconAction (OneUI.kt:198)");
            }
            onClick2 = onClick;
            IconButtonKt.IconButton(onClick2, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-313216754, true, new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIIconAction$lambda$18(ImageVector.this, contentDescription, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIIconAction$lambda$19(ImageVector.this, contentDescription, onClick2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIIconAction$lambda$18(ImageVector $icon, String $contentDescription, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C200@8640L11,200@8588L77:OneUI.kt#78813j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-313216754, $changed, -1, "com.example.ui.oneui.OneUIIconAction.<anonymous> (OneUI.kt:200)");
            }
            IconKt.m2273Iconww6aTOc($icon, $contentDescription, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnBackground(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final void SectionLabel(final String text, Modifier modifier, boolean accent, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        Composer $composer2;
        final Modifier modifier3;
        final boolean accent2;
        long onSurfaceVariant;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(190289334);
        ComposerKt.sourceInformation($composer3, "C(SectionLabel)N(text,modifier,accent)209@8921L10,206@8780L279:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            z = accent;
        } else if (($changed & 384) == 0) {
            z = accent;
            $dirty |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = accent;
        }
        if ($composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            boolean accent3 = i3 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(190289334, $dirty, -1, "com.example.ui.oneui.SectionLabel (OneUI.kt:205)");
            }
            Modifier m733paddingqDBjuR0 = PaddingKt.m733paddingqDBjuR0(modifier4, Dp.m7226constructorimpl(8), Dp.m7226constructorimpl(12), Dp.m7226constructorimpl(8), Dp.m7226constructorimpl(0));
            TextStyle titleSmall = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getTitleSmall();
            if (accent3) {
                $composer3.startReplaceGroup(-1815533411);
                ComposerKt.sourceInformation($composer3, "210@8986L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary();
            } else {
                $composer3.startReplaceGroup(-1815532154);
                ComposerKt.sourceInformation($composer3, "210@9025L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant();
            }
            $composer3.endReplaceGroup();
            Modifier modifier5 = modifier4;
            $composer2 = $composer3;
            TextKt.m2816Text4IGK_g(text, m733paddingqDBjuR0, onSurfaceVariant, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, titleSmall, $composer2, $dirty & 14, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            accent2 = accent3;
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            accent2 = z;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.SectionLabel$lambda$20(text, modifier3, accent2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: OneUICard-uDo3WH8, reason: not valid java name */
    public static final void m7680OneUICarduDo3WH8(Modifier modifier, Function0<Unit> function0, PaddingValues padding, long color, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Function0 onClick;
        PaddingValues padding2;
        long j;
        final Modifier modifier3;
        final PaddingValues padding3;
        final Function0 onClick2;
        final long color2;
        Modifier.Companion modifier4;
        Function0 onClick3;
        final PaddingValues padding4;
        final long color3;
        int $dirty;
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(58629248);
        ComposerKt.sourceInformation($composer2, "C(OneUICard)N(modifier,onClick,padding,color:c#ui.graphics.Color,content)225@9580L22,225@9604L311,225@9528L387:OneUI.kt#78813j");
        int $dirty2 = $changed;
        int i3 = i & 1;
        if (i3 != 0) {
            $dirty2 |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty2 |= 48;
            onClick = function0;
        } else if (($changed & 48) == 0) {
            onClick = function0;
            $dirty2 |= $composer2.changedInstance(onClick) ? 32 : 16;
        } else {
            onClick = function0;
        }
        int i5 = i & 4;
        if (i5 != 0) {
            $dirty2 |= 384;
            padding2 = padding;
        } else if (($changed & 384) == 0) {
            padding2 = padding;
            $dirty2 |= $composer2.changed(padding2) ? 256 : 128;
        } else {
            padding2 = padding;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                j = color;
                if ($composer2.changed(j)) {
                    i2 = 2048;
                    $dirty2 |= i2;
                }
            } else {
                j = color;
            }
            i2 = 1024;
            $dirty2 |= i2;
        } else {
            j = color;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer2.changedInstance(content) ? 16384 : 8192;
        }
        if ($composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "219@9243L11");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                }
                padding4 = padding2;
                $dirty = $dirty2;
                modifier3 = modifier2;
                color3 = j;
            } else {
                if (i3 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 == 0) {
                    onClick3 = onClick;
                } else {
                    onClick3 = null;
                }
                if (i5 != 0) {
                    padding2 = PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(0));
                }
                if ((i & 8) == 0) {
                    onClick = onClick3;
                    padding4 = padding2;
                    color3 = j;
                    $dirty = $dirty2;
                    modifier3 = modifier4;
                } else {
                    onClick = onClick3;
                    color3 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface();
                    padding4 = padding2;
                    $dirty = $dirty2 & (-7169);
                    modifier3 = modifier4;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58629248, $dirty, -1, "com.example.ui.oneui.OneUICard (OneUI.kt:221)");
            }
            final RoundedCornerShape shape = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(OneUIDimens.INSTANCE.m7676getCardRadiusD9Ej5fM());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4479boximpl(ColorSchemeKt.m2053contentColorForek8zF_U(color3, $composer2, ($dirty >> 9) & 14))), ComposableLambdaKt.rememberComposableLambda(-1422413888, true, new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUICard_uDo3WH8$lambda$21(Modifier.this, shape, color3, onClick, padding4, content, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onClick2 = onClick;
            color2 = color3;
            padding3 = padding4;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            padding3 = padding2;
            onClick2 = onClick;
            color2 = j;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUICard_uDo3WH8$lambda$22(Modifier.this, onClick2, padding3, color2, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OneUICard_uDo3WH8$lambda$21(Modifier $modifier, RoundedCornerShape $shape, long $color, Function0 $onClick, PaddingValues $padding, Function3 $content, Composer $composer, int $changed) {
        Function0 function0;
        ComposerKt.sourceInformation($composer, "C226@9614L295:OneUI.kt#78813j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1422413888, $changed, -1, "com.example.ui.oneui.OneUICard.<anonymous> (OneUI.kt:226)");
            }
            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default($modifier, 0.0f, 1, null), $shape), $color, null, 2, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier padding = PaddingKt.padding(m231backgroundbw27NRU$default.then($onClick != null ? ClickableKt.m264clickableXHw0xAI$default(companion, false, null, null, $onClick, 7, null) : companion), $padding);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, padding);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                $content.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((0 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            $content.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((0 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: OneUIDivider-kHDZbjc, reason: not valid java name */
    public static final void m7682OneUIDividerkHDZbjc(final float inset, Composer $composer, final int $changed, final int i) {
        Composer $composer2 = $composer.startRestartGroup(1987657850);
        ComposerKt.sourceInformation($composer2, "C(OneUIDivider)N(inset:c#ui.unit.Dp)245@10130L11,240@9973L183:OneUI.kt#78813j");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(inset) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                inset = Dp.m7226constructorimpl(16);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1987657850, $dirty, -1, "com.example.ui.oneui.OneUIDivider (OneUI.kt:239)");
            }
            BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(PaddingKt.m732paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), inset, 0.0f, 2, null), Dp.m7226constructorimpl((float) 0.5d)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutline(), null, 2, null), $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIDivider_kHDZbjc$lambda$23(inset, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0238  */
    /* renamed from: OneUIIconBadge-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7683OneUIIconBadgeaMcp0Q(final ImageVector icon, long tint, float size, Composer $composer, final int $changed, final int i) {
        long tint2;
        float f;
        final long tint3;
        final float size2;
        int $dirty;
        float size3;
        Function0 function0;
        Composer composer;
        int i2;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer $composer2 = $composer.startRestartGroup(-325381280);
        ComposerKt.sourceInformation($composer2, "C(OneUIIconBadge)N(icon,tint:c#ui.graphics.Color,size:c#ui.unit.Dp)255@10398L11,251@10283L279:OneUI.kt#78813j");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            if ((i & 2) == 0) {
                tint2 = tint;
                if ($composer2.changed(tint2)) {
                    i2 = 32;
                    $dirty2 |= i2;
                }
            } else {
                tint2 = tint;
            }
            i2 = 16;
            $dirty2 |= i2;
        } else {
            tint2 = tint;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty2 |= 384;
            f = size;
        } else if (($changed & 384) == 0) {
            f = size;
            $dirty2 |= $composer2.changed(f) ? 256 : 128;
        } else {
            f = size;
        }
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "250@10238L11");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 2) != 0) {
                    $dirty2 &= -113;
                }
                $dirty = $dirty2;
                size3 = f;
            } else {
                if ((i & 2) != 0) {
                    tint2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                    $dirty2 &= -113;
                }
                if (i3 == 0) {
                    $dirty = $dirty2;
                    size3 = f;
                } else {
                    $dirty = $dirty2;
                    size3 = Dp.m7226constructorimpl(40);
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-325381280, $dirty, -1, "com.example.ui.oneui.OneUIIconBadge (OneUI.kt:250)");
            }
            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, size3), RoundedCornerShapeKt.getCircleShape()), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceVariant(), null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, m231backgroundbw27NRU$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((48 << 3) & 112) << 6) & 896) | 6;
            long tint4 = tint2;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
                function0 = constructor;
                composer = $composer2;
            } else {
                function0 = constructor;
                composer = $composer2;
                if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i6 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -569380744, "C258@10487L69:OneUI.kt#78813j");
                    IconKt.m2273Iconww6aTOc(icon, (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(size3 * 0.55f)), tint4, composer2, ($dirty & 14) | 48 | (($dirty << 6) & 7168), 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    tint3 = tint4;
                    size2 = size3;
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i52 = (i4 >> 6) & 14;
            Composer composer22 = composer;
            ComposerKt.sourceInformationMarkerStart(composer22, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i62 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer22, -569380744, "C258@10487L69:OneUI.kt#78813j");
            IconKt.m2273Iconww6aTOc(icon, (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(size3 * 0.55f)), tint4, composer22, ($dirty & 14) | 48 | (($dirty << 6) & 7168), 0);
            ComposerKt.sourceInformationMarkerEnd(composer22);
            ComposerKt.sourceInformationMarkerEnd(composer22);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            tint3 = tint4;
            size2 = size3;
        } else {
            $composer2.skipToGroupEnd();
            tint3 = tint2;
            size2 = f;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIIconBadge_aM_cp0Q$lambda$25(ImageVector.this, tint3, size2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e8  */
    /* renamed from: OneUIRow-RFMEUTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7685OneUIRowRFMEUTM(final String title, Modifier modifier, String summary, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function0<Unit> function0, long titleColor, Composer $composer, final int $changed, final int i) {
        String str;
        Function2 function23;
        Function2 function24;
        Function0 function02;
        long titleColor2;
        Composer $composer2;
        final Modifier modifier2;
        final long titleColor3;
        final String summary2;
        final Function2 leading;
        final Function2 trailing;
        final Function0 onClick;
        Modifier.Companion modifier3;
        String summary3;
        Function2 leading2;
        Function2 trailing2;
        Function0 onClick2;
        String summary4;
        Function2 leading3;
        Function0 onClick3;
        Modifier.Companion companion;
        Composer $composer3;
        int $dirty;
        Composer composer;
        Composer m3828constructorimpl;
        Function0 function03;
        CompositionLocalMap compositionLocalMap;
        Function2 trailing3;
        String summary5;
        Composer composer2;
        int i2;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer $composer4 = $composer.startRestartGroup(421858457);
        ComposerKt.sourceInformation($composer4, "C(OneUIRow)N(title,modifier,summary,leading,trailing,onClick,titleColor:c#ui.graphics.Color)273@10957L906:OneUI.kt#78813j");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer4.changed(title) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty2 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty2 |= $composer4.changed(modifier) ? 32 : 16;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty2 |= 384;
            str = summary;
        } else if (($changed & 384) == 0) {
            str = summary;
            $dirty2 |= $composer4.changed(str) ? 256 : 128;
        } else {
            str = summary;
        }
        int i5 = i & 8;
        if (i5 != 0) {
            $dirty2 |= 3072;
            function23 = function2;
        } else if (($changed & 3072) == 0) {
            function23 = function2;
            $dirty2 |= $composer4.changedInstance(function23) ? 2048 : 1024;
        } else {
            function23 = function2;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty2 |= 24576;
            function24 = function22;
        } else if (($changed & 24576) == 0) {
            function24 = function22;
            $dirty2 |= $composer4.changedInstance(function24) ? 16384 : 8192;
        } else {
            function24 = function22;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function02 = function0;
        } else if ((196608 & $changed) == 0) {
            function02 = function0;
            $dirty2 |= $composer4.changedInstance(function02) ? 131072 : 65536;
        } else {
            function02 = function0;
        }
        if (($changed & 1572864) == 0) {
            if ((i & 64) == 0) {
                titleColor2 = titleColor;
                if ($composer4.changed(titleColor2)) {
                    i2 = 1048576;
                    $dirty2 |= i2;
                }
            } else {
                titleColor2 = titleColor;
            }
            i2 = 524288;
            $dirty2 |= i2;
        } else {
            titleColor2 = titleColor;
        }
        if ($composer4.shouldExecute(($dirty2 & 599187) != 599186, $dirty2 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "271@10927L11");
            if (($changed & 1) != 0 && !$composer4.getDefaultsInvalid()) {
                $composer4.skipToGroupEnd();
                if ((i & 64) != 0) {
                    $dirty2 &= -3670017;
                }
                modifier3 = modifier;
                summary4 = str;
                leading3 = function23;
                trailing2 = function24;
                onClick2 = function02;
            } else {
                if (i3 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i4 == 0) {
                    summary3 = str;
                } else {
                    summary3 = null;
                }
                if (i5 == 0) {
                    leading2 = function23;
                } else {
                    leading2 = null;
                }
                if (i6 == 0) {
                    trailing2 = function24;
                } else {
                    trailing2 = null;
                }
                if (i7 == 0) {
                    onClick2 = function02;
                } else {
                    onClick2 = null;
                }
                if ((i & 64) == 0) {
                    summary4 = summary3;
                    leading3 = leading2;
                } else {
                    titleColor2 = MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).getOnSurface();
                    $dirty2 &= -3670017;
                    summary4 = summary3;
                    leading3 = leading2;
                }
            }
            $composer4.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(421858457, $dirty2, -1, "com.example.ui.oneui.OneUIRow (OneUI.kt:272)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            if (onClick2 != null) {
                Function0 onClick4 = onClick2;
                companion = ClickableKt.m264clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, onClick4, 7, null);
                onClick3 = onClick4;
            } else {
                onClick3 = onClick2;
                companion = Modifier.INSTANCE;
            }
            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(SizeKt.m765heightInVpY3zN4$default(fillMaxWidth$default.then(companion), Dp.m7226constructorimpl(60), 0.0f, 2, null), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer4, m731paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i8 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer4.startReusableNode();
            if ($composer4.getInserting()) {
                $composer4.createNode(constructor);
            } else {
                $composer4.useNode();
            }
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer4);
            Modifier modifier4 = modifier3;
            Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
                $composer3 = $composer4;
                $dirty = $dirty2;
            } else {
                $composer3 = $composer4;
                $dirty = $dirty2;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i9 = (i8 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i10 = ((384 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer4, -1714336938, "C285@11370L380:OneUI.kt#78813j");
                    if (leading3 == null) {
                        $composer4.startReplaceGroup(-1714332134);
                        ComposerKt.sourceInformation($composer4, "282@11300L9,283@11322L29");
                        leading3.invoke($composer4, Integer.valueOf(($dirty >> 9) & 14));
                        composer = $composer4;
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer4, 6);
                    } else {
                        composer = $composer4;
                        $composer4.startReplaceGroup(-1725531163);
                    }
                    $composer4.endReplaceGroup();
                    Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Function2 leading4 = leading3;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer4, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer4, weight$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i11 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    long titleColor4 = titleColor2;
                    ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer4.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer4.startReusableNode();
                    if (!$composer4.getInserting()) {
                        $composer4.createNode(constructor2);
                    } else {
                        $composer4.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer4);
                    Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        function03 = constructor2;
                        compositionLocalMap = currentCompositionLocalMap2;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i12 = (i11 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i13 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer4, -1928547672, "C286@11446L10,286@11412L75:OneUI.kt#78813j");
                            int $dirty3 = $dirty;
                            trailing3 = trailing2;
                            Composer composer3 = composer;
                            $composer2 = $composer3;
                            TextKt.m2816Text4IGK_g(title, (Modifier) null, titleColor4, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer4, MaterialTheme.$stable).getBodyLarge(), $composer4, ($dirty & 14) | (($dirty >> 12) & 896), 0, 65530);
                            if (summary4 != null) {
                                $composer4.startReplaceGroup(-1928442924);
                                ComposerKt.sourceInformation($composer4, "290@11616L10,291@11680L11,288@11539L187");
                                summary5 = summary4;
                                TextKt.m2816Text4IGK_g(summary5, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer4, MaterialTheme.$stable).getBodySmall(), $composer4, ($dirty3 >> 6) & 14, 0, 65530);
                            } else {
                                summary5 = summary4;
                                $composer4.startReplaceGroup(-1939879537);
                            }
                            $composer4.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd($composer4);
                            ComposerKt.sourceInformationMarkerEnd($composer4);
                            $composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer4);
                            ComposerKt.sourceInformationMarkerEnd($composer4);
                            ComposerKt.sourceInformationMarkerEnd($composer4);
                            if (trailing3 != null) {
                                composer2 = $composer4;
                                composer2.startReplaceGroup(-1713841063);
                                ComposerKt.sourceInformation(composer2, "296@11795L29,297@11837L10");
                                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer2, 6);
                                trailing3.invoke(composer2, Integer.valueOf(($dirty3 >> 12) & 14));
                            } else {
                                composer2 = $composer4;
                                composer2.startReplaceGroup(-1725531163);
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            $composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer4);
                            ComposerKt.sourceInformationMarkerEnd($composer4);
                            ComposerKt.sourceInformationMarkerEnd($composer4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            titleColor3 = titleColor4;
                            trailing = trailing3;
                            summary2 = summary5;
                            onClick = onClick3;
                            modifier2 = modifier4;
                            leading = leading4;
                        }
                    } else {
                        function03 = constructor2;
                        compositionLocalMap = currentCompositionLocalMap2;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i122 = (i11 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i132 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer4, -1928547672, "C286@11446L10,286@11412L75:OneUI.kt#78813j");
                    int $dirty32 = $dirty;
                    trailing3 = trailing2;
                    Composer composer32 = composer;
                    $composer2 = $composer3;
                    TextKt.m2816Text4IGK_g(title, (Modifier) null, titleColor4, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer4, MaterialTheme.$stable).getBodyLarge(), $composer4, ($dirty & 14) | (($dirty >> 12) & 896), 0, 65530);
                    if (summary4 != null) {
                    }
                    $composer4.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    $composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    if (trailing3 != null) {
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer32);
                    $composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    titleColor3 = titleColor4;
                    trailing = trailing3;
                    summary2 = summary5;
                    onClick = onClick3;
                    modifier2 = modifier4;
                    leading = leading4;
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i92 = (i8 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i102 = ((384 >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer4, -1714336938, "C285@11370L380:OneUI.kt#78813j");
            if (leading3 == null) {
            }
            $composer4.endReplaceGroup();
            Modifier weight$default2 = RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Function2 leading42 = leading3;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer4, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer4, weight$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i112 = ((((0 << 3) & 112) << 6) & 896) | 6;
            long titleColor42 = titleColor2;
            ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer4.getApplier() instanceof Applier)) {
            }
            $composer4.startReusableNode();
            if (!$composer4.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer4);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i1222 = (i112 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            int i1322 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer4, -1928547672, "C286@11446L10,286@11412L75:OneUI.kt#78813j");
            int $dirty322 = $dirty;
            trailing3 = trailing2;
            Composer composer322 = composer;
            $composer2 = $composer3;
            TextKt.m2816Text4IGK_g(title, (Modifier) null, titleColor42, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer4, MaterialTheme.$stable).getBodyLarge(), $composer4, ($dirty & 14) | (($dirty >> 12) & 896), 0, 65530);
            if (summary4 != null) {
            }
            $composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            $composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            if (trailing3 != null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer322);
            $composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            if (ComposerKt.isTraceInProgress()) {
            }
            titleColor3 = titleColor42;
            trailing = trailing3;
            summary2 = summary5;
            onClick = onClick3;
            modifier2 = modifier4;
            leading = leading42;
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            titleColor3 = titleColor2;
            summary2 = str;
            leading = function23;
            trailing = function24;
            onClick = function02;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIRow_RFMEUTM$lambda$28(title, modifier2, summary2, leading, trailing, onClick, titleColor3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OneUIButton(final String text, final Function0<Unit> onClick, Modifier modifier, boolean filled, ImageVector icon, boolean destructive, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        ImageVector imageVector;
        boolean z2;
        Composer $composer2;
        final Modifier modifier3;
        final boolean filled2;
        final ImageVector icon2;
        final boolean destructive2;
        Modifier.Companion modifier4;
        boolean filled3;
        ImageVector icon3;
        boolean destructive3;
        long m4487copywmQWz5c;
        long accent;
        Composer composer;
        Composer composer2;
        ImageVector icon4;
        long content;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(-498645223);
        ComposerKt.sourceInformation($composer3, "C(OneUIButton)N(text,onClick,modifier,filled,icon,destructive)311@12098L11,315@12298L583:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            z = filled;
        } else if (($changed & 3072) == 0) {
            z = filled;
            $dirty |= $composer3.changed(z) ? 2048 : 1024;
        } else {
            z = filled;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            imageVector = icon;
        } else if (($changed & 24576) == 0) {
            imageVector = icon;
            $dirty |= $composer3.changed(imageVector) ? 16384 : 8192;
        } else {
            imageVector = icon;
        }
        int i5 = i & 32;
        if (i5 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = destructive;
        } else if ((196608 & $changed) == 0) {
            z2 = destructive;
            $dirty |= $composer3.changed(z2) ? 131072 : 65536;
        } else {
            z2 = destructive;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            filled2 = z;
            icon2 = imageVector;
            destructive2 = z2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i3 == 0) {
                filled3 = z;
            } else {
                filled3 = false;
            }
            if (i4 == 0) {
                icon3 = imageVector;
            } else {
                icon3 = null;
            }
            if (i5 == 0) {
                destructive3 = z2;
            } else {
                destructive3 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498645223, $dirty2, -1, "com.example.ui.oneui.OneUIButton (OneUI.kt:310)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            long accent2 = destructive3 ? cs.getError() : cs.getPrimary();
            if (filled3) {
                accent = accent2;
            } else {
                m4487copywmQWz5c = Color.m4487copywmQWz5c(accent2, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(accent2) : 0.14f, (r12 & 2) != 0 ? Color.m4495getRedimpl(accent2) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(accent2) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(accent2) : 0.0f);
                accent = accent2;
                accent2 = m4487copywmQWz5c;
            }
            long container = accent2;
            long content2 = filled3 ? Color.INSTANCE.m4526getWhite0d7_KjU() : accent;
            Modifier modifier5 = modifier4;
            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(ClickableKt.m264clickableXHw0xAI$default(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m765heightInVpY3zN4$default(modifier4, Dp.m7226constructorimpl(44), 0.0f, 2, null), RoundedCornerShapeKt.getCircleShape()), container, null, 2, null), false, null, null, onClick, 7, null), Dp.m7226constructorimpl(20), Dp.m7226constructorimpl(10));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, m731paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting() || !Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i8 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1762471455, "C329@12836L10,329@12803L72:OneUI.kt#78813j");
            if (icon3 != null) {
                $composer3.startReplaceGroup(-1762456669);
                ComposerKt.sourceInformation($composer3, "326@12678L65,327@12756L28");
                composer = $composer3;
                content = content2;
                IconKt.m2273Iconww6aTOc(icon3, (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), content, $composer3, (($dirty2 >> 12) & 14) | 432, 0);
                icon4 = icon3;
                composer2 = $composer3;
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), composer2, 6);
            } else {
                composer = $composer3;
                composer2 = $composer3;
                icon4 = icon3;
                content = content2;
                composer2.startReplaceGroup(-1775024379);
            }
            composer2.endReplaceGroup();
            $composer2 = $composer3;
            Composer composer3 = composer2;
            TextKt.m2816Text4IGK_g(text, (Modifier) null, content, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer3, $dirty2 & 14, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            filled2 = filled3;
            destructive2 = destructive3;
            modifier3 = modifier5;
            icon2 = icon4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIButton$lambda$30(text, onClick, modifier3, filled2, icon2, destructive2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneUISearchField(final String value, Function1<? super String, Unit> function1, final String placeholder, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Function0 function0;
        Composer composer;
        Composer composer2;
        Modifier modifier4;
        Composer composer3;
        int $dirty;
        DefaultConstructorMarker defaultConstructorMarker;
        boolean z;
        Composer composer4;
        final Function1<? super String, Unit> onValueChange = function1;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Composer $composer3 = $composer.startRestartGroup(178076665);
        ComposerKt.sourceInformation($composer3, "C(OneUISearchField)N(value,onValueChange,placeholder,modifier)340@13065L11,341@13081L1215:OneUI.kt#78813j");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(value) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(onValueChange) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(placeholder) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty2 |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            Modifier.Companion modifier5 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178076665, $dirty2, -1, "com.example.ui.oneui.OneUISearchField (OneUI.kt:339)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m763height3ABfNKs(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), Dp.m7226constructorimpl(48)), RoundedCornerShapeKt.getCircleShape()), cs.getSurface(), null, 2, null), Dp.m7226constructorimpl(16), 0.0f, 2, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            int $dirty3 = $dirty2;
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, m732paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting() || !Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i5 = ((384 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 41697422, "C350@13338L94,351@13441L29,352@13479L587:OneUI.kt#78813j");
            IconKt.m2273Iconww6aTOc(SearchKt.getSearch(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), cs.getOnSurfaceVariant(), $composer3, 432, 0);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer3, 6);
            Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer3, weight$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor2;
                $composer3.createNode(function0);
            } else {
                function0 = constructor2;
                $composer3.useNode();
            }
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = (i6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i8 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -4798832, "C360@13888L10,356@13717L339:OneUI.kt#78813j");
                if (value.length() != 0) {
                    composer = $composer3;
                    composer2 = $composer3;
                    $composer2 = $composer3;
                    modifier4 = modifier5;
                    composer3 = $composer3;
                    $dirty = $dirty3;
                    defaultConstructorMarker = null;
                    z = false;
                    composer.startReplaceGroup(-18266721);
                } else {
                    $composer3.startReplaceGroup(-4789564);
                    ComposerKt.sourceInformation($composer3, "354@13639L10,354@13599L91");
                    $dirty = $dirty3;
                    z = false;
                    modifier4 = modifier5;
                    composer2 = $composer3;
                    $composer2 = $composer3;
                    composer3 = $composer3;
                    defaultConstructorMarker = null;
                    TextKt.m2816Text4IGK_g(placeholder, (Modifier) null, cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, ($dirty3 >> 6) & 14, 0, 65530);
                    composer = $composer3;
                }
                composer.endReplaceGroup();
                TextStyle m6673copyp1EtxEg$default = TextStyle.m6673copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), cs.getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                SolidColor solidColor = new SolidColor(cs.getPrimary(), defaultConstructorMarker);
                boolean z2 = true;
                Composer composer5 = composer;
                onValueChange = function1;
                BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker), false, false, m6673copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer5, ($dirty & 14) | 100663680 | ($dirty & 112), 0, 48856);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (value.length() <= 0 ? true : z) {
                    composer4 = $composer3;
                    composer4.startReplaceGroup(28435621);
                } else {
                    composer4 = $composer3;
                    composer4.startReplaceGroup(42428742);
                    ComposerKt.sourceInformation(composer4, "369@14231L21,366@14113L167");
                    long onSurfaceVariant = cs.getOnSurfaceVariant();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer4, -1107005934, "CC(remember):OneUI.kt#9igjgp");
                    if (($dirty & 112) != 32) {
                        z2 = z;
                    }
                    Object rememberedValue = composer4.rememberedValue();
                    if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function0() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OneUIKt.OneUISearchField$lambda$34$lambda$33$lambda$32(Function1.this);
                            }
                        };
                        composer4.updateRememberedValue(obj);
                        rememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    TextKt.m2816Text4IGK_g("✕", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7226constructorimpl(4)), onSurfaceVariant, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 6, 0, 131064);
                }
                composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i72 = (i6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i82 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -4798832, "C360@13888L10,356@13717L339:OneUI.kt#78813j");
            if (value.length() != 0) {
            }
            composer.endReplaceGroup();
            TextStyle m6673copyp1EtxEg$default2 = TextStyle.m6673copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), cs.getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            SolidColor solidColor2 = new SolidColor(cs.getPrimary(), defaultConstructorMarker);
            boolean z22 = true;
            Composer composer52 = composer;
            onValueChange = function1;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker), false, false, m6673copyp1EtxEg$default2, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer52, ($dirty & 14) | 100663680 | ($dirty & 112), 0, 48856);
            ComposerKt.sourceInformationMarkerEnd(composer52);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (value.length() <= 0 ? true : z) {
            }
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1<? super String, Unit> function12 = onValueChange;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OneUIKt.OneUISearchField$lambda$35(value, function12, placeholder, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUISearchField$lambda$34$lambda$33$lambda$32(Function1 $onValueChange) {
        $onValueChange.invoke("");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027b  */
    /* renamed from: OneUIChip-M8YrEPQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7681OneUIChipM8YrEPQ(final String label, final boolean selected, final Function0<Unit> onClick, Modifier modifier, Color dot, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Color color;
        Composer $composer2;
        final Modifier modifier3;
        final Color dot2;
        Modifier.Companion modifier4;
        Color dot3;
        long surface;
        int i2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(1321832708);
        ComposerKt.sourceInformation($composer3, "C(OneUIChip)N(label,selected,onClick,modifier,dot:c#ui.graphics.Color)383@14483L11,384@14509L81,385@14595L644:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(selected) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 256 : 128;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            color = dot;
        } else if (($changed & 24576) == 0) {
            color = dot;
            $dirty |= $composer3.changed(color) ? 16384 : 8192;
        } else {
            color = dot;
        }
        if ($composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            if (i3 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i4 == 0) {
                dot3 = color;
            } else {
                dot3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1321832708, $dirty, -1, "com.example.ui.oneui.OneUIChip (OneUI.kt:382)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            if (selected) {
                surface = Color.m4487copywmQWz5c(r16, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r16) : 0.16f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r16) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r16) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(cs.getPrimary()) : 0.0f);
            } else {
                surface = cs.getSurface();
            }
            State bg$delegate = SingleValueAnimationKt.m109animateColorAsStateeuL9pac(surface, null, null, null, $composer3, 0, 14);
            $composer2 = $composer3;
            int $dirty2 = $dirty;
            Modifier modifier5 = modifier4;
            Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(ClickableKt.m264clickableXHw0xAI$default(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m763height3ABfNKs(modifier4, Dp.m7226constructorimpl(38)), RoundedCornerShapeKt.getCircleShape()), OneUIChip_M8YrEPQ$lambda$36(bg$delegate), null, 2, null), false, null, null, onClick, 7, null), Dp.m7226constructorimpl(16), 0.0f, 2, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, m732paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
                i2 = 6;
            } else {
                i2 = 6;
                if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i7 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer2, 1702397380, "C400@15066L10,398@15007L226:OneUI.kt#78813j");
                    if (dot3 == null) {
                        $composer2.startReplaceGroup(1702406431);
                        ComposerKt.sourceInformation($composer2, "395@14889L58,396@14960L28");
                        BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(9)), RoundedCornerShapeKt.getCircleShape()), dot3.m4499unboximpl(), null, 2, null), $composer2, 0);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(7)), $composer2, i2);
                    } else {
                        $composer2.startReplaceGroup(1687645626);
                    }
                    $composer2.endReplaceGroup();
                    TextKt.m2816Text4IGK_g(label, (Modifier) null, !selected ? cs.getPrimary() : cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7132getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, $dirty2 & 14, 3120, 55290);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    dot2 = dot3;
                    modifier3 = modifier5;
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i62 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i72 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1702397380, "C400@15066L10,398@15007L226:OneUI.kt#78813j");
            if (dot3 == null) {
            }
            $composer2.endReplaceGroup();
            TextKt.m2816Text4IGK_g(label, (Modifier) null, !selected ? cs.getPrimary() : cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7132getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, $dirty2 & 14, 3120, 55290);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            dot2 = dot3;
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            dot2 = color;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIChip_M8YrEPQ$lambda$38(label, selected, onClick, modifier3, dot2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long OneUIChip_M8YrEPQ$lambda$36(State<Color> state) {
        return ((Color) state.getValue()).m4499unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneUISwitch(final boolean checked, final Function1<? super Boolean, Unit> function1, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        long Color;
        Modifier m261clickableO2vRcR0;
        Function0 function0;
        Composer $composer2 = $composer.startRestartGroup(128285865);
        ComposerKt.sourceInformation($composer2, "C(OneUISwitch)N(checked,onCheckedChange,modifier)414@15402L11,416@15481L114,419@15613L134,430@15949L39,433@16102L37,423@15752L676:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(checked) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(128285865, $dirty, -1, "com.example.ui.oneui.OneUISwitch (OneUI.kt:413)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            boolean dark = Color.m4490equalsimpl0(cs.getBackground(), ColorKt.Color(4278190080L));
            if (checked) {
                Color = cs.getPrimary();
            } else {
                Color = ColorKt.Color(dark ? 4284243036L : 4290230199L);
            }
            Modifier modifier5 = modifier4;
            State track$delegate = SingleValueAnimationKt.m109animateColorAsStateeuL9pac(Color, null, null, null, $composer2, 0, 14);
            State thumb$delegate = AnimateAsStateKt.m129animateDpAsStateAjpBEmI(checked ? Dp.m7226constructorimpl(22) : Dp.m7226constructorimpl(0), AnimationSpecKt.spring$default(0.75f, 1500.0f, null, 4, null), null, null, $composer2, 48, 12);
            $composer2 = $composer2;
            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(modifier5, Dp.m7226constructorimpl(52)), Dp.m7226constructorimpl(30)), RoundedCornerShapeKt.getCircleShape()), OneUISwitch$lambda$39(track$delegate), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -1271312688, "CC(remember):OneUI.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                $composer2.updateRememberedValue(MutableInteractionSource);
                rememberedValue = MutableInteractionSource;
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            boolean z = function1 != null;
            ComposerKt.sourceInformationMarkerStart($composer2, -1271307794, "CC(remember):OneUI.kt#9igjgp");
            boolean z2 = (($dirty & 112) == 32) | (($dirty & 14) == 4);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OneUIKt.OneUISwitch$lambda$43$lambda$42(Function1.this, checked);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            m261clickableO2vRcR0 = ClickableKt.m261clickableO2vRcR0(m231backgroundbw27NRU$default, mutableInteractionSource, null, (r14 & 4) != 0 ? true : z, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : null, (Function0) rememberedValue2);
            Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(m261clickableO2vRcR0, Dp.m7226constructorimpl(3));
            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, m730padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i4 = (i3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i5 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -1522233423, "C438@16247L175:OneUI.kt#78813j");
                BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(OffsetKt.m690offsetVpY3zN4$default(Modifier.INSTANCE, OneUISwitch$lambda$40(thumb$delegate), 0.0f, 2, null), Dp.m7226constructorimpl(24)), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m4526getWhite0d7_KjU(), null, 2, null), $composer2, 0);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i42 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i52 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1522233423, "C438@16247L175:OneUI.kt#78813j");
            BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(OffsetKt.m690offsetVpY3zN4$default(Modifier.INSTANCE, OneUISwitch$lambda$40(thumb$delegate), 0.0f, 2, null), Dp.m7226constructorimpl(24)), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m4526getWhite0d7_KjU(), null, 2, null), $composer2, 0);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier5;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OneUIKt.OneUISwitch$lambda$45(checked, function1, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final long OneUISwitch$lambda$39(State<Color> state) {
        return ((Color) state.getValue()).m4499unboximpl();
    }

    private static final float OneUISwitch$lambda$40(State<Dp> state) {
        return ((Dp) state.getValue()).m7240unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUISwitch$lambda$43$lambda$42(Function1 $onCheckedChange, boolean $checked) {
        if ($onCheckedChange != null) {
            $onCheckedChange.invoke(Boolean.valueOf(!$checked));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneUIEmptyState(final String text, final ImageVector icon, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Arrangement.Vertical vertical;
        long m4487copywmQWz5c;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer $composer3 = $composer.startRestartGroup(-1970850533);
        ComposerKt.sourceInformation($composer3, "C(OneUIEmptyState)N(text,icon,modifier)450@16534L451:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(icon) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1970850533, $dirty2, -1, "com.example.ui.oneui.OneUIEmptyState (OneUI.kt:449)");
            }
            Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(48), 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, centerHorizontally, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, m732paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
                vertical = top;
            } else {
                vertical = top;
                if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i4 = (i3 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i5 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1119431875, "C454@16714L11,454@16676L119,455@16804L30,456@16876L11,456@16958L10,456@16843L136:OneUI.kt#78813j");
                    m4487copywmQWz5c = Color.m4487copywmQWz5c(r37, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r37) : 0.5f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r37) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r37) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant()) : 0.0f);
                    IconKt.m2273Iconww6aTOc(icon, (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(56)), m4487copywmQWz5c, $composer3, (($dirty2 >> 3) & 14) | 432, 0);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer3, 6);
                    $composer2 = $composer3;
                    Modifier modifier5 = modifier4;
                    TextKt.m2816Text4IGK_g(text, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), $composer3, $dirty2 & 14, 0, 65018);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i42 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i52 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1119431875, "C454@16714L11,454@16676L119,455@16804L30,456@16876L11,456@16958L10,456@16843L136:OneUI.kt#78813j");
            m4487copywmQWz5c = Color.m4487copywmQWz5c(r37, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r37) : 0.5f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r37) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r37) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant()) : 0.0f);
            IconKt.m2273Iconww6aTOc(icon, (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(56)), m4487copywmQWz5c, $composer3, (($dirty2 >> 3) & 14) | 432, 0);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer3, 6);
            $composer2 = $composer3;
            Modifier modifier52 = modifier4;
            TextKt.m2816Text4IGK_g(text, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), $composer3, $dirty2 & 14, 0, 65018);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIEmptyState$lambda$47(text, icon, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: parseColorSafe-4WTKRHQ$default, reason: not valid java name */
    public static /* synthetic */ long m7688parseColorSafe4WTKRHQ$default(String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ColorKt.Color(4282290687L);
        }
        return m7687parseColorSafe4WTKRHQ(str, j);
    }

    /* renamed from: parseColorSafe-4WTKRHQ, reason: not valid java name */
    public static final long m7687parseColorSafe4WTKRHQ(String hex, long fallback) {
        Intrinsics.checkNotNullParameter(hex, "hex");
        try {
            return ColorKt.Color(android.graphics.Color.parseColor(hex));
        } catch (Exception e) {
            return fallback;
        }
    }

    public static final String azkarCount(int n) {
        if (n == 0) {
            return "لا أذكار";
        }
        if (n == 1) {
            return "ذكر واحد";
        }
        if (n == 2) {
            return "ذكران";
        }
        return 3 <= n && n < 11 ? n + " أذكار" : n + " ذكرًا";
    }

    public static final String readsCount(int n) {
        if (n == 0) {
            return "لا قراءات";
        }
        if (n == 1) {
            return "قراءة واحدة";
        }
        if (n == 2) {
            return "قراءتان";
        }
        return 3 <= n && n < 11 ? n + " قراءات" : n + " قراءة";
    }

    public static final void OneUIMenu(final boolean expanded, final Function0<Unit> onDismiss, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-236815382);
        ComposerKt.sourceInformation($composer2, "C(OneUIMenu)N(expanded,onDismiss,content)491@17872L11,487@17709L330:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(expanded) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-236815382, $dirty, -1, "com.example.ui.oneui.OneUIMenu (OneUI.kt:486)");
            }
            AndroidMenu_androidKt.m1888DropdownMenuIlH_yew(expanded, onDismiss, SizeKt.m784widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m7226constructorimpl(ComposerKt.invocationKey), 0.0f, 2, null), 0L, null, null, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(22)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface(), Dp.m7226constructorimpl(0), Dp.m7226constructorimpl(12), null, content, $composer2, ($dirty & 14) | 905970048 | ($dirty & 112), ($dirty >> 3) & 112, 1080);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIMenu$lambda$48(expanded, onDismiss, content, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OneUIMenuItem(final String text, final Function0<Unit> onClick, ImageVector icon, boolean destructive, Composer $composer, final int $changed, final int i) {
        ImageVector imageVector;
        boolean z;
        final ImageVector icon2;
        final boolean destructive2;
        final ImageVector icon3;
        boolean destructive3;
        final long color;
        ComposableLambda composableLambda;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer2 = $composer.startRestartGroup(-300235288);
        ComposerKt.sourceInformation($composer2, "C(OneUIMenuItem)N(text,onClick,icon,destructive)508@18355L73,507@18322L311:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onClick) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            imageVector = icon;
        } else if (($changed & 384) == 0) {
            imageVector = icon;
            $dirty |= $composer2.changed(imageVector) ? 256 : 128;
        } else {
            imageVector = icon;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            z = destructive;
        } else if (($changed & 3072) == 0) {
            z = destructive;
            $dirty |= $composer2.changed(z) ? 2048 : 1024;
        } else {
            z = destructive;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            icon2 = imageVector;
            destructive2 = z;
        } else {
            if (i2 != 0) {
                icon3 = null;
            } else {
                icon3 = imageVector;
            }
            if (i3 == 0) {
                destructive3 = z;
            } else {
                destructive3 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-300235288, $dirty2, -1, "com.example.ui.oneui.OneUIMenuItem (OneUI.kt:505)");
            }
            if (destructive3) {
                $composer2.startReplaceGroup(-763296499);
                ComposerKt.sourceInformation($composer2, "506@18232L11");
                color = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError();
            } else {
                $composer2.startReplaceGroup(-763295311);
                ComposerKt.sourceInformation($composer2, "506@18269L11");
                color = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
            }
            $composer2.endReplaceGroup();
            if (icon3 != null) {
                $composer2.startReplaceGroup(-763289173);
                ComposerKt.sourceInformation($composer2, "509@18471L67");
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(127781904, true, new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OneUIKt.OneUIMenuItem$lambda$49(ImageVector.this, color, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54);
                $composer2.endReplaceGroup();
                composableLambda = rememberComposableLambda;
            } else {
                $composer2.startReplaceGroup(2107910869);
                $composer2.endReplaceGroup();
                composableLambda = null;
            }
            AndroidMenu_androidKt.DropdownMenuItem(ComposableLambdaKt.rememberComposableLambda(-937144296, true, new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIMenuItem$lambda$50(text, color, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), onClick, SizeKt.m765heightInVpY3zN4$default(Modifier.INSTANCE, Dp.m7226constructorimpl(52), 0.0f, 2, null), composableLambda, null, false, null, null, null, $composer2, ($dirty2 & 112) | 390, 496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            icon2 = icon3;
            destructive2 = destructive3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIMenuItem$lambda$51(text, onClick, icon2, destructive2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIMenuItem$lambda$50(String $text, long $color, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C508@18390L10,508@18357L69:OneUI.kt#78813j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-937144296, $changed, -1, "com.example.ui.oneui.OneUIMenuItem.<anonymous> (OneUI.kt:508)");
            }
            TextKt.m2816Text4IGK_g($text, (Modifier) null, $color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIMenuItem$lambda$49(ImageVector $icon, long $color, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C509@18473L63:OneUI.kt#78813j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127781904, $changed, -1, "com.example.ui.oneui.OneUIMenuItem.<anonymous> (OneUI.kt:509)");
            }
            IconKt.m2273Iconww6aTOc($icon, (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), $color, $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x027f  */
    /* renamed from: OneUIProgressBar-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7684OneUIProgressBareaDK9VM(final float progress, Modifier modifier, long color, long trackColor, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        long j;
        long trackColor2;
        final Modifier modifier3;
        final long color2;
        final long trackColor3;
        Modifier.Companion modifier4;
        long color3;
        Function0 function0;
        int i2;
        int i3;
        Composer $composer2 = $composer.startRestartGroup(-1993001738);
        ComposerKt.sourceInformation($composer2, "C(OneUIProgressBar)N(progress,modifier,color:c#ui.graphics.Color,trackColor:c#ui.graphics.Color)529@19053L407:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(progress) ? 4 : 2;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                j = color;
                if ($composer2.changed(j)) {
                    i3 = 256;
                    $dirty |= i3;
                }
            } else {
                j = color;
            }
            i3 = 128;
            $dirty |= i3;
        } else {
            j = color;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                trackColor2 = trackColor;
                if ($composer2.changed(trackColor2)) {
                    i2 = 2048;
                    $dirty |= i2;
                }
            } else {
                trackColor2 = trackColor;
            }
            i2 = 1024;
            $dirty |= i2;
        } else {
            trackColor2 = trackColor;
        }
        if ($composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "526@18959L11,527@19018L11");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty &= -897;
                }
                if ((i & 8) != 0) {
                    $dirty &= -7169;
                }
                modifier4 = modifier2;
                color3 = j;
            } else {
                if (i4 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i & 4) == 0) {
                    color3 = j;
                } else {
                    color3 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                    $dirty &= -897;
                }
                if ((i & 8) != 0) {
                    trackColor2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceVariant();
                    $dirty &= -7169;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1993001738, $dirty, -1, "com.example.ui.oneui.OneUIProgressBar (OneUI.kt:528)");
            }
            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m763height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m7226constructorimpl(10)), RoundedCornerShapeKt.getCircleShape()), trackColor2, null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            Modifier modifier5 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, m231backgroundbw27NRU$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
            long color4 = color3;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int i7 = ((0 >> 6) & 112) | 6;
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer2, 1461918198, "C536@19213L241:OneUI.kt#78813j");
                BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), 0.0f, 1, null), RangesKt.coerceIn(progress, 0.0f, 1.0f)), RoundedCornerShapeKt.getCircleShape()), color4, null, 2, null), $composer2, 0);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                color2 = color4;
                modifier3 = modifier5;
                trackColor3 = trackColor2;
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i62 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int i72 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 1461918198, "C536@19213L241:OneUI.kt#78813j");
            BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(boxScope2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), 0.0f, 1, null), RangesKt.coerceIn(progress, 0.0f, 1.0f)), RoundedCornerShapeKt.getCircleShape()), color4, null, 2, null), $composer2, 0);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            color2 = color4;
            modifier3 = modifier5;
            trackColor3 = trackColor2;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            color2 = j;
            trackColor3 = trackColor2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUIProgressBar_eaDK9VM$lambda$53(progress, modifier3, color2, trackColor3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x030d, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0494  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneUIBottomBar(final List<BottomTab> tabs, final String selectedRoute, final Function1<? super BottomTab, Unit> function1, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        Function0 function0;
        int i2;
        long m4487copywmQWz5c;
        Composer composer;
        Modifier m261clickableO2vRcR0;
        Function0 function02;
        long m4524getTransparent0d7_KjU;
        Function0 function03;
        Composer m3828constructorimpl;
        Object obj = selectedRoute;
        final Function1<? super BottomTab, Unit> onSelect = function1;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer $composer2 = $composer.startRestartGroup(1848715670);
        ComposerKt.sourceInformation($composer2, "C(OneUIBottomBar)N(tabs,selectedRoute,onSelect,modifier)555@19685L11,556@19729L14,556@19744L17,563@19977L81,558@19825L1758:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(tabs) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(obj) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onSelect) ? 256 : 128;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            if (i3 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1848715670, $dirty, -1, "com.example.ui.oneui.OneUIBottomBar (OneUI.kt:554)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            float navInset = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, $composer2, 6), $composer2, 0).getBottom();
            Modifier modifier5 = modifier4;
            Modifier m763height3ABfNKs = SizeKt.m763height3ABfNKs(GlassKt.m7674oneUIGlassT042LqI(PaddingKt.m734paddingqDBjuR0$default(PaddingKt.m732paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m7226constructorimpl(20), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m7226constructorimpl(navInset + Dp.m7226constructorimpl(12)), 7, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(32)), com.example.ui.theme.ColorKt.getOneUIPillDark(), 0.85f, 28, $composer2, 27648, 0), Dp.m7226constructorimpl(64));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, m763height3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting()) {
                i2 = 384;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    Composer composer2 = $composer2;
                    int i6 = 0;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i7 = ((i2 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 802801382, "C:OneUI.kt#78813j");
                    composer2.startReplaceGroup(-1775218344);
                    ComposerKt.sourceInformation(composer2, "*569@20270L102,575@20587L39,577@20700L17,570@20389L1170");
                    List<BottomTab> list = tabs;
                    int i8 = 0;
                    for (final BottomTab bottomTab : list) {
                        Iterable iterable = list;
                        int i9 = i8;
                        boolean areEqual = Intrinsics.areEqual(bottomTab.getRoute(), obj);
                        if (areEqual) {
                            m4487copywmQWz5c = cs.getOnSurface();
                        } else {
                            m4487copywmQWz5c = Color.m4487copywmQWz5c(r38, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r38) : 0.78f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r38) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r38) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(cs.getOnSurface()) : 0.0f);
                        }
                        Composer composer3 = composer2;
                        State m109animateColorAsStateeuL9pac = SingleValueAnimationKt.m109animateColorAsStateeuL9pac(m4487copywmQWz5c, null, "tabTint", null, composer3, 384, 10);
                        RowScope rowScope2 = rowScope;
                        int i10 = i6;
                        int i11 = i7;
                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composer3, -222751308, "CC(remember):OneUI.kt#9igjgp");
                        Object rememberedValue = composer3.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                            composer3.updateRememberedValue(MutableInteractionSource);
                            rememberedValue = MutableInteractionSource;
                        }
                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, -222747714, "CC(remember):OneUI.kt#9igjgp");
                        boolean changed = (($dirty & 896) == 256) | $composer2.changed(bottomTab);
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changed) {
                            composer = composer3;
                        } else {
                            composer = composer3;
                        }
                        Object obj2 = new Function0() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda31
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OneUIKt.OneUIBottomBar$lambda$61$lambda$60$lambda$57$lambda$56(Function1.this, bottomTab);
                            }
                        };
                        composer3.updateRememberedValue(obj2);
                        rememberedValue2 = obj2;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        m261clickableO2vRcR0 = ClickableKt.m261clickableO2vRcR0(fillMaxHeight$default, mutableInteractionSource, null, (r14 & 4) != 0, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : null, (Function0) rememberedValue2);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
                        Composer composer4 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer4, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m261clickableO2vRcR0);
                        Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        int i12 = ((((432 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            function02 = constructor2;
                            composer4.createNode(function02);
                        } else {
                            function02 = constructor2;
                            composer4.useNode();
                        }
                        Composer m3828constructorimpl3 = Updater.m3828constructorimpl(composer4);
                        int $dirty2 = $dirty;
                        Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i13 = (i12 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i14 = ((432 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -1170730697, "C581@20892L380,591@21380L10,589@21293L248:OneUI.kt#78813j");
                            Modifier clip = ClipKt.clip(SizeKt.m782width3ABfNKs(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(30)), Dp.m7226constructorimpl(56)), RoundedCornerShapeKt.getCircleShape());
                            if (areEqual) {
                                m4524getTransparent0d7_KjU = Color.INSTANCE.m4524getTransparent0d7_KjU();
                            } else {
                                m4524getTransparent0d7_KjU = Color.m4487copywmQWz5c(r65, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r65) : 1.0f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r65) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r65) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(cs.getSurfaceVariant()) : 0.0f);
                            }
                            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(clip, m4524getTransparent0d7_KjU, null, 2, null);
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, m231backgroundbw27NRU$default);
                            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            int i15 = ((((48 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (!composer4.getInserting()) {
                                function03 = constructor3;
                                composer4.createNode(function03);
                            } else {
                                function03 = constructor3;
                                composer4.useNode();
                            }
                            m3828constructorimpl = Updater.m3828constructorimpl(composer4);
                            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                Updater.m3835setimpl(m3828constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                int i16 = (i15 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i17 = ((48 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer4, 1139500556, "C588@21260L10:OneUI.kt#78813j");
                                bottomTab.getIcon().invoke(Color.m4479boximpl(OneUIBottomBar$lambda$61$lambda$60$lambda$54(m109animateColorAsStateeuL9pac)), composer4, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                TextKt.m2816Text4IGK_g(bottomTab.getLabel(), (Modifier) null, OneUIBottomBar$lambda$61$lambda$60$lambda$54(m109animateColorAsStateeuL9pac), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelSmall(), composer4, 3072, 3072, 57330);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                obj = selectedRoute;
                                onSelect = function1;
                                i6 = i10;
                                i7 = i11;
                                composer2 = composer;
                                rowScope = rowScope2;
                                list = iterable;
                                i8 = i9;
                                $dirty = $dirty2;
                            }
                            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i162 = (i15 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            int i172 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, 1139500556, "C588@21260L10:OneUI.kt#78813j");
                            bottomTab.getIcon().invoke(Color.m4479boximpl(OneUIBottomBar$lambda$61$lambda$60$lambda$54(m109animateColorAsStateeuL9pac)), composer4, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            TextKt.m2816Text4IGK_g(bottomTab.getLabel(), (Modifier) null, OneUIBottomBar$lambda$61$lambda$60$lambda$54(m109animateColorAsStateeuL9pac), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelSmall(), composer4, 3072, 3072, 57330);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            obj = selectedRoute;
                            onSelect = function1;
                            i6 = i10;
                            i7 = i11;
                            composer2 = composer;
                            rowScope = rowScope2;
                            list = iterable;
                            i8 = i9;
                            $dirty = $dirty2;
                        }
                        m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i132 = (i12 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        int i142 = ((432 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer4, -1170730697, "C581@20892L380,591@21380L10,589@21293L248:OneUI.kt#78813j");
                        Modifier clip2 = ClipKt.clip(SizeKt.m782width3ABfNKs(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(30)), Dp.m7226constructorimpl(56)), RoundedCornerShapeKt.getCircleShape());
                        if (areEqual) {
                        }
                        Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(clip2, m4524getTransparent0d7_KjU, null, 2, null);
                        Alignment center22 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer4, m231backgroundbw27NRU$default2);
                        Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                        int i152 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer4.getApplier() instanceof Applier)) {
                        }
                        composer4.startReusableNode();
                        if (!composer4.getInserting()) {
                        }
                        m3828constructorimpl = Updater.m3828constructorimpl(composer4);
                        Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl.getInserting()) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                            int i1622 = (i152 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            int i1722 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, 1139500556, "C588@21260L10:OneUI.kt#78813j");
                            bottomTab.getIcon().invoke(Color.m4479boximpl(OneUIBottomBar$lambda$61$lambda$60$lambda$54(m109animateColorAsStateeuL9pac)), composer4, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            TextKt.m2816Text4IGK_g(bottomTab.getLabel(), (Modifier) null, OneUIBottomBar$lambda$61$lambda$60$lambda$54(m109animateColorAsStateeuL9pac), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelSmall(), composer4, 3072, 3072, 57330);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            obj = selectedRoute;
                            onSelect = function1;
                            i6 = i10;
                            i7 = i11;
                            composer2 = composer;
                            rowScope = rowScope2;
                            list = iterable;
                            i8 = i9;
                            $dirty = $dirty2;
                        }
                        m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
                        m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        int i16222 = (i152 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                        int i17222 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer4, 1139500556, "C588@21260L10:OneUI.kt#78813j");
                        bottomTab.getIcon().invoke(Color.m4479boximpl(OneUIBottomBar$lambda$61$lambda$60$lambda$54(m109animateColorAsStateeuL9pac)), composer4, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        TextKt.m2816Text4IGK_g(bottomTab.getLabel(), (Modifier) null, OneUIBottomBar$lambda$61$lambda$60$lambda$54(m109animateColorAsStateeuL9pac), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelSmall(), composer4, 3072, 3072, 57330);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        obj = selectedRoute;
                        onSelect = function1;
                        i6 = i10;
                        i7 = i11;
                        composer2 = composer;
                        rowScope = rowScope2;
                        list = iterable;
                        i8 = i9;
                        $dirty = $dirty2;
                    }
                    Composer composer5 = composer2;
                    composer5.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    $composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
            } else {
                i2 = 384;
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i52 = (i4 >> 6) & 14;
            Composer composer22 = $composer2;
            int i62 = 0;
            ComposerKt.sourceInformationMarkerStart(composer22, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i72 = ((i2 >> 6) & 112) | 6;
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer22, 802801382, "C:OneUI.kt#78813j");
            composer22.startReplaceGroup(-1775218344);
            ComposerKt.sourceInformation(composer22, "*569@20270L102,575@20587L39,577@20700L17,570@20389L1170");
            List<BottomTab> list2 = tabs;
            int i82 = 0;
            while (r49.hasNext()) {
            }
            Composer composer52 = composer22;
            composer52.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer52);
            ComposerKt.sourceInformationMarkerEnd(composer22);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier5;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return OneUIKt.OneUIBottomBar$lambda$62(tabs, selectedRoute, function1, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final long OneUIBottomBar$lambda$61$lambda$60$lambda$54(State<Color> state) {
        return ((Color) state.getValue()).m4499unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIBottomBar$lambda$61$lambda$60$lambda$57$lambda$56(Function1 $onSelect, BottomTab $tab) {
        $onSelect.invoke($tab);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneUITextField(final String value, final Function1<? super String, Unit> onValueChange, final String placeholder, Modifier modifier, boolean singleLine, ImageVector leadingIcon, Composer $composer, final int $changed, final int i) {
        Modifier.Companion modifier2;
        boolean z;
        ImageVector imageVector;
        Composer $composer2;
        final Modifier modifier3;
        final boolean singleLine2;
        final ImageVector leadingIcon2;
        boolean singleLine3;
        ImageVector leadingIcon3;
        Function0 function0;
        int i2;
        Composer composer;
        Composer composer2;
        ImageVector leadingIcon4;
        Composer composer3;
        int i3;
        Composer composer4;
        Composer m3828constructorimpl;
        Composer composer5;
        Composer composer6;
        Composer composer7;
        int $dirty;
        Modifier modifier4;
        Composer composer8;
        DefaultConstructorMarker defaultConstructorMarker;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Composer $composer3 = $composer.startRestartGroup(993038796);
        ComposerKt.sourceInformation($composer3, "C(OneUITextField)N(value,onValueChange,placeholder,modifier,singleLine,leadingIcon)610@21835L11,612@21924L1180:OneUI.kt#78813j");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(value) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(onValueChange) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(placeholder) ? 256 : 128;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty2 |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty2 |= 24576;
            z = singleLine;
        } else if (($changed & 24576) == 0) {
            z = singleLine;
            $dirty2 |= $composer3.changed(z) ? 16384 : 8192;
        } else {
            z = singleLine;
        }
        int i6 = i & 32;
        if (i6 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            imageVector = leadingIcon;
        } else if ((196608 & $changed) == 0) {
            imageVector = leadingIcon;
            $dirty2 |= $composer3.changed(imageVector) ? 131072 : 65536;
        } else {
            imageVector = leadingIcon;
        }
        if (!$composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            singleLine2 = z;
            leadingIcon2 = imageVector;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i5 == 0) {
                singleLine3 = z;
            } else {
                singleLine3 = true;
            }
            if (i6 == 0) {
                leadingIcon3 = imageVector;
            } else {
                leadingIcon3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(993038796, $dirty2, -1, "com.example.ui.oneui.OneUITextField (OneUI.kt:609)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            int $dirty3 = $dirty2;
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifier5 = modifier2;
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting() || !Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i9 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 213474769, "C613@21962L1065,639@23032L66:OneUI.kt#78813j");
            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(SizeKt.m765heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), singleLine3 ? Dp.m7226constructorimpl(48) : Dp.m7226constructorimpl(LocationRequestCompat.QUALITY_LOW_POWER), 0.0f, 2, null), Dp.m7226constructorimpl(4), Dp.m7226constructorimpl(12));
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = singleLine3 ? companion.getCenterVertically() : companion.getTop();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer3, m731paddingVpY3zN4);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor2;
                $composer3.createNode(function0);
            } else {
                function0 = constructor2;
                $composer3.useNode();
            }
            Composer m3828constructorimpl3 = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl3.getInserting()) {
                $composer2 = $composer3;
            } else {
                $composer2 = $composer3;
                if (Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = (i10 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i12 = ((0 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer3, -2059555216, "C624@22424L597:OneUI.kt#78813j");
                    if (leadingIcon3 == null) {
                        $composer3.startReplaceGroup(-2059549978);
                        ComposerKt.sourceInformation($composer3, "621@22279L84,622@22376L29");
                        composer = $composer3;
                        composer3 = $composer3;
                        i2 = 6;
                        i3 = -692256719;
                        IconKt.m2273Iconww6aTOc(leadingIcon3, (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), cs.getOnSurfaceVariant(), $composer3, (($dirty3 >> 15) & 14) | 432, 0);
                        leadingIcon4 = leadingIcon3;
                        composer2 = $composer3;
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer2, 6);
                    } else {
                        i2 = 6;
                        composer = $composer3;
                        composer2 = $composer3;
                        leadingIcon4 = leadingIcon3;
                        composer3 = $composer3;
                        i3 = -692256719;
                        composer2.startReplaceGroup(-2081642500);
                    }
                    composer2.endReplaceGroup();
                    Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment centerStart = !singleLine3 ? companion2.getCenterStart() : companion2.getTopStart();
                    composer4 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, weight$default);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i13 = ((((0 << 3) & 112) << 6) & 896) | i2;
                    ComposerKt.sourceInformationMarkerStart(composer4, i3, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer4.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (!composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl(composer4);
                    Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i14 = (i13 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        int i15 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer4, -186994973, "C633@22856L10,629@22695L316:OneUI.kt#78813j");
                        if (value.length() != 0) {
                            composer5 = composer4;
                            composer6 = composer2;
                            composer7 = composer4;
                            $dirty = $dirty3;
                            modifier4 = modifier5;
                            composer8 = $composer3;
                            defaultConstructorMarker = null;
                            composer5.startReplaceGroup(-209403882);
                        } else {
                            composer4.startReplaceGroup(-186984868);
                            ComposerKt.sourceInformation(composer4, "628@22636L10,628@22596L90");
                            $dirty = $dirty3;
                            modifier4 = modifier5;
                            defaultConstructorMarker = null;
                            composer8 = $composer3;
                            composer7 = composer4;
                            composer6 = composer2;
                            TextKt.m2816Text4IGK_g(placeholder, (Modifier) null, cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyLarge(), composer4, ($dirty3 >> 6) & 14, 0, 65530);
                            composer5 = composer4;
                        }
                        composer5.endReplaceGroup();
                        Composer composer9 = composer5;
                        boolean singleLine4 = singleLine3;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker), false, false, TextStyle.m6673copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodyLarge(), cs.getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (KeyboardOptions) null, (KeyboardActions) null, singleLine4, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(cs.getPrimary(), defaultConstructorMarker), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer9, ($dirty & 14) | 384 | ($dirty & 112) | (($dirty << 12) & 234881024), 0, 48856);
                        ComposerKt.sourceInformationMarkerEnd(composer9);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer7.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer8.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl((float) 0.5d)), cs.getOutline(), null, 2, null), $composer3, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        singleLine2 = singleLine4;
                        leadingIcon2 = leadingIcon4;
                        modifier3 = modifier4;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i142 = (i13 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i152 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, -186994973, "C633@22856L10,629@22695L316:OneUI.kt#78813j");
                    if (value.length() != 0) {
                    }
                    composer5.endReplaceGroup();
                    Composer composer92 = composer5;
                    boolean singleLine42 = singleLine3;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker), false, false, TextStyle.m6673copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodyLarge(), cs.getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (KeyboardOptions) null, (KeyboardActions) null, singleLine42, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(cs.getPrimary(), defaultConstructorMarker), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer92, ($dirty & 14) | 384 | ($dirty & 112) | (($dirty << 12) & 234881024), 0, 48856);
                    ComposerKt.sourceInformationMarkerEnd(composer92);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer7.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer8.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer8);
                    ComposerKt.sourceInformationMarkerEnd(composer8);
                    ComposerKt.sourceInformationMarkerEnd(composer8);
                    BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl((float) 0.5d)), cs.getOutline(), null, 2, null), $composer3, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    singleLine2 = singleLine42;
                    leadingIcon2 = leadingIcon4;
                    modifier3 = modifier4;
                }
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i112 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i122 = ((0 >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -2059555216, "C624@22424L597:OneUI.kt#78813j");
            if (leadingIcon3 == null) {
            }
            composer2.endReplaceGroup();
            Modifier weight$default2 = RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            if (!singleLine3) {
            }
            composer4 = composer2;
            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap32 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer4, weight$default2);
            Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            int i132 = ((((0 << 3) & 112) << 6) & 896) | i2;
            ComposerKt.sourceInformationMarkerStart(composer4, i3, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer4.getApplier() instanceof Applier)) {
            }
            composer4.startReusableNode();
            if (!composer4.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl(composer4);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                int i1422 = (i132 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                int i1522 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, -186994973, "C633@22856L10,629@22695L316:OneUI.kt#78813j");
                if (value.length() != 0) {
                }
                composer5.endReplaceGroup();
                Composer composer922 = composer5;
                boolean singleLine422 = singleLine3;
                BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker), false, false, TextStyle.m6673copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodyLarge(), cs.getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (KeyboardOptions) null, (KeyboardActions) null, singleLine422, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(cs.getPrimary(), defaultConstructorMarker), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer922, ($dirty & 14) | 384 | ($dirty & 112) | (($dirty << 12) & 234881024), 0, 48856);
                ComposerKt.sourceInformationMarkerEnd(composer922);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer7.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer8.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer8);
                ComposerKt.sourceInformationMarkerEnd(composer8);
                ComposerKt.sourceInformationMarkerEnd(composer8);
                BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl((float) 0.5d)), cs.getOutline(), null, 2, null), $composer3, 0);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                }
                singleLine2 = singleLine422;
                leadingIcon2 = leadingIcon4;
                modifier3 = modifier4;
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            int i14222 = (i132 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            int i15222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer4, -186994973, "C633@22856L10,629@22695L316:OneUI.kt#78813j");
            if (value.length() != 0) {
            }
            composer5.endReplaceGroup();
            Composer composer9222 = composer5;
            boolean singleLine4222 = singleLine3;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker), false, false, TextStyle.m6673copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodyLarge(), cs.getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (KeyboardOptions) null, (KeyboardActions) null, singleLine4222, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(cs.getPrimary(), defaultConstructorMarker), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer9222, ($dirty & 14) | 384 | ($dirty & 112) | (($dirty << 12) & 234881024), 0, 48856);
            ComposerKt.sourceInformationMarkerEnd(composer9222);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer7.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer8.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl((float) 0.5d)), cs.getOutline(), null, 2, null), $composer3, 0);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            singleLine2 = singleLine4222;
            leadingIcon2 = leadingIcon4;
            modifier3 = modifier4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIKt.OneUITextField$lambda$66(value, onValueChange, placeholder, modifier3, singleLine2, leadingIcon2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneUIDrawer(final boolean open, final String currentRoute, final List<OneUIDrawerItem> items, final Function1<? super String, Unit> onSelect, final Function0<Unit> onDismiss, Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed, final int i) {
        boolean z;
        Function2 footer;
        Function2 footer2;
        ColorScheme cs;
        Function0 function0;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(-1910653131);
        ComposerKt.sourceInformation($composer2, "C(OneUIDrawer)N(open,currentRoute,items,onSelect,onDismiss,footer)661@23528L11,662@23577L7,664@23732L38,665@23775L2324:OneUI.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            z = open;
            $dirty |= $composer2.changed(z) ? 4 : 2;
        } else {
            z = open;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(currentRoute) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(items) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onSelect) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            footer = function2;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            footer = function2;
            $dirty |= $composer2.changedInstance(footer) ? 131072 : 65536;
        } else {
            footer = function2;
        }
        if ($composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (i2 != 0) {
                footer2 = null;
            } else {
                footer2 = footer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1910653131, $dirty, -1, "com.example.ui.oneui.OneUIDrawer (OneUI.kt:660)");
            }
            ColorScheme cs2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final boolean isRtl = consume == LayoutDirection.Rtl;
            ComposerKt.sourceInformationMarkerStart($composer2, 2108358171, "CC(remember):OneUI.kt#9igjgp");
            boolean changed = $composer2.changed(isRtl);
            Object rememberedValue = $composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                cs = cs2;
                Object obj = new Function1() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(OneUIKt.OneUIDrawer$lambda$68$lambda$67(isRtl, ((Integer) obj2).intValue()));
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            } else {
                cs = cs2;
            }
            Function1 fromEdge = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int $dirty2 = $dirty;
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, fillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((6 << 3) & 112) << 6) & 896) | 6;
            final Function2 footer3 = footer2;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i4 = (i3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int i5 = ((6 >> 6) & 112) | 6;
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer2, -1701646528, "C670@23950L328,666@23813L465,686@24575L1518,681@24287L1806:OneUI.kt#78813j");
                AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(240, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(ComposerKt.invocationKey, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-796014957, true, new Function3() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return OneUIKt.OneUIDrawer$lambda$80$lambda$72(Function0.this, (AnimatedVisibilityScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer2, 54), $composer2, ($dirty2 & 14) | 200064, 18);
                final ColorScheme cs3 = cs;
                AnimatedVisibilityKt.AnimatedVisibility(open, boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(280, 0, null, 6, null), fromEdge).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(240, 0, null, 6, null), fromEdge).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(180, 0, null, 6, null), 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1336676662, true, new Function3() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return OneUIKt.OneUIDrawer$lambda$80$lambda$79(ColorScheme.this, items, footer3, currentRoute, onSelect, (AnimatedVisibilityScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer2, 54), $composer2, ($dirty2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                footer = footer3;
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i42 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int i52 = ((6 >> 6) & 112) | 6;
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -1701646528, "C670@23950L328,666@23813L465,686@24575L1518,681@24287L1806:OneUI.kt#78813j");
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(240, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(ComposerKt.invocationKey, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-796014957, true, new Function3() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return OneUIKt.OneUIDrawer$lambda$80$lambda$72(Function0.this, (AnimatedVisibilityScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty2 & 14) | 200064, 18);
            final ColorScheme cs32 = cs;
            AnimatedVisibilityKt.AnimatedVisibility(open, boxScope2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(280, 0, null, 6, null), fromEdge).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(240, 0, null, 6, null), fromEdge).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(180, 0, null, 6, null), 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1336676662, true, new Function3() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return OneUIKt.OneUIDrawer$lambda$80$lambda$79(ColorScheme.this, items, footer3, currentRoute, onSelect, (AnimatedVisibilityScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            footer = footer3;
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Function2 footer4 = footer;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OneUIKt.OneUIDrawer$lambda$81(open, currentRoute, items, onSelect, onDismiss, footer4, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int OneUIDrawer$lambda$68$lambda$67(boolean $isRtl, int full) {
        return $isRtl ? full : -full;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIDrawer$lambda$80$lambda$72(final Function0 $onDismiss, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        long m4487copywmQWz5c;
        Modifier m261clickableO2vRcR0;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C676@24146L39,678@24243L15,671@23960L308:OneUI.kt#78813j");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-796014957, $changed, -1, "com.example.ui.oneui.OneUIDrawer.<anonymous>.<anonymous> (OneUI.kt:671)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        m4487copywmQWz5c = Color.m4487copywmQWz5c(r9, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r9) : 0.45f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r9) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r9) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(Color.INSTANCE.m4515getBlack0d7_KjU()) : 0.0f);
        Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(fillMaxSize$default, m4487copywmQWz5c, null, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer, -466188678, "CC(remember):OneUI.kt#9igjgp");
        Object rememberedValue = $composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
            $composer.updateRememberedValue(MutableInteractionSource);
            rememberedValue = MutableInteractionSource;
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -466185598, "CC(remember):OneUI.kt#9igjgp");
        boolean changed = $composer.changed($onDismiss);
        Object rememberedValue2 = $composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OneUIKt.OneUIDrawer$lambda$80$lambda$72$lambda$71$lambda$70(Function0.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue2 = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        m261clickableO2vRcR0 = ClickableKt.m261clickableO2vRcR0(m231backgroundbw27NRU$default, mutableInteractionSource, null, (r14 & 4) != 0, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : null, (Function0) rememberedValue2);
        BoxKt.Box(m261clickableO2vRcR0, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIDrawer$lambda$80$lambda$72$lambda$71$lambda$70(Function0 $onDismiss) {
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x027f, code lost:
    
        if (r8 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OneUIDrawer$lambda$80$lambda$79(ColorScheme $cs, List $items, Function2 $footer, String $currentRoute, Function1 $onSelect, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Function0 function02;
        Composer composer2;
        Function0 function03;
        final Function1 function1 = $onSelect;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C692@24764L81,687@24585L1498:OneUI.kt#78813j");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1336676662, $changed, -1, "com.example.ui.oneui.OneUIDrawer.<anonymous>.<anonymous> (OneUI.kt:687)");
        }
        Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(GlassKt.m7674oneUIGlassT042LqI(SizeKt.fillMaxHeight$default(SizeKt.m782width3ABfNKs(PaddingKt.m734paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7226constructorimpl(12), Dp.m7226constructorimpl(28), 0.0f, Dp.m7226constructorimpl(28), 4, null), Dp.m7226constructorimpl(AnimationConstants.DefaultDurationMillis)), 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(28)), $cs.getSurfaceVariant(), 0.92f, 30, $composer, 27654, 0), 0.0f, Dp.m7226constructorimpl(18), 1, null);
        int i = 0;
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default);
        Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
        int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
        int i3 = 6;
        String str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
        Composer m3828constructorimpl = Updater.m3828constructorimpl($composer);
        Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3828constructorimpl.getInserting()) {
            composer = $composer;
        } else {
            composer = $composer;
            if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i4 = (i2 >> 6) & 14;
                Composer composer3 = composer;
                int i5 = 0;
                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int i6 = ((0 >> 6) & 112) | 6;
                ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer3, -1962051077, "C:OneUI.kt#78813j");
                composer3.startReplaceGroup(-1864407350);
                ComposerKt.sourceInformation(composer3, "*703@25364L24,697@25021L790");
                DrawerHeader(composer3);
                List list = $items;
                int i7 = 0;
                int i8 = 0;
                for (Object obj : list) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Iterable iterable = list;
                    final OneUIDrawerItem oneUIDrawerItem = (OneUIDrawerItem) obj;
                    int i10 = i7;
                    String str2 = str;
                    if (4 == i8) {
                        m7682OneUIDividerkHDZbjc(16.0f, composer3, 0, 0);
                        i5 = i5;
                        i6 = i6;
                    }
                    str = str2;
                    int i11 = i5;
                    int i12 = i6;
                    int i13 = i;
                    Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m731paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(2)), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16))), Intrinsics.areEqual(oneUIDrawerItem.getRoute(), $currentRoute) ? Color.m4487copywmQWz5c(r48, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r48) : 0.12f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r48) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r48) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl($cs.getOnSurface()) : 0.0f) : Color.INSTANCE.m4524getTransparent0d7_KjU(), null, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1619067423, "CC(remember):OneUI.kt#9igjgp");
                    boolean changed = composer3.changed(function1) | composer3.changed(oneUIDrawerItem);
                    Object rememberedValue = composer3.rememberedValue();
                    if (changed) {
                    }
                    Object obj2 = new Function0() { // from class: com.example.ui.oneui.OneUIKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OneUIKt.OneUIDrawer$lambda$80$lambda$79$lambda$78$lambda$76$lambda$74$lambda$73(Function1.this, oneUIDrawerItem);
                        }
                    };
                    composer3.updateRememberedValue(obj2);
                    rememberedValue = obj2;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(ClickableKt.m264clickableXHw0xAI$default(m231backgroundbw27NRU$default, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7226constructorimpl(14), Dp.m7226constructorimpl(13));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m731paddingVpY3zN4);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i14 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        function03 = constructor2;
                        composer3.createNode(function03);
                    } else {
                        function03 = constructor2;
                        composer3.useNode();
                    }
                    Composer m3828constructorimpl2 = Updater.m3828constructorimpl(composer3);
                    Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i15 = (i14 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i16 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1987307523, "C707@25568L72,708@25661L29,709@25750L10,709@25711L82:OneUI.kt#78813j");
                        IconKt.m2273Iconww6aTOc(oneUIDrawerItem.getIcon(), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), oneUIDrawerItem.getTint(), composer3, 432, 0);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer3, i3);
                        TextKt.m2816Text4IGK_g(oneUIDrawerItem.getLabel(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyLarge(), composer3, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        function1 = $onSelect;
                        i8 = i9;
                        list = iterable;
                        i7 = i10;
                        i5 = i11;
                        i6 = i12;
                        i = i13;
                        i3 = 6;
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i152 = (i14 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i162 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1987307523, "C707@25568L72,708@25661L29,709@25750L10,709@25711L82:OneUI.kt#78813j");
                    IconKt.m2273Iconww6aTOc(oneUIDrawerItem.getIcon(), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), oneUIDrawerItem.getTint(), composer3, 432, 0);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer3, i3);
                    TextKt.m2816Text4IGK_g(oneUIDrawerItem.getLabel(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyLarge(), composer3, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    function1 = $onSelect;
                    i8 = i9;
                    list = iterable;
                    i7 = i10;
                    i5 = i11;
                    i6 = i12;
                    i = i13;
                    i3 = 6;
                }
                composer3.endReplaceGroup();
                if ($footer == null) {
                    composer3.startReplaceGroup(-1961142933);
                    ComposerKt.sourceInformation(composer3, "713@25876L27,714@25920L139");
                    SpacerKt.Spacer(ColumnScope.CC.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                    Modifier m732paddingVpY3zN4$default2 = PaddingKt.m732paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(8), 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m732paddingVpY3zN4$default2);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i17 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        function02 = constructor3;
                        composer3.createNode(function02);
                    } else {
                        function02 = constructor3;
                        composer3.useNode();
                    }
                    Composer m3828constructorimpl3 = Updater.m3828constructorimpl(composer3);
                    Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl3.getInserting()) {
                        composer2 = composer3;
                    } else {
                        composer2 = composer3;
                        if (Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i18 = (i17 >> 6) & 14;
                            Composer composer4 = composer2;
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            int i19 = ((54 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -1230356678, "C715@26033L8:OneUI.kt#78813j");
                            $footer.invoke(composer4, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i182 = (i17 >> 6) & 14;
                    Composer composer42 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer42, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i192 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer42, -1230356678, "C715@26033L8:OneUI.kt#78813j");
                    $footer.invoke(composer42, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                } else {
                    composer3.startReplaceGroup(-1986801726);
                }
                composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
        m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        int i42 = (i2 >> 6) & 14;
        Composer composer32 = composer;
        int i52 = 0;
        ComposerKt.sourceInformationMarkerStart(composer32, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        int i62 = ((0 >> 6) & 112) | 6;
        ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer32, -1962051077, "C:OneUI.kt#78813j");
        composer32.startReplaceGroup(-1864407350);
        ComposerKt.sourceInformation(composer32, "*703@25364L24,697@25021L790");
        DrawerHeader(composer32);
        List list2 = $items;
        int i72 = 0;
        int i82 = 0;
        while (r36.hasNext()) {
        }
        composer32.endReplaceGroup();
        if ($footer == null) {
        }
        composer32.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer32);
        ComposerKt.sourceInformationMarkerEnd(composer32);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIDrawer$lambda$80$lambda$79$lambda$78$lambda$76$lambda$74$lambda$73(Function1 $onSelect, OneUIDrawerItem $item) {
        $onSelect.invoke($item.getRoute());
        return Unit.INSTANCE;
    }
}
