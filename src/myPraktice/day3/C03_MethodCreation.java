package myPraktice.day3;

import day14_MethodCreation.C02_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // Input olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
        // I**** K***** seklinde yazdiran bir method olusturun
        String isim = "Mehmet";
        String soyisim = "Aktas";
        ismiGizle1(isim, soyisim);
        C02_MethodCreation.rakamlariTopla(897);

    }

    public static String ismiGizle1(String isim, String soyisim) {


        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");

        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println(isim +" "+soyisim);

        return isim;
    }
}
