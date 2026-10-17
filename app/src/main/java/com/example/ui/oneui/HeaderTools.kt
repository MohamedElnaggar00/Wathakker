package com.example.ui.oneui

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.runtime.getValue
import java.lang.ref.WeakReference

/** Small helpers shared by the screen headers: tile backgrounds and the settings shortcut. */
object HeaderTools {
    private var nav: WeakReference<Any>? = null
    private val tileColor = Color(0xFF242426)

    @JvmStatic
    fun setNav(obj: Any?) {
        nav = WeakReference(obj)
    }

    @JvmStatic
    fun settings() {
        val nc = nav?.get() as? NavController ?: return
        if (nc.currentBackStackEntry?.destination?.route != "settings") nc.navigate("settings")
    }

    @androidx.compose.runtime.Composable
    fun SettingsButton() {
        val nc = nav?.get() as? NavController
        if (nc != null) {
            val entry by nc.currentBackStackEntryAsState()
            if (entry?.destination?.route == "settings") return
        }
        androidx.compose.material3.IconButton(onClick = { settings() }) {
            androidx.compose.material3.Icon(
                Icons.Outlined.Settings,
                contentDescription = null,
                tint = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
            )
        }
    }

    @JvmStatic
    fun tile(modifier: Modifier): Modifier {
        val shape = RoundedCornerShape(26.dp)
        return modifier.clip(shape).background(tileColor, shape)
    }

    @JvmStatic
    fun scrollTile(modifier: Modifier, alpha: Float): Modifier =
        modifier.clip(RoundedCornerShape(26.dp)).background(tileColor.copy(alpha = alpha))
}

