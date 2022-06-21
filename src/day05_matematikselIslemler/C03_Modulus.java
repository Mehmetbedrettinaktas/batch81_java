package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
        // Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir sayiyi giriniz");
        int sayi= scan.nextInt();  // 5267

        int birlerbasamagi=0;
        int rakamlarToplam=0;
        int ilkGirilensayi=sayi;

        // suanda sayimiz 5267 bb= 0 ve rt=0
        birlerbasamagi=sayi%10;  // 7
        rakamlarToplam += birlerbasamagi;
        sayi /= 10;

        // suanda sayi 526 bb =7 rt=7

        birlerbasamagi = sayi%10; //6
        rakamlarToplam +=birlerbasamagi;
        sayi /=10;      // 6

        // suanda sayi 52  bb=6  rt= 13

        birlerbasamagi = sayi%10;  //2
        rakamlarToplam +=birlerbasamagi;
        sayi /=10;

        // suanda sayi 5 bb=2 rt=15

        birlerbasamagi = sayi%10;  //5
        rakamlarToplam +=birlerbasamagi;   //15+5=20
        sayi /=10;  //0

        // suanda  sayi 0 bb 5 rt 20
        System.out.println(ilkGirilensayi + " sayisinin rakamlar toplami : "+ rakamlarToplam);


    }
}
