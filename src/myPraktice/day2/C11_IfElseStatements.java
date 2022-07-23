package myPraktice.day2;

import java.util.Scanner;

public class C11_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi isteyin, sayilarin ikiside pozitif ise
        sayilarin toplamini yazdirin.
        sayilarin ikiside de negatif ise sayilarin carpimini yazdirin,
        sayilarin ikisi  farkli isaretlere sahip ise "farkli isaretlerde sayilarla
        islem yapamazsiniz" yazdirin,
        sayilarin sifira esit olan varsa "sifir carpmaya gore yutan elamandir"
        yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci sayi giriniz : ");
        int sayi1=scan.nextInt();
        System.out.print("Lutfen ikinci saiyi giriniz : ");
        int sayi2=scan.nextInt();

        if (sayi1> 0 && sayi2>0 ){
            System.out.println(sayi1+sayi2);
        } else if (sayi1<0 && sayi2<0) {
            System.out.println(sayi1*sayi2);

        } else if ((sayi1>0 && sayi2<0) ||(sayi1<0 && sayi2>0)){
            System.out.println("farkli isaretlerde sayilarla islem yapamazsiniz");

        } else if ((sayi1==0 && sayi2 !=0)||(sayi1!=0 && sayi2==0)){
            System.out.println("sifir carpmaya gore yutan elamandir");

        }else System.out.println("Lutfen sayi giriniz");


    }
}
