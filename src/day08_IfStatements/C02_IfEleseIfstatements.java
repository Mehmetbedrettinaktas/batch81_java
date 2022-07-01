package day08_IfStatements;

import java.util.Scanner;

public class C02_IfEleseIfstatements {
    public static void main(String[] args) {
        /*
        Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”,
        50 ye esit veya buyuk 60 dan kucukse "C"
         60 'a   esit veya buyuk 80 dan kucukse "B"
          80'e esit  veya uzerinde ise  "A"
          gecersiz not girdiginizde uyari verelim

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100' kadar bir not degeri giriniz");
        double note = scan.nextDouble();
        // veya
        if (note < 0 || note > 100) {
            System.out.println("Lutfen gecerli bir not giriniz");
            //bu satira geldiysek notumuz 0 ile 100 arasindadir
        } else if (note < 50) {
            System.out.println("Notunuz : D");
            //bu satira geldiysek notumuz 50 ile 100 arasindadir
        } else if (note < 60) {
            System.out.println("Notunuz C");
            //bu satira geldiysek notumuz 60 ile 100 arasindadir
        } else if (note < 80) {
            System.out.println("Notunuz B");


        } else {
            System.out.println("Notunuz A");
        }
    }
}
