package repeat.day39_Exception;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        //Soru: Kullanicidan yasini girmesini isteyin.
        // Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        // Exception verecek sekilde yazin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Yasini giriniz: ");
        int yas = scan.nextInt();

        try {
            if(yas<0){
                throw  new IllegalArgumentException();

            }else{
                System.out.print("Yasiniz : "+yas); // yas -23 girilindiginde IllegalArgumentException hatasi veriyor
            }

        } catch (IllegalArgumentException e) {

            e.printStackTrace();
          //  System.out.println("Yas negatif olamaz");
            System.err.println("Yas negatif olamaz");
        }

    }
}
