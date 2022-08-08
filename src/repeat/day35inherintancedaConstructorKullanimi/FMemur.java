package repeat.day35inherintancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    FMemur(){
        System.out.println("Memur paremetresiz constructor calisti");
    }
    FMemur (String isim){
        System.out.println("Memur parametreli constructor calisti");
    }

    public static void main(String[] args) {
        FMemur mmr1 = new FMemur();


    }
}
