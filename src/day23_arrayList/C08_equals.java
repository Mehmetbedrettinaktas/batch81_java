package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");



        List<String> urunler2= new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Nutella");
        urunler2.add("Cay");
        urunler2.add("Cekirdek");

        System.out.println(urunler.equals(urunler2)); // false

        Collections.sort(urunler); // Sitringi alfabetik siraya gore siraliyor
        System.out.println("urunler = " + urunler); // urunler = [Cay, Cekirdek, Ikram, Nutella]
        Collections.sort(urunler2);
        System.out.println("urunler2 = " + urunler2); // urunler2 = [Cay, Cekirdek, Ikram, Nutella]

        System.out.println(urunler.equals(urunler2)); //true



    }
}
