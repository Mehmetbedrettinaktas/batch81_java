package myPraktice_day04;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {

         /*
          Eger bir class'in icerisinde herhangi bir hesaplama yapip
          bunu da kalici olarak saklamak istersek
          kodumuzu sade ve anlasilir tutmak icin
          islemi bir method'da yapip
          sonucunu main method'a dondurebiliriz
          Return type'i void olmayan bir method'un sonucunu
          main method'da bir variable'a atama yaparsak
          programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */

        // kullanicidan sehir ismini ve dogum tarihini alin
        // bunlari programda kullanaccgimiz formatta bize donduren bir method olusturun
        // sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz.

        String sehir=sehirAl1();   // "MARDIN" bizden istenen fortmat
        String tarih= tarihAl1();

        System.out.println("Girdiginiz sehir :"+sehir);  // MARDİN
        System.out.println("Girdiginiz tarih : "+tarih);  // 2022-08-23



    }

    public static String tarihAl1() {
        String tarih="";

        Scanner scan = new Scanner(System.in);
        System.out.print("yil giriniz : ");

        int yil= scan.nextInt();

        if (yil>1900 && yil<2100){
            tarih= yil+"-";
        }else {
            System.out.println("yil icin gecerli bir sayi yazamalisiniz(1900-2100 : ");
        }
        System.out.print("kacinci ay oldugunu tam sayi olarak yaziniz : ");
        int ay = scan.nextInt();
        if (ay<=0 ||ay>12){
            System.out.println("Ay no 1-12 arasinda olamalidir : ");
        }else if(ay<10) {
            tarih=tarih+ "0"+ay + "-";
        }
        System.out.print("Lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz : ");
        int gun = scan.nextInt();
        if (gun<=0 || gun >31){
            System.out.println("gun no olarak 1-31 arasinda sayi girilmrlidir: ");
        } else if (gun<10) {
            tarih=tarih+ "0"+gun;

        }else {
            tarih=tarih+gun;
        }
        return tarih;


    }

    public static String sehirAl1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen sehir adini giriniz : ");
        String sehirAdi=scan.next().toUpperCase();

        return  sehirAdi;






    }
}
