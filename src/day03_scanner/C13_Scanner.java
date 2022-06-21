package day03_scanner;

import java.util.Scanner;

public class C13_Scanner {
    public static void main(String[] args) {
         /* Kullanicidan isim ve soyismini isteyip asagidaki sekilde yazdirin
        Isminiz : Mehmet
        soyisminiz : Aktas
        kursumuza katiliminiz alinmistir, tesekkur ederiz.

          */
        // String str="kursumuza katiliminiz alinmistir, tesekkur ederiz";
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Isminiz : "+isim +"\nSoyisminiz : "+ soyisim + "\nkursumuza katiliminiz alinmistir, tesekkur ederiz");




    }
}
