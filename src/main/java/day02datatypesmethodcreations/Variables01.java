package day02datatypesmethodcreations;

public class Variables01 {

    //Primitive data types--> char - boolean - byte - short - int - long - float - double
    //float : Virgullu sayilar (Ondalik sayilar - Decimal Numbers) icin kullanilir (fiyatlandirmalar-12.99)
    //double : Virgullu sayilar (Ondalik sayilar - Decimal Numbers) icin kullanilir(hucre agirligi-0.000000112)

    //NOTE 1 : primitive data type larini Java olusturmustur
    //NOTE 2 : primitive ler sadece kucuk harfle kullanilir
    //NOTE 3 : primitive data lar data type lara gore farkli yer kaplarlar
    //NOTE 4 : primitive data lar iclerinde sadece atadiginiz degeri barindirir


    public static void main(String[] args) {

        //Ornek 1:Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdirin.
        // NOTE: Java "Decimal Numbers" i otomatik olarak "double" kabul eder.
        // Data type "float" yazarsaniz hata verir
        //Float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;

        System.out.println(shirtPrice + shoesPrice);
        System.out.println(shirtPrice);

        //Ornek 2:Hucre agirligi ve Amip in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdir
        double weighCell  = 0.0000000000112;
        double weightAmip = 0.0000000000023;

        System.out.println(weighCell-weightAmip);





    }


}
