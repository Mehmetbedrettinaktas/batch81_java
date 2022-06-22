package day09_TernaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif”
        yazdirin, negatifse  sayinin karesini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        double sayi =scan.nextDouble();

        // Eger ternary icindeki sonuclar farkli data turunde ise atama
        // yapamayiz, sadece yazdirabiliriz.
        // double sonuc = sayi>0 ? "Sayi Pozitif" : (sayi*sayi) ;

        System.out.println(sayi>0 ? "Sayi pozitif  " :(sayi*sayi));
    }
}
