package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];

        System.out.println("sayilar = " + sayilar); // [I@5f2050f6 (referans numarasini veriyor)
        // non-primitive data turundeki datalari
        // her zaman direk yazdiramayabiliriz
        // Array'i yazdirmak istersek javadaki Arrays class'(Arrays.toString())indan yardim isteriz

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(sayilar[1]);

        System.out.print("sayilar = " +Arrays.toString(sayilar)); // [5, 3, 10]

        System.out.println(" ");


        String sinifList[]={"Ali", "Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList)); // [Ali, Ayse, Ahmet]

        sinifList[1]="Hasan"; // Ayse yerine Hasan Stringini atar

        System.out.println(Arrays.toString(sinifList)); // [Ali, Hasan, Ahmet]
        System.out.println(sinifList[1]); //Hasan index numarasiyla sintring teki index no ile ile yazdirilir
        System.out.println(sinifList[0]);  // Ali



    }
}
