package repeat.day21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_UniqueArrayOlusturma {
    public static void main(String[] args) {

          /*
        Soru 2) Verilen bir array’deki tekrar eden  elementleri
        tek bir defa barindiran yeni bir
        array olarak donduren bir method olusturun
        unique = hic tekrar etmeyen
         */

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3};

        int[] uniqueArray = uniqueArrayOlustur1(arr);

        System.out.println(Arrays.toString(uniqueArray)); // [1, 2, 3, 4, 5, 6, 9]
    }

    private static int[] uniqueArrayOlustur1(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //  // [1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]
        List<Integer> benzersizList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {

                benzersizList.add(arr[i]);
            }

        }

        if (! benzersizList.contains(arr[arr.length - 1])) {
            benzersizList.add(arr[arr.length - 1]);
        }
        int[] tekrarsizArr = new int[benzersizList.size()];
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);

        }

        return tekrarsizArr;
    }
}
