package day17_nestedForLoop;

public class C06_NestedForloop {
    public static void main(String[] args) {
        /*
        verilen Stringi
        asagidaki gibi yazdiran bir program yazdirin
        input= Deniz
            A
            An
            Ank
            Anka
            Ankar
            Ankara

         */

        String input = "Ankara";

        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j)); // ilk harf icin substring(0,1) olamliydi

            }
            System.out.println("");
        }
    }
}
