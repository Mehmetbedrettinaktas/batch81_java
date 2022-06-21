package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        /* bir onceki swap sorusunu bos kova kullanmadan yapin.
        package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("sayi 1:" + sayi1);
        System.out.println("sayi 2:" + sayi2);
        sayi2 = sayi2 + sayi1;
        sayi1 = sayi2 - sayi1;
        sayi2 = sayi2 - sayi1;
        System.out.println("Swap sonrası sayi1 :" + sayi1);
        System.out.println("Swap sonrası sayi2 :" + sayi2);

         */

        int sayi1=20;
        int sayi2=10;
        sayi2= sayi1 + sayi2;  // sayi2= 30

        sayi1= sayi2-sayi1;  // sayi1= 20
        System.out.println(sayi1);

        sayi2 = sayi2-sayi1;  // sayi2= 10
        System.out.println(sayi2);

        System.out.println("Swap sonrası sayi1 : " + sayi1);
        System.out.println("Swap sonrası sayi2 : " + sayi2);













    }
}
