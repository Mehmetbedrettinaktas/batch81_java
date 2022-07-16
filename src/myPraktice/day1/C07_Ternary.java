package myPraktice_day02;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        /*
        kullanicidan bir sayi alin. sayi pozitifse"Sayi pozitif"
        yazdirin, negatifse sayinin karesini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfren bir syi giriniz: ");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0 ? " Sayi pozitif " : (sayi*sayi));
    }
}
