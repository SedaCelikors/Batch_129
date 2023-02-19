package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        //DATE CLASS

        Date myDate = new Date();    // Date objesi olusturuldu
        System.out.println(myDate);  // Sat Jan 07 23:26:32 EET 2023
        System.out.println(myDate.getTime()); // 1673123316618==>1 ocak 1970 den suana kadarki milisaniye miktari/dijitaltime

        //Icinde bulundugumuz an nasil aliniz? Currenttime
        System.out.println(LocalDate.now()); //2023-01-07

        System.out.println(LocalTime.now()); //23:34:36.589661500

        System.out.println(LocalDateTime.now()); //2023-01-07T23:36:06.871654400

        //Dunyanin herhangibir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-08T05:45:29.065410800
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow"))); //2023-01-07T23:46:16.176327200

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));  //2030-07-12

        //Geri bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3)); //02:56:23.833826300


        //Geri bir tarihe nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));

        //Zaman da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());

        //Tarihte belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth()); //JANUARY:8

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005,2,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);  //true

        //Tarih'lerin formatlari nasil degistirilir?
        //M-->Tek rakamla ay  no'sunu yazar - MM--> Iki rakamla ay no'sunu yazar
        //MMM-->Ay isminin ilk uc harfini yazar  -  MMMM-->Ay isminin tamamini yazar

        //d-->Tek rakamla gun no'sunu yazar   -   dd-->Iki rakamla gun no'sunu yazar

        //yy-->Yilin son iki rakamini yazar   -   yyyy--> Yilin tamamini yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");

        System.out.println(dtf.format(LocalDate.now()));//07/01/2023



    }





}
