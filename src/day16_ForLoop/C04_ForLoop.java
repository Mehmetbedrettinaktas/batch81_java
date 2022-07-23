package day16_ForLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        /*
       Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
   1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
     - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
     - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
     - Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin
         */

        /*
        1. Scanner lazim
        2. Int bir sayi lazi
        3.fori loop lazim
        4.if- else if bloklari lazim
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 100'den kucuk pozitif bir tamsayi giriniz : ");

        int sayi =scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("Java Guzeldir" +"\n ");
            } else if (i%5==0) {
                System.out.print("Guzeldir"+ " ");

            } else if (i%3==0) {
                System.out.print("Java" +" ");

            }else {
                System.out.print(i +" ");
            }

        }

    }
}
