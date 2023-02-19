package day16multidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        //Multidimensional Array masil olusturulur ? a=[[5,12],[81,45],[123,0]]
        int a[][] = new int[3][2];

        //Multidimensional Array masil yazdirilir ?  //DEEP TO STRING
        System.out.println(Arrays.deepToString(a)); //[[0, 0], [0, 0], [0, 0]]

        //Multidimensional Array lere eleman nasil eklenir ?
        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 0;
        System.out.println(Arrays.deepToString(a));  //[ [5, 12], [81, 45], [123, 0] ]

        //NOTE: Array lere non-primitive data konulamaz
        //      Array lere primitive data veya referance konulur.
        //      Siz bir Array i yazdirmak istediginizde java adresler yardimi ile non-primitive data ya ulasir
        //      ve o non-primitive data yi sanki Array in icindeymis gibi gosterir.


        //Multidimensional Array lerdeki belli elemanlara nasil ulasilir ?
        System.out.println(Arrays.toString(a[2]));   //[123, 0]
        System.out.println(a[1][0]); //81

        System.out.println(Arrays.toString(a[0]));  //[5,12]
        System.out.println(a[2][1]);  // 0

    }
}
