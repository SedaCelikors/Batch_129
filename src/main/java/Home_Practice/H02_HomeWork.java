package Home_Practice;

import java.util.Scanner;

public class H02_HomeWork {




    public static void main(String[] args) {



    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */

       /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    System.out.println(" Pozitif sayi giriniz");
    Scanner input = new Scanner(System.in);
/*    int sayi = input.nextInt();

   int sayac = 0;
    int i;

if (sayi>0) {

        for (i = 1; i <= sayi; i++) {
            if (sayi % i == 0)
                sayac++;
        }
        if (sayac == 2) {
            System.out.println("Asal");
        } else {
            System.out.println("Asal Değil");
        }
    }else System.out.println("Pozitif sayi giriniz");


    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
        System.out.println("Cumle giriniz");
        String cumle1 = input.nextLine();
        System.out.println("Hangi harfe bakacaksiniz");
        char ch = input.next().charAt(0); //tek bir karakter aliyoruz
        int sayac1 = 0;

        for (int i = 0; i < cumle1.length(); i++) {

            if (cumle1.charAt(i) == ch) {
                sayac1++;
            }
        }
        System.out.println(ch + " harfi " + sayac1 + " kere var");

          /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
}
}