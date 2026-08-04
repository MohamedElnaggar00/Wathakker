sed -i 's/autoStopRunnable = Runnable { stopAndFinish() }/autoStopRunnable = Runnable { handleAutoStop() }/g' app/src/main/java/com/example/fajr/ui/FajrAlarmActivity.kt
cat << 'INNER' >> app/src/main/java/com/example/fajr/ui/FajrAlarmActivity.kt
// placeholder for extra logic if needed
INNER
