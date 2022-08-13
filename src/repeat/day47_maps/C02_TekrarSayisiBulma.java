package repeat.day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        //verilen bir String'deki kullanilan harfleri ve kullanilan harflerin tekrar
        // sayisini H=20 seklinde yazdirin
        String str = "Heeeeellllooooo Woooorrrrllllllddddd.";
        // space'leri saymamasi icin once onlari yok edelim
        str = str.replaceAll("\\W", "");
        String[] harflerArr = str.split("");
        System.out.println(Arrays.toString(harflerArr));
        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        // H=1 e=5 l=4
        // harfleri key, kullanim adedini value yaparak bir map olusturalim
        // Map<String, Integer>harfKullanimSayilariMap= new HashMap<>(); // hasMap yerine TreeMap yaparsak harf siralamasina gore yapar
        Map<String, Integer> harfKullanimSayilariMap = new TreeMap<>();
        Integer harfKulanimsayisi;
        for (String each : harflerArr
        ) {
            if (!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each, 1);

            } else {
                harfKulanimsayisi = harfKullanimSayilariMap.get(each);
                harfKullanimSayilariMap.put(each, ++harfKulanimsayisi);
            }
        }
        System.out.println("harfKullanimSayilariMap = " + harfKullanimSayilariMap); // burada harflerin degerlerini getiriyoruz
        // harfKullanimSayilariMap = {r=1, d=1, e=1, W=1, H=1, l=1, o=1} else olmadan yazdirdigimizda
        // harfKullanimSayilariMap = {r=4, d=5, e=5, W=1, H=1, l=10, o=9} else blogundan sonra hasMap ile
        // harfKullanimSayilariMap = {H=1, W=1, d=5, e=5, l=10, o=9, r=4} else blogundan sonra TreeMap ile


    }
}
