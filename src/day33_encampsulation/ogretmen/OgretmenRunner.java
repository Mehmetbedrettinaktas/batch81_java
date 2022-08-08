package day33_encampsulation.ogretmen;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Tulay"); // ogr1 ismi Tulay diye set edilmis
       System.out.println(ogr1.getIsim()); // ogr1 ismi Tulay diye getirilmis.

        /*
        Bu yontemden data hiding degil daha anlasilir
        bir kod anlasilir bir kod amaclanmis olur.
         */


    }
}
