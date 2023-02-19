package practice_daytime.daytime04;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        /*

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

       int numberofbananas = 165 ;

       int survivaldays = 1 ;

       boolean monkeyalive=true;


       do{
           System.out.println("********** maymunlar gunde 4 muz yer");
            numberofbananas-=4; //toplam muz sayisindan hergun 4 muz eksiltir
           System.out.println("Kalan muz sayisi " + numberofbananas);
            survivaldays++;

            if(numberofbananas<4){
                monkeyalive=false;
                System.out.println("Bugun "+survivaldays+" .gun; yeterli muz kalmadi, maymun oldu");
                System.out.println("Maymun" + survivaldays+" . gun oldu");
            }else {
                System.out.println("Bugun " +survivaldays+ " .gun; maymun hala yasiyor ");
            }

       }while (monkeyalive);







    }
}
