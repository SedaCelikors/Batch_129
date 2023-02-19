package day07ifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        //Example 2:Kullanicidan alinan sayinin tek mi cift mi yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        //1.Yol :
        if(num%2==0){
            System.out.println("cift sayi...");
                    }
        if(num%2!=0){
            System.out.println("tek sayi...");
        }

        //2.Yol :
        if(num%2==0){
            System.out.println("cift sayi...");
        }else{
            System.out.println("tek sayi...");
        }



    }

}
