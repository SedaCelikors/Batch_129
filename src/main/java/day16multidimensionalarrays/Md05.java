package day16multidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Md05 {

    public static void main(String[] args) {

        //Example 1: Bir integer multidimensional array olustur
        //          Bu array deki tum elemanlarin carpimini consol a yazidran kodu yaz


        int a[][] = {{21, 5}, {14, 70, 11}};

        int mlt = 1;

        for (int[] w : a) {

            for (int k : w) {
                mlt = mlt * k;
            }
        }
        System.out.println(mlt);


    }
}
