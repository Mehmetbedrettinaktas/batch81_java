package day09_TernaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
       //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0 ? sayi: (-1* sayi));
    }
}
