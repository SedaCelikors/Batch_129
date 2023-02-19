package day20passbyvaluemethodoverloading;

public class MethodOverLoading01 {

    /*
    1) Method Overloading yapilirken method ismi degistirilmez
    2) Method Overloading yapilirken parametreler degistirilir
        i)  Parametre degistirirken parametrelerin data tipleri degistirilir
        ii) Parametre degistirirken parametrelerin data tipleri farkli ise yerleri degistirilebilir
        iii)Parametre degistirirken parametrelerin sayisi degistirilebilir
     3) Java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir
        Bu yuzden isim ve parametre "method signatura" olarak adlandirilir
     4) Method overloading olusturuken return type i degistirmenin hicbir etkisi yoktur
        Method overloading olusturuken access modify  i degistirmenin hicbir etkisi yoktur
        Method overloading olusturuken methodu static veya non static yapmanin hicbir etkisi yoktur
        Method overloading olusturuken method body i degistirmenin hicbir etkisi yoktur
     5) Private method lar overload edilebilir. Cunku method overloading sadece 1 class in icinde olur.
        Private olmak ise baska class lara gidildiginde problem olusturur.
     6) Static methodlar overload edilebilirler.

     */



    public static void main(String[] args) {

        add(3,5);

    }

    private static void add(int a, int b){       //1.add methodu
        System.out.println(a+b);
    }

    private static void add(double a, double b){ //2.add methodu
        System.out.println(a+b);
    }

    private static void add(double a, int b){     //3.add methodu
        System.out.println(a+b);
    }

    private static void add(int a, double b){   //4.add methodu
        System.out.println(a+b);
    }

    private static void add(int a, int b, int c){  //5.add methodu
        System.out.println(a+b+c);
    }


}
