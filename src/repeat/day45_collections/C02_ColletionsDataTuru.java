package repeat.day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_ColletionsDataTuru {
    public static void main(String[] args) {
        List<String> liste= new ArrayList();
       //liste.add(5);
       //liste.add('s');
       //liste.add(true);
       /*
        List list = new ArrayList();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println("list = " + list); // list = [5, s, true, Ali]

        */
        List<Object> list = new ArrayList();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println("list = " + list); //
        list.set(0,(Integer)list.get(0)+5);

        Set<Object> set1 = new HashSet<>();
        list.add(5);
        list.add('5');
        list.add(true);

    }
}
