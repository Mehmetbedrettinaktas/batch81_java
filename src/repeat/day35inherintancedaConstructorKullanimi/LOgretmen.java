package repeat.day35inherintancedaConstructorKullanimi;

public class LOgretmen {
    LOgretmen() {                           //7
        // super() olmaz cunku extends yok
        System.out.println("LOgretmen parametresiz constructor calisti");  // 8
    }                                                   // 9

    LOgretmen (String isim){

        this();
        System.out.println("LOgretmen parametreli constructor calisti");
    }
}
