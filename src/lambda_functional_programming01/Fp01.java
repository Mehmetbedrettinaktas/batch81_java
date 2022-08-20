package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1) Lambda (Functional programming) Java 8 ile kullanilmaya baslanmistir.
    2) Functional Programming 'de "Ne yapilacak" (What to do) uzerine yogunlasilir.
    Structured Programming " Nasil yapilacak" (How to do) uzerine yogunlasilir
    3) Functional Programming Arrays ve Collections ile kullanilir.
    4) "entrySet() methodu ile Map, Set'e donusturulerek FunctionalProgramming'de kullanilabilir


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
        listElemanlariniYazdirStructured(liste);
        System.out.println("Functional ");
        listElemanlariniYazdirFunctional(liste);
        System.out.println("Structured ");
        ciftElemanlariYazdirStructured(liste);
        System.out.println(" Functional");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println(" Functional ");
        tekElemanlarinKarelriniYazdir(liste);
        System.out.println(" ");
        tekrarsizTekelemanleinKupunuYazdir(liste);
        System.out.println(" ");
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarininKupununCarpimi(liste);
        System.out.println();
        getMaxEleman1(liste);
        System.out.println();
        getMaxEleman2(liste);
        System.out.println();
        getMinElemani(liste);
        System.out.println();
        getYedidenBuyukCiftMin(liste);
        System.out.println();
        getYedidenBuyukCiftMin2(liste);
        System.out.println();
        getYedidenBuyukCiftMin3(liste);
        System.out.println();
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);

        /*
        /1) Ardışık list elementlerini aynı satırda aralarında
        boşluk bırakarak yazdıran bir method oluşturun.(Structured)
         */
    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " "); // 8 9 131 10 9 10 2 8

        }
    }

    /*
    //1)Ardışık list elementlerini aynı satırda aralarında
    boşluk bırakarak yazdıran bir method oluşturun.(Functional)
     */
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " ")); // t veriable dir degerlerin yerine geciyor t-> lambda expretion
        // 8 9 131 10 9 10 2 8
        // stream akisi sagliyor. listen aldigi eleanlari forEach ulastiriyor.
        // stream() methodu colletion'dan elemetleri akisa dahil etmek icin ve method'lara ulasmak icin kullanilir
    }
    //2)Cift list elemanlarini aynı satırda aralarında
    // bosluk bırakarak yazdıran bir method olusturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " "); // 8 10 10 2 8
            }

        }

    }

    // 2)Cift sayi olan cift list elemanlarini aynı satırda aralarında
    // bosluk bırakarak yazdıran bir method olusturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " ")); // 8 10 10 2 8
    }

    /*
    /3) Ardışık tek list elemanlarinin karelerini aynı satırda
    aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
     */
    public static void tekElemanlarinKarelriniYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " ")); // 81 17161 81
        // map() methodu elemanlarin degerleri degistirmek icin kullanilir
    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekelemanleinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " ")); // 729 2248091
        // distinct() methodu tekrarsiz  elemanlari alir. Tekrarli elemanlari eler.

    }
    //5) Tekrarsız çift elemanlarin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u); // t ilk deger u gelecek deger  ---> sayi1 +=sayi2; gibi
        System.out.println("cift sayilarin karelerin toplami = " + toplam); // toplam = 168
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarininKupununCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u); // t=1
        System.out.println("carpim = " + carpim); // carpim = 4096000

    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    // 1. yol
    public static void getMaxEleman1(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u); // ternary operatoruyle yaptik
        System.out.println("max = " + max); // max = 131
    }

    //2. yol
    public static void getMaxEleman2(List<Integer> list) {
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println("max = " + max); // max = 131
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    public static void getMinElemani(List<Integer> list) {
        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);// min = 2
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void getYedidenBuyukCiftMin(List<Integer> list) {
       Integer min= list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min); // min = 8
    }//  2. Yol
    public static void getYedidenBuyukCiftMin2(List<Integer> list) {
       Integer min= list.stream().distinct().filter(t -> t % 2 == 0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);  // siraliyoruz ve hep sonuncuyu aliyoruz
        System.out.println("min = " + min); //min = 8                                      // burada tersten siralama yapiyor
    }// 3. Yol
    public static void getYedidenBuyukCiftMin3(List<Integer> list){
       Integer min= list.
               stream().
               filter(t -> t % 2 == 0).
               filter(t->t>7).
               sorted().
               findFirst().
               get();
        System.out.println("min = " + min); // min = 8
    }
    /*
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı
    değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
     */
    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
     List<Double> sonuc=   list.stream().distinct().filter(t -> t >5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // collect -->topla demektir
        System.out.println("sonuc = " + sonuc); // sonuc = [65.5, 5.0, 4.5, 4.0]
    }

}

