package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {
        /*
        tek katli Arraylerde array'i direk yazdiramiyoruz
        cunku array non-primitive data turundur ve
        her non-primitive data direk yazdirilmalidir

        ancak array'in icerisindeki elementleri
        direk yazdirabiliyorduk
        cunku genelde primitive data turu veya String
        elementler kullaniliyordur.

        Multi-dimensional array'lerde en dikkat edecegimiz konu
        ulasamak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur

         */

        int [][] sayilar={{1,2,4,5},{3,4}};

        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array
        var sayilar[0]==> [1, 2, 4, 5]

        ancak en icerdeki elementlere ulasabilmek direk yazdirabiliriz


         */
        System.out.println(sayilar[0]); // [I@19dfb72a
        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]); //2
        System.out.println(sayilar[1][0]); // 3 burada {3,4} deki array 'ine ulasiyoruz

        System.out.println(Arrays.toString(sayilar)); // [[I@19dfb72a, [I@17c68925]
        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]

        /*
        array'i iki sekilde declare edebiliyorduk
        1- elemanlari direk yazabiliriz
        int [][] sayilar={{1,2,4,5},{3,4}};
        2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz
        int [][] sayilar=new int [3][4];

        ancak 2. yontemle yaptigimizda inner array'lerin farkli uzunlukta olma
        ihtimali kalmaz bu ornek icin outer array'in ise 4 er elemani vardir
        eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
        mecburen 1. yontemi kullanmaliyiz.



         */



    }
}
