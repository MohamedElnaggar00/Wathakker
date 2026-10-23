package com.example.fajr.ui;

import android.location.Location;
import com.example.ui.i18n.L10n;
import java.util.Locale;
import com.example.fajr.data.FajrPreferences;
import com.example.fajr.location.LocationManagerHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FajrViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.fajr.ui.FajrViewModel$updateLocationFromGps$1", f = "FajrViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class FajrViewModel$updateLocationFromGps$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FajrViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FajrViewModel$updateLocationFromGps$1(FajrViewModel fajrViewModel, Continuation<? super FajrViewModel$updateLocationFromGps$1> continuation) {
        super(2, (Continuation) continuation);
        this.this$0 = fajrViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation) new FajrViewModel$updateLocationFromGps$1(this.this$0, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FajrViewModel$updateLocationFromGps$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        LocationManagerHelper locationManagerHelper;
        LocationManagerHelper locationManagerHelper2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        LocationManagerHelper locationManagerHelper3;
        FajrPreferences fajrPreferences;
        FajrPreferences fajrPreferences2;
        LocationManagerHelper locationManagerHelper4;
        FajrPreferences fajrPreferences3;
        MutableStateFlow mutableStateFlow7;
        MutableStateFlow mutableStateFlow8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                mutableStateFlow = this.this$0._uiState;
                mutableStateFlow2 = this.this$0._uiState;
                mutableStateFlow.setValue(FajrSettingsState.copy$default((FajrSettingsState) mutableStateFlow2.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, true, false, false, 28671, null));
                locationManagerHelper = this.this$0.locationHelper;
                boolean hasPerm = locationManagerHelper.hasLocationPermission();
                locationManagerHelper2 = this.this$0.locationHelper;
                boolean gpsOk = locationManagerHelper2.isGpsEnabled();
                if (!hasPerm || !gpsOk) {
                    mutableStateFlow3 = this.this$0._uiState;
                    mutableStateFlow4 = this.this$0._uiState;
                    mutableStateFlow3.setValue(FajrSettingsState.copy$default((FajrSettingsState) mutableStateFlow4.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, false, gpsOk, hasPerm, 8191, null));
                } else {
                    locationManagerHelper3 = this.this$0.locationHelper;
                    Location location = locationManagerHelper3.getLastKnownLocation();
                    if (location != null) {
                        fajrPreferences = this.this$0.prefs;
                        fajrPreferences.setLatitude(location.getLatitude());
                        fajrPreferences2 = this.this$0.prefs;
                        fajrPreferences2.setLongitude(location.getLongitude());
                        locationManagerHelper4 = this.this$0.locationHelper;
                        String nameAr = locationManagerHelper4.getCityNameFromCoordinates(location.getLatitude(), location.getLongitude(), new Locale("ar"));
                        String nameEn = locationManagerHelper4.getCityNameFromCoordinates(location.getLatitude(), location.getLongitude(), Locale.ENGLISH);
                        String placeKey = locationManagerHelper4.getPlaceKeyFromCoordinates(location.getLatitude(), location.getLongitude());
                        if (placeKey != null) {
                            this.this$0.prefs.setPlaceKey(placeKey);
                            String cityAlias = com.example.fajr.location.LocationAliasStore.INSTANCE.aliasFor(this.this$0.getApplication(), placeKey);
                            if (cityAlias != null) {
                                nameAr = cityAlias;
                                nameEn = cityAlias;
                            }
                        } else {
                            this.this$0.prefs.setPlaceKey(null);
                        }
                        this.this$0.prefs.setCityNames(nameAr, nameEn);
                        String name = "ar".equals(L10n.INSTANCE.getLang().getCode()) ? nameAr : nameEn;
                        mutableStateFlow7 = this.this$0._uiState;
                        mutableStateFlow8 = this.this$0._uiState;
                        mutableStateFlow7.setValue(FajrSettingsState.copy$default((FajrSettingsState) mutableStateFlow8.getValue(), false, false, name, location.getLatitude(), location.getLongitude(), null, 0L, null, null, false, 0, 0, false, true, true, 8163, null));
                    }
                }
                this.this$0.refreshFajrTimeInternal();
                mutableStateFlow5 = this.this$0._uiState;
                mutableStateFlow6 = this.this$0._uiState;
                mutableStateFlow5.setValue(FajrSettingsState.copy$default((FajrSettingsState) mutableStateFlow6.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, false, false, false, 28671, null));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

