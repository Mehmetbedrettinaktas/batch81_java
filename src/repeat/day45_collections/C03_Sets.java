package repeat.day45_collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_Sets {
    public static void main(String[] args) {
          /*
        Bir TreeSet ve HashSet'e random 100 sayi ekleyin
        islem surelerini kiyaslayin
         */

        Set<Integer>treeS=new TreeSet<>();
        int sayi=0;
        int sayiAdet=0;
        Random rnd=new Random();
        long startTime = System.currentTimeMillis();
        System.out.println("StartTime : "+ startTime);//startTime = 1660219857689

        while (sayiAdet<=100){

            sayi=rnd.nextInt(101);
            treeS.add((Integer)sayi);
            sayiAdet++;

        } long endTime = System.currentTimeMillis();
        System.out.println("EndTime : "+endTime);//endTime = 1660219857690




        int sayi2=0;
        int sayiAdet2=0;
        Set<Integer> has=new HashSet<>();
        long startTime2 = System.currentTimeMillis();//startTime = 1660202443336
        System.out.println("startTime2 : "+ startTime2);
        while (sayiAdet<=100){

            sayi=rnd.nextInt(101);
            has.add((Integer)sayi);
            sayiAdet++;

        }

        long endTime2 = System.currentTimeMillis();
        System.out.println("endTime2 :"+ endTime2);//endTime = 1660202443336

    }
}