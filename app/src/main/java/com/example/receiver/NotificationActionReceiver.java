package com.example.receiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.example.alarm.AlarmScheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import com.example.ui.i18n.L10n;
import com.example.ui.i18n.S;

/* compiled from: NotificationActionReceiver.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/example/receiver/NotificationActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NotificationActionReceiver extends BroadcastReceiver {
    public static final String ACTION_MARK_AS_READ = "com.example.ACTION_MARK_AS_READ";
    public static final String ACTION_SNOOZE = "com.example.ACTION_SNOOZE";
    public static final int $stable = 8;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        L10n.INSTANCE.init(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int notificationId = intent.getIntExtra("NOTIFICATION_ID", -1);
        int dhikrId = intent.getIntExtra("DHIKR_ID", -1);
        Object systemService = context.getSystemService("notification");
        NotificationManager manager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationId != -1 && manager != null) {
            manager.cancel(notificationId);
        }
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2120003106:
                    if (action.equals(ACTION_SNOOZE) && dhikrId != -1) {
                        String title = intent.getStringExtra("DHIKR_TITLE");
                        if (title == null) {
                            title = L10n.INSTANCE.t(S.NotifReminder);
                        }
                        String content = intent.getStringExtra("DHIKR_CONTENT");
                        if (content == null) {
                            content = "";
                        }
                        new AlarmScheduler(context).scheduleSnooze(dhikrId, title, content, 10);
                        return;
                    }
                    return;
                case -929181687:
                    if (action.equals(ACTION_MARK_AS_READ) && dhikrId != -1) {
                        BroadcastReceiver.PendingResult pendingResult = goAsync();
                        BuildersKt.launch(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (kotlin.coroutines.CoroutineContext) kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, new NotificationActionReceiver$onReceive$1(context, dhikrId, pendingResult, null));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}

