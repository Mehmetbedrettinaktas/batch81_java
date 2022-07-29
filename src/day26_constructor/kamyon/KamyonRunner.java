package day26_constructor.kamyon;

public class KamyonRunner {
    public static void main(String[] args) {
        // 2. kamyon1 variable'i  new Keyword le olusturduk
        // gririlen prametre sayisina gore Kamyon class'indaki constructor
        // kullanilir
        Kamyon kamyon1 = new Kamyon();  // parametresiz constructor gider
        System.out.println("kamyon1 ozelikleri " + kamyon1.toString());

        System.out.println(" ");
        //4 parametreli constructor gider
        Kamyon kamyon2 = new Kamyon("Mercedes", "4140", 2005, 500000);
        System.out.println("Kamyon2 bilgileri " + kamyon2.toString());

        System.out.println(" ");
        Kamyon kamyon3 = new Kamyon("MAN", "as900", 2007, 400000);
        System.out.println("Kamyon3 bilgileri " + kamyon3.toString());

        System.out.println(" ");
        Kamyon kamyon4 = new Kamyon("Scania", "s540");
        System.out.println("Kamyon4 bilgileri " + kamyon4);

        System.out.println(" ");
        Kamyon kamyon5 = new Kamyon("Ford", "FRD900", 400000);
        System.out.println("Kamyon5 bilgileri " + kamyon5.toString());

    }
}
