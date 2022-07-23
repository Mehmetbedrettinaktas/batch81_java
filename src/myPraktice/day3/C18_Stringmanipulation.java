package myPraktice.day3;

import java.util.Scanner;

public class C18_Stringmanipulation {
    public static void main(String[] args) {
          /*
        Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
         Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
         */
        /*

        int bosluk = str.indexOf(' ');

        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");

        } else {
            System.out.println("bosluk vardir");

        }
        scan.close();
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("string giriniz : ");
        String str = scan.nextLine();
        int bosluk = str.indexOf(' ');


        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yok ");
        } else {
            System.out.println("sitring'te bosluk var");

        }

    }
}
