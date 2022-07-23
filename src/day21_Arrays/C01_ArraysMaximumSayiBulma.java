package day21_Arrays;

public class C01_ArraysMaximumSayiBulma {
    public static void main(String[] args) {
    /*
    Soru 1- Verilen bir int array’deki en buyuk
    sayiyi yazdiran bir method olusturun.

    */

        int [] sayilar={3, 5, 7, 1, 4, 9, 5, 2};
        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {

         int maxSayi=sayilar[0]; // burada index numarasini kast ediyoruz yani 3 degerine denk geliyor

        for (int i = 1; i <sayilar.length ; i++) {
            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];


            }

        }

        System.out.println("Arraydeki en buyuk sayi : "+ maxSayi); // 9
    }
}
