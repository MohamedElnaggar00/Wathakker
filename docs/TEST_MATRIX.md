# Wathakker 3.1.0 — Stability Test Matrix

Goal: 3.1.0 ships as a STABLE release. Every row needs a result (PASS/FAIL/BLOCKED) plus evidence
(screenshot/recording/log) before the pre-release is dispatched. Anything that cannot be tested on
the emulator is marked DEVICE-REQUIRED and called out honestly in the release report.

Legend: AUTO = automated (unit/instrumented/scripted), EMU = manual on emulator, DEV = needs the
user's Samsung device.

## 1. Unit tests (AUTO, JVM)
| # | Area | Cases |
|---|------|-------|
| 1.1 | PrayerTimesCalculator | All 8 methods × known cities × known dates vs reference tables (e.g. Cairo 2026-03-01, Egyptian method); DST transition days; extreme latitudes (Tromso, Reykjavik) with each high-lat rule; Asr Shafi'i vs Hanafi delta = expected shadow-factor difference |
| 1.2 | PrayerAdjustments | Offsets applied per prayer; clamp ±30; high-lat rule only when angle impossible; Hanafi factor changes only Asr; defaults (all-zero) produce identical times to bare calculateAll |
| 1.3 | HijriDate | Known Gregorian↔Hijri pairs (1 Ramadan 1447 etc.); month names ar/en; offset ±1/±2 shifts day correctly including month boundary |
| 1.4 | Alarm scheduling | Next-Fajr picks tomorrow after today's Fajr passed; reschedule on timezone change; snooze chain; max-duration stop |
| 1.5 | Iqama logic | Offsets per prayer (Fajr 25, Dhuhr/Asr/Isha 20, Maghrib 10); no iqama for Friday Dhuhr and Shuruq; flip to next prayer after iqama passes |
| 1.6 | L10n | Every S key present in all 11 tables (no fallback gaps); RTL flags ar/ur only; plural helpers |

## 2. Instrumented UI tests (AUTO, emulator)
| # | Screen | Cases |
|---|--------|-------|
| 2.1 | Home/Dashboard | Renders, next-prayer card, countdown ticks, progress bar advances |
| 2.2 | Prayer Times | 6 rows + times non-empty; swipe day forward/back; Hijri+Gregorian headers; optional rows appear when toggled (Imsak/Duha/Midnight/Qiyam) |
| 2.3 | Azkar / Hisn | List renders, search, dhikr open, favorite toggle, tasbeeh increments |
| 2.4 | Location & calculation | GPS/manual radio; city dialog opens; method picker; Asr picker; high-lat picker; steppers change values and persist after process restart |
| 2.5 | Settings | Every row opens; language picker switches live; theme picker; font picker |
| 2.6 | Bell/alarm UI | Bell icons on all 6 rows incl. Shuruq; tap toggles; long-press opens per-prayer settings; shared sound/vibration/snooze/duration; notification-vs-alarm chooser |
| 2.7 | Qibla | Screen opens, dial renders, degree readout, accuracy/calibration prompt states |
| 2.8 | Date converter | Hijri→Gregorian and back round-trip |

## 3. Localization sweep (EMU, scripted screenshots)
| # | Case |
|---|------|
| 3.1 | All screens × 11 languages: no clipped/ellipsized labels, no untranslated literals (except azkar content = Arabic by design) |
| 3.2 | RTL: ar + ur layouts mirror (header, rows, chevrons, bottom bar, drawer, widgets strip) |
| 3.3 | LIVE language switch: transition/animation direction flips without restart (RECORDINGS: ar→en, en→ar, en→ur, ur→fr) |
| 3.4 | AM/PM markers localized on Prayer screen, Fajr screen, widgets |
| 3.5 | City names display in app language (dual-name storage); search leads with current language |

## 4. Theme & display (EMU)
| # | Case |
|---|------|
| 4.1 | Light/dark/system on every screen; widgets legible in both |
| 4.2 | Font choices (system/Cairo/Naskh/Amiri/Ruqaa) apply; Latin text never uses Arabic-only fonts |
| 4.3 | Rotation on every tab + dialogs (no crash, state kept) |
| 4.4 | Small/large font scale (system accessibility) — no overlap at 1.3x |

