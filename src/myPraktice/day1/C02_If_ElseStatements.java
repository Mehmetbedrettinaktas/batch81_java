package myPraktice_day02;

import java.util.Scanner;

public class C02_If_ElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan gun isimlerinden birinin ilk harfini
        isteyin ve o harfle baslayan gun isimlerini yazdirin
        ornek: ilkHarf = P output= "pazar, Pazartesi veya Persembe"
        ilkHarf=S output="Sali"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karekter  giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        if (ilkHarf == 'P'){
            System.out.println("Girilen gün ismi = Pazar, Pazartesi, veya persembe "+ " gunudur.");
        }
        if (ilkHarf=='S'){
            System.out.println("Girilen gün ismi = sali "+ " gunudur.");
        }
    }
}
