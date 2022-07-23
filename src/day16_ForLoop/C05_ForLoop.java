package day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi isteyin. Girilen sayilar
        ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir program yaziniz
         */

        /*
        Bize ne Lazim;
        1- Scanner lazim
        2- int baslangic ve bitis iki sayi lazim
        3- toplam Method'u lazim
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen baslangic ve bitis degerli olana  iki pozitif sayi giriniz :");

        int bas=scan.nextInt();

        int bitis=scan.nextInt();


        aralariTopla(bas,bitis);

    }

    public static void aralariTopla(int bas,int bitis) {
        int toplam=0;
        if ( bas<=bitis){
            for (int i = bas; i<=bitis; i++) {
                toplam+=i;
            }
        }else {
            for (int i = bitis; i <=bas ; i++) {
                toplam +=i;

            }
        }
        System.out.println("Aradaki sayilarin toplami : "+toplam);
    }
}
