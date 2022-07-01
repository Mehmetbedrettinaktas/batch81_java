package day11_stringManipulation;

public class C02_lasIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime= "java";

        /*
        verilen kelime icin asagidaki sartlardan uygun olani
         bir program yaziniz
        - verilen kelime cumlede kullailmamis
        - verilen kelime cumlede sadece 1 kere kullailmamis
        -verilen kelime cumlede birden fazla kullanilmis

         */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullailmamis");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullailmamis");

        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }


    }
}
