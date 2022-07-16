package myPraktice_day02;

import java.util.Scanner;

public class C01_TekCift {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tam sayi isteyin
        ve sayinin tek veya cift oldugubu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi =scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cift sayidir: ");
        }else {
            System.out.println("Girilen sayi sayi tek sayidir : ");
        }
    }
}
