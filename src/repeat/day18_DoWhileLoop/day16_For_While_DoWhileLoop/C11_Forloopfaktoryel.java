package repeat.day18_DoWhileLoop.day16_For_While_DoWhileLoop;

import java.util.Scanner;

public class C11_Forloopfaktoryel {
    public static void main(String[] args) {
        /*
        kullanicidan 10'kucuk kucuk bir tamsayi isteyin ve
        girilen sayinin faktoryel'ini bulun
        (5!=5*4*3*2*1)

         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen 10'dan kucuk pozitif bir tamsayi giriniz : ");
        int sayi =scan.nextInt();
        int sonuc=1;

        for (int i = 1; i <=sayi ; i++) {
            sonuc *=i;

        }
        System.out.println("sonuc = " + sonuc);

    }
}
