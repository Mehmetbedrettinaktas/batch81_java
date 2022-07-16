package day13_methodCretion;

public class C01_stringManipulation {
    public static void main(String[] args) {

        /*
       String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz.
-String str1 = "$13.99"
-String str2 = "$10.55"
ipucu= Double.parseDouble() metodunu kullanabilirsiniz.

         */


        String str1= "$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D", "");
        double sayi1=Double.parseDouble(str1);
        // parseDouble bir data type 'ni(ornegin:str1 'i )
        // double  data type donusturur.
        // Tamamen String olan bir data type'ni Double veya integer'a ceviriyoruz.

        str2=str2.replaceAll("\\D","");
        double sayi2=Double.parseDouble(str2);


        System.out.println("$"+ (sayi1+sayi2)/100);
    }
}
