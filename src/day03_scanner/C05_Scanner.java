package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /* kullanicidan iki sayi alip
        bu sayilarin carpimini yazdirin.

         */

        // 1. adim
        Scanner sacn=new Scanner(System.in);

        // 2. adim
        System.out.println("Lutfen ilk sayiyi girin");

        // 3. adim
        double sayi1=sacn.nextDouble();
        // 2. sayi icin 2.3. adimlari tekrarlayiniz

        System.out.println("Lutfen 2. sayiyi giriniz");
        double sayi2= sacn.nextDouble();
        System.out.println("Girilen sayilarin carpimi : "+ sayi1*sayi2);
    }
}
