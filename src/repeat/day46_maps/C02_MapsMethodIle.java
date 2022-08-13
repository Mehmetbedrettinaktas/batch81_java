package repeat.day46_maps;

import day46_maps.ReusableMethods;

import java.util.List;
import java.util.Map;


    public class C02_MapsMethodIle {
        public static void main(String[] args) {
            ReusableMethods ReusableMethods = null;
            Map<Integer, String> ogrenciMap = day46_maps.ReusableMethods.mapOlustur();
            System.out.println(ogrenciMap);
            // value'lari sira numarali olarak yazdirin
            day46_maps.ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

            // Isim ve soyisimlerin birlikte olacagi bir liste olusturun

            List<String> sinifisimsoyisimList = day46_maps.ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
            System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);


        }
    }


