package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariniYazdirma {
    public static void main(String[] args) {

        int sayilar[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;

        // Array'in tamamini yazdirmak istersek
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7]


        // Array'in tum elementlerini yazdiralim dersek fori loop kullaniyoruz

        for (int i = 0; i < sayilar.length; i++) {
            //System.out.print(sayilar[i]+" "); // 1 2 3 4 5 6 7

            if (i != sayilar.length - 1) {
                System.out.print(sayilar[i] + ", ");
            } else {
                System.out.println(sayilar[i]); // 1, 2, 3, 4, 5, 6, 7
            }

            toplam += sayilar[i];
        }
        System.out.println("toplam = " + toplam);


    }
}
