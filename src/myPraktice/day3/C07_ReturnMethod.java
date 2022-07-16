package myPraktice_day04;

public class C07_ReturnMethod {
    public static void main(String[] args) {

        // verilen iki sayiyi carpip
        // sonucu bize donduren bir method olusturun

        int sayi1=10;
        int sayi2=5;

        int sonuc =carpGetir1(sayi1,sayi2);
        System.out.println("Illa  da sonucu main de goreyim diyenlere = " + sonuc);

    }

    public static int carpGetir1(int sayi1, int sayi2) {
        // return sayi1*sayi2;
       int sonuc =sayi1*sayi2;
        System.out.println("Illa  da sonucu carpGetir1 de goreyim diyenlere = " + sonuc);
       return  sonuc;

    }
}
