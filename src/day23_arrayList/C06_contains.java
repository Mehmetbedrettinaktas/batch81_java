package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
    // contains () methodu yardimiyla aradigimiz urun veya elemani icerip icermedigini donduruyor
        System.out.println(urunler.contains("Nutella")); // true
        System.out.println(urunler.contains("Hobby")); // false


        List<String> urunler2 = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");

        System.out.println(urunler.containsAll(urunler2)); //true
        // containsAll butun urunleri icerip icermedigini kontrol ediyoruz.

        urunler2.add("Hobby");
        System.out.println(urunler.containsAll(urunler2)); //






    }
}
