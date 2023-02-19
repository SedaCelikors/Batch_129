package day20passbyvaluemethodoverloading;

public class PassByValue02 {

    public static void main(String[] args) {

        String name = "Tom Hanks";   // sonuna junior eklenecek

        String updatedName = updateName(name,  "Junior");

        System.out.println(name); //Tom Hanks   - ORJINAL
        System.out.println(updatedName); // Tom Hanks Junior  - PASS BY VALUE


        name = updateName(name,  "Junior");
        System.out.println(name);  //  Tom Hanks Junior  - ORGINAL DEGISTI


    }


    public static String updateName(String name, String add){

        name = name + " " +  add;

        return name;
    }

}
