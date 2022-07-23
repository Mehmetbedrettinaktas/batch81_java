package myPraktice.day3;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
        // verilen isim ve soyismi ilk harfi buyuk
        // geriye kalanlari * olacak sekilde degistirip
        // bize bu halini donduren bir method olusturun
        // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz

        String isim="Gonul";
        String soyisim = "Aktas";
        String gizliIsim=isimGizle1(isim, soyisim);

        System.out.println(isim + " "+ soyisim);
        System.out.println(gizliIsim);



    }

    public static String isimGizle1(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*");

        soyisim = soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w", "*");

        return isim+ " "+soyisim;


    }
}
