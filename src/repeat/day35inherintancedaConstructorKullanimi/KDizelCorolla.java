package repeat.day35inherintancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {
    KDizelCorolla() {
        // super() var
        System.out.println("KDizelCorolla parametresiz constructor calisti");
    }

    KDizelCorolla (String isim){
        // super() olmaz cunku biz olusturduk
        super(isim);

        System.out.println("KDizelCorolla parametreli constructor calisti");



    }

    public static void main(String[] args) {
        KDizelCorolla obj1 = new KDizelCorolla();
        KDizelCorolla sb2= new KDizelCorolla("Hasan");

    }

}
