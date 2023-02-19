package practice_daytime.daytime04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {


        /*
        Kullanicidan aldiginiz bir String degerde "c" den onceki "a" harfinin string deger icerisinde kac kez
        gectigini bulan kodu yaziniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir data veriniz");
        String str = input.nextLine().toLowerCase();

        int sayac = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'){
                sayac++;
            }else if(str.charAt(i)=='c'){
                break;
            }
        }
        System.out.println("c oncesi 'a' larin sayisi = " + sayac);






    }
}
