package day14arraysforeachloops;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1:string Array olustur' icine 5 tane eleman ekleyin'\ ilk eleman ile son elemanin
        //          icerdigi karakter sayilari toplamini ekrana yazdier
        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length-1].length()); //7


        //Example 2:string Array olustur' icine 5 tane eleman ekleyin' tum elemanlarin icerdigi  karakter sayilari
        //          toplamini ekrana yazdier

        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Atina";

        //1.YOL : FOR LOOP

        int totalChar = 0;

        for (int i = 0 ; i< brr.length ; i++)  {

            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar); //32

        //2.YOL:FOR EACH LOOP(enhanced loop)==> baslangic degeri'loop un caslisma sarti' ve increment/decrement kismini kendi halleder
        //      FOR EACH LOOP "Array" lerde ve "Collection" larda kullanilir.
        //      Index kullanmaniz gerektiginde bazen for each loop caresiz kalir, mecburen diger loop lar kullanilir.

       int sum = 0 ;

        for (String w : brr){
            sum = sum + w.length();
        }
        System.out.println(sum);


    }


}
