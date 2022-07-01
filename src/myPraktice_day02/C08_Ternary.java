package myPraktice_day02;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen farkli iki sayi giriniz : ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println(sayi1 >= sayi2 ? sayi2 : sayi1);
    }
}
