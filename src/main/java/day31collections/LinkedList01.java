package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*
      1)Interface lerden object olusturulamaz cunku interface lerin constructor i yoktur.
      2)Abstruct class lardan object oilusturulamaz, constructor lari vardir ama constructor object olusturmada kullanilamaz.
      3)Interface lerin constructor lari olmadigindan collection olustururken interface isimleri "new" keywordunden sonra kullanilamaz.
      4)*class     --> class     ==> extends
        class     --> interface ==> implements
        *interface -->interface  ==> extends
        interface -->class ==> Bu mumkun degildir
     5)LINLEDLIST ==> Eleman silme-ekleme cok basarilidir. Index kullanmaz.
     6)LINKEDLIST lerde eleman kelimesi yerine "NODE" denir. LinkedList bas Node manasinda "HEAD", son Node "TAIL" denir.

     7)LinkedList ler index kullanmadiklarindan eleman silme - eklemede "RE-INDEX" yapilmasina gerek yoktur.
       Bu yuzden ekleme ve silmanin cok yapilmasi gereken durumlarda "LINKEDLIST" kullanmak tavsiye edilir.
     8)LINKEDLIST = SEARCH islemi zor yapilir, LinkedList ler index kullanmaz.Index kullanmadigi icin herhangibir elemani bulmak icin
       tum elemanlar kontrol edilir, bu da cok fazla is demektir.

    //NOT:Array List ler eleman silme - eklemede basarisizdirlar. Bu yuzden eleman silme-ekleme islemleri coklukla
    //    yapilacaksa ArrayList tavsiye edilmez.
    // ArrayList lerde "SEARCH" islemi kolay yapilir, cunku index ler adres gibidir.
*/
    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names); //[Steve, Carl, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names); //[Cuneyt, Steve, Carl, Raj, Megan, Brandon]

        names.addLast("Ajda");  //"addLast()" method is equivalent to "add()"
        System.out.println(names); //[Cuneyt, Steve, Carl, Raj, Megan, Brandon, Ajda]

        names.add(3,"Suleyman");
        System.out.println(names); //[Cuneyt, Steve, Carl, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda"); // Ilk Ajda yi siler ve Loop u kirar.
        System.out.println(names); // [Cuneyt, Steve, Carl, Suleyman, Raj, Megan, Brandon]

        names.remove(4);
        System.out.println(names);//[Cuneyt, Steve, Carl, Suleyman, Megan, Brandon]

        names.add("Suleyman");
        System.out.println(names);

        String r1=names.remove(); //ilk elemani siler    CUT + PASTE
        System.out.println(r1);  //Cuneyt
        System.out.println(names);//[Steve, Carl, Suleyman, Megan, Brandon, Suleyman]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names); //[Steve, Carl, Megan, Brandon, Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names); //[Steve, Carl, Megan, Brandon]


        //Retrieves, but does not remove, the head (first element) of this list. (COPY + PASTE)
        //Returns: the head of this list, or null if this list is empty
        //Ilk elemani silmdeden size verir
        String r2 = names.peek();
        System.out.println(r2);  // Steve
        System.out.println(names); //[Steve, Carl, Megan, Brandon]


        //Retrieves and removes the head (first element) of this list. (CUT + PASTE)
        //Returns:the head of this list, or null if this list is empty
        //remove() bos LinkedList te kullanilirsa "hata verir", Poll() bos LinkedList te kullanlirsa "Null" verir.
        names.poll();

        //Pops removes and returns the first element of this list. (CUT + PASTE)
        //This method is equivalent to removeFirst()
        names.pop();



    }
}
