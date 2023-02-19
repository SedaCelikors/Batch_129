package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {

    /*
    Kullanicidan baslangic ve bitis degerlerini alin, baslangic degerinden baslayip bitis degerine kadar tum tamsayilari
    ekrana yazdir
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic = input.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis = input.nextInt();


      if (baslangic>bitis){
          System.out.println("baslangic degeri bitis degerinden kucuk olmali");

      }else {

          for (int i = baslangic; i <= bitis; i++) {
              System.out.print(i + " ");

          } // for i

      } // else


 /*
    ODEV
    Kullanicidan baslangic ve bitis degerlerini alin, baslangic degerinden baslayip bitis degerine kadar tum
    cift sayilari ekrana yazdir   10 - 12 -14
     */



    }



}
