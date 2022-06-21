package day07_If_Statements;

import java.util.Scanner;

public class C04_HaftaIciHaftasonu {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        or: gun=pazar outpot="hafta sonu"
        gun=sali outpot = "hafta ici"
        *** String icin equals methodu'unu kullanin

        pazar veya Cumartesi ise ===> hafta sonu
        Pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici
         */
        //String case sensetive'dir
        // yani pazar, PAZAR, Pazar,PAzar bunlar hep farkli kelimelerdir.
        // bu duruda String String methodlarindan yardim aliriz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase();  // kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz.

        // String ifadelerde  == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verebilir.
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
        System.out.println("Girdiginiz gun haftasonu");

        }
        if  (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")|| gunIsmi.equals("carsamba") || gunIsmi.equals("persembe")
            || gunIsmi.equals("cuma")){
            System.out.println("Girdiginiz gun haftaici");

        }




    }
}
