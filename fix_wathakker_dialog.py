with open("app/src/main/java/com/example/ui/components/WathakkerComponents.kt", "r") as f:
    content = f.read()

old_dialog = """@Composable
fun WathakkerDialog(
    onDismissRequest: () -> Unit,
    title: String? = null,
    confirmButtonText: String? = null,
    onConfirm: (() -> Unit)? = null,
    dismissButtonText: String? = null,
    onDismiss: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismissRequest,
        title = title?.let { { Text(it, style = MaterialTheme.typography.titleLarge) } },
        text = {
            content()
        },
        confirmButton = {
            if (confirmButtonText != null && onConfirm != null) {
                WathakkerButton(
                    text = confirmButtonText,
                    onClick = onConfirm,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        dismissButton = dismissButtonText?.let {
            {
                WathakkerButton(
                    text = it,
                    onClick = onDismiss ?: onDismissRequest,
                    isSecondary = true,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        containerColor = MaterialTheme.colorScheme.surface,
        shape = RoundedCornerShape(24.dp)
    )
}"""

new_dialog = """@Composable
fun WathakkerDialog(
    onDismissRequest: () -> Unit,
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dismissButton: @Composable (() -> Unit)? = null,
    title: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null
) {
    AlertDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = confirmButton,
        modifier = modifier,
        dismissButton = dismissButton,
        title = title,
        text = text,
        containerColor = MaterialTheme.colorScheme.surface,
        shape = RoundedCornerShape(24.dp)
    )
}"""

content = content.replace(old_dialog, new_dialog)

with open("app/src/main/java/com/example/ui/components/WathakkerComponents.kt", "w") as f:
    f.write(content)

