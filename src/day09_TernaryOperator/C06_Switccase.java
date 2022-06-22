package day09_TernaryOperator;


import java.util.Locale;
import java.util.Scanner;

public class C06_Switccase {
    public static void main(String[] args) {
        /*
        Kulalnicidan gun ismini alin hafta ici
        veya hafta sonu oldugunu yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir gun ismini giriniz: ");
        String input=scan.next().toLowerCase();

        // 1. yol
        //String input = "sali";
        //input = input.toLowerCase();


        switch (input) {
            case "pazartesi":
                System.out.println("Haftaici");
                break;
            case "sali":
                System.out.println("Haftaici");
                break;
            case "carsamba":
                System.out.println("Haftaici");
                break;
            case "persembe":
                System.out.println("Haftaici");
                break;
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
                System.out.println("Haftasonu");
                break;
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");

        }
        // 2. yol

        switch (input) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");

        }
        // 3. yol
        System.out.println("\t**********if********");

        if (input.equals("pazartesi") || input.equals("sali") || input.equals("carsamba") || input.equals("persembe") || input.equals("cuma")){
            System.out.println("Girilen gun haftaici");
        }else if (input.equals("cumartesi")|| input.equals("pazar")){
            System.out.println("Girilen gun haftasonu");
        }else {
            System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}