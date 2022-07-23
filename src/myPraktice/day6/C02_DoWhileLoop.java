package myPraktice.day6;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan bir sayi alin ve
        bu sayinin rakamlari toplamini yazdirin
         */

        int input =954321;
        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while (temp>0){

            birlerBasamagi=temp%10;
            rakamlarToplami +=birlerBasamagi;
            temp/=10;

        }
        System.out.print(input + " sayisinin rakamlar toplami :"+ rakamlarToplami);



    }
}
