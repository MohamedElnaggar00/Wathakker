package com.example.data;

import android.content.Context;
import androidx.autofill.HintConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: HisnImporter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/example/data/HisnImporter;", "", "<init>", "()V", "ensureImported", "", "context", "Landroid/content/Context;", "dao", "Lcom/example/data/HisnDao;", "(Landroid/content/Context;Lcom/example/data/HisnDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HisnImporter {
    public static final int $stable = 0;
    public static final HisnImporter INSTANCE = new HisnImporter();

    private HisnImporter() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0030. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177 A[LOOP:0: B:16:0x0175->B:17:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureImported(Context context, HisnDao dao, Continuation<? super Unit> continuation) {
        HisnImporter$ensureImported$1 hisnImporter$ensureImported$1;
        Context context2;
        HisnDao dao2;
        Object obj;
        String text;
        JSONArray items;
        Context context3;
        HisnDao dao3;
        JSONArray items2;
        JSONObject root;
        int length;
        int i;
        if (continuation instanceof HisnImporter$ensureImported$1) {
            hisnImporter$ensureImported$1 = (HisnImporter$ensureImported$1) continuation;
            if ((hisnImporter$ensureImported$1.label & Integer.MIN_VALUE) != 0) {
                hisnImporter$ensureImported$1.label -= Integer.MIN_VALUE;
                Object $result = hisnImporter$ensureImported$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (hisnImporter$ensureImported$1.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        context2 = context;
                        hisnImporter$ensureImported$1.L$0 = context2;
                        hisnImporter$ensureImported$1.L$1 = dao;
                        hisnImporter$ensureImported$1.label = 1;
                        Object chapterCount = dao.chapterCount(hisnImporter$ensureImported$1);
                        if (chapterCount == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dao2 = dao;
                        obj = chapterCount;
                        if (((Number) obj).intValue() <= 0) {
                            return Unit.INSTANCE;
                        }
                        InputStream open = context2.getAssets().open("hisn_elmoslem.json");
                        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                        Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
                        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        try {
                            text = TextStreamsKt.readText(bufferedReader);
                            CloseableKt.closeFinally(bufferedReader, null);
                            JSONObject root2 = new JSONObject(text);
                            JSONArray chapters = root2.getJSONArray("chapters");
                            items = root2.getJSONArray("items");
                            int length2 = chapters.length();
                            ArrayList arrayList = new ArrayList(length2);
                            int i2 = 0;
                            while (i2 < length2) {
                                JSONObject jSONObject = chapters.getJSONObject(i2);
                                int i3 = jSONObject.getInt("id");
                                Object $result2 = $result;
                                int i4 = jSONObject.getInt("order");
                                Context context4 = context2;
                                String string = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                arrayList.add(new HisnChapter(i3, i4, string));
                                i2++;
                                $result = $result2;
                                context2 = context4;
                            }
                            context3 = context2;
                            hisnImporter$ensureImported$1.L$0 = SpillingKt.nullOutSpilledVariable(context3);
                            hisnImporter$ensureImported$1.L$1 = dao2;
                            hisnImporter$ensureImported$1.L$2 = SpillingKt.nullOutSpilledVariable(text);
                            hisnImporter$ensureImported$1.L$3 = SpillingKt.nullOutSpilledVariable(root2);
                            hisnImporter$ensureImported$1.L$4 = SpillingKt.nullOutSpilledVariable(chapters);
                            hisnImporter$ensureImported$1.L$5 = items;
                            hisnImporter$ensureImported$1.label = 2;
                            if (dao2.insertChapters(arrayList, hisnImporter$ensureImported$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            dao3 = dao2;
                            items2 = chapters;
                            root = root2;
                            length = items.length();
                            ArrayList arrayList2 = new ArrayList(length);
                            i = 0;
                            while (i < length) {
                                JSONObject jSONObject2 = items.getJSONObject(i);
                                int i5 = jSONObject2.getInt("id");
                                int i6 = length;
                                int i7 = jSONObject2.getInt("chapterId");
                                int i8 = jSONObject2.getInt("order");
                                String string2 = jSONObject2.getString("text");
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                int coerceAtLeast = RangesKt.coerceAtLeast(jSONObject2.optInt("count", 1), 1);
                                String optString = jSONObject2.optString("fadl", "");
                                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                                String optString2 = jSONObject2.optString("source", "");
                                Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                                String optString3 = jSONObject2.optString("hokm", "");
                                Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                                arrayList2.add(new HisnItem(i5, i7, i8, string2, coerceAtLeast, optString, optString2, optString3));
                                i++;
                                length = i6;
                                items2 = items2;
                            }
                            hisnImporter$ensureImported$1.L$0 = SpillingKt.nullOutSpilledVariable(context3);
                            hisnImporter$ensureImported$1.L$1 = SpillingKt.nullOutSpilledVariable(dao3);
                            hisnImporter$ensureImported$1.L$2 = SpillingKt.nullOutSpilledVariable(text);
                            hisnImporter$ensureImported$1.L$3 = SpillingKt.nullOutSpilledVariable(root);
                            hisnImporter$ensureImported$1.L$4 = SpillingKt.nullOutSpilledVariable(items2);
                            hisnImporter$ensureImported$1.L$5 = SpillingKt.nullOutSpilledVariable(items);
                            hisnImporter$ensureImported$1.label = 3;
                            return dao3.insertItems(arrayList2, hisnImporter$ensureImported$1) != coroutine_suspended ? coroutine_suspended : Unit.INSTANCE;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(bufferedReader, th);
                                throw th2;
                            }
                        }
                    case 1:
                        HisnDao dao4 = (HisnDao) hisnImporter$ensureImported$1.L$1;
                        context2 = (Context) hisnImporter$ensureImported$1.L$0;
                        ResultKt.throwOnFailure($result);
                        dao2 = dao4;
                        obj = $result;
                        if (((Number) obj).intValue() <= 0) {
                        }
                        break;
                    case 2:
                        JSONArray items3 = (JSONArray) hisnImporter$ensureImported$1.L$5;
                        JSONArray chapters2 = (JSONArray) hisnImporter$ensureImported$1.L$4;
                        root = (JSONObject) hisnImporter$ensureImported$1.L$3;
                        String text2 = (String) hisnImporter$ensureImported$1.L$2;
                        dao3 = (HisnDao) hisnImporter$ensureImported$1.L$1;
                        Context context5 = (Context) hisnImporter$ensureImported$1.L$0;
                        ResultKt.throwOnFailure($result);
                        context3 = context5;
                        text = text2;
                        items = items3;
                        items2 = chapters2;
                        length = items.length();
                        ArrayList arrayList22 = new ArrayList(length);
                        i = 0;
                        while (i < length) {
                        }
                        hisnImporter$ensureImported$1.L$0 = SpillingKt.nullOutSpilledVariable(context3);
                        hisnImporter$ensureImported$1.L$1 = SpillingKt.nullOutSpilledVariable(dao3);
                        hisnImporter$ensureImported$1.L$2 = SpillingKt.nullOutSpilledVariable(text);
                        hisnImporter$ensureImported$1.L$3 = SpillingKt.nullOutSpilledVariable(root);
                        hisnImporter$ensureImported$1.L$4 = SpillingKt.nullOutSpilledVariable(items2);
                        hisnImporter$ensureImported$1.L$5 = SpillingKt.nullOutSpilledVariable(items);
                        hisnImporter$ensureImported$1.label = 3;
                        if (dao3.insertItems(arrayList22, hisnImporter$ensureImported$1) != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        ResultKt.throwOnFailure($result);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        hisnImporter$ensureImported$1 = new HisnImporter$ensureImported$1(this, continuation);
        Object $result3 = hisnImporter$ensureImported$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (hisnImporter$ensureImported$1.label) {
        }
    }
}
