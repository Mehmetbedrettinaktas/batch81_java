package myPraktice.day6;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
         /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
         Kullanici yanlislikla negative sayi girerse
         o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz”
          yazdirip basa donunKullanici 0’a bastiginda
          toplam kac pozitif sayi girdigini,
         yanlislikla kac negative sayi girdigini ve
           girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int pozitifSayiAdedi=0;
        int negatifSayiadedi=0;
        int pozSayilarTop=0;

        do {
            System.out.print("Lutfen toplamak uzere pozitif tamsayi giriniz : ");
            sayi=scan.nextInt();
            if (sayi>0){
                pozSayilarTop +=sayi;
                pozSayilarTop++;

            } else if (sayi<0) {
                negatifSayiadedi++;
                System.out.print("negatif sayi giremezsiniz");

            }


        }while (sayi!=0);
        System.out.print(pozitifSayiAdedi +" adet pozitif sayi girdiniz, toplamlari : "+pozSayilarTop);
        System.out.print(negatifSayiadedi+" adet negatif sayi girdiniz, ancak onlar toplama dehil edilmedi");

    }
}
