package myPraktice_day03;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {


        /*
        Kullanicidan  dikdortgenin kenar uzunluklarini isteyin
        ve dikdortgen olup olamadigini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lutfen lutfen dikdortgenin birinci kenar uzunlugunu giriniz : ");
        int biriniciKenar=scan.nextInt();
        System.out.print("Lutfen dikdortgenin ikinci kenar uzunlugunu giriniz ");
        int ikinciKenar=scan.nextInt();

        if (biriniciKenar==ikinciKenar){System.out.println("kare");}
        if (biriniciKenar!=ikinciKenar){
            System.out.println("Dikdortgen");
        }
    }
}
