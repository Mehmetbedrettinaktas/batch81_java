package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // kullanicidan ismini soy ismini ve yasini alip
        // girilen bilgiler = Mehmet Aktas 40 seklinde yazdirin.
        // bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz \n aralarda enter tusuna basiniz");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas =scan.nextInt();
        System.out.println("girilen bilgiler = " +isim+ " "+soyisim+" , "+yas);

    }
}
