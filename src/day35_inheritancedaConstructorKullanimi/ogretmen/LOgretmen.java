package day35_inheritancedaConstructorKullanimi.ogretmen;

public class LOgretmen {
    LOgretmen(){

        System.out.println("LOgretmen parametresiz constructor");

    }

    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametremetreli constructor");

    }

}
