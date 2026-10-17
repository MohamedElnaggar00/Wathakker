package com.example.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.oneui.OneUIDialog
import com.example.ui.oneui.OneUIDivider
import com.example.ThemeSettings
import com.example.ui.theme.FontChoice
import com.example.ui.theme.fontFamilyFor
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S

@Composable
fun FontPickerDialog(selected: FontChoice, onSelect: (FontChoice) -> Unit, onDismiss: () -> Unit) {
    OneUIDialog(title = L10n.t(S.Font), onDismiss = onDismiss, dismissText = L10n.t(S.Close)) {
        FontChoice.entries.forEachIndexed { index, choice ->
            if (index > 0) OneUIDivider(4.dp)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .clickable {
                        onSelect(choice)
                        onDismiss()
                    }
                    .padding(horizontal = 8.dp, vertical = 13.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    choice.titleAr,
                    modifier = Modifier.weight(1f),
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 19.sp,
                    style = MaterialTheme.typography.bodyLarge.copy(fontFamily = fontFamilyFor(choice))
                )
                if (choice == selected) {
                    Icon(Icons.Filled.CheckCircle, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
                }
            }
        }
    }
}


@Composable
fun ThemePickerDialog(selected: String, onSelect: (String) -> Unit, onDismiss: () -> Unit) {
    val options = listOf(
        ThemeSettings.AUTO to L10n.t(S.SystemAuto),
        ThemeSettings.LIGHT to L10n.t(S.Light),
        ThemeSettings.DARK to L10n.t(S.Dark)
    )
    OneUIDialog(title = L10n.t(S.Appearance), onDismiss = onDismiss, dismissText = L10n.t(S.Close)) {
        options.forEachIndexed { index, (key, label) ->
            if (index > 0) OneUIDivider(4.dp)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .clickable {
                        onSelect(key)
                        onDismiss()
                    }
                    .padding(horizontal = 8.dp, vertical = 13.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    label,
                    modifier = Modifier.weight(1f),
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 19.sp,
                    style = MaterialTheme.typography.bodyLarge
                )
                if (key == selected) {
                    Icon(Icons.Filled.CheckCircle, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
                }
            }
        }
    }
}
