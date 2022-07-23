package day24_ArrayLists_ForEachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ForEachloopOrtakElemanlariBulma {
    public static void main(String[] args) {
        /*
        iki String array olusturunuz ve bu array’lerdeki
        ortak elemanlari For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
         */

        String [] arr1={"Ali","Veli","Can","Ayse"};

        String[] arr2={"Ali","Hasan","ayse","Enes"};

        List<String> ortakIsimler= new ArrayList<>();

        for (String each1:arr1
             ) {
            for (String each2: arr2
                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }
            }

        }

        if (ortakIsimler.isEmpty()){
            System.out.println(" hic ortak eleman yok ");
        }else {
            System.out.println("her iki arraydaki ortak isimler : "+ortakIsimler);
        }
        System.out.println("arr1 = " + Arrays.toString(arr1)); // [Ali, Veli, Can, Ayse]
        System.out.println("arr2 = " + Arrays.toString(arr2)); // [Ali, Hasan, ayse, Enes]
    }
}
