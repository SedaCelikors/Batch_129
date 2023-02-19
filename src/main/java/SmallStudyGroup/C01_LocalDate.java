package SmallStudyGroup;

import java.time.LocalDate;

public class C01_LocalDate {

    public static void main(String[] args) {
/*
        soru 1)
        -bugunun tarihini obje olusturarak yazdirin
        -bugun yilin kacinci gunu oldugunu yazdirin
                -hangi gunde oldugumuzu yazdirin
                -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
        sout(tarih.plusYears(3).plus.Months(5).plusDays(7))
                -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
        -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
        -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
 */
        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);
        System.out.println(bugun.getDayOfYear());
        System.out.println(bugun.getDayOfWeek());
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7));
        LocalDate tarih = LocalDate.of(2023,11,10);
        System.out.println(tarih.isBefore(bugun));
        if (tarih.isBefore(bugun)){
            System.out.println(tarih);
        } else if (bugun.isBefore(tarih)) {
            System.out.println(bugun);
        }else System.out.println("iki tarih birbirine esit");


    }
}