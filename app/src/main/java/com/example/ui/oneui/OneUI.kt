package com.example.ui.oneui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.Brush
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import dev.chrisbanes.haze.hazeSource
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S

object OneUIDimens {
    val ScreenPadding: Dp = 16.dp
    val CardRadius: Dp = 26.dp
    val HeaderCollapseDistance: Dp = 140.dp
    val BarHeight: Dp = 56.dp
}

@Composable
fun OneUIScreen(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    onBack: (() -> Unit)? = null,
    onMenu: (() -> Unit)? = null,
    actions: (@Composable RowScope.() -> Unit)? = null,
    listState: LazyListState = rememberLazyListState(),
    bottomPadding: Dp = 120.dp,
    content: LazyListScope.() -> Unit
) {
    val density = LocalDensity.current
    val statusTop = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()
    val expandedPx = with(density) { OneUIDimens.HeaderCollapseDistance.toPx() }
    val fraction by remember {
        derivedStateOf {
            if (listState.firstVisibleItemIndex > 0) 1f
            else (listState.firstVisibleItemScrollOffset / expandedPx).coerceIn(0f, 1f)
        }
    }
    val barAlpha by animateFloatAsState(fraction, tween(180), label = "barAlpha")
    val hazeState = LocalHazeState.current

    Box(modifier = modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
        LazyColumn(
            modifier = Modifier.fillMaxSize().then(if (hazeState != null) Modifier.hazeSource(hazeState) else Modifier),
            state = listState,
            contentPadding = PaddingValues(
                start = OneUIDimens.ScreenPadding,
                end = OneUIDimens.ScreenPadding,
                bottom = bottomPadding
            ),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = statusTop + 4.dp, bottom = 16.dp)
                        .alpha(1f - minOf(fraction * 3f, 1f))
                ) {
                    Spacer(modifier = Modifier.height(52.dp))
                    Column {
                        Text(
                            title,
                            color = MaterialTheme.colorScheme.onBackground,
                            fontSize = 36.sp,
                            lineHeight = 44.sp,
                            style = MaterialTheme.typography.headlineLarge
                        )
                        if (subtitle != null) {
                            Text(
                                subtitle,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
            content()
        }
        // Scroll-aware scrim behind the floating header: keeps scrolled content from
        // colliding with the status bar / showing raw between the glass pills.
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(statusTop + 92.dp)
                .graphicsLayer { alpha = barAlpha }
                .background(
                    Brush.verticalGradient(
                        0f to MaterialTheme.colorScheme.background,
                        0.78f to MaterialTheme.colorScheme.background,
                        1f to MaterialTheme.colorScheme.background.copy(alpha = 0f)
                    )
                )
        )
        // Top bar: menu or back on one side, settings and extra actions on the other.
        // The row itself is always visible; only the tile behind each group and the small title fade in on scroll.
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = statusTop + 10.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = HeaderTools.scrollTile(Modifier.weight(1f, fill = false), barAlpha)
                    .height(52.dp)
                    .padding(start = 6.dp, end = 18.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val leading = onBack ?: onMenu
                if (leading != null) {
                    IconButton(onClick = leading) {
                        if (onMenu != null) {
                            Icon(Icons.Outlined.Menu, contentDescription = L10n.t(S.Menu), tint = MaterialTheme.colorScheme.onBackground)
                        } else {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, tint = MaterialTheme.colorScheme.onSurface)
                        }
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                }
                Text(
                    title,
                    modifier = Modifier.alpha(barAlpha),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 18.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            // On the Settings screen the gear is suppressed, so the trailing group would be an
            // empty tile (the faint ghost pill). Skip the group entirely in that case.
            val showSettingsButton = !HeaderTools.isOnSettings()
            if (showSettingsButton || actions != null) {
                Row(
                    modifier = HeaderTools.scrollTile(Modifier, barAlpha).height(52.dp).padding(horizontal = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (showSettingsButton) HeaderTools.SettingsButton()
                    actions?.invoke(this)
                }
            }
        }
    }
}

@Composable
private fun SettingsGlyph() {
    Icon(Icons.Outlined.Settings, contentDescription = null, tint = MaterialTheme.colorScheme.onSurface)
}

@Composable
fun OneUIIconAction(icon: ImageVector, contentDescription: String?, onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(icon, contentDescription = contentDescription, tint = MaterialTheme.colorScheme.onBackground)
    }
}

@Composable
fun SectionLabel(text: String, modifier: Modifier = Modifier, accent: Boolean = false) {
    Text(
        text,
        modifier = modifier.padding(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 0.dp),
        color = if (accent) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
        style = MaterialTheme.typography.titleSmall
    )
}

@Composable
fun OneUICard(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    padding: PaddingValues = PaddingValues(0.dp),
    color: Color = MaterialTheme.colorScheme.surface,
    content: @Composable androidx.compose.foundation.layout.ColumnScope.() -> Unit
) {
    val shape = RoundedCornerShape(OneUIDimens.CardRadius)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape)
            .background(color)
            .then(if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier)
            .padding(padding),
        content = content
    )
}

