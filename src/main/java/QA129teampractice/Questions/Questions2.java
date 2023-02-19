package QA129teampractice.Questions;

import java.util.Arrays;

public class Questions2 {

    public static void main(String[] args) {

        int b[][] = new int[3][2];

        b[0][0] = 5;
        b[0][1] = 12;
        b[1][0] = 81;
        b[1][1] = 45;
        b[2][0] = 123;
        b[2][1] = 0;
        System.out.println(Arrays.deepToString(b));




 /*     int sum = 0;

        for ( int [] w:a ) {
            sum=sum+w.length;
            }
        System.out.println(sum);
        */

     /*   int sum = 0;
        for ( int [] w:a) {
            for (int k : w){
                sum = sum + k;
            }
        }
        System.out.println(sum);
        */

        int a[][] = { {13,213,4}, {12,87}, {4,7,1,9}, {99} };

        int sum = 0;
        for ( int [] w:a ) {
            sum=sum+w.length;
        }
        System.out.println(sum);

        int c[] = new int[sum];
        System.out.println(Arrays.toString(c)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int idx = 0;

        for ( int [] w : a){
            for(int k : w){
                c[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(c));



    }

}
