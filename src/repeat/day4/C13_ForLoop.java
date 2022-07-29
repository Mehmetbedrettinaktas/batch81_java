package repeat.day4;

import java.util.Scanner;

public class C13_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
         Girilen sayilar ve aralarindaki tum tamsayilari
           toplayip, sonucu yazdiran bir program yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print(" Lutfen pozitif iki tamsayi giriniz : ");
        int bas= scan.nextInt();
        int bitis=scan.nextInt();

        aradakileriTopla(bas,bitis);


    }

    public static void aradakileriTopla(int bas, int bitis) {
        int toplam=0;
        for (int i = bas; i <=bitis ; i++) {
            toplam +=i;
            if (bas<=bitis){
                System.out.println("Toplam : "+toplam);
            }

        }
    }
}
