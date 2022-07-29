package repeat.day10_StringMethod;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        /*
        kullanicidan dikdortgenin kenar uzunluklarini isteyin
        ve dikdortgenin kare olup olmadigini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        if (sayi1==sayi2){
            System.out.println("Sekil kare : ");
        }else {
            System.out.println("Sekil dikdortgen");
        }


    }
}
