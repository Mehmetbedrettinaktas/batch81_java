package repeat.day20_Arrays;

import java.util.Arrays;

public class C02_ArraysOlusturma {
    /*
    Elemanlari "Ali", "Veli","Ayse" ve "Fatma" olan bir array
    olusturun ve bunu yazdirin.
     */
    public static void main(String[] args) {
        String liste[]=new String[4];
        liste[0]="Ali";
        liste[1]="Fatma";
        liste[2]="Ayse";
        liste[3]="Fatma";
        System.out.println(Arrays.toString(liste)); // [Ali, Fatma, ayse, Fatma]


        // Array'imize yeni elemanlar atadik
        liste[0]="Can";
        liste[2]="Gul";
        System.out.println(Arrays.toString(liste)); // [Can, Fatma, Gul, Fatma]

        // Array'imizin uzunlugunu buluduk
        int size =liste.length;
        System.out.println("size = " + size); // size = 4
       // System.out.println(Arrays.toString(liste.length)); bu sekilde uzunlugu bulmaya calisirsak java CTE verir

        // bir array'in tum elemanlarini yazdirma


    }
}
