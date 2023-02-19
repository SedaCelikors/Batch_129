package day18lists;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1:Integer bir list olustur   //****** REMOVE METHODU ***************
        //          List e 5 tane eleman ekle
        //          Bu elemanlardan 12 yi sil

        List<Integer> ages = new ArrayList<>(); //Integer List olusturuldu
        ages.add(10);           // 5 eleman eklendi
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);

        //Note : Siz java da tam sayi yazdiginizda Java o tam sayinin data tipini otomatik olarak "primitive int" kabul eder.
        //       Bu yuzden remove metodunun icine yazdiginiz tam sayi eleman olarak degil, index olarak kabuyl edilir.
        //       Tam sayiyi eleman olarak gostermenin birkac yolu vardir

        // 1 .YOL
       // Integer nonPrimitive = 12;
       // ages.remove(nonPrimitive);


        // 2 .YOL       // RECOMMENDED *************
       // ages.remove((Integer)12);

        //3 . YOL
       // ages.remove((Integer.valueOf(12)));   // 2 method kullanildi

        //4 . YOL
        //ages.remove(ages.indexOf(12));   // 2 method kullanildi

       // System.out.println(ages);

//**************************************************************************************************************

        //Example 2: Integer bir list olustur   // *******REMOVEALL METHODU *********TUM 12 leri sildi
        //           List e 5 tane eleman ekle
        //           Bu elemanlardan tum 12 leri sil


          List<Integer> nums = new ArrayList<>();
              nums.add(10);
              nums.add(25);
              nums.add(12);
              nums.add(8);
              nums.add(12);

            List<Integer> silinecekler = new ArrayList<>();
            silinecekler.add(12);    // REMOVEALL LIST ister
            silinecekler.add(25);

       //removeALL() methodu List ile calisir
       //removeALL() methodu bir veya birden fazla elemanin tum gorunumlerini silmek icin kullanilir
        nums.removeAll(silinecekler);

        System.out.println(nums);

    }


}
