package day22staticblocksconstructors;

    /*
                                    Constructor Nedir?
        Class tan obje uretmemize yarayan code block laridir.

        Class olusturdugumuzda java bize otomatik olarak bir constructor verir.
        Ama bu constructor gozle gorulmez (invisiable), gozle gorulmeyen otomatik olarak Java tarafindan verilen bu constructor lara
        "default constructor" denir.

        "default constructor" lar "Car( ){ }" seklindedir.

        Siz kendi constuctor unuzu olusturdugunuzda java default constructor i siler.

        Bir Class ta farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.

        Farkli constructor lar sayesinde bir Class tan farkli farkli objeler olusturabiliriz.

        Interview Sorusu: Method ile constructor farki var midir? Varsa nedir?
        Cevap:            Method ile constructor farkli yapilardir
                        i) Methodlarda "return type" vardir ama constructor da yoktur
                        ii)Methodlarin ismi yaptiklari ise gore developer tarafindan belirlenir.
                           Constructorlarin ismi ise her zaman Class ismi ile aynidir.

     */

public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;


    public Car(String make, String model, int year, boolean hybrid ){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    public Car(String make,String model){
        this.make=make;
        this.model=model;
        if(year==2023){
            this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;
         }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // CONSTRUCTOR URETMEK
    // Class in icinde sag tikla - generate gel - to Strig tikla - hepsinin secilmis oldugundan emin ol, ok bas

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
