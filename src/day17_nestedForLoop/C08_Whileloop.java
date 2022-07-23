package day17_nestedForLoop;

import java.util.Scanner;

public class C08_Whileloop {
    public static void main(String[] args) {
        /*
        kullanicidan toplamak uzere sayilari alin
        sayilarin toplami 500'u gecince(500 dahil)
        sayilarin toplamini ve kac sayi
        topladigini su sekilde yazdirin

        13 sayi girdiniz ve toplamlari 567

         */

        int toplam=0;
        int sayi=0;
        int sayac=0;
        Scanner scan = new Scanner(System.in);

        while (toplam<500){
            System.out.print("lutfen toplamak icin sayi giriniz : ");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println(sayac+" sayi girdiniz ve toplamlari  : "+toplam);

    }
}
