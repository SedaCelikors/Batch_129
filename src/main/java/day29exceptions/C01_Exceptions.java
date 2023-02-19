package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class C01_Exceptions {

    public static void main(String[] args) throws IOException {

        /*
        FileNotFoundExceptions : Java da bir dataya ulasmak istedigimizde kullaniriz.
        Bir object olustururuz.cesitli method lari vardir.
        read(): Task teki datalari okuyor ve getiriyor.Okuyacak hicbir data kalmadiginda -1 dondurur.
        skip(): Belirli bir kismi atlayip kalan datalari dondurur.
        avalaible(): Task te kac byte lik data oldugunu size gosterir

         */

        FileInputStream fis = new FileInputStream("src/main/java/day29exceptions/TaskExceptions");

        int i;

        try {
            while ((i = fis.read()) !=-1){
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File Path yanlis ya da dosya silinmis : " + e.getMessage()); //yazdirma
            e.printStackTrace(); // yazdirma

        }catch (IOException e){
            System.err.println("dosya okurken problem olustu :" + e.getMessage());

        }

    }
}
