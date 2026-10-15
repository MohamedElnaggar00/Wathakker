package com.example.fajr.ui;

import android.app.Application;
import android.net.Uri;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.example.fajr.alarm.FajrAlarmScheduler;
import com.example.fajr.calculation.CalculationMethod;
import com.example.fajr.calculation.PrayerTimesCalculator;
import com.example.fajr.data.CityItem;
import com.example.fajr.data.FajrPreferences;
import com.example.fajr.location.LocationManagerHelper;
import com.example.fajr.sound.RingtoneHelper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: FajrViewModel.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020+J\u0006\u0010.\u001a\u00020\u0016J\b\u0010/\u001a\u00020\u0016H\u0002J\u000e\u00100\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%J\u0006\u00101\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00062"}, d2 = {"Lcom/example/fajr/ui/FajrViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "prefs", "Lcom/example/fajr/data/FajrPreferences;", "scheduler", "Lcom/example/fajr/alarm/FajrAlarmScheduler;", "locationHelper", "Lcom/example/fajr/location/LocationManagerHelper;", "ringtoneHelper", "Lcom/example/fajr/sound/RingtoneHelper;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/fajr/ui/FajrSettingsState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadSettings", "", "toggleAlarm", "enabled", "", "setUseCurrentLocation", "useGps", "updateLocationFromGps", "setCity", "city", "Lcom/example/fajr/data/CityItem;", "setCalculationMethod", "method", "Lcom/example/fajr/calculation/CalculationMethod;", "setRingtone", "uri", "Landroid/net/Uri;", "title", "", "toggleVibration", "setMaxDuration", "minutes", "", "setAlarmVolume", "volume", "refreshFajrTimeManually", "refreshFajrTimeInternal", "playRingtonePreview", "stopRingtonePreview", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FajrViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    final MutableStateFlow<FajrSettingsState> _uiState;
    final LocationManagerHelper locationHelper;
    final FajrPreferences prefs;
    final RingtoneHelper ringtoneHelper;
    final FajrAlarmScheduler scheduler;
    final StateFlow<FajrSettingsState> uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FajrViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.prefs = new FajrPreferences(application);
        this.scheduler = new FajrAlarmScheduler(application);
        this.locationHelper = new LocationManagerHelper(application);
        this.ringtoneHelper = new RingtoneHelper(application);
        this._uiState = StateFlowKt.MutableStateFlow(new FajrSettingsState(false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, false, false, false, 32767, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        loadSettings();
    }

    public final StateFlow<FajrSettingsState> getUiState() {
        return this.uiState;
    }

    public final void loadSettings() {
        CalculationMethod method = CalculationMethod.INSTANCE.fromId(this.prefs.getCalculationMethodId());
        Uri validUri = this.ringtoneHelper.getValidRingtoneUri(this.prefs);
        String ringtoneTitle = this.ringtoneHelper.getRingtoneTitle(validUri);
        this._uiState.setValue(new FajrSettingsState(this.prefs.isAlarmEnabled(), this.prefs.getUseCurrentLocation(), this.prefs.getCityName(), this.prefs.getLatitude(), this.prefs.getLongitude(), null, 0L, method, ringtoneTitle, this.prefs.isVibrationEnabled(), this.prefs.getMaxDurationMinutes(), this.prefs.getAlarmVolume(), false, this.locationHelper.isGpsEnabled(), this.locationHelper.hasLocationPermission(), 4192, null));
        refreshFajrTimeInternal();
    }

    public final void toggleAlarm(boolean enabled) {
        this.prefs.setAlarmEnabled(enabled);
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), enabled, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, false, false, false, 32766, null));
        FajrAlarmScheduler fajrAlarmScheduler = this.scheduler;
        if (enabled) {
            fajrAlarmScheduler.scheduleNextFajrAlarm();
        } else {
            fajrAlarmScheduler.cancelAllAlarms();
        }
        refreshFajrTimeInternal();
    }

    public final void setUseCurrentLocation(boolean useGps) {
        this.prefs.setUseCurrentLocation(useGps);
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), false, useGps, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, false, false, false, 32765, null));
        if (useGps) {
            updateLocationFromGps();
        } else {
            refreshFajrTimeInternal();
        }
    }

    public final void updateLocationFromGps() {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), kotlinx.coroutines.CoroutineStart.DEFAULT, new FajrViewModel$updateLocationFromGps$1(this, null));
    }

    public final void setCity(CityItem city) {
        Intrinsics.checkNotNullParameter(city, "city");
        this.prefs.setUseCurrentLocation(false);
        this.prefs.setLatitude(city.getLatitude());
        this.prefs.setLongitude(city.getLongitude());
        String title = city.getCityNameAr() + "، " + city.getCountryNameAr();
        this.prefs.setCityName(title);
        this.prefs.setCountryName(city.getCountryNameAr());
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), false, false, title, city.getLatitude(), city.getLongitude(), null, 0L, null, null, false, 0, 0, false, false, false, 32737, null));
        refreshFajrTimeInternal();
        if (this.prefs.isAlarmEnabled()) {
            this.scheduler.scheduleNextFajrAlarm();
        }
    }

    public final void setCalculationMethod(CalculationMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.prefs.setCalculationMethodId(method.getId());
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, method, null, false, 0, 0, false, false, false, 32639, null));
        refreshFajrTimeInternal();
        if (this.prefs.isAlarmEnabled()) {
            this.scheduler.scheduleNextFajrAlarm();
        }
    }

    public final void setRingtone(Uri uri, String title) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(title, "title");
        FajrPreferences fajrPreferences = this.prefs;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        fajrPreferences.setRingtoneUri(uri2);
        this.prefs.setRingtoneTitle(title);
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, title, false, 0, 0, false, false, false, 32511, null));
    }

    public final void toggleVibration(boolean enabled) {
        this.prefs.setVibrationEnabled(enabled);
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, null, enabled, 0, 0, false, false, false, 32255, null));
    }

    public final void setMaxDuration(int minutes) {
        this.prefs.setMaxDurationMinutes(minutes);
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, minutes, 0, false, false, false, 31743, null));
    }

    public final void setAlarmVolume(int volume) {
        this.prefs.setAlarmVolume(volume);
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, volume, false, false, false, 30719, null));
    }

    public final void refreshFajrTimeManually() {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), kotlinx.coroutines.CoroutineStart.DEFAULT, new FajrViewModel$refreshFajrTimeManually$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshFajrTimeInternal() {
        long now = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        CalculationMethod method = this._uiState.getValue().getCalculationMethod();
        PrayerTimesCalculator prayerTimesCalculator = PrayerTimesCalculator.INSTANCE;
        Intrinsics.checkNotNull(calendar);
        long fajrTime = prayerTimesCalculator.calculateFajrTime(calendar, this._uiState.getValue().getLatitude(), this._uiState.getValue().getLongitude(), method);
        boolean isTomorrow = false;
        if (fajrTime <= now) {
            calendar.add(6, 1);
            fajrTime = PrayerTimesCalculator.INSTANCE.calculateFajrTime(calendar, this._uiState.getValue().getLatitude(), this._uiState.getValue().getLongitude(), method);
            isTomorrow = true;
        }
        SimpleDateFormat timeSdf = new SimpleDateFormat("hh:mm a", new Locale("ar"));
        String formattedTime = timeSdf.format(new Date(fajrTime));
        String prefix = isTomorrow ? "غداً في" : "اليوم في";
        String fullFormatted = prefix + " " + formattedTime;
        this._uiState.setValue(FajrSettingsState.copy$default(this._uiState.getValue(), false, false, null, 0.0d, 0.0d, fullFormatted, fajrTime, null, null, false, 0, 0, false, false, false, 32671, null));
    }

    public final void playRingtonePreview(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.ringtoneHelper.playPreview(uri, this._uiState.getValue().getAlarmVolume() / 100.0f);
    }

    public final void stopRingtonePreview() {
        this.ringtoneHelper.stopPreview();
    }
}
