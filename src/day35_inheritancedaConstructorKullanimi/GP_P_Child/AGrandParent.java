package day35_inheritancedaConstructorKullanimi.GP_P_Child;

public class AGrandParent {
    protected String isim="Grandpa ismi belirtilmedi";

    /*
    her class'ta grunmese bile bir constructor vardir
    Bu class'ta obje olsturmak istedigimizde default constructor
    devreye girecektir.

    Default constructor'i gozlemleyemecegimiz icn
    onun yerine kullanabilecek parametresiz constructor olusturalim
     */
        protected  String grandpaKlupAdi="Grandpa klubu";
    public AGrandParent() {

        System.out.println("Grandpa constructor calisti");

    }
}
