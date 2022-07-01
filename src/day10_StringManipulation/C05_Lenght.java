package day10_StringManipulation;

public class C05_Lenght {
    public static void main(String[] args) {

        String str ="Java ogren, isi kap";
        System.out.println(str.length()); // 19         str'in karekter sayisi 19 dur.
        System.out.println(str.charAt(16)); // p
        System.out.println(str.charAt(str.length()-1)); // p  son karakteri yazdiriyoruz.
        System.out.println(str.charAt(str.length()-3)); // k

        /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazdirdigi variable'in
        hic bir degr alamadigini isaretcisidir.
         */

        String str2 =""; // str2'ye bir deger atanmis midir EVET
                        // bu deger nedir : hiclik
        System.out.println(str2.length()); // 0

        String str3=null; // str3'e bir deger atanmis midir HAYIR
                        // null  deger atamamayi isaret etmektedir.
        System.out.println(str3.length());
        // bir deger atanmamis ki nasil uzunlugu olsun?
        // NullPointerException olarak hata verir.


    }
}
