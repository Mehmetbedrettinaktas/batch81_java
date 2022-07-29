package repeat.day09_IfElesStatements;

import java.util.Scanner;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan gun ismini yazmasini isteyiniz.
        Girilen gun ismi gecerli bir gun ise gun
        isminin 1.,2. ve 3. cu harflerini ilk harf buyuk diger
        ikisi kucuk olarak yazdirin, gun ismi gecerli degilse
        "Gecerli


         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir gun ismini giriniz : ");
        String gun = scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("pazar")){
            System.out.print("Paz");
        } else if (gun.equals("sali")) {
            System.out.print("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.print("Car");
        } else if (gun.equals("persembe")) {
            System.out.print("Per");
        } else if (gun.equals("cuma") || gun.equals("cumartesi")) {
            System.out.print("cum");
        }else {
            System.out.print("Lutfen gecerli bir gun ismini giriniz.");
        }


    }
}
