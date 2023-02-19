package day29exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {

    /*
    8) InputMismatchExceptions
     */

    public static void main(String[] args) {

        //Verilen bir array den kullanicidan index isteyin, verilen index teki datayi yazdirin.

        int arr[] = {2,3,5,9,7,45};
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen index icin sayi giriniz");
        //
        int index = 0;
        try {
            index = input.nextInt();
            System.out.println("girilen index teki eleman : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz indexte eleman arrayde yok " + e.getMessage());
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("girdiginiz index sayi olmali " +e.getMessage());
            e.printStackTrace();
        }


        System.out.println("durmak yok yola devam");




    }//main


}//class
