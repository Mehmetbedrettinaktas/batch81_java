package day41_AbstractcCass;

public abstract class EToyota extends DAraba{


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");


    }
    /*
        Parent class''taki standart belirleyici method'lar
        (abstract method) 'larin tamami child class
        tarafindan override edilmelidir.

        concrete method#larin override edilme mecburiyeti
        yoktur istersek override edebiliriz, istemezsek etmeyiz

        Aslinda Toyota class'i da obje uretebilecegimiz
        bir class degil bu durumda eger proge tasarimi yapiyorsaniz
        Toyota class'inida abstract yapmaniz guzel olur.



         */
}
