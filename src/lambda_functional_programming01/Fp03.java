package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHarfleYazdir(liste);
        System.out.println();
        //  buyukHarfleYazdir02(liste);
        System.out.println();
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKarektereGoreTekrarsizYazdir(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        // bestenBuyukleriSil(liste);
        // baslangiciAYadaSonuNolaniSil(liste);
        //uzunlugu8Ile10ArasiVeOIleBiteniSil(liste);
        System.out.println("uzunlugu12denAzMi(liste) = " + uzunlugu12denAzMi(liste)); // uzunlugu12denAzMi(liste) = true
        System.out.println();
        System.out.println("xIleBaslamiyorMu(liste) = " + xIleBaslamiyorMu(liste)); // xIleBasliyorMu(liste) = true
        System.out.println("rIleBitenVarMi(liste) = " + rIleBitenVarMi(liste)); // rIleBitenVarMi(liste) = true

    }

    // //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    // 1. Yol
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
        // ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN
    }

    // 2. Yol
    // public static void buyukHarfleYazdir02(List<String> list) {
    //list.replaceAll(String::toUpperCase);
    //     System.out.println("list = " + list);
    // //list = [ALİ, ALİ, MARK, AMANDA, CHRİSTOPHER, JACKSON, MARİANO, ALBERTO, TUCKER, BENJAMİN]
    // }
    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        // Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher
        // Comparator.comparing() : Siralama kosulunu belirtmek icin kullanilir.
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
        // Christopher Benjamin Jackson Mariano Alberto Amanda Tucker Mark Ali Ali
        // Comparator karsilastirma yapilir
    }
    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKarektereGoreTekrarsizYazdir(List<String> list){
        list.stream().
                distinct().
                sorted(Comparator.comparing(Utils::sonKareteriAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
        //Amanda Ali Mark Jackson Benjamin Mariano Alberto Christopher Tucker
    }
    // 5) Elemanları önce uzunluklarına göre ve
    // sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list){
        list.stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilKareteriAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
        //thenComparing() :==>siralam icin bir kosul daha belirtir
        //Ali Ali Mark Amanda Tucker Alberto Jackson Mariano Benjamin Christopher
    }
        //  // 6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
        //  public static void bestenBuyukleriSil(List<String> list){
        //      list.removeIf(t->t.length()>5); //removeIf(t->t.length()>5);//elemanin uzunlugu 5'ten buyukse sil
        //      System.out.println("list = " + list); //list = [Ali, Ali, Mark]
    // liste, muteble oldugu icin elemanlari islem sonrasi kalici olarak silindigi icin coment line ile
        //  }

    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
   //public static void baslangiciAYadaSonuNolaniSil(List<String> list){
   //    //removeIf() methodu eger kosul dogruysa sil
   //    list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'|| t.charAt(t.length()-1)=='n');
   //    System.out.println("list = " + list); // list = [Mark, Christopher, Mariano, Tucker]
   //}
    // 2.Yol
    // public static void baslangiciAYadaSonuNolaniSil02(List<String> list){
    //     list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
    //     System.out.println("list = " + list); // list = [Mark, Christopher, Mariano, Tucker]
    // }

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silenbir method oluşturun.
       // public static void uzunlugu8Ile10ArasiVeOIleBiteniSil(List<String> list){
       // list.removeIf(t->(t.length()>7 && t.length()<11)|| t.endsWith("o"));
       //     System.out.println("list = " + list); // list = [Ali, Ali, Mark, Amanda, Christopher, Jackson, Tucker]
       //
    //}
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean uzunlugu12denAzMi(List<String> list){
        return list.stream().allMatch(t-> t.length()<12);
    }
    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xIleBaslamiyorMu(List<String> list){
        return list.stream().noneMatch(t->t.startsWith("X")|| t.startsWith("x"));
    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitenVarMi(List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r") || t.endsWith("R"));
    }
}