@Composable
fun OneUIDivider(inset: Dp = 16.dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = inset)
            .height(0.5.dp)
            .background(MaterialTheme.colorScheme.outline)
    )
}

@Composable
fun OneUIIconBadge(
    icon: ImageVector,
    tint: Color = MaterialTheme.colorScheme.primary,
    size: Dp = 40.dp
) {
    Box(
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.surfaceVariant),
        contentAlignment = Alignment.Center
    ) {
        Icon(icon, contentDescription = null, tint = tint, modifier = Modifier.size(size * 0.5f))
    }
}

@Composable
fun OneUIRow(
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    leading: (@Composable () -> Unit)? = null,
    trailing: (@Composable () -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    titleColor: Color = Color.Unspecified
) {
    val resolvedTitleColor = if (titleColor == Color.Unspecified) MaterialTheme.colorScheme.onSurface else titleColor
    Row(
        modifier = modifier
            .fillMaxWidth()
            .then(if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier)
            .heightIn(min = 60.dp)
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (leading != null) {
            leading()
            Spacer(modifier = Modifier.width(14.dp))
        }
        Column(modifier = Modifier.weight(1f)) {
            Text(title, color = resolvedTitleColor, style = MaterialTheme.typography.bodyLarge)
            if (summary != null) {
                Text(
                    summary,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    // Natural font leading: tall Arabic fonts (Naskh/Amiri) overflow the tight
                    // 13/18 metric and paint over the divider below the row.
                    style = MaterialTheme.typography.bodySmall.copy(lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified)
                )
            }
        }
        if (trailing != null) {
            Spacer(modifier = Modifier.width(12.dp))
            trailing()
        }
    }
}

@Composable
fun OneUIButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    filled: Boolean = true,
    icon: ImageVector? = null,
    destructive: Boolean = false
) {
    val cs = MaterialTheme.colorScheme
    val accent = if (destructive) cs.error else cs.primary
    val container = if (filled) accent else accent.copy(alpha = 0.14f)
    val content = if (filled) Color.White else accent
    Row(
        modifier = modifier
            .heightIn(min = 44.dp)
            .clip(CircleShape)
            .background(container)
            .clickable(onClick = onClick)
            .padding(horizontal = 20.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        if (icon != null) {
            Icon(icon, contentDescription = null, tint = content, modifier = Modifier.size(18.dp))
            Spacer(modifier = Modifier.width(8.dp))
        }
        Text(text, color = content, style = MaterialTheme.typography.labelLarge)
    }
}

@Composable
fun OneUISearchField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp)
            .clip(CircleShape)
            .background(cs.surface)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Outlined.Search, contentDescription = null, tint = cs.onSurfaceVariant, modifier = Modifier.size(22.dp))
        Spacer(modifier = Modifier.width(10.dp))
        Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
            if (value.isEmpty()) {
                Text(placeholder, color = cs.onSurfaceVariant, style = MaterialTheme.typography.bodyMedium)
            }
            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                singleLine = true,
                textStyle = MaterialTheme.typography.bodyMedium.copy(color = cs.onSurface),
                cursorBrush = SolidColor(cs.primary),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun OneUIChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    dot: Color? = null
) {
    val cs = MaterialTheme.colorScheme
    val bg by animateColorAsState(if (selected) cs.primary.copy(alpha = 0.16f) else cs.surface, label = "chipBg")
    Row(
        modifier = modifier
            .height(38.dp)
            .clip(CircleShape)
            .background(bg)
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (dot != null) {
            Box(modifier = Modifier.size(9.dp).clip(CircleShape).background(dot))
            Spacer(modifier = Modifier.width(7.dp))
        }
        Text(
            label,
            color = if (selected) cs.primary else cs.onSurface,
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun OneUISwitch(checked: Boolean, onCheckedChange: ((Boolean) -> Unit)?, modifier: Modifier = Modifier) {
    val cs = MaterialTheme.colorScheme
    val dark = cs.background == Color.Black
    val trackOff = if (dark) Color(0xFF39393C) else Color(0xFFB7B7B7)
    val track by animateColorAsState(if (checked) cs.primary else trackOff, label = "swTrack")
    val thumb by animateDpAsState(if (checked) 22.dp else 0.dp, spring(0.75f, 1500f), label = "swThumb")
    Box(
        modifier = modifier
            .width(52.dp)
            .height(30.dp)
            .clip(CircleShape)
            .background(track)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                enabled = onCheckedChange != null
            ) { onCheckedChange?.invoke(!checked) }
            .padding(3.dp)
    ) {
        Box(
            modifier = Modifier
                .offset(x = thumb)
                .size(24.dp)
                .clip(CircleShape)
                .background(Color.White)
        )
    }
}

@Composable
fun OneUIEmptyState(text: String, icon: ImageVector, modifier: Modifier = Modifier) {
    val cs = MaterialTheme.colorScheme
    Column(
        modifier = modifier.fillMaxWidth().padding(vertical = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(icon, contentDescription = null, tint = cs.onSurfaceVariant.copy(alpha = 0.5f), modifier = Modifier.size(56.dp))
        Spacer(modifier = Modifier.height(12.dp))
        Text(text, color = cs.onSurfaceVariant, textAlign = TextAlign.Center, style = MaterialTheme.typography.bodyLarge)
    }
}

fun parseColorSafe(hex: String, fallback: Color = Color(0xFF008080)): Color =
    try {
        Color(android.graphics.Color.parseColor(hex))
    } catch (e: Exception) {
        fallback
    }

fun azkarCount(n: Int): String = L10n.azkarCount(n)

fun readsCount(n: Int): String = L10n.readsCount(n)

@Composable
fun OneUIMenu(expanded: Boolean, onDismiss: () -> Unit, content: @Composable ColumnScope.() -> Unit) {
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismiss,
        modifier = Modifier.widthIn(min = 200.dp),
        shape = RoundedCornerShape(22.dp),
        containerColor = MaterialTheme.colorScheme.surface,
        content = content
    )
}

@Composable
fun OneUIMenuItem(text: String, onClick: () -> Unit, icon: ImageVector? = null, destructive: Boolean = false) {
    val color = if (destructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurface
    DropdownMenuItem(
        text = { Text(text, color = color, style = MaterialTheme.typography.bodyLarge) },
        onClick = onClick,
        leadingIcon = if (icon != null) {
            { Icon(icon, contentDescription = null, tint = color, modifier = Modifier.size(22.dp)) }
        } else null
    )
}

@Composable
fun OneUIProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    trackColor: Color = MaterialTheme.colorScheme.surfaceVariant
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(10.dp)
            .clip(CircleShape)
            .background(trackColor)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .fillMaxHeight()
                .fillMaxWidth(progress.coerceIn(0f, 1f))
                .clip(CircleShape)
                .background(color)
        )
    }
}

