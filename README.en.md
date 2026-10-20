<div align="center">
  <img src="docs/icon.png" width="120" height="120" alt="App icon">
  <h1>Wathkkir (وذكّر)</h1>
  <p><b>An app that reminds you of prayer times and dhikr through your day and your night.</b></p>
  <p>Accurate prayer times for your location, per-prayer adhan and iqama alerts, a Qibla compass, a Hijri date converter, and an azkar library with statistics that track your daily commitment — in a modern One UI-inspired design.</p>

  <p>
    <a href="https://github.com/MohamedElnaggar00/Wathkkir/actions/workflows/build-apk.yml"><img src="https://github.com/MohamedElnaggar00/Wathkkir/actions/workflows/build-apk.yml/badge.svg" alt="Build status"></a>
    <img src="https://img.shields.io/badge/version-3.3.0-blue" alt="Version 3.3.0">
    <img src="https://img.shields.io/badge/platform-Android-green?logo=android" alt="Android">
    <img src="https://img.shields.io/badge/language-Kotlin-purple?logo=kotlin" alt="Kotlin">
    <img src="https://img.shields.io/badge/UI%20languages-11-orange" alt="11 languages">
  </p>

  <p><b><a href="README.md">🇪🇬 النسخة العربية</a></b></p>
</div>

---

## 📑 Contents

