package myPraktice.day9_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekraredenEleman {
    public static void main(String[] args) {
         /*
        Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.
         */

        int [] arr ={2,3,5,6,3,5,4,1,9,6,3};

        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]

        List<Integer> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < arr.length-1 ; i++) { // arr.lenght() dedigimizde method hata veriyor
            if (arr [i]== arr[i+1] && ! tekrarEdenler.contains(arr[i])){ // [i] yanindakine esitse [i] ==[i+]
                                           // ve tekrarEdenler icinde yoksa tekrarEdenler'e ekle
                System.out.print(arr[i]+ " ");

                tekrarEdenler.add(arr[i]);


            }

        }
    }
}
