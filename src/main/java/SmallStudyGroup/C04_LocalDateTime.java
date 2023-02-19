package SmallStudyGroup;

import java.time.LocalDateTime;

public class C04_LocalDateTime {


    /*
         soru 3)
 bize bugunun tarihini ve su anki saati dondurun
 bize 3 ay 100 saat sonraki tarih ve saati dondurun
 bize 100 gun once 100 saat sonraki tarihi dondurun
 bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
 bize sadece bugunun tarihi dondurun
          */

    public static void main(String[] args) {


    LocalDateTime bugun= LocalDateTime.now();
        System.out.println(bugun);
        System.out.println(bugun.plusMonths(3).plusHours(100));
        System.out.println(bugun.minusDays(100).plusHours(100));
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(10).plusHours(1000).getDayOfWeek());
        System.out.println(bugun.toLocalDate());


}
}