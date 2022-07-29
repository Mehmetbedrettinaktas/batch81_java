package repeat.day12_StringManipulation;

import java.util.Scanner;

public class C17_StrinManipulation {
    public static void main(String[] args) {
         /*
        Kullanicidan isim ve soyismini girmesini isteyin
        ve hangisinin daha uzun oldugunu yazdirin.
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen isim ve soyisminizi giriniz :\nisim ");
        String isim=scan.nextLine();
        System.out.println("soyisminiz");
        String soyisim=scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden daha uzun");

        } else if (isim.length()<soyisim.length()) {
            System.out.println("soyisminiz isminizden daha uzun");

        }else System.out.println("isminiz soy isminizle ayni uzunlukta");


    }
}
