package com.example.fajr.sound;

import android.content.Context;
import android.database.Cursor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import com.example.fajr.data.FajrPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import com.example.ui.i18n.L10n;
import com.example.ui.i18n.S;

/* compiled from: RingtoneHelper.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/fajr/sound/RingtoneHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "getValidRingtoneUri", "Landroid/net/Uri;", "prefs", "Lcom/example/fajr/data/FajrPreferences;", "isUriAccessible", "", "uri", "getRingtoneTitle", "", "playPreview", "", "volume", "", "stopPreview", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RingtoneHelper {
    public static final int $stable = 8;
    private final Context context;
    private MediaPlayer mediaPlayer;

    public RingtoneHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Uri getValidRingtoneUri(FajrPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        String savedUriStr = prefs.getRingtoneUri();
        if (savedUriStr.length() > 0) {
            Uri uri = Uri.parse(savedUriStr);
            Intrinsics.checkNotNull(uri);
            if (isUriAccessible(uri)) {
                return uri;
            }
        }
        Uri defaultUri = RingtoneManager.getDefaultUri(4);
        if (defaultUri != null) {
            return defaultUri;
        }
        Uri defaultUri2 = RingtoneManager.getDefaultUri(1);
        if (defaultUri2 != null) {
            return defaultUri2;
        }
        Uri DEFAULT_ALARM_ALERT_URI = Settings.System.DEFAULT_ALARM_ALERT_URI;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_ALARM_ALERT_URI, "DEFAULT_ALARM_ALERT_URI");
        return DEFAULT_ALARM_ALERT_URI;
    }

    private final boolean isUriAccessible(Uri uri) {
        try {
            ParcelFileDescriptor pfd = this.context.getContentResolver().openFileDescriptor(uri, "r");
            if (pfd != null) {
                pfd.close();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public final String getRingtoneTitle(Uri uri) {
        Exception e;
        int columnIndex;
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            Cursor query = this.context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                Cursor cursor = query;
                try {
                    Cursor cursor2 = cursor;
                    if (cursor2.moveToFirst() && (columnIndex = cursor2.getColumnIndex("_display_name")) != -1) {
                        String string = cursor2.getString(columnIndex);
                        String str = string;
                        if (!(str == null || str.length() == 0)) {
                            CloseableKt.closeFinally(cursor, null);
                            return string;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, null);
                } finally {
                }
            }
            Ringtone ringtone = RingtoneManager.getRingtone(this.context, uri);
            String title = ringtone != null ? ringtone.getTitle(this.context) : null;
            String str2 = title;
            return !(str2 == null || str2.length() == 0) ? title : L10n.INSTANCE.t(S.DefaultAlarmTone);
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return L10n.INSTANCE.t(S.DefaultAlarmTone);
        }
    }

    public static /* synthetic */ void playPreview$default(RingtoneHelper ringtoneHelper, Uri uri, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.8f;
        }
        ringtoneHelper.playPreview(uri, f);
    }

    public final void playPreview(Uri uri, float volume) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        stopPreview();
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(4).setContentType(2).build());
            mediaPlayer.setDataSource(this.context, uri);
            mediaPlayer.setVolume(volume, volume);
            mediaPlayer.prepare();
            mediaPlayer.start();
            this.mediaPlayer = mediaPlayer;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Uri defaultUri = RingtoneManager.getDefaultUri(4);
                MediaPlayer create = MediaPlayer.create(this.context, defaultUri);
                if (create != null) {
                    create.setVolume(volume, volume);
                    create.start();
                } else {
                    create = null;
                }
                this.mediaPlayer = create;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public final void stopPreview() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            }
            this.mediaPlayer = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

