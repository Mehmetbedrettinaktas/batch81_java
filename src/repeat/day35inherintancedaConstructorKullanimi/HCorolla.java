package repeat.day35inherintancedaConstructorKullanimi;

public class HCorolla extends GToyota{

    HCorolla() {
        System.out.println("HCorolla parametresiz constructor calisti");
    }
    // super() var
    HCorolla (String isim){
        super(isim);

        System.out.println("HCorolla parametreli constructor calisti");
    }

}
