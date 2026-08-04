sed -i '/onMarkAsRead: (() -> Unit)? = null/d' app/src/main/java/com/example/ui/screens/HomeScreen.kt
sed -i '/onMarkAsRead = { viewModel.markAsRead(dhikr) }/d' app/src/main/java/com/example/ui/screens/HomeScreen.kt
sed -i '440,455d' app/src/main/java/com/example/ui/screens/HomeScreen.kt
