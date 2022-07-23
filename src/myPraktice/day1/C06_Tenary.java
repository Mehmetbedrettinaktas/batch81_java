package myPraktice.day1;

import java.util.Scanner;

public class C06_Tenary {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        double sayi =scan.nextDouble();
                        // sayi >=0 ise sayinin kendisini yazdirir degilse(:)
                        //  (-1* sayi) yazdiriyoruz.
        System.out.println(sayi>=0 ? sayi : (-1*sayi));
    }
}
