package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.indexOf("Ikram")); // 1
        // indexOf() listede herhangi bir degisiklik yapmaz sadece
        // bilgi dondurur.
        System.out.println("urunler = " + urunler); // [Nutella, Ikram, Cekirdek, Cay]

        /*
        indexOf() methodu bize bilgi donduren bir method 'dur l
        listemizi degistirmez
         */

        System.out.println(urunler.lastIndexOf("Ikram")); // 1

        /*
        indexOf method'u urunu aramaya 0. index'den
        lastIndexOf() method'u ise aramaya son index'den baslar

        arama bitip, urun bulundugundan
        ikiside bulunan urunun index'ini bize dondurur


         */
        urunler.add("Ikram");
        System.out.println("urunler = " + urunler); // [Nutella, Ikram, Cekirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram")); //1
        System.out.println(urunler.lastIndexOf("Ikram"));// 4

        System.out.println(urunler.indexOf("hobby")); // -1
        System.out.println(urunler.lastIndexOf("hobby")); // -1
        // eger aradigimiz ürünü bulamazsak -1 degerini verir



    }
}
