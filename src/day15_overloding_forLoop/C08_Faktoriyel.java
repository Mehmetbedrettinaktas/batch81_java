package day15_overloding_forLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir tamsayi icin
        faktoriyel hesaplayip yazdiran bir method olusturun

        verilen sayi negatif veya 20'den buyuk olursa
        "girilen sayinin faktoriyeli hesaplanamaz "
        uyarisini yazdirin
         */

        int input=8;
        faktoryelHesaplama(input);


    }

    public static void faktoryelHesaplama(int input) {

        int faktoryel=1;

        if (input<0 || input>20){
            System.out.println("girilen sayinin faktoriyeli hesaplanamaz ");
        } else if (input==0) {
            System.out.println("0! = 1' dir");

        }else {
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;
            }
            System.out.print("faktoryel degeri : "+faktoryel);
        }


    }
}
