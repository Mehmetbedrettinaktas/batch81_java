package day35_inheritancedaConstructorKullanimi.Araba;

public class HCorolla extends GToyota{

    public HCorolla() {
        System.out.println("HCorolla parametresiz constructor");
    }

    HCorolla(String isim) {
        super(isim);
         System.out.println("HCorolla parametreli constructor");
    }
}
