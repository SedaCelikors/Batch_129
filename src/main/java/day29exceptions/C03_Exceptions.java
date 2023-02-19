package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions {

    public static void main(String[] args) throws IOException {

      //  available ()==Kullanilabilir byte sayisini bize dondurur

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/day29exceptions/TaskExceptions");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Kullanilabilir byte sayisini bize verir" + fis.available()); //5923

        //Dosyadan 3 byte lik data okudu
        fis.read();
        fis.read();
        fis.read();
        System.out.println("Kullanilabilir byte sayisi" + fis.available()); //5920\za





    }//main
}//class
