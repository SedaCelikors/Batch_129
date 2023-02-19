package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {

    public static void main(String[] args) {

        /*
        1) Arraylist ler coklu data depolamak icin kullanilir.
        2) Arraylist ler non-primitive data tipindeki coklu datalari depolamak icin kullanilir
            List ler non-primitive data kabul ederler, "Array"ler ise primitive data veya referance data kabul ederler.
        3) Arraylist leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yok
           List ler eleman sayisinda "flexible" dirlar ama "ARRAY"ler "flexible" degildirler
        4) Madem "Array"ler eleman sayisinda flexible degil nicin java Array leri iptal etmedi?
           i)Eleman sayisi belli olan data lariu depolamak icin Array ler tercih edilir
           ii)Array ler cok hizli calisir
           iii)Array ler memory de cok az yer kaplar

         */

        //List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages); // []

        //List eleman nasil eklenir?
        //List e eleman eklemek icin add methodunu kullaniriz
        //add methodu elemanlari sizin verdiginiz sirada list e ekler. (Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);

        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages); //[9, 656, 12, 777, 10, 888]

        //List e coklu eleman nasil eklenir? veya List e baska bir List nasil ekleniz?Iki List nasil birlestirilir?
        //Bir List e coklu eleman eklemek icin o elemanlari once bir List in icine koymalisiniz

        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges); //[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]
        System.out.println(ages); //[9, 656, 12, 777, 10, 888, 8, 9, 10]

        //Bir Listteki tum elemanlari nasil silebilirim?
     //   ages.clear();
       // System.out.println(ages); //[]

       //Bir elemanin List te varolup olmadigini nasil konrol ederiz?
        boolean r = ages.contains(656);
        System.out.println(r);

        //Bir List in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki list in esit olabilmesi icin ayni index te ayni elemanlar olmalidir.
        ArrayList<String> name1 = new ArrayList<>();
        name1.add("Tom");
        name1.add("Jim");
        name1.add("Kim");

        ArrayList<String> name2 = new ArrayList<>();
        name2.add("Tom");
        name2.add("Kim");
        name2.add("Jim");

        boolean s = name1.equals(name2);
        System.out.println(s); //false

        //Example 1:Verilen 2 integer list te tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaz

           /*
        Collections : Coklu Datanin bir araya konulmasi demektir.
        List'ler Collections 'in bir parcasidir.Bu nedenle
        Collections'lara gidip methodlari List'ler icin kullanilabilir.
         */

        ArrayList<Integer>nums1=new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2=new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);

        Collections.sort(nums2);

        boolean t =nums1.equals(nums2);
        System.out.println(t);


    }
}
