package day11_stringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";

        /* verilen bir String'de herhangi bir String veya char'in
        ilk kullanildigi index'in bize dondurur.

         */

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r"));// 7
        System.out.println(str.indexOf("j"));//-1

        System.out.println(str.indexOf("mek")); // 10   bunu bir bir blok olarak dusunur ve ilk harfin index 'ini verir.
        // eger istedgimiz index'den sonrasini kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullanabiliriz.

                                         //6       7      index
        System.out.println(str.indexOf("g", (6 + 1))); // (6+1) anlami birsonraki  index'den baslar
        /*
        yukardaki srt'da 2. ve 3. e'nin indexlerini bulun
        2.ci e'yi bulabilmek icin 1.e'nin index'ine ihtiyacim var
         */

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);

        // eger 2.e varsa 3. e'nin olup olmadigini
        // ve varsa index'ini yazdiralim.

        if (ikincie == -1) {  // -1 ---> eger yoksa
            System.out.println("verilen str'da 2.e yok");
        } else {
            int ucuncue = str.indexOf("e", ikincie + 1);
            if (ucuncue == -1) {
                System.out.println("verilen  str'da 3. e yok");
            } else {
                System.out.println("verilen  str'daki 3.e'nin index'i : " + ucuncue);
            }
        }

    }
}
