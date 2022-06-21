package day07_IfStatements;

public class C02_If_Statements {
    public static void main(String[] args) {

        int sayi = -19;
        if (sayi > 0) {
            System.out.println("sayi pozitif");
        }
        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayi 5'in tam kati");
        }
        /*
        basit if cumleleri kodun diger parcalarindan bagimsizdir
        sadece bir sart kontrol eder, sart saglaniyors, if body calisir,
        yoksa calismaz.
        birden fazla basit cumlesi varsa girilen sarta bagli olarak, tumunde if body'si calisabilir

         */
    }
}
