package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: Verilen bir string te ilk 'a' harfinden onceki tum karakterleri ekrana yazdir
        //          " I love Java" ==> I Love J

        String s = "Tranvay";

        for (int i = 0; i<s.length();i++){

            char ch=s.charAt(i);  // charat i memory koyuyoruz sonra oradan cagiriyoruz

            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }


        System.out.println();

        //Example 2: Verilen bir String te son 'a' dan sonraki tum karakterleri ters sirada yazdir
        //          'Germany' ==> yn

        String s1= "Germany";

        for( int i=s1.length()-1; i>=0 ;i--){


            char ch=s1.charAt(i);

            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }





    }
}
