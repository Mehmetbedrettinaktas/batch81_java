package myPraktice_day02;

public class C27_lastIndexOf {
    public static void main(String[] args) {
         String cumle= "java cok kolay, java cok guzel";
         String kelime ="java";

          /*
        Kullanicidan bir cumle ve bir kelime isteyin, kelimenin
        cumledeki kullanimia bakarak asagidaki 3 cumleden uygun olani yazdirin
        - Girilen kelime cumlede kullanilmamistir.
        -Girilen kelime cumlede 1 kere kullanmistir
        -Girilen kelime cumlede 1'den fazla kullanilmis.
         */
        
        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonindex=cumle.lastIndexOf(kelime);
        
        if (kelimeIlkIndex==-1){
            System.out.println("Girilen kelime cumlede kullanilmamistir.");
        } else if (kelimeIlkIndex==kelimeSonindex) {
            System.out.println("Girilen kelime cumlede sadece 1 kere kullanmistir");
            
        }else {
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis.");
        }

    }
}