## 5. Alarm & notification paths (EMU + DEV)
| # | Case |
|---|------|
| 5.1 | Fajr alarm fires at exact time (emulator clock), tone plays, vibration, volume, max-duration auto-stop, snooze chain |
| 5.2 | Per-prayer bells: notification at adhan with lead time; approaching notification; alarm-mode full-screen for alarm choice |
| 5.3 | Iqama reminder fires at iqama time |
| 5.4 | Auto-DND: engages at adhan, releases at iqama; permission denied → graceful row state |
| 5.5 | Notification permission denied: no crash, clear in-app state |
| 5.6 | Boot: alarms + widget ticks reschedule (emulator cold boot test) |
| 5.7 | Timezone change: times + alarms recalc (set timezone via adb, verify) |
| 5.8 | Process death: kill app, alarms still fire; reopen restores state |
| 5.9 | Doze/battery: exact-alarm permission flow; DEVICE-REQUIRED for Samsung battery whitelist behavior |
| 5.10 | Real-device alarm reliability (flip-fold, One UI): DEVICE-REQUIRED |

## 6. Widgets (EMU + DEV)
| # | Case |
|---|------|
| 6.1 | All 10 home widgets: add, render, resize variants, remove, re-add |
| 6.2 | All 8 lock widgets: DEV (lock-screen widgets need One UI 8 device) |
| 6.3 | Widget content follows language change live; countdown ticks each minute |
| 6.4 | Widget colors per instance; config activity |
| 6.5 | Samsung face widget (ServiceBox): DEVICE-REQUIRED (cannot run on emulator) |
| 6.6 | Widgets reflect adjustments (offsets, Hanafi, high-lat) after Location screen change |

## 7. Upgrade & migration (EMU)
| # | Case |
|---|------|
| 7.1 | Install 3.0.7-signed APK, set non-default settings (city, method, language, alarm, widget colors), upgrade to 3.1.0: everything preserved; city_name legacy key migrates to dual ar/en |
| 7.2 | Fajr alarm settings survive and map into the new bell model |
| 7.3 | Widgets placed before upgrade re-render correctly after upgrade |

## 8. Stress & robustness (AUTO/EMU)
| # | Case |
|---|------|
| 8.1 | Monkey 10k events: zero FATAL crashes attributable to the app |
| 8.2 | Rapid tab switching + language switching loop: no ANR |
| 8.3 | Low memory (am send-low-memory / background limit): no state loss on return |
| 8.4 | gfxinfo jank on scroll (home, azkar list, Hisn list): NOTE — CI emulator GPU histogram saturates (4950ms cap); treat as environment noise, real numbers DEVICE-REQUIRED |

## 9. Predictive back & navigation (EMU)
| # | Case |
|---|------|
| 9.1 | Back from each screen: single step, no double-pop, no stacking (Settings singleTop) |
| 9.2 | Predictive back preview animates (enableOnBackInvokedCallback) on all root screens |
| 9.3 | Deep states survive rotation + process death (selected day on Prayer screen, open dhikr) |

## 10. New 3.1.0 features (EMU unless noted)
| # | Case |
|---|------|
| 10.1 | Location & calculation: every control recalculates instantly (alarm rescheduled + widgets refreshed — verify via widget re-render + logcat) |
| 10.2 | Hanafi Asr: Asr time shifts vs Shafi'i by expected amount for test city |
| 10.3 | High-lat rules: set manual city Tromso; each rule produces sane times (no 22:30 fallback garbage) |
| 10.4 | Offsets: +5 Dhuhr shows everywhere (screen + widgets) |
| 10.5 | Hijri offset: +1 shifts displayed Hijri date on screen + widgets |
| 10.6 | Qibla: compass rotates with device, degree readout matches rotation-vector, calibration prompt on low accuracy, saved-city fallback without GPS; DEV for sensor validation |
| 10.7 | Iqama reminder + auto-DND + optional rows + converter: per §5/§2 |

## Coverage honesty rules
- gfxinfo/performance numbers from the CI emulator are environment-saturated; report as such.
- Anything DEVICE-REQUIRED is listed in the release report as untested-here, tested-by-user.
- No row ships as PASS without stored evidence under emulator-evidence/verify310/.
