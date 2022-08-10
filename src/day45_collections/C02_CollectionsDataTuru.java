package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collections <Data Turu> nu Object secmeniz durumunda
        Collections'a farkli data turlerinden objeler koymamiza izin verir
        Bu depolama acisindan bize esneklik saglar
        Ancak islem yaparken tum objeleri Object olarak
        tanimladigimizdan cok fazla castinh yapmamiz gerekebilir
         */
        List<String> liste= new ArrayList();
        // liste.add(5;
        // liste.add('c');
        // liste.add(true);

        List<Object> list= new ArrayList();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println("list = " + list); // list = [5, s, true, Ali]
        list.set(0,(Integer)list.get(0)+5);

        System.out.println("list = " + list); // list = [10, s, true, Ali]
        list.set(3,list.get(3)+" Can");
        System.out.println("list = " + list); // list = [10, s, true, Ali Can]



        Set<Object> set1= new HashSet<>();  // object butun class larin atasi oldugu icin icine herseyi atabiliriz
        set1.add(5);
        set1.add(true);
        set1.add('5');

    }
}
