package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByvalue {
    public static void main(String[] args) {
        /*
        4 elemanli bir array olusturalim sonra ayri bir method'da
        bu array'in 2. ve 4. elemanlarini 100'den
        kucuk rastgele bir sayi ile degistirelim
        ve yeni halini yazdiralim

         */

        int []arr={5,7,8,10};
        elemanDegistir(arr);
        System.out.println("main methud'un icinde diger method calistiktan sonra: "+Arrays.toString(arr));
        // [5, 78, 8, 29]

    }

    public static void elemanDegistir(int[] arr) {

        Random rnd  =new  Random();

        arr[1]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("Methodun icinde : "+Arrays.toString(arr)); // Methodun icinde : [5, 93, 8, 22]

            /*
            Bii objenin kendisini degistirmezsek sadece elemanlarini degistirisek
             java bakiyor referans degismedigi icin
            arayya'i degistirmiyor.

            */

    }
}
