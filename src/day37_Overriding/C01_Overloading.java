package day37_Overriding;

public class C01_Overloading {
    public static void main(String[] args) {

        /*
        Bir class'da ayni isimde ve ayni signiture'a sahip iki method olmaz
        Ayni class'ta ayni isimde birden fazla method olusturmak istersek
        mutlaka signiture'i degistirmeliyiz.

        farkli class'larda ayni ve signiture'a sahip iki method olabilir mi?
        evet olabilir cunku farkli class'lardir.
         */
    }
    void ekleme(){

    }
    void ekleme(int sayi){


    }
    void ekleme(String str){

    }
    void ekleme(String str, int sayi){

    }
    void ekleme(int sayi, String str){

    }
}
