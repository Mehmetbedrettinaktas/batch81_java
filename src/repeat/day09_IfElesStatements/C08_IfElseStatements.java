package repeat.day09_IfElesStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini sorun, eger yas 65'den kucuk ise
        " emekli olamazsin, calismalisin ",
        65' esit veya buyukse "Emekli olabilirsin" yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas= scan.nextInt();

        if (yas<65 ) {
            System.out.println("Emekli olamazsin " + (65 - yas) + " yil daha calismalisin");
        }else {
            System.out.println("Emekli olabilirsin");
        }
    }
}
