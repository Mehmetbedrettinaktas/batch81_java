package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_passByValue {
    public static void main(String[] args) {
        /*
        bir list olusturalim iki ayri method'tan
        birinde sadece elemanlarini degistirelim

        digerinde yeni bir list atayip,
        ayni sayida yeni eleman ekleyelim

        ve her iki method call'dan sonra kendi listemizi
        main method icerisinde kontrol edelim


         */


        List<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Can");
 // kod okuma sirayla
        System.out.println("ilk basta list= " + list); //  ilk basta list = [Ali, Veli, Can]        // 1. sira

        elemanlariDegistir(list); // method olusuturuyoruz                  2. sira  ve    elemanlariDegistir() gider
        System.out.println("eleman degistir methodundan sonra list : " + list);                     // 9. sira
       // [Oguz, Murat, Fatih]

        listDegistir(list);                                                               // 10. sira ve listDegistir()'na gider
        System.out.println("list degistir methodundan sonra list : " + list);            // 18. sira yazdiriyoruz
        // [Oguz, Murat, Fatih]



    }

    public static void listDegistir(List<String> list) {     // 11. sira
        list=new ArrayList<>();                             // 12. sira
        list.add("Nutella");                                // 13 .sira
        list.add("Cay");                                    // 14 .sira
        list.add("Cokokrem");                               // 15. sira
        System.out.println("list degistir methodunda : " + list); // 16. sira
        // [Nutella, Cay, Cokokrem]

    }                                                   // 17. sira method bitti main method'da geri gidiyor

    public static void elemanlariDegistir(List<String> list) {               // 3. sira

        list.set(0,"Oguz");                                                 // 4.sira
        list.set(1,"Murat");                                                 // 5. sira
        list.set(2,"Fatih");                                                   // 6. sira
       System.out.println("eleman degistir methodunda : "+list); // [Oguz, Murat, Fatih]  7.sira

    }                                                                   // 8. sira method bitti main method'da geri gidiyor
}
