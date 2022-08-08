package repeat.day35inherintancedaConstructorKullanimi;

public class Child extends BParent{
    String isim ="Child isim belirtilmedi";
    protected  String childKlupAdi="Child Klubu";

    public Child() {

        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent gp11= new AGrandParent();

        Child child1= new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";
    }
}
