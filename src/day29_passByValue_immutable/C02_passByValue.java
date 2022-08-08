package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_passByValue
{
    public static void main(String[] args) {

        /*
        birden fazla element iceren array ve arrayList gibi
        yapilarda da passByvalue gecerlidir.

        Eger method'da array veya listin kendisi degistirilirse
        passByvalue ozelligi sebebiyle Java degisen degeri degil
        array veya listin' orjinal degerini alir

        Ancak array veya list degistirilimeden
        sadece icindeki elemanlar degistirilirse Java
        obje degismedegi icin(referans ayni), ayni array veya list'i bize
        dondurur ancak icindeki elementler degismis olacaktir.
         */

        /*
        verilen bir dort elemanli bir arry'i
        method'a gonderelim, method'da yeni 3 elemanli bir
        array atayip bu yeni array'e rastgele 100'den kucuk
        3 sayi atayalim method da array'i yazdiralim

        main method'da da method call'dan sonra yeniden
        method'u yazdiralim
         */

        int []arr ={3,5,8,10};

        arrayiDegistir(arr);

        System.out.println("method call'dan sonra main method'da array : "+ Arrays.toString(arr));
        // [3, 5, 8, 10]
        System.out.println("main method'da arr'nin referansNo = " + arr);  // main method'da arr = [I@13fee20c


    }

    public static void arrayiDegistir(int[] arr) {

        arr =new int[3];
        Random rnd  =new       Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);

        System.out.println("method'da array : "+ Arrays.toString(arr));
        // method'da array : [27, 50, 16]

        System.out.println("Method 'da arr' referansNo= " + arr); // Method 'da arr = [I@64616ca2
    }
}
