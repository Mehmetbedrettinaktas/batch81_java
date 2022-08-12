package repeat.mathClass;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {

        Map<Integer, String>ogrenciMap =ResuableMethods.mapOlustu();
        System.out.println("ogrenciMap = " + ogrenciMap);
        // value'lari sira numarali olarak yazdirin
        ResuableMethods.tumValueSiraliYazdir(ogrenciMap);

        // Isim ve Soyisimlerin birlikte olacagi bir liste olusturun
        List<String>sinifisimsoyisimList=ResuableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : "+sinifisimsoyisimList);
        // kac farkli brans varsa bransIsmi= branstakiOgrencisayisi seklinde yazdirin
    }
}
