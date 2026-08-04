sed -i 's/text = "إدارة التصنيفات (Tags)",/text = "إدارة التصنيفات",/g' app/src/main/java/com/example/ui/screens/TagsScreen.kt
sed -i 's/fontSize = 22.sp,/fontSize = 20.sp,/g' app/src/main/java/com/example/ui/screens/TagsScreen.kt
sed -i 's/Text("إضافة تصنيف")/Text("إضافة تصنيف", maxLines = 1)/g' app/src/main/java/com/example/ui/screens/TagsScreen.kt
