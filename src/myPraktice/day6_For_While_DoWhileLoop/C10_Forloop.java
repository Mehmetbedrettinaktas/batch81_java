package myPraktice.day6_For_While_DoWhileLoop;

import java.util.Scanner;

public class C10_Forloop {
    public static void main(String[] args) {
        /*
        kullanicidan iki sayi isteyin. girilen sayilari
        ve aralarindaki tum tamsayilari toplayip,
         sonucunu yazdiran bir program yaziniz.
         */

        Scanner scan = new Scanner (System.in);
        System.out.print("lutfen birinci tamsayi giriniz : ");
        int bas = scan.nextInt();
        System.out.print(" Lutfen ikinci tamsayiyi giriniz : ");
        int bitis= scan.nextInt();
        int toplam=0;

        if (bas<bitis){

            for (int i = bas; i <=bitis; i++) {
                toplam+=i;


            }
        }else{
            for (int i = bas; i >=bitis ; i--) {
                toplam+=i;
            }

        }

        System.out.println(toplam);
    }
}
