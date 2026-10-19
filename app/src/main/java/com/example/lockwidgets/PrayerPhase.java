package com.example.lockwidgets;

/** Shared, clock-injected countdown state. Fixed iqama delays are unchanged. */
public final class PrayerPhase {
    private static final int[] MINUTES = {25, 0, 20, 20, 10, 20};
    public static int iqamaMinutes(int prayer) { return MINUTES[prayer]; }
    public final int targetIndex, previousIndex;
    public final long start, target;
    public final boolean iqama;
    private PrayerPhase(int i, int previous, long start, long target, boolean iqama) {
        this.targetIndex=i; this.previousIndex=previous; this.start=start; this.target=target; this.iqama=iqama;
    }
    public static long[] window(long[] today, long[] yesterday, long now, boolean friday) {
        for(int i=5;i>=0;i--) {
            long end=today[i]+MINUTES[i]*60000L;
            if(MINUTES[i]>0 && !(friday && i==2) && today[i]<=now && now<end)
                return new long[]{i,today[i],end};
        }
        if(yesterday!=null && yesterday[5]<=now && now<yesterday[5]+MINUTES[5]*60000L)
            return new long[]{5,yesterday[5],yesterday[5]+MINUTES[5]*60000L};
        return null;
    }
    public static PrayerPhase resolve(long[] today,long[] yesterday,long[] tomorrow,long now,boolean friday,boolean includeSunrise) {
        long[] w=window(today,yesterday,now,friday);
        if(w!=null)return new PrayerPhase((int)w[0],(int)w[0],w[1],w[2],true);
        int previous=5; long start=yesterday[5];
        for(int i=0;i<6;i++) {
            if(i==1 && !includeSunrise)continue;
            if(today[i]>now)return new PrayerPhase(i,previous,start,today[i],false);
            previous=i; start=today[i];
        }
        return new PrayerPhase(0,5,today[5],tomorrow[0],false);
    }
    public static String iqamaLabel(String code) {
        if(code.startsWith("ar"))return "الإقامة";
        if(code.startsWith("fr"))return "Iqama";
        if(code.startsWith("de"))return "Iqama";
        if(code.startsWith("tr"))return "Kamet";
        if(code.startsWith("ur"))return "اقامت";
        if(code.startsWith("id"))return "Iqamah";
        if(code.startsWith("ru"))return "Икама";
        return "Iqama";
    }
    public String label(String[] names,String code) {
        return iqama ? iqamaLabel(code)+" "+names[targetIndex] : names[targetIndex];
    }
}
