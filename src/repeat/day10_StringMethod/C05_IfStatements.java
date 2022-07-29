package repeat.day10_StringMethod;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir gun alin eger gun "Cuma" ise ekrana
        "Muslumanlar icin kutsal gun" yazdirin. "Cumartesi" ise
        ekrana "yahudiler icin kutsal gun" yazdirin."Pazar"
        ise ekrana "Hiristiyanlar icin kutsal gunu"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gunIsmi.equals("cumartesi")) {
            System.out.println("yahudiler icin kutsal gun");
        }
        if (gunIsmi.equals("pazar")) {
            System.out.println("Hiristiyanlar icin kutsal gun");
        }

    }
}
