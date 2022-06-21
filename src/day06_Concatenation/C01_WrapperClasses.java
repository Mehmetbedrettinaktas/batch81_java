package day06_Concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        wrapper classe javanin hazir metotlarini kullanabilmemeiz
        icin primitiv data turlerini herbiri icin actigi class'lardir.
         */
        String str="Java ile hayat ne guzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi=true;
        // guzelMi. boolean primitive oldugundan hazir metodu olmuyor.
        Boolean buguzelMi=true;
        buguzelMi.toString();

        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.MAX_VALUE); // 32767

        String ogrlNo="123456";

        // kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyin.

        Scanner scan =new Scanner(System.in);
        System.out.println( "Lutfen 5 basamakli bir sifre giriniz");

        String sifre= scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("giriln sifrenin 3 fazlasi : "+(sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi : "+(sifreSayi+3));
        /* Wrapper class'lar ileride kullanabilecegimz pek cok
        faydali hazir method icerir.
        int ---> Iteger dir
        char --> Character
        digerleri primitive data turu ile aynidir sadece ilk haf buyuk olur.
         */

    }
}
