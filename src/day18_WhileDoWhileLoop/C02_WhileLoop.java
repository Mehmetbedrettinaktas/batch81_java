package day18_WhileDoWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan bir sayi alin ve
        bu sayinin rakamlari toplamini yazdirin
         */

        int input =45678946;

        int rakamlarToplami=0;
        int birlerBasamigi=0;
        int temp=input;

        while (temp>0){

            birlerBasamigi=temp%10;
            rakamlarToplami += birlerBasamigi;
            temp /=10; // birler basamgindan kurtulmak icin bu islemi kullaniyoruz
                        // cunku birler basamagi /10 yaptigimizda 0.9 oluyor int bunu sifir aliyor
        }
        System.out.println(input+" sayisinin rakamlar toplami : "+ rakamlarToplami);
    }
}
