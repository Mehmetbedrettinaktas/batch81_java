package day18_WhileDoWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        // 9'dan 190'e kadar 7'nin kati olan tum
        // tamsayilari ekrana yazdiralim

        int bas = 9;
        int bitis = 190;
        int temp = bas;

        // while loop

        while (temp < bitis) {

            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }
            temp++;
        }
        System.out.println("");
        temp = bas;

        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }
            temp++;
        }while (temp < bitis) ;
    }
}