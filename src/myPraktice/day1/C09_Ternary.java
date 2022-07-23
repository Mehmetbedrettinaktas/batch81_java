package myPraktice.day1;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tam sayi alin
        ve saynin tek veya cift oldugunu yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi%2==0 ? "Sayi Ciftir" : "Sayi tektir");
    }
}
