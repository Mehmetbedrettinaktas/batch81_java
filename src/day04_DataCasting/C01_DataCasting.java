package day04_DataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf ='a';
        char yeniHarf=(char)(harf+1); // kod bu durumda once sagdaki islemi yapar.
                                // cahr yeniHarf = 97+1 -->98
                                // char bir variable 98 olamayacagi icin java hata verir.
                                // bu islemi (char) (harf+1);=98=b esit olur

        System.out.println(yeniHarf);


        int sayi1= (int) 7.2;
        System.out.println("sayi1 : "+sayi1);
        /* bazen bir veriable'a olusturuldugu data turu disinda deger atanabili
        bunlardan bazisini Java otomatik olarak kabul eder.

        java eger bu deger atamasinda sorun olusacagina (data kayiplarini olabilecegini
        veya data baskalasabilecegi) gururse bu durumuda otomatik olarak
        bu atamayi kabul etmez sizden eger bu atamayi istiyorsaniz
        sorumlulugu olamnizi bekler
         */

        double sayi2=10;
        System.out.println("sayi2: "+ sayi2);

        int sayi3='c';
        System.out.println("sayi3 : "+sayi3);
        char harf2=98;
        System.out.println("harf2 : "+harf2);




    }

}
