package com.example.ui.oneui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class HeaderTools {
    private static WeakReference nav;

    public static Modifier scrollTile(Modifier modifier, float f) {
        long m4487copywmQWz5c;
        Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(26.0f));
        m4487copywmQWz5c = Color.m4487copywmQWz5c(r0, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r0) : f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r0) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r0) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4280558630L)) : 0.0f);
        return BackgroundKt.m231backgroundbw27NRU$default(clip, m4487copywmQWz5c, null, 2, null);
    }

    public static void setNav(Object obj) {
        nav = new WeakReference(obj);
    }

    public static void settings() {
        NavController navController;
        WeakReference weakReference = nav;
        if (weakReference == null || (navController = (NavController) weakReference.get()) == null) {
            return;
        }
        NavController.navigate$default(navController, "settings", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public static void settingsButton(Composer composer) {
        IconButtonKt.IconButton(SettingsAction.INSTANCE, Modifier.INSTANCE, false, null, null, SettingsIcon.INSTANCE, composer, 0, 28);
    }

    public static Modifier tile(Modifier modifier) {
        RoundedCornerShape m1024RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(26.0f);
        return BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(modifier, m1024RoundedCornerShape0680j_4), ColorKt.Color(4280558630L), m1024RoundedCornerShape0680j_4, 0, null);
    }
}
