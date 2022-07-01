package day11_stringManipulation;

public class C05_endsWith {
    public static void main(String[] args) {


        String str ="Ah be Java";
        System.out.println(str.endsWith("ava"));  // true

        System.out.println(str.endsWith("be Java")); // true

        System.out.println(str.endsWith("Ah be Java")); // true

        System.out.println(str.endsWith("")); // true en son hicbir sey olmadigi icin hiclik""
                                                // ile bittigi icin true döndurdu
        /*
        endsWith() method'u verilen String'in karekterler ile
        birip bitmedigini kontrol eder. istenen karekter(ler)
         ile bitiyorsa TRUE bitmiyorsa False dondurur.
         */




    }
}
