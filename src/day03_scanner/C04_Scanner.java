package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kulanicidan ismini iszteyin girilen isme
        // isminiz :  ..Ismail seklinde yazdirin.

        // insanlarin dunyasindan kod'larimizin bulundugu classa'deger almak icin
        // Scanner class'ini kullaniriz.

        // 1- Scanner objesi olustualim
        Scanner scan =new Scanner(System.in);

        // 2- kullanicaya ne istediginimizi soyleyelim
        System.out.println("Lütfen isminizi giriniz");
        // 3- olusturdugumuz scan objesi ile kulllanicidan girdigi degeri alip
        // olusturacamiz uygun bir varible'a atayalim

        String kullaniciIsmi=scan.next();
        System.out.println("isminiz : "+ kullaniciIsmi);

    }
}
