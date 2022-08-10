package repeat.day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkendList {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();

        Queue<String> ll3 = new LinkedList();

        Deque<String> ll4 = new LinkedList();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println("ll2 = " + ll2); // ll2 = [Berk, Done, Enes, Ayse]

        System.out.println(ll2.remove(3)); // Ayse
        System.out.println(ll2.remove("Kemal")); // False

        System.out.println("ll2.isEmpty() = " + ll2.isEmpty()); // ll2.isEmpty() = false

        System.out.println("ll2.set(1, \"Serap\") = " + ll2.set(1, "Serap")); // ll2.set(1, "Serap") = Done
        System.out.println("ll2 = " + ll2); // ll2 = [Berk, Serap, Enes]

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println("ll1 = " + ll1); //ll1 = [Berk, Ismail]
       ll2.retainAll(ll1);
        System.out.println("ll2 = " + ll2); //ll2 = [Berk]

        System.out.println(ll2.hashCode()); // 2066939


    }
}
