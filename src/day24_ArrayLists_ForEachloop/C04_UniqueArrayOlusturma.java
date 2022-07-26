package day24_ArrayLists_ForEachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        /*
        Soru 2) Verilen bir array’deki tekrar eden  elementleri
        tek bir defa barindiran yeni bir
        array olarak donduren bir method olusturun
        unique = hic tekrar etmeyen
         */

        int [] arr ={2,3,5,6,3,5,4,1,9,6,3};

        int [] uniqueArray= uniqueArrayOlustur(arr);  // bir array dondurecek bize getirdigi array'i kaydecek bir
                                                    // veraiable olusturmak lazim (uniqueArray) gibi

        System.out.println(Arrays.toString(uniqueArray)); // [1, 2, 3, 4, 5, 6, 9]

    }

   public static int[] uniqueArrayOlustur(int[] arr) {

       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]
       List<Integer> benzersizList= new ArrayList<>();

       for (int i = 0; i < arr.length -1; i++) {
           if (arr[i] != arr[i+1]){ //  yanindaki elemente esit olmayanlari listeye ekliyor
               benzersizList.add(arr[i]); // burada son elementi kontrol edemiyoruz cunku loop hata veriyor
           }

       }
        // son elementi kontrol edip, yoksa listeye ekliyoruz
       if (!benzersizList.contains(arr[arr.length-1])){
           benzersizList.add(arr[arr.length-1]);
       }


       // 1,2,3,4,5,6,9 benzersiz(tekrarsiz) list
       // benzersiz listenin size() bilgisini kullanarak bir Array olusturduk

       int [] tekrarsizArr=new int[benzersizList.size()]; // icinde sadece default degerler var
       // deger eklemek icin fori kullaniyoruz

       // benzersiz listedeki tum elemanlari, yeni array'e atadik
       for (int i = 0; i < tekrarsizArr.length ; i++) {
           tekrarsizArr[i]=benzersizList.get(i);


       }
       // olusturdugumuz yeni array'i main method'a dondurduk
        return  tekrarsizArr;
    }
}
