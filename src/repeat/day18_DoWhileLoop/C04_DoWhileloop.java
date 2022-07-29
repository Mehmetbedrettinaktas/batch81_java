package repeat.day18_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileloop {
    public static void main(String[] args) {
         /*
        kullanicidan tam sayilar alin
        kullanici cift sayi girdigi mudetce sayilari yazdirin
        tek sayilari girdiginde islemi bitirin

         */

        Scanner scan =new Scanner(System.in);
        int sayi=0;


        // while ile
        /*
        loop'larda kullanacagimiz veriable'lari loop'tan once olusturmaliyiz
        while loop'da, loop'dan once olusturdugumuz bu variable'a
        atayacagimiz degeri iyi dosunmemiz gerekiyor
         */

        while (sayi%2==0){
            System.out.println("Lutfen bir sayi giriniz");
             sayi =scan.nextInt();
             if (sayi%2==0){
                 System.out.println(" girilen sayi cift : "+sayi);
             }else {
                 System.out.println(" Girilen sayi tek, benden bu kadar");
             }

        }
        System.out.println("");
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


        do {

            System.out.println("Lutfen bir sayi giriniz");
            sayi =scan.nextInt();
            if (sayi%2==0){
                System.out.println(" girilen sayi cift : "+sayi);
            }else {
                System.out.println(" Girilen sayi tek, benden bu kadar");
            }
        }while (sayi%2==0);

        System.out.println("");

    }
}
