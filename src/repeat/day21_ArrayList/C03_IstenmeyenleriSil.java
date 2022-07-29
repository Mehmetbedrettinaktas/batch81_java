package repeat.day21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenmeyenleriSil {
    public static void main(String[] args) {
        /*
        Soru 4) Verilen bir array'de istenmeyen
        harf iceren kelimeleri silip,
        kalan elementleri yeni bir array yapin

        */

        String [] sehirler ={"Istanbul","Ankara","Mersin","Konya","Kastamonu"};
        String istenmeyenHarf="a";
        List<String> kalanlar =new ArrayList<>();

        for (int i = 0; i < sehirler.length ; i++) {
            if ( ! sehirler[i].contains((istenmeyenHarf))){
                kalanlar.add(sehirler[i]);
            }

        }
        // loop bitiginde istenmeyen harf icermeyen sehirler, listeye eklemis olacak
        System.out.println("kalanlar = " + kalanlar); // Mersin
        
        String [] kalanlarArrayi =new  String[kalanlar.size()]; // yeni bir array olusturuyoruz

        for (int i = 0; i < kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);
            
        }
        sehirler=kalanlarArrayi;
        System.out.println("Sehirler arrayi'inin son hali : "+ Arrays.toString(sehirler));
        // Sehirler arrayi'inin son hali : [Mersin]
    }
}
