package lambda_functional_programming01.repeat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01_Repeat {
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
        System.out.println("Structured");
        listElemanlariniYazdirStructured(liste);
        System.out.println(" Functional");
        listElemanlariniYazdirFunctional(liste); // 8 9 131 10 9 10 2 8
        System.out.println("Structured");
        ciftElemanlariYazdirStructured(liste);
        System.out.println(" Functional");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println(" Functional");
        tekElemanlarinKarelriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanleinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKarelerininToplami(liste);
        System.out.println();
        tekrasizCiftElemanlarinKupununCarpimi(liste);
        System.out.println();
        getMaxEleman01(liste);
        System.out.println();
        getMaxEleman02(liste);
        System.out.println();
        getYedidenBuyukMin(liste);
        System.out.println();
        getYedidenBuyukMin2(liste);
        System.out.println();
        getYedidenBuyukMin3(liste);
        System.out.println();
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);


    }
     /*
    Methodumuz void oldugunda ileride uzerine birsey eklemek istedigimizd, ekleyemiyoruz
    ama return type void disinda bir return type sahipse o zaman method uzerinde islem yapabiliriz.
     */
    /*
    1) Ardışık list elementlerini aynı satırda aralarında
    boşluk bırakarak yazdıran bir method oluşturun.(Structured)
            */


    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list
        ) {
            System.out.print(w + " "); // 8 9 131 10 9 10 2 8
        }
    }

    /*
    1) Ardışık list elementlerini aynı satırda aralarında
    boşluk bırakarak yazdıran bir method oluşturun.(Functional)
      */
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    //2)Cift list elemanlarini aynı satırda aralarında
    // bosluk bırakarak yazdıran bir method olusturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " "); // 8 10 10 2 8
            }
        }
    }

    //2)Cift list elemanlarini aynı satırda aralarında
    // bosluk bırakarak yazdıran bir method olusturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " ")); //8 10 10 2 8
    }

    /*
    3) Ardışık tek list elemanlarinin karelerini aynı satırda
    aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
     */
    public static void tekElemanlarinKarelriniYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanleinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " ")); //81 17161
    }

    //5) Tekrarsız çift elemanlarin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKarelerininToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println("toplam = " + toplam); // toplam = 168
    }

    // 6) tekrarsiz cift elemanlarin kupunun carpimini hesaplayanbir method olusturun
    public static void tekrasizCiftElemanlarinKupununCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println("carpim = " + carpim); // carpim = 4096000
    }

    // Liste elemanlari arasindan en buyuk degeri bulan bir method oluşturun.
    public static void getMaxEleman01(List<Integer> list) { // 1.Yol
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("max = " + max); // max = 131
    }// 2. Yol

    public static void getMaxEleman02(List<Integer> list) {
        Integer max02 = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        // burada u herzaman ikinci degeri veriri cunku dogal siralamada ikinci eleman daha buyuk oluyor
        System.out.println("max02 = " + max02); // max02 = 131
    }

    //9)  List elamanlari arasindan 7'den buyuk, cift, en buyuk degeri bulan bir method oluşturun.
    // 1.Yol
    public static void getYedidenBuyukMin(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min); // min = 8
    }

    // 2.Yol
    public static void getYedidenBuyukMin2(List<Integer> list) {
    Integer min2=    list.stream().distinct().filter(t -> t % 2 == 0).filter(t-> t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u)->u);
    // Comparator.reverseOrder() ===> tersten siralamayi yapar
    System.out.println("min2 = " + min2); // min2 = 8
    }
    // 3. Yol
    public static void getYedidenBuyukMin3(List<Integer> list) {
Integer min3 = list.
        stream().
        filter(t -> t % 2 == 0).
        filter(t->t>7).
        sorted().
        findFirst().
        get();
        System.out.println("min3 = " + min3);
    }
    // 10) Ters siralama ile tekrarsiz ve 5'ten buyuk elemanlarin yari degerlerini
    // (elmanin ikiye bolum sonucunu) bulan bir method olusturun.
    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {
       List<Double> sonuc= list.
               stream().
               distinct().
               filter(t->t>5).
               map(t->t/2.0).
               sorted(Comparator.reverseOrder()).
               collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc); // sonuc = [65.5, 5.0, 4.5, 4.0]
    }
}