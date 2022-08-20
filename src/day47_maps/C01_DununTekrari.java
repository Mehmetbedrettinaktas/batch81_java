package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {
        //map uzerinde islem yapacagimiz icin o Map'i bu class'a getirmek
        // icin ve bu classta kullanmak icin bir map olusturuyoruz
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
         // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Devops,
        // 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}


        // ogrenci listesini isim soyisim olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(sinifListMap); // method olusturuken method lar yapacagi ise gore isimlendirilirse
                                                            // method cagrilirken isimiz daha kolay olur.
        /*
        1 - Ali, Can, JDev
        2 - Enes, Cem, Tester
        3 - Taha, Emre, JDev
        4 - Derya, Deniz, Devops
        5 - Enes, Can, Tester
        6 - Taha, Deniz, JDev
        7 - Derya, Cem, Tester
         */

        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
        ReusableMethods.bransOgrencisayisiYazdir(sinifListMap); // bransOgrencisayisiYazdir method'unu olusturuyoruz ReusableMethods class'inda
    }
}
