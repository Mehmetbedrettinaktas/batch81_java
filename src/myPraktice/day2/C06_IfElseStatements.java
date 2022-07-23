package myPraktice.day2;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan dikdortegenin kenar uzunluklarini isteyin
        ve dikdortegenin kare olup olmadigini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfrn dikdortgenin 1. kenar uzunlugu giriniz : ");
        int birinciKenar=scan.nextInt();
        System.out.print("Lutfrn dikdortgenin 2. kenar uzunlugu giriniz : ");
        int ikinciKenar=scan.nextInt();

        if (birinciKenar==ikinciKenar){
            System.out.println("Sekil "+" Kare");
        }else {
            System.out.println("Sekil "+ " Dikdortgen");
        }
    }
}
