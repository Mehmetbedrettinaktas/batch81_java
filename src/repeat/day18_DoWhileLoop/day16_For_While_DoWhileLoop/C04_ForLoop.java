package repeat.day18_DoWhileLoop.day16_For_While_DoWhileLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
     /*
        kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar 3'un
        kati olan sayilari yazdirin.

       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 100'den kucuk pozitif bir tamsayi giriniz: ");
       int input=scan.nextInt();

        for (int i =1; i <=input ; i++) {

            if (i%3==0){
                System.out.print(i + " ");
            }


        }
        System.out.println("");
    }
}