class BottomTab(
    val route: String,
    val label: String,
    val icon: @Composable (Color) -> Unit
)

@Composable
fun OneUIBottomBar(
    tabs: List<BottomTab>,
    selectedRoute: String,
    onSelect: (BottomTab) -> Unit,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val navInset = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(bottom = navInset + 12.dp)
            .oneUIGlass(RoundedCornerShape(32.dp), cs.surfaceContainerHigh, 0.85f, 28)
            .height(64.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        tabs.forEach { tab ->
            val selected = tab.route == selectedRoute
            val tint by animateColorAsState(
                if (selected) cs.onSurface else cs.onSurface.copy(alpha = 0.78f),
                label = "tabTint"
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) { onSelect(tab) },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .height(30.dp)
                        .width(56.dp)
                        .clip(CircleShape)
                        .background(if (selected) cs.surfaceVariant else Color.Transparent),
                    contentAlignment = Alignment.Center
                ) {
                    tab.icon(tint)
                }
                Text(
                    text = tab.label,
                    color = tint,
                    fontSize = 11.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 2.dp),
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
    }
}

@Composable
fun OneUITextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier,
    singleLine: Boolean = true,
    leadingIcon: ImageVector? = null
) {
    val cs = MaterialTheme.colorScheme
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = if (singleLine) 48.dp else 120.dp)
                .padding(horizontal = 4.dp, vertical = 12.dp),
            verticalAlignment = if (singleLine) Alignment.CenterVertically else Alignment.Top
        ) {
            if (leadingIcon != null) {
                Icon(leadingIcon, contentDescription = null, tint = cs.onSurfaceVariant, modifier = Modifier.size(20.dp))
                Spacer(modifier = Modifier.width(16.dp))
            }
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = if (singleLine) Alignment.CenterStart else Alignment.TopStart
            ) {
                if (value.isEmpty()) {
                    Text(placeholder, color = cs.onSurfaceVariant, style = MaterialTheme.typography.bodyLarge)
                }
                BasicTextField(
                    value = value,
                    onValueChange = onValueChange,
                    singleLine = singleLine,
                    textStyle = MaterialTheme.typography.bodyLarge.copy(color = cs.onSurface),
                    cursorBrush = SolidColor(cs.primary),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
        Box(modifier = Modifier.fillMaxWidth().height(0.5.dp).background(cs.outline))
    }
}

