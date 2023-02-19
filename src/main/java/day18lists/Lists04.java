package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("MAhsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females =new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

       //names.containsAll(females) "names" listinde "females" listindeki tum elemanlarin var olup olmadigini kontrol eder
       //Tamami varsa size "true" verir, herhangibiri yoksa size "false" verir.
        boolean r = names.containsAll(females);
        System.out.println(r);

//**************************************************************************************************************
       //names.subList(1.4) "names" listindeki index i 1.2 ve 3 olan elemanlari bir List in icinde verir
       //Ikinci index olan 4 dahil olmaz.
        List<String> subList = names.subList(1,3);
        System.out.println(subList); // [Cuneyt, MAhsun]

//****************************************************************************************************************

        names.retainAll(females);
        System.out.println(names); //[Ajda]
        System.out.println(females); //[Ajda , Emel}


        //Example 1: Elektronik aletler ve ev aletleri Listleriniz var
        //           Elektronik ev aletlerini listeleyin

        List<String> electronic = new ArrayList<>();
        electronic.add("TV");
        electronic.add("Radio");
        electronic.add("Refrigerator");
        electronic.add("Mobile Phone");
        electronic.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("TV");
        homeGoods.add("Chair");

       //homeGood.retainALL(electronic) homegoods ile elektronik listlerinin ortak elemanlarini homegoods listi icinde verir
       //Baska bir deyisle( In other word) homeGoods listindeki ortak olmayan elemanlari siler
        homeGoods.retainAll(electronic);

        System.out.println(homeGoods);
  //*****************************************************************************************************************
        //isEmpty() Listte hic eleman yoksa size true verir, 1 veya daha fazla eleman varsa false verir
        //isEmpty() esasinda names.size() == 0 demektir

        names.isEmpty();

 //******************************************************************************************************************

        System.out.println(names.hashCode());

    }
}
