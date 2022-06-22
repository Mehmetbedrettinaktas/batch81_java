package day09_TernaryOperator;

import java.util.Scanner;

public class C04_Nestedternary {
    /*
    Soru2 : Kullanicidan bir harf isteyin
    1) kucuk harf ise consola “Kucuk Harf” ,
    2) buyuk harfse consola “Buyuk Harf”
    3) yoksa “girdiginiz karakter harf degil” yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);


        // String sonuc = (harf>= 'a' && harf <= 'z')?("kucuk Harf") :
        //  (" \nBuyuk harf veya gecersiz karekter")

        String sonuc = (harf >= 'a' && harf <= 'z') ? ("kucuk Harf") :
                ((harf >= 'A' && harf <= 'Z') ? "Buyuk harf " : "Gecersiz karekter");

        String sonuc2 = harf >= 'a' && harf <= 'z' ? "kucuk Harf" :
                harf >= 'A' && harf <= 'Z' ? "Buyuk harf " : "Gecersiz karekter";
        System.out.println(sonuc);
        System.out.println(sonuc2);

        if (harf >= 'a' && harf <= 'z'){
            System.out.println("If ile Kucuk harf");
        } else if (harf >= 'A' && harf <= 'Z') {
            System.out.println("If ile Buyuk harf");

        }else {
            System.out.println("If ile Gecersiz karekter");
        }

    }
}
