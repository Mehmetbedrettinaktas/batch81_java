package repeat.day47_maps;

import repeat.day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {

        Map<Integer, String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println("sinifListMap = " + sinifListMap);
        // sinifListMap = {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Devops,
        // 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}

        System.out.println(sinifListMap.containsKey(104));// true
        System.out.println(sinifListMap.containsKey(114));//false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true

        System.out.println(sinifListMap.containsValue("JDev")); // false

        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
      //   ReusableMethods.tumValueSiraliYazdir(sinifListMap);
       ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        Set<Integer> keySeti=sinifListMap.keySet();
        String eachValuealue;

        for (Integer each:keySeti
             ) {
            String eachValue = sinifListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDevolper");
            sinifListMap.put(each,eachValue);
        }
        System.out.println("sinifListMap = " + sinifListMap);
    }
}
