package day03_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        // kullanicidan iki tamsayi alip bu sayilarin carpi, toplami ve farkini yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Carpim: "+ (sayi1*sayi2));
        System.out.println("Toplam : "+ (sayi1+sayi2));
        System.out.println("Cikarma : "+ (sayi1-sayi2));
    }
}
