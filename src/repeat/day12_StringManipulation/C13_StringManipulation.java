package repeat.day12_StringManipulation;

import java.util.Scanner;

public class C13_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Cumle olusturmkaicin birinciyi kelimeyi giriniz :");
        String str1 = scan.next().toLowerCase();

        System.out.print("Cumle olusturmka icin ikinci kelimeyi giriniz :");
        String str2 = scan.next().toLowerCase();

        System.out.print("Cumle olusturmka icin ucuncu  kelimeyi giriniz :");
        String str3 = scan.next().toLowerCase();

        System.out.print("Cumle olusturmka icin dorduncu kelimeyi giriniz :");
        String str4 = scan.next().toLowerCase();

        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+
              "  " +str2+ " "+ str3+ " "+ str4 +"." );



    }
}
