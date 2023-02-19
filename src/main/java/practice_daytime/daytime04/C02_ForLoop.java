package practice_daytime.daytime04;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        /*

        Kullanicidan string bir ifade aliniz
        Harflerini altalta gelecek sekilde
        " " bosluk  veya "a" harfi geldiginde yazdirmayan diger karakterleri yazdiran kodu yaz

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen string bir ifade giriniz");
        String str = input.nextLine(); //gazi antep

        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i) ==' ' ){
                continue;
            }
            System.out.println(str.charAt(i));
        }



    }
}
