package repeat.day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkendList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3 = new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        System.out.println("ll3 = " + ll3); // ll3 = [Adem, Zeynep, Hpolat, Kadir]

        System.out.println("ll3.remove() = " + ll3.remove()); // ll3.remove() = Adem bastakini siler

        System.out.println("ll3.remove(\"Hpolat\") = " + ll3.remove("Hpolat")); // ll3.remove("Hpolat") = true
        System.out.println("ll3 = " + ll3); //ll3 = [Zeynep, Kadir]

        System.out.println("ll3.element() = " + ll3.element()); //ll3.element() = Zeynep
        System.out.println(ll3.peek()); // Zeynep

        Queue<String> ll4= new LinkedList();
        // System.out.println(ll4.element()); //.NoSuchElementException

        System.out.println(ll4.peek()); // null

        // System.out.println(ll3.offer("Ahmet")); // true direk yazdirirsak true dondurur

        ll3.offer("Ahmet");

        System.out.println(ll3); // [Zeynep, Kadir, Ahmet]

        ll3.offer("Sefa");
        System.out.println(ll3); //[Zeynep, Kadir, Ahmet, Sefa]

        System.out.println(ll3.poll()); //Zeynep       bastakini hem siliyor hemde bana getriyor
        System.out.println(ll3); // [Kadir, Ahmet, Sefa]
    }
}
