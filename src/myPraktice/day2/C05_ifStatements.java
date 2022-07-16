package myPraktice_day03;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir gun ismini isteyin eger gun "Cuma" ise
        ekrana"Muslumanlar icin kutsal gun" yazdirin.
        "Cumartesi" ise ekrana "Yahudiler icinkutsal gun"yazdirin."Pazar"
        ise "Hiristiyanlar icin kutsal gun" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir gun ismini giriniz : ");
        String gun = scan.nextLine().toLowerCase();

        if (gun.equals("cuma")){
            System.out.println(gun +" Muslumanlar icin kutsal gun");}
        if (gun.equals("cumartesi")){
            System.out.println(gun +" Yahudiler icinkutsal gun");
        }
        if (gun.equals("pazar")){
            System.out.println(gun+ " Hiristiyanlar icin kutsal gun");
        }
    }
}
