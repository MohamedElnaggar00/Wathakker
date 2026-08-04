cat << 'INNER' >> app/src/main/java/com/example/fajr/data/FajrPreferences.kt

    var useCurrentLocation: Boolean
        get() = prefs.getBoolean("use_current_location", true)
        set(value) = prefs.edit().putBoolean("use_current_location", value).apply()

    var countryName: String
        get() = prefs.getString("country_name", "مصر") ?: "مصر"
        set(value) = prefs.edit().putString("country_name", value).apply()
}
INNER
sed -i '48d' app/src/main/java/com/example/fajr/data/FajrPreferences.kt
