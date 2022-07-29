package day34_inheritance.toyota;

public class ToyotaCorolla extends Toyota{

    public static void main(String[] args) {

        /*

        Child class'dan parent class'a erisiminde access modifier
        kurallarini bypass edemeyiz ornegin parent class'daki
        private class uyelerini child uyelerini child class'dan
        kullanamayiz ayni sekilde parent ve child farkli package'larda ise
        parent class'daki default access modifier'i olan
        class uyelerini child class'dan kullanmaliyiz

         */
        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model belirtilmedi



    }

}
