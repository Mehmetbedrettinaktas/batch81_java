package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
        2)  t-> "Logic" , (t, u) ->  "Logic"
            Bu yapiya "Lambda Expession"
        2)  Functional Programming kapsamida "Lambda Expession" kullanilabilir ama onerilmez.
            "Lambda Expession" yerine "Method Referece " tercih edilir.
        3)  "Method Referece " kullanimi "Class Name :: Method Name"

        Ayni zamanda kendi Class'larinizi da kullanabilirsiniz. Ornegin bir Animal class'iniz var ve bu class "eat()"
              methoduna sahip ==> "Animal :: eat"

         */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);  // [8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        CiftElemanlariYazdirFunctional(liste); // 8 10 10 2 8
        System.out.println();
        tekElemanlarinKarelriniYazdir(liste); // 81 17161 81
        System.out.println();
        tekrarsizTekElemanleinKupunuYazdir(liste); // 729 2248091
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami01(liste); //
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami02(liste); //
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami03(liste); //
        System.out.println();
        tekekrarsizCiftElemanlarinKuplerinCarpimi(liste); //
        getMaxEleman(liste);
        System.out.println();
        getMinmumEleman(liste); //
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTerarsizElemabnlarinYarisi(liste);


    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir); // 8 9 131 10 9 10 2 8
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)
    public static void CiftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir); // 8 10 10 2 8
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKarelriniYazdir(List<Integer> list) { // 81 17161 81
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanleinKupunuYazdir(List<Integer> list) { // 729 2248091
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsiz cift elemanlarin karelerinn toplamini hesaplayan bir method olusturun.
    // 1. yol
    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Math::addExact);
        System.out.println("toplam 01= " + toplam); // toplam = 168
    } // 2. yol

    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println("toplam 02= " + toplam); // toplam = 168
    } // 3. yol

    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Integer::sum);
        System.out.println("toplam 03= " + toplam); // toplam = 168
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekekrarsizCiftElemanlarinKuplerinCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.println("carpim = " + carpim); // carpim = 4096000

    }

    // 7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println("max = " + max); // max = 131
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void getMinmumEleman(List<Integer> list) {
        Integer min= list.stream().distinct().reduce(Math::min).get();
        System.out.println("min = " + min);
    }
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMin(List<Integer> list) {
        Integer min=list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();
        System.out.println("min = " + min);

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların
    // yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tersSiralamaylaTerarsizElemabnlarinYarisi(List<Integer> list){
      List<Double> sonuc=  list.
              stream().              // Gerekli methodlari kullanmamizi saglar. Ve akisi saglar
              distinct().           // Tekrarli olanlari almaz
              filter(t->t>5).     // Kosula gore filtreleme yapar
              map(Utils::yarisiniAl). // //Her bir elemanın değerini değiştirmeye yarar
              sorted(Comparator.reverseOrder()). //Sıralama yapar ama tersten siralar
              collect(Collectors.toList()); //Elamanları collection'a çevirir.
        System.out.println("sonuc = " + sonuc); //sonuc = [65.5, 5.0, 4.5, 4.0]
    }
}