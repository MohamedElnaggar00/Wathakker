package com.example.widgethost;

import android.app.Activity;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String PKG = "com.wathakker.app";
    private static final String[][] WIDGETS = {
        {"Hero", "330", "90"},
        {"HeroLarge", "330", "160"},
        {"Schedule", "330", "90"},
        {"Clock", "250", "90"},
        {"NextPrayer", "110", "90"},
        {"PrayerBar", "110", "90"},
        {"DayPrayer", "110", "90"},
        {"Pill", "110", "90"},
        {"Hijri", "90", "90"},
        {"Gregorian", "90", "90"},
    };

    private AppWidgetHost host;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        float d = getResources().getDisplayMetrics().density;
        AppWidgetManager awm = AppWidgetManager.getInstance(this);
        host = new AppWidgetHost(getApplicationContext(), 1024);
        host.startListening();
        ScrollView sv = new ScrollView(this);
        LinearLayout col = new LinearLayout(this);
        col.setOrientation(LinearLayout.VERTICAL);
        sv.addView(col);
        for (String[] w : WIDGETS) {
            String kind = w[0];
            int wd = Integer.parseInt(w[1]), ht = Integer.parseInt(w[2]);
            TextView label = new TextView(this);
            col.addView(label);
            int id = host.allocateAppWidgetId();
            ComponentName cn = new ComponentName(PKG, "com.example.widget." + kind + "WidgetProvider");
            boolean ok = awm.bindAppWidgetIdIfAllowed(id, cn, null);
            Log.i("WidgetHost", "bind " + kind + " id=" + id + " -> " + ok);
            label.setText(kind + " bind=" + ok);
            if (!ok) continue;
            AppWidgetProviderInfo info = awm.getAppWidgetInfo(id);
            if (info == null) { Log.i("WidgetHost", "no info for " + kind); continue; }
            AppWidgetHostView v = host.createView(getApplicationContext(), id, info);
            v.setAppWidget(id, info);
            col.addView(v, new LinearLayout.LayoutParams((int)(wd * d), (int)(ht * d)));
        }
        setContentView(sv);
    }

    @Override
    protected void onDestroy() {
        try { if (host != null) host.stopListening(); } catch (Exception e) { }
        super.onDestroy();
    }
}
