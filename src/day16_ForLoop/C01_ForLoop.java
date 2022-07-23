package day16_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
        verilen bir pozitif tam sayinin
        pozitif tam bolenlerinin yazdiralim
         */

        int input=120;

        for (int i = 1; i <=input ; i++) {
            if (input%i== 0){
                System.out.println(i + " ");
            }

        }


        /*
        Belirli bir kosul saglandigi surece tekrarlanmasi gereken islemler
        icin kullanilan kod bloklarina LOOP (DONGU) denir. Tekrar sayisi
        belirli olan durumlarda FOR LOOP kullanilmasi tercih edilir.
         */


    }
}
