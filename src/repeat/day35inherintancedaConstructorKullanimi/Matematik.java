package repeat.day35inherintancedaConstructorKullanimi;

public class Matematik extends LOgretmen{
    Matematik() {                                                           //5
        // super() var                               //6
        System.out.println("Matematik parametresiz constructor calisti");  // 10
    }                                                                       //11

    Matematik (String isim){                                                // 3

        this();                                                             //4
        System.out.println("Matematik parametreli constructor calisti");    //12
    }                                                                       //13

    public static void main(String[] args) {                                //1.
        Matematik obje1= new Matematik("Tugba");                        //2. // 14
    }
}
