package SmallStudyGroup;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class C03_Period {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("dogum tarihini giriniz");
        int yil=scan.nextInt();

        int ay=scan.nextInt();

        int gun=scan.nextInt();
        LocalDate bugun=LocalDate.now();
        LocalDate tarih=LocalDate.of(yil,ay,gun);
        Period period=Period.between(tarih,bugun);
        System.out.println(period);


    }



    }

