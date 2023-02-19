package day08nestedif;

import java.util.Scanner;

public class C03_NestedIf {

    /*

    Kullanicidan "0" dan kucuk 120 den buyuk deger giremeyecek sekilde datalari aldiktan sonra
    Eger calisan KADIN ise 60 yasindan buyuk ise EMEKLI OLABILIR yazdiran kod
    Eger calisan ERKEK ise 65 yasindan buyuk ise EMEKLI OLABILIR yazdiran kod

   */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz \nKadin icin K harfi \nErkek icin E harfi giriniz");
        char cinsiyet=input.next().toUpperCase().charAt(0); //kullanicinin verdigi harfi buyuk harfe cevirdim

        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();


        if(cinsiyet =='K'){ //outer if
            if(yas < 0 || yas > 120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas>60) {
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsin " +  (60-yas) + " yil calisman gerekir");
            }

        } else if (cinsiyet =='E') {

            if(yas < 0 || yas > 120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas>65) {
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsin " + (65-yas)+" yil calisman gerekir");
            }



        }else{
            System.out.println("lutfen cinsiyet icin gecerli bir harf giriniz");
        }


    }

}
