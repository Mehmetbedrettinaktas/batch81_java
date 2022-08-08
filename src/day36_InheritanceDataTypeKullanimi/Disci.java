package day36_InheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Disci extends BMuhasebe {

    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("Isciler  : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigortaIsci() {
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1= new Disci(); // Burada isci olusturuyoruz ve muhasebedeki haklarini gormek istiyoruz
        // iscinin muhasebe class'indaki butun calisanlarla birlikte
        // hakketigi ozelliklerini aliyoruz

        /*
        Bir obje olusturulurken
        data turu ve constructor ayni class'dan
        ise direk o class'a gidiyorduk

        Eger data turu ve constructor farkli ise
        Oncelikle data turunun oldugu classa gideriz

        obje constructor'in olduju class'in objesidir ancak, bizden istenen
        Isci class'indaki spesifik ozellikler degil
        Bir iscinin muhasebe classindaki tum calisanlarla beraber sahip oldugu
        genel ozellikleri yazdirir
         */
        System.out.println(isc1.gunlukMesai);//  Muhasebeden 8
        System.out.println("mmr1.saatUcreti = " + isc1.saatUcreti); // Muhasebeden 10
        isc1.maas(); // 2400 Muhasebeden
        isc1.ozelSigorta(); // Muhasebeden
        isc1.sigorta();     // APersonel
        System.out.println("mmr1.isim = " + isc1.isim); // APersonel
        System.out.println("mmr1.soyisim = " + isc1.soyisim); // APersonel
        System.out.println("mmr1.departman = " + isc1.departman); // APersonel

        System.out.println(" ");

        APersonel isc2= new Disci();

       // System.out.println(isc2.gunlukMesai);//  Muhasebeden 8
      //  System.out.println("mmr1.saatUcreti = " + isc2.saatUcreti); // Muhasebeden 10
        //isc2.ozelSigorta(); // Muhasebeden
        isc2.maas();  // APersonel gider ama hemen yazdirmaz override edilmis mi diye bakar,
        //override idildigi icin Muhasebeden class'indaki maas() objesini yazdirir.

        // override ta asagiya kadar gitmesine izin veriliyor
        isc2.sigorta();     // APersonel
        System.out.println("isc2.isim = " + isc2.isim); // APersonel
        System.out.println("isc2.soyisim = " + isc2.soyisim); // APersonel
        System.out.println("isc2.departman = " + isc2.departman); // APersonel

        /*
        Eger data turu olan class'ta aradigimiz ozellik yoksa
        varsa onun parent'ina giderebilir
        ama child'a donus olmaz
        Aradigi ozelligi bulamazsa JAVA CTE verir.
         */

        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();

        /*
        Hepsi linkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir

         */

    }
}
