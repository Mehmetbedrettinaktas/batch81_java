package praktice.day2;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
         /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
     Scanner scan = new Scanner(System.in);
    //  System.out.print(" Lutfen birinci sayiyi giriniz : ");
    //  double sayi1=scan.nextDouble();

      /*
      System.out.print(" Lutfen ikinci sayiyi giriniz : ");

         double sayi2=scan.nextDouble();

        System.out.print(" Lutfen ucuncu sayiyi giriniz :");
        double sayi3=scan.nextDouble();


        double sonuc=(((sayi1*sayi1)-(sayi2*sayi2))/(3*sayi3));

        System.out.println("sonuc = " + sonuc);

       */
        double a;
        double b;
        double c;
        System.out.println( "Lutfen a sayisini giriniz");
        a=scan.nextDouble();
        System.out.println(" Lutfen b sayisini giriniz");
        b=scan.nextDouble();
        System.out.println(" Lutfen c sayisini giriniz");
        c=scan.nextDouble();

        double sonuc=( (a*a)-(b*b)) /(3*c);
        System.out.println("sonuc : " +sonuc);





    }
}