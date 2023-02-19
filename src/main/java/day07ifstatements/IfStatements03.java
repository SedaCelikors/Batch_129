package day07ifstatements;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {

        //Example 3: Verilen bir sayinin pozitif neganif veya notr oldugu kodu yaz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        if(num>0){
            System.out.println("pozitif...");
        }else if (num<0){
            System.out.println("negatif...");
        }else{
            System.out.println("notr");
        }

    }
}
