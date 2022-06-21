package day07_If_Statements;

import java.util.Scanner;

public class C05_TekCiftsayi {
    public static void main(String[] args) {
        //soru 1) kulanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("Girilen sayi cift sayidir");
        }
        if (sayi%2 != 0){
            System.out.println("Girilen sayi tek sayidir");

            // normalde bir sayi ya tektir veya ciftir, ucuncu bir durum yoktur.
            // o zaman tek olmasi ve cift olmasini iki ayri if ile degil
            // =======if else ile  cozum ====

            if (sayi%2==0){
                System.out.println("girdiginiz sayi cift sayidir");


            }else {
                System.out.println("Girdiginiz sayi tek sayidir");
            }
        }
    }
}