- [Overview](#-overview)
- [Key features](#-key-features)
- [What's new in 3.3.0](#-whats-new-in-330)
- [Screenshots](#-screenshots)
- [Wear OS app](#-wear-os-app-in-development)
- [Supported languages](#-supported-languages)
- [Tech stack](#-tech-stack)
- [Build from source](#-build-from-source)
- [Download](#-download)

---

## 🌙 Overview

Wathkkir is an open-source Android app that brings the everyday tools a Muslim needs into one place: astronomically accurate prayer times, fully customizable per-prayer alerts, morning and evening azkar with Hisn al-Muslim, a digital tasbeeh counter, and a Qibla compass — all with full right-to-left support and an interface translated into eleven languages.

## ✨ Key features

| Area | Features |
|---|---|
| 🕌 **Prayer times** | Automatic location via GPS or manual country/city selection, eight certified calculation methods (Egyptian General Authority, Umm al-Qura, Muslim World League, ISNA, University of Karachi, Kuwait, Qatar, Dubai), Asr juristic choice (Shafi'i or Hanafi), high-latitude rules, and manual per-prayer minute adjustments plus a Hijri date offset. |
| 🔔 **Prayer alerts** | An independent bell for each of the six prayer rows (including Shuruq), delivered as notifications, one-minute timing resolution (at adhan time or any number of minutes before, typed or dragged), **iqama reminder notifications** with per-prayer delays (Fajr 25 min, Dhuhr/Asr/Isha 20 min, Maghrib 10 min), **automatic Do-Not-Disturb** between adhan and iqama, and shared settings for notification sound and vibration. |
| 🧭 **Qibla compass** | An elegant dial that follows the system light/dark theme: a smoothly rotating tick ring with degree labels every 30°, a large heading readout with the direction name, a Kaaba marker at the Qibla bearing that turns green with a haptic tick within 3°, magnetic-declination correction to true north based on your location, and a calibration prompt when sensor accuracy drops. |
| 🕰️ **Optional times** | Optional prayer-screen rows: Imsak (10 minutes before Fajr), Duha, Midnight, and Qiyam (start of the last third of the night) — enabled from Settings as needed. |
| 📅 **Date converter** | Instant two-way conversion between Hijri and Gregorian dates on the Umm al-Qura calendar, with the weekday shown. |
| 📿 **Azkar & Hisn al-Muslim** | The complete Hisn al-Muslim library in chapters, custom azkar organized with colored tags, favorites, timed reminders, and preloaded prophetic duas. |
| 📊 **Statistics** | Daily commitment tracking: azkar read today, this week, and this month, plus a day-streak counter. |
| 🔢 **Tasbeeh** | A digital counter that keeps your progress even after the app is closed — find it in the side menu. |
| 🗓️ **Hijri calendar** | A dedicated tab with a One UI-style month grid showing both Hijri and Gregorian dates for every day, colored markers for Islamic occasions (Ramadan, the two Eids, Arafah, Ashura, the White Days, and more), a month events list, and an upcoming-events view with an optional reminder bell for each occasion. Dates use the Umm al-Qura calculation with an adjustable ±2-day offset in Settings. |
| 📱 **Lock-screen widgets** | Fully customizable widgets (colors, background, text) showing prayer times on the lock screen. |
| 🎨 **Personalization** | Eleven UI languages with full RTL and LTR support, light/dark/system themes, and multiple Arabic fonts (Cairo, Naskh, Amiri, Ruqaa). |

<details>
<summary><b>🔔 More about the alert system</b></summary>

- Alert notifications are scheduled with exact alarms and automatically rescheduled after the device reboots.
- Each prayer has its own settings sheet via a long-press on its bell: alert mode, timing, iqama reminder, and automatic DND.
- If the Do-Not-Disturb policy permission is missing, the app routes you to the system permission screen instead of silently pretending the feature works.

</details>

## 🆕 What's new in 3.3.0

- **Fajr full-screen alarm** with its own settings page: tone or audio file, volume, vibration, ring before and/or after the adhan, ring duration, snooze length, test button.
- **One UI style menus and dialogs** everywhere, with Apply and Cancel on pickers. They now follow the app font size.
- **Font size**: a 9-step slider in Settings > Appearance.
- **Hisn Al-Muslim**: search, "done reading" button, notes, counter colours, default favorites, add to my adhkar.
- **Per-prayer tone and vibration**, plus touch feedback only on controls that change state, following the haptics setting.
- **Widgets**: frosted backgrounds, live previews in the picker on Android 15+, One UI progress widget.
- New onboarding, new icon, and the name Wathkkir (وذكّر) in every language.
- **Fixes**: prayer times round like printed timetables, adhan and iqama notifications close after 5 minutes, Arabic fonts render correctly, exact alarms so the adhan is not late.

3.3.0 updates in place over 3.2.3 (same signing key).

## 📸 Screenshots

<p align="center"><i>Real captures from an Android 35 emulator running 3.3.0.</i></p>

<div align="center">
  <table>
    <tr><td align="center"><img src="docs/screenshots/04-prayer.png" width="200" alt="Prayer screen"><br><sub>Prayer screen</sub></td><td align="center"><img src="docs/screenshots/05-fajr-alarm.png" width="200" alt="Fajr alarm"><br><sub>Fajr alarm</sub></td><td align="center"><img src="docs/screenshots/06-hisn.png" width="200" alt="Hisn Al-Muslim"><br><sub>Hisn Al-Muslim</sub></td></tr>
    <tr><td align="center"><img src="docs/screenshots/07-reminders.png" width="200" alt="Reminders"><br><sub>Reminders</sub></td><td align="center"><img src="docs/screenshots/08-calendar.png" width="200" alt="Calendar"><br><sub>Calendar</sub></td><td align="center"><img src="docs/screenshots/09-qibla.png" width="200" alt="Qibla"><br><sub>Qibla</sub></td></tr>
    <tr><td align="center"><img src="docs/screenshots/10-menu.png" width="200" alt="One UI style menus"><br><sub>One UI style menus</sub></td><td align="center"><img src="docs/screenshots/11-dialog.png" width="200" alt="Dialogs"><br><sub>Dialogs</sub></td><td align="center"><img src="docs/screenshots/01-language.png" width="200" alt="Onboarding: language"><br><sub>Onboarding: language</sub></td></tr>
    <tr><td align="center"><img src="docs/screenshots/02-calculation.png" width="200" alt="Calculation method"><br><sub>Calculation method</sub></td><td align="center"><img src="docs/screenshots/03-alerts.png" width="200" alt="Enable alerts"><br><sub>Enable alerts</sub></td></tr>
  </table>
</div>

### 📱 Home-screen widgets

<p align="center"><i>Actual widget renders as drawn on the home screen, in light and dark.</i></p>

<div align="center">
  <table>
    <tr>
      <td align="center"><img src="Screenshot/widget-renders/files/widget_light_Hero.png" width="220" alt="Hero widget"><br><sub>Hero widget</sub></td>
      <td align="center"><img src="Screenshot/widget-renders/files/widget_light_PrayerBar.png" width="220" alt="Prayer bar"><br><sub>Prayer bar</sub></td>
      <td align="center"><img src="Screenshot/widget-renders/files/widget_light_Schedule.png" width="220" alt="Schedule"><br><sub>Schedule</sub></td>
    </tr>
    <tr>
      <td align="center"><img src="Screenshot/widget-renders/files/widget_dark_NextPrayer.png" width="220" alt="Next prayer"><br><sub>Next prayer</sub></td>
      <td align="center"><img src="Screenshot/widget-renders/files/widget_dark_Pill.png" width="220" alt="Pill widget"><br><sub>Pill widget</sub></td>
      <td align="center"><img src="Screenshot/widget-renders/files/widget_dark_Clock.png" width="220" alt="Clock widget"><br><sub>Clock widget</sub></td>
    </tr>
  </table>
  <p><sub>The system widget picker shows a live theme-aware preview (Android 12+); older versions show a static image.</sub></p>
</div>

## ⌚ Wear OS app (in development)

The watch app is not finished. It ships as a separate APK for testing only (Wear OS 3+). What exists today: prayer times, qibla, a next-prayer tile and complication, a 24-hour option, and a settings page in the phone app with sync. It has not been tested on a real watch, and it will be renamed and its bugs fixed in a later release.

## 🌍 Supported languages

العربية · English · Français · Deutsch · Español · Italiano · Türkçe · اردو · Indonesia · Русский · Português

## 🛠️ Tech stack

- **Language**: Kotlin
- **UI**: Jetpack Compose with Material 3 and a custom One UI-inspired design system
- **Database**: Room for local azkar, tags, and statistics
- **Prayer calculations**: astronomical calculation library with the Umm al-Qura Hijri calendar
- **Architecture**: MVVM
- **Alerts**: exact alarms with broadcast receivers for post-boot rescheduling

## 🔨 Build from source

```bash
git clone https://github.com/MohamedElnaggar00/Wathkkir.git
cd Wathkkir
./gradlew assembleDebug
```

The APK is produced in `app/build/outputs/apk/debug/`. Building requires JDK 17 and the Android SDK.

## 📥 Download

- **[Wathkkir 3.3.0 (latest)](https://github.com/MohamedElnaggar00/Wathkkir/releases/tag/v3.3.0)**: phone app `Wathkkir-3.3.0.apk` and the test watch app `Wathkkir-Wear-3.3.0.apk`, with sha256 values for checking.
- All versions: [Releases page](https://github.com/MohamedElnaggar00/Wathkkir/releases).

---

<div align="center">
  <br>
  <b><a href="https://instinct.com">brought to you by Instinct</a></b>
  <p>Mohamed Elnaggar</p>
  <p><i>Please keep us in your prayers.</i></p>
</div>
