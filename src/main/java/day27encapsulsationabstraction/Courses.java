package day27encapsulsationabstraction;

public abstract class Courses {

    /*
         1) Bazen method body'sini yazmak gerekme, bu durumlarda body'siz method olusturmak gerekir.
        Body'si olmayan method'lara "abstract method"lar denir.
    2) Abstract method'lar child class'lar tarafından "override" edilmek zorundadirlar.
       Bu yüzden,eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz.
       o method'u abstract yapmak gerekir.
    3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
       "acces modifier" ile "return type" arasine "abstract" keyword koymak gerekir.
    4) "abstract method"lar siradan class'larin icine yazilamazlar. "abstract method"larin icine yazildiklari classlar'da
    abstract olmak zorundadirlar.
    5)  "abstract class" larda hem "abstract method" hem de "concrete method" lar kullanilabilir.
    6)  "concrete class"lar "abstract class"ların child'ı olabilirler.
     "abstract method"ların override edilme zorunluluğu concrete class'lar içindir.


     */

    public abstract void math();

    public void art(){
        System.out.println("painting");
    }


    //final method lar override edilemzler, halbuki abstruct method lar override edilmek icin olusturulurlar.
    //Bu celiskidir, bu yuzden Java abstruct methodlarin final olmasina musade etmez.
    //public final abstract void science();


    //Concrate class lar final oldugunda Child Class'a sahip olamazlar.
    //Ama "Abstract Class"lar icin Child Class olmalidir, cunku Child Class lar abstract parent class taki abstract methodlari kullanir
    //Bu yuzden Java "abstract Class" larin "final" olmasina musade etmez.

    //"Abstract method" lar "private"olamazlar, cunku Child Class lar abstract methodlari kullanirlar, private yapinca kullanima kapali olur.
    //Bu celiskidir,bu yuzden Java abstract method larin "private" olmasina musade etmez.

    //"abstract method" lar "static" olamazlar, cunku static method'lar override edilemez,
    // halbuki abstract method'lar override edilmek icin olusturulmustur.



}
