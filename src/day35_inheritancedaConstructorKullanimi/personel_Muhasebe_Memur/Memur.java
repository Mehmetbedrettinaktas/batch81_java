package day35_inheritancedaConstructorKullanimi.personel_Muhasebe_Memur;

public class Memur extends EMuhasebe {


    public Memur() {

        System.out.println("Memur parametresiz constructor");
    }


    Memur(String isim) {
        System.out.println("Memur parametreli constructor");
    }

    public static void main(String[] args) {

        //  Memur mmr1= new Memur();
         /* consolu calistirilirsa;
         Personel parametresiz constructor
         Muhasebe parametresiz constructor
         Memur parametresiz constructor

          */

        Memur mmr2 = new Memur("Ali");
        /*
        Personel parametresiz constructor
        Muhasebe parametresiz constructor
        Memur parametreli constructor


        Boyle yazdirmasinin sebebi extends keyword duna sahip her classin
         her constructor da Super(){} constructor var
        */

    }
}