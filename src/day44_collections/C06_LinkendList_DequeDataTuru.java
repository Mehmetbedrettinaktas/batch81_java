package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C06_LinkendList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4= new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Teyfik");
        ll4.add("Selim");


        ll4.removeLastOccurrence("Selim");
        System.out.println("ll4 = " + ll4); //ll4 = [Cavidan, Mesut, Selim, Teyfik]
        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
        // Deque iki tarafli queue demektir, dolayisiyla her method'un first ve last'i var
        System.out.println(ll4); // [Selim]


    }
}
