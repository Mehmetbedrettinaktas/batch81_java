package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    /*
    Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin

     */
    public static void main(String[] args) {
        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        // Sondan basa gelebilmek icin once sona gitmek lazi

        ListIterator li1= liste.listIterator();
        System.out.println("liste = " + liste); //liste = [2, 13, 56, 23, 45, 14, 40]

        while (li1.hasNext()){
            li1.next();
        }
        // bu loop bizi sona goturur
            // previous sondan basa dogru gidiyor
             // hasnext() methodu bastan sona dogru gidiyor
        while (li1.hasPrevious()){ // hasPrevious() yanda eleman var diye sorar varsa devam eder
            System.out.print( li1.previous()+" "); //40 14 45 23 56 13 2 previous() ise yana kay demek
        }
    }
}
