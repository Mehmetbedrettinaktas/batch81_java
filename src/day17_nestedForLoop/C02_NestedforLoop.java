package day17_nestedForLoop;

public class C02_NestedforLoop {
    public static void main(String[] args) {
        // verilen sayi gore carpim tablosu olusturalim

        /*

        input 3
        1 2 3
        2 4 6
        3 6 9

         */
        /*
        bize uzunlugu 3 olan bir nested for loop lazim
         */

        int input=3;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {

                System.out.print(i*j + "   ");

            }

            System.out.println(" ");
        }
    }
}
