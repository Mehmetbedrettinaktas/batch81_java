package day33_encampsulation.araba;

import day33_encampsulation.araba.Araba;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        //arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka); // Toyota

        /*
       access modifier kullanarak marka variable'ina ulasimi
       tamamen serbest yapabilir veya tamamen engelleyebilirim
       private yaptigimiz model'e ise hic ulasamayiz
       yani access modifier ya hep ya hic diyor

       markay'i degistirelim ama goremeyelim
       yakiti da gorelim ama degistiremeyelim

       set ve get yetkilerini ozel olarak tanimlamak isterseniz
       1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
       private bir dataya baska classlardan ulasmak mumkun olmadigindan
       2.adim - set yetkisi icin setter,
       get yetkisi icin getter methodlari olusturalim

         */

        arb1.setModel("Corolla"); // model olarak Corolla'yi atadik
        // model'i yazdirma imkanimiz yok cunku getter method'u yok
        // Set method() ulasima izin veriyordu.

        System.out.println("arb1.getYakit() = " + arb1.getYakit());//  Elektrikli
        // yakiti degistiremeyiz cunku setter method'u yok
        //get method() deger atamaya izin veriyordu.


    }
}
