package day23datetimestringbuilder;

public class StringBuilder01 {

    /*
         Java da String, String class kullanilarak veya StringBuilder class kullanilarak olusturulabilir.
         "String Class" kullanarak urettigimiz String ler "Immutable" dir  - degistirilemez
         "StringBuilder Class" kullanarak urettigimiz String ler "Mutable" (degistirilebilir) dir.
     */

    public static void main(String[] args) {

        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String i degistirdikten sonra ayni String e assign ederseniz JAva yine yeni bir container olusturur
        //degismis degeri bu yeni container in icine koya ve eski container i gosteren oku yeni container a yonlendirir
        //Dolayisiyla eski container adressiz kalir ve "Garbage Collector"adressiz olan container lari siler
        String a = "Money";
        a = a + "More";

        //Mutable
        //1.YOL:StringBuilder kullanarak String uretmenin 1.YOLU
        StringBuilder sb1 = new StringBuilder("Phyton");
        sb1.append("!").append("?").append(".");   //concat gibi

        System.out.println(sb1); //Phyton!?.

        //2.YOL:StringBuilder kullanarak String uretmenin 2.YOLU
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length()); //0
        //StringBuilder kullandiginizda baslangic kapasitesi 16 dir
        //Kapasite asildiginbda varolan kapasitenin iki katina iki ekleyerek ekleme yapar
        System.out.println(sb2.capacity()); //16

        sb2.append("Java");
        System.out.println(sb2.length()); //4
        System.out.println(sb2.capacity()); //16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length()); //19
        System.out.println(sb2.capacity()); //34 = 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length()); //35
        System.out.println(sb2.capacity()); //70 = 34*2+2

        //3.YOL:StringBuilder kullanarak String uretmenin 3.YOLU
        StringBuilder sb3 = new StringBuilder(2);

        sb3.append("Flo");
        System.out.println(sb3.length()); //3
        System.out.println(sb3.capacity()); //6

        sb3.insert(2,"XXXXXX");// FlXXXXXXo
        System.out.println(sb3);

        //toString() methodu StringBuilder i String e cevirir.
        //String class ta varolan ama StringBuilder class ta varolmayan split() method lara ihtiyac
        //duydugumuzda toString methodunu kullanarak String Class a gecer ve o method lari kullaniriz.
        sb3.toString().split("l");

       //String i tekrar StringBuilder a cevirebilirsiniz
       StringBuilder sb4 = new StringBuilder(sb3);

       //reverse() methodu string leri ters cevirir
        sb3.reverse();
        System.out.println(sb3); //oXXXXXXlF

        //deleteCharAt(); istenen index teki characteri siler
        sb3.deleteCharAt(1);
        System.out.println(sb3); // oXXXXXlF

       //delete(1.6); index 1 deki karakterden index 5(6 dahil olmadigi icin 5 yazdim) teki karaktere kadar tum karakterleri siler
        sb3.delete(1,6);
        System.out.println(sb3); //olF

        StringBuilder sb5 = new StringBuilder("Lava");
        StringBuilder sb6 = new StringBuilder("Java");

       //sb5.compareTo(sb6) methodu sb5 ile sb6 yi alfabetik siralama olarak karsilastirir
       //sb5 alfabetik siralama once ise sonuc negatif olur sonra ise positive olur
        System.out.println(sb5.compareTo(sb6)); //2  kelimelerin arasindaki ASCII farki alir

        //setCharAt(2,m); index 2 deki karakteri 'm' e cevirir
        sb6.setCharAt(2, 'm');
        System.out.println(sb6); //Jama

        sb6.replace(1,3,"xyz");
        System.out.println(sb6); //Jxyza

        //StringBuilder Class ta kullanmamiza izin verilen bazi String Class method lari vardir,
        //substring() method gibi.
        //Bu methodlari StringBuilder ustunde kullaninca StringBuilder in orjinal degeri degismez
        String s7 = sb6.substring(1,3);
        System.out.println(s7); //xy
        System.out.println(sb6); //Jxyza

    }

}
