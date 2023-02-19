package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {

        //Example 1: Size verilen bir String i tersten yazdir
        //           "Germany"

        String s="Germany";
        String t="";

        for (int i=s.length()-1; i>=0 ; i--){
            t = t + s.charAt(i);
        }
        System.out.println(t);



        //Example 2: Size verilen bir String i "Palindrome"  olup olmadigini kontrol eden kodu yaziniz
        //           civic , nalan , kucuk ==> Palindrom


        // LOGIC = String i ters cevir , sonrada duz hali ile ters halini karsilastir, ayni ise Palindrome de
        String duz = "civic";
        String ters = "";

        for (int i=duz.length()-1; i>=0 ; i--){
            ters = ters + duz.charAt(i);
        }
       if (duz.equalsIgnoreCase(ters)){
           System.out.println(duz + ": palindrom dur");
       }else{
           System.out.println(duz + ": palindrom degildir");
       }


    }
}
