package day28_staticBlocks;

import static day14_MethodCreation.C08_Voidmethod.indirimliFiyatHesapla;

public class C03_PassByValue {


    public static void main(String[] args) {

        /*
        %25 indirimli fiyati hesaplayan bize donduren bir method olusturun

         */

        double satisFiyati=100;
        double indirimOrani=25;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati, indirimOrani);
        System.out.println("indirimliFiyat = " + indirimliFiyat); // 75.0
        System.out.println("satisFiyati = " + satisFiyati); // satisFiyati = 100.0

        System.out.println("****");

        double indirimliFiyat1 =indirimliFiyat1(satisFiyati, indirimOrani);
        System.out.println("indirimliFiyat1 = " + indirimliFiyat1); // 75.0
        System.out.println("satisFiyati = " + satisFiyati); // satisFiyati = 100.0
    }

   public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) { // biz burada satisFiyati goruruz ama java value gecirir

        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;

    }
    public static double indirimliFiyat1(double satisFiyati, double indirimOrani){
        double indirimliFiyat1=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat1;
    }
}
