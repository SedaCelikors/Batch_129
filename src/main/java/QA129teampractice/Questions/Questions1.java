package QA129teampractice.Questions;

import java.util.Scanner;

public class Questions1 {

    public static void main(String[] args) {

        /* EXAMPLE 8:

    Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.
        - 0-4 arasi "Bebek"
            - 5-12 arasi "Cocuk"
            - 13-20 arasi "Genc"
            - 21-30 arasi "Yetiskin
    Tanimlanmamis Evre
    Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
        */
        Scanner input = new Scanner(System.in);
  /*      System.out.println("lutfen yas degerni giriniz");

        byte yas = input.nextByte();

        if (yas < 0) {
            System.out.println("gecerli bir yas giriniz");
        } else if ( yas < 5) {
            System.out.println("Bebek");

        } else if (yas < 13) {
            System.out.println("Cocuk");

        } else if ( yas < 21) {
            System.out.println("Genc");

        } else if ( yas < 31){
            System.out.println("Yestiskin");
        } else
            System.out.println("gecerli bir yas giriniz");
    } */
//*********************************************************************************************************************
   /*
        EXAMPLE 9:

        Kullanicidan bir gun alin
        - Eger gun cuma ise "Muslumanlar icin kutsal gun"
        - Eger gun cumartesi ise "Yahudiler icin kutsal gun"
        - Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
        Yazdiran kodu yaziniz
        */

 /*       System.out.println("lutfen kutsal bir gun giriniz");

        String gun = input.nextLine().toLowerCase();

        switch (gun) {
            case "cuma":
                System.out.println("muslumanlar icin kutsal gun");
                break;
            case "cumartesi":
                System.out.println("yahudiler icin kutsal gun");
                break;
            case "pazar":
                System.out.println("hiristiyanlar icin kutsal");
                break;
            default:
                System.out.println("lutfen gecerli kutsal bir gun giriniz");

        }*/

//**********************************************************************************************************************
        /*
        EXAMPLE 10:

        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup yazdiriniz.
        */

    /*    System.out.println("bir sayi giriniz");

        double sayi1 = input.nextDouble();

        System.out.println("ikinci sayiyi giriniz");

        double sayi2 = input.nextDouble();

        System.out.println("bir islem giriniz + , / , -, *");

        char islem = input.next().charAt(0);

        if(islem == '+'){
            System.out.println(sayi1+sayi2);
        } else if (islem == '-') {
            System.out.println(sayi1-sayi2);
        } else if (islem== '/' ) {
            System.out.println(sayi1/sayi2);
        } else if (islem =='*') {
            System.out.println(sayi1 * sayi2);
        }else
            System.out.println("gecerli bir islem giriniz");

     */


        //**********************************************************************************************************************


    /*                 ********* if Else Statement *******


    EXAMPLE 11:

    Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin
    kare olup olmadigini yazdiriniz
     */

      /*  System.out.println("1.kenar uzunluklarini giriniz...");
        int kenar1 = input.nextInt();

        System.out.println("2.kenar uzunlugunu giriniz...");
        int kenar2 = input.nextInt();

        kenar2=Math.abs(kenar2);
        kenar1=Math.abs(kenar1);

        if (kenar1 != kenar2) {
            System.out.println("dikdortgen");
        } else if (kenar1 == kenar2) {
            System.out.println("kare");
        }
        */

        //**********************************************************************************************************************

    /*
    EXAMPLE 12:

    Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdiriniz
     */

        System.out.println("bir karakter giriniz...");
        char ch = input.next().charAt(0);




        //**********************************************************************************************************************

    /*
    EXAMPLE 13:

    Kullaniciya yasini sorun, eger yas 65'den kucuk ise "emekli olamazsin, calismalisin",
    65'e esit veya buyukse "Emekli olabilisin" yazdiriniz
     */

        //**********************************************************************************************************************

    /*
    EXAMPLE 14:

    Kullanicidan bir ucgen uc kenar uzunlugunu alin eger uc kenar uzunlugunu birbirine esit ise
    ekrana "Eskenar ucgen " yazdiriniz. diger durumlarda ekrana "Eskenar degil" yazdiriniz
     */

        //**********************************************************************************************************************

    /*
    EXAMPLE 15 :

    Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun isminin 1.,2. ve 3.harflerini
   ilk harf buyuk diger ikisi kucuk olarak yazdirini, gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdiriniz
     */

        //**********************************************************************************************************************

    /*
    EXAMPLE 16 :

    Kullanicidan iki sayi isteyin, sayilarin ikisi de positif ise sayilarin toplamını yazdirin,
    sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere
    sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin, sayilardan sifira esit olan varsa
    "sifir carpmaya gore yutan elemandir" yazdirin.
    */

        //*******************************************************************************************************

    /*

   EXAMPLE 17 :

   Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip yazdirin.
   50'den kucukse "D", 51-60 arasi "C", 60-80 arasi "B", 80'nin uzerinden ise "A"
   */

        //*******************************************************************************************************

    /* Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
            teklif 80.000 arasinda ise "Kabul ediyorum ",
            60 - 80.000 arasinda ise "Konusabiliriz"
            60.000 'nin altinda ise "Maalesef Kabul edemem" yazdirin
            */
        //************************************************************************************************

    /*
    EXAMPLE 18 :

    Nested if kullanarak asagidaki soruyu cozen kodu yaziniz.

    Kullanicidan bir sifre girmasini isteyin

    Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse
    "Gecersiz Sifre" yazdirin

    Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse
    "Gecersiz Sifre" yazdirin
         */
        //************************************************************************************************

    /*
    EXAMPLE 19 :

    Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdigi sayi 5'e bolunuyorsa son rakamini kontrol
    edin. Girdigi sayi 5'e bolunuyorsa son eakamini kontrol edin. Son Rakami 0 ise ekrana "5'e bolunen
    cift sayi" yazdirin . son rakami 0 degil ise "5'e bolunen tek sayi" yazdirin.
    Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
     */
        //********************************************************************************************

    /*
    EXAMPLE 20 :  INTERVIEW QUESTION

    Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.

    Kural 1 : 4 ile bolunemeyen yillar artik yil degildir
    Kural 2 : 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3 : 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 'un kati olan yillar artik yildir
     */
//********************************************************************************************************************************

        //  ****************************Nested If Else Statements *******************


    /*
    EXAMPLE 21 :   INTERVIEW QUESTION

    Kullanicidan artk yil olup olmadigini kontrol etmek icin yil girmesini isteyin.

    Kural 1 : 4 ile bolunemeyen yillar artik yil degildir
    Kural 2 : 4 'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillar artik yildir
     */
        //********************************************************************************************************************************


        //    *****************Ternary **************

    /*
    EXAMPLE 22 :

    Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere gore dikdortgenin
    kare olup olmadigini yazdiriniz
      */

        //************************************************************************************************

    /*
    EXAMPLE 23 :

    Kullanicidan bir sayi alin ve sayi 3 basamakli ise "uc basamakli sayi " , yoksa "Uc basamakli degil " yazdiriniz

     */


    }
}


