package day10_StringManipulation;

public class C01_cahrAt {
    public static void main(String[] args) {
        String str ="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(4)); //
        System.out.println(str.charAt(6));//g
        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.length() -1);
        System.out.println(str.toLowerCase().charAt(21));

        // son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz.
        //eger index olarak  uzunlugu veya daha bir sayiyi girersek Java exception verir.
        /*
        charAt() kullandigimizda sonuc char olacagi icin artik manipulation(degisiklik) yapamayiz
        String method'larindan kullanmamiz gereken bir method varsa
        charAt( ) 'den once kullanmaliyiz

         */

    }
}
