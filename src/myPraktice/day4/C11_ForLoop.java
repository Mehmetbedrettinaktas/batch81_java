package myPraktice.day4;

public class C11_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 8 ) Interview Question Kullanicidan
        bir String isteyin ve Stringi tersine ceviren
bir method yazin
         */

        String input ="Selahaddin yuzmeyi ogreniyor ";
        bunuTerseCevir(input);
    }

    public static void bunuTerseCevir(String input) {
        String bunuTerseCevir="";

        for (int i = input.length()-1; i >= 0 ; i--) {
            bunuTerseCevir+=input.substring(i,i+1);

        }
        System.out.print("bunuTerseCevir : "+ bunuTerseCevir);
    }
}
