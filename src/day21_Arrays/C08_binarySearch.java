package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
         Binary search java da eleman aramanin kisa yoludur
         Ancak binary search'un calismasi icin once
         array'in sirali hale getirilmesi gerekir
         Eger siralama yapmadan binarySearch yaparsaniz
         sonucu bulamayabilir veya yanlis bulabilir

         */

        String[] harfler = {"Y", "B", "D", "G", "O", "A"};

        String arananHarf = "Y";


        Arrays.binarySearch(harfler, arananHarf);

        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarf));// 2
        /*
         java sonucu bize - dondururse sonucu bulamadi anlamina geliyor.
         Java isi kisaltmak icin ortadan baslar kucukse sola dogru, buyukse saga dogru
         aramaya devam eder. onun icn once sort() methoduyla dogru siralama yapiyoruz ondan sonra
         ariyoruz.

         */
        System.out.println(C03_Contains.containss(harfler, arananHarf));

        // binarySearch bize aradigimiz elemanin index'ini dondurur
        // array sirali olmadigi icin arama sonucunu dogru bulamayabilir.


        // Emin olmak icin sort yapmaliyiz
        Arrays.sort(harfler);
        System.out.println(Arrays.binarySearch(harfler, arananHarf)); //  " Y" --> 5

    }
}
