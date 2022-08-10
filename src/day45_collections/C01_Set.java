package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        /*
        Verilen bir Array deki tekrar eden  elementleri silip
        tekrarsiz halini array'e atayan kod yaziniz
         */
        int []arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsizSet= new HashSet<>(); // burada array'i sete atarak tekrarsiz bir array olusturduk

        for (Integer each:arr
             ) {
            tekrarsizSet.add(each); // burada array deki her bir elemani alip  set e attik
        }
        System.out.println("tekrarsizSet = " + tekrarsizSet); // tekrarsizSet = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        // burada set kullanmamizin sebebi array'i tekrarsiz hale getirmek icin kullaniyoruz

        // tekrarsiz hale getirmek icin yeni array olusturuyoruz

        int [] tekrarsizArr=new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsizArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        int i=0;
        for (Integer each:tekrarsizSet) {
            tekrarsizArr[i]=each;
            i++;

        }
        System.out.println(Arrays.toString(tekrarsizArr)); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]  bu tekrarsiz array
        arr=tekrarsizArr;
        System.out.println("Bizim array'in son hali : "+Arrays.toString(arr));
        // Bizim arr'nin son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]



    }
}
