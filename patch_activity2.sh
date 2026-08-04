sed -i '/private fun stopAndFinish()/i \
    private fun handleAutoStop() {\
        val prefs = FajrPreferences(this)\
        if (prefs.snoozeCount < 3) {\
            prefs.snoozeCount += 1\
            FajrAlarmScheduler(this).scheduleSnooze(prefs.maxDurationMinutes)\
        }\
        stopAndFinish()\
    }' app/src/main/java/com/example/fajr/ui/FajrAlarmActivity.kt
