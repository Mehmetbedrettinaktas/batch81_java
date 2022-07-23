package day18_WhileDoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan tam sayilar alin
        kullanici cift sayi girdigi mudetce sayilari yazdirin
        tek sayilari girdiginde islemi bitirin

         */
        Scanner scan = new Scanner(System.in);
        int sayi=0;

        // while ile yapalim
        /*
        Loop'larda kullanacagimz veriable'lari
        loop'tan once olusturmaliyiz
        while loop'dan once olusturdudugumuz
        veriable'a atayacagimiz degeri iyi dusunmemiz gerekiyor
         */

        while (sayi%2 == 0){
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
           if (sayi%2== 0){
               System.out.println("Girilen sayi cift : "+sayi);
           }else {
               System.out.println("girilen sayi tek, benden bu kadar");
           }
        }

        // do-while loop ile yapalim
        // do-while loop ta once olusturulan
        // variable'a hangi deger atadiginin hic bir onemi yok,
        // kodumuz her durumda calisir
        /*
        do-while dezavantaji:
        ilk calistrma kontrol yapilmadan oludugu icin
        loop'un body'sinde yanlis bir islem yapilmamasina
        dikkat edeilmesi gerekiyor
         */

        System.out.println(" " );

        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2== 0){
                System.out.println("Girilen sayi cift : "+sayi);
            }else {
                System.out.println("girilen sayi tek, benden bu kadar");
            }

        }while (sayi%2== 0);







    }
}
