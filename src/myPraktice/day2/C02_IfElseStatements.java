package myPraktice.day2;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan gun isimlerinden birinin ilk harfini istyin
         ve o harfle baslayan gun isimlerini yazdirin.
         ornek: ilkharf=P output="Pazar, pazartesi veya persembe"
         ilkHarf=S output "sali"
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir gun ismini giriniz : ");
        char ilkharf = scan.next().toUpperCase().charAt(0);

        if (ilkharf=='C' || ilkharf=='c'){
            System.out.println(ilkharf + " ile baslayan gun carsamba, cuma veya cumartesi dir ");

        } else if (ilkharf=='P' || ilkharf=='p') {
            System.out.println(ilkharf+ " ile baslayan gun pazartesi, persembe veya pazar dir");

        }else System.out.println(ilkharf+ " ile baslayan gun sali gunudur.");


    }
}
