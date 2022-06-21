package day03_scanner.Again;

public class Again_Swap {
    public static void main(String[] args) {
        /*
        1- verilen sayi1 ve sayi2 variable'larinin degerini
        degistiren(SWAP) bir program yaziniz.
        or: sayi1=10 ve
            sayi2=20;
            kod calistiktan sonra
            sayi1=20; ve
            sayi2=10;

         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        sayi3 = sayi2;

        System.out.println(sayi3);
        System.out.println(sayi2);
        sayi2 = sayi1;
        System.out.println("Swap'tan sonra sayi2: " + sayi2);
        sayi1 = sayi3;
        System.out.println("Swap'tan sonra sayi1: " + sayi1);

        System.out.println("#############");
    /*

        int number1=10;
        int number2=20;
        int number3=0;
       // 1)
        number3=number2;
        System.out.println(number3); // 20
       // 2)
        number2=number1;
        System.out.println("Swap'tan sonra sayi2: "+ sayi2); // 10
       // 3)
        number1=number3;
        System.out.println("Swap'tan sonra sayi1: "+sayi1);  // 20

     */


    }
}
