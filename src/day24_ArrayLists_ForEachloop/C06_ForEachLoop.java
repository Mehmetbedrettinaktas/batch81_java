package day24_ArrayLists_ForEachloop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        int [] arr={2,3,4,6,23,6,8,9,1};
        List<Integer> liste= new ArrayList<>();
        // array'deki tum elemanlari inceleyelim,
        // tek sayi olalanlari list'e atayalim
        // each==> herbir

        // index lazim degilse bunu kullaniyoruz, index isteniyorsa kullanamayiz
        // burada uc seye ihtiyac var;
        for (int each:arr // gelecek datalarin turu,
                            // loop icinde ne isim verdigim, nereden aldigim
             ) {
            if ( each%2==1){
                liste.add(each);
            }

        }
        System.out.println("liste = " + liste); // [3, 23, 9, 1]
    }
}
