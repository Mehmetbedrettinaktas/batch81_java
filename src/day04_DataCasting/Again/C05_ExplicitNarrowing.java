package day04_DataCasting.Again;

public class C05_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1= -127;

        short sayi2= (short) sayi1;

        byte sayi3=(byte) sayi1;
        System.out.println(sayi3);  // sayi1 = 500 --> sayi3 =-12


    }
}
