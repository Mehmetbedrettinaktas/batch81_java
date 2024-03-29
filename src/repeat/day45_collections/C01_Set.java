package repeat.day45_collections;

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

        Set<Integer> tekrarsizSet= new HashSet<>();

        for (Integer each:arr) {
            tekrarsizSet.add(each);

        }
        System.out.println("tekrarsizSet = " + tekrarsizSet); // tekrarsizSet = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int [] tekrarsizArr=new int[tekrarsizSet.size()];
        System.out.println("tekrarsizArr = " + Arrays.toString(tekrarsizArr)); // tekrarsizArr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        int i=0;
        for (Integer each:tekrarsizSet) {
            tekrarsizArr[i]=each;
            i++;

        }

        System.out.println("Set = " + Arrays.toString(tekrarsizArr)); //Set = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        arr=tekrarsizArr;
        System.out.println("Bizim array'in son hali  = " + Arrays.toString(arr)); //Bizim array'in son hali = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
