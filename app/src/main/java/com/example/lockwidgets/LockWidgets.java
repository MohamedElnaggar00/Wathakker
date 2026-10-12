package com.example.lockwidgets;

import android.app.*;
import android.appwidget.*;
import android.content.*;
import android.graphics.*;
import android.icu.util.IslamicCalendar;
import android.os.Bundle;
import android.text.*;
import android.widget.RemoteViews;
import java.lang.reflect.*;
import java.text.*;
import java.util.*;

/** Native port of Prayer-Sam-Widgets artwork and interactions into the recovered Wathakker app. */
public class LockWidgets extends AppWidgetProvider {
    public static class Day extends LockWidgets {}
    public static class Prayers extends LockWidgets {}
    public static class Tasbih extends LockWidgets {}
    public static class Hijri extends LockWidgets {}
    public static class Gregorian extends LockWidgets {}
    public static class Next extends LockWidgets {}
    public static class Bar extends LockWidgets {}
    public static class Countdown extends LockWidgets {}
    public static class CountdownClean extends LockWidgets {}
    private static final Class<?>[] TYPES = {Day.class,Tasbih.class,Hijri.class,Gregorian.class,Next.class,Bar.class,Countdown.class,CountdownClean.class};
    private static String action(Context c,String suffix){return c.getPackageName()+".lockwidgets."+suffix;}
    private static int res(Context c,String type,String name){return c.getResources().getIdentifier(name,type,c.getPackageName());}
    private static boolean arabic(Context c){return c.getSharedPreferences("app_prefs",0).getString("language","ar").startsWith("ar");}
    private static SharedPreferences.OnSharedPreferenceChangeListener languageListener;
    private static void watchLanguage(Context c){if(languageListener==null){Context app=c.getApplicationContext();languageListener=(prefs,key)->{if("language".equals(key))updateAll(app);};app.getSharedPreferences("app_prefs",0).registerOnSharedPreferenceChangeListener(languageListener);}}
    private static Locale locale(Context c){return arabic(c)?new Locale("ar"):Locale.ENGLISH;}
    private static PendingIntent pulse(Context c){return PendingIntent.getBroadcast(c,700001,new Intent(c,LockWidgets.class).setAction(action(c,"TICK")),PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);}
    private static boolean active(Context c){AppWidgetManager m=AppWidgetManager.getInstance(c);for(Class<?> t:TYPES)if(m.getAppWidgetIds(new ComponentName(c,t)).length>0)return true;return false;}
    private static void schedule(Context c){watchLanguage(c);AlarmManager a=(AlarmManager)c.getSystemService(Context.ALARM_SERVICE);if(active(c))a.setInexactRepeating(AlarmManager.RTC,System.currentTimeMillis()+60000,60000,pulse(c));else a.cancel(pulse(c));}
    @Override public void onUpdate(Context c,AppWidgetManager m,int[] ids){for(int id:ids)update(c,m,id,getClass());schedule(c);}
    @Override public void onEnabled(Context c){schedule(c);}
    @Override public void onDisabled(Context c){schedule(c);}
    @Override public void onDeleted(Context c,int[] ids){for(int id:ids)c.getSharedPreferences("lock_tasbih",0).edit().remove("count_"+id).apply();schedule(c);}
    @Override public void onAppWidgetOptionsChanged(Context c,AppWidgetManager m,int id,Bundle options){update(c,m,id,getClass());}
    @Override public void onReceive(Context c,Intent in){
        String a=in.getAction();
        if(action(c,"TAP").equals(a)){
            int id=in.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,-1);
            AppWidgetProviderInfo info=AppWidgetManager.getInstance(c).getAppWidgetInfo(id);
            if(info!=null&&info.provider.equals(new ComponentName(c,Tasbih.class))){SharedPreferences p=c.getSharedPreferences("lock_tasbih",0);String key="count_"+id;p.edit().putInt(key,p.getInt(key,0)+1).apply();update(c,AppWidgetManager.getInstance(c),id,Tasbih.class);}return;
        }
        if(action(c,"TICK").equals(a)||Intent.ACTION_BOOT_COMPLETED.equals(a)||Intent.ACTION_TIME_CHANGED.equals(a)||Intent.ACTION_TIMEZONE_CHANGED.equals(a)||Intent.ACTION_DATE_CHANGED.equals(a)||Intent.ACTION_MY_PACKAGE_REPLACED.equals(a)){
            updateAll(c);schedule(c);return;
        }
        super.onReceive(c,in);
    }
    public static void updateAll(Context c){watchLanguage(c);AppWidgetManager m=AppWidgetManager.getInstance(c);for(Class<?> t:TYPES)for(int id:m.getAppWidgetIds(new ComponentName(c,t)))update(c,m,id,t);}
    private static void update(Context c,AppWidgetManager m,int id,Class<?> type){
        RemoteViews v=new RemoteViews(c.getPackageName(),res(c,"layout","lock_widget_image"));
        Bundle opts=m.getAppWidgetOptions(id);int min=opts.getInt(AppWidgetManager.OPTION_APPWIDGET_MIN_WIDTH,123),max=opts.getInt(AppWidgetManager.OPTION_APPWIDGET_MAX_WIDTH,min);boolean tiny=min>0&&max<=80&&(type==Hijri.class||type==Gregorian.class||type==Next.class);Bitmap bmp=renderSize(c,type,id,tiny);
        v.setImageViewBitmap(res(c,"id","lock_widget_art"),bmp);
        v.setInt(res(c,"id","lock_widget_art"),"setLayoutDirection",arabic(c)?android.view.View.LAYOUT_DIRECTION_RTL:android.view.View.LAYOUT_DIRECTION_LTR);
        v.setOnClickPendingIntent(res(c,"id","lock_widget_art"),null);
        m.updateAppWidget(id,v);
    }
    /** Call r7's own calculator/preferences so all widgets agree with its prayer screen. */
    private static long[] times(Context c,Calendar day)throws Exception{
        Class<?> p=Class.forName("com.example.fajr.data.FajrPreferences");Object prefs=p.getConstructor(Context.class).newInstance(c);
        double lat=(Double)p.getMethod("getLatitude").invoke(prefs),lng=(Double)p.getMethod("getLongitude").invoke(prefs);
        int method=(Integer)p.getMethod("getCalculationMethodId").invoke(prefs);
        Class<?> meth=Class.forName("com.example.fajr.calculation.CalculationMethod");Object companion=meth.getField("Companion").get(null);Object choice=companion.getClass().getMethod("fromId",int.class).invoke(companion,method);
        Class<?> calc=Class.forName("com.example.fajr.calculation.PrayerTimesCalculator");Object result=calc.getMethod("calculateAll",Calendar.class,double.class,double.class,meth).invoke(calc.getField("INSTANCE").get(null),day,lat,lng,choice);
        String[] getters={"getFajr","getSunrise","getDhuhr","getAsr","getMaghrib","getIsha"};long[] out=new long[6];for(int i=0;i<6;i++)out[i]=(Long)result.getClass().getMethod(getters[i]).invoke(result);return out;
    }
    private static String time(long value,Locale l){return HomeWidgets.tm(value,l.getLanguage().equals("ar"));}
    private static String number(long n,Locale l){NumberFormat f=NumberFormat.getIntegerInstance(l);f.setGroupingUsed(false);return f.format(n);}
    private static Typeface font(Context c,String file){return Typeface.createFromAsset(c.getAssets(),"lockfonts/"+file+".ttf");}
    private static TextPaint paint(Typeface font,float size,float d,int color){TextPaint p=new TextPaint(Paint.ANTI_ALIAS_FLAG);p.setTypeface(font);p.setTextSize(size*d);p.setColor(color);p.setShadowLayer(3*d,0,d,0x66000000);return p;}
    private static void lines(Canvas canvas,int w,int h,float d,String[] text,float[] sizes,Typeface[] fonts){
        StaticLayout[] ls=new StaticLayout[text.length];float total=0;
        for(int i=0;i<text.length;i++){TextPaint lp=paint(fonts[i],sizes[i],d,i==0?Color.WHITE:0xE6FFFFFF);float measured=lp.measureText(text[i]);if(measured>w-4*d)lp.setTextSize(lp.getTextSize()*(w-4*d)/measured);ls[i]=StaticLayout.Builder.obtain(text[i],0,text[i].length(),lp,w).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).build();total+=ls[i].getHeight();}
        total+=(text.length-1)*2*d;float y=Math.max(0,(h-total)/2);
        for(StaticLayout l:ls){canvas.save();canvas.translate(0,y);l.draw(canvas);canvas.restore();y+=l.getHeight()+2*d;}
    }
    public static Bitmap render(Context c,Class<?> type,int id){return renderSize(c,type,id,false);}
    private static void centered(Canvas cv,String text,float cx,float cy,TextPaint p,float max){float width=p.measureText(text);if(width>max)p.setTextSize(p.getTextSize()*max/width);StaticLayout line=StaticLayout.Builder.obtain(text,0,text.length(),p,(int)max).setAlignment(Layout.Alignment.ALIGN_CENTER).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setIncludePad(false).build();cv.save();cv.translate(cx-max/2,cy-line.getHeight()/2f);line.draw(cv);cv.restore();}
    public static long[] iqamaWindow(long[] today,long[] yesterday,long now){int[] offsets={25,0,20,15,10,15};for(int i=5;i>=0;i--)if(i!=1&&today[i]<=now&&now<today[i]+offsets[i]*60000L)return new long[]{i,today[i],today[i]+offsets[i]*60000L};if(yesterday!=null&&yesterday[5]<=now&&now<yesterday[5]+15*60000L)return new long[]{5,yesterday[5],yesterday[5]+15*60000L};return null;}
    public static Bitmap renderSize(Context c,Class<?> type,int id,boolean tiny){
        float d=c.getResources().getDisplayMetrics().density;int wd=tiny?54:123,hd=54;
        Bitmap bmp=Bitmap.createBitmap((int)(wd*d),(int)(hd*d),Bitmap.Config.ARGB_8888);Canvas cv=new Canvas(bmp);int w=bmp.getWidth(),h=bmp.getHeight();Locale l=locale(c);boolean ar=arabic(c);
        Typeface amiri=font(c,"amiri_bold"),medium=Typeface.createFromAsset(c.getAssets(),"lockpersonal/expoarabic_medium.ttf"),bold=Typeface.createFromAsset(c.getAssets(),"lockpersonal/expoarabic_semibold.ttf");float pad=(tiny?6:12)*d;
        if(type==Day.class){if(ar){try{Bitmap art=BitmapFactory.decodeStream(c.getAssets().open("lockpersonal/day_"+Calendar.getInstance().get(Calendar.DAY_OF_WEEK)+".png"));float ratio=Math.min((w-2*pad)/art.getWidth(),34*d/art.getHeight());float aw=art.getWidth()*ratio,ah=art.getHeight()*ratio;Paint ink=new Paint(Paint.ANTI_ALIAS_FLAG|Paint.FILTER_BITMAP_FLAG);ink.setColorFilter(new PorterDuffColorFilter(Color.WHITE,PorterDuff.Mode.SRC_IN));cv.drawBitmap(art,null,new RectF((w-aw)/2,(h-ah)/2,(w+aw)/2,(h+ah)/2),ink);}catch(Exception ex){throw new RuntimeException(ex);}}else{String name=new SimpleDateFormat("EEEE",l).format(new Date());centered(cv,name,w/2f,h/2f,paint(amiri,29,d,Color.WHITE),w-2*pad);}}
        else if(type==Gregorian.class){Date now=new Date();String date=new SimpleDateFormat(tiny?"M/yyyy":"MMMM",l).format(now);String day=new SimpleDateFormat("d",l).format(now);if(tiny){lines(cv,w,h,d,new String[]{day,date},new float[]{18,9},new Typeface[]{bold,medium});}else{lines(cv,w,h,d,new String[]{day+" "+date,new SimpleDateFormat("yyyy",l).format(now)},new float[]{18,16},new Typeface[]{bold,bold});}}
        else if(type==Hijri.class){IslamicCalendar cal=new IslamicCalendar();cal.setCalculationType(IslamicCalendar.CalculationType.ISLAMIC_UMALQURA);cal.setTimeInMillis(System.currentTimeMillis());String[] months=ar?new String[]{"محرم","صفر","ربيع الأول","ربيع الآخر","جمادى الأولى","جمادى الآخرة","رجب","شعبان","رمضان","شوال","ذو القعدة","ذو الحجة"}:new String[]{"Muharram","Safar","Rabi' al-Awwal","Rabi' al-Thani","Jumada al-Ula","Jumada al-Akhirah","Rajab","Sha'ban","Ramadan","Shawwal","Dhul-Qa'dah","Dhul-Hijjah"};String month=months[cal.get(Calendar.MONTH)],day=number(cal.get(Calendar.DAY_OF_MONTH),l),year=number(cal.get(Calendar.YEAR),l);if(tiny&&ar){centered(cv,day,w/2f,16*d,paint(bold,18,d,Color.WHITE),w-2*pad);try{Bitmap art=BitmapFactory.decodeStream(c.getAssets().open("lockpersonal/hijri_"+(cal.get(Calendar.MONTH)+1)+".png"));float ratio=Math.min((w-2*pad)/art.getWidth(),18*d/art.getHeight());float aw=art.getWidth()*ratio,ah=art.getHeight()*ratio;Paint ink=new Paint(Paint.ANTI_ALIAS_FLAG|Paint.FILTER_BITMAP_FLAG);ink.setColorFilter(new PorterDuffColorFilter(Color.WHITE,PorterDuff.Mode.SRC_IN));cv.drawBitmap(art,null,new RectF((w-aw)/2,34*d-ah/2,(w+aw)/2,34*d+ah/2),ink);}catch(Exception ex){throw new RuntimeException(ex);}}else{lines(cv,w,h,d,tiny?new String[]{day,month}:new String[]{day+" "+month,year},tiny?new float[]{18,10}:new float[]{17,16},tiny?new Typeface[]{bold,amiri}:new Typeface[]{bold,bold});}}
        else if(type==Tasbih.class){int n=c.getSharedPreferences("lock_tasbih",0).getInt("count_"+id,0);String[] dhikr=ar?new String[]{"سُبْحَانَ اللَّه","الْحَمْدُ لِلَّه","اللَّهُ أَكْبَر"}:new String[]{"SubhanAllah","Alhamdulillah","Allahu Akbar"};lines(cv,w,h,d,new String[]{dhikr[(n/33)%3],number(n%33,l)+" / "+number(33,l)},new float[]{17,13},new Typeface[]{amiri,medium});}
        else {
            try {Calendar today=Calendar.getInstance();long[] ts=times(c,today);long now=System.currentTimeMillis();int next=-1;for(int i=0;i<6;i++)if(i!=1&&ts[i]>now){next=i;break;}long at,prev;
                if(next<0){Calendar tomorrow=(Calendar)today.clone();tomorrow.add(Calendar.DAY_OF_MONTH,1);at=times(c,tomorrow)[0];prev=ts[5];next=0;}else{at=ts[next];if(next>0)prev=ts[next==2?0:next-1];else{Calendar yesterday=(Calendar)today.clone();yesterday.add(Calendar.DAY_OF_MONTH,-1);prev=times(c,yesterday)[5];}}
                String[] names=ar?new String[]{"الفجر","الشروق","الظهر","العصر","المغرب","العشاء"}:new String[]{"Fajr","Sunrise","Dhuhr","Asr","Maghrib","Isha"};
                boolean iqama=false;if(type==Bar.class||type==Next.class){Calendar yesterday=(Calendar)today.clone();yesterday.add(Calendar.DAY_OF_MONTH,-1);long[] window=iqamaWindow(ts,times(c,yesterday),now);if(window!=null){iqama=true;next=(int)window[0];prev=window[1];at=window[2];}}
                String target=iqama?(ar?"الإقامة":"Iqama"):names[next];
                if(type==Prayers.class){int[] indexes={0,2,3,4,5};float cell=(w-2*pad)/5;for(int j=0;j<5;j++){int i=indexes[j];float x=ar?w-pad-cell*(j+.5f):pad+cell*(j+.5f);centered(cv,names[i],x,20*d,paint(medium,7,d,Color.WHITE),cell-1*d);centered(cv,time(ts[i],l),x,34*d,paint(bold,8,d,Color.WHITE),cell-1*d);if(i==next){Paint marker=new Paint(Paint.ANTI_ALIAS_FLAG);marker.setColor(Color.WHITE);cv.drawRoundRect(new RectF(x-cell*.35f,41*d,x+cell*.35f,42.5f*d),d,d,marker);}}}
                else if(type==Countdown.class||type==CountdownClean.class){
                    centered(cv,target,w-pad-25*d,12*d,paint(bold,13,d,Color.WHITE),48*d);
                    centered(cv,time(at,l),pad+26*d,12*d,paint(medium,12,d,Color.WHITE),54*d);
                    Paint p=new Paint(Paint.ANTI_ALIAS_FLAG);float top=25*d,width=w-2*pad,bh=3*d;p.setColor(0x40FFFFFF);cv.drawRoundRect(new RectF(pad,top,pad+width,top+bh),bh/2,bh/2,p);float fraction=Math.max(0,Math.min(1,(now-prev)/(float)Math.max(1,at-prev))),fw=Math.max(bh,width*fraction);p.setColor(Color.WHITE);cv.drawRoundRect(new RectF(ar?pad+width-fw:pad,top,ar?pad+width:pad+fw,top+bh),bh/2,bh/2,p);
                    long mins=Math.max(0,(at-now)/60000);String remain=String.format(Locale.ENGLISH,"%02d:%02d",mins/60,mins%60);centered(cv,(type==Countdown.class?(ar?"متبقي: ":"Remaining: "):"")+"⁦"+remain+"⁩",w/2f,41*d,paint(medium,12,d,Color.WHITE),w-2*pad);
                }
                else if(type==Bar.class){centered(cv,target,w/2f,13*d,paint(bold,13,d,Color.WHITE),w-2*pad);centered(cv,time(at,l),w/2f,42*d,paint(medium,12,d,Color.WHITE),w-2*pad);Paint p=new Paint(Paint.ANTI_ALIAS_FLAG);float top=26*d,width=w-2*pad,bh=4*d;p.setColor(0x40FFFFFF);cv.drawRoundRect(new RectF(pad,top,pad+width,top+bh),bh/2,bh/2,p);float fraction=Math.max(0,Math.min(1,(now-prev)/(float)Math.max(1,at-prev))),fw=Math.max(bh,width*fraction);p.setColor(Color.WHITE);cv.drawRoundRect(new RectF(ar?pad+width-fw:pad,top,ar?pad+width:pad+fw,top+bh),bh/2,bh/2,p);}
                else {long minutes=Math.max(0,(at-now)/60000);String countdown=minutes>=60?number(minutes/60,l)+(ar?" ساعات ":" hours ")+number(minutes%60,l)+(ar?" دقيقة":" minutes"):number(minutes,l)+(ar?" دقيقة":"m");String remaining=HomeWidgets.remaining(minutes,ar);lines(cv,w,h,d,tiny?new String[]{target,time(at,l),countdown}:new String[]{target+" "+time(at,l),remaining},tiny?new float[]{12,11,9}:new float[]{13,9},tiny?new Typeface[]{bold,medium,medium}:new Typeface[]{bold,medium});}
            }catch(Exception ex){android.util.Log.e("WathakkerLock","Prayer bridge failed",ex);lines(cv,w,h,d,new String[]{ar?"تعذر حساب الصلاة":"Prayer time unavailable"},new float[]{11},new Typeface[]{medium});}
        }
        return bmp;
    }
}
