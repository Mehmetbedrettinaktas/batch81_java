package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        BinarySearch method'u siralanmis array'de
        aradigimiz elementin index'ini dondurur

        Ya aradigimiz element array'de yoksa?
        (String'de indexOf() bize olmayan elemntler icin -1 donduruyordu)

        Aradigimiz element array'de yoksa Java hem olmadigini,
        hem de olsaydi nerede olacagini bize dondurur.

        olmadigini ifade icin -(eksi) kullanilir
        olmasaydi nerede olacagini belirtmek icin index degil siralama kullanilir

        var olanlarda index, olmayanlara siraya bakiyoruz.

         */
        int [] sayilar={3,7,15,4,27,10};

        Arrays.sort(sayilar); // siralamayi kalici olarak degistirir.

        System.out.println(Arrays.toString(sayilar));  // [3, 4, 7, 10, 15, 27]
        //Varsa index, yoksa sira

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1

        System.out.println(Arrays.binarySearch(sayilar,15)); // 4

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5 olsaydi 5. sirada olurdu

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3 olsaydi 3.ci sirada olurdu

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1 olsaydi 1.ci sirada olurdu





    }
}
