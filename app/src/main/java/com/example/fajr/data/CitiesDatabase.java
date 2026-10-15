package com.example.fajr.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CitiesDatabase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/example/fajr/data/CitiesDatabase;", "", "<init>", "()V", "cities", "", "Lcom/example/fajr/data/CityItem;", "getCities", "()Ljava/util/List;", "searchCities", "query", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CitiesDatabase {
    public static final CitiesDatabase INSTANCE = new CitiesDatabase();
    private static final List<CityItem> cities = java.util.Arrays.asList(new CityItem[]{new CityItem("مكة المكرمة", "Makkah", "المملكة العربية السعودية", "Saudi Arabia", 21.4225d, 39.8262d), new CityItem("المدينة المنورة", "Madinah", "المملكة العربية السعودية", "Saudi Arabia", 24.4672d, 39.6112d), new CityItem("الرياض", "Riyadh", "المملكة العربية السعودية", "Saudi Arabia", 24.7136d, 46.6753d), new CityItem("جدة", "Jeddah", "المملكة العربية السعودية", "Saudi Arabia", 21.5433d, 39.1728d), new CityItem("الدمام", "Dammam", "المملكة العربية السعودية", "Saudi Arabia", 26.4207d, 50.0888d), new CityItem("الخبر", "Khobar", "المملكة العربية السعودية", "Saudi Arabia", 26.2172d, 50.1971d), new CityItem("أبها", "Abha", "المملكة العربية السعودية", "Saudi Arabia", 18.2164d, 42.5053d), new CityItem("تبوك", "Tabuk", "المملكة العربية السعودية", "Saudi Arabia", 28.3835d, 36.5662d), new CityItem("الطائف", "Taif", "المملكة العربية السعودية", "Saudi Arabia", 21.2854d, 40.4244d), new CityItem("بريدة", "Buraidah", "المملكة العربية السعودية", "Saudi Arabia", 26.326d, 43.975d), new CityItem("القاهرة", "Cairo", "مصر", "Egypt", 30.0444d, 31.2357d), new CityItem("الإسكندرية", "Alexandria", "مصر", "Egypt", 31.2001d, 29.9187d), new CityItem("الجيزة", "Giza", "مصر", "Egypt", 30.0131d, 31.2089d), new CityItem("المنصورة", "Mansoura", "مصر", "Egypt", 31.0409d, 31.3785d), new CityItem("طنطا", "Tanta", "مصر", "Egypt", 30.7865d, 31.0004d), new CityItem("بورسعيد", "Port Said", "مصر", "Egypt", 31.2653d, 32.3019d), new CityItem("السويس", "Suez", "مصر", "Egypt", 29.9668d, 32.5498d), new CityItem("الأقصر", "Luxor", "مصر", "Egypt", 25.6872d, 32.6396d), new CityItem("أسوان", "Aswan", "مصر", "Egypt", 24.0889d, 32.8998d), new CityItem("أسيوط", "Asyut", "مصر", "Egypt", 27.1783d, 31.1859d), new CityItem("الزقازيق", "Zagazig", "مصر", "Egypt", 30.5877d, 31.502d), new CityItem("أبوظبي", "Abu Dhabi", "الإمارات العربية المتحدة", "UAE", 24.4539d, 54.3773d), new CityItem("دبي", "Dubai", "الإمارات العربية المتحدة", "UAE", 25.2048d, 55.2708d), new CityItem("الشارقة", "Sharjah", "الإمارات العربية المتحدة", "UAE", 25.3463d, 55.4209d), new CityItem("عجمان", "Ajman", "الإمارات العربية المتحدة", "UAE", 25.4052d, 55.5136d), new CityItem("رأس الخيمة", "Ras Al Khaimah", "الإمارات العربية المتحدة", "UAE", 25.7895d, 55.9432d), new CityItem("الكويت", "Kuwait City", "الكويت", "Kuwait", 29.3759d, 47.9774d), new CityItem("حولي", "Hawalli", "الكويت", "Kuwait", 29.3328d, 48.0283d), new CityItem("الأحمدي", "Ahmadi", "الكويت", "Kuwait", 29.0772d, 48.0839d), new CityItem("الدوحة", "Doha", "قطر", "Qatar", 25.2854d, 51.531d), new CityItem("الريان", "Al Rayyan", "قطر", "Qatar", 25.2919d, 51.4244d), new CityItem("عمّان", "Amman", "الأردن", "Jordan", 31.9454d, 35.9284d), new CityItem("الزرقاء", "Zarqa", "الأردن", "Jordan", 32.0608d, 36.0942d), new CityItem("إربد", "Irbid", "الأردن", "Jordan", 32.5568d, 35.8469d), new CityItem("العقبة", "Aqaba", "الأردن", "Jordan", 29.5321d, 35.0063d), new CityItem("القدس الشريف", "Jerusalem", "فلسطين", "Palestine", 31.7683d, 35.2137d), new CityItem("غزة", "Gaza", "فلسطين", "Palestine", 31.5017d, 34.4668d), new CityItem("رام الله", "Ramallah", "فلسطين", "Palestine", 31.9038d, 35.2034d), new CityItem("نابلس", "Nablus", "فلسطين", "Palestine", 32.2211d, 35.2544d), new CityItem("بغداد", "Baghdad", "العراق", "Iraq", 33.3152d, 44.3661d), new CityItem("أربيل", "Erbil", "العراق", "Iraq", 36.1901d, 44.0091d), new CityItem("البصرة", "Basra", "العراق", "Iraq", 30.5081d, 47.7835d), new CityItem("الموصل", "Mosul", "العراق", "Iraq", 36.34d, 43.13d), new CityItem("الجزائر العاصمة", "Algiers", "الجزائر", "Algeria", 36.7538d, 3.0588d), new CityItem("وهران", "Oran", "الجزائر", "Algeria", 35.6971d, -0.6308d), new CityItem("قسنطينة", "Constantine", "الجزائر", "Algeria", 36.365d, 6.6147d), new CityItem("الرباط", "Rabat", "المغرب", "Morocco", 34.0209d, -6.8416d), new CityItem("الدار البيضاء", "Casablanca", "المغرب", "Morocco", 33.5731d, -7.5898d), new CityItem("مراكش", "Marrakesh", "المغرب", "Morocco", 31.6295d, -7.9811d), new CityItem("فاس", "Fes", "المغرب", "Morocco", 34.0333d, -5.0d), new CityItem("طنجة", "Tangier", "المغرب", "Morocco", 35.7595d, -5.834d), new CityItem("تونس", "Tunis", "تونس", "Tunisia", 36.8065d, 10.1815d), new CityItem("صفاقس", "Sfax", "تونس", "Tunisia", 34.7406d, 10.7603d), new CityItem("المنامة", "Manama", "البحرين", "Bahrain", 26.2285d, 50.586d), new CityItem("مسقط", "Muscat", "عمان", "Oman", 23.588d, 58.3829d), new CityItem("صلالة", "Salalah", "عمان", "Oman", 17.0151d, 54.0924d), new CityItem("الخرطوم", "Khartoum", "السودان", "Sudan", 15.5007d, 32.5599d), new CityItem("طرابلس", "Tripoli", "ليبيا", "Libya", 32.8872d, 13.1913d), new CityItem("بنغازي", "Benghazi", "ليبيا", "Libya", 32.1167d, 20.0667d), new CityItem("إسطنبول", "Istanbul", "تركيا", "Turkey", 41.0082d, 28.9784d), new CityItem("أنقرة", "Ankara", "تركيا", "Turkey", 39.9334d, 32.8597d), new CityItem("لندن", "London", "المملكة المتحدة", "UK", 51.5074d, -0.1278d), new CityItem("واشنطن", "Washington D.C.", "الولايات المتحدة", "USA", 38.9072d, -77.0369d), new CityItem("نيويورك", "New York", "الولايات المتحدة", "USA", 40.7128d, -74.006d), new CityItem("باريس", "Paris", "فرنسا", "France", 48.8566d, 2.3522d), new CityItem("برلين", "Berlin", "ألمانيا", "Germany", 52.52d, 13.405d)});
    public static final int $stable = 8;

    private CitiesDatabase() {
    }

    public final List<CityItem> getCities() {
        return cities;
    }

    public final List<CityItem> searchCities(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (StringsKt.isBlank(query)) {
            return cities;
        }
        String q = StringsKt.trim((CharSequence) query).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(q, "toLowerCase(...)");
        Iterable iterable = cities;
        Collection arrayList = new ArrayList();
        for (Object obj : iterable) {
            CityItem cityItem = (CityItem) obj;
            boolean z = true;
            if (!StringsKt.contains((CharSequence) cityItem.getCityNameAr(), (CharSequence) q, true) && !StringsKt.contains((CharSequence) cityItem.getCityNameEn(), (CharSequence) q, true) && !StringsKt.contains((CharSequence) cityItem.getCountryNameAr(), (CharSequence) q, true) && !StringsKt.contains((CharSequence) cityItem.getCountryNameEn(), (CharSequence) q, true)) {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }
}
