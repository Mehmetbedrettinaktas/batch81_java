package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C005_LinkedList_QueueDataturu {
    public static void main(String[] args) {
        Queue<String> ll3 = new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        // Queue kuyruk demektir sira onemlidir gelen sona gelir giden bastan gider.

        System.out.println("ll3 = " + ll3); // ll3 = [Adem, Zeynep, Hpolat, Kadir]
        System.out.println("ll3.remove() = " + ll3.remove()); //ll3.remove() = Adem

        System.out.println("ll3 = " + ll3); //ll3 = [Zeynep, Hpolat, Kadir] Adem gitmis

        System.out.println("ll3.remove(\"Hpolat\") = " + ll3.remove("Hpolat")); // ll3.remove("Hpolat") = true
        System.out.println("ll3 = " + ll3); // ll3 = [Zeynep, Kadir]

        System.out.println(ll3.element()); // Zeynep  element silmeden ilk elementi bize donduruyor
        System.out.println(ll3.peek()); //Zeynep

        Queue<String> ll4 = new LinkedList<>();
        // System.out.println(ll4.element()); // throws .NoSuchElementException
        System.out.println(ll4.peek());// null
        /*
        peek ve element silmeden ilk elementi bize dondurur
        aralarindaki fark element yoksa element throws(Exception) dondurur
        peek ise null dondurur
         */

        ll3.offer("Ahmet"); // offer add gibi istenen elementi sona ekler
        ll3.offer("Sefa");

        System.out.println(ll3); // [Zeynep, Kadir, Ahmet, Sefa]

        System.out.println("ll3.poll() = " + ll3.poll()); //ll3.poll() = Zeynep
        System.out.println(ll3); // [Kadir, Ahmet, Sefa]

        // System.out.println(ll4.remove()); // .NoSuchElementException

        System.out.println(ll4.poll()); //null


    }
}
