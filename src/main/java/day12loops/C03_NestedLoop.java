package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {

     /*
       Example 2: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
*/

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {  // satir kontrolu

            for (int j = 1; j <= i; j++) { //rakam kontrolu     sutun kontrolu

                System.out.print(j + " * ");
            }

            System.out.println(); // alt satira atti

        }

        System.out.println();

        /*

    Example 2: Asagidaki sekil cizen kodu yaziniz
                * * * *
                * * *
                * *
                *
         */

        int satir = 4;    // 4 satirlik yildiz olusturdugumuz icin

        for (int i = 1; i <= satir; i++) {  // satir kontrolu

            for (int j = satir; j >= i; j--) { //yildiz kontrolu     sutun kontrolu

                System.out.print("* "); //yildiz yazdirir
            }

            System.out.println(); // alt satira atti

        }


        /*
        Example 3: Satir sayisini kullanicidan alarak yukaridaki sekli yazdir

             *
            * *
           *   *
          *     *
         * * * * *

         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen satir sayisini gir");
        int row = input.nextInt();


        for (int i = 1; i <= row; i++) {//satir kontrol
            for (int bosluk = row; bosluk >= i; bosluk--) {// bosluk kontrol
                System.out.print(" ");

            }
            for (int yildiz = 1; yildiz <= i; yildiz++) {//* kontrol

                if (yildiz == 1 || yildiz == i) {
                    System.out.print("* ");//en distaki yildizlar
                } else if (i == row) {
                    System.out.print("* ");//en alt *
                } else
                    System.out.print("  ");//3. ve 4.satir
            }
            System.out.println();

        }
    }

}












