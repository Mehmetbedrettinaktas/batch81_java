package myPraktice_day02;

import java.util.Scanner;

public class C03_HaftaIciHaftasonu {
    public static void main(String[] args) {
        /*
         Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
         ornek: gun=Pazar output= "Hafta sonu"
         gun = sali output ="hafta ici"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = scan.nextLine().toLowerCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {
            System.out.println("Girdiginiz gun haftasonu");

        } else {
            System.out.println("Girilen gun haft ici");
        }

    }

    public static class C18_lenght {
        public static void main(String[] args) {

            String str ="Java ogren, isi kap";

            System.out.println(str.length());// str'nin karekter sayisini bize dondurur oda 19

            System.out.println(str.length()-1);// son karakteri bize dondurur

            System.out.println(str.charAt(str.length()-3)); // k  sondan 3. karekteri yazdirir.

            String str2="";

            String str3=null;
            System.out.println(str3.length());



        }
    }
}
