package day14arraysforeachloops;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example 1: String bir array olustur' 6 tane eleman yerlestir, karakter sayisi 5 ten cok olan elemanlari sil

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors)); // [Red, Orange, Blue, Yellow, Green, Brown]

        //LOGIC : Yeni bir array olusturup'karakter sayisi 5 ve 5 ten kucuk olan
        //        elemanlari yeni array e transfer edecegiz. Boylelikle yeni array de
        //        karakter sayisi 5 ten buyuk olan hicbir eleman olmayacak.

        //SORU : Hocam, array olusturmak icin 2 sey belirlenmeli;
        //      1 - Elemanlarin data type
        //      2- Yeni array de kac tane eleman olacak

        //Verilen array de eleman sayisi 5 ve 5 ten kucuk olan kac eleman var

        int counter = 0;

        for(String w : colors){
            if (w.length()<=5){
                counter++;
            }
        }

        //Yeni array olustur
        String newColors [] = new String[counter];

        //karakter sayisi 5 ve 5 ten kucuk olanlari yeni array e transfer et
       int idx = 0;
        for (String w : colors){
            if(w.length()<=5){
                newColors[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors)); //[Red, Blue, Green, Brown]



    }


}
