package com.example.fajr.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fajr.calculation.CalculationMethod
import com.example.ui.i18n.L10n
import com.example.ui.oneui.OneUIDialog
import com.example.ui.i18n.S

@Composable
fun CalculationMethodDialog(
    currentMethod: CalculationMethod,
    onDismiss: () -> Unit,
    onMethodSelected: (CalculationMethod) -> Unit
) {
    val cs = MaterialTheme.colorScheme
    OneUIDialog(title = L10n.t(S.PickCalcMethod), onDismiss = onDismiss) {
        CalculationMethod.values().forEach { method ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .clickable {
                        onMethodSelected(method)
                        onDismiss()
                    }
                    .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(method.title(L10n.lang.code), color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                if (method == currentMethod) {
                    Icon(Icons.Outlined.Check, null, tint = cs.primary)
                }
            }
        }
    }
}
