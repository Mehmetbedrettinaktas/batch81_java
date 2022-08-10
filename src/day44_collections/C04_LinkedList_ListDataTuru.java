package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList_ListDataTuru {
    public static void main(String[] args) {


        LinkedList<String> ll1=new LinkedList<>();

        List<String> ll2=new LinkedList<>();

        Queue<String> ll3=new LinkedList<>();

        Deque<String> ll4=new LinkedList<>(); // Deque ozelliklerin agir bastigi bir birne bagli List secmis oluyor.

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println("ll2 = " + ll2); //ll2 = [Berk, Done, Enes, Ayse]

        System.out.println("ll2.remove(3) = " + ll2.remove(3));
        // ll2.remove(3) = Ayse sildigi elementi bana getiriyordu.

        System.out.println("ll2.remove(3) = " + ll2.remove("Kemal"));
        // ll2.remove(3) = false listede kemali bulup silemedigi icn false dondurur
        /*
        eger listemizde Integer elementlerden olusuyorsa direk sayi yazarsak
        index olarak kabul eder bir variable'a atama yapar ve remove'da o veriable'in
        ismini yazarsak o obje olarak kabul eder

         */
        System.out.println("ll2.isEmpty() = " + ll2.isEmpty()); // ll2.isEmpty() = false

        System.out.println("ll2.set(1,\"Serap\") = " + ll2.set(1, "Serap")); //ll2.set(1,"Serap") = Done
        System.out.println("ll2 = " + ll2); // ll2 = ll2 = [Berk, Serap, Enes]

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println("ll1 = " + ll1); // ll1 = [Berk, Ismail]

        ll2.retainAll(ll1); // ll2 deki tum elementleri ile karsilastirir
        // ll1 de olmayanlari siler. ortak olanlari birakir digerlerini siler.
        System.out.println("ll2 = " + ll2); //ll2 = [Berk]

        System.out.println("ll2.hashCode() = " + ll2.hashCode()); // ll2.hashCode() = 2066939
        // Java olusturulan her bir obje icin bir hashCode uretir. Ayni urun icin ayni hashCode uretir

        ll2.add("Fatih");
        System.out.println("ll2.hashCode() = " + ll2.hashCode()); //ll2.hashCode() = 131726141




    }
}
