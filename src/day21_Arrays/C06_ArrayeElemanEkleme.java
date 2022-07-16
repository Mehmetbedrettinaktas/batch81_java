package day21_Arrays;

import java.util.Arrays;

public class C06_ArraeElemanEkleme {
    public static void main(String[] args) {
        // C05 deki method'u kullanarak array'e eleman ekleyelim

        String[] takimListesi={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";

        takimListesi=C05_ArrayeElementEklame.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));


    }
}
