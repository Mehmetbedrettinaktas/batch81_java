package day10_StringManipulation;

import java.util.Locale;

public class C02_ToLowerCase {
    public static void main(String[] args) {

        String str="Beni pisikopata baglamayin";
        System.out.println(str.toUpperCase()); // butun harfleri buyuk harf yapar
                                                // BENİ PİSİKOPATA BAGLAMAYİN

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        // Eger buyuk-kucuk harf donusumunde local bir dili esas almak isterseniz
        // bu method kullanilabilir.

    }
}
