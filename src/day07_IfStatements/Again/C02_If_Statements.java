package day07_IfStatements.Again;

public class C02_If_Statements {
    public static void main(String[] args) {

        int sayi = -23;

        if (sayi > 0)
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktir");

        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayi 5'in tam kati");
        }
    }
}
