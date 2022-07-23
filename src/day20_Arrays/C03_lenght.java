package day20_Arrays;

import java.util.Arrays;

public class C03_lenght {
    public static void main(String[] args) {
         // iki sekilde Array olusturulabiliyor
        int sayilar[]={1,2,3}; // 1. sekilde

        String harfler []=new String[4]; // 2. sekilde

        System.out.print("Sayilar array'in uzunlugu : "+sayilar.length); // 3
        // String lenght() method'unda parentez=>() var, array'da () YOK.

        System.out.println(" harfler array'in uzunlugu : "+harfler.length);// 4

        System.out.println(Arrays.toString(harfler)); // [null, null, null, null]

        // harfler array'nin son elementini yazdiralim

        System.out.println(harfler[harfler.length-1]); // null

        // uzunlugundan daha fazla uzun bir index  sayi yazarsak

        System.out.println(harfler[5]); // ArrayIndexOutOfBoundsException   hatasini verir.


    }
}
