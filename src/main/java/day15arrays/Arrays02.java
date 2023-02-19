package day15arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 2:Bir String teki sesli harflerin sayisini bulan kodu yaziniz
        //          a-e-i--o-u - A=E-I-O-U

        String s = "Java brings you money";

        //1.YOL : use replaceALL()
          int vowels = s.replaceAll("[^aeiouAEIOU]", "").length();
          System.out.println(vowels); // 7

    //************************************************************************************************
        //2.YOL : use Array - Loop
        String letters[] = s.split("");  // SPLIT - PARCALAMAK
        System.out.println(Arrays.toString(letters)); // TUM KARAKTERLERI VERDI //[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        int counter = 0;

        for (String w : letters) {

            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;

            }

        }
        System.out.println(counter);  // 7


    }

}
