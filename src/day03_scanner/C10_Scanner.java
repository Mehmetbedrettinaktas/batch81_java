package day03_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        /*
        Kullaicidan karenin bir kenar uzunlugunu alin ve karenin cevresi ve
        alanini hesaplayip yazdiriniz. (karenin bir kenari= a)
        kare cevre= 4a      kare alan=a*a
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen kerenin bir kenar uzunlugunu giriniz");
        int sayi=scan.nextInt();
        System.out.println("karenin cevresi : "+ 4*sayi+ "\nkarenin alani : "+ sayi*sayi);
    }
}
