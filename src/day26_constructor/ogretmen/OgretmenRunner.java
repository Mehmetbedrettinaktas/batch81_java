package day26_constructor.ogretmen;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1 " + ogretmen1);

        System.out.println(" ");
        Ogretmen ogretmen2=new Ogretmen("Emre","Akdogan","1/1/2001","Matematik","Fizik");
        System.out.println("Ogretmen 2 " + ogretmen2);

        System.out.println(" ");
        Ogretmen ogretmen3=new Ogretmen("Cavidan","Kabinkara","1/1/1991");
        System.out.println("Ogretmen 3 " + ogretmen3);

        System.out.println(" ");
        Ogretmen ogretmen4=new Ogretmen("Kabinkara","1/1/1991");
        System.out.println("Ogretmen 4 " + ogretmen4);

    }
}
