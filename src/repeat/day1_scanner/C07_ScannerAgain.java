package repeat.day1_scanner;

import java.util.Scanner;

public class C07_ScannerAgain {
    public static void main(String[] args) {
        // kullanicidan ismini soy ismini ve yasini alip
        // girilen bilgiler = Mehmet Aktas 40 seklinde yazdirin.
        // bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Loutfen isminizi, soyisminizi ve sayinizi giriniz\naralarda Enter tusununa basiniz");

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
         int yas= scan.nextInt();

        System.out.println("girilen bilgiler = "+" "+isim +" "+ soyisim+" "+yas);

    }
}
