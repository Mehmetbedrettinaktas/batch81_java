package day07_IfStatements;

import java.util.Scanner;

public class C07_If_Else_If_Statements {
    public static void main(String[] args) {

        /*
        Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        “emekli olamazsin, calismalisin”, 65’e esit v
        eya buyukse “Emekli olabilirsin” yazdirin

        kullanici negatif deger gurerse uyaralim

        NOT: birden fazla if-else if birbirine baglandiysa
        son durum onemlidir. eger else ile bitiyorsa butun ihtimaller
        kapsaniyor demektir.
        Ama else if ile bitiyorsa kapsamayan durumlar olabilir.

        NOT2: else if ile birden fazla tekararlanabilir
        ama sadece else bloku yanliz bir defa kullanilabilir.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas<0){
            System.out.println("Lutfen gecerli bir yaziniz");
        } else if (yas<65 ){        // Burada else if  ile 0 ile 65 arasini kontrol ediyor.
            System.out.println("Emekli olamazsin "+ (65-yas)+" yil daha calismalisin");
        }else {             // Burada else ile 65 ve ustu kontrol ediyor.
            System.out.println("Emekli olabilirsin");
        }

    }
}
