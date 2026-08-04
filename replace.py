with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'r') as f:
    text = f.read()

bad = """@Composable
fun StatPeriodCard(
    modifier: Modifier = Modifier,
    title: String,
    count: Int,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    accentColor: Color
) {
    PrimaryCard {
        modifier = modifier
    ) {
            horizontalAlignment = Alignment.Start
        ) {"""

good = """@Composable
fun StatPeriodCard(
    modifier: Modifier = Modifier,
    title: String,
    count: Int,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    accentColor: Color
) {
    PrimaryCard(
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {"""

if bad in text:
    print("Found exact bad snippet!")
    text = text.replace(bad, good)
else:
    # Try alternate format
    bad2 = """@Composable
fun StatPeriodCard(
    modifier: Modifier = Modifier,
    title: String,
    count: Int,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    accentColor: Color
) {
    PrimaryCard(
        modifier = modifier
    ) {
            horizontalAlignment = Alignment.Start
        ) {"""
    if bad2 in text:
        print("Found alternate bad snippet!")
        text = text.replace(bad2, good)

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'w') as f:
    f.write(text)
