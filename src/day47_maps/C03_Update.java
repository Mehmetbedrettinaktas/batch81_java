package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.containsKey()==> istenen key degeri Map'de olup olmadigini boolean olarak doner
        map.containsValue(value)==> bir butun olarak value'nun map'de olmadigini doner

        ONEMLI NOT: map.containsValue(value) icindeki bir parcayi bulmada ise yaramaz
        eger value icindeki bir parcayi aratmak istiyorsak map uzerinde manipulation
        yapmamiz lazim
        map.get(key) ==> verilen key'i ait degeri dondurur
         */
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap); // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Devops, 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}

        System.out.println(sinifListMap.containsKey(104)); // true

        System.out.println(sinifListMap.containsKey(114)); // false // olmayi yazdirdigimizda

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true

        // bir parcasini kontrol edemeyiz
        System.out.println(sinifListMap.containsValue("JDev")); //false
        // eger bir parcasini kontrol etmek istiyorsak manipulation yapmamiz lazim ( split method u gibi )

        // verilen map'de JDev degerlerini JavaDevolper olarak degistirelim

        // Map'larde replace tum value'yu degistirmek istersek kullanilabilir
        // kismi degisiklerde kullanamayiz

        //ReusableMethods.tumValueSiraliYazdir(sinifListMap); // burayi kapatik
        /*
        Collection<String> valuesCollection = sinifListMap.values(); // Collection olusturup valulara ulasiyoruz

          for (String each:valuesCollection
               ) {
              each= each.replace("JDev","JavaDevolper");
              System.out.println("each = " + each); // Map degismedi cunku atama yapmadik
              // JDev'yi JavaDevolper olarak degistirdik ancak atama yapmadigimiz icin
              // sinifListMap'imiz degismedi
          }

           */
        System.out.println("sinifListMap = " + sinifListMap);

          /*
          Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz
          ornegin key 101 icin value Ali, Can, JDev
          guncelleme icin   sinifListMap.put(101, Ali, Can, JDev)
          bunun yapabilmek icin herbir key'e ve ona ait value'ye(degere) ihtiyacim var
           */
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        Set<Integer> keySet = sinifListMap.keySet(); // Set olusturup keylere ulasiyoruz Keyler unique oldugu icin Setler bunun icin cok uygun
        String eachValue;
        for (Integer each : keySet) { // keySet Methodu Integer key Set donduruyor      keyler unique
            eachValue = sinifListMap.get(each);
            eachValue = eachValue.replace("JDev", "JavaDevolper"); // eachValue degeri degisti
            sinifListMap.put(each, eachValue);
            /*
            Set(Interface), matematikteki kume mantigiyla calisir, her elemn unique'dir.

            biz key'lerin tamamini aldik herbir key'in value'sunu getirdik
            value uzerinde degisikligi yapip yeni halini put(key, yeniDeger)ile map'e koyduk
             */
        }
        System.out.println("sinifListMap = " + sinifListMap);
    }
}
/*
 sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");
        return sinifMap;
 */