class OneUIDrawerItem(
    val route: String,
    val label: String,
    val icon: ImageVector,
    val tint: Color
)

@Composable
fun DrawerHeader() {
    Text(
        "وَذكّر",
        color = Color(4293783021L),
        modifier = Modifier.padding(horizontal = 48.dp),
        style = MaterialTheme.typography.headlineMedium
    )
    Spacer(modifier = Modifier.height(32.dp))
}

@Composable
fun OneUIDrawer(
    open: Boolean,
    currentRoute: String,
    items: List<OneUIDrawerItem>,
    onSelect: (String) -> Unit,
    onDismiss: () -> Unit,
    footer: (@Composable () -> Unit)? = null
) {
    val cs = MaterialTheme.colorScheme
    Box(modifier = Modifier.fillMaxSize()) {
        AnimatedVisibility(visible = open, enter = fadeIn(tween(220)), exit = fadeOut(tween(220))) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.45f))
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null,
                        onClick = onDismiss
                    )
            )
        }
        val drawerRtlState = rememberUpdatedState(LocalLayoutDirection.current == LayoutDirection.Rtl)
        AnimatedVisibility(
            visible = open,
            modifier = Modifier.align(Alignment.CenterStart),
            enter = slideInHorizontally(tween(280)) { if (drawerRtlState.value) it else -it } + fadeIn(tween(220)),
            exit = slideOutHorizontally(tween(280)) { if (drawerRtlState.value) it else -it } + fadeOut(tween(220))
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 12.dp, top = 28.dp, bottom = 28.dp)
                    .width(300.dp)
                    .fillMaxHeight()
                    .oneUIGlass(RoundedCornerShape(28.dp), cs.surfaceVariant, 0.92f, 30)
                    .padding(vertical = 18.dp)
            ) {
                DrawerHeader()
                items.forEach { item ->
                    if (item.route == "settings") OneUIDivider(16.dp)
                    val selected = item.route == currentRoute
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 2.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(if (selected) cs.primary.copy(alpha = 0.12f) else Color.Transparent)
                            .clickable { onSelect(item.route) }
                            .padding(horizontal = 14.dp, vertical = 13.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(item.icon, contentDescription = null, tint = item.tint, modifier = Modifier.size(22.dp))
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(item.label, color = cs.onSurface, style = MaterialTheme.typography.bodyLarge)
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                if (footer != null) {
                    Box(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                        contentAlignment = Alignment.Center
                    ) { footer() }
                }
            }
        }
    }
}

