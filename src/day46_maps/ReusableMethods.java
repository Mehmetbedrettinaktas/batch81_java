package day46_maps;

import java.util.*;

public class ReusableMethods {
    public static Map<Integer, String> mapOlustur() {
        Map<Integer, String> sinifMap = new HashMap<>();
        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");
        return sinifMap;
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        for (String each : ogrenciMap.values()
        ) {
            System.out.println(sira + " - " + each);
            sira++;
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList = new ArrayList<>();
        String[] eachArr;
        for (String each : ogrenciMap.values()
        ) {
            eachArr = each.split(", ");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;
    }

    public static void bransOgrencisayisiYazdir(Map<Integer, String> sinifListMap) {
        // brans=bransdakiOgrenciSayisi
        Map<String, Integer> bransOgrSayiMap = new TreeMap<>();// TreeMap yapmamizin sebebi az elemanli olmasi ve TreeMap'ler elemanlari natural order'a gore siralar.
        // Siralama icin key'i dikkate alir.
        Collection<String> valuesCollection = sinifListMap.values(); // Collection olusturuyoruz ve degerlerini sinifListMap ten  values aliyoruz.
        String[] valueArr;  // Sitring array olusturuyoruz
        String brans;
        Integer bransdakiOgrSayisi;
        for (String each : valuesCollection
        ) {
            valueArr = each.split(", "); // value leri parcaliyoruz
            brans = valueArr[2];  // ValueArr array mizin 2. indexi bras oldugu icin onu baransa aiyoruz

            // bransin bransOgrSayiMap'inde key olarak daha onceden eklenip eklenmedigini
            // kontrol etmeliyiz
            if (!bransOgrSayiMap.containsKey(brans)) { // bu mep benim bransim mi iceriyor mu? ama biz icermiyormu istiyoruz icermiyorsa ekliyoruz.
                bransOgrSayiMap.put(brans, 1); //  Yoksa ekle diyoruz burada butun branslari buluyoruz, (Devops, JDev"); ve Tester) burada branslar key oluyor elste valulari artiracagiz
            } else { // varsa value 1 artiracagiz
                bransdakiOgrSayisi = bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans, ++bransdakiOgrSayisi);
            }
        }  // bu islemleri foreach loop icerisinde yaptigimiz icin
        System.out.println(bransOgrSayiMap);
    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) { // Entry leri yazdirmak icin once entry set olusturmamiz lazim
        Set<Map.Entry<Integer, String>> sinifListEntrySeti = sinifListMap.entrySet();
        for (Map.Entry<Integer, String> entry : sinifListEntrySeti
        ) {
            System.out.println(entry);
        }
    }
}
