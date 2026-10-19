import com.example.lockwidgets.PrayerPhase;
public class PrayerPhaseTest {
 public static void main(String[] args){
  long day=86400000L;long[] t={5*3600000L,6*3600000L,12*3600000L,16*3600000L,18*3600000L,20*3600000L};
  long[] y=t.clone(),tm=t.clone();for(int i=0;i<6;i++){y[i]-=day;tm[i]+=day;}
  int checks=0;
  for(int i:new int[]{0,2,3,4,5})for(boolean sunrise:new boolean[]{false,true}){
   long end=t[i]+PrayerPhase.iqamaMinutes(i)*60000L;
   for(long n:new long[]{t[i]-1,t[i],t[i]+1,end-1,end,end+1}){
    PrayerPhase p=PrayerPhase.resolve(t,y,tm,n,false,sunrise);
    boolean active=n>=t[i]&&n<end;
    if(p.iqama!=active || (active&&(p.targetIndex!=i||p.target!=end||p.start!=t[i])))throw new AssertionError("boundary "+i+" "+n);
    checks++;
   }
  }
  if(PrayerPhase.resolve(t,y,tm,t[2]+1000,true,false).iqama)throw new AssertionError("Friday");checks++;
  if(PrayerPhase.resolve(t,y,tm,t[1]+1000,false,false).iqama)throw new AssertionError("Sunrise");checks++;
  long[] spill=y.clone();spill[5]= -5*60000L;
  PrayerPhase p=PrayerPhase.resolve(t,spill,tm,5*60000L,false,false);
  if(!p.iqama||p.target!=15*60000L||p.targetIndex!=5)throw new AssertionError("midnight");checks++;
  if(PrayerPhase.resolve(t,spill,tm,15*60000L,false,false).iqama)throw new AssertionError("midnight end");checks++;
  System.out.println("PASS: "+checks+" prayer phase boundary assertions");
 }
}
