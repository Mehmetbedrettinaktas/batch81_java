package myPraktice.day1;

import java.util.Locale;

public class C15_toUpperToLowerCase {
    public static void main(String[] args) {
        String str = "Beni psikopata baglamayin";

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        // lokal bir dili esas almak istersek bu method kullanilir.


    }
}
