package day28_staticBlocks;

public class C01_StaticBlock {

    static  int sayi=10;  // 5. sirada calisti
    static {

        /*

       #  static block class uyelerinin tatamindan once calisir
        (main method'dan bile once)

       #  static block class olustugunda calisir, geellikle
        classla ilgili on ayarlamalar veya static variable'lara
        deger atamak icin kullanilir.

       #  static block'larin class icerisinde nerede oldugu
        onemli degildir once static block'lar calisir

        #  birden fazla static blocklar varsa, yukaridan asagiya dogru calisir

         */
        System.out.println("static blok calisti"); //1.siada     static blok calisti
    }

    public static void main(String[] args) {
        System.out.println("main method calisti"); // 3.sirada calisti    main method calisti
        System.out.println("sayi = " + sayi); // 4. sirada calisti    0

    }

    static {
        System.out.println("Main method altindaki statick block calisti ");  //2. calisti
    }
}
