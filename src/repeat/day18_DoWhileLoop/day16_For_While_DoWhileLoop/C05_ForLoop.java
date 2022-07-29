package repeat.day18_DoWhileLoop.day16_For_While_DoWhileLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
        kullanicidan 100'den kucuk bir tam sayi isteyin,
        1'den baslayarak girilen sayiya kadar 3'un
        veya 5'in kati olan sayilari yazdirin.
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz : ");
        int sayi =scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%5==0 && i%3==0){
                System.out.print(i+", ");
            }
        }


    }
}
