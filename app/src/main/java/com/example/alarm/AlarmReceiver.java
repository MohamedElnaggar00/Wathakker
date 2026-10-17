package com.example.alarm;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.example.MainActivity;
import com.example.R;
import com.example.receiver.NotificationActionReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import com.example.ui.i18n.L10n;
import com.example.ui.i18n.S;

/* compiled from: AlarmReceiver.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0011"}, d2 = {"Lcom/example/alarm/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "showNotification", "id", "", "title", "", "content", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AlarmReceiver extends BroadcastReceiver {
    public static final String CHANNEL_ID = "dhikr_channel";
    public static final String CHANNEL_NAME = "Dhikr Reminders";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AlarmReceiver.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/example/alarm/AlarmReceiver$Companion;", "", "<init>", "()V", "CHANNEL_ID", "", "CHANNEL_NAME", "createNotificationChannel", "", "context", "Landroid/content/Context;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void createNotificationChannel(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                Object systemService = context.getSystemService("notification");
                NotificationManager manager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                NotificationChannel channel = new NotificationChannel(AlarmReceiver.CHANNEL_ID, AlarmReceiver.CHANNEL_NAME, 4);
                channel.setDescription(L10n.INSTANCE.t(S.NotifChannelAzkar));
                if (manager != null) {
                    manager.createNotificationChannel(channel);
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        L10n.INSTANCE.init(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int id = intent.getIntExtra("DHIKR_ID", -1);
        String title = intent.getStringExtra("DHIKR_TITLE");
        if (title == null) {
            title = L10n.INSTANCE.t(S.NotifReminder);
        }
        String content = intent.getStringExtra("DHIKR_CONTENT");
        if (content == null) {
            content = "";
        }
        boolean isSnooze = intent.getBooleanExtra("IS_SNOOZE", false);
        if (id != -1) {
            showNotification(context, id, title, content);
            if (!isSnooze) {
                BroadcastReceiver.PendingResult pendingResult = goAsync();
                BuildersKt.launch(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (kotlin.coroutines.CoroutineContext) kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, new AlarmReceiver$onReceive$1(context, id, pendingResult, null));
            }
        }
    }

    private final void showNotification(Context context, int id, String title, String content) {
        Object systemService = context.getSystemService("notification");
        NotificationManager manager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (manager == null) {
            return;
        }
        INSTANCE.createNotificationChannel(context);
        Intent openAppIntent = new Intent(context, (Class<?>) MainActivity.class);
        openAppIntent.setFlags(872415232);
        openAppIntent.putExtra("DHIKR_ID", id);
        openAppIntent.putExtra("NOTIFICATION_ID", id);
        PendingIntent contentPendingIntent = PendingIntent.getActivity(context, (id * 10) + 1, openAppIntent, 201326592);
        Intent markReadIntent = new Intent(context, (Class<?>) NotificationActionReceiver.class);
        markReadIntent.setAction(NotificationActionReceiver.ACTION_MARK_AS_READ);
        markReadIntent.putExtra("DHIKR_ID", id);
        markReadIntent.putExtra("NOTIFICATION_ID", id);
        PendingIntent markReadPendingIntent = PendingIntent.getBroadcast(context, (id * 10) + 2, markReadIntent, 201326592);
        Intent snoozeIntent = new Intent(context, (Class<?>) NotificationActionReceiver.class);
        snoozeIntent.setAction(NotificationActionReceiver.ACTION_SNOOZE);
        snoozeIntent.putExtra("DHIKR_ID", id);
        snoozeIntent.putExtra("DHIKR_TITLE", title);
        snoozeIntent.putExtra("DHIKR_CONTENT", content);
        snoozeIntent.putExtra("NOTIFICATION_ID", id);
        PendingIntent snoozePendingIntent = PendingIntent.getBroadcast(context, (id * 10) + 3, snoozeIntent, 201326592);
        PendingIntent openAppPendingIntent = PendingIntent.getActivity(context, (id * 10) + 4, openAppIntent, 201326592);
        Notification notification = new NotificationCompat.Builder(context, CHANNEL_ID).setContentTitle(title).setContentText(content).setSmallIcon(R.drawable.ic_notification).setStyle(new NotificationCompat.BigTextStyle().bigText(content)).setPriority(1).setAutoCancel(true).setContentIntent(contentPendingIntent).addAction(0, L10n.INSTANCE.t(S.NotifReadDone), markReadPendingIntent).addAction(0, L10n.INSTANCE.t(S.NotifRemindLater), snoozePendingIntent).addAction(0, L10n.INSTANCE.t(S.NotifOpenApp), openAppPendingIntent).build();
        Intrinsics.checkNotNullExpressionValue(notification, "build(...)");
        manager.notify(id, notification);
    }
}

