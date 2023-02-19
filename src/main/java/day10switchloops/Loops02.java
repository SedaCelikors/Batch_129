package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        //Example 1: 21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tum tam sayilari ekrana yazdir

        for (int i=21 ; i<181 ; i++){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();


        //Example 2: Size verilen kucuk harf ile yazilmis String in index i cift sayi olan karakterlerini buyuk harf yapiniz
        //           ankara ==> AnKaRa

        //NOTE: Bir String te son index = lenght()-1


        String s="ankara";

        String t = "";

        for (int i=0; i<s.length();i++ ){

            String ch = s.substring(i,i+1);

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }











    }
}
