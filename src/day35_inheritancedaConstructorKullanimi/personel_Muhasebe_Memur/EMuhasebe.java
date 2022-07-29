package day35_inheritancedaConstructorKullanimi.personel_Muhasebe_Memur;

public class EMuhasebe extends DPersonel{

    public EMuhasebe() {

        System.out.println("Muhasebe parametresiz constructor");



    }

    EMuhasebe (String isim){
        System.out.println("Muhasebe parametreli constructor");


    }
}
