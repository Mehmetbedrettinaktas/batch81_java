package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        // kullanicidan ismini alip, ilk harfini buyuk harf olarak yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        /* java Scanner class'inda nextChar() method'u yoktur
        bunun yerine String olarak ilk kelimeyi alip onun da ilk harfini alabiliriz.
         */
        //char ilkHarf=scan.next().toUpperCase().charAt(0);
        char ilkHarf=scan.next().toLowerCase().charAt(0);
        System.out.println("ismin ilk harfi : " + ilkHarf );
    }
}
