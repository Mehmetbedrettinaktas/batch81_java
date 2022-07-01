package myPraktice_day02;

public class C23_lastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime="Java";
        /*
        verilen kelime icin asagidaki sartlardan uygun olani
         bir program yaziniz
        - verilen kelime cumlede kullailmamis
        - verilen kelime cumlede sadece 1 kere kullailmamis
        -verilen kelime cumlede birden fazla kullanilmis

         */

        int kelimeIlkIndex= cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println(" verilen kelime cumlede kullanilmamis");

        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println(" verilen kelime cumlede sadece 1 kere kullanilmis");

        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");

        }


    }
}
