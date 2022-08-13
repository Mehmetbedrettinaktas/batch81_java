package repeat.day47_maps;

import repeat.day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println("sinifListMap = " + sinifListMap);
        // her bir elemani alt alta yazdirin
        Set<Map.Entry<Integer, String>> sinifEntrySet= sinifListMap.entrySet();
        for (Map.Entry<Integer, String>  each:sinifEntrySet
             ) {
            System.out.println(each);
        }
        //Map'in tum elemanlarininda varsa Tester kurs ismini Qa olarak degistirelim

        // Not: Entry ==> giris , kayit anlamindadir
        String eachValue;
        for (Map.Entry<Integer, String> each:sinifEntrySet
             ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println("sinifListMap = " + sinifListMap);
    }
}
