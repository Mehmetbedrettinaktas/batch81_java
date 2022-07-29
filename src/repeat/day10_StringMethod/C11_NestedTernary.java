package repeat.day10_StringMethod;

import java.util.Scanner;

public class C11_NestedTernary {
    public static void main(String[] args) {

        /*
        kullanicidan bir harf isteyin kucuk ise consola "kucuk harf",
        buyuk harfse consola "Buyuk Harf" yoksa
         "girdiginiz karekter harf degil" yazdir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        /*
        String sonuc= (harf >= 'a' && harf <= 'z') ? ("kucuk Harf") :
                ("Buyuk harf veya gecersiz karekter");

         */
        String sonuc= (harf >= 'a' && harf <= 'z') ? ("kucuk Harf") :
                ((harf >= 'A' && harf <= 'Z') ? "Buyuk harf " : "Gecersiz karekter");
        System.out.println(sonuc);

        System.out.println("**********() siz ************");
        String sonuc2= harf >= 'a' && harf <= 'z' ? "kucuk Harf" :
                harf >= 'A' && harf <= 'Z' ? "Buyuk harf " : "Gecersiz karekter";
        System.out.println(sonuc2);

    }
}
