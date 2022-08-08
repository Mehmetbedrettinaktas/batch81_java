package day41_AbstractcCass;

public abstract class KBmw extends DAraba{

    /*
    araba classindaki bodysi olmayan methodlar ne ise yarıyor?
    ya kural koy ya kurala uy diyor.

    */
    /*
    Bmw abstract bir class'in abstract bir child'oldugu icin
    Parent class'daki abstract method'lari implent etmek
    ZORUNDA KALMADI

     */

    public abstract void  ablem();
    public abstract void  guvenlik();
}
