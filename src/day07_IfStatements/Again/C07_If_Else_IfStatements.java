package day07_IfStatements.Again;

import java.util.Scanner;

public class C07_If_Else_IfStatements {
    public static void main(String[] args) {

        /*
        Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        “emekli olamazsin, calismalisin”, 65’e esit v
        eya buyukse “Emekli olabilirsin” yazdirin

        * kullanici negatif deger girerse uyaralim

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("Lutfen gecerli bir yaziniz");

        } else if (yas < 65) {
            System.out.println("emekli olamazsin, " + (65 - yas) + " yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }

    }
}
