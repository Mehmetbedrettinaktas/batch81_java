package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {

    /*
    eger bir elementle ile ilgili tutacagimiz bilgiler coksa veya kompleks
    ise bu defa ic ice map kullanmayi tercih edebiliriz

    ic ice map kullanidigimizda daha fazla datayli,
    daha duzenli olarak tutma imkanimiz olur
    Ancak, bilgiye ulasmak ve manipule etmek zorlasacaktir.

    ornek olarak map'imizi map'lerden olusan bir map olarak olusturalim
         sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
     */
    public static void main(String[] args) {
        Map<String, String> ogr101=new HashMap<>();
        ogr101.put("isim","Enes");
        ogr101.put("soyisim","Cem");
        ogr101.put("brans","Tester");

        Map<String, String> ogr102=new HashMap<>();
        ogr102.put("isim","Taha");
        ogr102.put("soyisim","Emre");
        ogr102.put("brans","JDev");

        Map<String, String> ogr103=new HashMap<>();
        ogr103.put("isim","Derya");
        ogr103.put("soyisim","Deniz");
        ogr103.put("brans","Devops");

        Map<Integer,Map<String, String>> ogrencinestedMap=new HashMap<>();
        ogrencinestedMap.put(101,ogr101);
        ogrencinestedMap.put(102,ogr102);
        ogrencinestedMap.put(103,ogr103);
        System.out.println("ogrencinestedMap = " + ogrencinestedMap);
        // ogrencinestedMap = {101={soyisim=Deniz, brans=Devops, isim=Derya}, 102={soyisim=Emre, brans=JDev, isim=Taha}, 103={}}

        Set<Map.Entry<Integer,Map<String,String>> > ogrenciEntrySeti=ogrencinestedMap.entrySet();
        for (Map.Entry each:ogrenciEntrySeti
             ) {
            System.out.println(each);
        }
        // 102 nolu kisinin ismini yazdiralim
        System.out.println(ogrencinestedMap.get(102).get("isim")); // Taha

    }
}
