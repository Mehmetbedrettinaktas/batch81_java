package repeat.day2_DataCasting;

import java.util.Scanner;

public class C01_RakamlarToplami {
    public static void main(String[] args) {
        // Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();  // 5267

        int birlerbasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilensayi=sayi;

        // suanda sayi 5267 bb=0 rt=0

        birlerbasamagi =sayi %10;  // rt 7
        rakamlarToplami += birlerbasamagi;
        sayi /=10;  //

        // sayi 526 bb=7 rt =7
        birlerbasamagi= sayi%10; // 6
        rakamlarToplami +=birlerbasamagi; // 7+6=13
        sayi /=10;

        // sayi 52  bb 6 rt 13
        birlerbasamagi =sayi%10;  // 2
        rakamlarToplami +=birlerbasamagi; // 13+2
        sayi/=10;

        // suanda sayi 5 bb 2 rt 15
        birlerbasamagi =sayi%10;  // 5
        rakamlarToplami +=birlerbasamagi;  //15+5 =20

        // suanda sayi 0 bb 5  rt 20

        System.out.println(ilkGirilensayi + " sayinin rakamlar toplami : "+rakamlarToplami);









    }
}
