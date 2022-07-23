package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove method'u iki sekilde kullanilir;
        1. objeyi yazip silmesini istersek bize boolean sonucu doner true/false
        2. index girersek o index'deki elamani siler ve bize silinen elemani dondurur.

         */
        System.out.println("urunler = " + urunler); // [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram"));// true
        System.out.println("urunler = " + urunler); // [Nutella, Cekirdek, Cay]

        System.out.println(urunler.remove("Hobby")); // false
        // eger olmayan bir urunle ilgi islem yapmak istedigimizde sonucu bize false dondurur
        // cunku boyle bir urun yok
        System.out.println("urunler = " + urunler); //[Nutella, Cekirdek, Cay]


        // ikinci yontemi deneyelim yani index girelim

        System.out.println(urunler.remove(1)); // cekirde
        System.out.println("urunler = " + urunler); // [Nutella, Cay]

        // olmayan bir indexi silmeye calisirsak? .IndexOutOfBoundsException hatasini verir
       // System.out.println(urunler.remove(3)); //.IndexOutOfBoundsException






    }
}
