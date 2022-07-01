package day11_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
         @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email=scan.nextLine();

        /*
        contains() verilen String'in istenen karekter(ler)i icerip icermedigini kontrol eder.
        Iceriyorusa TRUE icermiyorsa False dondurur.
        contains() methodu char icin kullanilmaz ,String kullanmak zorunludur.
         */
        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen email adresinizi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("lutfen yazimi kontol edin");

        }

    }
}
