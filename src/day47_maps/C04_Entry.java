package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        Java Entry<K,V> map'in icerisinde bulunan her bir kaydi K=V seklinde tutar
        dolayisiyla herhangi bir Entry'e ulastigimizda hem key'e hem de value'ya ulasabilir
        ve istedigimiz islemleri yapabiliriz

        entry.getKey() bize key'i getirir

        entry.getvalue() bize value'yu getirir

        entry.setValue() value'yu istedigimiz deger olarak update eder
         */
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println("sinifListMap = " + sinifListMap);



        // 101=Ali, Can, JavaDevolper --> bu bir Entry dir key +value toplamindan olusuyor.

        // map 'in her bir elemani alt alta yazdirin
        Set<Map.Entry<Integer, String>> sinifEntrySet= sinifListMap.entrySet();

        for (Map.Entry each:sinifEntrySet // Entry Map ten inport ediyoruz.
             ) {
            System.out.println(each);


        }
        /*
        Map'in bize sagladigi imkanlardan birtaneside key ve value birlikte Entry(kayit girdi) seklinde yazdirmasidir.
         */


        // Map'in tum elemanlarinida varsa  Tester kurs ismini QA olarak degistirelim

            String eachValue;
        for (Map.Entry<Integer, String> each:sinifEntrySet
             ) {
            eachValue=each.getValue(); // herbir value yu aliyoruz
            eachValue=eachValue.replace("Tester","QA"); // value degistiriyoruz
            each.setValue(eachValue);  //yeni value atamis oluyoruz.
        }
        System.out.println("sinifListMap = " + sinifListMap);
    }
}
