package day04_DataCasting.Again;

public class C01_Swap1 {
    public static void main(String[] args) {
        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz

        Orn    : sayi1=10 ve
                sayi2=20;
        kod calistiktan sonra
                sayi1=20 ve
                sayi2=10
               bu soruyu  bos kova kullanmadan yap swap yontemiyle yapiniz

         */

        int sayi1=10;
        int sayi2=20;

        sayi1= sayi1 + sayi2;

        sayi2=sayi1-sayi2;
        System.out.println("Swap tan sonra sayi2 : "+ sayi2);

        sayi1=sayi1-sayi2;
        System.out.println("Swap tan sonra sayi1 : "+sayi1);



    }
}
