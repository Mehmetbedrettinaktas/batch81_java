package day41_AbstractcCass;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{

    /*
    Abstract parent silsilesinden gelen ilk concrete class
    Parent'i olan tum class#daki abstract method'lari
    concrete hale donusturmek (override etmek) ZORUNDADIR.

    Bu kuralin istinasi parent class'lardan herhengi birinde concrete
    hele donusturulmus, abstract method'lardir.

     */

    public static void main(String[] args) {

        HA160 arb1= new HA160();
        // concrete bir class'dan istedigimiz  objeyi uretebiliriz


        FMercedes arb2= new FMercedes();
        // mercedes de concrete

        // EToyota arb3= new EToyota();
        /* abstract class'lar constructor barindirir ama
         obje uretemezler
         Toyota class''i abstract class oldugundan obje uretilemez


        sol taraf data türü  sag tarf concrete oluyor
        List<String> list1 = new List<String>();
       */
        List<String> list2 = new ArrayList<>(); // data turu list oldugu icin aramaya listen baslayacak
        /*
        Abstract bir class'in ozelliklerini tasiyan bir oobje
        olusturmak istedigimizde data turunu istedigimiz class
        constructor'i ise child'i olan concrete bir class'dan seceriz.
         */
    }
}
