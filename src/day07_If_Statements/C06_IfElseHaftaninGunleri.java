package day07_If_Statements;

import java.util.Scanner;

public class C06_IfElseHaftaninGunleri {
    public static void main(String[] args) {

         /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        or: gun=pazar outpot="hafta sonu"
        gun=sali outpot = "hafta ici"
        *** String icin equals methodu'unu kullanin

        pazar veya Cumartesi ise ===> hafta sonu
        Pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
            System.out.println("Girdiginiz gun haftasonu");

        }else {
            System.out.println("Girdiginiz gun haftaici");
        }

    }
}
