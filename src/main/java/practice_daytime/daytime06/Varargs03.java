package practice_daytime.daytime06;

public class Varargs03 {

    public static void main(String[] args) {

        //Kactane String verilirse verilsin iclerinden enuzun olani veren kodu yaziniz.

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnan";
        String str5 = "Sahsanem";

        enUzsunIsim(str1,str2,str3,str4,str5);


    }//main

    private static void enUzsunIsim(String... str) {

        String enUzunStr = "";

        for (String w : str) {

            if(w.length()>enUzunStr.length()){
                enUzunStr=w;
            }

        }

        System.out.println("enUzunStr = " + enUzunStr);

    }
}//class
