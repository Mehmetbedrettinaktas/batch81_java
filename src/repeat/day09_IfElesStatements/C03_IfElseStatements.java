package repeat.day09_IfElesStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan gun ismini alin ve haftaici
         veya hafta sonu oldugunu yazdirin
         ornek: gun pazar output="haftaSonu"
         gun sali= output="hafta ici

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir gun ismini giriniz : ");
        String gun = scan.next().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("Sali") || gun.equals("carsamba")
                || gun.equals("persembe") || gun.equals("cuma")) {
            System.out.println(gun + " hafta ici");
        }
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println(gun + " haftaSonu");

        }
    }
}