package repeat.day4;

import java.util.Scanner;

public class C08_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
         1’den baslayarak girilen sayiya kadar 3’un
           kati olan sayilari yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 100 den kucuk pozitif bir tam sayi giriniz : ");
        int sayi = scan.nextInt();


        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0) {

                System.out.println(i + " ");

            }

        }
    }
}
