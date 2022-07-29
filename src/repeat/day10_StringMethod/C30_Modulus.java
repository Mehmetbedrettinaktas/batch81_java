package repeat.day10_StringMethod;

import java.util.Scanner;

public class C30_Modulus {
    public static void main(String[] args) {

        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir sayi giriniz");

        int sayi=scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int gilenIlkSayi=sayi;  // 5387

        // sayi 5387  bb= 00  rt= 0
        birlerBasamagi = sayi%10;  //
        rakamlarToplami +=birlerBasamagi ;
        sayi /= 10;

        // sayi 538 bb 7 rt = 7
        birlerBasamagi= sayi%10;
        rakamlarToplami +=birlerBasamagi;
        sayi /= 10;

        // sayi 53 bb 8 rt 15
        birlerBasamagi= sayi%10;
        rakamlarToplami +=birlerBasamagi ;
        sayi /= 10;

        // sayi 5 bb 3 rt 18


        birlerBasamagi= sayi%10;
        rakamlarToplami +=birlerBasamagi ;
       // sayi /= 10;
        System.out.println("rakamlarToplami = " + rakamlarToplami);


    }
}
