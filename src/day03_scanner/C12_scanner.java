package day03_scanner;

import java.util.Scanner;

public class C12_scanner {
    public static void main(String[] args) {

        /* Kullanicidan digdörtgenler prizmasinin  uzun , kisa ve
        yuksekligi isteyip prizmanin hacmini hesaplayip yazdirin.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen dikdortgenler prizmanin uzun kenarini giriniz ");
        int uzunKenar=scan.nextInt();

        System.out.println("Lutfen dikdortgenler prizmanin kisa kenarini giriniz ");
        int kisaKenar=scan.nextInt();

        System.out.println("Lutfen dikdortgenin yuksekligini giriniz");
        int yukseklik=scan.nextInt();
        System.out.println("dikdortgenler prizmasinin cevresi : "+ uzunKenar*kisaKenar*yukseklik);
    }
}
