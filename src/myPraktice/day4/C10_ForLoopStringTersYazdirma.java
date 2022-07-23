package myPraktice.day4;

import java.util.Scanner;

public class C10_ForLoopStringTersYazdirma {
    public static void main(String[] args) {
        /*
        Soru 7 ) Interview Question Kullanicidan bir
        String isteyin ve Stringi tersten yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Sitring bir ifade isteyin : ");
        String str= scan.nextLine();

        tesrYazdir(str);

    }

    public static void tesrYazdir(String str) {
        String tesrYazdir="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tesrYazdir+=str.substring(i,i+1);

        }
        System.out.println("tersYazdir : "+tesrYazdir);

    }
}
