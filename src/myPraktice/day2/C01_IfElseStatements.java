package myPraktice.day2;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tam sayi isteyin ve
        sayinin tek veya cift oldugunu yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfrn bir tam sayi giriniz: ");
        int sayi =scan.nextInt();


        if (sayi%2 == 0){
            System.out.println( sayi+" sayisi cift sayidir");
        } else{
            System.out.println(sayi+ " sayisi tek sayidir");
        }



    }
}
