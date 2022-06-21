package day03_scanner.Again;

import java.util.Scanner;

public class C05_ScannerAgain {
    public static void main(String[] args) {

         /* kullanicidan iki sayi alip
        bu sayilarin carpimini yazdirin.

         */
        // 1. adim
        Scanner scan=new Scanner(System.in);

        // 2. adim
        System.out.println("Lütfen ilk sayiyi giriniz");

        // 3.adim
       Double sayi1= scan.nextDouble();

        System.out.println("Lütfen ikinci yasi girinis");
        Double sayi2= scan.nextDouble();
        System.out.println("Girilen sayilarin carpimi : " +sayi1*sayi2);

    }
}
