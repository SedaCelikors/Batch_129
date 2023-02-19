package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1:Time i formatlayiniz

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);  //21:38:34.769877


        //hh==>12 lik nsaat sistemini kullanir  - HH 24 luk saat sistemini kullanir
        //hh kulandiginizda AM veya PM demelisiniz,bunu demek icin "a" yazmaniz yeterlidir.Yani; "hh:mm a"
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh-mm-ss a");
        System.out.println(dtf.format(myTime)); // 09-44 ÖS  /09-49-24 ÖS




    }
}
