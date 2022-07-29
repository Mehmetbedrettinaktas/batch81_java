package day13_methodCreation;

public class C03_stringManipulation {
    public static void main(String[] args) {
        /*
        String methodlarini kullanarak
        “  Java ogrenmek123 Cok guzel@  ”  String’ini
        “Java ogrenmek cok guzel.” sekline getirin.
         */

        String str= "  Java ogrenmek123 Cok guzel@  ";

        str=str.trim(); // trim() methoduyla sintringin basindaki ve sondaki bosluklari siler
        str=str.replaceAll("\\d", ""); // \\d ile sayilari istedigimiz karekterlerle degistirebiliriz.
        str=str.replace("@", "."); // replace() ile istenen String veya s
                                                        // intring karekter veya Stringle degistirilebilir
        str=str.replace("C","c");



        System.out.println(str);
    }
}
