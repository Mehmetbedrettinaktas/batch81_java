package repeat.day10_StringMethod;

public class C13_Switchcase {
    public static void main(String[] args) {
        /*
        kulanicidan bir gun ismini aliniz
        hafta ici veya hafta sonu oldugunu yazdirin

         */
        String input = "carsamba";
          input=input.toLowerCase();


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
                System.out.println("hafta sonu");
                break;
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun ismini giriniz");
        }
        System.out.println("********* Kisa yazilimi *********");
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
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun ismini giriniz");
        }
    }
}
