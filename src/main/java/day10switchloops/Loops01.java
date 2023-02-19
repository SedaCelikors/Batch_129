package day10switchloops;

public class Loops01 {

    /*
                 CADE STANDARTS

         1- TEKRAR OLMAMALI (REPETITION)
         2- DINAMIK OLMALI
         3- TAMIR VE UPDATE KOLAY YAPILMALI (FIX AND UPDATE)

     */

    public static void main(String[] args) {


        //Example 1: Ekrana 5 kere "Hi" yazdiriniz...

        // 1.YOL  = tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.YOL
        // Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" kullanilir
        //Dort tane Loop var: i)for=Loop  ii)while=Loop iii)do-while-Loop iv)for-each-Loop



        //i) FOR-LOOP

       //   baslangic degeri   Loop un calisma sarti   Increment/Decrement
        for (  int  i= 1     ;            i<6        ;          i++        ){

            System.out.println("Hi");
        }

        //Example 2: 11 den 44 e kadar tum tam sayilari ekrana yazdiriniz...

        for (int i=11; i<45 ; i++){
            System.out.println(i);

        }

        //Example 3: 40 dan 23 e kadar tum cift tam sayilari ekrana yazdir

        for ( int i= 40 ; i>22 ; i-- )
           if (i % 2 == 0){
               System.out.println(i);
           }

        //Example 4: 18 den 56 ya kadar tum tek  sayilari ekrana yazdir

        for(int i = 18 ; i<57 ; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }




    }

}
