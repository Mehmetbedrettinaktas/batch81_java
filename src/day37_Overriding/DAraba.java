package day37_Overriding;

public class DAraba {

   private void  yakit(){
        System.out.println("Tum arabalar yakit kullanir ");

        /*
        Parent class'dan override edilmesini istemediginiz method'lari
        private, static veya final methodu'lar yapabilirsiniz.
         */
    }

    void  marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }
    void  motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }
}
