package day22staticblocksconstructors;

public class StaticBlocks01 {

// Bir variable olusturdugunuzda, deger atamazsaniz o variable i "initialize" etmediniz demektir
// Static Variable lar static block lar icinde initialize edilirse o class in  icinde herseyden once hazir hale getirilmis olur
// Bazen main method calistiirlmadan once variable larin hazire hale getirilmesi gerekir bu yuzden statc block lar kullanilir

    //NOTE 1:Sttatic Block lar static variable lari initialize etmek icin kullanilirlar
    //NOTE 2:Sttatic Block lar class icinde herseyden once calistirilirlar....

    static double pi;
    static String shape;

    static{
        pi = 3.14;
        System.out.println("Static Block 1");
    }

    static {
        shape = "circle";
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }

}
