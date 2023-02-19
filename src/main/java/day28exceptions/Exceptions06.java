package day28exceptions;

public class Exceptions06 {

    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChar(s);//4

        String t="";
        getNumberOfChar(t);//0

        String u =null;
        getNumberOfChar(u);//?  NullPointerException
    }

    //String in degeri "Null" oldugunda String Class taki bazi method lari kullanamayiz. Kullanirsaniz Java "NullPointerException"atar.
    public static void getNumberOfChar(String s){
        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        }catch (NullPointerException e){
            System.out.println("null degeri icin bazi method lar kullanilamaz");
        }

    }
}
