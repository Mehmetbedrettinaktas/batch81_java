package myPraktice.day9_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int [] arr ={2,3,4,6,23,6,8,9,1};
        List<Integer> liste = new ArrayList<>();

        // array'deki tum elemanlari inceleyelim,
        // tek sayi olanlari liste'e atayalim

        // for each arr array'ne git her bir int bana getir
        for (int each:arr  // buraya uc sey yaziyoruz 1. gelecek datalarin turu 2.loop icinde ne isim verdigi
                            //3. nereden aldigim
             ) {
            if ( each%2==1){
                liste.add(each);
            }


        }
        System.out.println("liste = " + liste); // liste = [3, 23, 9, 1]
    }
}
