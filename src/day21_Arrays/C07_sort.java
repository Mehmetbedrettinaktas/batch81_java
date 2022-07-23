package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int [] sayilar={5,7,1,5,7,4,9};
        String [] harfler={"R","D","C","T"};
        // Array'i Arrays class'ini kullanarak natural sirali hale getirebiliriz

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [1, 4, 5, 5, 7, 7, 9]
        System.out.println("harfler = " +Arrays.toString(harfler)); // harfler = [R, D, C, T]
        Arrays.sort(harfler);
        System.out.println("harfler = " +Arrays.toString(harfler)); // harfler = [C, D, R, T]


    }
}
