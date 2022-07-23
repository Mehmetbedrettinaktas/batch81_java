package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'i array yapan sembol [] idi
        arrasList de ise <> diamond(elmas) kullaniriz

         */
        List <String> isimler =new ArrayList<>();
        System.out.println(isimler); // [] bos liste

        // bir list' e eleman eklemek istersek

        isimler.add("Basak");

        System.out.println(isimler.add("Ayse")); // true  sonuc boolean doner


        /*
        string'de bir method calistirmadigimzda
        assing yapmazsak String degismiyordu

        String isim ="Suleyman"
        isim.toUpperCase(); // SULEYMAN
        sout(isim) --> suleyman


         */

        System.out.println(isimler); // [Basak, Ayse]

        /*
        List'in tek kotu tarafi array alt yapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir.

         */

    }
}
