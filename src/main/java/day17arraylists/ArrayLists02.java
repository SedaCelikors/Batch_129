package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //ArrayList olustururken sag tarafa(consturctor) ArrayList yazmak zorundasiniz.
        //Ama sol tarafa ister ArrayList yazin ister List yazin ikisi de calirir.
        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir List te kac eleman oldugunu nasil anlariz?
        int numOfElement = initials.size();
        System.out.println(numOfElement); //4

        //NOTE: Array lerden bahsederken "lenght" kullanin, List lerden bahsederken "size" kullanilir.

       //Bir List ten istenen bir eleman nasil alinir?
        char u = initials.get(2);
        System.out.println(u);

        //Example 1:Verilen bir string list teki tum elemanlarin toplam karakter sayisini bulan kodu yaziniz.
        List<String> n = new ArrayList<>();
        n.add("Tom");
        n.add("Jim");
        n.add("Kim");

       //1.YOL : Recommended  // Tavsiye edilen yol
        int sum = 0;
        for (String w:n) {
            sum = sum + w.length();
        }
        System.out.println(sum);

        //2.YOL :
        int toplam = 0;
        for (int i = 0; i<n.size();i++){
            toplam = toplam + n.get(i).length();
        }
        System.out.println(toplam);

        //Bir List teki istenen bir elemani nasil degistirebiliriz?
        n.set(0, "Seda");
        System.out.println(n);

        //Example 2:Maas List i olustur ve maaslara %20 zam yap
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        //1.YOL :
//       int idx=0;
//       for (double w : salary) {
//         salary.set(idx,w*1.20);
//           idx++;
//        }
//        System.out.println(salary);

        //2.YOL :
        for(int i=0; i<salary.size(); i++){
            salary.set(i,salary.get(i)*1.20);
        }
        System.out.println(salary);

    }
}
