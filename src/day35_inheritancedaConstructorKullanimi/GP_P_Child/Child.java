package day35_inheritancedaConstructorKullanimi.GP_P_Child;

public class Child extends BParent {
    String isim ="Child isim belirtilmedi";


    protected  String childKlupAdi="Child klubu";
    public Child() {

        System.out.println("Child constructor calisti");

    }

    public static void main(String[] args) {

        AGrandParent gp1= new AGrandParent();
        // Bu objeyi olsturmak icin Grandpa constructor calisir
        // parent veya Child constructor calismaz

        System.out.println(" ");
        Child child1= new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        /*
        child1 objesi icin child constructor calisti

        Java da bir class'i kullanabilmek icin
        o class'dan obje olusturur, dolayisiyla o class'in
        constructor'ini kullanirdik


        java inhertance 'da kullanabilmek icin o class'larin
        constructor'larini otomatik calistiran bir yapi kurulmustur

        ornegin bir child class'inda
        Child class'indan bir obje olusturmak istedigimizde
        Child constructor'ini kullanabiliriz

        Java Child(){} gordugunde once parent'in constructor'ini
        calistirmam lazim der burada Parent constructor'a gider
        Parent class'inda Parent(){} gorunce bunun parent'inin
        yani Grandparent constructor calismasi gerekir der,
        Boylece extends kyword olmayan class'a kadar gider ve
        oradan baslayarak tum constructori asagi dogru calistirir



         */

    }
}
