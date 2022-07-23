package myPraktice.day5;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
 /*
        ullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre isteyinceye kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali+
         */

        Scanner scan = new Scanner(System.in);

        String sifre ="";
        // eger next() dersek ilk space kadar olanki kismi alacagi icin
        // sifrenin space olusturup olusturmadigini anlayamayiz.

        boolean sifrebasariliMi=false;
        int kontrol = 0;


        while (!sifrebasariliMi){
            // Kullanicidan bir sifre alalim
            System.out.print("Lutfen bir sifre giriniz : ");
            sifre = scan.nextLine();

            // 4 kontrolu yapalim
            // her gecen kontol icin kontrolu veraiable bir arti
            // ilk harf kontrolu
            if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
                kontrol++;
            }else {
                System.out.println("Ilk harf buyuk harf olmali : ");
            }

            // son harf kontrolu
            if (sifre.charAt(sifre.length()-1) >='a' && sifre.charAt(sifre.length()-1)<='z'){
                kontrol++;
            }else {
                System.out.println("Son harf kucuk harf olmali : ");
            }

            // bosluk kontrolu
            if (sifre.contains(" ")){
                System.out.println(" Sifre bosluk icermemeli");
            }else {
                kontrol++;
            }
            // sifre uzunluk kontrolu

            if (sifre.length()>=8){
                kontrol++;
            }else {
                System.out.println("Sifre en az 8 karekter olmali");
            }

            if (kontrol==4){
                System.out.println("Sifre basari ile tanimlandi");
                sifrebasariliMi =true;
            }else {
                // sifre basarsiz
                // tekrar basa donecek
                // kontrol variable sifirlanmali
                kontrol=0;

            }

        }


    }
}
