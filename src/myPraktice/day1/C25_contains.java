package myPraktice.day1;

public class C25_contains
{
    public static void main(String[] args) {
         /*
        Kullanicidan bir cumle isteyin. Cumle “buyuk”
         kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
         “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
         iki kelimeyi de icermiyorsa

        “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */

        String cumle = "Java buyuk, duya kucuk";
        cumle=cumle.toLowerCase();

        // requirements'de buyuk kucuk harf hassasiyeti
        // hakkinda bir sey soylenmemis
        //ikinci olarak da her iki kelimeyi de icerme durumu aciklamamis.
        // bu durumda gorevi kim bize verdiyse ona sormak lazim

        // ek requirments : ikisini de iceriyorsa "Karar ver buyuk mu yazdirayim, kucuk mu?
        // cxase sensetive olmasin

        if (cumle.contains("kucuk")&& cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu?");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
            
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
            
        }else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }

    }
}
