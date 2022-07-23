package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable : degistirilemez
        mutable   : degistirilebilir

        en meshur immutable class : String dir.

         */

        String str ="Yildiz Bank";
        str.toUpperCase();
        System.out.println("str = " + str); // str = Yildiz Bank

        System.out.println(str.toUpperCase()); // YİLDİZ BANK

        str.toLowerCase(); // ata yapilmadigi icin kalici olarak degismez yazdirsak bizim str yazdirir.
        System.out.println("str = " + str); //  Yildiz Bank

        str.substring(3,5); // sout olmadigindan yazdirmaz, di

        System.out.println("str = " + str); // str = Yildiz Bank


        // Java da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class class'i da vardir.

        StringBuilder sb= new StringBuilder("Java Bank");
        System.out.println("sb = " + sb); // sb = Java Bank

        sb.reverse(); // atama yapmadik sadece ters cevirdik
        System.out.println("sb = " + sb); // sb = knaB avaJ -->  eger String olsaydi Yildiz Bank yazdirirdi.

        sb.append("."); // append --> eklemek demek sonuna bir "." koyduk
        System.out.println("sb = " + sb); // sb = knaB avaJ.

    }
}
