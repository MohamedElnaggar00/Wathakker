# Wathakker 3.2.1

- Prayer countdowns now switch to iqama after adhan, then return to the next prayer at iqama.
- Fixed the home widgets and both lock-screen HH:MM countdown widgets missing the iqama phase.
- Applied the same phase to the in-app next-prayer card, including its label, countdown and progress bar.
- Kept the existing iqama delays: Fajr 25 minutes, Dhuhr/Asr/Isha 20, Maghrib 10. Sunrise and Friday Dhuhr have no iqama countdown.
- Shared phase logic handles Isha across midnight and requests widget refreshes at adhan/iqama boundaries. Android may defer background refreshes when exact-alarm access is unavailable.
