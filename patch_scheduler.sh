sed -i 's/action = ACTION_FAJR_ALARM/action = if (requestCode == SNOOZE_REQUEST_CODE) "ACTION_SNOOZE_TRIGGER" else ACTION_FAJR_ALARM/g' app/src/main/java/com/example/fajr/alarm/FajrAlarmScheduler.kt
