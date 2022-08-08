package day37_Overriding;

public class FSupra extends EToyota {


    void yakit() {
        System.out.println("Supra benzin kullanilir");
        /*
        Private method'lar overrid edilemezler
        Eger Child class'da parent class'daki private method ile
        ayni signiture'da bir method olusturursaniz
        bu overridding method OLMAZ.
         */

    }

    @Override // notasyonu
    void motor() {

        /*
        @Override notasyonu Javaya bir gorev verir
        Java, bu notasyonla birbirine bagli olan iki method'u
        surekli kontrol eder
        Eger parent class'daki overridden method'u silinirseniz CTE verir.

        @Override notasyonu kullanmak mecburi degildir. Iki durumda da calisir
        Eger Overridding method silinirse, kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz.
         */


    }
}
