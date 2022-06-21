package day03_scanner.Again;

import java.util.Scanner;

public class C06_ScannerAgain {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler = Mehmet Aktas 40 seklinde yazdiriniz.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Lutfen soisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
       Integer yas = scan.nextInt();

        System.out.println(" "+ isim +" "+ soyisim + " "+yas );


    }
}
