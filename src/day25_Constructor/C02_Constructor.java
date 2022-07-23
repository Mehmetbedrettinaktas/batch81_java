package day25_Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {
        C01             obj1  =        new       C01();
        // class adi   objenin adi   keyword     constructor(yapici)

        Scanner scan = new Scanner(System.in);
        Random rnd  =        new       Random();
        List<String> list= new ArrayList<>();
        // List<String> list = new List<>(); //
        /*
        java da bir obje olusturabilmekm icn mutlaka class 'ihtuyacimiz var
         class'in da mutlaka constructor'i  kullanmiliyiz
         */

        System.out.println(obj1.sayi); // 0 default deger atar
        obj1.denem(); // C01 den deneme method calisir

    }
}
