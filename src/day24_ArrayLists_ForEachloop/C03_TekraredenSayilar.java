package day24_ArrayLists_ForEachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekraredenSayilar {
    public static void main(String[] args) {
        /*
        Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.
         */

        int [] arr ={2,3,5,6,3,5,4,1,9,6,3};

        Arrays.sort(arr); // 1. once dogal siralama yapiyoruz.
        System.out.println(Arrays.toString(arr));// [1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]
        List <Integer> tekrarEdenler= new ArrayList<>();

        for (int i = 0; i < arr.length -1 ; i++) { // arr[i] == arr[i+1] tekrar ediyorsa yazdir yoksa yazdirma
            if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])){
                System.out.print(arr[i] +" "); // 3 3 5 6 // ayni sayidan ikiden daha fazla olursa birden
                                                // fazla yazdirir.  boyle durumda tekrara girmek istemiyorsak
                                                // forLoop tan once bir List<> olusturup satir 17
                tekrarEdenler.add(arr[i] );   // 3 5 6


            }

        }


    }
}
