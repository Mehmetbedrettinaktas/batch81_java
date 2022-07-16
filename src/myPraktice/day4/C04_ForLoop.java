package myPraktice.day4;

import java.util.Scanner;

public class C05_ForLoop {
    /*
    Soru 10 ) Kullanicidan iki sayi isteyin.
    Girilen sayilar ve aralarindaki tum tamsayilari
toplayip, sonucu yazdiran bir program yaziniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis pozitif tam sayi olarak giriniz : ");
        int bas = scan.nextInt();
        int bitis = scan.nextInt();

        aralariTopla1(bas, bitis);


    }

    public static void aralariTopla1(int bas, int bitis) {
        int toplam=0;
        
        if (bas<=bitis){
            for (int i = bas; i <=bitis ; i++) {
                toplam +=i;

            }
        }else{
            for (int i = bitis; i <=bas ; i++) {
                toplam +=i;
            }
            
        }
        System.out.println("Aralarindaki sayilarin toplami : "+toplam);
    }
}


