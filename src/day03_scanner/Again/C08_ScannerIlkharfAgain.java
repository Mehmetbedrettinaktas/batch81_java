package day03_scanner.Again;

import java.util.Scanner;

public class C08_ScannerIlkharfAgain {
    public static void main(String[] args) {
        // kullanicidan ismini alip, ilk harfini buyuk harf olarak yazdiriniz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi girniz");

        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi : "+ilkHarf);
    }
}
