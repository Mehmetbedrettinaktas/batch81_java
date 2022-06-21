package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // kullanicidan ismini soy ismini ve yasini alip girilen bilgiler
        // Mehmet Aktas 40 seklinde yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println(" Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        /*
        String verileri scanner ile alirken
        next() : ilk bosluga kadar olan kismi (1 kelime alir.)
        nextLine(): satirin sonuna kadar ne yazarsak alir.
        NOT: eger ardada birden  fazla
         */
        String soyisim= scan.nextLine();
        System.out.println(" Lutfen soyisminizi giriniz");

        double yas= scan.nextDouble();
        System.out.println("girilen bilgiler = " +isim+ " "+soyisim+" "+yas);





    }
}
