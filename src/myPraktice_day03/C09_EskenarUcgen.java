package myPraktice_day03;

import java.util.Scanner;

public class C09_EskenarUcgen {
    public static void main(String[] args) {

        /*
        Kullanicidan bir ucgenin uc kenar uzunlugunu alin
        eger uc kenar uzunlugu bir birine esit ise ekrana "Eskenar ucgen" yazdirin.
        Diger dueumlarda ekrana "Eskenar degil" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen ucgenin birinci  kenar uzungu giriniz : ");
        int kenar1 = scan.nextInt();
        System.out.print("Lutfen ucgenin ikinci  kenar uzungu giriniz : ");
        int kenar2= scan.nextInt();
        System.out.print("Lutfen ucgenin ucuncu kenar uzungu giriniz : ");
        int kenar3= scan.nextInt();

        if ((kenar1==kenar2)&& (kenar1==kenar3)&&(kenar2==kenar3)){
            System.out.println("Ucgen eskenar bir ucgendir");
        }else {
            System.out.println("Ucgen eskenar bir ucgendegildir");
        }



    }
}
