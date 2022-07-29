package repeat.day13_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        /*
        cm olarak verilen bir sayiyi, metre
    ve kilometreye donusturen bir method yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("m ve km ye donusturmek istediginiz cm degerini giriniz : ");
        double santiMetre=scan.nextDouble();

        convertSM(santiMetre);

    }

    public static void convertSM(double santiMetre) {

        double meter= santiMetre/100;
        double kMetre= santiMetre/100000;

        System.out.println("girdiginiz cm degeri : "+santiMetre +"--> " +meter+ " m'dir, "+kMetre+" km dir");


    }
}
