package SmallStudyGroup;

import java.time.LocalTime;
import java.util.Scanner;

public class C02_Localtime {

    public static void main(String[] args) {

          /*
        soru 2)
-suanin saatini dakikasini ve saniyesini bize dondurun
-suanin saniyesini bize dondurun
-10000 saniye sonrasini bize dondurun
-200 dakika onceki saati bize dondurun
-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)

         */
        int saat=0;
        int dakika=0;
        System.out.println("lutfen saat ve dakikayi giriniz");
        Scanner scan=new Scanner(System.in);
        saat= scan.nextInt();
        dakika=scan.nextInt();
        LocalTime saat2=LocalTime.now();
        LocalTime saat1=LocalTime.of(saat,dakika);
        System.out.println(saat1);
        System.out.println(saat2);//19:26:27.165827200
        System.out.println(saat2.getSecond());
        System.out.println(saat2.plusSeconds(10000));
        System.out.println(saat2.minusMinutes(200));
        System.out.println(saat2.minusHours(4));
        System.out.println(saat2.withMinute(3));




    }
}