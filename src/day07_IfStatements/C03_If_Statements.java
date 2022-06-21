package day07_IfStatements;

public class C03_If_Statements {
    public static void main(String[] args) {
        /*
        Bir if statement'da { } kullanilmazsa java ilk satiri sart ile baglar,
        sonraki sartlari bagimsiz olur.
        Eger birden fazla satir ayni anda if sartina baglandiysa mutlaka {kullanmaliyiz}
         */

        int sayi = 23;
        if (sayi > 0)
            System.out.println("sayi pozitif"); // bu satir if sartina bagli calisir
        System.out.println("pozotif kalacaktir"); // bu satir bagimsiz ve herzaman calisir.
        System.out.println("Ucuncu satir");      // bu satir bagimsiz ve herzaman calisir.

        if (sayi % 2 == 0)
            System.out.println("sayi cift"); // bu satir if sartina bagli calisir
        System.out.println("cift kalacaktir");  // bu satir bagimsiz ve her zaman calisir

        if (sayi % 5 == 0)
            System.out.println("sayi 5'in tam kati");


    }
}
