package day07_IfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfstatements {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        or: gun=pazar outpot="hafta sonu"
        gun=sali outpot = "hafta ici"
        *** String icin equals methodu'unu kullanin'
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun= scan.next().toLowerCase();
        // pazar , Pazar , PAZAR  ne yazarsa yazsin tolowerCasse() sayesinde hepsini kucuk harfle yazar
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen hun HAFTASONU");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
        || girilenGun.equals("persembe") || girilenGun.equals("cuma")){
            System.out.println("Girilen gun HAFTAICI");
        }

        if ( !(girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
                ||girilenGun.equals("persembe") || girilenGun.equals("cuma")
                ||girilenGun.equals("pazar") || girilenGun.equals("cumartesi"))){
            System.out.println("Lutfe gecerli bir gun ismi giriniz");

        }

    }

}
