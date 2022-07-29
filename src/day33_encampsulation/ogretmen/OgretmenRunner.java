package day33_encampsulation.ogretmen;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());

        /*
        Bu yontemden data hiding degil daha anlasilir
        bir kod anlasilir bir kod amaclanmis oluyor
         */


    }
}
