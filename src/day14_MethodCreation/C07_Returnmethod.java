package day14_MethodCreation;

public class C07_Returnmethod {
    public static void main(String[] args) {

        /*
        input olarak verilen isim ve oyismi
        ilk harfleri buyuk, diger harfler kucuk olarak degistirip
        programin sonraki bulumlerinde kullanabilmek
         uzere isimSoyisim variable 'ina atayacak bir method olusturun
         input isim: ALI , soyisim:CAN
         output - isimSoyisim : ALI Can seklinde kayit

      */

        String isim= "BULENT";
        String soyisim= "YILMAZ";

       String isimSoyisim=isimDuzenle(isim,soyisim);

        System.out.println( "ilk girilen : "+isim+ " " + soyisim);
        System.out.println("Degistirilmis hali : "+isimSoyisim);

    }

    private static String isimDuzenle(String isim, String soyisim) {
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        String soisimDuzenlenmis=soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).toLowerCase();

        return  isimDuzenlenmis +" "+soisimDuzenlenmis;


    }
}
