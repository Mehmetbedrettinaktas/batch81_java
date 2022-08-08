package day30_Immutable_Date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {

        /*
        String mi yoksa StringBuldider mi daha hizlidir?
        bunun icin bir String olusturup, 10000 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zaman alip aradaki farki bulalim

        ayni islemi String bulder icin de yapalim
         */
        LocalTime baslangic=LocalTime.now();

        String str ="Ahhhh Java";



        for (int i = 0; i <10000 ; i++) {
            str +=".";

        }
        LocalTime bitis = LocalTime.now();

        System.out.println("baslangic = " + baslangic);
        System.out.println("bitis = " + bitis);

        System.out.println("String zaman : "+(bitis.getNano()-baslangic.getNano()));




         baslangic=LocalTime.now();

        StringBuilder sb = new StringBuilder("Ahhhh Java");



        for (int i = 0; i <10000 ; i++) {
           sb.append(".");

        }
         bitis = LocalTime.now();

        System.out.println("baslangic = " + baslangic);
        System.out.println("bitis = " + bitis);

        System.out.println("String Builder zaman : "+(bitis.getNano()-baslangic.getNano()));



    }
}
