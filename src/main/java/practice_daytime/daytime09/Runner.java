package practice_daytime.daytime09;

public class Runner {


    private static Hastane hastene = new Hastane();

    public static void main(String[] args) {

        String hastaDurumu = "Bas agrisi";
        String unvan = doktorUnvan(hastaDurumu);
        hastene.setDoktor(doktorBul(unvan));

        System.out.println("Doktor ismi : " + hastene.getDoktor().getIsim());
        System.out.println("Doktor soyIsmi : " + hastene.getDoktor().getSoyIsim());
        System.out.println("Doktor unvan : " + hastene.getDoktor().getUnvan());

    }//main

    private static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();

        for (int i = 0; i < hastene.unvanlar.length; i++) {
            doktor.setIsim(hastene.doctorIsimleri[i]);
            doktor.setSoyIsim(hastene.doctorSoyIsimleri[i]);
            doktor.setUnvan(unvan);


        }//for i
        return doktor;
    }//method


    private static String doktorUnvan(String hastaDurumu) {

        if (hastaDurumu.equals("Alarji")) {
            return hastene.unvanlar[0];
        } else if (hastaDurumu.equals("Bas agrisi")) {
            return hastene.unvanlar[1];
        } else if (hastaDurumu.equals("Diabet")) {
            return hastene.unvanlar[2];
        } else if (hastaDurumu.equals("Kalp Spazmi")) {
            return hastene.unvanlar[3];
        }
        return "yanlis durum";

   }//method


}//class
