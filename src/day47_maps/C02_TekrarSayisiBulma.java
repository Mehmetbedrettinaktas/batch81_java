package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        // verilen bir String'deki kullanilan harfleri ve kullanilan
        // harflerin tekrar yaisini H= 20 seklinde yazdirin

        String str = "Heeeeellllooooo Woooorrrrllllllddddd.";
        // space'leri saymamasi icin once onlari yok edelim
        str = str.replaceAll("\\W", ""); //Words disindaki herseyi siliyoruz
        String[] harflerArr = str.split(""); // Stringimizi split method uyla Array'lere boluyoruz
        System.out.println(Arrays.toString(harflerArr));
        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        // H =1 e =5 l=4

        // harfleri key, kullanim adedini value yaparak bir map olusturalim
        Map<String, Integer> harfkullanimsayilariMap = new HashMap<>();
        Integer harfKullanimsayisi;
        for (String each : harflerArr) {  // harfleri Array den aliyoruz
            if (!harfkullanimsayilariMap.containsKey(each)) { // icermiyorsa kontrol etmek istedigimiz icin ! 'yi basa ekliyoruz
                harfkullanimsayilariMap.put(each, 1); // burada her farkli harfi bulup birer tane yazdiriyoruz
                // varsa var olanini update etsin istiyoruz else
            } else {
                harfKullanimsayisi = harfkullanimsayilariMap.get(each); // degerini getirmek icin  get method nu kullaniyoruz
                harfkullanimsayilariMap.put(each, ++harfKullanimsayisi);
            }
           
        }
        System.out.println("harfkullanimsayilariMap = " + harfkullanimsayilariMap); //harfkullanimsayilariMap = {r=1, d=1, e=1, W=1, H=1, l=1, o=1} else den once
        // if else ten sonra        harfkullanimsayilariMap = {r=4, d=5, e=5, W=1, H=1, l=10, o=9}
    }
}
