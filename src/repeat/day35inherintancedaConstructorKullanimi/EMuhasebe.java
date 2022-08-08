package repeat.day35inherintancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel{

    EMuhasebe(){
        System.out.println("Muhasebe parametresiz constructor calisti");
    }
    EMuhasebe(String isim){
        System.out.println("Muhasebe parametreli constructor calisti");
    }
}
