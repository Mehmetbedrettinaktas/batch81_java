package day35_inheritancedaConstructorKullanimi.personel_Muhasebe_Memur;

public class Memur extends EMuhasebe {


         /*
      Extends keyword kullanilan classlarda
      ister default consructor bulunsun
      istersek de biz yeni constructor(lar) olusturalim
      Java constructor'in ilk satirina
      super(); constructor call yazar
      super(); constructor call, default constructor'a benzer
      gorunmese de orada vardir ve calisir
      ancak biz ilk satira farkli bir constructor call yazarsak
      Java super(); 'i siler
      Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak
      Javanin default olarak olusturdugu constructor call
      her zaman parametresizdir
      super();
     */


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


        Boyle yazdirmasinin sebebi extends keyword buna sahip her classin
         her constructor da Super(){} constructor var
        */

    }
}