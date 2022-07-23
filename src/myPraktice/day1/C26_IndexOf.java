package myPraktice.day1;

public class C26_IndexOf {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle ve bir kelime isteyin, kelimenin
        cumledeki kullanimia bakarak asagidaki 3 cumleden uygun olani yazdirin
        - Girilen kelime cumlede kullanilmamistir.
        -Girilen kelime cumlede 1 kere kullanmistir
        -Girilen kelime cumlede 1'den fazla kullanilmis.
         */

        String str = "java cok kolay, java cok guzel ve java cok ozel";
        String kelime = "cok";

        int ilkKelime = str.indexOf("cok");
        System.out.println(" ilkKelime'nin index'i : " + ilkKelime); // ilkKelime index'i 5

        int ikinciKelime = str.indexOf("cok", ilkKelime + 1);


        if (ikinciKelime == -1) {
            System.out.println("Girilen kelime cumlede 1 kere kullanmistir");
        } else {
            System.out.println("ikincikelime'nin  index'i : " + ikinciKelime);
            int ucuncuKelime = str.indexOf("cok", ikinciKelime + 1);
            System.out.println("Girilen kelime cumlede 1'den  fazla kullanilmis "
                    + "\nucuncuKelime'nin index'i :" + ucuncuKelime);
        }

    }
}
