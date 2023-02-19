package day08nestedif;

public class C02_NestedIf {

    /*

    Password un ilk harfi buyuk harf ise
    'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
    Password un ilk harfi kucuk harf ise
    'z' gecerli password yazdirin degilse gecersiz passworkd yazdirin

     */

    public static void main(String[] args) {

        String pwd = "5xy12!";
        char ilkHarf = pwd.charAt(0);


        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            if(ilkHarf=='A'){
                System.out.println("gecerli password");
            }else {
                System.out.println("gecersiz password");
            }



        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {

            if(ilkHarf=='z'){
                System.out.println("gecerli password");
            }else {
                System.out.println("gecersiz password");
            }

        } else {
            System.out.println("Ilk karakter harf olmali");
        }



    }


}
