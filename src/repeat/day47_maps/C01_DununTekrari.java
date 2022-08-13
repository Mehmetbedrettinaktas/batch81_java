package repeat.day47_maps;

import repeat.day46_maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println("sinifListMap = " + sinifListMap);

        // ogrenci listesini isim soyisim olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // kac farkli brans varsa bransIsmi=branstakiOgrencisayisi seklinde yazdirin

        ReusableMethods.bransOgrencisayisiYazdir(sinifListMap);

    }
}
