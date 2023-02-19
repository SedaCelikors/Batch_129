package practice_daytime.daytime10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;

public class CollectionsMethods {

    // Kullanıcıdan 5 sayıdan olusan
    // bir liste isteyin.
    // listeyi sirala ve tersten yazdir  //sort - reverseOrder
    // listeyi karıştırin ve yazdırin  //shuffle
    // 3'er sağa kaydirin ve yazdırin  //rotate -
    //maksimim ve minimum sayiyi bul yazdir
    //tum minumum sayilarin yerine minimum sayiyi yazdir

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Scanner input= new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen sayi giriniz");
            arrList.add(input.nextInt());
        }
        System.out.println("arrList = " + arrList); //arrList = [4, 5, 6, 7, 8]

        //Listeyi sirala ve tersten yazdir
        arrList.sort(Collections.reverseOrder());
        System.out.println("tersten arrlist = " + arrList);

        //Listeyi karistir ve yazdir
        Collections.shuffle(arrList); //shuffle random olarak karistirir
        System.out.println("karistirdiktan sonra arrList = " + arrList);

        //3 er saga klaydir yazdir
        Collections.rotate(arrList,3);
        System.out.println("3 er saga kaydirilmis arrList = " + arrList);

        //max ve min sayilari bul
        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        //max yerine min, min yerine max
        Collections.replaceAll(arrList,max,min);
        System.out.println("max degerlerin yerine min geldikten sonra arrList = " + arrList);





    }
}
