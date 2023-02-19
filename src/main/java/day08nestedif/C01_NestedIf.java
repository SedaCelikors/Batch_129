package day08nestedif;

import java.util.Scanner;

public class C01_NestedIf {

    /*
        TASK: Kullanicidan 3 tane pozitif bir tamsayi aliniz
              Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
              Eger ucgen ise "eskenar ucgen" olma durumunu kontrol ediniz.


            INFO :
            Ucgen olma sarti : Herhangi iki kenar toplami ucuncu kenardan buyuk olmali
                               HErhangi iki kenar farki ucuncu kenardan kucuk olmali

            a+b>c>a-b
            a+c>b>a-c
            b+c>a>b-c

            a=b=c ise eskenar ucgen

            Java nested kodlari calistiriken cok zaman harciyor
            Buna "time complexity" deniyor
            Bu yuzden mumkunse nested kod yazilmamali
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ucgenin uc kenar uzunlugunu giriniz...");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) { //ucgen olma durumu


            if (a == b && b == c && a == c) {
                System.out.println("eskenar ucgen");
            } else {
                System.out.println("ucgen ama eskenar ucgen degildir");
            }

        } else { //ucgen olmama durumu
            System.out.println("ucgen degildir");
        }


        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz, uckenari birbirinbe esitse eskenar ucgen yazdiriniz,
        //sadece iki kenar uzunlugu birbirine esitse ikizkenar ucgen
        //tum kenarlari birbirinden farkli ise cesitkenar ucgen yazdiriniz

        System.out.println("Lutfen ucgenin uc kenar uzunlugunu giriniz...");

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();



       if (x + y > z && x - y < z && x + z > y && x - z < y && y + z > x && y - z < x) {

           if (x == y && y == z && x == z) {
               System.out.println("eskenar ucgen");
           } else if (x == y || y == z || x == z) {
               System.out.println("ikizkenar ucgen");
           } else {
               System.out.println("cesitkenar ucgen");
           }
       }else{
           System.out.println("ucgen degildir");
       }




    } // main body

} // class body
