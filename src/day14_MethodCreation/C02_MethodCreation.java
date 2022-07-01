package day14_MethodCreation;

import day13_methodCretion.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {


        // Verilen 3 basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim
        int input=521;
        rakamlariTopla(input);
        C04_MethodCreation.topla(6,3);

    }
    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input; // temp= gecici eleman anlaminda

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz " + temp+ " sayisinin rakamlar toplami : "+ rakamlarToplami);



    }
}
