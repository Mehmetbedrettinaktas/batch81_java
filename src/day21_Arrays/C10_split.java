package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*

        split() bir array method'u degil, String method'udur

        ama array dondurdugu icin bu konuda anlatiyoruz

        split() ile herhangi bir String'i istedigimiz sekilde parcalara bolup

        bir array haline getiriyoruz.



         */


        String str = "Java, ne kadar guzel";

        String [] kelimeler=str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Java,, ne, kadar, guzel]

        String [] kelimelerNE=str.split(" ne"); // [Java,,  kadar guzel]
        System.out.println(Arrays.toString(kelimelerNE));

        String [] karakterler=str.split("");
        // [J, a, v, a, ,,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]
        System.out.println(Arrays.toString(karakterler));


        // aslinda java space'leri yok ediyor
    }
}
