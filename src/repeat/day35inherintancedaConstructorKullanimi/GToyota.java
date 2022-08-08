package repeat.day35inherintancedaConstructorKullanimi;

public class GToyota {

    GToyota() {
        // super() olmaz cunku extends yok
        System.out.println("GToyota parametresiz constructor calisti");
    }

    GToyota (String isim){

        System.out.println("GToyota parametreli constructor calisti");
    }
}
