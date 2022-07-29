package repeat.day4;

import java.util.Scanner;

public class C14_ForLoopFaktoryel {
    public static void main(String[] args) {
        /*
        Soru 11 ) Interview Question Kullanicidan
        10’dan kucuk bir tamsayi isteyin ve girilen
        sayinin faktoryel’ini bulun. (5!=5*4*3*2*1
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 10 kucuk pozitif bir tamsayi giriniz : ");
        int sayi = scan.nextInt();

        faktoryelHesap(sayi);
    }

    public static void faktoryelHesap(int sayi) {
        int faktoryel=1;

        if (sayi<0 || sayi>10 ){
            System.out.println("sayi 10'dan buyuk oldugundan hesaplanamaz : ");
        } else if (sayi==0) {
            System.out.println(" 0! = 1");

        }else {
            for (int i = 1; i <=sayi ; i++) {
                faktoryel *=i;

            }
            System.out.println( "Faktoryel : "+faktoryel);
        }
    }
}
